// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.graphics.Point;
import android.graphics.PointF;
import android.opengl.GLES20;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

public class GPUImageToneCurveFilter extends GPUImageFilter
{

    public static final String TONE_CURVE_FRAGMENT_SHADER = " varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n uniform sampler2D toneCurveTexture;\n\n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     lowp float redCompositeCurveValue = clamp(texture2D(toneCurveTexture, vec2(textureColor.r, 0.0)).r,0.0,1.0);\n     lowp float greenCompositeCurveValue = clamp(texture2D(toneCurveTexture, vec2(textureColor.g, 0.0)).g,0.0,1.0);\n     lowp float blueCompositeCurveValue = clamp(texture2D(toneCurveTexture, vec2(textureColor.b, 0.0)).b,0.0,1.0);\n     lowp float redCurveValue = texture2D(toneCurveTexture, vec2(redCompositeCurveValue, 1.0)).r;\n     lowp float greenCurveValue = texture2D(toneCurveTexture, vec2(greenCompositeCurveValue, 1.0)).g;\n     lowp float blueCurveValue = texture2D(toneCurveTexture, vec2(blueCompositeCurveValue, 1.0)).b;\n\n     gl_FragColor = vec4(redCurveValue*textureColor.a, greenCurveValue*textureColor.a, blueCurveValue*textureColor.a, textureColor.a);\n }";
    private PointF mBlueControlPoints[];
    private ArrayList mBlueCurve;
    private PointF mGreenControlPoints[];
    private ArrayList mGreenCurve;
    private PointF mRedControlPoints[];
    private ArrayList mRedCurve;
    private PointF mRgbCompositeControlPoints[];
    private ArrayList mRgbCompositeCurve;
    private int mToneCurveTexture[] = {
        -1
    };
    private int mToneCurveTextureUniformLocation;

    public GPUImageToneCurveFilter()
    {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", " varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n uniform sampler2D toneCurveTexture;\n\n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     lowp float redCompositeCurveValue = clamp(texture2D(toneCurveTexture, vec2(textureColor.r, 0.0)).r,0.0,1.0);\n     lowp float greenCompositeCurveValue = clamp(texture2D(toneCurveTexture, vec2(textureColor.g, 0.0)).g,0.0,1.0);\n     lowp float blueCompositeCurveValue = clamp(texture2D(toneCurveTexture, vec2(textureColor.b, 0.0)).b,0.0,1.0);\n     lowp float redCurveValue = texture2D(toneCurveTexture, vec2(redCompositeCurveValue, 1.0)).r;\n     lowp float greenCurveValue = texture2D(toneCurveTexture, vec2(greenCompositeCurveValue, 1.0)).g;\n     lowp float blueCurveValue = texture2D(toneCurveTexture, vec2(blueCompositeCurveValue, 1.0)).b;\n\n     gl_FragColor = vec4(redCurveValue*textureColor.a, greenCurveValue*textureColor.a, blueCurveValue*textureColor.a, textureColor.a);\n }");
        PointF apointf[] = new PointF[3];
        apointf[0] = new PointF(0.0F, 0.0F);
        apointf[1] = new PointF(0.5F, 0.5F);
        apointf[2] = new PointF(1.0F, 1.0F);
        mRgbCompositeControlPoints = apointf;
        mRedControlPoints = apointf;
        mGreenControlPoints = apointf;
        mBlueControlPoints = apointf;
    }

    private ArrayList createSecondDerivative(Point apoint[])
    {
        int i1 = apoint.length;
        if (i1 <= 1)
        {
            return null;
        }
        double ad[][] = (double[][])Array.newInstance(Double.TYPE, new int[] {
            i1, 3
        });
        double ad1[] = new double[i1];
        ad[0][1] = 0x3ff0000000000000L;
        ad[0][0] = 0L;
        ad[0][2] = 0L;
        for (int i = 1; i < i1 - 1; i++)
        {
            Point point = apoint[i - 1];
            Point point1 = apoint[i];
            Point point2 = apoint[i + 1];
            ad[i][0] = (double)(point1.x - point.x) / 6D;
            ad[i][1] = (double)(point2.x - point.x) / 3D;
            ad[i][2] = (double)(point2.x - point1.x) / 6D;
            ad1[i] = (double)(point2.y - point1.y) / (double)(point2.x - point1.x) - (double)(point1.y - point.y) / (double)(point1.x - point.x);
        }

        ad1[0] = 0.0D;
        ad1[i1 - 1] = 0.0D;
        ad[i1 - 1][1] = 0x3ff0000000000000L;
        ad[i1 - 1][0] = 0L;
        ad[i1 - 1][2] = 0L;
        for (int j = 1; j < i1; j++)
        {
            double d = ad[j][0] / ad[j - 1][1];
            apoint = ad[j];
            apoint[1] = apoint[1] - ad[j - 1][2] * d;
            ad[j][0] = 0L;
            ad1[j] = ad1[j] - d * ad1[j - 1];
        }

        for (int k = i1 - 2; k >= 0; k--)
        {
            double d1 = ad[k][2] / ad[k + 1][1];
            apoint = ad[k];
            apoint[1] = apoint[1] - ad[k + 1][0] * d1;
            ad[k][2] = 0L;
            ad1[k] = ad1[k] - d1 * ad1[k + 1];
        }

        apoint = new ArrayList(i1);
        for (int l = 0; l < i1; l++)
        {
            apoint.add(Double.valueOf(ad1[l] / ad[l][1]));
        }

        return apoint;
    }

    private ArrayList createSplineCurve(PointF apointf[])
    {
        if (apointf == null || apointf.length <= 0)
        {
            return null;
        }
        PointF apointf1[] = (PointF[])apointf.clone();
        Arrays.sort(apointf1, new _cls2());
        Point apoint[] = new Point[apointf1.length];
        for (int i = 0; i < apointf.length; i++)
        {
            PointF pointf = apointf1[i];
            apoint[i] = new Point((int)(pointf.x * 255F), (int)(pointf.y * 255F));
        }

        Object obj = createSplineCurve2(apoint);
        apointf = (Point)((ArrayList) (obj)).get(0);
        if (((Point) (apointf)).x > 0)
        {
            for (int j = ((Point) (apointf)).x; j >= 0; j--)
            {
                ((ArrayList) (obj)).add(0, new Point(j, 0));
            }

        }
        apointf = (Point)((ArrayList) (obj)).get(((ArrayList) (obj)).size() - 1);
        if (((Point) (apointf)).x < 255)
        {
            for (int k = ((Point) (apointf)).x + 1; k <= 255; k++)
            {
                ((ArrayList) (obj)).add(new Point(k, 255));
            }

        }
        apointf = new ArrayList(((ArrayList) (obj)).size());
        float f;
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); apointf.add(Float.valueOf(f)))
        {
            Point point = (Point)((Iterator) (obj)).next();
            Point point1 = new Point(point.x, point.x);
            f = (float)Math.sqrt(Math.pow(point1.x - point.x, 2D) + Math.pow(point1.y - point.y, 2D));
            if (point1.y > point.y)
            {
                f = -f;
            }
        }

        return apointf;
    }

    private ArrayList createSplineCurve2(Point apoint[])
    {
        ArrayList arraylist = createSecondDerivative(apoint);
        int l = arraylist.size();
        if (l <= 0)
        {
            return null;
        }
        double ad[] = new double[l];
        for (int i = 0; i < l; i++)
        {
            ad[i] = ((Double)arraylist.get(i)).doubleValue();
        }

        arraylist = new ArrayList(l + 1);
        int j = 0;
        do
        {
            if (j >= l - 1)
            {
                break;
            }
            Point point = apoint[j];
            Point point1 = apoint[j + 1];
            int k = point.x;
            while (k < point1.x) 
            {
                double d = (double)(k - point.x) / (double)(point1.x - point.x);
                double d1 = 1.0D - d;
                double d4 = point1.x - point.x;
                double d2 = point.y;
                double d3 = point1.y;
                d4 = (d4 * d4) / 6D;
                double d5 = ad[j];
                d1 = ((d * d * d - d) * ad[j + 1] + (d1 * d1 * d1 - d1) * d5) * d4 + (d2 * d1 + d3 * d);
                if (d1 > 255D)
                {
                    d = 255D;
                } else
                {
                    d = d1;
                    if (d1 < 0.0D)
                    {
                        d = 0.0D;
                    }
                }
                arraylist.add(new Point(k, (int)Math.round(d)));
                k++;
            }
            j++;
        } while (true);
        if (arraylist.size() == 255)
        {
            arraylist.add(apoint[apoint.length - 1]);
        }
        return arraylist;
    }

    private short readShort(InputStream inputstream)
    {
        return (short)(inputstream.read() << 8 | inputstream.read());
    }

    private void updateToneCurveTexture()
    {
        runOnDraw(new _cls1());
    }

    protected void onDrawArraysPre()
    {
        if (mToneCurveTexture[0] != -1)
        {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, mToneCurveTexture[0]);
            GLES20.glUniform1i(mToneCurveTextureUniformLocation, 3);
        }
    }

    public void onInit()
    {
        super.onInit();
        mToneCurveTextureUniformLocation = GLES20.glGetUniformLocation(getProgram(), "toneCurveTexture");
        GLES20.glActiveTexture(33987);
        GLES20.glGenTextures(1, mToneCurveTexture, 0);
        GLES20.glBindTexture(3553, mToneCurveTexture[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public void onInitialized()
    {
        super.onInitialized();
        setRgbCompositeControlPoints(mRgbCompositeControlPoints);
        setRedControlPoints(mRedControlPoints);
        setGreenControlPoints(mGreenControlPoints);
        setBlueControlPoints(mBlueControlPoints);
    }

    public void setBlueControlPoints(PointF apointf[])
    {
        mBlueControlPoints = apointf;
        mBlueCurve = createSplineCurve(mBlueControlPoints);
        updateToneCurveTexture();
    }

    public void setFromCurveFileInputStream(InputStream inputstream)
    {
        ArrayList arraylist;
        short word0;
        readShort(inputstream);
        word0 = readShort(inputstream);
        arraylist = new ArrayList(word0);
        int i = 0;
_L4:
        if (i >= word0)
        {
            break; /* Loop/switch isn't completed */
        }
        PointF apointf[];
        short word1;
        word1 = readShort(inputstream);
        apointf = new PointF[word1];
        int j = 0;
_L2:
        if (j >= word1)
        {
            break; /* Loop/switch isn't completed */
        }
        int k = readShort(inputstream);
        apointf[j] = new PointF((float)readShort(inputstream) * 0.003921569F, (float)k * 0.003921569F);
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        arraylist.add(apointf);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            inputstream.close();
            mRgbCompositeControlPoints = (PointF[])arraylist.get(0);
            mRedControlPoints = (PointF[])arraylist.get(1);
            mGreenControlPoints = (PointF[])arraylist.get(2);
            mBlueControlPoints = (PointF[])arraylist.get(3);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        return;
    }

    public void setGreenControlPoints(PointF apointf[])
    {
        mGreenControlPoints = apointf;
        mGreenCurve = createSplineCurve(mGreenControlPoints);
        updateToneCurveTexture();
    }

    public void setRedControlPoints(PointF apointf[])
    {
        mRedControlPoints = apointf;
        mRedCurve = createSplineCurve(mRedControlPoints);
        updateToneCurveTexture();
    }

    public void setRgbCompositeControlPoints(PointF apointf[])
    {
        mRgbCompositeControlPoints = apointf;
        mRgbCompositeCurve = createSplineCurve(mRgbCompositeControlPoints);
        updateToneCurveTexture();
    }






    private class _cls2
        implements Comparator
    {

        final GPUImageToneCurveFilter this$0;

        public int compare(PointF pointf, PointF pointf1)
        {
            if (pointf.x < pointf1.x)
            {
                return -1;
            }
            return pointf.x <= pointf1.x ? 0 : 1;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((PointF)obj, (PointF)obj1);
        }

        _cls2()
        {
            this$0 = GPUImageToneCurveFilter.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final GPUImageToneCurveFilter this$0;

        public void run()
        {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, mToneCurveTexture[0]);
            if (mRedCurve.size() >= 256 && mGreenCurve.size() >= 256 && mBlueCurve.size() >= 256 && mRgbCompositeCurve.size() >= 256)
            {
                byte abyte0[] = new byte[2048];
                for (int i = 0; i < 256; i++)
                {
                    float f = i;
                    abyte0[i * 4 + 2] = (byte)((int)Math.min(Math.max(((Float)mRgbCompositeCurve.get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                    f = i;
                    abyte0[i * 4 + 1] = (byte)((int)Math.min(Math.max(((Float)mRgbCompositeCurve.get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                    f = i;
                    abyte0[i * 4] = (byte)((int)Math.min(Math.max(((Float)mRgbCompositeCurve.get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                    abyte0[i * 4 + 3] = -1;
                    f = i;
                    abyte0[i * 4 + 2 + 1024] = (byte)((int)Math.min(Math.max(((Float)mBlueCurve.get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                    f = i;
                    abyte0[i * 4 + 1 + 1024] = (byte)((int)Math.min(Math.max(((Float)mGreenCurve.get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                    f = i;
                    abyte0[i * 4 + 1024] = (byte)((int)Math.min(Math.max(((Float)mRedCurve.get(i)).floatValue() + f, 0.0F), 255F) & 0xff);
                    abyte0[i * 4 + 3 + 1024] = -1;
                }

                GLES20.glTexImage2D(3553, 0, 6408, 256, 2, 0, 6408, 5121, ByteBuffer.wrap(abyte0));
            }
        }

        _cls1()
        {
            this$0 = GPUImageToneCurveFilter.this;
            super();
        }
    }

}

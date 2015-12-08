// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.graphics.Point;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package jp.co.cyberagent.android.a:
//            h, a, ai, ah

public final class ag extends h
{

    public static final int y;
    private int A;
    private PointF B[];
    private PointF C[];
    private PointF D[];
    private PointF E[];
    private ArrayList F;
    private ArrayList G;
    private ArrayList H;
    private ArrayList I;
    private int z[] = {
        -1
    };

    public ag()
    {
        super("uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", " varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n uniform sampler2D toneCurveTexture;\n\n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     lowp float redCompositeCurveValue = clamp(texture2D(toneCurveTexture, vec2(textureColor.r, 0.0)).r,0.0,1.0);\n     lowp float greenCompositeCurveValue = clamp(texture2D(toneCurveTexture, vec2(textureColor.g, 0.0)).g,0.0,1.0);\n     lowp float blueCompositeCurveValue = clamp(texture2D(toneCurveTexture, vec2(textureColor.b, 0.0)).b,0.0,1.0);\n     lowp float redCurveValue = texture2D(toneCurveTexture, vec2(redCompositeCurveValue, 1.0)).r;\n     lowp float greenCurveValue = texture2D(toneCurveTexture, vec2(greenCompositeCurveValue, 1.0)).g;\n     lowp float blueCurveValue = texture2D(toneCurveTexture, vec2(blueCompositeCurveValue, 1.0)).b;\n\n     gl_FragColor = vec4(redCurveValue, greenCurveValue, blueCurveValue, textureColor.a);\n }");
        PointF apointf[] = new PointF[3];
        apointf[0] = new PointF(0.0F, 0.0F);
        apointf[1] = new PointF(0.5F, 0.5F);
        apointf[2] = new PointF(1.0F, 1.0F);
        B = apointf;
        C = apointf;
        D = apointf;
        E = apointf;
    }

    private static ArrayList a(Point apoint[])
    {
        int k1 = apoint.length;
        if (k1 > 1) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        int i2;
        i2 = ((ArrayList) (obj)).size();
        if (i2 <= 0)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        double ad1[][] = (double[][])Array.newInstance(Double.TYPE, new int[] {
            k1, 3
        });
        double ad2[] = new double[k1];
        ad1[0][1] = 0x3ff0000000000000L;
        ad1[0][0] = 0L;
        ad1[0][2] = 0L;
        for (int i = 1; i < k1 - 1; i++)
        {
            obj = apoint[i - 1];
            Point point = apoint[i];
            Point point3 = apoint[i + 1];
            ad1[i][0] = (double)(point.x - ((Point) (obj)).x) / 6D;
            ad1[i][1] = (double)(point3.x - ((Point) (obj)).x) / 3D;
            ad1[i][2] = (double)(point3.x - point.x) / 6D;
            ad2[i] = (double)(point3.y - point.y) / (double)(point3.x - point.x) - (double)(point.y - ((Point) (obj)).y) / (double)(point.x - ((Point) (obj)).x);
        }

        ad2[0] = 0.0D;
        ad2[k1 - 1] = 0.0D;
        ad1[k1 - 1][1] = 0x3ff0000000000000L;
        ad1[k1 - 1][0] = 0L;
        ad1[k1 - 1][2] = 0L;
        for (int j = 1; j < k1; j++)
        {
            double d1 = ad1[j][0] / ad1[j - 1][1];
            obj = ad1[j];
            obj[1] = obj[1] - ad1[j - 1][2] * d1;
            ad1[j][0] = 0L;
            ad2[j] = ad2[j] - d1 * ad2[j - 1];
        }

        for (int k = k1 - 2; k >= 0; k--)
        {
            double d2 = ad1[k][2] / ad1[k + 1][1];
            obj = ad1[k];
            obj[1] = obj[1] - ad1[k + 1][0] * d2;
            ad1[k][2] = 0L;
            ad2[k] = ad2[k] - d2 * ad2[k + 1];
        }

        ArrayList arraylist = new ArrayList(k1);
        int l = 0;
        do
        {
            obj = arraylist;
            if (l >= k1)
            {
                break;
            }
            arraylist.add(Double.valueOf(ad2[l] / ad1[l][1]));
            l++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        double ad[] = new double[i2];
        for (int i1 = 0; i1 < i2; i1++)
        {
            ad[i1] = ((Double)((ArrayList) (obj)).get(i1)).doubleValue();
        }

        obj = new ArrayList(i2 + 1);
        int j1 = 0;
        do
        {
            if (j1 >= i2 - 1)
            {
                break;
            }
            Point point1 = apoint[j1];
            Point point2 = apoint[j1 + 1];
            int l1 = point1.x;
            while (l1 < point2.x) 
            {
                double d3 = (double)(l1 - point1.x) / (double)(point2.x - point1.x);
                double d4 = 1.0D - d3;
                double d7 = point2.x - point1.x;
                double d5 = point1.y;
                double d6 = point2.y;
                d7 = (d7 * d7) / 6D;
                double d8 = ad[j1];
                d4 = ((d3 * d3 * d3 - d3) * ad[j1 + 1] + (d4 * d4 * d4 - d4) * d8) * d7 + (d5 * d4 + d6 * d3);
                if (d4 > 255D)
                {
                    d3 = 255D;
                } else
                {
                    d3 = d4;
                    if (d4 < 0.0D)
                    {
                        d3 = 0.0D;
                    }
                }
                ((ArrayList) (obj)).add(new Point(l1, (int)Math.round(d3)));
                l1++;
            }
            j1++;
        } while (true);
        if (((ArrayList) (obj)).size() == 255)
        {
            ((ArrayList) (obj)).add(apoint[apoint.length - 1]);
        }
        return ((ArrayList) (obj));
    }

    private ArrayList a(PointF apointf[])
    {
        if (apointf == null || apointf.length <= 0)
        {
            return null;
        }
        PointF apointf1[] = (PointF[])apointf.clone();
        Arrays.sort(apointf1, new ai(this));
        Point apoint[] = new Point[apointf1.length];
        for (int i = 0; i < apointf.length; i++)
        {
            PointF pointf = apointf1[i];
            apoint[i] = new Point((int)(pointf.x * 255F), (int)(pointf.y * 255F));
        }

        Object obj = a(apoint);
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
        float f1;
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); apointf.add(Float.valueOf(f1)))
        {
            Point point = (Point)((Iterator) (obj)).next();
            Point point1 = new Point(point.x, point.x);
            f1 = (float)Math.sqrt(Math.pow(point1.x - point.x, 2D) + Math.pow(point1.y - point.y, 2D));
            if (point1.y > point.y)
            {
                f1 = -f1;
            }
        }

        return apointf;
    }

    static int[] a(ag ag1)
    {
        return ag1.z;
    }

    static ArrayList b(ag ag1)
    {
        return ag1.G;
    }

    private static short b(InputStream inputstream)
    {
        return (short)(inputstream.read() << 8 | inputstream.read());
    }

    static ArrayList c(ag ag1)
    {
        return ag1.H;
    }

    static ArrayList d(ag ag1)
    {
        return ag1.I;
    }

    static ArrayList e(ag ag1)
    {
        return ag1.F;
    }

    private void f()
    {
        a(new ah(this));
    }

    protected final void a()
    {
        if (z[0] != -1)
        {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, z[0]);
            GLES20.glUniform1i(A, 3);
        }
    }

    public final void a(InputStream inputstream)
    {
        ArrayList arraylist;
        short word0;
        b(inputstream);
        word0 = b(inputstream);
        arraylist = new ArrayList(word0);
        int i = 0;
_L4:
        if (i >= word0)
        {
            break; /* Loop/switch isn't completed */
        }
        PointF apointf[];
        short word1;
        word1 = b(inputstream);
        apointf = new PointF[word1];
        int j = 0;
_L2:
        if (j >= word1)
        {
            break; /* Loop/switch isn't completed */
        }
        int k = b(inputstream);
        apointf[j] = new PointF((float)b(inputstream) * 0.003921569F, (float)k * 0.003921569F);
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
            B = (PointF[])arraylist.get(0);
            C = (PointF[])arraylist.get(1);
            D = (PointF[])arraylist.get(2);
            E = (PointF[])arraylist.get(3);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        return;
    }

    public final void c()
    {
        super.c();
        A = GLES20.glGetUniformLocation(p(), "toneCurveTexture");
        GLES20.glActiveTexture(33987);
        GLES20.glGenTextures(1, z, 0);
        if (z[0] == -1)
        {
            GLES20.glGenTextures(1, z, 0);
        }
        if (z[0] == -1)
        {
            GLES20.glGenTextures(1, z, 0);
        }
        if (z[0] == -1)
        {
            Log.e("OpenglError", "T:opengl can't allocate texture.....");
        }
        GLES20.glBindTexture(3553, z[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void d()
    {
        super.d();
        B = B;
        F = a(B);
        f();
        C = C;
        G = a(C);
        f();
        D = D;
        H = a(D);
        f();
        E = E;
        I = a(E);
        f();
    }

    public final void e()
    {
        super.e();
        GLES20.glDeleteTextures(1, z, 0);
        z[0] = -1;
    }

    static 
    {
        y = a.w;
    }
}

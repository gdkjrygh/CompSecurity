// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.skype.android.app.settings:
//            AboutCreditsFragment

private static final class ols.makeFloatBuffer
{

    public static FloatBuffer mB;
    public static FloatBuffer mVb;
    private int cTid;
    private boolean mR;
    private int mTx[];

    public final void destroy(GL10 gl10)
    {
        gl10.glDeleteTextures(mTx.length, mTx, 0);
        mTx = null;
        cTid = -1;
    }

    public final int gimmeone()
    {
        if (mTx == null)
        {
            return 0;
        } else
        {
            return mTx[ols.getRandom(0, mTx.length)];
        }
    }

    public final void lTx(GL10 gl10, Context context)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        String as[];
        String s;
        int i;
        int k;
        try
        {
            as = context.getAssets().list("emoticons");
            k = as.length;
        }
        catch (IOException ioexception)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        s = as[i];
        if (s.endsWith("_40.png"))
        {
            arraylist.add(s);
        }
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_27;
_L1:
        int ai[];
        int j;
        ai = new int[arraylist.size()];
        gl10.glGenTextures(arraylist.size(), ai, 0);
        mTx = ai;
        j = 0;
_L4:
        if (j >= arraylist.size())
        {
            break; /* Loop/switch isn't completed */
        }
        Bitmap bitmap1;
        InputStream inputstream = context.getAssets().open((new StringBuilder("emoticons")).append(File.separator).append((String)arraylist.get(j)).toString());
        bitmap1 = BitmapFactory.decodeStream(inputstream);
        inputstream.close();
        Bitmap bitmap = Bitmap.createScaledBitmap(bitmap1, 32, 32, true);
        gl10.glBindTexture(3553, ai[j]);
        gl10.glTexParameterx(3553, 10241, 9729);
        gl10.glTexParameterx(3553, 10240, 9729);
        gl10.glTexParameterf(3553, 10242, 33071F);
        gl10.glTexParameterf(3553, 10243, 33071F);
        gl10.glTexEnvf(8960, 8704, 7681F);
        gl10.glTexEnvf(8960, 8704, 8448F);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        bitmap.recycle();
_L5:
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        mR = true;
        return;
        IOException ioexception1;
        ioexception1;
          goto _L5
    }

    public final void sTx(GL10 gl10, int i)
    {
        if (i == cTid)
        {
            return;
        }
        try
        {
            gl10.glBindTexture(3553, i);
            cTid = i;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GL10 gl10)
        {
            gl10.printStackTrace();
        }
        return;
    }


    public ols()
    {
        cTid = -1;
        mR = false;
        int i = (int)cess._mth400();
        mVb = ols.makeFloatBuffer(new float[] {
            (float)(-i), (float)(-i), (float)i, (float)(-i), (float)(-i), (float)i, (float)i, (float)i
        });
        mB = ols.makeFloatBuffer(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Log;
import java.io.IOException;

public class crt
{

    private static final String a = crt.getSimpleName();
    private final Context b;
    private final ckx c;
    private final cjs d;
    private final cko e = new cko();

    public crt(Context context, ckx ckx1, cjs cjs1)
    {
        b = (Context)b.a(context, "context", null);
        c = (ckx)b.a(ckx1, "decoderPool", null);
        d = (cjs)b.a(cjs1, "mediaExtractorFactory", null);
    }

    public static float a(cnz cnz, int i, int j)
    {
        boolean flag1 = true;
        b.a(i, "targetWidth", null);
        b.a(j, "targetHeight", null);
        float f;
        float f2;
        float f3;
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j != 0)
        {
            flag1 = false;
        }
        b.a(flag1 ^ flag, "one of target width/height must be zero");
        f2 = csc.a(cnz);
        f3 = csc.b(cnz);
        if (i == 0)
        {
            f = (float)j / f3;
        } else
        {
            f = (float)i / f2;
        }
        i = (int)Math.floor(f * f2);
        j = (int)Math.floor(f * f3);
        if (i > j && i > 1024)
        {
            f = 1024F / f2;
            Math.floor(f3 * f);
        } else
        if (j > 1024)
        {
            float f1 = 1024F / f3;
            Math.floor(f2 * f1);
            return f1;
        }
        return f;
    }

    private Bitmap a(coo coo1, int i, int j)
    {
        b.a(i, "targetWidth");
        b.a(j, "targetHeight");
        double d1 = i * j;
        Object obj;
        try
        {
            i = (int)Math.floor(d1);
            obj = coo1.a.b;
            obj = e.a(((android.net.Uri) (obj)), b.getContentResolver(), i);
            i = coo1.b.a;
        }
        // Misplaced declaration of an exception variable
        catch (coo coo1)
        {
            Log.e(a, "Error decoding bitmap.", coo1);
            return null;
        }
        coo1 = ((coo) (obj));
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        coo1 = new Matrix();
        coo1.postRotate(i);
        coo1 = Bitmap.createBitmap(((Bitmap) (obj)), 0, 0, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), coo1, true);
        ((Bitmap) (obj)).recycle();
        return coo1;
    }

    static cjs a(crt crt1)
    {
        return crt1.d;
    }

    static String a()
    {
        return a;
    }

    static void a(Matrix matrix, int i)
    {
        ddl.a(matrix, csc.a(i));
    }

    static ckx b(crt crt1)
    {
        return crt1.c;
    }

    public final csb a(int i, chq chq1, cry cry1)
    {
        coa coa1;
        b.a(chq1, "renderContext", null);
        b.a(cry1, "posterInfo", null);
        coa1 = cry1.a;
        if (!coa1.b) goto _L2; else goto _L1
_L1:
        if (!(coa1.a instanceof coo)) goto _L4; else goto _L3
_L3:
        chq1 = a((coo)coa1.a, cry1.b, cry1.c);
_L6:
        if (chq1 == null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        return new csb(chq1);
_L4:
        throw c.a("displayable frame is not a photo");
_L2:
        if (!(coa1.a instanceof cqk))
        {
            break; /* Loop/switch isn't completed */
        }
        cqk cqk1 = (cqk)coa1.a;
        long l = coa1.c;
        int j = cry1.b;
        int k = cry1.c;
        cry1 = new cru(this);
        chq1 = (Bitmap)chq1.a(new crw(this, chq1, cqk1, new long[] {
            l
        }, j, k, i, cry1));
        if (true) goto _L6; else goto _L5
_L5:
        try
        {
            throw c.a("displayable frame is not a video");
        }
        // Misplaced declaration of an exception variable
        catch (chq chq1)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (chq chq1)
        {
            Log.w(a, "getPoster() failed", chq1);
        }
        return null;
        return null;
    }

}

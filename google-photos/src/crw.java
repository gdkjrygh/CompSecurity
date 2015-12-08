// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Log;
import java.util.concurrent.Callable;

final class crw
    implements Callable
{

    private final chq a;
    private final cqk b;
    private final long c[];
    private final int d;
    private final int e;
    private final int f;
    private final crv g;
    private crt h;

    public crw(crt crt1, chq chq1, cqk cqk1, long al[], int i, int j, int k, 
            crv crv1)
    {
        h = crt1;
        super();
        a = (chq)b.a(chq1, "renderContext", null);
        b = (cqk)b.a(cqk1, "video", null);
        c = (long[])b.a(al, "timestampsUs", null);
        d = b.a(i, "displayWidth");
        e = b.a(j, "displayHeight");
        f = k;
        g = (crv)b.a(crv1, "callback", null);
    }

    private Bitmap a()
    {
        Object obj1;
        Exception exception;
        obj1 = null;
        exception = null;
        aln.a("decodeFrames()");
        Matrix matrix;
        Matrix matrix1;
        Matrix matrix2;
        matrix = new Matrix();
        matrix1 = new Matrix();
        matrix2 = new Matrix();
        crt.a(matrix2, b.b.a);
        aln.a("init codec");
        ckk ckk1 = new ckk(crt.a(h), b.a, f);
        Object obj2;
        ckk1.d();
        obj2 = crt.b(h).a(ckk1);
        Object obj3;
        cij cij;
        aln.a();
        cij = a.i.a(b.ia, b.hM);
        obj3 = a.a(d, e);
        Object obj;
        int i;
        i = 0;
        obj = obj2;
        obj1 = null;
_L8:
        if (i >= c.length) goto _L2; else goto _L1
_L1:
        long l;
        l = c[i];
        aln.a("seek and poll");
        ckk1.a(l);
        crt.b(h).a(((ckq) (obj)));
        obj2 = crt.b(h).a(ckk1);
        obj1 = null;
_L7:
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
          goto _L5
        exception;
        obj = obj2;
        obj2 = exception;
_L9:
        aln.a();
        throw obj2;
        exception;
        obj2 = obj;
        obj = exception;
_L6:
        a(((ckq) (obj2)), ((ciy) (obj1)));
        dee.a(((ded) (obj3)));
        crt.b(h).a();
        dee.a(ckk1);
        aln.a();
        throw obj;
        obj;
        ckk1 = null;
_L10:
        aln.a();
        throw obj;
        obj;
        exception = null;
        obj2 = null;
        obj3 = obj1;
        obj1 = exception;
          goto _L6
_L5:
        obj = (ciy)((ckq) (obj2)).c();
        obj1 = obj;
          goto _L7
_L4:
        Bitmap bitmap;
        aln.a();
        ddl.a(matrix1, ((ciy) (obj1)).d);
        matrix.set(matrix2);
        matrix.postConcat(matrix1);
        chi.a(((chy) (obj3)), ((ciy) (obj1)).c, matrix, cij);
        bitmap = Bitmap.createBitmap(d, e, android.graphics.Bitmap.Config.ARGB_8888);
        aln.a("decodeFrames()");
        a.a(((chy) (obj3)), bitmap);
        aln.a();
        if (((ciy) (obj1)).b && i != c.length - 1)
        {
            throw c.a("Unexpected end-of-stream while extracting key-frame poster");
        }
        break MISSING_BLOCK_LABEL_416;
        obj;
        aln.a();
        throw obj;
        a(((ckq) (obj2)), ((ciy) (obj1)));
        i++;
        obj = obj2;
        obj1 = bitmap;
          goto _L8
_L2:
        a(((ckq) (obj)), null);
        dee.a(((ded) (obj3)));
        crt.b(h).a();
        dee.a(ckk1);
        aln.a();
        return ((Bitmap) (obj1));
        obj;
        exception = null;
        obj2 = null;
        ckk1 = null;
        obj3 = obj1;
        obj1 = exception;
          goto _L6
        obj;
        exception = null;
        obj3 = obj1;
        obj1 = exception;
          goto _L6
        exception;
        obj2 = obj;
        obj1 = null;
        obj = exception;
          goto _L6
        obj2;
        obj1 = exception;
          goto _L9
        obj;
          goto _L10
        obj;
          goto _L6
    }

    private static void a(ckq ckq1, ciy ciy1)
    {
        if (ckq1 == null || ciy1 == null)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        ckq1.a(ciy1);
        return;
        ckq1;
        Log.e(crt.a(), "Exception thrown while releasing the polled video frame", ckq1);
        return;
    }

    public final Object call()
    {
        return a();
    }
}

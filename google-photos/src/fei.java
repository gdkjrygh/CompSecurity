// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicLong;

public final class fei
    implements ard
{

    private final fem a;
    private final arv b = new arv();

    fei(Context context, File file, long l)
    {
        a = new fem(context, file, l);
    }

    public final File a(ane ane)
    {
        ane = b.a(ane);
        return a.a(ane);
    }

    public final void a(ane ane, arf arf1)
    {
        String s;
        long l;
        s = b.a(ane);
        ane = a;
        l = fem.c();
        ane.a();
        ane.b();
        ((fem) (ane)).g.a(s).b();
        if (!ane.b(s).exists()) goto _L2; else goto _L1
_L1:
        ane = null;
_L11:
        if (ane == null) goto _L4; else goto _L3
_L3:
        if (!arf1.a(ane)) goto _L4; else goto _L5
_L5:
        Object obj;
        long l1;
        arf1 = a;
        l = fem.c();
        l1 = ane.length();
        ((fem) (arf1)).e.a(s, l1);
        if (fem.c)
        {
            l1 = fem.a(l);
            (new StringBuilder(47)).append("Completed insertIntoDb in: ").append(l1);
        }
        l1 = fem.c();
        obj = arf1.b(s);
        if (!ane.renameTo(((File) (obj)))) goto _L7; else goto _L6
_L6:
        if (fem.c)
        {
            l1 = fem.a(l1);
            (new StringBuilder(45)).append("Successfully renamed in: ").append(l1);
        }
        ((fem) (arf1)).g.a(s).a(((File) (obj)));
_L9:
        fef fef1 = ((fem) (arf1)).f;
        if (fef1.a())
        {
            fef1.a.obtainMessage(2).sendToTarget();
        }
        if (fem.c)
        {
            l = fem.a(l);
            long l2 = ((fem) (arf1)).e.d.a.get();
            (new StringBuilder(String.valueOf(s).length() + 87)).append("Completed commitPut in: ").append(l).append(", current size: ").append(l2).append(", key: ").append(s);
        }
_L4:
        a.a(s, ane);
        return;
_L2:
        File file = ((fem) (ane)).d;
        ane = String.valueOf(s);
        String s2 = String.valueOf(".tmp");
        if (s2.length() != 0)
        {
            ane = ane.concat(s2);
        } else
        {
            ane = new String(ane);
        }
        ane = new File(file, ane);
        if (fem.c)
        {
            l = fem.a(l);
            (new StringBuilder(String.valueOf(s).length() + 51)).append("Completed begin put in: ").append(l).append(", key: ").append(s);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (!fem.a) goto _L9; else goto _L8
_L8:
        String s1 = String.valueOf("Failed to rename file, from: ");
        String s3 = String.valueOf(ane);
        obj = String.valueOf(obj);
        Log.w("DiskCache", (new StringBuilder(String.valueOf(s1).length() + 6 + String.valueOf(s3).length() + String.valueOf(obj).length())).append(s1).append(s3).append(", to: ").append(((String) (obj))).toString());
          goto _L9
        arf1;
        a.a(s, ane);
        throw arf1;
        if (true) goto _L11; else goto _L10
_L10:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class bty
    implements nnw
{

    public static final String a;
    private static final String c;
    public final buc b;
    private final ddc d = new btz(this, cvk, "covers.pb");
    private final dez e = new bua(this, 30);
    private final Context f;

    bty(Context context)
    {
        f = (Context)b.a(context, "context", null);
        b = new buc(context);
    }

    static dez a(bty bty1)
    {
        return bty1.e;
    }

    static String a()
    {
        return c;
    }

    static void a(bty bty1, String s)
    {
        bty1.b(s);
    }

    static boolean a(bty bty1, String s, String s1)
    {
        return bty1.e.a(s, s1) != null;
    }

    static buc b(bty bty1)
    {
        return bty1.b;
    }

    private void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        e.a(arraylist);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    static Context c(bty bty1)
    {
        return bty1.f;
    }

    static ddc d(bty bty1)
    {
        return bty1.d;
    }

    public final nnx a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        d.a(f);
        s = (cvj)e.a.get(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = new nnx(Uri.parse(((cvj) (s)).c), ((cvj) (s)).d, ((cvj) (s)).e);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public final void a(String s, String s1, String s2, long l, String s3)
    {
        this;
        JVM INSTR monitorenter ;
        cvj cvj2;
        d.a(f);
        cvj2 = (cvj)e.a(s, s1);
        cvj cvj1;
        cvj1 = cvj2;
        if (cvj2 != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        cvj1 = new cvj();
        cvj1.a = s;
        cvj1.b = s1;
        cvj1.c = s2;
        cvj1.d = l;
        cvj1.e = s3;
        e.d(cvj1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    static 
    {
        String s = bty.getSimpleName();
        c = s;
        String s1 = String.valueOf(bub.getSimpleName());
        a = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(".").append(s1).toString();
    }
}

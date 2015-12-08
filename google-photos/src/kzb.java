// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.hardware.display.VirtualDisplay;
import android.view.Display;

public final class kzb
    implements juz
{

    private static final jwx a = new jwx("CastRemoteDisplayApiImpl");
    private jym b;
    private VirtualDisplay c;
    private final kzr d = new kzc(this);

    public kzb(jym jym)
    {
        b = jym;
    }

    static VirtualDisplay a(kzb kzb1, VirtualDisplay virtualdisplay)
    {
        kzb1.c = virtualdisplay;
        return virtualdisplay;
    }

    static jwx a()
    {
        return a;
    }

    static void a(kzb kzb1)
    {
        if (kzb1.c != null)
        {
            if (kzb1.c.getDisplay() != null)
            {
                a.a((new StringBuilder("releasing virtual display: ")).append(kzb1.c.getDisplay().getDisplayId()).toString(), new Object[0]);
            }
            kzb1.c.release();
            kzb1.c = null;
        }
    }

    static kzr b(kzb kzb1)
    {
        return kzb1.d;
    }

    static jym c(kzb kzb1)
    {
        return kzb1.b;
    }

    static VirtualDisplay d(kzb kzb1)
    {
        return kzb1.c;
    }

    public final jyt a(jyn jyn1)
    {
        a.a("stopRemoteDisplay", new Object[0]);
        return jyn1.b(new kze(this, jyn1));
    }

    public final jyt a(jyn jyn1, String s)
    {
        a.a("startRemoteDisplay", new Object[0]);
        return jyn1.b(new kzd(this, jyn1, s));
    }

}

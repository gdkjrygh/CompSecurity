// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

final class bwo extends bsr
{

    private bwn a;

    bwo(bwn bwn1, String s)
    {
        a = bwn1;
        super(s);
    }

    public final mtf a(String s)
    {
        if (bwn.a(a).c.r != null)
        {
            return null;
        } else
        {
            c.b(bwn.b(a).c.l, "detailed soundtrack", null);
            bwn.a(a, new bvy(s, bwn.c(a)));
            return bwn.d(a);
        }
    }

    public final boolean a(String s, mue mue)
    {
        c.a(bwn.d(a), "initializeMusicLibraryTask", null);
        s = bwn.d(a).a;
        c.a(s, "musicLibrary", null);
        bwn.e(a).a(s);
        if (bwn.f(a).d())
        {
            s = s.a(bwn.g(a).b.v);
            if (s == null)
            {
                bwn.h(a).a(null);
                s = bwn.d();
                mue = String.valueOf(bwn.i(a).b.v);
                Log.e(s, (new StringBuilder(String.valueOf(mue).length() + 77)).append("On restoring state, previously selected soundtrack ").append(mue).append(" was not found in library.").toString());
            } else
            {
                bwn.j(a).a(s);
            }
        }
        return true;
    }
}

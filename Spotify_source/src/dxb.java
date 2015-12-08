// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public final class dxb
    implements dwx
{

    private final WeakReference a;
    private final String b;
    private final String c;

    public dxb(dwx dwx1)
    {
        ctz.a(dwx1);
        b = dwx1.getClass().getCanonicalName();
        Object obj = dwx1.getClass().getEnclosingClass();
        if (obj == null)
        {
            obj = "";
        } else
        {
            obj = ((Class) (obj)).getCanonicalName();
        }
        c = ((String) (obj));
        a = new WeakReference(dwx1);
    }

    public final void a(Flags flags)
    {
        ((dwx)ctz.a(a.get(), "Listener of type %s defined at %s missing. Did you forget to unregister it?", new Object[] {
            b, c
        })).a(flags);
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (dxb)obj;
            return cty.a((dwx)a.get(), (dwx)((dxb) (obj)).a.get());
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            (dwx)a.get()
        });
    }
}

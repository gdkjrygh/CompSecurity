// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import java.lang.ref.WeakReference;

public final class gmo
    implements Runnable
{

    public Flags a;
    private final WeakReference b;
    private final WeakReference c;
    private final String d;

    public gmo(u u1, fog fog1, Flags flags)
    {
        c = new WeakReference(ctz.a(u1));
        b = new WeakReference(ctz.a(fog1));
        a = flags;
        d = u1.getClass().getSimpleName();
    }

    public final void run()
    {
        Fragment fragment = ((fog)ctz.a(b.get())).b();
        if (a != null && fragment != null && !fragment.p())
        {
            u u1 = (u)ctz.a(c.get(), "This runnable was posted to run, but its fragment activity(%s) has gone out of scope. Did you forget to remove the callback in onStop or onDestroy?", new Object[] {
                d
            });
            Assertion.a(fragment);
            Flags flags;
            if (fragment.g() != null && fragment.g().containsKey("FlagsArgumentHelper.Flags"))
            {
                flags = (Flags)fragment.g().getParcelable("FlagsArgumentHelper.Flags");
            } else
            {
                flags = null;
            }
            if (gex.a(flags, a))
            {
                flags = a;
                Bundle bundle = fragment.g();
                if (bundle != null && bundle.containsKey("FlagsArgumentHelper.Flags"))
                {
                    bundle.putParcelable("FlagsArgumentHelper.Flags", flags);
                }
                gdo.a(u1, fragment);
                return;
            }
        }
    }
}

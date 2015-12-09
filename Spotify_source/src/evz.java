// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.offline.flags.OfflineSyncSwitchVisibility;

public final class evz
{

    public static android.view.MenuItem.OnMenuItemClickListener a(boolean flag, evv evv, Optional optional)
    {
        return new android.view.MenuItem.OnMenuItemClickListener(evv, flag, optional) {

            private evv a;
            private boolean b;
            private Optional c;

            public final boolean onMenuItemClick(MenuItem menuitem)
            {
                a.a(b);
                if (b && c.b())
                {
                    ((ewa)c.c()).a();
                }
                return true;
            }

            
            {
                a = evv1;
                b = flag;
                c = optional;
                super();
            }
        };
    }

    public static boolean a(evp evp1)
    {
        return !evp1.c();
    }

    // Unreferenced inner class evz$2

/* anonymous class */
    public final class _cls2
    {

        public static final int a[];

        static 
        {
            a = new int[OfflineSyncSwitchVisibility.values().length];
            try
            {
                a[OfflineSyncSwitchVisibility.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[OfflineSyncSwitchVisibility.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}

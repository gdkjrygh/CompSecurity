// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.spotlets.tinkerbell.Onboarding;

public final class fjl
{

    // Unreferenced inner class fjl$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        private Context a;

        public final void run()
        {
            Object obj = new Onboarding();
            Context context = a;
            obj = ((Onboarding) (obj)).e.b(context).b();
            ((gio) (obj)).a(Onboarding.a);
            ((gio) (obj)).a(Onboarding.b, false);
            ((gio) (obj)).a(Onboarding.a, false);
            ((gio) (obj)).a(Onboarding.c, true);
            ((gio) (obj)).a(Onboarding.d, true);
            ((gio) (obj)).b();
        }

            public 
            {
                a = context;
                super();
            }
    }


    // Unreferenced inner class fjl$2

/* anonymous class */
    public final class _cls2
        implements Runnable
    {

        private Context a;
        private gip b;
        private boolean c;

        public final void run()
        {
            Onboarding onboarding = new Onboarding();
            Context context = a;
            gip gip = b;
            boolean flag = c;
            onboarding.e.b(context).b().a(gip, flag).a();
        }

            public 
            {
                a = context;
                b = gip;
                c = true;
                super();
            }
    }

}

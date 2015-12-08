// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.a.a.a.a.b;
import com.a.a.a.a.c;
import com.a.a.a.a.d;
import com.a.a.a.a.g;
import com.tinder.enums.PurchaseType;
import com.tinder.events.iab.EventBillingError;
import com.tinder.events.iab.EventBillingReady;
import com.tinder.events.iab.EventInventoryLoaded;
import com.tinder.events.iab.EventPurchaseConfirmed;
import com.tinder.events.iab.EventPurchaseFailure;
import com.tinder.events.iab.EventPurchaseRestored;
import com.tinder.utils.v;
import java.util.ArrayList;

public final class h
    implements com.a.a.a.a.c.a
{

    de.greenrobot.event.c a;
    public c b;

    public h(de.greenrobot.event.c c1)
    {
        a = c1;
    }

    public final void a()
    {
        if (b != null)
        {
            java.util.List list = b.a.g();
            java.util.List list1 = b.b.g();
            a.c(new EventPurchaseRestored(list, list1, false));
        }
    }

    public final void a(int i, Throwable throwable)
    {
        switch (i)
        {
        case 105: // 'i'
        case 106: // 'j'
        case 107: // 'k'
        case 108: // 'l'
        case 109: // 'm'
        default:
            a.c(new EventBillingError(i, throwable));
            return;

        case 100: // 'd'
            a.c(new EventBillingError(100, throwable));
            return;

        case 101: // 'e'
            a.c(new EventBillingError(101, throwable));
            return;

        case 104: // 'h'
            a.c(new EventBillingError(104, throwable));
            return;

        case 102: // 'f'
            a.c(new EventBillingError(102, throwable));
            return;

        case 103: // 'g'
            a.c(new EventBillingError(103, throwable));
            return;

        case 110: // 'n'
            a.c(new EventBillingError(110, throwable));
            break;
        }
    }

    public final void a(Activity activity)
    {
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        b = new c(activity, activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128).metaData.getString("iabApiKey"), this);
        return;
        activity;
        v.a("Failed to load meta-data, NameNotFound", activity);
        return;
        activity;
        v.a("Failed to load meta-data, NullPointer,", activity);
        return;
    }

    public final void a(String s, g g1)
    {
        (new StringBuilder("Purchase finished: ")).append(s).append(", purchase: ").append(g1);
        if (b == null)
        {
            return;
        }
        if (g1 != null)
        {
            String.format("original json: [%s] signature: [%s]", new Object[] {
                g1.e.a, g1.e.b
            });
            a.c(new EventPurchaseConfirmed(g1));
            return;
        } else
        {
            a.c(new EventPurchaseFailure(s));
            return;
        }
    }

    public final void b()
    {
        a.c(new EventBillingReady(true));
    }

    public final boolean c()
    {
        return b != null && b.e();
    }

    public final void d()
    {
        if (b != null)
        {
            b.d();
            b = null;
        }
    }

    // Unreferenced inner class com/tinder/managers/h$1

/* anonymous class */
    public final class _cls1
        implements com.tinder.utils.e.b
    {

        final ArrayList a = null;
        final ArrayList b;
        final h c;

        public final void a()
        {
            Object obj = null;
            if (c.b != null)
            {
                java.util.List list;
                java.util.List list1;
                if (a != null && !a.isEmpty())
                {
                    list = c.b.a(a, "inapp");
                } else
                {
                    list = null;
                }
                list1 = obj;
                if (b != null)
                {
                    list1 = obj;
                    if (!b.isEmpty())
                    {
                        list1 = c.b.a(b, "subs");
                    }
                }
                c.a.c(new EventInventoryLoaded(list, list1));
                return;
            } else
            {
                v.b("mIabHelper is null, unable to load inventory");
                return;
            }
        }

            public 
            {
                c = h.this;
                b = arraylist;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/h$2

/* anonymous class */
    public final class _cls2
        implements com.tinder.utils.e.b
    {

        final boolean a;
        final h b;

        public final void a()
        {
            if (b.b != null && b.b.f())
            {
                java.util.List list = b.b.a.g();
                java.util.List list1 = b.b.b.g();
                b.a.c(new EventPurchaseRestored(list, list1, a));
            }
        }

            public 
            {
                b = h.this;
                a = flag;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/h$3

/* anonymous class */
    public static final class _cls3
    {

        public static final int a[];

        static 
        {
            a = new int[PurchaseType.values().length];
            try
            {
                a[PurchaseType.SUBSCRIPTION.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[PurchaseType.CONSUMABLE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}

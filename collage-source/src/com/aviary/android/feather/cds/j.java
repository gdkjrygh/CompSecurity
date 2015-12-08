// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.aviary.android.feather.cds.billing.util.c;
import com.aviary.android.feather.cds.billing.util.d;
import com.aviary.android.feather.cds.billing.util.e;
import com.aviary.android.feather.cds.billing.util.f;
import com.aviary.android.feather.common.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.aviary.android.feather.cds:
//            i

public class j
    implements i
{

    com.aviary.android.feather.common.a.a.c a;
    private final d b;
    private e c;

    j(Context context, String s)
    {
        a = com.aviary.android.feather.common.a.a.a(com/aviary/android/feather/cds/j.getSimpleName(), com.aviary.android.feather.common.a.a.d.a);
        a.b("IAPWrapper::ctor");
        if (TextUtils.isEmpty(s))
        {
            a.d("EMPTY publicKey");
        }
        b = new d(context, s);
        b.a(a.a);
    }

    static e a(j j1, e e1)
    {
        j1.c = e1;
        return e1;
    }

    public static j a(Context context, String s)
    {
        return new j(context, s);
    }

    public e a()
    {
        return c;
    }

    public f a(boolean flag, List list)
        throws c
    {
        a.c("queryInventory: %b, %s", new Object[] {
            Boolean.valueOf(flag), list
        });
        return a(flag, list, ((List) (null)));
    }

    public f a(boolean flag, List list, List list1)
        throws c
    {
        a.c("queryInventory: %b, %s, %s", new Object[] {
            Boolean.valueOf(flag), list, list1
        });
        return b.a(flag, list, list1);
    }

    public List a(List list)
        throws c, IllegalStateException
    {
        a.c("getRestoreListFromInventory: %s", new Object[] {
            list
        });
        Object obj = new ArrayList();
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ((List) (obj)).add(((m.a)iterator.next()).a())) { }
        obj = a(false, ((List) (null)), ((List) (null)));
        if (obj != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                m.a a1 = (m.a)list.next();
                if (((f) (obj)).c(a1.a()))
                {
                    arraylist.add(a1);
                }
            } while (true);
        }
        return arraylist;
    }

    public void a(Activity activity, String s, int k, com.aviary.android.feather.cds.billing.util.d.c c1, String s1)
    {
        b.a(activity, s, k, c1, s1);
    }

    public void a(com.aviary.android.feather.cds.billing.util.d.d d1)
    {
        a.b("startSetup");
        if (b.a())
        {
            if (d1 != null)
            {
                d1.a(c);
            }
            return;
        } else
        {
            d1 = new com.aviary.android.feather.cds.billing.util.d.d(d1) {

                final com.aviary.android.feather.cds.billing.util.d.d a;
                final j b;

                public void a(e e1)
                {
                    b.a.c("onIabSetupFinished: %s", new Object[] {
                        e1
                    });
                    com.aviary.android.feather.cds.j.a(b, e1);
                    if (a != null)
                    {
                        a.a(e1);
                    }
                }

            
            {
                b = j.this;
                a = d1;
                super();
            }
            };
            b.a(d1);
            return;
        }
    }

    public boolean a(int k, int l, Intent intent)
    {
        return b.a(k, l, intent);
    }

    public boolean a(String s)
        throws c
    {
        a.c("hasPurchase: %s", new Object[] {
            s
        });
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        return a(false, ((List) (arraylist))).c(s);
    }

    public boolean b(String s)
        throws c
    {
        a.c("hasPurchase: %s", new Object[] {
            s
        });
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        return a(false, ((List) (null)), arraylist).c(s);
    }

    public boolean b_()
    {
        return b.a();
    }

    public boolean c()
    {
        return b.b();
    }

    public f d()
        throws c
    {
        a.b("queryPurchases");
        return a(false, ((List) (null)), ((List) (null)));
    }

    public void e()
    {
        a.b("dispose");
        b.c();
    }
}

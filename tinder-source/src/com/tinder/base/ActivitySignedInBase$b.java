// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.base;

import android.app.Activity;
import android.text.TextUtils;
import com.a.a.a.a.c;
import com.a.a.a.a.f;
import com.tinder.enums.PurchaseType;
import com.tinder.managers.aa;
import com.tinder.managers.h;
import com.tinder.utils.v;
import java.lang.ref.WeakReference;

// Referenced classes of package com.tinder.base:
//            ActivitySignedInBase

private final class c
    implements Runnable
{

    final ActivitySignedInBase a;
    private WeakReference b;
    private f c;

    public final void run()
    {
        if (b.get() != null)
        {
            PurchaseType purchasetype = PurchaseType.getTypeFromSku(c.a);
            Object obj = a.x;
            Activity activity = (Activity)b.get();
            String s = c.a;
            obj = ((aa) (obj)).a;
            if (((h) (obj)).b != null && !TextUtils.isEmpty(s))
            {
                switch (com.tinder.managers.u[purchasetype.ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                    ((h) (obj)).b.a(activity, s, "subs");
                    return;

                case 2: // '\002'
                    ((h) (obj)).b.a(activity, s, "inapp");
                    break;
                }
                return;
            } else
            {
                v.b("IAB helper is null or sku is empty");
                return;
            }
        } else
        {
            ActivitySignedInBase.a(a);
            return;
        }
    }

    public (ActivitySignedInBase activitysignedinbase, Activity activity, f f1)
    {
        a = activitysignedinbase;
        super();
        b = new WeakReference(activity);
        c = f1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.iap;

import com.kik.cards.web.plugin.a;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.iap:
//            InAppPurchasePlugin

final class j
    implements Runnable
{

    final a a;
    final JSONObject b;
    final String c;
    final InAppPurchasePlugin d;

    j(InAppPurchasePlugin inapppurchaseplugin, a a1, JSONObject jsonobject, String s)
    {
        d = inapppurchaseplugin;
        a = a1;
        b = jsonobject;
        c = s;
        super();
    }

    public final void run()
    {
        a.a(d.getAvailableItems(b, c));
    }
}

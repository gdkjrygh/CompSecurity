// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.os.Bundle;
import com.kik.g.p;
import com.kik.g.r;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment

final class w extends r
{

    final p a;
    final CardsWebViewFragment b;

    w(CardsWebViewFragment cardswebviewfragment, p p1)
    {
        b = cardswebviewfragment;
        a = p1;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1;
        obj1 = (Bundle)obj;
        super.a(obj1);
        obj = new JSONObject();
        obj1 = new JSONObject(((Bundle) (obj1)).getString("CardsWebViewFragment.EXTRA_PICKER_RESULT"));
        obj = obj1;
_L2:
        a.a(obj);
        return;
        JSONException jsonexception;
        jsonexception;
        jsonexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        a.e();
    }
}

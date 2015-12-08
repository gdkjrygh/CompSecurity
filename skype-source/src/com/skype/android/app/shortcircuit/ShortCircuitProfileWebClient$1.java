// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import com.skype.android.event.EventBus;
import com.skype.android.util.HttpUtil;
import org.json.JSONException;

// Referenced classes of package com.skype.android.app.shortcircuit:
//            ShortCircuitProfileWebClient

final class <init> extends <init>
{

    final ShortCircuitProfileWebClient this$0;

    public final void run()
    {
        Object obj;
        obj = ShortCircuitProfileWebClient.access$000(ShortCircuitProfileWebClient.this);
        obj = ShortCircuitProfileWebClient.access$100(ShortCircuitProfileWebClient.this).c(((java.net.HttpURLConnection) (obj)));
        obj = parseVerifiedAliases(((String) (obj)));
        ShortCircuitProfileWebClient.access$200(ShortCircuitProfileWebClient.this).a(new GetVerifiedAliasesResult(((java.util.List) (obj))));
        return;
        Object obj1;
        obj1;
        ((JSONException) (obj1)).printStackTrace();
        ShortCircuitProfileWebClient.access$200(ShortCircuitProfileWebClient.this).a(new GetVerifiedAliasesResult(null));
        return;
        obj1;
        ShortCircuitProfileWebClient.access$200(ShortCircuitProfileWebClient.this).a(new GetVerifiedAliasesResult(null));
        throw obj1;
    }

    GetVerifiedAliasesResult(String s)
    {
        this$0 = ShortCircuitProfileWebClient.this;
        super(ShortCircuitProfileWebClient.this, s);
    }
}

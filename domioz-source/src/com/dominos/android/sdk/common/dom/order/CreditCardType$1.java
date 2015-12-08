// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.order;

import com.google.a.a.t;

// Referenced classes of package com.dominos.android.sdk.common.dom.order:
//            CreditCardType

final class 
    implements t
{

    public final CreditCardType apply(String s)
    {
        return CreditCardType.fromString(s);
    }

    public final volatile Object apply(Object obj)
    {
        return apply((String)obj);
    }

    ()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers.interfaces;


// Referenced classes of package com.dominos.controllers.interfaces:
//            IDominosView

public interface IDominosCheckoutScreen
    extends IDominosView
{

    public abstract void setDeliveryInstructions(Boolean boolean1);

    public abstract void setSubheader(String s, String s1, Boolean boolean1);

    public abstract void showInvalidPriceToast();
}

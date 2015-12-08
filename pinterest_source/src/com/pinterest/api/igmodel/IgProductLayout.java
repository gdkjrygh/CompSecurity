// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;


// Referenced classes of package com.pinterest.api.igmodel:
//            IgModel

class IgProductLayout
    implements IgModel
{

    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;

    IgProductLayout()
    {
    }

    public final com.pinterest.api.model.BuyableProduct.Layout a()
    {
        com.pinterest.api.model.BuyableProduct.Layout layout = new com.pinterest.api.model.BuyableProduct.Layout();
        layout.setLayoutColors(a);
        layout.setLayoutMaterial(b);
        layout.setLayoutPattern(c);
        layout.setLayoutSize(d);
        return layout;
    }

    public Object getModel()
    {
        return a();
    }
}

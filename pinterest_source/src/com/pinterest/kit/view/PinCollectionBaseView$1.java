// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.view;


// Referenced classes of package com.pinterest.kit.view:
//            PinCollectionBaseView

class stener extends com.pinterest.ui.imageview.er
{

    final int a;
    final PinCollectionBaseView b;

    public void onBitmapSet()
    {
        b.fadeInImageAt(a);
    }

    stener(PinCollectionBaseView pincollectionbaseview, int i)
    {
        b = pincollectionbaseview;
        a = i;
        super();
    }
}

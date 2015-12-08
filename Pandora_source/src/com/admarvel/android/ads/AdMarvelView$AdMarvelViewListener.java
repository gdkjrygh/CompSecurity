// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelView

public static interface 
{

    public abstract void onClickAd(AdMarvelView admarvelview, String s);

    public abstract void onClose();

    public abstract void onExpand();

    public abstract void onFailedToReceiveAd(AdMarvelView admarvelview, int i,  );

    public abstract void onReceiveAd(AdMarvelView admarvelview);

    public abstract void onRequestAd(AdMarvelView admarvelview);
}

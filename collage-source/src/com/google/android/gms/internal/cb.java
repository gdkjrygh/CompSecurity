// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            bs, br

public class cb extends bv.a
{

    private final com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener a;

    public cb(com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener oncustomclicklistener)
    {
        a = oncustomclicklistener;
    }

    public void a(br br, String s)
    {
        a.onCustomClick(new bs(br), s);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            ez, er, eo

public final class fi extends ez
{

    private final com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener a;

    public fi(com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener oncustomclicklistener)
    {
        a = oncustomclicklistener;
    }

    public final void a(eo eo, String s)
    {
        a.onCustomClick(new er(eo), s);
    }
}

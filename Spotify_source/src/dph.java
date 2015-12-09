// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonAccessory;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonImage;

public final class dph
{

    private final PorcelainJsonImage a;

    public dph(PorcelainJsonImage porcelainjsonimage)
    {
        a = (PorcelainJsonImage)ctz.a(porcelainjsonimage);
    }

    public final PorcelainJsonAccessory a()
    {
        return new PorcelainJsonAccessory(a, null, null);
    }
}

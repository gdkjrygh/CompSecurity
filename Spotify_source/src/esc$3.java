// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.Locations;

final class ang.Object
    implements erw
{

    private esc a;

    public final void a()
    {
        a.a.N();
    }

    public final volatile void a(Object obj)
    {
        Locations locations = (Locations)obj;
        esc esc1 = a;
        obj = locations;
        if (locations == null)
        {
            obj = Locations.EMPTY;
        }
        esc1.k = ((Locations) (obj));
        a.a();
    }

    (esc esc1)
    {
        a = esc1;
        super();
    }
}

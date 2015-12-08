// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;

import java.util.List;
import rx.Observable;

// Referenced classes of package me.lyft.android.infrastructure.googlegeo:
//            GoogleLatLngDTO

public interface IGoogleGeoApiService
{

    public abstract Observable addressLookupFromZip(String s, String s1);

    public abstract Observable directions(String s, String s1, List list);

    public abstract Observable getMinimumEta(String s, List list);

    public abstract Observable getTotalEta(String s, List list);

    public abstract Observable reverseGeocode(GoogleLatLngDTO googlelatlngdto);
}

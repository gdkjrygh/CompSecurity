// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;


// Referenced classes of package me.lyft.android.infrastructure.googlegeo:
//            GoogleDurationDTO

public class DistanceMatrixElementDTO
{

    private static final String STATUS_OK = "OK";
    public final GoogleDurationDTO duration;
    public final String status;

    public DistanceMatrixElementDTO(String s, GoogleDurationDTO googledurationdto)
    {
        status = s;
        duration = googledurationdto;
    }

    public boolean isOk()
    {
        return "OK".equalsIgnoreCase(status);
    }
}

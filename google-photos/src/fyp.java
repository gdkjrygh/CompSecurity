// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.mediadetails.DetailsActivity;

public final class fyp
    implements ojz
{

    private DetailsActivity a;

    public fyp(DetailsActivity detailsactivity)
    {
        a = detailsactivity;
        super();
    }

    public final boolean a()
    {
        a.onBackPressed();
        return true;
    }
}

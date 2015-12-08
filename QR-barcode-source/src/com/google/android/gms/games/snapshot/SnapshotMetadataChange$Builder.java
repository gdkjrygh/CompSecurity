// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.a;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChange, SnapshotMetadata

public static final class 
{

    private String Tr;
    private Uri adk;
    private Long adm;
    private a adn;

    public SnapshotMetadataChange build()
    {
        return new SnapshotMetadataChange(Tr, adm, adn, adk);
    }

    public adk fromMetadata(SnapshotMetadata snapshotmetadata)
    {
        Tr = snapshotmetadata.getDescription();
        adm = Long.valueOf(snapshotmetadata.getPlayedTime());
        if (adm.longValue() == -1L)
        {
            adm = null;
        }
        adk = snapshotmetadata.getCoverImageUri();
        if (adk != null)
        {
            adn = null;
        }
        return this;
    }

    public adn setCoverImage(Bitmap bitmap)
    {
        adn = new a(bitmap);
        adk = null;
        return this;
    }

    public adk setDescription(String s)
    {
        Tr = s;
        return this;
    }

    public Tr setPlayedTimeMillis(long l)
    {
        adm = Long.valueOf(l);
        return this;
    }

    public ()
    {
    }
}

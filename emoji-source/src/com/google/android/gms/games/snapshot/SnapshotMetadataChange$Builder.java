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

    private String Mp;
    private Uri Uh;
    private Long Uj;
    private a Uk;

    public SnapshotMetadataChange build()
    {
        return new SnapshotMetadataChange(Mp, Uj, Uk, Uh);
    }

    public Uh fromMetadata(SnapshotMetadata snapshotmetadata)
    {
        Mp = snapshotmetadata.getDescription();
        Uj = Long.valueOf(snapshotmetadata.getPlayedTime());
        if (Uj.longValue() == -1L)
        {
            Uj = null;
        }
        Uh = snapshotmetadata.getCoverImageUri();
        if (Uh != null)
        {
            Uk = null;
        }
        return this;
    }

    public Uk setCoverImage(Bitmap bitmap)
    {
        Uk = new a(bitmap);
        Uh = null;
        return this;
    }

    public Uh setDescription(String s)
    {
        Mp = s;
        return this;
    }

    public Mp setPlayedTimeMillis(long l)
    {
        Uj = Long.valueOf(l);
        return this;
    }

    public ()
    {
    }
}

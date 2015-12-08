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

    private String Mm;
    private Uri Ue;
    private Long Ug;
    private a Uh;

    public SnapshotMetadataChange build()
    {
        return new SnapshotMetadataChange(Mm, Ug, Uh, Ue);
    }

    public Ue fromMetadata(SnapshotMetadata snapshotmetadata)
    {
        Mm = snapshotmetadata.getDescription();
        Ug = Long.valueOf(snapshotmetadata.getPlayedTime());
        if (Ug.longValue() == -1L)
        {
            Ug = null;
        }
        Ue = snapshotmetadata.getCoverImageUri();
        if (Ue != null)
        {
            Uh = null;
        }
        return this;
    }

    public Uh setCoverImage(Bitmap bitmap)
    {
        Uh = new a(bitmap);
        Ue = null;
        return this;
    }

    public Ue setDescription(String s)
    {
        Mm = s;
        return this;
    }

    public Mm setPlayedTimeMillis(long l)
    {
        Ug = Long.valueOf(l);
        return this;
    }

    public ()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.model.Owner;

// Referenced classes of package com.google.android.gms.people.internal:
//            PeopleClientFifeImageUrlDecompressor

public final class OwnerRef extends DataBufferRef
    implements Owner
{

    public OwnerRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public final String getAccountName()
    {
        return getString("account_name");
    }

    public final String getAvatarUrl()
    {
        return PeopleClientFifeImageUrlDecompressor.INSTANCE.decompress(getString("avatar"));
    }

    public final String getCoverPhotoUrl()
    {
        return PeopleClientFifeImageUrlDecompressor.INSTANCE.decompress(getString("cover_photo_url"));
    }

    public final String getDisplayName()
    {
        String s1 = getString("display_name");
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = getString("account_name");
        }
        return s;
    }

    public final String getPlusPageId()
    {
        return getString("page_gaia_id");
    }
}

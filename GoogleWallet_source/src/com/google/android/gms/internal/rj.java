// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.c;
import com.google.android.gms.people.model.Owner;

// Referenced classes of package com.google.android.gms.internal:
//            rm

public final class rj extends c
    implements Owner
{

    public rj(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public final String getAccountName()
    {
        return getString("account_name");
    }

    public final String getAvatarUrl()
    {
        return rm.aCt.cM(getString("avatar"));
    }

    public final String getCoverPhotoUrl()
    {
        return rm.aCt.cM(getString("cover_photo_url"));
    }

    public final String getDisplayName()
    {
        String s1 = getString("display_name");
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = getAccountName();
        }
        return s;
    }

    public final String getPlusPageId()
    {
        return getString("page_gaia_id");
    }
}

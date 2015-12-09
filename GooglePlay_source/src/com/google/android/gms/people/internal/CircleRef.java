// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.model.Circle;

public final class CircleRef extends DataBufferRef
    implements Circle
{

    private final Bundle mMetadata;

    public CircleRef(DataHolder dataholder, int i, Bundle bundle)
    {
        super(dataholder, i);
        mMetadata = bundle;
    }

    public final String getCircleId()
    {
        return getString("circle_id");
    }

    public final String getCircleName()
    {
        int j = getInteger("type");
        int i = j;
        switch (j)
        {
        case 0: // '\0'
        default:
            i = -2;
            break;

        case -1: 
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            break;
        }
        if (i != -1)
        {
            Object obj = mMetadata.getBundle("localized_group_names");
            if (obj != null)
            {
                obj = ((Bundle) (obj)).getString(String.valueOf(i));
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    return ((String) (obj));
                }
            }
        }
        return getString("name");
    }
}

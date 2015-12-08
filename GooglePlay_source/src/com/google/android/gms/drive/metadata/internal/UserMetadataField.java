// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.UserMetadata;
import com.google.android.gms.drive.metadata.BaseMetadataField;
import java.util.Arrays;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            ParcelableMetadataField

public final class UserMetadataField extends ParcelableMetadataField
{

    public UserMetadataField(String s)
    {
        super(s, Arrays.asList(new String[] {
            mergeName(s, "permissionId"), mergeName(s, "displayName"), mergeName(s, "picture"), mergeName(s, "isAuthenticatedUser"), mergeName(s, "emailAddress")
        }), Collections.emptyList(), 0x5b8d80);
    }

    private String fieldName(String s)
    {
        return mergeName(super.mFieldName, s);
    }

    private static String mergeName(String s, String s1)
    {
        return (new StringBuilder()).append(s).append(".").append(s1).toString();
    }

    protected final boolean canReadFromDataHolder(DataHolder dataholder, int i, int j)
    {
        return dataholder.hasColumn(fieldName("permissionId")) && !dataholder.hasNull(fieldName("permissionId"), i, j);
    }

    protected final volatile Object doDataHolderRead(DataHolder dataholder, int i, int j)
    {
        String s = dataholder.getString(fieldName("permissionId"), i, j);
        if (s != null)
        {
            String s1 = dataholder.getString(fieldName("displayName"), i, j);
            String s2 = dataholder.getString(fieldName("picture"), i, j);
            boolean flag = dataholder.getBoolean(fieldName("isAuthenticatedUser"), i, j);
            dataholder = dataholder.getString(fieldName("emailAddress"), i, j);
            return new UserMetadata(s, s1, s2, Boolean.valueOf(flag).booleanValue(), dataholder);
        } else
        {
            return null;
        }
    }
}

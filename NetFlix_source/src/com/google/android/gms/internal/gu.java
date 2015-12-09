// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.h;
import java.util.Arrays;

public class gu extends h
{

    public static final gu Gx = new gu();

    private gu()
    {
        super("driveId", Arrays.asList(new String[] {
            "sqlId", "resourceId"
        }), 0x3e8fa0);
    }

    protected Object b(DataHolder dataholder, int i, int k)
    {
        return j(dataholder, i, k);
    }

    protected DriveId j(DataHolder dataholder, int i, int k)
    {
        long l = dataholder.getMetadata().getLong("dbInstanceId");
        String s1 = dataholder.getString("resourceId", i, k);
        String s = s1;
        if (s1 != null)
        {
            s = s1;
            if (s1.startsWith("generated-android-"))
            {
                s = null;
            }
        }
        return new DriveId(s, Long.valueOf(dataholder.getLong("sqlId", i, k)).longValue(), l);
    }

}

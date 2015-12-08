// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.j;
import java.util.Arrays;

public class it extends j
{

    public static final it KB = new it();

    private it()
    {
        super("driveId", Arrays.asList(new String[] {
            "sqlId", "resourceId"
        }), Arrays.asList(new String[] {
            "dbInstanceId"
        }), 0x3e8fa0);
    }

    protected Object b(DataHolder dataholder, int i, int l)
    {
        return k(dataholder, i, l);
    }

    protected DriveId k(DataHolder dataholder, int i, int l)
    {
        long l1 = dataholder.eU().getLong("dbInstanceId");
        String s1 = dataholder.c("resourceId", i, l);
        String s = s1;
        if (s1 != null)
        {
            s = s1;
            if (s1.startsWith("generated-android-"))
            {
                s = null;
            }
        }
        return new DriveId(s, Long.valueOf(dataholder.a("sqlId", i, l)).longValue(), l1);
    }

}

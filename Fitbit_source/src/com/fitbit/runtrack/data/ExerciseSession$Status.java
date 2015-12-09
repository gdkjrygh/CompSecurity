// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.data;

import android.text.TextUtils;

// Referenced classes of package com.fitbit.runtrack.data:
//            ExerciseSession

public static final class statusLabel extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];
    public final String statusLabel;

    public static statusLabel a(String s)
    {
        statusLabel astatuslabel[] = values();
        int j = astatuslabel.length;
        for (int i = 0; i < j; i++)
        {
            statusLabel statuslabel = astatuslabel[i];
            if (TextUtils.equals(s, statuslabel.statusLabel))
            {
                return statuslabel;
            }
        }

        return a;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/fitbit/runtrack/data/ExerciseSession$Status, s);
    }

    public static a[] values()
    {
        return (a[])d.clone();
    }

    static 
    {
        a = new <init>("INACTIVE", 0, "inactive");
        b = new <init>("ACTIVE", 1, "active");
        c = new <init>("ENDED", 2, "ended");
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        statusLabel = s1;
    }
}

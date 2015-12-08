// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.data;

import android.text.TextUtils;

// Referenced classes of package com.fitbit.runtrack.data:
//            ExerciseEvent

public static final class recorded extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    public final String label;
    public final boolean recorded;

    public static recorded a(String s)
    {
        recorded arecorded[] = values();
        int j = arecorded.length;
        for (int i = 0; i < j; i++)
        {
            recorded recorded1 = arecorded[i];
            if (TextUtils.equals(recorded1.label, s))
            {
                return recorded1;
            }
        }

        return null;
    }

    public static label valueOf(String s)
    {
        return (label)Enum.valueOf(com/fitbit/runtrack/data/ExerciseEvent$Type, s);
    }

    public static label[] values()
    {
        return (label[])c.clone();
    }

    static 
    {
        a = new <init>("Virtual", 0, "virtual");
        b = new <init>("Location", 1, "location", true);
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i, String s1)
    {
        this(s, i, s1, false);
    }

    private <init>(String s, int i, String s1, boolean flag)
    {
        super(s, i);
        label = s1;
        recorded = flag;
    }
}

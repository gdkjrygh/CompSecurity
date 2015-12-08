// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;


// Referenced classes of package com.fitbit.runtrack.ui:
//            ShareExerciseSharingEvent

public static final class value extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];
    private String value;

    public static value a(String s)
    {
        value avalue[] = values();
        int j = avalue.length;
        for (int i = 0; i < j; i++)
        {
            value value1 = avalue[i];
            if (value1.a().equals(s))
            {
                return value1;
            }
        }

        return null;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/fitbit/runtrack/ui/ShareExerciseSharingEvent$Source, s);
    }

    public static a[] values()
    {
        return (a[])d.clone();
    }

    String a()
    {
        return value;
    }

    static 
    {
        a = new <init>("CAMERA_BACK", 0, "Back camera");
        b = new <init>("CAMERA_FRONT", 1, "Front camera");
        c = new <init>("GALLERY", 2, "Library");
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}

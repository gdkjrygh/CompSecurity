// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;


// Referenced classes of package com.fitbit.runtrack.ui:
//            ImpactSummary

static final class type extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];
    final int symbol;
    final com.fitbit.data.domain.esResourceType type;

    public static type valueOf(String s)
    {
        return (type)Enum.valueOf(com/fitbit/runtrack/ui/ImpactSummary$Impactable, s);
    }

    public static type[] values()
    {
        return (type[])e.clone();
    }

    static 
    {
        a = new <init>("Steps", 0, 0x7f020279, com.fitbit.data.domain.esResourceType.STEPS);
        b = new <init>("Calories", 1, 0x7f020277, com.fitbit.data.domain.esResourceType.CALORIES);
        c = new <init>("ActiveMinutes", 2, 0x7f020276, com.fitbit.data.domain.esResourceType.MINUTES_VERY_ACTIVE);
        d = new <init>("Stairs", 3, 0x7f020278, com.fitbit.data.domain.esResourceType.FLOORS);
        e = (new e[] {
            a, b, c, d
        });
    }

    private esResourceType(String s, int i, int j, com.fitbit.data.domain.esResourceType esresourcetype)
    {
        super(s, i);
        symbol = j;
        type = esresourcetype;
    }
}

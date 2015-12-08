// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.fitbit.runtrack.SupportedActivity;

// Referenced classes of package com.fitbit.runtrack.ui:
//            i

public class g extends i
{

    private static final String a = "!ACTIVITY_NAME";

    public g()
    {
        super("Exercise: View Exercise Large Map");
    }

    public g a(SupportedActivity supportedactivity)
    {
        a("!ACTIVITY_NAME", supportedactivity.name());
        return this;
    }
}

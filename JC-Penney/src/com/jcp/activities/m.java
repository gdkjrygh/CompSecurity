// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;


// Referenced classes of package com.jcp.activities:
//            DebugSettingsActivity

class m
    implements Runnable
{

    final DebugSettingsActivity a;

    m(DebugSettingsActivity debugsettingsactivity)
    {
        a = debugsettingsactivity;
        super();
    }

    public void run()
    {
        a.finish();
    }
}

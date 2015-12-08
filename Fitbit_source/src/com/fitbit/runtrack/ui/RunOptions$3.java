// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;


// Referenced classes of package com.fitbit.runtrack.ui:
//            RunOptions

static class State.FrequencyType
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[com.fitbit.savedstate.dState.AudioCue.values().length];
        try
        {
            b[com.fitbit.savedstate.dState.AudioCue.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[com.fitbit.savedstate.dState.AudioCue.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[com.fitbit.savedstate.dState.AudioCue.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[com.fitbit.savedstate.dState.AudioCue.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            b[com.fitbit.savedstate.dState.AudioCue.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        a = new int[com.fitbit.savedstate.dState.FrequencyType.values().length];
        try
        {
            a[com.fitbit.savedstate.dState.FrequencyType.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.fitbit.savedstate.dState.FrequencyType.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

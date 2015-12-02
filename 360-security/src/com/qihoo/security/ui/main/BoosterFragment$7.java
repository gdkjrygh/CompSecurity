// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import com.qihoo.security.ui.fragment.utils.FragmentAction;

// Referenced classes of package com.qihoo.security.ui.main:
//            BoosterFragment

static class Action
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[FragmentAction.values().length];
        try
        {
            b[FragmentAction.RESULT_ACTION_FINISH.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            b[FragmentAction.RESULT_ACTION_SWITCH_TAB.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        a = new int[values().length];
        try
        {
            a[a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[e.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[f.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[g.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

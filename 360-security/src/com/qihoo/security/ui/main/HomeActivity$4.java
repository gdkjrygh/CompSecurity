// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import com.qihoo.security.ui.fragment.utils.FragmentAction;

// Referenced classes of package com.qihoo.security.ui.main:
//            HomeActivity

static class entAction
{

    static final int a[];

    static 
    {
        a = new int[FragmentAction.values().length];
        try
        {
            a[FragmentAction.ChangeTab.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[FragmentAction.CLEAN_ACTION_UPDATE_COLOR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[FragmentAction.RESULT_ACTION_FINISH.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[FragmentAction.RESULT_ACTION_SKIP_DRAWER.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[FragmentAction.RESULT_ACTION_SKIP_SUB_MODULE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[FragmentAction.RESULT_ACTION_SWITCH_TAB.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[FragmentAction.ACTION_DRAWER_OPEN.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[FragmentAction.ACTION_DRAWER_CLOSE.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

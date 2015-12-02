// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v7;


// Referenced classes of package com.qihoo.security.v7:
//            MaterialMenuDrawable

static class imationState
{

    static final int a[];
    static final int b[];
    static final int c[];

    static 
    {
        c = new int[onState.values().length];
        try
        {
            c[onState.BURGER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            c[onState.ARROW.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            c[onState.X.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            c[onState.CHECK.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        b = new int[roke.values().length];
        try
        {
            b[roke.REGULAR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            b[roke.THIN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[roke.EXTRA_THIN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        a = new int[imationState.values().length];
        try
        {
            a[imationState.BURGER_ARROW.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[imationState.BURGER_X.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[imationState.ARROW_X.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[imationState.ARROW_CHECK.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[imationState.BURGER_CHECK.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[imationState.X_CHECK.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

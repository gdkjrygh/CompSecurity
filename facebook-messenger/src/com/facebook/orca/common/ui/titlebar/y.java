// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;


// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            w

class y
{

    static final int a[];

    static 
    {
        a = new int[w.values().length];
        try
        {
            a[w.FACEBOOK.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[w.SMS_ONLY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

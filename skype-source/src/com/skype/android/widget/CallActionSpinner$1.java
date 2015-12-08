// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import com.skype.PROPKEY;

// Referenced classes of package com.skype.android.widget:
//            CallActionSpinner

static final class 
{

    static final int a[];

    static 
    {
        a = new int[PROPKEY.values().length];
        try
        {
            a[PROPKEY.CONTACT_PHONE_HOME.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[PROPKEY.CONTACT_PHONE_OFFICE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[PROPKEY.CONTACT_PHONE_MOBILE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[PROPKEY.CONTACT_ASSIGNED_PHONE1.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[PROPKEY.CONTACT_ASSIGNED_PHONE2.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[PROPKEY.CONTACT_ASSIGNED_PHONE3.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[PROPKEY.CONTACT_PSTNNUMBER.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

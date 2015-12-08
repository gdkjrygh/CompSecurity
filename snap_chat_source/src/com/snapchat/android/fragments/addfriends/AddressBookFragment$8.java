// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;


// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddressBookFragment

static final class e
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[com.snapchat.android.util.ndSection.values().length];
        try
        {
            b[com.snapchat.android.util.ndSection.ON_SNAPCHAT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[com.snapchat.android.util.ndSection.INVITE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[e.values().length];
        try
        {
            a[e.PHONE_VERIFICATION.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[e.CONTACTS_ACCESS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[e.ADD_FRIENDS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

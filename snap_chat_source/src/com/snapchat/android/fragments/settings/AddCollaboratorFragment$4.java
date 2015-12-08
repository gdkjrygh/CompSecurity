// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Vf;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            AddCollaboratorFragment

static final class 
{

    static final int a[];

    static 
    {
        a = new int[Vf.values().length];
        try
        {
            a[Vf.SERVER_LOST_CONTACT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[Vf.NO_USER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[Vf.NO_PERMISSION.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[Vf.ADDING_NON_FRIEND.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[Vf.COLLAB_ALREADY_EXISTS.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[Vf.COLLAB_NO_EMAIL_VERIFIED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[Vf.TOO_MANY_COLLABORATORS.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[Vf.NON_PUBLIC_STORY_PRIVACY.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

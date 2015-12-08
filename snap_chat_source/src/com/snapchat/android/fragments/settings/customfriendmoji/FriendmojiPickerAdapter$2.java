// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.customfriendmoji;


// Referenced classes of package com.snapchat.android.fragments.settings.customfriendmoji:
//            FriendmojiPickerAdapter

static final class ojiViewType
{

    static final int a[];

    static 
    {
        a = new int[ojiViewType.values().length];
        try
        {
            a[ojiViewType.HEADER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[ojiViewType.SPACER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ojiViewType.EMOJI.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

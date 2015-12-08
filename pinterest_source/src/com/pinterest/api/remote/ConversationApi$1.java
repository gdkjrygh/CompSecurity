// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;


class adItem.ItemType
{

    static final int a[];

    static 
    {
        a = new int[com.pinterest.activity.search.model.Type.values().length];
        try
        {
            a[com.pinterest.activity.search.model.Type.EMAIL_CONTACT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[com.pinterest.activity.search.model.Type.PHONE_CONTACT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[com.pinterest.activity.search.model.Type.FOLLOWEE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[com.pinterest.activity.search.model.Type.MUTUAL_FOLLOW.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.pinterest.activity.search.model.Type.FACEBOOK_CONTACT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.pinterest.activity.search.model.Type.TWITTER_CONTACT.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.pinterest.activity.search.model.Type.PINNER.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;


// Referenced classes of package com.facebook.ui.images.b:
//            u

class z
{

    static final int a[];

    static 
    {
        a = new int[u.values().length];
        try
        {
            a[u.DOWNLOAD_NOT_FOUND.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[u.DOWNLOAD_PIPELINE_ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[u.PREV_FAILURE_RETRY_BLOCKED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

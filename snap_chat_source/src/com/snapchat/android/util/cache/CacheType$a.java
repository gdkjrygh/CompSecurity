// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.cache;


// Referenced classes of package com.snapchat.android.util.cache:
//            CacheType

static final class  extends Enum
{

    private static final int $VALUES$4bc5adf1[];
    public static final int BLOB$17e89516;
    public static final int DIRECTORY$17e89516;
    public static final int IMAGE$17e89516;
    public static final int VIDEO$17e89516;

    public static int[] a()
    {
        return (int[])$VALUES$4bc5adf1.clone();
    }

    static 
    {
        VIDEO$17e89516 = 1;
        IMAGE$17e89516 = 2;
        BLOB$17e89516 = 3;
        DIRECTORY$17e89516 = 4;
        $VALUES$4bc5adf1 = (new int[] {
            VIDEO$17e89516, IMAGE$17e89516, BLOB$17e89516, DIRECTORY$17e89516
        });
    }
}

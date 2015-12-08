// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;


// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            FindNearbyFriendsWorker

final class a
    implements Runnable
{

    private terruptReason a;
    private FindNearbyFriendsWorker b;

    public final void run()
    {
        FindNearbyFriendsWorker.a(b).a(a);
    }

    terruptReason(FindNearbyFriendsWorker findnearbyfriendsworker, terruptReason terruptreason)
    {
        b = findnearbyfriendsworker;
        a = terruptreason;
        super();
    }
}

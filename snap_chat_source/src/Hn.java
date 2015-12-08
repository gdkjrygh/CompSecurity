// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.ui.snapview.SnapViewSessionStopReason;

public final class Hn
    implements He
{

    private final Bk a;
    private final DU b;
    private final FriendManager c;

    Hn(Bk bk)
    {
        DU du = DU.a();
        FriendManager friendmanager = FriendManager.e();
        Ew.a();
        this(bk, du, friendmanager);
    }

    private Hn(Bk bk, DU du, FriendManager friendmanager)
    {
        a = bk;
        b = du;
        c = friendmanager;
    }

    public final void a(Hd hd)
    {
        hd = c.i(a.mUsername);
        b.a(a.d(), a.Z(), a.G(), a.mPostedStoryId, a.j(), a.au(), Ew.b(a), ((Friend) (hd)).mIsLocalStory, a.mStoryFilterId, a.mStoryUnlockables, a.am());
    }

    public final void a(Hd hd, SnapViewSessionStopReason snapviewsessionstopreason)
    {
        b.b();
    }
}

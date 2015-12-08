// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import Bj;
import Bt;
import android.text.TextUtils;
import java.util.ArrayList;

// Referenced classes of package com.snapchat.android.model:
//            FriendManager, Friend

final class val.friends
    implements 
{

    final FriendManager this$0;
    final ArrayList val$friends;

    public final void a(Object obj)
    {
        boolean flag1;
        flag1 = true;
        obj = (Friend)obj;
        if (TextUtils.equals(((Friend) (obj)).g(), Bt.q()) || ((Friend) (obj)).mIsBlocked) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (Bj.a().c(((Friend) (obj)).mUsername) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag || ((Friend) (obj)).mIsSharedStory) goto _L2; else goto _L3
_L3:
        flag = flag1;
_L5:
        if (flag)
        {
            val$friends.add(obj);
        }
        return;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    ()
    {
        this$0 = final_friendmanager;
        val$friends = ArrayList.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.util.FriendSectionizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class yM extends yH
{
    public final class a extends FriendSectionizer
    {

        private yM a;

        public final volatile com.snapchat.android.util.FriendSectionizer.FriendSection a(Object obj, int i)
        {
            obj = (Friend)obj;
            if (i < yM.a(a) && ((Friend) (obj)).mIsRecommended)
            {
                return com.snapchat.android.util.FriendSectionizer.FriendSection.RECOMMENDED;
            } else
            {
                return com.snapchat.android.util.FriendSectionizer.FriendSection.ON_SNAPCHAT;
            }
        }

        public a()
        {
            a = yM.this;
            super();
        }
    }


    private static final String b = yM.getSimpleName();
    private int c;

    public yM(FriendManager friendmanager)
    {
        super(friendmanager);
    }

    static int a(yM ym)
    {
        return ym.c;
    }

    public final FriendSectionizer a()
    {
        if (Bt.f())
        {
            return new a();
        } else
        {
            return new com.snapchat.android.util.FriendSectionizer.d();
        }
    }

    public final void b(List list)
    {
        list.clear();
        ArrayList arraylist = new ArrayList();
        HashSet hashset = new HashSet(a.mOutgoingFriendsListMap.b());
        Iterator iterator = a.m().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Friend friend = (Friend)iterator.next();
            if (!friend.mIsBlocked && !hashset.contains(friend))
            {
                com.snapchat.android.util.FriendSectionizer.FriendSection friendsection;
                if (Bt.f())
                {
                    friendsection = com.snapchat.android.util.FriendSectionizer.FriendSection.ON_SNAPCHAT;
                } else
                {
                    friendsection = com.snapchat.android.util.FriendSectionizer.FriendSection.ON_SNAPCHAT_TRUNCATED;
                }
                friend.mFriendSection = friendsection;
                list.add(friend);
                if (friend.mIsRecommended && Bt.f())
                {
                    arraylist.add(friend);
                }
            }
        } while (true);
        Collections.sort(list);
        if (!arraylist.isEmpty())
        {
            Collections.sort(arraylist);
            list.addAll(0, arraylist);
            c = arraylist.size();
        }
        if (list.size() == 0)
        {
            Timber.c(b, (new StringBuilder("user ")).append(Bt.q()).append(" has no Snapchatter contacts.").toString(), new Object[0]);
        }
    }

}

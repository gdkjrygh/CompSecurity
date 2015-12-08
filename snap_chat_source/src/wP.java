// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.snapchat.android.model.Friend;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class wP extends OV
{

    String a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    private final List f;
    private final Is g;

    public wP(List list, LB lb, OV.a a1)
    {
        this(list, lb, a1, Is.a());
    }

    private wP(List list, LB lb, OV.a a1, Is is)
    {
        super(lb, a1);
        f = list;
        g = is;
    }

    private boolean a(Friend friend, String s)
    {
label0:
        {
            if (b)
            {
                return IP.b(friend.g(), s);
            }
            if (!friend.f())
            {
                break label0;
            }
            Object obj = new ArrayList();
            ((ArrayList) (obj)).add(friend.mDisplayName);
            ((ArrayList) (obj)).addAll(Arrays.asList(friend.mDisplayName.split(" ")));
            obj = ((ArrayList) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!IP.a((String)((Iterator) (obj)).next(), s));
            return true;
        }
        return IP.b(friend.g(), s);
    }

    public final List a(String s)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        String s1;
        int i;
        int j;
        Object obj = null;
        a = s;
        arraylist = new ArrayList();
        arraylist1 = new ArrayList(f);
        if (s == null)
        {
            return null;
        }
        if (!e && TextUtils.isEmpty(s))
        {
            return Collections.emptyList();
        }
        s1 = s.trim().toLowerCase(Locale.US);
        j = 0;
        i = 0;
        s = obj;
_L11:
        if (j >= arraylist1.size()) goto _L2; else goto _L1
_L1:
        Friend friend = (Friend)arraylist1.get(j);
        if (!friend.k()) goto _L4; else goto _L3
_L3:
        Object obj2 = s;
        if (!IP.c(s1, friend.g())) goto _L5; else goto _L4
_L4:
        Object obj1;
        obj1 = s;
        if (!c)
        {
            obj1 = s;
            if (IP.c(s1, friend.g()))
            {
                if (!d)
                {
                    break MISSING_BLOCK_LABEL_372;
                }
                obj1 = friend;
            }
        }
        if (friend.mIsVerifiedSearchResult && friend.b(s1)) goto _L7; else goto _L6
_L6:
        obj2 = obj1;
        if (friend.mIsVerifiedSearchResult) goto _L5; else goto _L8
_L8:
        obj2 = obj1;
        if (!a(friend, s1)) goto _L5; else goto _L7
_L7:
        arraylist.add(friend);
        if (friend.mFriendSection == com.snapchat.android.util.FriendSectionizer.FriendSection.MY_ADDRESS_BOOK || friend.mFriendSection == com.snapchat.android.util.FriendSectionizer.FriendSection.ON_SNAPCHAT) goto _L10; else goto _L9
_L9:
        obj2 = obj1;
        if (friend.mFriendSection != com.snapchat.android.util.FriendSectionizer.FriendSection.INVITE) goto _L5; else goto _L10
_L10:
        i++;
        s = ((String) (obj1));
_L16:
        j++;
          goto _L11
_L2:
        if (c) goto _L13; else goto _L12
_L12:
        if (s != null) goto _L15; else goto _L14
_L14:
        s = g.a(s1);
        s.mFriendSection = com.snapchat.android.util.FriendSectionizer.FriendSection.USERNAME;
        if (!d)
        {
            arraylist.add(0, s);
        } else
        if (i == 0 || i >= arraylist.size())
        {
            arraylist.add(s);
        } else
        {
            arraylist.add(i, s);
        }
_L13:
        return arraylist;
_L15:
        if (!d)
        {
            arraylist.add(0, s);
        }
        if (true) goto _L13; else goto _L5
_L5:
        s = ((String) (obj2));
          goto _L16
        s = friend;
          goto _L16
    }

    protected final void a(Exception exception)
    {
        mExceptionReporter.b(exception);
    }
}

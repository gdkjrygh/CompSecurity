// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.model.Friend;
import java.util.HashMap;

public final class wY extends wR
{

    public wY()
    {
    }

    public final String a(Friend friend, boolean flag)
    {
        if (!flag)
        {
            return "";
        }
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.snapchat.android.model.Friend.Direction.values().length];
                try
                {
                    a[com.snapchat.android.model.Friend.Direction.INCOMING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.snapchat.android.model.Friend.Direction.OUTGOING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.snapchat.android.model.Friend.Direction.BOTH.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        Object obj;
        switch (_cls1.a[friend.mDirection.ordinal()])
        {
        default:
            if (friend.i())
            {
                return b(friend);
            } else
            {
                return super.a(friend, flag);
            }

        case 1: // '\001'
        case 2: // '\002'
            if (friend.f())
            {
                if (friend.mIsFollowing)
                {
                    return friend.g();
                } else
                {
                    return IC.a(null, 0x7f080035, new Object[] {
                        friend.g()
                    });
                }
            }
            if (friend.mIsFollowing)
            {
                return "";
            } else
            {
                return IC.a(null, 0x7f080034, new Object[0]);
            }

        case 3: // '\003'
            obj = (AH)AH.sUsernamesToProfileInfo.get(friend.g());
            break;
        }
        if (obj != null)
        {
            obj = IF.b(((AH) (obj)).mScore);
            if (friend.f())
            {
                return IC.a(null, 0x7f08030f, new Object[] {
                    friend.g(), obj
                });
            } else
            {
                return IC.a(null, 0x7f080067, new Object[] {
                    obj
                });
            }
        }
        if (friend.f())
        {
            return friend.g();
        } else
        {
            return IC.a(null, 0x7f080175, new Object[0]);
        }
    }
}

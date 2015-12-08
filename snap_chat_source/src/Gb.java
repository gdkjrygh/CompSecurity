// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;

public class Gb extends Ge
    implements FW
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();
    }


    private final Friend a;
    private final a b;

    public Gb(Context context, Friend friend, a a1)
    {
        super(context, context.getString(0x7f0800b8, new Object[] {
            friend.g()
        }));
        b = a1;
        a = friend;
    }

    static a a(Gb gb)
    {
        return gb.b;
    }

    public void a()
    {
        (new mh(FriendAction.DELETE, a, a.g(), a.mUserId) {

            private Gb a;

            protected final void a(Un un, Br br)
            {
                super.a(un, br);
                Gb.a(a).a();
            }

            protected final void a(pi pi, String s, Br br)
            {
                super.a(pi, s, br);
                Gb.a(a).b();
            }

            
            {
                a = Gb.this;
                super(friendaction, friend, s, s1, null, null, null);
            }
        }).execute();
    }

    protected final void b()
    {
    }
}

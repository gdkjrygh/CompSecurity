// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import java.util.List;
import java.util.Set;

final class ng.Object
    implements Runnable
{

    private a a;

    public final void run()
    {
        ng.Object[a.a.ordinal()];
        JVM INSTR tableswitch 4 4: default 32
    //                   4 43;
           goto _L1 _L2
_L1:
        a.a.notifyDataSetChanged();
        return;
_L2:
        a.a.a.remove(a.a);
        if (true) goto _L1; else goto _L3
_L3:
    }

    ng(ng ng)
    {
        a = ng;
        super();
    }

    // Unreferenced inner class wN$2

/* anonymous class */
    final class wN._cls2 extends mh
    {

        final FriendAction a;
        final Friend b;
        final wN c;
        private wS d;

        protected final void a(Un un, Br br)
        {
            super.a(un, br);
            d.a(new wN._cls2._cls1(this));
        }

        public final void a(Un un, pi pi)
        {
            super.a(un, pi);
            switch (wN._cls3.a[a.ordinal()])
            {
            default:
                return;

            case 4: // '\004'
                wN.a(c).remove(b);
                d.a(b);
                return;

            case 5: // '\005'
            case 6: // '\006'
                wN.b(c).remove(b);
                break;
            }
            d.c(b);
        }

        public final void execute()
        {
            wN._cls3.a[a.ordinal()];
            JVM INSTR tableswitch 4 6: default 36
        //                       4 41
        //                       5 72
        //                       6 72;
               goto _L1 _L2 _L3 _L3
_L1:
            super.execute();
            return;
_L2:
            wN.a(c).add(b);
            d.a(b);
            continue; /* Loop/switch isn't completed */
_L3:
            wN.b(c).add(b);
            d.c(b);
            if (true) goto _L1; else goto _L4
_L4:
        }

            
            {
                c = wn;
                a = friendaction1;
                b = friend1;
                d = ws;
                super(friendaction, friend, s, s1, s2, null, blockreason);
            }
    }

}

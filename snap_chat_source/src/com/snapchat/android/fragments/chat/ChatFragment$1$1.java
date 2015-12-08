// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import PG;
import TD;
import com.snapchat.android.Timber;
import com.snapchat.android.model.Friend;
import pi;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class a
    implements Runnable
{

    private a a;

    public final void run()
    {
        ChatFragment.a(a.a);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/snapchat/android/fragments/chat/ChatFragment$1

/* anonymous class */
    final class ChatFragment._cls1
        implements oS.a
    {

        final ChatFragment a;
        private Friend b;

        public final void onJsonResult(Object obj, pi pi1)
        {
            obj = (TD)obj;
            if (obj != null)
            {
                obj = ((TD) (obj)).a();
                if (obj != null)
                {
                    Timber.b("ChatFragment", "CASH-LOG: Got CASH ELIGIBILITY for %s: %s", new Object[] {
                        b.g(), ((TD.a) (obj)).name()
                    });
                    b.mCashEligibility = ((TD.a) (obj));
                    PG.a(new ChatFragment._cls1._cls1(this));
                    return;
                } else
                {
                    Timber.b("ChatFragment", "CASH-LOG: FAILED to get CASH ELIGIBILITY for %s with status code %d and null json response status", new Object[] {
                        b.g(), Integer.valueOf(pi1.mResponseCode)
                    });
                    return;
                }
            } else
            {
                Timber.b("ChatFragment", "CASH-LOG: FAILED to get CASH ELIGIBILITY for %s status code %d", new Object[] {
                    b.g(), Integer.valueOf(pi1.mResponseCode)
                });
                return;
            }
        }

            
            {
                a = chatfragment;
                b = friend;
                super();
            }
    }

}

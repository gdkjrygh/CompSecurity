// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.observers.phone;

import android.telephony.PhoneStateListener;
import com.fitbit.e.a;
import com.fitbit.util.threading.FitbitHandlerThread;

// Referenced classes of package com.fitbit.dncs.observers.phone:
//            PhoneCallObserver

class b
    implements Runnable
{

    final int a;
    final String b;
    final b c;

    public void run()
    {
        switch (a)
        {
        default:
            com.fitbit.e.a.e("PhoneCallObserver", String.format("Unknown Callstate received = %s", new Object[] {
                Integer.valueOf(a)
            }), new Object[0]);
            return;

        case 1: // '\001'
            com.fitbit.dncs.observers.phone.PhoneCallObserver.a(c.c, b);
            return;

        case 0: // '\0'
            PhoneCallObserver.b(c.c, b);
            return;

        case 2: // '\002'
            PhoneCallObserver.c(c.c, b);
            break;
        }
    }

    me(me me, int i, String s)
    {
        c = me;
        a = i;
        b = s;
        super();
    }

    // Unreferenced inner class com/fitbit/dncs/observers/phone/PhoneCallObserver$1

/* anonymous class */
    class PhoneCallObserver._cls1 extends PhoneStateListener
    {

        final PhoneCallObserver a;

        public void onCallStateChanged(int i, String s)
        {
            FitbitHandlerThread.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.e, new PhoneCallObserver._cls1._cls1(this, i, s));
        }

            
            {
                a = phonecallobserver;
                super();
            }
    }

}

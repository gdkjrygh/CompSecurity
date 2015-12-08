// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.observers.phone;

import android.telephony.PhoneStateListener;
import com.fitbit.e.a;
import com.fitbit.util.threading.FitbitHandlerThread;

// Referenced classes of package com.fitbit.dncs.observers.phone:
//            PhoneCallObserver

class a extends PhoneStateListener
{

    final PhoneCallObserver a;

    public void onCallStateChanged(int i, String s)
    {
        FitbitHandlerThread.a(com.fitbit.util.threading.ThreadName.e, new Runnable(i, s) {

            final int a;
            final String b;
            final PhoneCallObserver._cls1 c;

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
                    com.fitbit.dncs.observers.phone.PhoneCallObserver.a(c.a, b);
                    return;

                case 0: // '\0'
                    PhoneCallObserver.b(c.a, b);
                    return;

                case 2: // '\002'
                    PhoneCallObserver.c(c.a, b);
                    break;
                }
            }

            
            {
                c = PhoneCallObserver._cls1.this;
                a = i;
                b = s;
                super();
            }
        });
    }

    _cls1.b(PhoneCallObserver phonecallobserver)
    {
        a = phonecallobserver;
        super();
    }
}

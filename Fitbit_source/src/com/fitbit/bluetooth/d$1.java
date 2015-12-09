// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.content.Intent;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.bluetooth:
//            d

class .c extends c
{

    final d a;

    protected void a(Intent intent)
    {
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
                        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction()))
                        {
                            int i = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0x80000000);
                            com.fitbit.e.a.a("BluetoothStateGlobalListener", "Received BluetoothState: [%s]", new Object[] {
                                Integer.valueOf(i)
                            });
                            com.fitbit.galileo.c.a().b();
                            switch (i)
                            {
                            default:
                                d.e(a);
                                break;

                            case 10: // '\n'
                                break label3;

                            case 11: // '\013'
                                break label0;

                            case 12: // '\f'
                                break label2;

                            case 13: // '\r'
                                break label1;
                            }
                        }
                        return;
                    }
                    com.fitbit.bluetooth.d.a(a);
                    return;
                }
                d.b(a);
                return;
            }
            com.fitbit.bluetooth.d.c(a);
            return;
        }
        d.d(a);
    }

    .c(d d1)
    {
        a = d1;
        super();
    }
}

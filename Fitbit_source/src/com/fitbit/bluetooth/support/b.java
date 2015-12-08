// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.support;

import android.content.Context;
import android.text.Html;
import com.fitbit.bluetooth.n;
import com.fitbit.config.BuildType;

// Referenced classes of package com.fitbit.bluetooth.support:
//            BluetoothSupportStatus

public class b
{

    private static String a = "%s<br><a href=\"%s\">%s</a>";
    private static final String b = "%s<br><br>%s<br><a href=\"%s\">%s</a>";
    private static final String c = "No";

    public b()
    {
    }

    public static CharSequence a(Context context, BluetoothSupportStatus bluetoothsupportstatus)
    {
        if (bluetoothsupportstatus == null || context == null) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[BluetoothSupportStatus.SupportLevel.values().length];
                try
                {
                    a[BluetoothSupportStatus.SupportLevel.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[BluetoothSupportStatus.SupportLevel.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[bluetoothsupportstatus.a().ordinal()];
        JVM INSTR tableswitch 1 2: default 40
    //                   1 42
    //                   2 42;
           goto _L2 _L3 _L3
_L2:
        return null;
_L3:
        return Html.fromHtml(String.format(a, new Object[] {
            context.getString(0x7f08040d), context.getString(0x7f080146), context.getString(0x7f080317)
        }));
    }

    public static String a()
    {
        String s;
        String s1;
        if (com.fitbit.config.b.a == BuildType.a)
        {
            s = "";
        } else
        {
            s = "-beta";
        }
        if (n.b())
        {
            s1 = n.d();
        } else
        {
            s1 = "No";
        }
        return (new StringBuilder()).append(s1).append(s).toString();
    }

    public static CharSequence b(Context context, BluetoothSupportStatus bluetoothsupportstatus)
    {
label0:
        {
            String s1 = "";
            String s = s1;
            if (bluetoothsupportstatus != null)
            {
                s = s1;
                if (context != null)
                {
                    switch (_cls1.a[bluetoothsupportstatus.a().ordinal()])
                    {
                    default:
                        s = context.getString(0x7f0802b8);
                        break;

                    case 2: // '\002'
                        break label0;
                    }
                }
            }
            return s;
        }
        return Html.fromHtml(String.format("%s<br><br>%s<br><a href=\"%s\">%s</a>", new Object[] {
            context.getString(0x7f0802b8), context.getString(0x7f08040e), context.getString(0x7f080146), context.getString(0x7f080317)
        }));
    }

}

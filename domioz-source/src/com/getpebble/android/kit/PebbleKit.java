// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.getpebble.android.kit;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;

// Referenced classes of package com.getpebble.android.kit:
//            a

public final class PebbleKit
{

    public static BroadcastReceiver a(Context context, BroadcastReceiver broadcastreceiver)
    {
        return a(context, "com.getpebble.action.PEBBLE_CONNECTED", broadcastreceiver);
    }

    public static BroadcastReceiver a(Context context, PebbleAckReceiver pebbleackreceiver)
    {
        return a(context, "com.getpebble.action.app.RECEIVE_ACK", ((BroadcastReceiver) (pebbleackreceiver)));
    }

    public static BroadcastReceiver a(Context context, PebbleDataReceiver pebbledatareceiver)
    {
        return a(context, "com.getpebble.action.app.RECEIVE", ((BroadcastReceiver) (pebbledatareceiver)));
    }

    public static BroadcastReceiver a(Context context, PebbleNackReceiver pebblenackreceiver)
    {
        return a(context, "com.getpebble.action.app.RECEIVE_NACK", ((BroadcastReceiver) (pebblenackreceiver)));
    }

    private static BroadcastReceiver a(Context context, String s, BroadcastReceiver broadcastreceiver)
    {
        if (broadcastreceiver == null)
        {
            return null;
        } else
        {
            context.registerReceiver(broadcastreceiver, new IntentFilter(s));
            return broadcastreceiver;
        }
    }

    public static void a(Context context, int i)
    {
        if ((i & 0xffffff00) != 0)
        {
            throw new IllegalArgumentException(String.format("transaction id must be between (0, 255); got '%d'", new Object[] {
                Integer.valueOf(i)
            }));
        } else
        {
            Intent intent = new Intent("com.getpebble.action.app.ACK");
            intent.putExtra("transaction_id", i);
            context.sendBroadcast(intent);
            return;
        }
    }

    public static boolean a(Context context)
    {
        Cursor cursor = context.getContentResolver().query(a.d, null, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToFirst() || cursor.getInt(0) != 1) goto _L4; else goto _L3
_L3:
        cursor.moveToPrevious();
        context = cursor;
_L13:
        if (context == null) goto _L6; else goto _L5
_L5:
        boolean flag = context.moveToNext();
        if (flag) goto _L7; else goto _L6
_L6:
        boolean flag2;
        if (context != null)
        {
            context.close();
        }
        flag2 = false;
_L9:
        return flag2;
_L4:
        cursor.close();
_L2:
        context = context.getContentResolver().query(a.c, null, null, null, null);
        continue; /* Loop/switch isn't completed */
_L7:
        int i = context.getInt(0);
        boolean flag1;
        if (i == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag1;
        if (context == null) goto _L9; else goto _L8
_L8:
        context.close();
        return flag1;
        Exception exception;
        exception;
        context = null;
_L11:
        if (context != null)
        {
            context.close();
        }
        throw exception;
        exception;
        if (true) goto _L11; else goto _L10
_L10:
        if (true) goto _L13; else goto _L12
_L12:
    }

    public static BroadcastReceiver b(Context context, BroadcastReceiver broadcastreceiver)
    {
        return a(context, "com.getpebble.action.PEBBLE_DISCONNECTED", broadcastreceiver);
    }

    public static void b(Context context, int i)
    {
        if ((i & 0xffffff00) != 0)
        {
            throw new IllegalArgumentException(String.format("transaction id must be between (0, 255); got '%d'", new Object[] {
                Integer.valueOf(i)
            }));
        } else
        {
            Intent intent = new Intent("com.getpebble.action.app.NACK");
            intent.putExtra("transaction_id", i);
            context.sendBroadcast(intent);
            return;
        }
    }
}

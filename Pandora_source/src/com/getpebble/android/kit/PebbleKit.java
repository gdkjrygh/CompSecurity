// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.getpebble.android.kit;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import java.util.UUID;
import org.json.JSONException;
import p.bo.a;

public final class PebbleKit
{
    public static abstract class PebbleAckReceiver extends BroadcastReceiver
    {

        private final UUID a;

        public abstract void a(Context context, int i);

        public void onReceive(Context context, Intent intent)
        {
            a(context, intent.getIntExtra("transaction_id", -1));
        }

        protected PebbleAckReceiver(UUID uuid)
        {
            a = uuid;
        }
    }

    public static abstract class PebbleDataReceiver extends BroadcastReceiver
    {

        private final UUID a;

        public abstract void a(Context context, int i, p.bo.a a1);

        public void onReceive(Context context, Intent intent)
        {
            UUID uuid = (UUID)intent.getSerializableExtra("uuid");
            if (a.equals(uuid))
            {
                int i = intent.getIntExtra("transaction_id", -1);
                intent = intent.getStringExtra("msg_data");
                if (intent != null && !intent.isEmpty())
                {
                    try
                    {
                        a(context, i, p.bo.a.a(intent));
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        context.printStackTrace();
                    }
                    return;
                }
            }
        }

        protected PebbleDataReceiver(UUID uuid)
        {
            a = uuid;
        }
    }

    public static abstract class PebbleNackReceiver extends BroadcastReceiver
    {

        private final UUID a;

        public abstract void a(Context context, int i);

        public void onReceive(Context context, Intent intent)
        {
            a(context, intent.getIntExtra("transaction_id", -1));
        }

        protected PebbleNackReceiver(UUID uuid)
        {
            a = uuid;
        }
    }

    public static class a
    {

        private final int a;
        private final int b;
        private final int c;
        private final String d;

        public final String a()
        {
            return d;
        }

        a(int i, int j, int k, String s)
        {
            a = i;
            b = j;
            c = k;
            d = s;
        }
    }


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
        throws IllegalArgumentException
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

    public static void a(Context context, UUID uuid)
        throws IllegalArgumentException
    {
        if (uuid == null)
        {
            throw new IllegalArgumentException("uuid cannot be null");
        } else
        {
            Intent intent = new Intent("com.getpebble.action.app.START");
            intent.putExtra("uuid", uuid);
            context.sendBroadcast(intent);
            return;
        }
    }

    public static void a(Context context, UUID uuid, p.bo.a a1)
        throws IllegalArgumentException
    {
        a(context, uuid, a1, -1);
    }

    public static void a(Context context, UUID uuid, p.bo.a a1, int i)
        throws IllegalArgumentException
    {
        if (uuid == null)
        {
            throw new IllegalArgumentException("uuid cannot be null");
        }
        if (a1 == null)
        {
            throw new IllegalArgumentException("data cannot be null");
        }
        if (a1.a() == 0)
        {
            return;
        } else
        {
            Intent intent = new Intent("com.getpebble.action.app.SEND");
            intent.putExtra("uuid", uuid);
            intent.putExtra("transaction_id", i);
            intent.putExtra("msg_data", a1.b());
            context.sendBroadcast(intent);
            return;
        }
    }

    public static boolean a(Context context)
    {
        PackageInfo packageinfo;
        int i;
        boolean flag;
        try
        {
            packageinfo = context.getPackageManager().getPackageInfo("com.getpebble.android", 8);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if (packageinfo == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        if (packageinfo.providers == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        i = packageinfo.providers.length;
        if (i != 0)
        {
            if ((context = context.getContentResolver().query(Uri.parse("content://com.getpebble.android.provider/state"), null, null, null, null)) != null && context.moveToNext())
            {
                if (context.getInt(0) == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    public static BroadcastReceiver b(Context context, BroadcastReceiver broadcastreceiver)
    {
        return a(context, "com.getpebble.action.PEBBLE_DISCONNECTED", broadcastreceiver);
    }

    public static a b(Context context)
    {
        context = context.getContentResolver().query(Uri.parse("content://com.getpebble.android.provider/state"), null, null, null, null);
        if (context == null || !context.moveToNext())
        {
            return null;
        } else
        {
            return new a(context.getInt(3), context.getInt(4), context.getInt(5), context.getString(6));
        }
    }

    public static void b(Context context, UUID uuid)
        throws IllegalArgumentException
    {
        if (uuid == null)
        {
            throw new IllegalArgumentException("uuid cannot be null");
        } else
        {
            Intent intent = new Intent("com.getpebble.action.app.STOP");
            intent.putExtra("uuid", uuid);
            context.sendBroadcast(intent);
            return;
        }
    }
}

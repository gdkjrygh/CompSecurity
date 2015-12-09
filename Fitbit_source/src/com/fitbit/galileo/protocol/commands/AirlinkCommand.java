// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.protocol.commands;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import com.fitbit.e.a;
import com.fitbit.galileo.GalileoTracker;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.bluetooth.c;
import com.fitbit.galileo.bluetooth.f;
import com.fitbit.galileo.bluetooth.h;
import com.fitbit.galileo.tasks.ae;
import com.fitbit.galileo.tasks.ap;
import com.fitbit.galileo.tasks.p;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public abstract class AirlinkCommand extends Loader
    implements android.os.Handler.Callback
{
    public static final class FailureType extends Enum
    {

        public static final FailureType a;
        public static final FailureType b;
        public static final FailureType c;
        public static final FailureType d;
        public static final FailureType e;
        public static final FailureType f;
        public static final FailureType g;
        public static final FailureType h;
        public static final FailureType i;
        public static final FailureType j;
        public static final FailureType k;
        public static final FailureType l;
        private static final FailureType m[];

        public static boolean a(FailureType failuretype)
        {
            return e == failuretype;
        }

        public static FailureType b(Bundle bundle)
        {
            return b(com/fitbit/galileo/protocol/commands/AirlinkCommand$FailureType.getName(), bundle);
        }

        public static FailureType b(String s, Bundle bundle)
        {
            return values()[bundle.getInt(s, l.ordinal())];
        }

        public static boolean b(FailureType failuretype)
        {
            return EnumSet.of(c, d, f).contains(failuretype);
        }

        public static boolean c(FailureType failuretype)
        {
            return failuretype != null && !EnumSet.of(b, i).contains(failuretype);
        }

        public static FailureType valueOf(String s)
        {
            return (FailureType)Enum.valueOf(com/fitbit/galileo/protocol/commands/AirlinkCommand$FailureType, s);
        }

        public static FailureType[] values()
        {
            return (FailureType[])m.clone();
        }

        public void a(Bundle bundle)
        {
            a(getClass().getName(), bundle);
        }

        public void a(String s, Bundle bundle)
        {
            bundle.putInt(s, ordinal());
        }

        static 
        {
            a = new FailureType("CANCELLED", 0);
            b = new FailureType("BLUETOOTH_DISABLED", 1);
            c = new FailureType("BLUETOOTH_CONNECTION", 2);
            d = new FailureType("RECOVERABLE_COMMUNICATION_WITH_TRACKER", 3);
            e = new FailureType("RECOVERABLE_COMMUNICATION_WITH_SITE", 4);
            f = new FailureType("TRACKER_REPAIR_NEEDED", 5);
            g = new FailureType("TRACKER_FIRMWARE_UPDATE_NEEDED", 6);
            h = new FailureType("TRACKER_INVALID_SECRET", 7);
            i = new FailureType("TRACKER_BACKOFF", 8);
            j = new FailureType("TRACKER_LOW_BATTERY", 9);
            k = new FailureType("UNEXPECTED_BOOT_MODE", 10);
            l = new FailureType("UNKNOWN", 11);
            m = (new FailureType[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l
            });
        }

        private FailureType(String s, int i1)
        {
            super(s, i1);
        }
    }

    static final class States extends Enum
    {

        public static final States a;
        public static final States b;
        public static final States c;
        public static final States d;
        public static final States e;
        private static final States f[];

        public static States valueOf(String s)
        {
            return (States)Enum.valueOf(com/fitbit/galileo/protocol/commands/AirlinkCommand$States, s);
        }

        public static States[] values()
        {
            return (States[])f.clone();
        }

        static 
        {
            a = new States("STARTED", 0);
            b = new States("COMPLETED", 1);
            c = new States("CANCELLED", 2);
            d = new States("SUSPENDED", 3);
            e = new States("FAILED", 4);
            f = (new States[] {
                a, b, c, d, e
            });
        }

        private States(String s, int j)
        {
            super(s, j);
        }
    }

    public static final class Status extends Enum
    {

        public static final Status a;
        public static final Status b;
        private static final Status c[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/fitbit/galileo/protocol/commands/AirlinkCommand$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])c.clone();
        }

        static 
        {
            a = new Status("Failed", 0);
            b = new Status("Success", 1);
            c = (new Status[] {
                a, b
            });
        }

        private Status(String s, int j)
        {
            super(s, j);
        }
    }

    private static class a extends h
    {

        final Map a = new HashMap();
        final Handler b;
        final com.fitbit.galileo.bluetooth.a c;

        private void a(States states, UUID uuid)
        {
            synchronized (a)
            {
                uuid = (f)a.get(uuid);
            }
            if (uuid != null)
            {
                b.sendMessage(b.obtainMessage(states.ordinal(), uuid));
            }
            return;
            states;
            map;
            JVM INSTR monitorexit ;
            throw states;
        }

        public void a(f f1)
        {
            synchronized (a)
            {
                a.put(f1.i(), f1);
            }
            if (!c.a(f1))
            {
                b(f1.i());
            }
            return;
            f1;
            map;
            JVM INSTR monitorexit ;
            throw f1;
        }

        protected void a(UUID uuid)
        {
            a(com.fitbit.galileo.protocol.commands.States.a, uuid);
        }

        public void b()
        {
            Map map = a;
            map;
            JVM INSTR monitorenter ;
            java.util.Map.Entry entry;
            for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); c.b((f)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            break MISSING_BLOCK_LABEL_67;
            Exception exception;
            exception;
            map;
            JVM INSTR monitorexit ;
            throw exception;
            map;
            JVM INSTR monitorexit ;
        }

        protected void b(UUID uuid)
        {
            a(States.e, uuid);
        }

        protected void c(UUID uuid)
        {
            a(States.b, uuid);
        }

        public boolean c()
        {
            Map map = a;
            map;
            JVM INSTR monitorenter ;
            Exception exception;
            boolean flag;
            if (!a.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            map;
            JVM INSTR monitorexit ;
            return flag;
            exception;
            map;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected void d(UUID uuid)
        {
            a(com.fitbit.galileo.protocol.commands.States.c, uuid);
        }

        protected void e(UUID uuid)
        {
            a(States.d, uuid);
        }

        public a(Handler handler, com.fitbit.galileo.bluetooth.a a1)
        {
            b = handler;
            c = a1;
        }
    }

    public static abstract class b
        implements android.support.v4.app.LoaderManager.LoaderCallbacks
    {

        private final a a;

        public void a(Loader loader, c c1)
        {
        /* block-local class not found */
        class a {}

label0:
            {
                if (a != null)
                {
                    if (!c1.a())
                    {
                        break label0;
                    }
                    a.a((AirlinkCommand)loader, c1.b, (Throwable)c1.b.getSerializable(com.fitbit.galileo.protocol.commands.AirlinkCommand.a));
                }
                return;
            }
            a.a((AirlinkCommand)loader, c1.a);
        }

        public void onLoadFinished(Loader loader, Object obj)
        {
            a(loader, (c)obj);
        }

        public void onLoaderReset(Loader loader)
        {
        }

        public b(a a1)
        {
            a = a1;
        }
    }

    public static class c
    {

        public final Object a;
        public final Bundle b;

        public boolean a()
        {
            return b != null;
        }

        public c(Bundle bundle)
        {
            b = bundle;
            a = null;
        }

        public c(Object obj)
        {
            a = obj;
            b = null;
        }
    }


    public static final String a = (new StringBuilder()).append(com/fitbit/galileo/protocol/commands/AirlinkCommand.getSimpleName()).append(".err.exception").toString();
    public static final String b = (new StringBuilder()).append(com/fitbit/galileo/protocol/commands/AirlinkCommand.getSimpleName()).append(".err.failureType.ordinal").toString();
    protected final String c;
    private final a d;
    private final Handler e;
    private final BluetoothDevice f;
    private final GalileoTrackerType g;
    private final com.fitbit.galileo.bluetooth.a h;
    private c i;

    public AirlinkCommand(Context context, com.fitbit.galileo.bluetooth.a a1, BluetoothDevice bluetoothdevice, GalileoTrackerType galileotrackertype)
    {
        super(context);
        c = getClass().getSimpleName();
        f = bluetoothdevice;
        g = galileotrackertype;
        if (a1 == null)
        {
            com.fitbit.e.a.a(c, "BluetoothContext was not provided", new Object[0]);
            h = new com.fitbit.galileo.bluetooth.c();
        } else
        {
            h = a1;
        }
        e = new Handler(this);
        d = new a(e, h);
        onContentChanged();
        com.fitbit.e.a.a(c, String.format("Bound to device: %s", new Object[] {
            bluetoothdevice
        }), new Object[0]);
    }

    public AirlinkCommand(Context context, com.fitbit.galileo.bluetooth.a a1, GalileoTracker galileotracker)
    {
        this(context, a1, galileotracker.a(), galileotracker.f());
    }

    private void a(c c1)
    {
        if (!isAbandoned() && !isReset())
        {
            deliverResult(c1);
        }
        if (!isReset())
        {
            i = c1;
            commitContentChanged();
        }
    }

    private void b(Bundle bundle)
    {
        String s = bundle.getString("EXTRA_SYNCLAIR_ERROR", null);
        if (s != null)
        {
            if (TextUtils.equals(s, "SYNCLAIR_ERROR_NOT_PAIRED"))
            {
                com.fitbit.galileo.protocol.commands.FailureType.f.a(b, bundle);
            } else
            {
                if (TextUtils.equals(s, "SYNCLAIR_ERROR_INVALID_SECRET"))
                {
                    com.fitbit.galileo.protocol.commands.FailureType.h.a(b, bundle);
                    return;
                }
                if (TextUtils.equals(s, "SYNCLAIR_ERROR_BACKOFF"))
                {
                    FailureType.i.a(b, bundle);
                    return;
                }
                if (TextUtils.equals(s, "SYNCLAIR_ERROR_LOW_BATTERY"))
                {
                    FailureType.j.a(b, bundle);
                    return;
                }
            }
        }
    }

    private void c(Bundle bundle)
    {
        if (!bundle.containsKey(b))
        {
            FailureType.l.a(b, bundle);
        }
        com.fitbit.e.a.a(c, "Command fail %s", new Object[] {
            bundle
        });
        d();
        a(new c(bundle));
    }

    private void d()
    {
        d.d();
    }

    protected abstract void a();

    protected void a(Bundle bundle)
    {
        if (bundle.containsKey("EXTRA_SYNCLAIR_ERROR"))
        {
            b(bundle);
        }
        c(bundle);
    }

    protected void a(f f1)
    {
        com.fitbit.e.a.a(c, String.format("Task completed: %s", new Object[] {
            f1.getClass().getSimpleName()
        }), new Object[0]);
    }

    protected void a(FailureType failuretype)
    {
        Bundle bundle = new Bundle();
        failuretype.a(b, bundle);
        a(bundle);
    }

    protected void a(Object obj)
    {
        com.fitbit.e.a.a(c, "Command success!", new Object[0]);
        d();
        a(new c(obj));
    }

    protected void a(Throwable throwable)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable(a, throwable);
        FailureType.l.a(b, bundle);
        a(bundle);
    }

    protected BluetoothDevice b()
    {
        return f;
    }

    protected void b(f f1)
    {
        com.fitbit.e.a.a(c, String.format("Task suspended: %s", new Object[] {
            f1.getClass().getSimpleName()
        }), new Object[0]);
    }

    protected GalileoTrackerType c()
    {
        return g;
    }

    protected void c(f f1)
    {
        com.fitbit.e.a.a(c, String.format("Task Failed: %s", new Object[] {
            f1.getClass().getSimpleName()
        }), new Object[0]);
        if (f1.s() != null && f1.s().getExtras() != null)
        {
            a(f1.s().getExtras());
            return;
        }
        if (f1 instanceof ae)
        {
            a(com.fitbit.galileo.protocol.commands.FailureType.c);
            return;
        }
        if (f1 instanceof p)
        {
            a(FailureType.d);
            return;
        }
        if (f1 instanceof ap)
        {
            a(FailureType.e);
            return;
        } else
        {
            a((new RuntimeException(String.format("GenericTaskFailed: %s,\n Reason:%s", new Object[] {
                f1.getClass().getName(), f1.s()
            }))).fillInStackTrace());
            return;
        }
    }

    protected void d(f f1)
    {
        com.fitbit.e.a.a(c, String.format("Task Cancelled: %s", new Object[] {
            f1.getClass().getSimpleName()
        }), new Object[0]);
    }

    protected void e(f f1)
    {
        com.fitbit.e.a.a(c, String.format("Task Executing: %s", new Object[] {
            f1.getClass().getSimpleName()
        }), new Object[0]);
        d.a(f1);
    }

    public boolean handleMessage(Message message)
    {
        f f1;
        com.fitbit.e.a.a(c, (new StringBuilder()).append("handleMessage: ").append(message.what).toString(), new Object[0]);
        f1 = (f)message.obj;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[States.values().length];
                try
                {
                    a[com.fitbit.galileo.protocol.commands.States.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.fitbit.galileo.protocol.commands.States.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[States.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[States.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[States.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.fitbit.galileo.protocol.commands._cls1.a[States.values()[message.what].ordinal()];
        JVM INSTR tableswitch 1 5: default 92
    //                   1 94
    //                   2 120
    //                   3 128
    //                   4 136
    //                   5 144;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return false;
_L2:
        com.fitbit.e.a.a(c, "Started executing task:%s", new Object[] {
            f1.getClass().getSimpleName()
        });
_L8:
        return true;
_L3:
        d(f1);
        continue; /* Loop/switch isn't completed */
_L4:
        c(f1);
        continue; /* Loop/switch isn't completed */
_L5:
        a(f1);
        continue; /* Loop/switch isn't completed */
_L6:
        b(f1);
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected final void onForceLoad()
    {
        if (d.c())
        {
            return;
        } else
        {
            com.fitbit.e.a.a(c, "ForceLoading", new Object[0]);
            d.a();
            a();
            return;
        }
    }

    protected void onStartLoading()
    {
        if (takeContentChanged())
        {
            forceLoad();
            return;
        } else
        {
            a(i);
            return;
        }
    }

    protected void onStopLoading()
    {
        super.onStopLoading();
        d.b();
    }

}

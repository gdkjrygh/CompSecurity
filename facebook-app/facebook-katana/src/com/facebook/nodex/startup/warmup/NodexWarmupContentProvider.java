// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.warmup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.base.lwperf.LightWeightPerfState;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.init.AppInitLockHelper;
import com.facebook.inject.FbInjector;
import com.facebook.systrace.Systrace;

public class NodexWarmupContentProvider extends ContentProvider
{

    public static final String a = (new StringBuilder()).append(BuildConstants.j()).append(".nodex.startup.warmup").toString();
    public static final Uri b = Uri.parse((new StringBuilder("content://")).append(a).toString());
    private static final String c = com/facebook/nodex/startup/warmup/NodexWarmupContentProvider.getSimpleName();

    public NodexWarmupContentProvider()
    {
    }

    public static ContentValues a(Action action, boolean flag, long l)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("action", action.name());
        contentvalues.put("dexes_generated", Boolean.valueOf(flag));
        contentvalues.put("no_dex_app_start_time", Long.valueOf(l));
        return contentvalues;
    }

    private void a(ContentValues contentvalues)
    {
        b(contentvalues);
        c(contentvalues);
    }

    private static void b(ContentValues contentvalues)
    {
        contentvalues = contentvalues.getAsBoolean("dexes_generated");
        boolean flag;
        if (contentvalues != null)
        {
            flag = contentvalues.booleanValue();
        } else
        {
            flag = false;
        }
        LightWeightPerfState.a().a(flag);
    }

    private static void c(ContentValues contentvalues)
    {
        contentvalues = contentvalues.getAsLong("no_dex_app_start_time");
        long l;
        if (contentvalues != null)
        {
            l = contentvalues.longValue();
        } else
        {
            l = -1L;
        }
        LightWeightPerfState.a();
        LightWeightPerfState.a(l);
    }

    public int delete(Uri uri, String s, String as[])
    {
        return 0;
    }

    public String getType(Uri uri)
    {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        uri = Action.valueOf(contentvalues.getAsString("action"));
        a(contentvalues);
        _cls1.a[uri.ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 48
    //                   2 50
    //                   3 84;
           goto _L1 _L1 _L2 _L3
_L1:
        return null;
_L2:
        Systrace.a(8L, "Wait for Injector (Nodex Warmup)");
        FbInjector.a(getContext());
        Systrace.a(8L);
          goto _L1
        uri;
        Systrace.a(8L);
        throw uri;
_L3:
        Systrace.a(8L, "Wait for Init (Nodex Warmup)");
        AppInitLockHelper.a(getContext());
        Systrace.a(8L);
          goto _L1
        uri;
        Systrace.a(8L);
        throw uri;
    }

    public boolean onCreate()
    {
        return true;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        return null;
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        return 0;
    }


    private class Action extends Enum
    {

        private static final Action $VALUES[];
        public static final Action Ping;
        public static final Action WaitForInit;
        public static final Action WaitForInjector;

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/facebook/nodex/startup/warmup/NodexWarmupContentProvider$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])$VALUES.clone();
        }

        static 
        {
            Ping = new Action("Ping", 0);
            WaitForInjector = new Action("WaitForInjector", 1);
            WaitForInit = new Action("WaitForInit", 2);
            $VALUES = (new Action[] {
                Ping, WaitForInjector, WaitForInit
            });
        }

        private Action(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[Action.values().length];
            try
            {
                a[Action.Ping.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[Action.WaitForInjector.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[Action.WaitForInit.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}

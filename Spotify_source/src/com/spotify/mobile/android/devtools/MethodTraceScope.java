// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.devtools;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.devtools:
//            TraceStyle

public final class MethodTraceScope extends Enum
{

    public static final MethodTraceScope a;
    public static final MethodTraceScope b;
    public static final MethodTraceScope c;
    public static final MethodTraceScope d;
    public static final MethodTraceScope e;
    public static final MethodTraceScope f;
    public static final MethodTraceScope g;
    public static final MethodTraceScope h;
    private static final MethodTraceScope i[];
    Map mAuxData;
    private TraceStyle mStyle;

    private MethodTraceScope(String s, int j)
    {
        super(s, j);
        mAuxData = new HashMap();
        mStyle = TraceStyle.a;
    }

    public static MethodTraceScope valueOf(String s)
    {
        return (MethodTraceScope)Enum.valueOf(com/spotify/mobile/android/devtools/MethodTraceScope, s);
    }

    public static MethodTraceScope[] values()
    {
        return (MethodTraceScope[])i.clone();
    }

    public final void a()
    {
        mStyle.a(this);
    }

    final void a(String s, Object obj)
    {
        mAuxData.put(s, obj);
    }

    public final void b()
    {
        mStyle.b(this);
    }

    static 
    {
        TraceStyle tracestyle = TraceStyle.a;
        a = new MethodTraceScope("CONNECT_MANAGER_LOAD_DEVICE_LIST", 0);
        tracestyle = TraceStyle.a;
        b = new MethodTraceScope("INIT_RUNTIME", 1);
        tracestyle = TraceStyle.a;
        c = new MethodTraceScope("CREATE_SPOTIFY_APPLICATION", 2);
        tracestyle = TraceStyle.a;
        d = new MethodTraceScope("CREATE_SPOTIFY_SERVICE", 3);
        tracestyle = TraceStyle.a;
        e = new MethodTraceScope("FEATURE_FLAGS_CHANGED", 4);
        tracestyle = TraceStyle.a;
        f = new MethodTraceScope("MAIN_ACTIVITY_ON_CREATE", 5);
        tracestyle = TraceStyle.a;
        g = new MethodTraceScope("LOAD_FEATURE_FLAGS", 6);
        tracestyle = TraceStyle.a;
        h = new MethodTraceScope("SETTINGS_FRAGMENT_ON_CREATE", 7);
        i = (new MethodTraceScope[] {
            a, b, c, d, e, f, g, h
        });
    }
}

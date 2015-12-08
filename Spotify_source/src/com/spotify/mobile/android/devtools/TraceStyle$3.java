// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.devtools;


// Referenced classes of package com.spotify.mobile.android.devtools:
//            TraceStyle, MethodTraceScope

final class nit> extends TraceStyle
{

    MethodTraceScope mActiveTraceScope;

    public final void a(MethodTraceScope methodtracescope)
    {
        TraceStyle.a();
        TraceStyle.c(methodtracescope);
        mActiveTraceScope = methodtracescope;
    }

    public final void b(MethodTraceScope methodtracescope)
    {
        if (mActiveTraceScope == methodtracescope)
        {
            TraceStyle.a();
            mActiveTraceScope = null;
        }
    }

    ope(String s)
    {
        super(s, 2, (byte)0);
    }
}

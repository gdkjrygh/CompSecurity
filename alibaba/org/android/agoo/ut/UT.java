// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo.ut;

import android.content.Context;

public interface UT
{

    public static final int AGOO_EVENT_ID = 0x1051b9cd;

    public abstract void commitEvent(int i, Object obj);

    public abstract void commitEvent(int i, Object obj, Object obj1);

    public abstract void commitEvent(int i, Object obj, Object obj1, Object obj2);

    public transient abstract void commitEvent(int i, Object obj, Object obj1, Object obj2, String as[]);

    public abstract String getUtdId(Context context);

    public abstract void onCaughException(Throwable throwable);

    public abstract void start(Context context, String s, String s1, String s2);

    public abstract void stop(Context context);
}

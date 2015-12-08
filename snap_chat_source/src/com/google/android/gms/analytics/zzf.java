// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

interface zzf
{

    public abstract void dispatch();

    public abstract Thread getThread();

    public abstract void zzfh();

    public abstract LinkedBlockingQueue zzfi();

    public abstract void zzx(Map map);
}

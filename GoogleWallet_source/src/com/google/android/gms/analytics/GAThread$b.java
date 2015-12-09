// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            GAThread, ai

final class <init>
    implements Runnable
{

    final GAThread zO;

    public final void run()
    {
        GAThread.d(zO).dispatch();
    }

    private (GAThread gathread)
    {
        zO = gathread;
        super();
    }

    zO(GAThread gathread, zO zo)
    {
        this(gathread);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;


// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            TargetStateManager

public static interface 
{

    public abstract void removeEvents( );

    public abstract void scheduleEvent( , int i);

    public abstract void stateHasError( );

    public abstract void stateHasExhaustedRetry( );

    public abstract void stateHasTimedOut( );
}

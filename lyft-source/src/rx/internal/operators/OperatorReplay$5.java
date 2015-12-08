// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.functions.Func0;

// Referenced classes of package rx.internal.operators:
//            OperatorReplay

final class val.bufferSize
    implements Func0
{

    final int val$bufferSize;

    public volatile Object call()
    {
        return call();
    }

    public playBuffer call()
    {
        return new zeBoundReplayBuffer(val$bufferSize);
    }

    playBuffer()
    {
        val$bufferSize = i;
        super();
    }
}

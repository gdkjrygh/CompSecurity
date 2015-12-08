// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.functions.Func0;

// Referenced classes of package rx.internal.operators:
//            OperatorReplay

final class boundedReplayBuffer
    implements Func0
{

    public Object call()
    {
        return new boundedReplayBuffer(16);
    }

    boundedReplayBuffer()
    {
    }
}

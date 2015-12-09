// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import com.google.protobuf.nano.MessageNano;

// Referenced classes of package com.google.android.apps.wallet.rpc:
//            RpcException

public interface RpcCaller
{

    public abstract MessageNano call(String s, MessageNano messagenano, MessageNano messagenano1)
        throws RpcException;
}

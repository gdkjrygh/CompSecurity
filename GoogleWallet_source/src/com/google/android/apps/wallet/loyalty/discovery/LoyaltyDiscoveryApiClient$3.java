// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty.discovery;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.commerce.wobs.common.Entrypoint;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.loyalty.discovery:
//            LoyaltyDiscoveryApiClient

final class val.programId
    implements Callable
{

    final LoyaltyDiscoveryApiClient this$0;
    final String val$programId;

    private com.google.wallet.proto.api.leLoyaltyProgram call()
        throws Exception
    {
        Object obj = new com.google.wallet.proto.api.ProgramsRequest();
        obj.programId = (new String[] {
            val$programId
        });
        obj.renderInfo = LoyaltyDiscoveryApiClient.access$200(LoyaltyDiscoveryApiClient.this);
        ((com.google.wallet.proto.api.ProgramsRequest) (obj)).renderInfo.entrypointNames = (new String[] {
            Entrypoint.DISCOVERABLE_DETAILS.toString()
        });
        obj.supportsOptionalData = Boolean.valueOf(true);
        obj = (com.google.wallet.proto.api.ProgramsResponse)LoyaltyDiscoveryApiClient.access$300(LoyaltyDiscoveryApiClient.this).call("b/loyalty/getProgramsById", ((com.google.protobuf.nano.MessageNano) (obj)), new com.google.wallet.proto.api.ProgramsResponse());
        if (((com.google.wallet.proto.api.ProgramsResponse) (obj)).callError != null)
        {
            throw new CallErrorException(((com.google.wallet.proto.api.ProgramsResponse) (obj)).callError);
        }
        if (((com.google.wallet.proto.api.ProgramsResponse) (obj)).programs.length == 0)
        {
            obj = String.valueOf("Server returned a 0 length list of programs, programId=");
            String s = String.valueOf(val$programId);
            if (s.length() != 0)
            {
                obj = ((String) (obj)).concat(s);
            } else
            {
                obj = new String(((String) (obj)));
            }
            throw new RpcException(((String) (obj)));
        } else
        {
            return ((com.google.wallet.proto.api.ProgramsResponse) (obj)).programs[0];
        }
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_loyaltydiscoveryapiclient;
        val$programId = String.this;
        super();
    }
}

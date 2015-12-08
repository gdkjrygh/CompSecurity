// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.address;

import com.google.android.apps.wallet.paymentcard.api.CdpId;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.common.base.CharMatcher;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class FetchAddressAction
    implements Callable
{

    private final RpcCaller mRpcCaller;

    public FetchAddressAction(RpcCaller rpccaller)
    {
        mRpcCaller = rpccaller;
    }

    private List call()
        throws RpcException
    {
        com.google.wallet.proto.api.NanoWalletAddress.FetchAddressesResponse fetchaddressesresponse = (com.google.wallet.proto.api.NanoWalletAddress.FetchAddressesResponse)mRpcCaller.call("b/address/fetch", new com.google.wallet.proto.api.NanoWalletAddress.FetchAddressesRequest(), new com.google.wallet.proto.api.NanoWalletAddress.FetchAddressesResponse());
        return validateAndOrderAddresses(Arrays.asList(fetchaddressesresponse.addresses), fetchaddressesresponse.legalAddressId);
    }

    private static boolean isNullOrEmptyOrWhitespace(String s)
    {
        return CharMatcher.WHITESPACE.matchesAllOf(Strings.nullToEmpty(s));
    }

    private static List validateAndOrderAddresses(List list, com.google.wallet.proto.NanoWalletEntities.CdpIdData cdpiddata)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        Object obj = null;
        Iterator iterator = list.iterator();
        list = obj;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.wallet.proto.NanoWalletEntities.Address address = (com.google.wallet.proto.NanoWalletEntities.Address)iterator.next();
            if (!isNullOrEmptyOrWhitespace(address.recipientName) && !isNullOrEmptyOrWhitespace(address.line1) && !isNullOrEmptyOrWhitespace(address.city) && !isNullOrEmptyOrWhitespace(address.state) && !isNullOrEmptyOrWhitespace(address.postalCode))
            {
                if (cdpiddata != null && CdpId.equals(address.cdpAddressId, cdpiddata))
                {
                    list = address;
                } else
                {
                    arraylist.add(address);
                }
            }
        } while (true);
        if (list != null)
        {
            arraylist.add(0, list);
        }
        return arraylist;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }
}

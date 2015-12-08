// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.api;

import com.google.android.apps.wallet.base.entitymanager.EntityId;
import com.google.android.apps.wallet.base.entitymanager.TypedCursor;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.protobuf.nano.MessageNano;
import dagger.Lazy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.api:
//            PaymentCard, InstrumentClient, CredentialProtoManager

public class CredentialManager
{

    private static final String TAG = com/google/android/apps/wallet/paymentcard/api/CredentialManager.getSimpleName();
    private final CredentialProtoManager credentialProtoManager;
    private final Lazy instrumentClient;

    public CredentialManager(CredentialProtoManager credentialprotomanager, Lazy lazy)
    {
        credentialProtoManager = credentialprotomanager;
        instrumentClient = lazy;
    }

    private static Map createEntityMap(List list)
    {
        java.util.HashMap hashmap = Maps.newHashMap();
        com.google.wallet.proto.NanoWalletEntities.Credential credential;
        for (list = list.iterator(); list.hasNext(); hashmap.put(new EntityId(credential.id), credential))
        {
            credential = (com.google.wallet.proto.NanoWalletEntities.Credential)list.next();
        }

        return hashmap;
    }

    public final boolean delete(PaymentCard paymentcard)
        throws RpcException
    {
        Preconditions.checkNotNull(paymentcard);
        com.google.wallet.proto.api.NanoWalletInstrument.DeleteInstrumentRequest deleteinstrumentrequest = new com.google.wallet.proto.api.NanoWalletInstrument.DeleteInstrumentRequest();
        deleteinstrumentrequest.credential = paymentcard.getCredential();
        if (((InstrumentClient)instrumentClient.get()).delete(deleteinstrumentrequest).callError == null)
        {
            credentialProtoManager.delete(paymentcard.getCredential());
            return true;
        } else
        {
            WLog.e(TAG, "DeleteInstrumentResponse had a CallError, not deleting instrument locally");
            return false;
        }
    }

    public final boolean fetch()
        throws RpcException
    {
        Object obj = createEntityMap(Arrays.asList(((InstrumentClient)instrumentClient.get()).fetch().entities));
        Map map = createEntityMap(credentialProtoManager.getAllEntities());
        int j = 0;
        int i = 0;
        Iterator iterator = map.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
            if (!((Map) (obj)).containsKey(entry1.getKey()))
            {
                credentialProtoManager.delete((MessageNano)entry1.getValue());
                i++;
            }
        } while (true);
        obj = ((Map) (obj)).entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            if (!map.containsKey(entry.getKey()) || !MessageNano.messageNanoEquals((MessageNano)entry.getValue(), (MessageNano)map.get(entry.getKey())))
            {
                credentialProtoManager.persist((MessageNano)entry.getValue());
                j++;
            }
        } while (true);
        WLog.ifmt(TAG, "Finished persisting credentials: %d changed, %d deleted", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        });
        return j > 0 || i > 0;
    }

    public final List getAll()
    {
        TypedCursor typedcursor;
        Object obj;
        obj = Lists.newArrayList();
        typedcursor = credentialProtoManager.getAllEntitiesCursor();
        while (typedcursor.moveToNext()) 
        {
            ((List) (obj)).add(new PaymentCard((com.google.wallet.proto.NanoWalletEntities.Credential)typedcursor.get()));
        }
        break MISSING_BLOCK_LABEL_56;
        obj;
        typedcursor.close();
        throw obj;
        typedcursor.close();
        return ((List) (obj));
    }

}

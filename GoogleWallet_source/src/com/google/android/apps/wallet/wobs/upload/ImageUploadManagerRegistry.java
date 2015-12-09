// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.upload;

import com.google.android.apps.wallet.datastore.KeyValueStore;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.wobs.upload:
//            ImageUploadManager

public class ImageUploadManagerRegistry
{

    private static final long MAX_AGE_MILLIS;
    private static final String TAG;
    private LinkedHashMap entries;
    private final KeyValueStore keyValueStore;

    ImageUploadManagerRegistry(KeyValueStore keyvaluestore)
    {
        keyValueStore = keyvaluestore;
    }

    private static boolean findReference(String s, com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (wobinstance.renderOutput == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        wobinstance = wobinstance.renderOutput.layouts;
        j = wobinstance.length;
        i = 0;
_L7:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L3
_L3:
        if (!((com.google.wallet.proto.NanoWalletWobl.Layout) (wobinstance[i])).wobl.contains(s)) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static boolean isOld(long l, long l1)
    {
        return l1 - l > MAX_AGE_MILLIS;
    }

    private int loadInt()
    {
        byte abyte0[] = keyValueStore.load("imageupload_id_counter");
        if (abyte0 == null)
        {
            return 0;
        } else
        {
            return ByteBuffer.wrap(abyte0).getInt();
        }
    }

    private void maybeLoadFromStore()
    {
        if (entries == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        entries = Maps.newLinkedHashMap();
        Object aobj[] = keyValueStore.load("imageupload_registry");
        if (aobj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int j;
        com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData imageuploadmanagerregistrydata = new com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData();
        MessageNano.mergeFrom(imageuploadmanagerregistrydata, ((byte []) (aobj)));
        if (imageuploadmanagerregistrydata.entries == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        aobj = imageuploadmanagerregistrydata.entries;
        j = aobj.length;
        int i = 0;
_L4:
        com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData.Entry entry;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        entry = aobj[i];
        entries.put(entry.identifier, entry);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception;
        invalidprotocolbuffernanoexception;
        try
        {
            WLog.e(TAG, "Could not parse registry data from KeyValueStore", invalidprotocolbuffernanoexception);
            return;
        }
        catch (Exception exception)
        {
            WLog.e(TAG, "Could not load registry data from KeyValueStore", exception);
        }
        return;
    }

    private void persistToStore()
    {
        com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData imageuploadmanagerregistrydata = new com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData();
        imageuploadmanagerregistrydata.entries = (com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData.Entry[])Iterables.toArray(entries.values(), com/google/wallet/proto/NanoWalletClient$ImageUploadManagerRegistryData$Entry);
        byte abyte0[] = MessageNano.toByteArray(imageuploadmanagerregistrydata);
        keyValueStore.store("imageupload_registry", abyte0);
    }

    private void storeInt(int i)
    {
        byte abyte0[] = ByteBuffer.allocate(4).putInt(i).array();
        keyValueStore.store("imageupload_id_counter", abyte0);
    }

    public final void add(String s, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        maybeLoadFromStore();
        com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData.Entry entry = new com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData.Entry();
        entry.identifier = s;
        entry.wobInstanceId = s1;
        entry.sessionMaterial = s2;
        entry.timestamp = Long.valueOf((new Date()).getTime());
        entries.put(s, entry);
        persistToStore();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    final void clearEntryWithId(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = entries.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData.Entry entry = (com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData.Entry)iterator.next();
            if (entry.wobInstanceId.equals(s))
            {
                WLog.ifmt(TAG, "Clearing dereferenced entry, identifier=%s", new Object[] {
                    entry.identifier
                });
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_78;
        s;
        throw s;
        persistToStore();
        this;
        JVM INSTR monitorexit ;
    }

    public final boolean clearOldAndDereferencedEntries(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        maybeLoadFromStore();
        l = (new Date()).getTime();
        boolean flag = false;
        Iterator iterator = entries.values().iterator();
_L3:
        com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData.Entry entry;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_166;
        }
        entry = (com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData.Entry)iterator.next();
        if (entry.timestamp != null && !isOld(entry.timestamp.longValue(), l)) goto _L2; else goto _L1
_L1:
        WLog.ifmt(TAG, "Clearing old entry, identifier=%s", new Object[] {
            entry.identifier
        });
        iterator.remove();
        flag = true;
          goto _L3
_L2:
        if (wobinstance == null) goto _L3; else goto _L4
_L4:
        if (!entry.wobInstanceId.equals(wobinstance.id) || findReference(entry.identifier, wobinstance)) goto _L3; else goto _L5
_L5:
        WLog.ifmt(TAG, "Clearing dereferenced entry, identifier=%s", new Object[] {
            entry.identifier
        });
        iterator.remove();
        flag = true;
          goto _L3
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        persistToStore();
        this;
        JVM INSTR monitorexit ;
        return flag;
        wobinstance;
        throw wobinstance;
    }

    public final Map getEntries()
    {
        this;
        JVM INSTR monitorenter ;
        Map map;
        maybeLoadFromStore();
        map = Collections.unmodifiableMap(entries);
        this;
        JVM INSTR monitorexit ;
        return map;
        Exception exception;
        exception;
        throw exception;
    }

    public final Set getIdentifiers()
    {
        return getEntries().keySet();
    }

    public final int getNextCounterInt()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        i = loadInt();
        storeInt(i + 1);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData.Entry remove(String s)
    {
        this;
        JVM INSTR monitorenter ;
        maybeLoadFromStore();
        s = (com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData.Entry)entries.remove(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        persistToStore();
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    static 
    {
        TAG = ImageUploadManager.TAG;
        MAX_AGE_MILLIS = TimeUnit.DAYS.toMillis(1L);
    }
}

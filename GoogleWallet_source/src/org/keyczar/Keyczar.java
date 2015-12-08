// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.keyczar.enums.KeyPurpose;
import org.keyczar.enums.KeyStatus;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.i18n.Messages;
import org.keyczar.interfaces.EncryptedReader;
import org.keyczar.interfaces.KeyType;
import org.keyczar.interfaces.KeyczarReader;
import org.keyczar.util.Util;

// Referenced classes of package org.keyczar:
//            KeyMetadata, KeyVersion, KeyczarKey

public abstract class Keyczar
{
    final class KeyHash
    {

        private byte data[];
        final Keyczar this$0;

        public final boolean equals(Object obj)
        {
            return (obj instanceof KeyHash) && obj.hashCode() == hashCode();
        }

        public final int hashCode()
        {
            return Util.toInt(data);
        }

        private KeyHash(byte abyte0[])
        {
            this$0 = Keyczar.this;
            super();
            if (abyte0.length != 4)
            {
                throw new IllegalArgumentException();
            } else
            {
                data = abyte0;
                return;
            }
        }

    }


    public static final byte FORMAT_BYTES[] = {
        0
    };
    private static final Logger LOG = Logger.getLogger(org/keyczar/Keyczar);
    final HashMap hashMap = new HashMap();
    final KeyMetadata kmd;
    KeyVersion primaryVersion;
    final HashMap versionMap = new HashMap();

    public Keyczar(KeyczarReader keyczarreader)
        throws KeyczarException
    {
        kmd = KeyMetadata.read(keyczarreader.getMetadata());
        if (!isAcceptablePurpose(kmd.getPurpose()))
        {
            throw new KeyczarException(Messages.getString("Keyczar.UnacceptablePurpose", new Object[] {
                kmd.getPurpose()
            }));
        }
        if (kmd.isEncrypted() && !(keyczarreader instanceof EncryptedReader))
        {
            throw new KeyczarException(Messages.getString("Keyczar.NeedEncryptedReader", new Object[0]));
        }
        KeyVersion keyversion;
        Object obj;
        for (Iterator iterator = kmd.getVersions().iterator(); iterator.hasNext(); versionMap.put(keyversion, obj))
        {
            keyversion = (KeyVersion)iterator.next();
            if (keyversion.getStatus() == KeyStatus.PRIMARY)
            {
                if (primaryVersion != null)
                {
                    throw new KeyczarException(Messages.getString("Keyczar.SinglePrimary", new Object[0]));
                }
                primaryVersion = keyversion;
            }
            obj = keyczarreader.getKey(keyversion.getVersionNumber());
            obj = kmd.getType().getBuilder().read(((String) (obj)));
            LOG.debug(Messages.getString("Keyczar.ReadVersion", new Object[] {
                keyversion
            }));
            hashMap.put(new KeyHash(((KeyczarKey) (obj)).hash()), obj);
        }

    }

    final KeyczarKey getKey(byte abyte0[])
    {
        return (KeyczarKey)hashMap.get(new KeyHash(abyte0));
    }

    final KeyczarKey getPrimaryKey()
    {
        if (primaryVersion == null)
        {
            return null;
        } else
        {
            return (KeyczarKey)versionMap.get(primaryVersion);
        }
    }

    abstract boolean isAcceptablePurpose(KeyPurpose keypurpose);

    public String toString()
    {
        return kmd.toString();
    }

}

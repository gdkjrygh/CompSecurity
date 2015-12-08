// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import java.util.ArrayList;
import java.util.List;
import org.keyczar.enums.KeyPurpose;
import org.keyczar.enums.KeyStatus;
import org.keyczar.interfaces.KeyczarReader;

// Referenced classes of package org.keyczar:
//            KeyMetadata, DefaultKeyType, KeyVersion, KeyczarKey, 
//            AesKey

public final class ImportedKeyReader
    implements KeyczarReader
{

    private final List keys = new ArrayList();
    private final KeyMetadata metadata;

    ImportedKeyReader(AesKey aeskey)
    {
        metadata = new KeyMetadata("Imported AES", KeyPurpose.DECRYPT_AND_ENCRYPT, DefaultKeyType.AES);
        KeyVersion keyversion = new KeyVersion(0, KeyStatus.PRIMARY, false);
        metadata.addVersion(keyversion);
        keys.add(aeskey);
    }

    public final String getKey(int i)
    {
        return ((KeyczarKey)keys.get(i)).toString();
    }

    public final String getMetadata()
    {
        return metadata.toString();
    }
}

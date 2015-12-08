// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.keyczar.enums.KeyPurpose;
import org.keyczar.interfaces.KeyType;
import org.keyczar.util.Util;

// Referenced classes of package org.keyczar:
//            DefaultKeyType, KeyVersion

public class KeyMetadata
{

    boolean encrypted;
    String name;
    KeyPurpose purpose;
    KeyType type;
    protected Map versionMap;
    List versions;

    public KeyMetadata()
    {
        name = "";
        purpose = KeyPurpose.TEST;
        type = DefaultKeyType.TEST;
        versions = new ArrayList();
        encrypted = false;
        versionMap = new HashMap();
    }

    public KeyMetadata(String s, KeyPurpose keypurpose, KeyType keytype)
    {
        name = "";
        purpose = KeyPurpose.TEST;
        type = DefaultKeyType.TEST;
        versions = new ArrayList();
        encrypted = false;
        versionMap = new HashMap();
        name = s;
        purpose = keypurpose;
        type = keytype;
    }

    public static KeyMetadata read(String s)
    {
        s = (KeyMetadata)Util.gson().fromJson(s, org/keyczar/KeyMetadata);
        KeyVersion keyversion;
        for (Iterator iterator = s.getVersions().iterator(); iterator.hasNext(); ((KeyMetadata) (s)).versionMap.put(Integer.valueOf(keyversion.getVersionNumber()), keyversion))
        {
            keyversion = (KeyVersion)iterator.next();
        }

        return s;
    }

    public final boolean addVersion(KeyVersion keyversion)
    {
        int i = keyversion.getVersionNumber();
        if (!versionMap.containsKey(Integer.valueOf(i)))
        {
            versionMap.put(Integer.valueOf(i), keyversion);
            versions.add(keyversion);
            return true;
        } else
        {
            return false;
        }
    }

    public final KeyPurpose getPurpose()
    {
        return purpose;
    }

    public final KeyType getType()
    {
        return type;
    }

    public final List getVersions()
    {
        return versions;
    }

    public final boolean isEncrypted()
    {
        return encrypted;
    }

    public String toString()
    {
        return Util.gson().toJson(this);
    }
}

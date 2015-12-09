// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.entitymanager;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public final class EntityId
{

    private final String localId;
    private final String originatorId;

    public EntityId(com.google.wallet.proto.NanoWalletEntities.EntityIdentifier entityidentifier)
    {
        localId = entityidentifier.localId;
        originatorId = entityidentifier.originatorId;
    }

    public EntityId(String s, String s1)
    {
        localId = s;
        originatorId = s1;
    }

    private static String decode(String s)
    {
        try
        {
            s = URLDecoder.decode(s, "utf-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    private static String encode(String s)
    {
        try
        {
            s = URLEncoder.encode(s, "utf-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    private static int findDelimiter(String s)
    {
        return s.indexOf(':');
    }

    public static EntityId fromKeyString(String s)
    {
        int i = findDelimiter(s);
        String s1;
        com.google.wallet.proto.NanoWalletEntities.EntityIdentifier entityidentifier;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "keyString (%s) does not have a delimiter", new Object[] {
            s
        });
        s1 = s.substring(0, i);
        s = s.substring(i + 1, s.length());
        entityidentifier = new com.google.wallet.proto.NanoWalletEntities.EntityIdentifier();
        entityidentifier.localId = decode(s1);
        entityidentifier.originatorId = decode(s);
        return new EntityId(entityidentifier);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof EntityId))
            {
                return false;
            }
            obj = (EntityId)obj;
            if (!Objects.equal(localId, ((EntityId) (obj)).localId) || !Objects.equal(originatorId, ((EntityId) (obj)).originatorId))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Objects.hashCode(new Object[] {
            localId, originatorId
        });
    }

    public final com.google.wallet.proto.NanoWalletEntities.EntityIdentifier toEntityIdentifier()
    {
        com.google.wallet.proto.NanoWalletEntities.EntityIdentifier entityidentifier = new com.google.wallet.proto.NanoWalletEntities.EntityIdentifier();
        entityidentifier.localId = localId;
        entityidentifier.originatorId = originatorId;
        return entityidentifier;
    }

    public final String toKeyString()
    {
        String s = encode(localId);
        String s1 = encode(originatorId);
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(":").append(s1).toString();
    }

    public final String toString()
    {
        return toKeyString();
    }
}

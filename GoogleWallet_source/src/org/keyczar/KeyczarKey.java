// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import com.google.gson.Gson;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.Stream;
import org.keyczar.util.Util;

public abstract class KeyczarKey
{

    final int size;

    protected KeyczarKey(int i)
    {
        size = i;
    }

    final void copyHeader(ByteBuffer bytebuffer)
    {
        bytebuffer.put((byte)0);
        bytebuffer.put(hash());
    }

    public boolean equals(Object obj)
    {
        boolean flag;
        try
        {
            flag = Arrays.equals(((KeyczarKey)obj).hash(), hash());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return flag;
    }

    protected abstract Stream getStream()
        throws KeyczarException;

    protected abstract byte[] hash();

    public int hashCode()
    {
        return Util.toInt(hash());
    }

    public String toString()
    {
        return Util.gson().toJson(this);
    }
}

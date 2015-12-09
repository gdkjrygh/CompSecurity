// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import com.google.gson.Gson;
import org.keyczar.enums.KeyStatus;
import org.keyczar.util.Util;

public final class KeyVersion
{

    private boolean exportable;
    private KeyStatus status;
    private int versionNumber;

    private KeyVersion()
    {
        exportable = false;
        status = KeyStatus.ACTIVE;
        versionNumber = 0;
    }

    public KeyVersion(int i, KeyStatus keystatus, boolean flag)
    {
        exportable = false;
        status = KeyStatus.ACTIVE;
        versionNumber = 0;
        versionNumber = i;
        status = keystatus;
        exportable = flag;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof KeyVersion)
        {
            if (getVersionNumber() == ((KeyVersion) (obj = (KeyVersion)obj)).getVersionNumber())
            {
                return true;
            }
        }
        return false;
    }

    public final KeyStatus getStatus()
    {
        return status;
    }

    public final int getVersionNumber()
    {
        return versionNumber;
    }

    public final int hashCode()
    {
        return versionNumber;
    }

    public final String toString()
    {
        return Util.gson().toJson(this);
    }
}

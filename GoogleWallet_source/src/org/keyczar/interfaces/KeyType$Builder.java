// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.interfaces;

import org.keyczar.KeyczarKey;
import org.keyczar.exceptions.KeyczarException;

// Referenced classes of package org.keyczar.interfaces:
//            KeyType

public static interface 
{

    public abstract KeyczarKey read(String s)
        throws KeyczarException;
}

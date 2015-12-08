// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.exceptions;

import org.keyczar.i18n.Messages;

// Referenced classes of package org.keyczar.exceptions:
//            KeyNotFoundException

public class NoPrimaryKeyException extends KeyNotFoundException
{

    public NoPrimaryKeyException()
    {
        super(Messages.getString("NoPrimaryKeyFound", new Object[0]));
    }
}

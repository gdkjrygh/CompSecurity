// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.io.Serializable;

// Referenced classes of package org.apache.commons.lang3:
//            ObjectUtils

public static class 
    implements Serializable
{

    private static final long serialVersionUID = 0x626e04ed40667ec5L;

    private Object readResolve()
    {
        return ObjectUtils.NULL;
    }

    ()
    {
    }
}

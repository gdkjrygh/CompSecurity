// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;

import fs.org.simpleframework.xml.core.PersistenceException;

public class TransformException extends PersistenceException
{

    public transient TransformException(String s, Object aobj[])
    {
        super(String.format(s, aobj), new Object[0]);
    }
}

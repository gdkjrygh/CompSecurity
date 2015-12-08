// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.exceptions;


// Referenced classes of package com.worklight.jsonstore.exceptions:
//            JSONStoreException

public class JSONStoreDatabaseClosedException extends JSONStoreException
{

    private static final long serialVersionUID = 0xd1c7c8d23a36c448L;

    public JSONStoreDatabaseClosedException()
    {
        super("Could not complete action since the database is not open");
    }

    public JSONStoreDatabaseClosedException(String s)
    {
        super(s);
    }
}

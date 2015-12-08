// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller;


// Referenced classes of package com.soundcloud.propeller:
//            PropellerWriteException

public abstract class WriteResult
{

    private PropellerWriteException failure;

    public WriteResult()
    {
    }

    public WriteResult fail(PropellerWriteException propellerwriteexception)
    {
        failure = propellerwriteexception;
        return this;
    }

    public PropellerWriteException getFailure()
    {
        return failure;
    }

    public boolean success()
    {
        return failure == null;
    }
}

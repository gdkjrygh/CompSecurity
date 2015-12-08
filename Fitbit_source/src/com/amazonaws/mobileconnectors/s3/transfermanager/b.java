// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.mobileconnectors.s3.transfermanager;

import com.amazonaws.mobileconnectors.s3.transfermanager.exception.PauseException;
import com.amazonaws.services.s3.model.bi;
import java.io.IOException;

// Referenced classes of package com.amazonaws.mobileconnectors.s3.transfermanager:
//            Transfer, i

public interface b
    extends Transfer
{

    public abstract bi a();

    public abstract String b();

    public abstract String c();

    public abstract void d()
        throws IOException;

    public abstract i e()
        throws PauseException;
}

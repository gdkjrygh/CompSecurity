// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import java.nio.ByteBuffer;
import org.keyczar.interfaces.VerifyingStream;

// Referenced classes of package org.keyczar:
//            RsaPrivateKey

final class this._cls1
    implements VerifyingStream
{

    final this._cls1 this$1;

    public final int digestSize()
    {
        return 0;
    }

    public final void initVerify()
    {
    }

    public final void updateVerify(ByteBuffer bytebuffer)
    {
    }

    public final boolean verify(ByteBuffer bytebuffer)
    {
        return true;
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}

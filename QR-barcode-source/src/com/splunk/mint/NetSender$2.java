// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package com.splunk.mint:
//            NetSender

class vel extends GZIPOutputStream
{

    final NetSender this$0;

    am(OutputStream outputstream)
    {
        this$0 = NetSender.this;
        super(outputstream);
        def.setLevel(9);
    }
}

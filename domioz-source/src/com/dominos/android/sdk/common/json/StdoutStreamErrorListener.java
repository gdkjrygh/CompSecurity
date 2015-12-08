// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.json;

import java.io.PrintStream;

// Referenced classes of package com.dominos.android.sdk.common.json:
//            BufferErrorListener

public class StdoutStreamErrorListener extends BufferErrorListener
{

    public StdoutStreamErrorListener()
    {
    }

    public void end()
    {
        System.out.print(buffer.toString());
    }
}

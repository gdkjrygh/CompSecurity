// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.util.Queue;

// Referenced classes of package com.google.common.io:
//            LineBuffer, LineReader

class nit> extends LineBuffer
{

    final LineReader this$0;

    protected void handleLine(String s, String s1)
    {
        LineReader.access$000(LineReader.this).add(s);
    }

    ()
    {
        this$0 = LineReader.this;
        super();
    }
}

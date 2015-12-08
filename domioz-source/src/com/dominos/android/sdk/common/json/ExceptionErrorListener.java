// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.json;


// Referenced classes of package com.dominos.android.sdk.common.json:
//            BufferErrorListener

public class ExceptionErrorListener extends BufferErrorListener
{

    public ExceptionErrorListener()
    {
    }

    public void error(String s, int i, int j)
    {
        super.error(s, i, j);
        throw new IllegalArgumentException(buffer.toString());
    }
}

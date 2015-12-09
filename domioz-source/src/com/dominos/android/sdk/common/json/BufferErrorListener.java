// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.json;


// Referenced classes of package com.dominos.android.sdk.common.json:
//            JSONErrorListener

public class BufferErrorListener
    implements JSONErrorListener
{

    protected StringBuffer buffer;
    private String input;

    public BufferErrorListener()
    {
        this(new StringBuffer());
    }

    public BufferErrorListener(StringBuffer stringbuffer)
    {
        buffer = stringbuffer;
    }

    private void indent(int i, StringBuffer stringbuffer)
    {
        for (int j = 0; j < i; j++)
        {
            stringbuffer.append(' ');
        }

    }

    public void end()
    {
    }

    public void error(String s, int i, int j)
    {
        buffer.append("expected ");
        buffer.append(s);
        buffer.append(" at line ");
        buffer.append(i);
        buffer.append(" column ");
        buffer.append(j);
        buffer.append("\n");
        buffer.append(input);
        buffer.append("\n");
        indent(j - 1, buffer);
        buffer.append("^");
    }

    public void start(String s)
    {
        input = s;
        buffer.setLength(0);
    }
}

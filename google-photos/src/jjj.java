// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public class jjj extends IOException
{

    private static final long serialVersionUID = 0x9f95917c52ce6e25L;

    public jjj()
    {
    }

    public jjj(int i, int j)
    {
        String s = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
        super((new StringBuilder(String.valueOf(s).length() + 31)).append(s).append(i).append(" limit ").append(j).append(").").toString());
    }

    public jjj(IOException ioexception)
    {
        super(ioexception);
    }

    public jjj(String s)
    {
        super(s);
    }
}

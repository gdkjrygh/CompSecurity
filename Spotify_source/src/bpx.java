// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

public final class bpx
{

    public static final bqs a = new bqs();

    static 
    {
        try
        {
            Charset.forName("UTF-8");
        }
        catch (IllegalCharsetNameException illegalcharsetnameexception) { }
        catch (UnsupportedCharsetException unsupportedcharsetexception) { }
    }
}

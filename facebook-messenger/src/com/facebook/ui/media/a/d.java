// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.a;


public final class d extends Enum
{

    private static final d $VALUES[];
    public static final d DECODE_ERROR;
    public static final d FORBIDDEN;
    public static final d IO_EXCEPTION;
    public static final d NOT_FOUND;
    public static final d OTHER;
    public static final d SUCCESS;
    public static final d UNSUPPORTED_URI;

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/ui/media/a/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        SUCCESS = new d("SUCCESS", 0);
        IO_EXCEPTION = new d("IO_EXCEPTION", 1);
        DECODE_ERROR = new d("DECODE_ERROR", 2);
        NOT_FOUND = new d("NOT_FOUND", 3);
        UNSUPPORTED_URI = new d("UNSUPPORTED_URI", 4);
        FORBIDDEN = new d("FORBIDDEN", 5);
        OTHER = new d("OTHER", 6);
        $VALUES = (new d[] {
            SUCCESS, IO_EXCEPTION, DECODE_ERROR, NOT_FOUND, UNSUPPORTED_URI, FORBIDDEN, OTHER
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.scan;


public abstract class KikCode
{
    public static final class Colour
    {

        public static final int DEFAULT = 0;

        public Colour()
        {
        }
    }

    public static final class Types
    {

        public static final int GROUP = 3;
        public static final int REMOTE = 2;
        public static final int USERNAME = 1;

        public Types()
        {
        }
    }


    protected static boolean _isLoaded;
    private int _colour;
    private int _type;

    public KikCode(int i, int j)
    {
        _type = i;
        _colour = j;
    }

    public static KikCode parse(byte abyte0[])
    {
        if (!_isLoaded)
        {
            return null;
        } else
        {
            return parseInternal(abyte0);
        }
    }

    protected static native KikCode parseInternal(byte abyte0[]);

    public abstract byte[] encode();

    public boolean equals(Object obj)
    {
        if (obj instanceof KikCode)
        {
            if (_colour == ((KikCode) (obj = (KikCode)obj))._colour && _type == ((KikCode) (obj))._type)
            {
                return true;
            }
        }
        return false;
    }

    public int getColour()
    {
        return _colour;
    }

    public int getType()
    {
        return _type;
    }

    public String toString()
    {
        return (new StringBuilder("type=")).append(_type).append(", colour=").append(_colour).toString();
    }

    static 
    {
        int i;
        i = 0;
        _isLoaded = false;
_L2:
        if (i >= 3)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        System.loadLibrary((new String[] {
            "kikcode_encode", "libkikcode_encode", "libkikcode_encode.so"
        })[i]);
        _isLoaded = true;
        if (_isLoaded)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        System.load((new StringBuilder()).append(System.getProperty("user.dir")).append("/build/libkikcode_encode.so").toString());
        _isLoaded = true;
        return;
        UnsatisfiedLinkError unsatisfiedlinkerror;
        unsatisfiedlinkerror;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        unsatisfiedlinkerror;
    }
}

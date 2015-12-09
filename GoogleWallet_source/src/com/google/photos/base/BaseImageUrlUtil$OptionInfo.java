// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.photos.base;


// Referenced classes of package com.google.photos.base:
//            BaseImageUrlUtil

static final class isBool
{

    public boolean isBool;
    public String key;

    public final String toString()
    {
        String s = key;
        boolean flag = isBool;
        return (new StringBuilder(String.valueOf(s).length() + 9)).append("{").append(s).append(", ").append(flag).append("}").toString();
    }

    public (String s, boolean flag)
    {
        key = s;
        isBool = flag;
    }
}

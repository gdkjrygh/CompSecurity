// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens.util;


// Referenced classes of package com.google.android.libraries.wordlens.util:
//            ScriptEncoding

final class i
{

    static final int a[];

    static 
    {
        a = new int[ScriptEncoding.values().length];
        try
        {
            a[ScriptEncoding.CYRILLIC.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[ScriptEncoding.UTF16.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ScriptEncoding.LATIN_9.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

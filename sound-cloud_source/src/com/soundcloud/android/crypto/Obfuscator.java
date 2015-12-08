// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crypto;

import android.util.Base64;
import com.soundcloud.java.strings.Charsets;

public class Obfuscator
{

    private static final String RANDOM = "VkIjYfvMq2U4v0IdSD1vtjuncSVbXnhZtOloUMiR773TMhx1yeYhN8YLnkrx";
    private static final String TAG = com/soundcloud/android/crypto/Obfuscator.getSimpleName();

    public Obfuscator()
    {
    }

    private String xor(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < s.length() && i < s1.length(); i++)
        {
            stringbuilder.append((char)(s.charAt(i) ^ s1.charAt(i)));
        }

        return stringbuilder.toString();
    }

    public boolean deobfuscateBoolean(String s)
    {
        return Boolean.parseBoolean(deobfuscateString(s));
    }

    public String deobfuscateString(String s)
    {
        String s1 = xor(new String(Base64.decode(s.getBytes(Charsets.UTF_8), 0)), "VkIjYfvMq2U4v0IdSD1vtjuncSVbXnhZtOloUMiR773TMhx1yeYhN8YLnkrx");
        (new StringBuilder()).append(s).append(" -> ").append(s1);
        return s1;
    }

    public String obfuscate(String s)
    {
        String s1 = Base64.encodeToString(xor(s, "VkIjYfvMq2U4v0IdSD1vtjuncSVbXnhZtOloUMiR773TMhx1yeYhN8YLnkrx").getBytes(Charsets.UTF_8), 0).trim();
        (new StringBuilder()).append(s).append(" -> ").append(s1);
        return s1;
    }

    public String obfuscate(boolean flag)
    {
        return obfuscate(String.valueOf(flag));
    }

}

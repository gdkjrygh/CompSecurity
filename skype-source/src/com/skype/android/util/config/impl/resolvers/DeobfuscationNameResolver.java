// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.config.impl.resolvers;

import android.util.Base64;
import com.skype.android.util.Log;
import com.skype.android.util.config.impl.ConfigParseException;
import com.skype.android.util.config.impl.NameResolver;
import java.io.UnsupportedEncodingException;

public class DeobfuscationNameResolver
    implements NameResolver
{

    private static final String DEOBFUSCATION_TABLE[] = {
        obfuscate("prop/ro.build.host"), obfuscate("prop/ro.build.id"), obfuscate("prop/ro.build.version.codename"), obfuscate("prop/ro.build.version.incremental"), obfuscate("prop/ro.build.version.release"), obfuscate("prop/ro.build.version.sdk"), obfuscate("prop/ro.product.board"), obfuscate("prop/ro.product.model"), obfuscate("prop/ro.product.name"), obfuscate("prop/ro.product.manufacturer"), 
        obfuscate("prop/ro.product.device"), obfuscate("prop/ro.product.board"), obfuscate("prop/ro.hardware"), obfuscate("prop/ro.chipname"), obfuscate("prop/ro.revision")
    };
    private static final String PREFIX = "x/";
    private NameResolver resolvers[];

    public DeobfuscationNameResolver()
    {
    }

    private static String deobfuscate(String s)
    {
        try
        {
            s = new String(Base64.decode(s, 3), "US-ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return s;
    }

    private static String obfuscate(String s)
    {
        try
        {
            s = new String(Base64.encode(s.getBytes(), 3), "US-ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return s;
    }

    public String getPrefix()
    {
        return "x/";
    }

    public String getValue(String s)
        throws ConfigParseException
    {
        int i;
        try
        {
            i = Integer.valueOf(s).intValue();
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new ConfigParseException((new StringBuilder("Name 'x/")).append(s).append("' does not denote a number").toString());
        }
        if (i < 0 || i >= DEOBFUSCATION_TABLE.length)
        {
            if (Log.isLoggable("Utils", 6))
            {
                Log.e("Utils", (new StringBuilder("Name 'x/")).append(s).append("' does not denote a number withing a range [0..").append(DEOBFUSCATION_TABLE.length - 1).append("]").toString());
            }
            return null;
        }
        String s1 = deobfuscate(DEOBFUSCATION_TABLE[i]);
        NameResolver anameresolver[] = resolvers;
        int k = anameresolver.length;
        for (int j = 0; j < k; j++)
        {
            NameResolver nameresolver = anameresolver[j];
            if (s1.startsWith(nameresolver.getPrefix()))
            {
                return nameresolver.getValue(s1.substring(nameresolver.getPrefix().length()));
            }
        }

        throw new ConfigParseException((new StringBuilder("Could not resolve name '")).append(s1).append("' deobfuscated from '").append(s).append("'").toString());
    }

    public void setResolvers(NameResolver anameresolver[])
    {
        resolvers = anameresolver;
    }

}

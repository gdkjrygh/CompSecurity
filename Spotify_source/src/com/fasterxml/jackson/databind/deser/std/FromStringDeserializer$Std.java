// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            FromStringDeserializer

public class _kind extends FromStringDeserializer
{

    private static final long serialVersionUID = 1L;
    protected final int _kind;

    protected Object _deserialize(String s, DeserializationContext deserializationcontext)
    {
        switch (_kind)
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
            return new File(s);

        case 2: // '\002'
            return new URL(s);

        case 3: // '\003'
            return URI.create(s);

        case 4: // '\004'
            try
            {
                s = deserializationcontext.findClass(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw deserializationcontext.instantiationException(_valueClass, ClassUtil.getRootCause(s));
            }
            return s;

        case 5: // '\005'
            return deserializationcontext.getTypeFactory().constructFromCanonical(s);

        case 6: // '\006'
            return Currency.getInstance(s);

        case 7: // '\007'
            return Pattern.compile(s);

        case 8: // '\b'
            int i = s.indexOf('_');
            if (i < 0)
            {
                return new Locale(s);
            }
            deserializationcontext = s.substring(0, i);
            s = s.substring(i + 1);
            i = s.indexOf('_');
            if (i < 0)
            {
                return new Locale(deserializationcontext, s);
            } else
            {
                return new Locale(deserializationcontext, s.substring(0, i), s.substring(i + 1));
            }

        case 9: // '\t'
            return Charset.forName(s);

        case 10: // '\n'
            return TimeZone.getTimeZone(s);

        case 11: // '\013'
            return InetAddress.getByName(s);

        case 12: // '\f'
            break;
        }
        if (s.startsWith("["))
        {
            int l = s.lastIndexOf(']');
            if (l == -1)
            {
                throw new InvalidFormatException("Bracketed IPv6 address must contain closing bracket", s, java/net/InetSocketAddress);
            }
            int j = s.indexOf(':', l);
            if (j >= 0)
            {
                j = Integer.parseInt(s.substring(j + 1));
            } else
            {
                j = 0;
            }
            return new InetSocketAddress(s.substring(0, l + 1), j);
        }
        int k = s.indexOf(':');
        if (k >= 0 && s.indexOf(':', k + 1) < 0)
        {
            int i1 = Integer.parseInt(s.substring(k + 1));
            return new InetSocketAddress(s.substring(0, k), i1);
        } else
        {
            return new InetSocketAddress(s, 0);
        }
    }

    protected Object _deserializeFromEmptyString()
    {
        if (_kind == 3)
        {
            return URI.create("");
        } else
        {
            return super._deserializeFromEmptyString();
        }
    }

    protected I(Class class1, int i)
    {
        super(class1);
        _kind = i;
    }
}

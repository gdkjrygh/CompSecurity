// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.api.client.util:
//            Preconditions, Base64

public final class PemReader
{
    public static final class Section
    {

        private final byte base64decodedBytes[];
        private final String title;

        public byte[] getBase64DecodedBytes()
        {
            return base64decodedBytes;
        }

        public String getTitle()
        {
            return title;
        }

        Section(String s, byte abyte0[])
        {
            title = (String)Preconditions.checkNotNull(s);
            base64decodedBytes = (byte[])Preconditions.checkNotNull(abyte0);
        }
    }


    private static final Pattern BEGIN_PATTERN = Pattern.compile("-----BEGIN ([A-Z ]+)-----");
    private static final Pattern END_PATTERN = Pattern.compile("-----END ([A-Z ]+)-----");
    private BufferedReader reader;

    public PemReader(Reader reader1)
    {
        reader = new BufferedReader(reader1);
    }

    public static Section readFirstSectionAndClose(Reader reader1)
        throws IOException
    {
        return readFirstSectionAndClose(reader1, null);
    }

    public static Section readFirstSectionAndClose(Reader reader1, String s)
        throws IOException
    {
        reader1 = new PemReader(reader1);
        s = reader1.readNextSection(s);
        reader1.close();
        return s;
        s;
        reader1.close();
        throw s;
    }

    public void close()
        throws IOException
    {
        reader.close();
    }

    public Section readNextSection()
        throws IOException
    {
        return readNextSection(null);
    }

    public Section readNextSection(String s)
        throws IOException
    {
        Object obj = null;
        StringBuilder stringbuilder = null;
        do
        {
            Object obj1 = reader.readLine();
            if (obj1 == null)
            {
                boolean flag;
                if (obj == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "missing end tag (%s)", new Object[] {
                    obj
                });
                return null;
            }
            if (stringbuilder == null)
            {
                obj1 = BEGIN_PATTERN.matcher(((CharSequence) (obj1)));
                if (((Matcher) (obj1)).matches())
                {
                    obj1 = ((Matcher) (obj1)).group(1);
                    if (s == null || ((String) (obj1)).equals(s))
                    {
                        stringbuilder = new StringBuilder();
                        obj = obj1;
                    }
                }
            } else
            {
                Matcher matcher = END_PATTERN.matcher(((CharSequence) (obj1)));
                if (matcher.matches())
                {
                    s = matcher.group(1);
                    Preconditions.checkArgument(s.equals(obj), "end tag (%s) doesn't match begin tag (%s)", new Object[] {
                        s, obj
                    });
                    return new Section(((String) (obj)), Base64.decodeBase64(stringbuilder.toString()));
                }
                stringbuilder.append(((String) (obj1)));
            }
        } while (true);
    }

}

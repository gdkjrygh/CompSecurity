// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.msnp;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Logger;

// Referenced classes of package com.skype.msnp:
//            MsnpParseException, MsnpMessageType, MsnpLayer, MsnpHeader, 
//            MsnpIdentity

public class MsnpMessage
{

    private static final Logger a = Logger.getLogger("MsnpMessage");
    private MsnpMessageType b;
    private Map c;
    private Map d;
    private String e;

    private MsnpMessage()
    {
        c = new HashMap();
        d = new HashMap();
    }

    public static MsnpMessage a(String s)
        throws MsnpParseException
    {
        MsnpMessage msnpmessage;
        if (s == null)
        {
            throw new MsnpParseException(new IllegalArgumentException("null content"));
        }
        msnpmessage = new MsnpMessage();
        s = new BufferedReader(new StringReader(s));
        msnpmessage.a(((BufferedReader) (s)));
        msnpmessage.b(s);
        if (msnpmessage.b != MsnpMessageType.e)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        msnpmessage.a(new MsnpLayer[] {
            MsnpLayer.a, MsnpLayer.b, MsnpLayer.c
        }, ((BufferedReader) (s)));
        msnpmessage.c(s);
        s.close();
        return msnpmessage;
        throw new MsnpParseException(String.format("Cant parse type %s yet", new Object[] {
            msnpmessage.b
        }));
        Exception exception;
        exception;
        try
        {
            s.close();
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        throw new MsnpParseException(s);
    }

    private void a(BufferedReader bufferedreader)
        throws IOException
    {
        String s = bufferedreader.readLine().split(" ")[0];
        bufferedreader = s;
        if (!TextUtils.isEmpty(s))
        {
            bufferedreader = s;
            if (s.length() > 3)
            {
                bufferedreader = new StringBuilder();
                byte abyte0[] = s.getBytes("UTF-8");
                int j = abyte0.length;
                for (int i = 0; i < j; i++)
                {
                    bufferedreader.append(String.format(" 0x%02x ", new Object[] {
                        Byte.valueOf(abyte0[i])
                    }));
                }

                a.info((new StringBuilder("Unknown Payload Type: ")).append(s).append('[').append(bufferedreader.toString()).append(']').toString());
                bufferedreader = s.substring(s.length() - 3);
            }
        }
        b = MsnpMessageType.a(bufferedreader);
    }

    private void a(MsnpLayer amsnplayer[], BufferedReader bufferedreader)
        throws IOException
    {
label0:
        for (int i = 0; i < 3; i++)
        {
            Object obj = amsnplayer[i];
            HashMap hashmap = new HashMap();
            d.put(obj, hashmap);
            obj = bufferedreader.readLine();
            do
            {
                if (obj == null || ((String) (obj)).trim().equals(""))
                {
                    continue label0;
                }
                int j = ((String) (obj)).indexOf(":");
                if (j != -1)
                {
                    String s = ((String) (obj)).substring(0, j);
                    obj = ((String) (obj)).substring(j + 1);
                    hashmap.put(s.trim(), ((String) (obj)).trim());
                    obj = bufferedreader.readLine();
                }
            } while (true);
        }

    }

    private static Date b(String s)
    {
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        if (s == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = 0;
        i = 0;
_L4:
        Object obj;
        obj = obj2;
        if (i >= 6)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj = (new String[] {
            "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "yyyy-MM-dd'T'HH:mm:ss'Z'", "yyyy-MM-dd", "yyyy-MM-dd HH:mm", "yyyy-MM-dd HH:mmZ", "yyyy-MM-dd HH:mm:ss.SSSZ"
        })[i];
        obj = new SimpleDateFormat(((String) (obj)), Locale.getDefault());
        ((SimpleDateFormat) (obj)).setTimeZone(TimeZone.getTimeZone("GMT"));
        obj = ((SimpleDateFormat) (obj)).parse(s);
        obj1 = obj;
        if (obj == null)
        {
            (new ParseException(s, j)).printStackTrace();
            obj1 = new Date();
        }
_L2:
        return ((Date) (obj1));
        ParseException parseexception;
        parseexception;
        j = parseexception.getErrorOffset();
        i++;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b(BufferedReader bufferedreader)
        throws IOException
    {
        String s = bufferedreader.readLine();
        do
        {
            if (s == null || s.trim().equals(""))
            {
                break;
            }
            int i = s.indexOf(":");
            if (i != -1)
            {
                String s1 = s.substring(0, i);
                s = s.substring(i + 1);
                c.put(s1.trim(), s.trim());
                s = bufferedreader.readLine();
            }
        } while (true);
    }

    private void c(BufferedReader bufferedreader)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder();
        char ac[] = new char[1024];
        do
        {
            int i = bufferedreader.read(ac);
            if (i > 0)
            {
                stringbuilder.append(ac, 0, i);
            } else
            {
                e = stringbuilder.toString();
                return;
            }
        } while (true);
    }

    public final String a()
    {
        return e;
    }

    public final String a(MsnpLayer msnplayer, MsnpHeader msnpheader)
    {
        msnpheader = msnpheader.a();
        msnplayer = (Map)d.get(msnplayer);
        if (msnplayer != null)
        {
            return (String)msnplayer.get(msnpheader);
        } else
        {
            return null;
        }
    }

    public final MsnpIdentity b()
    {
        String s = a(MsnpLayer.a, MsnpHeader.c);
        if (s == null)
        {
            return null;
        } else
        {
            return new MsnpIdentity(s);
        }
    }

    public final Date c()
    {
        return b(a(MsnpLayer.c, MsnpHeader.n));
    }

    public final String d()
    {
        return a(MsnpLayer.c, MsnpHeader.i);
    }

    public final String e()
    {
        return a(MsnpLayer.c, MsnpHeader.j);
    }

    public final boolean f()
    {
        String s = a(MsnpLayer.c, MsnpHeader.o);
        return s == null || "true".equalsIgnoreCase(s);
    }

}

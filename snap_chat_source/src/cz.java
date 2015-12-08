// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.coremedia.iso.boxes.Box;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class cz extends cr
{

    private static String f[] = new String[0];
    private Properties a;
    private Pattern b;
    private StringBuilder c;
    private String d;
    private String e[];

    public cz(Properties properties)
    {
        b = Pattern.compile("(.*)\\((.*?)\\)");
        c = new StringBuilder();
        a = properties;
    }

    public final Box a(String s, byte abyte0[], String s1)
    {
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        Object obj;
        if (!"uuid".equals(s))
        {
            throw new RuntimeException("we have a userType but no uuid box type. Something's wrong");
        }
        obj = a.getProperty((new StringBuilder("uuid[")).append(ct.a(abyte0).toUpperCase()).append("]").toString());
        String s2 = ((String) (obj));
        if (obj == null)
        {
            s2 = a.getProperty((new StringBuilder(String.valueOf(s1))).append("-uuid[").append(ct.a(abyte0).toUpperCase()).append("]").toString());
        }
        obj = s2;
        if (s2 == null)
        {
            obj = a.getProperty("uuid");
        }
_L4:
        Object obj1;
        obj1 = obj;
        if (obj == null)
        {
            obj1 = a.getProperty("default");
        }
        if (obj1 == null)
        {
            throw new RuntimeException((new StringBuilder("No box object found for ")).append(s).toString());
        }
        break; /* Loop/switch isn't completed */
_L2:
        obj1 = a.getProperty(s);
        obj = obj1;
        if (obj1 == null)
        {
            obj = c.append(s1).append('-').append(s).toString();
            c.setLength(0);
            obj = a.getProperty(((String) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
        String as[];
        Object aobj[];
        int i;
        if (!((String) (obj1)).endsWith(")"))
        {
            e = f;
            d = ((String) (obj1));
        } else
        {
            as = b.matcher(((CharSequence) (obj1)));
            if (!as.matches())
            {
                throw new RuntimeException((new StringBuilder("Cannot work with that constructor: ")).append(((String) (obj1))).toString());
            }
            d = as.group(1);
            if (as.group(2).length() == 0)
            {
                e = f;
            } else
            {
                if (as.group(2).length() > 0)
                {
                    as = as.group(2).split(",");
                } else
                {
                    as = new String[0];
                }
                e = as;
            }
        }
        as = Class.forName(d);
        if (e.length <= 0) goto _L6; else goto _L5
_L5:
        obj1 = new Class[e.length];
        aobj = new Object[e.length];
        i = 0;
_L13:
        if (i < e.length)
        {
            break MISSING_BLOCK_LABEL_453;
        }
        s = (Box)as.getConstructor(((Class []) (obj1))).newInstance(aobj);
        return s;
        if (!"userType".equals(e[i])) goto _L8; else goto _L7
_L7:
        aobj[i] = abyte0;
        obj1[i] = [B;
          goto _L9
_L8:
        if (!"type".equals(e[i])) goto _L11; else goto _L10
_L10:
        aobj[i] = s;
        obj1[i] = java/lang/String;
          goto _L9
_L11:
        if ("parent".equals(e[i]))
        {
            aobj[i] = s1;
            obj1[i] = java/lang/String;
        } else
        {
            try
            {
                throw new InternalError((new StringBuilder("No such param: ")).append(e[i]).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException(s);
            }
        }
          goto _L9
_L6:
        s = (Box)as.newInstance();
        return s;
_L9:
        i++;
        if (true) goto _L13; else goto _L12
_L12:
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.coremedia.iso:
//            AbstractBoxParser, Hex

public class PropertyBoxParserImpl extends AbstractBoxParser
{

    static String EMPTY_STRING_ARRAY[] = new String[0];
    StringBuilder buildLookupStrings;
    String clazzName;
    Pattern constuctorPattern;
    Properties mapping;
    String param[];

    public PropertyBoxParserImpl(Properties properties)
    {
        constuctorPattern = Pattern.compile("(.*)\\((.*?)\\)");
        buildLookupStrings = new StringBuilder();
        mapping = properties;
    }

    public transient PropertyBoxParserImpl(String as[])
    {
        InputStream inputstream;
        constuctorPattern = Pattern.compile("(.*)\\((.*?)\\)");
        buildLookupStrings = new StringBuilder();
        inputstream = getClass().getResourceAsStream("/isoparser-default.properties");
        mapping = new Properties();
        Object obj1;
        mapping.load(inputstream);
        obj1 = Thread.currentThread().getContextClassLoader();
        ClassLoader classloader;
        classloader = ((ClassLoader) (obj1));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        classloader = ClassLoader.getSystemClassLoader();
        obj1 = classloader.getResources("isoparser-custom.properties");
_L8:
        if (((Enumeration) (obj1)).hasMoreElements()) goto _L2; else goto _L1
_L1:
        int j = as.length;
        int i = 0;
_L6:
        if (i >= j)
        {
            Object obj;
            IOException ioexception;
            try
            {
                inputstream.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                as.printStackTrace();
            }
            break; /* Loop/switch isn't completed */
        }
          goto _L3
_L2:
        obj = ((URL)((Enumeration) (obj1)).nextElement()).openStream();
        mapping.load(((InputStream) (obj)));
        ((InputStream) (obj)).close();
        continue; /* Loop/switch isn't completed */
_L4:
        throw new RuntimeException(as);
        as;
        try
        {
            ((InputStream) (obj)).close();
            throw as;
        }
        // Misplaced declaration of an exception variable
        catch (String as[]) { }
        finally
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
            throw as;
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj = as[i];
        mapping.load(getClass().getResourceAsStream(((String) (obj))));
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public Box createBox(String s, byte abyte0[], String s1)
    {
        invoke(s, abyte0, s1);
        Class class1 = Class.forName(clazzName);
        if (param.length <= 0) goto _L2; else goto _L1
_L1:
        Class aclass[];
        Object aobj[];
        aclass = new Class[param.length];
        aobj = new Object[param.length];
        int i = 0;
_L9:
        if (i >= param.length)
        {
            return (Box)class1.getConstructor(aclass).newInstance(aobj);
        }
        if (!"userType".equals(param[i])) goto _L4; else goto _L3
_L3:
        aobj[i] = abyte0;
        aclass[i] = [B;
          goto _L5
_L4:
        if (!"type".equals(param[i])) goto _L7; else goto _L6
_L6:
        aobj[i] = s;
        aclass[i] = java/lang/String;
          goto _L5
_L7:
        if ("parent".equals(param[i]))
        {
            aobj[i] = s1;
            aclass[i] = java/lang/String;
        } else
        {
            try
            {
                throw new InternalError((new StringBuilder("No such param: ")).append(param[i]).toString());
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
          goto _L5
_L2:
        s = (Box)class1.newInstance();
        return s;
_L5:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void invoke(String s, byte abyte0[], String s1)
    {
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        if (!"uuid".equals(s))
        {
            throw new RuntimeException("we have a userType but no uuid box type. Something's wrong");
        }
        String s4 = mapping.getProperty((new StringBuilder("uuid[")).append(Hex.encodeHex(abyte0).toUpperCase()).append("]").toString());
        String s2 = s4;
        if (s4 == null)
        {
            s2 = mapping.getProperty((new StringBuilder(String.valueOf(s1))).append("-uuid[").append(Hex.encodeHex(abyte0).toUpperCase()).append("]").toString());
        }
        abyte0 = s2;
        if (s2 == null)
        {
            abyte0 = mapping.getProperty("uuid");
        }
_L4:
        s1 = abyte0;
        if (abyte0 == null)
        {
            s1 = mapping.getProperty("default");
        }
        if (s1 == null)
        {
            throw new RuntimeException((new StringBuilder("No box object found for ")).append(s).toString());
        }
        break; /* Loop/switch isn't completed */
_L2:
        String s3 = mapping.getProperty(s);
        abyte0 = s3;
        if (s3 == null)
        {
            abyte0 = buildLookupStrings.append(s1).append('-').append(s).toString();
            buildLookupStrings.setLength(0);
            abyte0 = mapping.getProperty(abyte0);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!s1.endsWith(")"))
        {
            param = EMPTY_STRING_ARRAY;
            clazzName = s1;
            return;
        }
        s = constuctorPattern.matcher(s1);
        if (!s.matches())
        {
            throw new RuntimeException((new StringBuilder("Cannot work with that constructor: ")).append(s1).toString());
        }
        clazzName = s.group(1);
        if (s.group(2).length() == 0)
        {
            s = EMPTY_STRING_ARRAY;
        } else
        if (s.group(2).length() > 0)
        {
            s = s.group(2).split(",");
        } else
        {
            s = new String[0];
        }
        param = s;
        return;
    }

}

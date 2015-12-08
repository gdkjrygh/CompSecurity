// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TelUri
{
    public static class Builder
    {

        private String extension;
        private String isdnSubaddress;
        private String number;
        private Map parameters;
        private String phoneContext;

        public TelUri build()
        {
            return new TelUri(this);
        }

        public Builder extension(String s)
        {
            if (s != null && !TelUri.isPhoneDigit(s))
            {
                throw new IllegalArgumentException("Extension contains invalid characters.");
            } else
            {
                extension = s;
                return this;
            }
        }

        public Builder globalNumber(String s)
        {
            if (!s.matches(".*?[0-9].*"))
            {
                throw new IllegalArgumentException("Global number must contain at least one digit.");
            }
            if (!s.startsWith("+"))
            {
                throw new IllegalArgumentException("Global number must start with \"+\".");
            }
            if (!s.matches("\\+[-0-9.()]*"))
            {
                throw new IllegalArgumentException("Global number contains invalid characters.");
            } else
            {
                number = s;
                phoneContext = null;
                return this;
            }
        }

        public Builder isdnSubaddress(String s)
        {
            isdnSubaddress = s;
            return this;
        }

        public Builder localNumber(String s, String s1)
        {
            if (!s.matches(".*?[0-9*#].*") || !s.matches("[0-9\\-.()*#]+"))
            {
                throw new IllegalArgumentException("Local number contains invalid characters.");
            } else
            {
                number = s;
                phoneContext = s1;
                return this;
            }
        }

        public Builder parameter(String s, String s1)
        {
            if (!TelUri.isParametername(s))
            {
                throw new IllegalArgumentException("Parameter names can only contain letters, numbers, and hyphens.");
            }
            if (s1 == null)
            {
                parameters.remove(s);
                return this;
            } else
            {
                parameters.put(s, s1);
                return this;
            }
        }



/*
        static String access$002(Builder builder, String s)
        {
            builder.number = s;
            return s;
        }

*/



/*
        static String access$102(Builder builder, String s)
        {
            builder.extension = s;
            return s;
        }

*/



/*
        static String access$202(Builder builder, String s)
        {
            builder.isdnSubaddress = s;
            return s;
        }

*/



/*
        static String access$302(Builder builder, String s)
        {
            builder.phoneContext = s;
            return s;
        }

*/


        private Builder()
        {
            parameters = new TreeMap();
        }


        public Builder(TelUri teluri)
        {
            number = teluri.number;
            extension = teluri.extension;
            isdnSubaddress = teluri.isdnSubaddress;
            phoneContext = teluri.phoneContext;
            parameters = new TreeMap(teluri.parameters);
        }

        public Builder(String s)
        {
            this();
            globalNumber(s);
        }

        public Builder(String s, String s1)
        {
            this();
            localNumber(s, s1);
        }
    }


    private static final String PARAM_EXTENSION = "ext";
    private static final String PARAM_ISDN_SUBADDRESS = "isub";
    private static final String PARAM_PHONE_CONTEXT = "phone-context";
    private static final Pattern hexPattern = Pattern.compile("(?i)%([0-9a-f]{2})");
    private static final Pattern uriPattern = Pattern.compile("(?i)^tel:(.*?)(;(.*))?$");
    private static final char validParamValueChars[];
    private final String extension;
    private final String isdnSubaddress;
    private final String number;
    private final Map parameters;
    private final String phoneContext;

    private TelUri(Builder builder)
    {
        number = builder.number;
        extension = builder.extension;
        isdnSubaddress = builder.isdnSubaddress;
        phoneContext = builder.phoneContext;
        parameters = Collections.unmodifiableMap(builder.parameters);
    }


    private static String decodeParamValue(String s)
    {
        s = hexPattern.matcher(s);
        StringBuffer stringbuffer = new StringBuffer();
        int i;
        for (; s.find(); s.appendReplacement(stringbuffer, (new StringBuilder()).append("").append((char)i).toString()))
        {
            i = Integer.parseInt(s.group(1), 16);
        }

        s.appendTail(stringbuffer);
        return stringbuffer.toString();
    }

    private static String encodeParamValue(String s)
    {
        StringBuilder stringbuilder = new StringBuilder(s.length());
        int i = 0;
        while (i < s.length()) 
        {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || Arrays.binarySearch(validParamValueChars, c) >= 0)
            {
                stringbuilder.append(c);
            } else
            {
                stringbuilder.append('%');
                stringbuilder.append(Integer.toString(c, 16));
            }
            i++;
        }
        return stringbuilder.toString();
    }

    private static boolean isParametername(String s)
    {
        return s.matches("(?i)[-a-z0-9]+");
    }

    private static boolean isPhoneDigit(String s)
    {
        return s.matches("[-0-9.()]+");
    }

    public static TelUri parse(String s)
    {
        Matcher matcher = uriPattern.matcher(s);
        if (!matcher.find())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid tel URI: ").append(s).toString());
        }
        Builder builder = new Builder();
        builder.number = matcher.group(1);
        s = matcher.group(3);
        if (s != null)
        {
            String as[] = s.split(";");
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                s = as[i].split("=", 2);
                String s1 = s[0];
                if (s.length > 1)
                {
                    s = decodeParamValue(s[1]);
                } else
                {
                    s = "";
                }
                if ("ext".equalsIgnoreCase(s1))
                {
                    builder.extension = s;
                } else
                if ("isub".equalsIgnoreCase(s1))
                {
                    builder.isdnSubaddress = s;
                } else
                if ("phone-context".equalsIgnoreCase(s1))
                {
                    builder.phoneContext = s;
                } else
                {
                    builder.parameters.put(s1, s);
                }
                i++;
            }
        }
        return builder.build();
    }

    private void writeParameter(String s, String s1, StringBuilder stringbuilder)
    {
        stringbuilder.append(';').append(s).append('=').append(encodeParamValue(s1));
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (TelUri)obj;
        if (extension == null)
        {
            if (((TelUri) (obj)).extension != null)
            {
                return false;
            }
        } else
        if (!extension.equals(((TelUri) (obj)).extension))
        {
            return false;
        }
        if (isdnSubaddress == null)
        {
            if (((TelUri) (obj)).isdnSubaddress != null)
            {
                return false;
            }
        } else
        if (!isdnSubaddress.equals(((TelUri) (obj)).isdnSubaddress))
        {
            return false;
        }
        if (number == null)
        {
            if (((TelUri) (obj)).number != null)
            {
                return false;
            }
        } else
        if (!number.equals(((TelUri) (obj)).number))
        {
            return false;
        }
        if (parameters == null)
        {
            if (((TelUri) (obj)).parameters != null)
            {
                return false;
            }
        } else
        if (!parameters.equals(((TelUri) (obj)).parameters))
        {
            return false;
        }
        if (phoneContext != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((TelUri) (obj)).phoneContext == null) goto _L1; else goto _L3
_L3:
        return false;
        if (phoneContext.equals(((TelUri) (obj)).phoneContext)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getExtension()
    {
        return extension;
    }

    public String getIsdnSubaddress()
    {
        return isdnSubaddress;
    }

    public String getNumber()
    {
        return number;
    }

    public String getParameter(String s)
    {
        return (String)parameters.get(s);
    }

    public Map getParameters()
    {
        return parameters;
    }

    public String getPhoneContext()
    {
        return phoneContext;
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (extension == null)
        {
            i = 0;
        } else
        {
            i = extension.hashCode();
        }
        if (isdnSubaddress == null)
        {
            j = 0;
        } else
        {
            j = isdnSubaddress.hashCode();
        }
        if (number == null)
        {
            k = 0;
        } else
        {
            k = number.hashCode();
        }
        if (parameters == null)
        {
            l = 0;
        } else
        {
            l = parameters.hashCode();
        }
        if (phoneContext != null)
        {
            i1 = phoneContext.hashCode();
        }
        return ((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("tel:");
        stringbuilder.append(number);
        if (extension != null)
        {
            writeParameter("ext", extension, stringbuilder);
        }
        if (isdnSubaddress != null)
        {
            writeParameter("isub", isdnSubaddress, stringbuilder);
        }
        if (phoneContext != null)
        {
            writeParameter("phone-context", phoneContext, stringbuilder);
        }
        java.util.Map.Entry entry;
        for (Iterator iterator = parameters.entrySet().iterator(); iterator.hasNext(); writeParameter((String)entry.getKey(), (String)entry.getValue(), stringbuilder))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return stringbuilder.toString();
    }

    static 
    {
        validParamValueChars = "!$&'()*+-.:[]_~/".toCharArray();
        Arrays.sort(validParamValueChars);
    }







}

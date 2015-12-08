// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.people.internal:
//            EmptyIterable

public final class PeopleUtils
{

    public static Iterable EMPTY_ITERABLE = new EmptyIterable();
    public static final String EMPTY_STRINGS[] = new String[0];
    public static final Map MAP_CIRCLE_TYPE;
    public static final SecureRandom RANDOM = new SecureRandom();
    public static final Pattern REGEX_COMMA = Pattern.compile("\\,");
    public static final Pattern REGEX_WHITESPACE = Pattern.compile("[\u2028\u2029 \240\u1680\u180E\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000\t\013\f\034\035\036\037\n\r]+");
    public static final Pattern SEP_1_RE = Pattern.compile(Pattern.quote("\001"));
    public static final String SEP_1_STR = "\001";
    public static final Pattern SEP_2_RE = Pattern.compile(Pattern.quote("\002"));
    public static final String SEP_2_STR = "\002";
    public static final Handler sMainHandler = new Handler(Looper.getMainLooper());
    private static final ThreadLocal sTemporaryStringBuilder = new ThreadLocal() {

        protected final volatile Object initialValue()
        {
            return new StringBuilder();
        }

    };
    private static final ThreadLocal sTemporaryStrings1 = new ThreadLocal() {

        protected final volatile Object initialValue()
        {
            return new String[1];
        }

    };
    private static final ThreadLocal sTemporaryStrings2 = new ThreadLocal() {

        protected final volatile Object initialValue()
        {
            return new String[2];
        }

    };
    private static final ThreadLocal sTemporaryStrings3 = new ThreadLocal() {

        protected final volatile Object initialValue()
        {
            return new String[3];
        }

    };
    private static final ThreadLocal sTemporaryStrings4 = new ThreadLocal() {

        protected final volatile Object initialValue()
        {
            return new String[4];
        }

    };
    private static final ThreadLocal sTemporaryStrings5 = new ThreadLocal() {

        protected final volatile Object initialValue()
        {
            return new String[5];
        }

    };

    public static void checkQualifiedId(String s, String s1)
    {
        Preconditions.checkNotEmpty(s, s1);
        boolean flag;
        if (s.startsWith("g:") || s.startsWith("e:"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, (new StringBuilder()).append(s1).append(": Expecting qualified-id, not gaia-id").toString());
    }

    public static String emailToPeopleQualifiedId(String s)
    {
        Preconditions.checkNotEmpty(s);
        return (new StringBuilder("e:")).append(s).toString();
    }

    public static String gaiaIdToPeopleQualifiedId(String s)
    {
        Preconditions.checkNotNull(s);
        return (new StringBuilder("g:")).append(s).toString();
    }

    public static boolean isQualifiedIdFromEmail(String s)
    {
        return s != null && s.startsWith("e:");
    }

    public static String peopleQualifiedIdToEmailAddress(String s)
    {
        if (s == null || !s.startsWith("e:"))
        {
            return null;
        } else
        {
            return s.substring(2);
        }
    }

    public static String peopleQualifiedIdToGaiaId(String s)
    {
        if (s == null || !s.startsWith("g:"))
        {
            return null;
        } else
        {
            return s.substring(2);
        }
    }

    public static String writeBundle(Bundle bundle)
    {
        return writeBundleValue(bundle, "", new StringBuilder()).toString();
    }

    private static StringBuilder writeBundleValue(Object obj, String s, StringBuilder stringbuilder)
    {
        if (obj == null)
        {
            stringbuilder.append("[null]\n");
            return stringbuilder;
        }
        String s1 = (new StringBuilder()).append(s).append("  ").toString();
        stringbuilder.append("(").append(obj.getClass().getSimpleName()).append(") ");
        if (obj instanceof Bundle)
        {
            obj = (Bundle)obj;
            if (((Bundle) (obj)).isEmpty())
            {
                stringbuilder.append("{ }\n");
                return stringbuilder;
            }
            stringbuilder.append("{\n");
            String s2;
            for (Iterator iterator = ((Bundle) (obj)).keySet().iterator(); iterator.hasNext(); writeBundleValue(((Bundle) (obj)).get(s2), s1, stringbuilder))
            {
                s2 = (String)iterator.next();
                stringbuilder.append(s1).append(s2).append(" : ");
            }

            stringbuilder.append(s).append("}\n");
            return stringbuilder;
        }
        if (obj instanceof DataHolder)
        {
            s = (DataHolder)obj;
            stringbuilder.append(" [");
            if (s.isClosed())
            {
                stringbuilder.append("CLOSED");
            } else
            {
                stringbuilder.append(((DataHolder) (s)).mRowCount);
            }
            stringbuilder.append("] ").append(obj).append("\n");
            return stringbuilder;
        }
        if (obj instanceof ArrayList)
        {
            obj = (ArrayList)obj;
            if (((ArrayList) (obj)).isEmpty())
            {
                stringbuilder.append("[ ]\n");
                return stringbuilder;
            }
            stringbuilder.append("[\n");
            for (int i = 0; i < ((ArrayList) (obj)).size(); i++)
            {
                stringbuilder.append(s1).append(i).append(" : ");
                writeBundleValue(((ArrayList) (obj)).get(i), s1, stringbuilder);
            }

            stringbuilder.append(s).append("]\n");
            return stringbuilder;
        }
        if (obj instanceof byte[])
        {
            int j = ((byte[])obj).length;
            stringbuilder.append(" [").append(j).append("] ");
            s = new byte[Math.min(j, 56)];
            System.arraycopy(obj, 0, s, 0, s.length);
            stringbuilder.append(Base64.encodeToString(s, 0));
            return stringbuilder;
        }
        if (obj instanceof char[])
        {
            stringbuilder.append("\"").append(new String((char[])obj)).append("\"\n");
            return stringbuilder;
        }
        if (obj.getClass().isArray())
        {
            if (Array.getLength(obj) == 0)
            {
                stringbuilder.append("[ ]\n");
                return stringbuilder;
            }
            stringbuilder.append("[ ");
            stringbuilder.append(Array.get(obj, 0));
            for (int k = 1; k < Array.getLength(obj); k++)
            {
                stringbuilder.append(", ").append(Array.get(obj, k));
            }

            stringbuilder.append(" ]\n");
            return stringbuilder;
        }
        if (obj instanceof String)
        {
            stringbuilder.append("\"").append(obj).append("\"\n");
            return stringbuilder;
        } else
        {
            stringbuilder.append(obj).append("\n");
            return stringbuilder;
        }
    }

    static 
    {
        HashMap hashmap = new HashMap();
        MAP_CIRCLE_TYPE = hashmap;
        hashmap.put("circle", Integer.valueOf(-1));
        MAP_CIRCLE_TYPE.put("extendedCircles", Integer.valueOf(4));
        MAP_CIRCLE_TYPE.put("myCircles", Integer.valueOf(3));
        MAP_CIRCLE_TYPE.put("domain", Integer.valueOf(2));
        MAP_CIRCLE_TYPE.put("public", Integer.valueOf(1));
        MAP_CIRCLE_TYPE.put(null, Integer.valueOf(-2));
    }
}

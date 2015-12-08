// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.data.DataHolder;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

public final class lnh
{

    private static final ThreadLocal a = new lnl();

    public static String a(Bundle bundle)
    {
        return a(bundle, "", new StringBuilder()).toString();
    }

    public static String a(String s)
    {
        b.d(s);
        return (new StringBuilder("g:")).append(s).toString();
    }

    private static StringBuilder a(Object obj, String s, StringBuilder stringbuilder)
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
            for (Iterator iterator = ((Bundle) (obj)).keySet().iterator(); iterator.hasNext(); a(((Bundle) (obj)).get(s2), s1, stringbuilder))
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
            if (s.b())
            {
                stringbuilder.append("CLOSED");
            } else
            {
                stringbuilder.append(((DataHolder) (s)).f);
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
                a(((ArrayList) (obj)).get(i), s1, stringbuilder);
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

    public static String[] a(String s, String s1)
    {
        String as[] = (String[])a.get();
        as[0] = s;
        as[1] = s1;
        return as;
    }

    static 
    {
        new lni();
        new Handler(Looper.getMainLooper());
        Pattern.compile("\\,");
        Pattern.compile("[\u2028\u2029 \240\u1680\u180E\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000\t\013\f\034\035\036\037\n\r]+");
        Pattern.compile(Pattern.quote("\001"));
        Pattern.compile(Pattern.quote("\002"));
        new SecureRandom();
        new lnj();
        new lnk();
        new lnm();
        new lnn();
        new lno();
    }
}

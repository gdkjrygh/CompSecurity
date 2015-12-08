// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.network;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class j
{

    final SharedPreferences a;

    protected j(Context context)
    {
        a = context.getSharedPreferences("tts_cache_files", 0);
    }

    public final String a(String s)
    {
        Object obj = a;
        String s1 = String.valueOf("name_");
        Object obj1 = String.valueOf(s);
        int i;
        if (((String) (obj1)).length() != 0)
        {
            s1 = s1.concat(((String) (obj1)));
        } else
        {
            s1 = new String(s1);
        }
        i = s.hashCode();
        obj1 = String.valueOf("_tts.dat");
        s1 = ((SharedPreferences) (obj)).getString(s1, (new StringBuilder(String.valueOf(obj1).length() + 11)).append(i).append(((String) (obj1))).toString());
        do
        {
            obj1 = a;
            obj = String.valueOf("text_");
            String s2 = String.valueOf(s1);
            if (s2.length() != 0)
            {
                obj = ((String) (obj)).concat(s2);
            } else
            {
                obj = new String(((String) (obj)));
            }
            obj = ((SharedPreferences) (obj1)).getString(((String) (obj)), null);
            if (obj == null || ((String) (obj)).equals(s))
            {
                break;
            }
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                s1 = "a".concat(s1);
            } else
            {
                s1 = new String("a");
            }
        } while (true);
        obj1 = a.edit();
        obj = String.valueOf("text_");
        String s3 = String.valueOf(s1);
        if (s3.length() != 0)
        {
            obj = ((String) (obj)).concat(s3);
        } else
        {
            obj = new String(((String) (obj)));
        }
        obj = ((android.content.SharedPreferences.Editor) (obj1)).putString(((String) (obj)), s);
        obj1 = String.valueOf("name_");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = ((String) (obj1)).concat(s);
        } else
        {
            s = new String(((String) (obj1)));
        }
        ((android.content.SharedPreferences.Editor) (obj)).putString(s, s1).commit();
        return s1;
    }

    public final void a(Set set)
    {
        Object obj = a.getAll().keySet();
        android.content.SharedPreferences.Editor editor = a.edit();
        obj = ((Set) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = (String)((Iterator) (obj)).next();
            if ((!s.startsWith("text_") || !set.contains(s.substring(5))) && (!s.startsWith("name_") || !set.contains(a.getString(s, ""))))
            {
                editor.remove(s);
            }
        } while (true);
        editor.commit();
    }
}

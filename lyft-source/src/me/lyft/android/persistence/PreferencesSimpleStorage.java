// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import me.lyft.android.common.Strings;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android.persistence:
//            ISimpleStorage

public class PreferencesSimpleStorage
    implements ISimpleStorage
{

    private final Gson gson;
    private final SharedPreferences preferences;

    public PreferencesSimpleStorage(Context context, Gson gson1)
    {
        gson = gson1;
        preferences = context.getSharedPreferences("simple_storage", 0);
    }

    private Object get(String s, Class class1)
    {
        String s1 = preferences.getString(s, null);
        if (Strings.isNullOrEmpty(s1))
        {
            return null;
        }
        try
        {
            class1 = ((Class) (gson.a(s1, class1)));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1 = preferences.edit();
            class1.remove(s);
            class1.apply();
            return null;
        }
        return class1;
    }

    public void clearAll()
    {
        preferences.edit().clear().apply();
    }

    public Object getOrDefault(String s, Class class1, Object obj)
    {
        s = ((String) (get(s, class1)));
        if (s == null)
        {
            return obj;
        } else
        {
            return s;
        }
    }

    public void put(String s, Object obj)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        if (obj == null)
        {
            editor.remove(s);
        } else
        {
            try
            {
                editor.putString(s, gson.a(obj));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                L.e(s, "putSerializable", new Object[0]);
            }
        }
        editor.apply();
    }
}

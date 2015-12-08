// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.model.CustomData;
import com.apptentive.android.sdk.model.Person;
import com.apptentive.android.sdk.util.JsonDiffer;
import org.json.JSONException;

public class PersonManager
{

    public PersonManager()
    {
    }

    private static Person generateCurrentPerson()
    {
        return new Person();
    }

    public static Person getStoredPerson(Context context)
    {
        context = context.getSharedPreferences("APPTENTIVE", 0).getString("person", null);
        try
        {
            context = new Person(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static CustomData loadCustomPersonData(Context context)
    {
        context = context.getSharedPreferences("APPTENTIVE", 0).getString("personData", null);
        try
        {
            context = new CustomData(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                context = new CustomData();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return null;
            }
            return context;
        }
        return context;
    }

    public static String loadInitialPersonEmail(Context context)
    {
        return context.getSharedPreferences("APPTENTIVE", 0).getString("personInitialEmail", null);
    }

    public static String loadInitialPersonUserName(Context context)
    {
        return context.getSharedPreferences("APPTENTIVE", 0).getString("personInitialUserName", null);
    }

    public static String loadPersonEmail(Context context)
    {
        return context.getSharedPreferences("APPTENTIVE", 0).getString("personEmail", null);
    }

    public static void storeCustomPersonData(Context context, CustomData customdata)
    {
        context = context.getSharedPreferences("APPTENTIVE", 0);
        customdata = customdata.toString();
        context.edit().putString("personData", customdata).commit();
    }

    public static void storeInitialPersonEmail(Context context, String s)
    {
        context.getSharedPreferences("APPTENTIVE", 0).edit().putString("personInitialEmail", s).commit();
    }

    public static void storeInitialPersonUserName(Context context, String s)
    {
        context.getSharedPreferences("APPTENTIVE", 0).edit().putString("personInitialUserName", s).commit();
    }

    private static void storePerson(Context context, Person person)
    {
        context.getSharedPreferences("APPTENTIVE", 0).edit().putString("person", person.toString()).commit();
    }

    public static Person storePersonAndReturnDiff(Context context)
    {
        Object obj;
        Person person;
        Person person1 = getStoredPerson(context);
        person = generateCurrentPerson();
        person.setCustomData(loadCustomPersonData(context));
        String s = loadPersonEmail(context);
        obj = s;
        if (s == null)
        {
            obj = loadInitialPersonEmail(context);
        }
        person.setEmail(((String) (obj)));
        person.setName(loadInitialPersonUserName(context));
        obj = JsonDiffer.getDiff(person1, person);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        storePerson(context, person);
        context = new Person(obj.toString());
        return context;
        context;
        Log.e("Error casting to Person.", context, new Object[0]);
        return null;
    }

    public static Person storePersonAndReturnIt(Context context)
    {
        Person person = generateCurrentPerson();
        person.setCustomData(loadCustomPersonData(context));
        String s1 = loadPersonEmail(context);
        String s = s1;
        if (s1 == null)
        {
            s = loadInitialPersonEmail(context);
        }
        person.setEmail(s);
        person.setName(loadInitialPersonUserName(context));
        storePerson(context, person);
        return person;
    }

    public static void storePersonEmail(Context context, String s)
    {
        context.getSharedPreferences("APPTENTIVE", 0).edit().putString("personEmail", s).commit();
    }
}

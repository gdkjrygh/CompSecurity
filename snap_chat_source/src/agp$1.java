// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;
import org.json.JSONException;
import org.json.JSONObject;

final class 
    implements Comparator
{

    private static int a(JSONObject jsonobject, JSONObject jsonobject1)
    {
        int i;
        int j;
        try
        {
            i = jsonobject.getInt("version");
            j = jsonobject1.getInt("version");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return 0;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return 0;
        }
        if (i <= j);
        return 0;
    }

    public final int compare(Object obj, Object obj1)
    {
        return a((JSONObject)obj, (JSONObject)obj1);
    }

    ()
    {
    }
}

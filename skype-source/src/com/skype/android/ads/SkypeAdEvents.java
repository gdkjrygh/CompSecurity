// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import android.util.Log;
import com.microsoft.advertising.android.AdControl;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public class SkypeAdEvents
{
    public static interface EventListener
    {

        public abstract void a(Object obj, JSONObject jsonobject);
    }


    private static ArrayList a = new ArrayList();

    public SkypeAdEvents()
    {
    }

    public static JSONObject a(AdControl adcontrol, String s)
    {
        return b(adcontrol, s);
    }

    public static JSONObject a(AdControl adcontrol, String s, long l)
    {
        adcontrol = b(adcontrol, s);
        try
        {
            adcontrol.put("adTimeToLoadMs", Long.toString(l));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("AdEvent", (new StringBuilder("buildLoadEvent exception ")).append(s).toString());
            return adcontrol;
        }
        return adcontrol;
    }

    public static JSONObject a(AdControl adcontrol, String s, String s1)
    {
        adcontrol = b(adcontrol, s);
        if (s1 != null)
        {
            try
            {
                adcontrol.put("type", s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("AdEvent", (new StringBuilder("buildEvent exception ")).append(s).toString());
                return adcontrol;
            }
        }
        return adcontrol;
    }

    public static JSONObject a(AdControl adcontrol, String s, String s1, int i)
    {
        adcontrol = b(adcontrol, s);
        try
        {
            adcontrol.put("errorData", s1);
            adcontrol.put("errorType", i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("AdEvent", (new StringBuilder("buildErrorEvent exception ")).append(s).toString());
            return adcontrol;
        }
        return adcontrol;
    }

    public static void a(EventListener eventlistener)
    {
        if (eventlistener == null)
        {
            return;
        }
        synchronized (a)
        {
            if (!a.contains(eventlistener))
            {
                a.add(eventlistener);
            }
        }
        return;
        eventlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw eventlistener;
    }

    public static void a(Object obj, JSONObject jsonobject)
    {
        ArrayList arraylist = a;
        arraylist;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((EventListener)iterator.next()).a(obj, jsonobject)) { }
        break MISSING_BLOCK_LABEL_46;
        obj;
        arraylist;
        JVM INSTR monitorexit ;
        throw obj;
        arraylist;
        JVM INSTR monitorexit ;
    }

    private static JSONObject b(AdControl adcontrol, String s)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("eventName", s);
            jsonobject.put("eventTimeStamp", System.currentTimeMillis());
        }
        // Misplaced declaration of an exception variable
        catch (AdControl adcontrol)
        {
            Log.e("AdEvent", (new StringBuilder("buildEventHelper exception ")).append(adcontrol).toString());
            return jsonobject;
        }
        if (adcontrol == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        jsonobject.put("adUnitId", adcontrol.b());
        return jsonobject;
        jsonobject.put("adUnitId", "");
        return jsonobject;
    }

}

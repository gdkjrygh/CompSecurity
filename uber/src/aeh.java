// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class aeh
{

    public aeh()
    {
    }

    public static List a(JSONObject jsonobject, String s)
    {
        jsonobject = jsonobject.optJSONArray(s);
        if (jsonobject != null)
        {
            s = new ArrayList(jsonobject.length());
            for (int i = 0; i < jsonobject.length(); i++)
            {
                s.add(jsonobject.getString(i));
            }

            return Collections.unmodifiableList(s);
        } else
        {
            return null;
        }
    }

    public static void a(Context context, String s, ain ain1, String s1, boolean flag, List list)
    {
        String s2;
        Iterator iterator;
        if (flag)
        {
            s2 = "1";
        } else
        {
            s2 = "0";
        }
        for (iterator = list.iterator(); iterator.hasNext(); (new ajp(context, s, list)).e())
        {
            String s3 = ((String)iterator.next()).replaceAll("@gw_adlocid@", s1).replaceAll("@gw_adnetrefresh@", s2).replaceAll("@gw_qdata@", ain1.o.f).replaceAll("@gw_sdkver@", s).replaceAll("@gw_sessid@", ot.h().a()).replaceAll("@gw_seqnum@", ain1.i);
            list = s3;
            if (ain1.l != null)
            {
                list = s3.replaceAll("@gw_adnetid@", ain1.l.b).replaceAll("@gw_allocid@", ain1.l.d);
            }
        }

    }
}

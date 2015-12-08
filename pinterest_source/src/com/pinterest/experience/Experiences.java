// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.experience;

import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.remote.ExperiencesApi;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.experiences.Experience;
import com.pinterest.schemas.experiences.Placement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.IOUtils;

// Referenced classes of package com.pinterest.experience:
//            ExperienceValue

public class Experiences
{

    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final List g;
    private static Experiences h = new Experiences();
    private HashMap i;
    private com.pinterest.api.remote.ExperiencesApi.ExperienceResponseHandler j;
    private ApiResponseHandler k;

    private Experiences()
    {
        i = new HashMap();
        j = new com.pinterest.api.remote.ExperiencesApi.ExperienceResponseHandler();
        k = new _cls1();
    }

    public static ExperienceValue a(String s)
    {
        return (ExperienceValue)h.i.get(s);
    }

    public static PinterestJsonObject a(int l)
    {
        java.io.InputStream inputstream = Resources.raw(l);
        Object obj;
        try
        {
            obj = IOUtils.toString(inputstream);
        }
        catch (IOException ioexception)
        {
            CrashReporting.a(ioexception);
            ioexception = null;
        }
        IOUtils.closeQuietly(inputstream);
        try
        {
            obj = new PinterestJsonObject(((String) (obj)));
        }
        catch (Exception exception)
        {
            CrashReporting.a(exception);
            return null;
        }
        return ((PinterestJsonObject) (obj));
    }

    public static void a()
    {
        ExperiencesApi.a(h.j);
    }

    public static ExperienceValue b(String s)
    {
        s = a(s);
        if (s != null)
        {
            s.d();
        }
        return s;
    }

    public static void b()
    {
        h.i.clear();
    }

    public static ExperienceValue c(String s)
    {
        return (ExperienceValue)h.i.remove(s);
    }

    public static Experiences c()
    {
        return h;
    }

    public final void a(HashMap hashmap)
    {
        if (hashmap != null)
        {
            Iterator iterator = hashmap.keySet().iterator();
            while (iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                ExperienceValue experiencevalue = ExperienceValue.a((PinterestJsonObject)hashmap.get(s));
                if (experiencevalue != null)
                {
                    i.put(s, experiencevalue);
                    if (b.equalsIgnoreCase(s) || a.equalsIgnoreCase(s))
                    {
                        if (a(s).b != Experience.ANDROID_WARM_SEO_NUX_GIFTWRAP_INTEREST_PICKER.getValue())
                        {
                            Events.post(new ExperienceEvent(s));
                        }
                    } else
                    if (Integer.toString(Placement.ANDROID_APPLAUNCH_AUTO_COMPLETE.getValue()).equals(s))
                    {
                        experiencevalue.b();
                    }
                }
            }
        }
    }

    public final void d()
    {
        ExperiencesApi.a(j);
    }

    public final void d(String s)
    {
        ExperiencesApi.a(s, null, j, null);
    }

    static 
    {
        a = Integer.toString(Placement.ANDROID_GLOBAL_NAG.getValue());
        b = Integer.toString(Placement.ANDROID_MAIN_USER_ED.getValue());
        c = Integer.toString(Placement.ANDROID_PIN_CLOSEUP_TAKEOVER.getValue());
        d = Integer.toString(Placement.ANDROID_HOME_FEED_TAKEOVER.getValue());
        e = Integer.toString(Placement.ANDROID_NETWORK_STORY_NAG.getValue());
        f = Integer.toString(Placement.ANDROID_CONVERSATION_NAG.getValue());
        ArrayList arraylist = new ArrayList();
        g = arraylist;
        arraylist.add(b);
        g.add(a);
        g.add(c);
        g.add(d);
    }

    private class _cls1 extends ApiResponseHandler
    {

        final Experiences a;

        public void onSuccess(ApiResponse apiresponse)
        {
            a.d();
        }

        _cls1()
        {
            a = Experiences.this;
            super();
        }
    }


    private class ExperienceEvent
    {

        public String a;

        public ExperienceEvent(String s)
        {
            a = s;
        }
    }

}

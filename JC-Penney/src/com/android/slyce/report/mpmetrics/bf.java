// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            bg, j, Survey, be

public class bf
{

    final Survey a;
    private final int b;
    private final String c;
    private final String d;
    private final List e;

    private bf(Survey survey, JSONObject jsonobject)
    {
        a = survey;
        super();
        b = jsonobject.getInt("id");
        c = jsonobject.getString("type");
        d = jsonobject.getString("prompt");
        List list = Collections.emptyList();
        survey = list;
        if (jsonobject.has("extra_data"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("extra_data");
            survey = list;
            if (jsonobject1.has("$choices"))
            {
                JSONArray jsonarray = jsonobject1.getJSONArray("$choices");
                survey = new ArrayList(jsonarray.length());
                for (int i = 0; i < jsonarray.length(); i++)
                {
                    survey.add(jsonarray.getString(i));
                }

            }
        }
        e = Collections.unmodifiableList(survey);
        if (d() == bg.b && e.size() == 0)
        {
            throw new j((new StringBuilder()).append("Question is multiple choice but has no answers:").append(jsonobject.toString()).toString());
        } else
        {
            return;
        }
    }

    bf(Survey survey, JSONObject jsonobject, be be)
    {
        this(survey, jsonobject);
    }

    public int a()
    {
        return b;
    }

    public String b()
    {
        return d;
    }

    public List c()
    {
        return e;
    }

    public bg d()
    {
        if (bg.b.toString().equals(c))
        {
            return bg.b;
        }
        if (bg.c.toString().equals(c))
        {
            return bg.c;
        } else
        {
            return bg.a;
        }
    }
}

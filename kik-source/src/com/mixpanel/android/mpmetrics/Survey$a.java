// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            Survey, e

public final class <init>
{

    final Survey a;
    private final int b;
    private final String c;
    private final String d;
    private final List e;

    public final int a()
    {
        return b;
    }

    public final String b()
    {
        return d;
    }

    public final List c()
    {
        return e;
    }

    public final e d()
    {
        if (b.toString().equals(c))
        {
            return b;
        }
        if (c.toString().equals(c))
        {
            return c;
        } else
        {
            return a;
        }
    }

    private (Survey survey, JSONObject jsonobject)
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
        if (d() == b && e.size() == 0)
        {
            throw new e((new StringBuilder("Question is multiple choice but has no answers:")).append(jsonobject.toString()).toString());
        } else
        {
            return;
        }
    }

    e(Survey survey, JSONObject jsonobject, byte byte0)
    {
        this(survey, jsonobject);
    }
}

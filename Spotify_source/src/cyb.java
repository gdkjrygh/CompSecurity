// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.mixpanel.android.mpmetrics.BadDecideObjectException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class cyb
{

    public final int a;
    public final String b;
    public final List c;
    private final String d;

    private cyb(JSONObject jsonobject)
    {
        a = jsonobject.getInt("id");
        d = jsonobject.getString("type");
        b = jsonobject.getString("prompt");
        List list = Collections.emptyList();
        Object obj = list;
        if (jsonobject.has("extra_data"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("extra_data");
            obj = list;
            if (jsonobject1.has("$choices"))
            {
                JSONArray jsonarray = jsonobject1.getJSONArray("$choices");
                obj = new ArrayList(jsonarray.length());
                for (int i = 0; i < jsonarray.length(); i++)
                {
                    ((List) (obj)).add(jsonarray.getString(i));
                }

            }
        }
        c = Collections.unmodifiableList(((List) (obj)));
        if (a() == com.mixpanel.android.mpmetrics.Survey.QuestionType.b && c.size() == 0)
        {
            throw new BadDecideObjectException((new StringBuilder("Question is multiple choice but has no answers:")).append(jsonobject.toString()).toString());
        } else
        {
            return;
        }
    }

    public cyb(JSONObject jsonobject, byte byte0)
    {
        this(jsonobject);
    }

    public final com.mixpanel.android.mpmetrics.Survey.QuestionType a()
    {
        if (com.mixpanel.android.mpmetrics.Survey.QuestionType.b.toString().equals(d))
        {
            return com.mixpanel.android.mpmetrics.Survey.QuestionType.b;
        }
        if (com.mixpanel.android.mpmetrics.Survey.QuestionType.c.toString().equals(d))
        {
            return com.mixpanel.android.mpmetrics.Survey.QuestionType.c;
        } else
        {
            return com.mixpanel.android.mpmetrics.Survey.QuestionType.a;
        }
    }
}

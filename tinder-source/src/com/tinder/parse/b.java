// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.parse;

import com.tinder.model.Career;
import com.tinder.model.Job;
import com.tinder.model.School;
import com.tinder.model.Teaser;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
{

    public static Career a(JSONObject jsonobject)
    {
        boolean flag = false;
        if (jsonobject == null)
        {
            return null;
        }
        Career career = new Career();
        JSONObject jsonobject1 = jsonobject.optJSONObject("teaser");
        if (jsonobject1 != null)
        {
            career.setTeaser(new Teaser(jsonobject1.optString("type"), jsonobject1.optString("string")));
        }
        JSONArray jsonarray = jsonobject.optJSONArray("jobs");
        if (jsonarray != null && jsonarray.length() > 0)
        {
            ArrayList arraylist1 = new ArrayList();
            int i = 0;
            while (i < jsonarray.length()) 
            {
                JSONObject jsonobject2 = jsonarray.optJSONObject(i);
                Job job;
                if (jsonobject2 == null)
                {
                    job = null;
                } else
                {
                    job = new Job();
                    JSONObject jsonobject3 = jsonobject2.optJSONObject("title");
                    if (jsonobject3 != null)
                    {
                        job.setTitle(jsonobject3.optString("name"));
                        job.titleShown = jsonobject3.optBoolean("displayed");
                        job.titleId = jsonobject3.optString("id");
                    }
                    jsonobject2 = jsonobject2.optJSONObject("company");
                    if (jsonobject2 != null)
                    {
                        job.setCompany(jsonobject2.optString("name"));
                        job.companyShown = jsonobject2.optBoolean("displayed");
                        job.companyId = jsonobject2.optString("id");
                    }
                    (new StringBuilder("Parsed job: ")).append(job.getTitle()).append(", ").append(job.getCompany()).append(", ").append(job.titleShown).append(", ").append(job.companyShown);
                }
                if (job != null)
                {
                    arraylist1.add(job);
                }
                i++;
            }
            career.setJobs(arraylist1);
        }
        jsonobject = jsonobject.optJSONArray("schools");
        if (jsonobject != null)
        {
            ArrayList arraylist = new ArrayList();
            for (int j = ((flag) ? 1 : 0); j < jsonobject.length(); j++)
            {
                Object obj = jsonobject.optJSONObject(j);
                obj = new School(((JSONObject) (obj)).optString("id"), ((JSONObject) (obj)).optString("name"), ((JSONObject) (obj)).optBoolean("displayed"));
                arraylist.add(obj);
                (new StringBuilder("Parsed school: ")).append(((School) (obj)).getName()).append(", ").append(((School) (obj)).id).append(",").append(((School) (obj)).isDisplayed);
            }

            career.setSchools(arraylist);
        }
        return career;
    }
}

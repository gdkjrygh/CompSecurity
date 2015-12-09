// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity;

import com.fitbit.d.a;
import com.fitbit.data.domain.Entity;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public class ActivityLogInfo extends Entity
{
    public static final class Group extends Enum
    {

        public static final Group a;
        public static final Group b;
        private static final Group c[];

        public static Group valueOf(String s)
        {
            return (Group)Enum.valueOf(com/fitbit/activity/ActivityLogInfo$Group, s);
        }

        public static Group[] values()
        {
            return (Group[])c.clone();
        }

        static 
        {
            a = new Group("RECENT", 0);
            b = new Group("OFTEN", 1);
            c = (new Group[] {
                a, b
            });
        }

        private Group(String s, int i)
        {
            super(s, i);
        }
    }


    private long activityId;
    private int calories;
    private Date date;
    private String description;
    private double distance;
    private int duration;
    private Group group;
    private String name;

    public ActivityLogInfo()
    {
    }

    public String a()
    {
        return name;
    }

    public void a(double d1)
    {
        distance = d1;
    }

    public void a(int i)
    {
        duration = i;
    }

    public void a(long l)
    {
        activityId = l;
    }

    public void a(Group group1)
    {
        group = group1;
    }

    public void a(String s)
    {
        name = s;
    }

    public void a(Date date1)
    {
        date = date1;
    }

    public void a(JSONObject jsonobject)
        throws JSONException
    {
        a(com.fitbit.d.a.b(jsonobject, "activityId", -1));
        b(com.fitbit.d.a.a(jsonobject, "calories", 0));
        b(com.fitbit.d.a.a(jsonobject, "description"));
        a(com.fitbit.d.a.a(jsonobject, "distance", -1D));
        a((int)(com.fitbit.d.a.b(jsonobject, "duration", 0) / 1000L));
        a(com.fitbit.d.a.a(jsonobject, "name"));
    }

    public int b()
    {
        return duration;
    }

    public void b(int i)
    {
        calories = i;
    }

    public void b(String s)
    {
        description = s;
    }

    public long c()
    {
        return activityId;
    }

    public int d()
    {
        return calories;
    }

    public String e()
    {
        return description;
    }

    public double f()
    {
        return distance;
    }

    public Group g()
    {
        return group;
    }

    public Date h()
    {
        return date;
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(" date: ").append(h()).append(" activityId: ").append(c()).append(" distance: ").append(f()).append(" duration: ").append(b()).toString();
    }
}

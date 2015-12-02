// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LocalGamePkg
    implements Serializable
{
    public static final class State extends Enum
    {

        public static final State Add;
        public static final State CleanRecmd;
        public static final State UserAdd;
        public static final State V5Recmd;
        private static final State b[];
        private int a;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/qihoo/security/gamebooster/LocalGamePkg$State, s);
        }

        public static State[] values()
        {
            return (State[])b.clone();
        }

        public int getCode()
        {
            return a;
        }

        public void setCode(int i)
        {
            a = i;
        }

        static 
        {
            V5Recmd = new State("V5Recmd", 0, 0);
            CleanRecmd = new State("CleanRecmd", 1, 1);
            UserAdd = new State("UserAdd", 2, 2);
            Add = new State("Add", 3, 4);
            b = (new State[] {
                V5Recmd, CleanRecmd, UserAdd, Add
            });
        }

        private State(String s, int i, int j)
        {
            super(s, i);
            a = j;
        }
    }


    public static LocalGamePkg ADD;
    private String a;
    private State b;
    private long c;

    public LocalGamePkg(String s, State state)
    {
        a = s;
        b = state;
    }

    public LocalGamePkg(String s, State state, long l)
    {
        a = s;
        b = state;
        c = l;
    }

    public static List fromJsonArray(JSONArray jsonarray)
    {
        if (jsonarray == null)
        {
            return new ArrayList();
        }
        int j = jsonarray.length();
        ArrayList arraylist = new ArrayList(j);
        HashSet hashset = new HashSet();
        int i = 0;
        while (i < j) 
        {
            Object obj = jsonarray.optJSONObject(i);
            if (obj != null)
            {
                obj = fromJsonObject(((JSONObject) (obj)));
                if (obj != null && !hashset.contains(((LocalGamePkg) (obj)).getPkgName()))
                {
                    hashset.add(((LocalGamePkg) (obj)).getPkgName());
                    arraylist.add(obj);
                }
            }
            i++;
        }
        hashset.clear();
        return arraylist;
    }

    public static LocalGamePkg fromJsonObject(JSONObject jsonobject)
    {
        if (jsonobject != null)
        {
            String s = jsonobject.optString("pkg", "");
            long l = jsonobject.optLong("time", System.currentTimeMillis());
            int i = jsonobject.optInt("state", -1);
            jsonobject = State.values();
            if (i != -1 && i < jsonobject.length)
            {
                return new LocalGamePkg(s, State.values()[i], l);
            }
        }
        return null;
    }

    public static JSONArray toJsonArray(List list)
    {
        if (list == null)
        {
            return new JSONArray();
        }
        JSONArray jsonarray = new JSONArray();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            JSONObject jsonobject = toJsonObject((LocalGamePkg)list.next());
            if (jsonobject != null)
            {
                jsonarray.put(jsonobject);
            }
        } while (true);
        return jsonarray;
    }

    public static JSONObject toJsonObject(LocalGamePkg localgamepkg)
    {
        if (localgamepkg == null)
        {
            return null;
        }
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("pkg", localgamepkg.getPkgName());
            jsonobject.put("state", localgamepkg.getState().ordinal());
            jsonobject.put("time", localgamepkg.getTime());
        }
        // Misplaced declaration of an exception variable
        catch (LocalGamePkg localgamepkg)
        {
            return null;
        }
        return jsonobject;
    }

    public String getPkgName()
    {
        return a;
    }

    public State getState()
    {
        return b;
    }

    public long getTime()
    {
        return c;
    }

    public void setPkgName(String s)
    {
        a = s;
    }

    public void setState(State state)
    {
        b = state;
    }

    public void setTime(long l)
    {
        c = l;
    }

    public String toString()
    {
        return a;
    }

    static 
    {
        ADD = new LocalGamePkg("", State.Add);
    }
}

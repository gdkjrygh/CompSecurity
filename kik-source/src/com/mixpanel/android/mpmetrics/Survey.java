// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            ag, e, ah, ai, 
//            aj

public class Survey
    implements Parcelable
{
    public final class a
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

        public final b d()
        {
            if (b.b.toString().equals(c))
            {
                return b.b;
            }
            if (b.c.toString().equals(c))
            {
                return b.c;
            } else
            {
                return b.a;
            }
        }

        private a(JSONObject jsonobject)
        {
            a = Survey.this;
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
                        add(jsonarray.getString(i));
                    }

                }
            }
            e = Collections.unmodifiableList(Survey.this);
            if (d() == b.b && e.size() == 0)
            {
                throw new e((new StringBuilder("Question is multiple choice but has no answers:")).append(jsonobject.toString()).toString());
            } else
            {
                return;
            }
        }

        a(JSONObject jsonobject, byte byte0)
        {
            this(jsonobject);
        }
    }

    public static class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/mixpanel/android/mpmetrics/Survey$b, s);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new ah("UNKNOWN");
            b = new ai("MULTIPLE_CHOICE");
            c = new aj("TEXT");
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }

        b(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }


    public static android.os.Parcelable.Creator a = new ag();
    private final JSONObject b;
    private final int c;
    private final int d;
    private final List e;

    Survey(JSONObject jsonobject)
    {
        int i;
        i = 0;
        super();
        try
        {
            b = jsonobject;
            c = jsonobject.getInt("id");
            d = jsonobject.getJSONArray("collections").getJSONObject(0).getInt("id");
            jsonobject = jsonobject.getJSONArray("questions");
            if (jsonobject.length() == 0)
            {
                throw new e("Survey has no questions.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new e("Survey JSON was unexpected or bad", jsonobject);
        }
        ArrayList arraylist = new ArrayList(jsonobject.length());
_L1:
        if (i >= jsonobject.length())
        {
            break MISSING_BLOCK_LABEL_124;
        }
        arraylist.add(new a(jsonobject.getJSONObject(i), (byte)0));
        i++;
          goto _L1
        e = Collections.unmodifiableList(arraylist);
        return;
    }

    public final int a()
    {
        return c;
    }

    public final int b()
    {
        return d;
    }

    public final List c()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b.toString());
    }

}

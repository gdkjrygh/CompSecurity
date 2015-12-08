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
//            BadDecideObjectException

public class Survey
    implements Parcelable
{
    public static class QuestionType extends Enum
    {

        public static final QuestionType a;
        public static final QuestionType b;
        public static final QuestionType c;
        private static final QuestionType d[];

        public static QuestionType valueOf(String s)
        {
            return (QuestionType)Enum.valueOf(com/mixpanel/android/mpmetrics/Survey$QuestionType, s);
        }

        public static QuestionType[] values()
        {
            return (QuestionType[])d.clone();
        }

        static 
        {
        /* block-local class not found */
        class _cls1 {}

            a = new _cls1("UNKNOWN", 0);
        /* block-local class not found */
        class _cls2 {}

            b = new _cls2("MULTIPLE_CHOICE", 1);
        /* block-local class not found */
        class _cls3 {}

            c = new _cls3("TEXT", 2);
            d = (new QuestionType[] {
                a, b, c
            });
        }

        private QuestionType(String s, int i)
        {
            super(s, i);
        }

    }

    public class a
    {

        final Survey a;
        private final int b;
        private final String c;
        private final String d;
        private final List e;

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

        public QuestionType d()
        {
            if (QuestionType.b.toString().equals(c))
            {
                return QuestionType.b;
            }
            if (QuestionType.c.toString().equals(c))
            {
                return QuestionType.c;
            } else
            {
                return QuestionType.a;
            }
        }

        private a(JSONObject jsonobject)
            throws JSONException, BadDecideObjectException
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
            if (d() == QuestionType.b && e.size() == 0)
            {
                throw new BadDecideObjectException((new StringBuilder()).append("Question is multiple choice but has no answers:").append(jsonobject.toString()).toString());
            } else
            {
                return;
            }
        }

    }


    public static android.os.Parcelable.Creator a = new android.os.Parcelable.Creator() {

        public Survey a(Parcel parcel)
        {
            parcel = parcel.readString();
            try
            {
                parcel = new Survey(new JSONObject(parcel));
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                throw new RuntimeException("Corrupted JSON object written to survey parcel.", parcel);
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                throw new RuntimeException("Unexpected or incomplete object written to survey parcel.", parcel);
            }
            return parcel;
        }

        public Survey[] a(int i)
        {
            return new Survey[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private final JSONObject b;
    private final int c;
    private final int d;
    private final List e;

    Survey(JSONObject jsonobject)
        throws BadDecideObjectException
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
                throw new BadDecideObjectException("Survey has no questions.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadDecideObjectException("Survey JSON was unexpected or bad", jsonobject);
        }
        ArrayList arraylist = new ArrayList(jsonobject.length());
_L1:
        if (i >= jsonobject.length())
        {
            break MISSING_BLOCK_LABEL_124;
        }
        arraylist.add(new a(jsonobject.getJSONObject(i)));
        i++;
          goto _L1
        e = Collections.unmodifiableList(arraylist);
        return;
    }

    String a()
    {
        return b.toString();
    }

    public int b()
    {
        return c;
    }

    public int c()
    {
        return d;
    }

    public List d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a());
    }

}

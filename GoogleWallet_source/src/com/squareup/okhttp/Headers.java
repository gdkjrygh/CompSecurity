// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.HttpDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class Headers
{
    public static final class Builder
    {

        private final List namesAndValues = new ArrayList(20);

        private Builder addLenient(String s, String s1)
        {
            namesAndValues.add(s);
            namesAndValues.add(s1.trim());
            return this;
        }

        public final Builder add(String s, String s1)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("name == null");
            }
            if (s1 == null)
            {
                throw new IllegalArgumentException("value == null");
            }
            if (s.length() == 0 || s.indexOf('\0') != -1 || s1.indexOf('\0') != -1)
            {
                throw new IllegalArgumentException((new StringBuilder("Unexpected header: ")).append(s).append(": ").append(s1).toString());
            } else
            {
                return addLenient(s, s1);
            }
        }

        final Builder addLine(String s)
        {
            int i = s.indexOf(":", 1);
            if (i != -1)
            {
                return addLenient(s.substring(0, i), s.substring(i + 1));
            }
            if (s.startsWith(":"))
            {
                return addLenient("", s.substring(1));
            } else
            {
                return addLenient("", s);
            }
        }

        public final Headers build()
        {
            return new Headers(this);
        }

        public final String get(String s)
        {
            for (int i = namesAndValues.size() - 2; i >= 0; i -= 2)
            {
                if (s.equalsIgnoreCase((String)namesAndValues.get(i)))
                {
                    return (String)namesAndValues.get(i + 1);
                }
            }

            return null;
        }

        public final Builder removeAll(String s)
        {
            int j;
            for (int i = 0; i < namesAndValues.size(); i = j + 2)
            {
                j = i;
                if (s.equalsIgnoreCase((String)namesAndValues.get(i)))
                {
                    namesAndValues.remove(i);
                    namesAndValues.remove(i);
                    j = i - 2;
                }
            }

            return this;
        }

        public final Builder set(String s, String s1)
        {
            removeAll(s);
            add(s, s1);
            return this;
        }


        public Builder()
        {
        }
    }


    private final String namesAndValues[];

    private Headers(Builder builder)
    {
        namesAndValues = (String[])builder.namesAndValues.toArray(new String[builder.namesAndValues.size()]);
    }


    private static String get(String as[], String s)
    {
        for (int i = as.length - 2; i >= 0; i -= 2)
        {
            if (s.equalsIgnoreCase(as[i]))
            {
                return as[i + 1];
            }
        }

        return null;
    }

    public final String get(String s)
    {
        return get(namesAndValues, s);
    }

    public final Date getDate(String s)
    {
        s = get(s);
        if (s != null)
        {
            return HttpDate.parse(s);
        } else
        {
            return null;
        }
    }

    public final String name(int i)
    {
        i <<= 1;
        if (i < 0 || i >= namesAndValues.length)
        {
            return null;
        } else
        {
            return namesAndValues[i];
        }
    }

    public final Builder newBuilder()
    {
        Builder builder = new Builder();
        builder.namesAndValues.addAll(Arrays.asList(namesAndValues));
        return builder;
    }

    public final int size()
    {
        return namesAndValues.length / 2;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        for (int j = size(); i < j; i++)
        {
            stringbuilder.append(name(i)).append(": ").append(value(i)).append("\n");
        }

        return stringbuilder.toString();
    }

    public final String value(int i)
    {
        i = (i << 1) + 1;
        if (i < 0 || i >= namesAndValues.length)
        {
            return null;
        } else
        {
            return namesAndValues[i];
        }
    }

    public final List values(String s)
    {
        ArrayList arraylist = null;
        int i = 0;
        for (int j = size(); i < j;)
        {
            ArrayList arraylist1 = arraylist;
            if (s.equalsIgnoreCase(name(i)))
            {
                arraylist1 = arraylist;
                if (arraylist == null)
                {
                    arraylist1 = new ArrayList(2);
                }
                arraylist1.add(value(i));
            }
            i++;
            arraylist = arraylist1;
        }

        if (arraylist != null)
        {
            return Collections.unmodifiableList(arraylist);
        } else
        {
            return Collections.emptyList();
        }
    }
}

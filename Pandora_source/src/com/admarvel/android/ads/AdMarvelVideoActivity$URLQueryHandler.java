// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity

class this._cls0
{
    public class ParameterValuePair
    {

        public String mParameter;
        public List mValue;
        final AdMarvelVideoActivity.URLQueryHandler this$1;

        public String getParameter()
        {
            return mParameter;
        }

        public void updateValue(String s)
        {
            mValue.add(URLDecoder.decode(s));
        }

        public ParameterValuePair(String s, String s1)
        {
            this$1 = AdMarvelVideoActivity.URLQueryHandler.this;
            super();
            mParameter = s;
            mValue = new ArrayList();
            mValue.add(URLDecoder.decode(s1));
        }
    }


    private final ArrayList mEntriesList = new ArrayList();
    final AdMarvelVideoActivity this$0;

    protected void addEntry(String s, String s1)
    {
        int i = 0;
        do
        {
            if (i >= mEntriesList.size())
            {
                mEntriesList.add(new ParameterValuePair(s, s1));
                return;
            }
            if (((ParameterValuePair)mEntriesList.get(i)).getParameter().equalsIgnoreCase(s))
            {
                ((ParameterValuePair)mEntriesList.get(i)).updateValue(s1);
                return;
            }
            i++;
        } while (true);
    }

    public List getParameterList()
    {
        return mEntriesList;
    }

    public void parseQuery(String s)
    {
        s = new StringTokenizer(s, "&");
        do
        {
            String s1;
            do
            {
                if (!s.hasMoreElements())
                {
                    return;
                }
                s1 = s.nextToken();
            } while (s1.length() <= 0);
            int i = s1.indexOf('=');
            if (i < 0)
            {
                addEntry(s1, "");
            } else
            {
                addEntry(s1.substring(0, i), s1.substring(i + 1));
            }
        } while (true);
    }

    public void parseUrl(String s)
    {
        int i = s.indexOf('?');
        if (i >= 0)
        {
            s = s.substring(i + 1);
        } else
        {
            s = "";
        }
        parseQuery(s);
    }

    public ParameterValuePair.mValue()
    {
        this$0 = AdMarvelVideoActivity.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.skype.SkyLib;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.CountryCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

final class CountriesAdapter extends BaseAdapter
{
    public static class TextViewHolder
    {

        TextView textView;

        public TextViewHolder()
        {
        }
    }

    static final class a
    {

        public int code;
        public int countryId;
        public String isoCode;
        public String title;
        public int type;

        a()
        {
        }
    }


    public static final int COUNTRY_ID_UNKNOWN = -1;
    public static final int ITEM_TYPE_COUNTRY = 2;
    public static final int ITEM_TYPE_LETTER = 1;
    public static final int ITEM_TYPE_TITLE = 0;
    private static final int VIEW_TYPE_COUNT = 3;
    private com.skype.SkyLib.GetISOCountryInfo_Result codes;
    private final ContactUtil contactUtil;
    private Context context;
    private List genericList;
    private List recentList;
    private boolean showCodes;

    public CountriesAdapter(Activity activity, SkyLib skylib, ContactUtil contactutil)
    {
        context = activity;
        genericList = new ArrayList();
        recentList = new ArrayList();
        codes = skylib.getISOCountryInfo();
        contactUtil = contactutil;
    }

    private String getTitle(CountryCode countrycode)
    {
        if (showCodes)
        {
            return contactUtil.b(countrycode);
        } else
        {
            return countrycode.a();
        }
    }

    public final int getCount()
    {
        return genericList.size();
    }

    public final a getItem(int i)
    {
        return (a)genericList.get(i);
    }

    public final volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final int getItemPositionByCountryCodeIndex(int i)
    {
        for (int j = genericList.size() - 1; j >= 0; j--)
        {
            if (((a)genericList.get(j)).countryId == i)
            {
                return j;
            }
        }

        return -1;
    }

    public final int getItemViewType(int i)
    {
        return ((a)genericList.get(i)).type;
    }

    public final boolean getShowCodes()
    {
        return showCodes;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        a a1 = (a)genericList.get(i);
        i = 0x7f03011b;
        int j = 0x7f1001f1;
        if (a1.type == 1)
        {
            i = 0x7f03006e;
            j = 0x7f100305;
        } else
        if (a1.type == 2)
        {
            i = 0x7f03006f;
            j = 0x7f100338;
        }
        if (view == null)
        {
            view = LayoutInflater.from(context).inflate(i, null);
            viewgroup = new TextViewHolder();
            viewgroup.textView = (TextView)view.findViewById(j);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (TextViewHolder)view.getTag();
        }
        ((TextViewHolder) (viewgroup)).textView.setText(a1.title);
        return view;
    }

    public final int getViewTypeCount()
    {
        return 3;
    }

    public final boolean isEnabled(int i)
    {
        return ((a)genericList.get(i)).type == 2;
    }

    public final void setRecents(List list)
    {
        recentList.clear();
        list = list.iterator();
label0:
        do
        {
            if (list.hasNext())
            {
                String s = (String)list.next();
                int i = 0;
                do
                {
                    if (i >= codes.m_countryCodeList.length)
                    {
                        continue label0;
                    }
                    if (codes.m_countryCodeList[i].equals(s))
                    {
                        CountryCode countrycode = new CountryCode(codes.m_countryNameList[i], codes.m_countryCodeList[i], codes.m_countryPrefixList[i]);
                        a a1 = new a();
                        a1.type = 2;
                        a1.title = getTitle(countrycode);
                        a1.countryId = i;
                        a1.code = countrycode.c();
                        a1.isoCode = countrycode.b();
                        recentList.add(a1);
                        continue label0;
                    }
                    i++;
                } while (true);
            }
            update();
            return;
        } while (true);
    }

    public final void setShowCodes(boolean flag)
    {
        showCodes = flag;
    }

    public final void update()
    {
        if (recentList.size() > 0)
        {
            a a1 = new a();
            a1.type = 0;
            a1.title = context.getString(0x7f080311);
            genericList.add(a1);
            for (int i = 0; i < recentList.size(); i++)
            {
                genericList.add(recentList.get(i));
            }

        }
        Object obj = new a();
        obj.type = 0;
        obj.title = context.getString(0x7f08028b);
        genericList.add(obj);
        ArrayList arraylist = new ArrayList(codes.m_countryNameList.length);
        for (int j = 0; j < codes.m_countryNameList.length; j++)
        {
            obj = new CountryCode(codes.m_countryNameList[j], codes.m_countryCodeList[j], codes.m_countryPrefixList[j]);
            a a2 = new a();
            a2.type = 2;
            a2.title = getTitle(((CountryCode) (obj)));
            a2.countryId = j;
            a2.code = ((CountryCode) (obj)).c();
            a2.isoCode = ((CountryCode) (obj)).b();
            arraylist.add(a2);
        }

        Collections.sort(arraylist, new Comparator() {

            final CountriesAdapter this$0;

            public final int compare(a a3, a a4)
            {
                return a3.title.compareTo(a4.title);
            }

            public final volatile int compare(Object obj2, Object obj3)
            {
                return compare((a)obj2, (a)obj3);
            }

            
            {
                this$0 = CountriesAdapter.this;
                super();
            }
        });
        obj = null;
        for (int k = 0; k < arraylist.size(); k++)
        {
            Object obj1 = ((a)arraylist.get(k)).title.substring(0, 1);
            if (!((String) (obj1)).equals(obj))
            {
                obj = new a();
                obj.type = 1;
                obj.title = ((String) (obj1));
                genericList.add(obj);
            }
            obj = obj1;
            obj1 = (a)arraylist.get(k);
            genericList.add(obj1);
        }

    }
}

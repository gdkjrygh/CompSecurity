// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.flow.login;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import dxu;

public final class GenderSelectionHelper
    implements android.widget.AdapterView.OnItemClickListener
{

    public Gender a;
    public dxu b;
    public final AlertDialog c;

    public GenderSelectionHelper(Context context, ViewGroup viewgroup)
    {
        int i = 0;
        super();
        viewgroup = LayoutInflater.from(context).inflate(0x7f03011b, viewgroup, false);
        ListView listview = (ListView)viewgroup.findViewById(0x7f11049d);
        Gender agender[] = Gender.values();
        String as[] = new String[agender.length];
        for (; i < agender.length; i++)
        {
            as[i] = context.getString(agender[i].mResourceId);
        }

        listview.setAdapter(new ArrayAdapter(context, 0x7f030131, as));
        listview.setOnItemClickListener(this);
        c = (new android.app.AlertDialog.Builder(context)).setView(viewgroup).create();
    }

    public final void a(int i)
    {
        if (i < 0 || i >= Gender.values().length)
        {
            a = null;
            if (b != null)
            {
                b.a();
            }
        } else
        {
            a = Gender.values()[i];
            if (b != null)
            {
                b.a(Gender.a(a));
                return;
            }
        }
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a(i);
        c.dismiss();
    }

    private class Gender extends Enum
    {

        private static Gender a;
        private static Gender b;
        private static final Gender c[];
        final int mResourceId;
        public final String mValue;

        static int a(Gender gender)
        {
            return gender.mResourceId;
        }

        public static Gender valueOf(String s)
        {
            return (Gender)Enum.valueOf(com/spotify/mobile/android/service/flow/login/GenderSelectionHelper$Gender, s);
        }

        public static Gender[] values()
        {
            return (Gender[])c.clone();
        }

        static 
        {
            a = new Gender("MALE", 0, "male", 0x7f08017f);
            b = new Gender("FEMALE", 1, "female", 0x7f08017d);
            c = (new Gender[] {
                a, b
            });
        }

        private Gender(String s, int i, String s1, int j)
        {
            super(s, i);
            boolean flag;
            if (!TextUtils.isEmpty(s1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ctz.a(flag, "Gender value must not be empty");
            mValue = s1;
            mResourceId = j;
        }
    }

}

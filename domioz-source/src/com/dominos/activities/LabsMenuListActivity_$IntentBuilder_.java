// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import java.util.ArrayList;
import org.androidannotations.api.a.a;

// Referenced classes of package com.dominos.activities:
//            LabsMenuListActivity_

public class fragmentSupport_ extends a
{

    private android.support.v4.app.Fragment fragmentSupport_;
    private Fragment fragment_;

    public fragmentSupport_ ambiguousProductCode(String s)
    {
        return (fragmentSupport_)super.extra("ambiguousProductCode", s);
    }

    public fragmentSupport_ categories(ArrayList arraylist)
    {
        return (fragmentSupport_)super.extra("categories", arraylist);
    }

    public fragmentSupport_ invokedFromRootMenu(boolean flag)
    {
        return (fragmentSupport_)super.extra("invokedFromRootMenu", flag);
    }

    public void startForResult(int i)
    {
        if (fragmentSupport_ != null)
        {
            fragmentSupport_.startActivityForResult(intent, i);
            return;
        }
        if (fragment_ != null)
        {
            if (android.os.entBuilder_.fragment_ >= 16)
            {
                fragment_.startActivityForResult(intent, i, lastOptions);
                return;
            } else
            {
                fragment_.startActivityForResult(intent, i);
                return;
            }
        }
        if (context instanceof Activity)
        {
            android.support.v4.app.a.a((Activity)context, intent, i, lastOptions);
            return;
        }
        if (android.os.entBuilder_.lastOptions >= 16)
        {
            context.startActivity(intent, lastOptions);
            return;
        } else
        {
            context.startActivity(intent);
            return;
        }
    }

    public intent subcategory(String s)
    {
        return (intent)super.extra("subcategory", s);
    }

    public A(Fragment fragment)
    {
        super(fragment.getActivity(), com/dominos/activities/LabsMenuListActivity_);
        fragment_ = fragment;
    }

    public fragment_(Context context)
    {
        super(context, com/dominos/activities/LabsMenuListActivity_);
    }

    public fragment_(android.support.v4.app.Fragment fragment)
    {
        super(fragment.getActivity(), com/dominos/activities/LabsMenuListActivity_);
        fragmentSupport_ = fragment;
    }
}

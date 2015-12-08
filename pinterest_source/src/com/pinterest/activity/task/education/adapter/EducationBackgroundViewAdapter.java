// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.adapter;

import android.graphics.Bitmap;
import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.pinterest.activity.task.education.fragment.EducationBackgroundPageFragment;
import com.pinterest.activity.task.education.model.EducationBackground;
import com.pinterest.activity.task.education.model.EducationStep;
import com.pinterest.schemas.experiences.EducationBackgroundType;
import java.util.List;

public class EducationBackgroundViewAdapter extends FixedFragmentStatePagerAdapter
{

    private Bitmap _screenShot;
    private List _steps;

    public EducationBackgroundViewAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
    }

    public int getCount()
    {
        if (_steps == null)
        {
            return 0;
        } else
        {
            return _steps.size();
        }
    }

    public Fragment getItem(int i)
    {
        if (_steps == null)
        {
            return null;
        }
        EducationStep educationstep = (EducationStep)_steps.get(i);
        if (educationstep == null)
        {
            return null;
        }
        EducationBackgroundPageFragment educationbackgroundpagefragment = new EducationBackgroundPageFragment(educationstep.getBackground().getUrl());
        if (educationstep.getBackground() != null && educationstep.getBackground().getType() == EducationBackgroundType.REAL_UI.getValue())
        {
            educationbackgroundpagefragment.setImageBitmap(_screenShot);
        }
        return educationbackgroundpagefragment;
    }

    public int getItemPosition(Object obj)
    {
        return -2;
    }

    public void recycleScreenshot()
    {
        if (_screenShot != null)
        {
            _screenShot.recycle();
            _screenShot = null;
        }
        notifyDataSetChanged();
    }

    public void setScreenShot(Bitmap bitmap)
    {
        _screenShot = bitmap;
        notifyDataSetChanged();
    }

    public void setSteps(List list)
    {
        _steps = list;
        notifyDataSetChanged();
    }
}

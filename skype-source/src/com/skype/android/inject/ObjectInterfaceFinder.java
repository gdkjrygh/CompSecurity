// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.skype.ObjectInterface;
import com.skype.android.skylib.ObjectIdMap;

public class ObjectInterfaceFinder
{

    private ObjectIdMap map;

    public ObjectInterfaceFinder(ObjectIdMap objectidmap)
    {
        if (objectidmap == null)
        {
            throw new IllegalArgumentException("Cannot inject ObjectInterface");
        } else
        {
            map = objectidmap;
            return;
        }
    }

    public ObjectInterface get(Class class1, Object obj)
    {
        int i = 0;
        if (obj instanceof Activity)
        {
            i = ((Activity)obj).getIntent().getIntExtra("com.skype.objId", 0);
        } else
        if (obj instanceof Fragment)
        {
            obj = (Fragment)obj;
            if (((Fragment) (obj)).getArguments() != null)
            {
                i = ((Fragment) (obj)).getArguments().getInt("com.skype.objId");
            } else
            if (((Fragment) (obj)).getActivity() != null)
            {
                i = ((Fragment) (obj)).getActivity().getIntent().getIntExtra("com.skype.objId", 0);
            }
        } else
        {
            throw new IllegalArgumentException("Activity or fragment required");
        }
        if (i != 0)
        {
            return map.a(i, class1);
        } else
        {
            return null;
        }
    }
}

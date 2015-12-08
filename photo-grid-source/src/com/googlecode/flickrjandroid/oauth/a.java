// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.oauth;

import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.uploader.ImageParameter;
import java.util.Comparator;

final class a
    implements Comparator
{

    a()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (Parameter)obj;
        obj1 = (Parameter)obj1;
        int i;
        if ((obj instanceof ImageParameter) && !(obj1 instanceof ImageParameter))
        {
            i = 1;
        } else
        {
            if ((obj1 instanceof ImageParameter) && !(obj instanceof ImageParameter))
            {
                return -1;
            }
            int j = ((Parameter) (obj)).getName().compareTo(((Parameter) (obj1)).getName());
            i = j;
            if (j == 0)
            {
                return ((Parameter) (obj)).getValue().toString().compareTo(((Parameter) (obj1)).getValue().toString());
            }
        }
        return i;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.app.Activity;
import android.app.Fragment;
import android.view.View;
import android.view.Window;

final class b
{

    private Object object;
    private View view;

    b(Object obj)
    {
        object = obj;
    }

    public final View find(int i)
    {
        if (view == null)
        {
            if (object instanceof Activity)
            {
                view = ((Activity)object).getWindow().getDecorView();
            } else
            if (object instanceof Fragment)
            {
                view = ((Fragment)object).getView();
            } else
            if (object instanceof android.support.v4.app.Fragment)
            {
                view = ((android.support.v4.app.Fragment)object).getView();
            } else
            if (object instanceof View)
            {
                view = (View)object;
            } else
            {
                throw new UnsupportedOperationException((new StringBuilder("cannot find view source in ")).append(object).toString());
            }
        }
        if (view == null)
        {
            throw new IllegalStateException("no view container");
        } else
        {
            return view.findViewById(i);
        }
    }
}

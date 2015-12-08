// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.dialog;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAlertDialog
{

    private final Activity activity;

    public ImageAlertDialog(Activity activity1)
    {
        activity = activity1;
    }

    private void setBody(View view, String s)
    {
        ((TextView)view.findViewById(0x7f0f0160)).setText(s);
    }

    private void setImage(View view, int i)
    {
        ((ImageView)view.findViewById(0x7f0f015e)).setImageResource(i);
    }

    private void setTitle(View view, String s)
    {
        ((TextView)view.findViewById(0x7f0f015f)).setText(s);
    }

    public android.support.v7.app.AlertDialog.Builder setContent(int i, int j, int k)
    {
        return setContent(i, activity.getString(j), activity.getString(k));
    }

    public android.support.v7.app.AlertDialog.Builder setContent(int i, String s, String s1)
    {
        View view = View.inflate(activity, 0x7f03005f, null);
        setImage(view, i);
        setTitle(view, s);
        setBody(view, s1);
        return (new android.support.v7.app.AlertDialog.Builder(activity)).setView(view);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.view.View;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;

public abstract class a extends android.support.v7.widget.RecyclerView.ViewHolder
{

    protected Context a;

    public a(Context context, View view)
    {
        super(view);
        a = context;
    }

    public abstract void a(int i, WebPhoto webphoto);
}

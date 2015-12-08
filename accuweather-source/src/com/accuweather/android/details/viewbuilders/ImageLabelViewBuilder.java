// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.details.viewbuilders;

import android.content.Context;
import android.view.View;
import com.accuweather.android.enums.LayoutStyleType;

public interface ImageLabelViewBuilder
{

    public abstract View getView(Object obj, Integer integer, Context context, LayoutStyleType layoutstyletype, int i);
}

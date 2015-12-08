// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.instabug;

import android.view.View;
import com.google.android.gms.maps.GoogleMap;
import me.lyft.android.common.INullable;

public interface IInstabugService
    extends INullable
{

    public abstract void addMapView(View view, GoogleMap googlemap);
}

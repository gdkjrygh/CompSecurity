// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import java.util.List;
import me.lyft.android.domain.tooltips.Tooltip;
import me.lyft.android.infrastructure.lyft.constants.AppInfo;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.lyft.constants.RideTypeMeta;

public interface IConstantsProvider
{

    public abstract String getAppInfoRevision();

    public abstract Constants getConstants();

    public abstract RideTypeMeta getRideTypeMetaById(String s);

    public abstract List getRideTypeMetas();

    public abstract Tooltip getTooltip(String s);

    public abstract void saveTooltip(Tooltip tooltip);

    public abstract void update(AppInfo appinfo);
}

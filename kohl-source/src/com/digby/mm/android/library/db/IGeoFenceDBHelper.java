// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.db;

import com.digby.mm.android.library.geofence.IGeoFence;
import java.util.List;
import org.json.JSONObject;

public interface IGeoFenceDBHelper
{

    public abstract void deleteAllGeoFences();

    public abstract void deleteGeoFence(long l);

    public abstract IGeoFence getGeoFence(long l);

    public abstract List getGeoFences();

    public abstract IGeoFence insertGeoFence(JSONObject jsonobject);

    public abstract void updateGeoFence(JSONObject jsonobject);
}

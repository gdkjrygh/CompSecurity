// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.e;

import com.jcp.pojo.Response;
import com.jcp.recommendation.myrecs.Recommendation;
import com.jcp.recommendation.placements.PlacementRecs;
import java.util.List;

// Referenced classes of package com.jcp.e:
//            f

public interface x
    extends f
{

    public abstract void a(int i, Response response);

    public abstract void a(Recommendation recommendation);

    public abstract void a(PlacementRecs placementrecs);

    public abstract void a(List list);
}

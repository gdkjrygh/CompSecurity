// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.model.StoryCollection;
import java.util.List;

public final class ta
{

    public ta()
    {
    }

    public static sZ a(Bk bk, StoryCollection storycollection, List list, boolean flag, MediaOpenOrigin mediaopenorigin)
    {
        if (storycollection == null && list != null)
        {
            return new Bl(bk, list);
        }
        dv.a(storycollection);
        if (storycollection.mAdMetadata != null && storycollection.mAdMetadata.b() != null)
        {
            return new sV(bk, storycollection, flag, mediaopenorigin);
        }
        if (list == null && mediaopenorigin == MediaOpenOrigin.EXPLORER)
        {
            return new AF(bk, storycollection, flag, mediaopenorigin);
        }
        if (list == null)
        {
            return new Bi(bk, storycollection, null, flag, mediaopenorigin);
        } else
        {
            return new sW(bk, storycollection, list);
        }
    }

    public static sZ a(Bk bk, StoryCollection storycollection, boolean flag, MediaOpenOrigin mediaopenorigin)
    {
        return a(bk, storycollection, null, flag, mediaopenorigin);
    }
}

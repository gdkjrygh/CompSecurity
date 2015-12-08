// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.skype.android.ads:
//            AdPlacer, AdPlacement, AdParent

public class EmptyAdPlacer
    implements AdPlacer
{

    public EmptyAdPlacer()
    {
    }

    public final View a(AdPlacement adplacement, Context context)
    {
        return null;
    }

    public final void a(AdParent adparent)
    {
    }

    public final void a(AdParent adparent, AdPlacement adplacement)
    {
    }

    public final void a(AdPlacement adplacement, boolean flag)
    {
    }

    public final boolean a(AdPlacement adplacement, ViewGroup viewgroup)
    {
        return false;
    }

    public final void b(AdParent adparent)
    {
    }

    public final void b(AdPlacement adplacement, boolean flag)
    {
    }

    public final boolean b(AdPlacement adplacement, ViewGroup viewgroup)
    {
        return false;
    }
}

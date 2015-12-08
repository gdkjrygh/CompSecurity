// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.skype.android.ads:
//            AdPlacement, AdParent

public interface AdPlacer
{

    public abstract View a(AdPlacement adplacement, Context context);

    public abstract void a(AdParent adparent);

    public abstract void a(AdParent adparent, AdPlacement adplacement);

    public abstract void a(AdPlacement adplacement, boolean flag);

    public abstract boolean a(AdPlacement adplacement, ViewGroup viewgroup);

    public abstract void b(AdParent adparent);

    public abstract void b(AdPlacement adplacement, boolean flag);

    public abstract boolean b(AdPlacement adplacement, ViewGroup viewgroup);
}

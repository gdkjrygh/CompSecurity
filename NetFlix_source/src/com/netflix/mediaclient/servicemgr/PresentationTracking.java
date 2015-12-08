// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            Trackable, UiLocation

public interface PresentationTracking
{

    public static final String TAG = "nf_presentation";

    public abstract void reportPresentation(Trackable trackable, List list, int i, UiLocation uilocation);
}

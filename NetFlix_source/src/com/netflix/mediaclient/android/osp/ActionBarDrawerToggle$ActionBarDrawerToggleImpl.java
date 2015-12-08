// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.osp;

import android.app.Activity;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.netflix.mediaclient.android.osp:
//            ActionBarDrawerToggle

private static interface Y
{

    public abstract Drawable getThemeUpIndicator(Activity activity);

    public abstract Object setActionBarDescription(Object obj, Activity activity, int i);

    public abstract Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i);
}

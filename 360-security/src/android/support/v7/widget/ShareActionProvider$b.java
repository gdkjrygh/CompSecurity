// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Intent;
import android.support.v7.internal.widget.ActivityChooserModel;

// Referenced classes of package android.support.v7.widget:
//            ShareActionProvider

private class <init>
    implements android.support.v7.internal.widget.nChooseActivityListener
{

    final ShareActionProvider a;

    public boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent)
    {
        if (ShareActionProvider.access$400(a) != null)
        {
            ShareActionProvider.access$400(a).a(a, intent);
        }
        return false;
    }

    private erModel(ShareActionProvider shareactionprovider)
    {
        a = shareactionprovider;
        super();
    }

    a(ShareActionProvider shareactionprovider, a a1)
    {
        this(shareactionprovider);
    }
}

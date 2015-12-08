// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Intent;

// Referenced classes of package android.support.v7.widget:
//            ShareActionProvider, ActivityChooserModel

private class <init>
    implements <init>
{

    final ShareActionProvider this$0;

    public boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent)
    {
        if (ShareActionProvider.access$500(ShareActionProvider.this) != null)
        {
            ShareActionProvider.access$500(ShareActionProvider.this).ShareTargetSelected(ShareActionProvider.this, intent);
        }
        return false;
    }

    private ()
    {
        this$0 = ShareActionProvider.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}

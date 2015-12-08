// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.Intent;

// Referenced classes of package com.actionbarsherlock.widget:
//            ShareActionProvider, ActivityChooserModel

private class <init>
    implements <init>
{

    final ShareActionProvider this$0;

    public boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent)
    {
        if (ShareActionProvider.access$2(ShareActionProvider.this) != null)
        {
            return ShareActionProvider.access$2(ShareActionProvider.this).hareTargetSelected(ShareActionProvider.this, intent);
        } else
        {
            return false;
        }
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

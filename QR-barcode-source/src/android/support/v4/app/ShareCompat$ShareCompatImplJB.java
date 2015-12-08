// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.MenuItem;

// Referenced classes of package android.support.v4.app:
//            ShareCompat, ShareCompatJB

static class  extends 
{

    public String escapeHtml(CharSequence charsequence)
    {
        return ShareCompatJB.escapeHtml(charsequence);
    }

    boolean shouldAddChooserIntent(MenuItem menuitem)
    {
        return false;
    }

    ()
    {
    }
}

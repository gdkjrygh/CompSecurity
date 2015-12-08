// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewConfiguration;

// Referenced classes of package android.support.v4.view:
//            ViewConfigurationCompat, ViewConfigurationCompatICS

static class nImpl extends nImpl
{

    public boolean hasPermanentMenuKey(ViewConfiguration viewconfiguration)
    {
        return ViewConfigurationCompatICS.hasPermanentMenuKey(viewconfiguration);
    }

    nImpl()
    {
    }
}

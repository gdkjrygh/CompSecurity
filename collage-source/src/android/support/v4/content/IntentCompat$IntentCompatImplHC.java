// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;

// Referenced classes of package android.support.v4.content:
//            IntentCompat, IntentCompatHoneycomb

static class e extends e
{

    public Intent makeMainActivity(ComponentName componentname)
    {
        return IntentCompatHoneycomb.makeMainActivity(componentname);
    }

    public Intent makeRestartActivityTask(ComponentName componentname)
    {
        return IntentCompatHoneycomb.makeRestartActivityTask(componentname);
    }

    e()
    {
    }
}

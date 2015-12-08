// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;

// Referenced classes of package android.support.v4.content:
//            IntentCompat

static class 
    implements 
{

    public Intent makeMainActivity(ComponentName componentname)
    {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(componentname);
        intent.addCategory("android.intent.category.LAUNCHER");
        return intent;
    }

    public Intent makeMainSelectorActivity(String s, String s1)
    {
        s = new Intent(s);
        s.addCategory(s1);
        return s;
    }

    public Intent makeRestartActivityTask(ComponentName componentname)
    {
        componentname = makeMainActivity(componentname);
        componentname.addFlags(0x10008000);
        return componentname;
    }

    ()
    {
    }
}

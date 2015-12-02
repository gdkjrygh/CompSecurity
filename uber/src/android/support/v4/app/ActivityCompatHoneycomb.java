// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class ActivityCompatHoneycomb
{

    ActivityCompatHoneycomb()
    {
    }

    static void dump(Activity activity, String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        activity.dump(s, filedescriptor, printwriter, as);
    }

    static void invalidateOptionsMenu(Activity activity)
    {
        activity.invalidateOptionsMenu();
    }
}

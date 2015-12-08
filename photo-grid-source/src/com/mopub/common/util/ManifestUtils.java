// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.widget.Toast;
import com.mopub.common.MoPubBrowser;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.MoPubActivity;
import com.mopub.mobileads.MraidActivity;
import com.mopub.mobileads.MraidVideoPlayerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.mopub.common.util:
//            c, b, VersionCode, Intents, 
//            Utils

public class ManifestUtils
{

    private static final List a;
    private static c b = new c();
    private static final List c;

    private ManifestUtils()
    {
    }

    private static b a(Context context, Class class1)
    {
        ActivityInfo activityinfo = context.getPackageManager().getActivityInfo(new ComponentName(context, class1.getName()), 0);
        b b1 = new b((byte)0);
        b1.hasKeyboardHidden = b.hasFlag(class1, activityinfo.configChanges, 32);
        b1.hasOrientation = b.hasFlag(class1, activityinfo.configChanges, 128);
        b1.hasScreenSize = true;
        if (VersionCode.currentApiLevel().isAtLeast(VersionCode.HONEYCOMB_MR2) && context.getApplicationInfo().targetSdkVersion >= VersionCode.HONEYCOMB_MR2.getApiLevel())
        {
            b1.hasScreenSize = b.hasFlag(class1, activityinfo.configChanges, 1024);
        }
        return b1;
    }

    private static List a(Context context, List list, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Class class1 = (Class)list.next();
            if (Intents.deviceCanHandleIntent(context, new Intent(context, class1)) == flag)
            {
                arraylist.add(class1);
            }
        } while (true);
        return arraylist;
    }

    private static void a(Context context)
    {
        if (isDebuggable(context))
        {
            context = Toast.makeText(context, "ERROR: YOUR MOPUB INTEGRATION IS INCOMPLETE.\nCheck logcat and update your AndroidManifest.xml with the correct activities and configuration.", 1);
            context.setGravity(7, 0, 0);
            context.show();
        }
    }

    private static void a(Context context, List list)
    {
        list = a(context, list, false);
        if (list.isEmpty())
        {
            return;
        }
        a(context);
        context = new StringBuilder("AndroidManifest permissions for the following required MoPub activities are missing:\n");
        Class class1;
        for (list = list.iterator(); list.hasNext(); context.append("\n\t").append(class1.getName()))
        {
            class1 = (Class)list.next();
        }

        context.append("\n\nPlease update your manifest to include them.");
        MoPubLog.w(context.toString());
    }

    private static void b(Context context, List list)
    {
        Object obj;
        obj = c(context, a(context, list, true));
        if (((List) (obj)).isEmpty())
        {
            return;
        }
        a(context);
        list = new StringBuilder("In AndroidManifest, the android:configChanges param is missing values for the following MoPub activities:\n");
        obj = ((List) (obj)).iterator();
_L2:
        Class class1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_182;
        }
        class1 = (Class)((Iterator) (obj)).next();
        b b1 = a(context, class1);
        if (!b1.hasKeyboardHidden)
        {
            list.append((new StringBuilder("\n\tThe android:configChanges param for activity ")).append(class1.getName()).append(" must include keyboardHidden.").toString());
        }
        if (!b1.hasOrientation)
        {
            list.append((new StringBuilder("\n\tThe android:configChanges param for activity ")).append(class1.getName()).append(" must include orientation.").toString());
        }
        if (!b1.hasScreenSize)
        {
            list.append((new StringBuilder("\n\tThe android:configChanges param for activity ")).append(class1.getName()).append(" must include screenSize.").toString());
        }
        continue; /* Loop/switch isn't completed */
        list.append("\n\nPlease update your manifest to include them.");
        MoPubLog.w(list.toString());
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static List c(Context context, List list)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        list = list.iterator();
_L2:
        Class class1;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        class1 = (Class)list.next();
        b b1 = a(context, class1);
        if (!b1.hasKeyboardHidden || !b1.hasOrientation || !b1.hasScreenSize)
        {
            arraylist.add(class1);
        }
        continue; /* Loop/switch isn't completed */
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        if (true) goto _L2; else goto _L1
_L1:
        return arraylist;
    }

    public static void checkNativeActivitiesDeclared(Context context)
    {
        if (!com.mopub.common.Preconditions.NoThrow.checkNotNull(context, "context is not allowed to be null"))
        {
            return;
        } else
        {
            a(context, c);
            b(context, c);
            return;
        }
    }

    public static void checkWebViewActivitiesDeclared(Context context)
    {
        if (!com.mopub.common.Preconditions.NoThrow.checkNotNull(context, "context is not allowed to be null"))
        {
            return;
        } else
        {
            a(context, a);
            b(context, a);
            return;
        }
    }

    public static boolean isDebuggable(Context context)
    {
        return Utils.bitMaskContainsFlag(context.getApplicationInfo().flags, 2);
    }

    static 
    {
        ArrayList arraylist = new ArrayList(4);
        a = arraylist;
        arraylist.add(com/mopub/mobileads/MoPubActivity);
        a.add(com/mopub/mobileads/MraidActivity);
        a.add(com/mopub/mobileads/MraidVideoPlayerActivity);
        a.add(com/mopub/common/MoPubBrowser);
        arraylist = new ArrayList(1);
        c = arraylist;
        arraylist.add(com/mopub/common/MoPubBrowser);
    }
}

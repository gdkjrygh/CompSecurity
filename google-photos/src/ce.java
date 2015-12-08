// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;

public class ce
{

    public static final int A = 0x7f090275;
    public static final int B = 0x7f0903b1;
    public static final int C = 0x7f0903af;
    public static final int D = 0x7f090171;
    public static final int E = 0x7f090389;
    public static final int a = 0x7f0903d3;
    public static final int b = 0x7f0901bf;
    public static final int c = 0x7f090170;
    public static final int d = 0x7f090278;
    public static final int e = 0x7f0900d2;
    public static final int f = 0x7f09009e;
    public static final int g = 0x7f09009f;
    public static final int h = 0x7f0903ae;
    public static final int i = 0x7f09009d;
    public static final int j = 0x7f09009b;
    public static final int k = 0x7f09009a;
    public static final int l = 0x7f0903d1;
    public static final int m = 0x7f090099;
    public static final int n = 0x7f0901d5;
    public static final int o = 0x7f090470;
    public static final int p = 0x7f0903b0;
    public static final int q = 0x7f090471;
    public static final int r = 0x7f0903b2;
    public static final int s = 0x7f090065;
    public static final int t = 0x7f090064;
    public static final int u = 0x7f090068;
    public static final int v = 0x7f090066;
    public static final int w = 0x7f090067;
    public static final int x = 0x7f090229;
    public static final int y = 0x7f09025d;
    public static final int z = 0x7f0903e0;

    ce()
    {
    }

    public Intent a(Activity activity)
    {
        String s1 = cd.c(activity);
        if (s1 == null)
        {
            return null;
        }
        ComponentName componentname = new ComponentName(activity, s1);
        try
        {
            if (cd.b(activity, componentname) == null)
            {
                return ee.a(componentname);
            }
            activity = (new Intent()).setComponent(componentname);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            Log.e("NavUtils", (new StringBuilder("getParentActivityIntent: bad parentActivityName '")).append(s1).append("' in manifest").toString());
            return null;
        }
        return activity;
    }

    public String a(Context context, ActivityInfo activityinfo)
    {
        if (activityinfo.metaData == null)
        {
            activityinfo = null;
        } else
        {
            String s1 = activityinfo.metaData.getString("android.support.PARENT_ACTIVITY");
            if (s1 == null)
            {
                return null;
            }
            activityinfo = s1;
            if (s1.charAt(0) == '.')
            {
                return (new StringBuilder()).append(context.getPackageName()).append(s1).toString();
            }
        }
        return activityinfo;
    }

    public boolean a(Activity activity, Intent intent)
    {
        activity = activity.getIntent().getAction();
        return activity != null && !activity.equals("android.intent.action.MAIN");
    }

    public void b(Activity activity, Intent intent)
    {
        intent.addFlags(0x4000000);
        activity.startActivity(intent);
        activity.finish();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;

class ActivityCompatApi23
{

    ActivityCompatApi23()
    {
    }

    public static void requestPermissions(Activity activity, String as[], int i)
    {
        if (activity instanceof RequestPermissionsRequestCodeValidator)
        {
            ((RequestPermissionsRequestCodeValidator)activity).validateRequestPermissionsRequestCode(i);
        }
        activity.requestPermissions(as, i);
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String s)
    {
        return activity.shouldShowRequestPermissionRationale(s);
    }

    private class RequestPermissionsRequestCodeValidator
    {

        public abstract void validateRequestPermissionsRequestCode(int i);
    }

}

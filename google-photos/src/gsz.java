// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.ComponentName;
import com.google.android.apps.photos.permissions.runtime.NoPermissionsActivity;
import com.google.android.apps.photos.permissions.runtime.RuntimePermissionsActivity;

final class gsz
    implements omm
{

    gsz()
    {
    }

    private static boolean a(ComponentName componentname)
    {
        boolean flag = false;
        try
        {
            componentname = Class.forName(componentname.getClassName());
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            return false;
        }
        if (ome.isAssignableFrom(componentname) || omr.isAssignableFrom(componentname) || olz.isAssignableFrom(componentname) || omc.isAssignableFrom(componentname))
        {
            flag = true;
        }
        return flag;
    }

    public final void a(Activity activity, opd opd)
    {
        ComponentName componentname;
        if (!(activity instanceof RuntimePermissionsActivity) && !(activity instanceof NoPermissionsActivity))
        {
            if ((componentname = activity.getCallingActivity()) == null || !componentname.getPackageName().equals(activity.getPackageName()) || !a(componentname))
            {
                new gsw(activity, opd);
                return;
            }
        }
    }
}

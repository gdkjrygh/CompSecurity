// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import com.roidapp.cloudlib.al;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            UploadManagerActivity

final class g
    implements android.view.View.OnClickListener
{

    final UploadManagerActivity a;

    g(UploadManagerActivity uploadmanageractivity)
    {
        a = uploadmanageractivity;
        super();
    }

    public final void onClick(View view)
    {
label0:
        {
            view = ((ActivityManager)a.getSystemService("activity")).getRunningTasks(10);
            if (view != null)
            {
                view = view.iterator();
                ComponentName componentname;
                Object obj;
                do
                {
                    do
                    {
                        if (!view.hasNext())
                        {
                            break label0;
                        }
                        obj = (android.app.ActivityManager.RunningTaskInfo)view.next();
                    } while (obj == null);
                    componentname = ((android.app.ActivityManager.RunningTaskInfo) (obj)).baseActivity;
                    obj = ((android.app.ActivityManager.RunningTaskInfo) (obj)).topActivity;
                } while (componentname == null || obj == null || !com/roidapp/cloudlib/upload/UploadManagerActivity.getName().equals(((ComponentName) (obj)).getClassName()) || componentname.equals(obj));
                a.finish();
            }
            return;
        }
        a.startActivity(new Intent(a, al.g().a()));
        a.finish();
    }
}

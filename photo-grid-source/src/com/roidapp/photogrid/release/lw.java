// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import com.roidapp.photogrid.common.ae;
import com.roidapp.photogrid.common.y;
import java.io.File;
import java.io.OutputStream;

// Referenced classes of package com.roidapp.photogrid.release:
//            PathSelector

final class lw
    implements android.view.View.OnClickListener
{

    final PathSelector a;

    lw(PathSelector pathselector)
    {
        a = pathselector;
        super();
    }

    public final void onClick(View view)
    {
        view = new File(PathSelector.a(a).getAbsolutePath(), "test.jpg");
        boolean flag1 = view.createNewFile();
        boolean flag;
        if (!flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L2:
        if (android.os.Build.VERSION.SDK_INT == 19 && flag)
        {
            try
            {
                OutputStream outputstream = (new ae(a.getContentResolver(), view)).b();
                outputstream.write("photogrid".getBytes());
                outputstream.flush();
                outputstream.close();
            }
            catch (Exception exception1)
            {
                if (view.exists())
                {
                    view.delete();
                }
                exception1.printStackTrace();
                y.a(a, PathSelector.a(a).getAbsolutePath(), true);
                return;
            }
        }
        if (!flag)
        {
            view.delete();
            Exception exception;
            if (!PathSelector.b(a))
            {
                view = new Intent();
                Bundle bundle = new Bundle();
                String s = PathSelector.a(a).getAbsolutePath();
                PreferenceManager.getDefaultSharedPreferences(a).edit().putString("SAVEPATH", s).apply();
                bundle.putString("file", s);
                view.putExtras(bundle);
                a.setResult(52226, view);
                a.finish();
                return;
            } else
            {
                view = new Intent();
                Bundle bundle1 = new Bundle();
                String s1 = PathSelector.a(a).getAbsolutePath();
                PreferenceManager.getDefaultSharedPreferences(a).edit().putString("SAVEPATH", s1).apply();
                bundle1.putString("file", s1);
                view.putExtras(bundle1);
                a.setResult(52226, view);
                a.finish();
                return;
            }
        } else
        {
            y.a(a, PathSelector.a(a).getAbsolutePath(), false);
            return;
        }
        exception;
        exception.printStackTrace();
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
    }
}

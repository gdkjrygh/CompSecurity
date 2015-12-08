// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.dropbox;

import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.roidapp.cloudlib.at;

// Referenced classes of package com.roidapp.cloudlib.dropbox:
//            l, DropBoxPhotoFragment

final class m
    implements Runnable
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public final void run()
    {
        if (a.e.getActivity() != null && !a.e.getActivity().isFinishing())
        {
            Toast.makeText(a.e.getActivity(), a.e.getString(at.T), 1).show();
        }
    }
}

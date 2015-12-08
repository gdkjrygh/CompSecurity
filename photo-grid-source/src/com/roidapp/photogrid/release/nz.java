// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.os.Environment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Toast;

// Referenced classes of package com.roidapp.photogrid.release:
//            nn, PathSelector

final class nz
    implements android.view.View.OnClickListener
{

    final nn a;

    nz(nn nn1)
    {
        a = nn1;
        super();
    }

    public final void onClick(View view)
    {
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            view = new Intent(nn.c(a), com/roidapp/photogrid/release/PathSelector);
            view.putExtra("isFromDialogFragment", true);
            a.getActivity().startActivityForResult(view, 52225);
            return;
        } else
        {
            Toast.makeText(nn.c(a), 0x7f07028d, 1).show();
            return;
        }
    }
}

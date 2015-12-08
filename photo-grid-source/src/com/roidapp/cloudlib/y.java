// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.TextView;
import com.roidapp.baselib.b.p;
import java.io.File;

// Referenced classes of package com.roidapp.cloudlib:
//            t, at, ae

final class y
    implements p
{

    final String a;
    final t b;

    y(t t1, String s)
    {
        b = t1;
        a = s;
        super();
    }

    public final void a(int i)
    {
        if (b.m != null)
        {
            b.m.setText((new StringBuilder()).append(i).append("%").toString());
        }
    }

    public final void a(String s, Exception exception)
    {
        if (b.isAdded())
        {
            b.b(b.getString(at.c));
        }
        if (!a.equals("DropBoxPhotoFragment") && !a.equals("FbPhotoFragment") && !a.equals("FlickrPhotoFragment"))
        {
            a.equals("InstagramPhotoFragment");
        }
    }

    public final void a(String s, String s1)
    {
        (new StringBuilder("image download finish, url=")).append(s).append(", savePath=").append(s1);
        if (b.f != null && s1 != null)
        {
            b.f.dismiss();
        }
        if (b.j != null)
        {
            b.j.a(s1);
        }
        if (!TextUtils.isEmpty(s1))
        {
            s = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            s.setData(Uri.fromFile(new File(s1)));
            b.getActivity().sendBroadcast(s);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import com.roidapp.baselib.b.p;
import com.roidapp.cloudlib.ad;
import com.roidapp.cloudlib.ae;
import com.roidapp.cloudlib.at;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.roidapp.cloudlib.google:
//            SearchPhotoFragment

final class o
    implements p
{

    final SearchPhotoFragment a;

    o(SearchPhotoFragment searchphotofragment)
    {
        a = searchphotofragment;
        super();
    }

    public final void a(int i)
    {
        if (SearchPhotoFragment.m(a) != null && i > 0)
        {
            SearchPhotoFragment.n(a).setText((new StringBuilder()).append(i).append("%").toString());
        }
    }

    public final void a(String s, Exception exception)
    {
        if (!(exception instanceof IOException)) goto _L2; else goto _L1
_L1:
        Log.w("SearchPhotoFragment", (new StringBuilder("download ")).append(s).append(" network failed, ").append(exception.getMessage()).append(", try to download small url").toString());
        if (SearchPhotoFragment.c(a) == null || SearchPhotoFragment.d(a) >= SearchPhotoFragment.e(a).getCount()) goto _L4; else goto _L3
_L3:
        exception = SearchPhotoFragment.g(a).a(SearchPhotoFragment.f(a));
        if (exception != null && !s.equals(exception)) goto _L6; else goto _L5
_L5:
        if (a.isAdded())
        {
            a.b(a.getString(at.b));
        }
_L4:
        return;
_L6:
        SearchPhotoFragment.h(a);
        a.a(exception);
        return;
_L2:
        if (a.isAdded())
        {
            a.b(a.getString(at.c));
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public final void a(String s, String s1)
    {
        (new StringBuilder("image download finish, url=")).append(s).append(", savePath=").append(s1);
        if (s1 != null && SearchPhotoFragment.i(a) != null)
        {
            SearchPhotoFragment.j(a).dismiss();
        }
        if (SearchPhotoFragment.k(a) != null)
        {
            SearchPhotoFragment.l(a).a(s1);
        }
        if (!TextUtils.isEmpty(s1))
        {
            s = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            s.setData(Uri.fromFile(new File(s1)));
            a.getActivity().sendBroadcast(s);
        }
    }
}

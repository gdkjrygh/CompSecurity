// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ListView;
import com.qihoo.security.locale.widget.LocaleTextView;
import java.util.ArrayList;

// Referenced classes of package com.qihoo.security.gamebooster:
//            AddGamesActivity, a

private class b extends AsyncTask
{

    final AddGamesActivity a;
    private Context b;

    protected transient Void a(Void avoid[])
    {
        a.a(b);
        return null;
    }

    protected void a(Void void1)
    {
        if (a.C == null || a.C.size() == 0)
        {
            AddGamesActivity.d(a).setEmptyView(AddGamesActivity.c(a));
            AddGamesActivity.b(a).setVisibility(8);
        } else
        {
            AddGamesActivity.d(a).setAdapter(AddGamesActivity.e(a));
            AddGamesActivity.e(a).a(a.C);
            AddGamesActivity.e(a).notifyDataSetChanged();
            AddGamesActivity.b(a).setVisibility(0);
        }
        AddGamesActivity.a(a).setVisibility(8);
        AddGamesActivity.a(a, null);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    protected void onPreExecute()
    {
        AddGamesActivity.a(a).setVisibility(0);
        AddGamesActivity.b(a).setVisibility(8);
    }

    public (AddGamesActivity addgamesactivity, Context context)
    {
        a = addgamesactivity;
        super();
        b = context;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.app.FragmentActivity;
import com.pandora.android.Main;
import com.pandora.android.provider.a;
import com.pandora.android.util.e;

// Referenced classes of package p.ca:
//            h

class s.AsyncTask extends AsyncTask
{

    final h a;

    protected transient Void a(Void avoid[])
    {
        avoid = com.pandora.android.provider.a.a().a(h.b(a));
        e.a(a.getActivity()).d(a.getActivity(), avoid);
        return null;
    }

    protected void a(Void void1)
    {
        p.df.a.a("AlarmSnoozeFragment", "AlarmSnoozeFragment - alarm dismissed, finishing activity and starting Main");
        a.startActivity(new Intent(a.getActivity(), com/pandora/android/Main));
        a.getActivity().finish();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    .Object(h h1)
    {
        a = h1;
        super();
    }
}

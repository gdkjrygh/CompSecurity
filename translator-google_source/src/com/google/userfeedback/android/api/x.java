// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import java.util.List;

// Referenced classes of package com.google.userfeedback.android.api:
//            UserFeedbackActivity, m, z, i, 
//            ah, h

final class x extends AsyncTask
{

    final UserFeedbackActivity a;
    private Spinner b;
    private Button c;
    private Context d;

    public x(UserFeedbackActivity userfeedbackactivity, Context context, Spinner spinner, Button button)
    {
        a = userfeedbackactivity;
        super();
        d = context;
        b = spinner;
        c = button;
    }

    private transient Void a()
    {
        if (!UserFeedbackActivity.d(a).a())
        {
            UserFeedbackActivity.d(a).b();
        }
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        int l = 0;
        b.setEnabled(true);
        String s;
        String s1;
        String as[];
        int j;
        int k;
        int i1;
        try
        {
            obj = (String[])UserFeedbackActivity.d(a).g.C.toArray(new String[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = new String[0];
        }
        as = new String[obj.length + 1];
        as[0] = d.getString(i.gf_anonymous);
        s = "";
        s1 = UserFeedbackActivity.d(a).a.j;
        i1 = obj.length;
        j = 0;
        k = 0;
        for (; j < i1; j++)
        {
            String s2 = obj[j];
            k++;
            as[k] = s2;
            if (s2.equals(s1))
            {
                l = k;
                s = s1;
            }
        }

        obj = new ArrayAdapter(d, h.gf_userfeedback_account_spinner, as);
        ((ArrayAdapter) (obj)).setDropDownViewResource(0x1090009);
        b.setAdapter(((android.widget.SpinnerAdapter) (obj)));
        b.setSelection(l);
        UserFeedbackActivity.d(a).g.E = s;
        c.setEnabled(true);
    }

    protected final void onPreExecute()
    {
        c.setEnabled(false);
        b.setEnabled(false);
    }
}

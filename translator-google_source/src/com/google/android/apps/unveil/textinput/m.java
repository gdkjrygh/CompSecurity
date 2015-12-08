// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.apps.gsa.a.a.e;
import com.google.android.apps.unveil.env.af;
import com.google.android.goggles.a.a;
import com.google.android.goggles.b.b;
import com.google.android.goggles.b.c;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            TextInput

public final class m extends AsyncTask
{

    final ArrayList a;
    final TextInput b;

    public m(TextInput textinput, ArrayList arraylist)
    {
        b = textinput;
        a = arraylist;
        super();
    }

    private transient Void a()
    {
        try
        {
            Object obj = TextInput.h(b);
            com.google.g.a.a.m m1 = TextInput.i(b);
            ArrayList arraylist = a;
            b b1 = new b();
            obj = new e(((Context) (obj)).getApplicationContext(), b1, new a(m1.d, m1.e), new com.google.android.apps.gsa.shared.util.a.b());
            b1.a = ((e) (obj));
            ((e) (obj)).a(new c(arraylist));
            TextInput.n().a("Successfully sent logs.", new Object[0]);
        }
        catch (IOException ioexception)
        {
            af af1 = TextInput.n();
            String s = String.valueOf(ioexception.getMessage());
            if (s.length() != 0)
            {
                s = "Exception when sending logs: ".concat(s);
            } else
            {
                s = new String("Exception when sending logs: ");
            }
            af1.e(s, new Object[0]);
        }
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }
}

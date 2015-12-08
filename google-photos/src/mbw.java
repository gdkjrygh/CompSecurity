// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mbw
{

    public final GoogleHelp a;
    public kou b;
    public boolean c;

    public mbw(String s)
    {
        a = GoogleHelp.a(s);
    }

    public Intent a(Context context)
    {
        if (c)
        {
            throw new IllegalStateException("Cannot call buildHelpIntent twice");
        }
        c = true;
        if (b != null)
        {
            GoogleHelp googlehelp = a;
            googlehelp.v = lao.a(b.a(), context.getCacheDir());
            googlehelp.v.Y = "GoogleHelp";
        }
        context = a;
        return (new Intent("com.google.android.gms.googlehelp.HELP")).setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", context);
    }

    public kou a()
    {
        if (b == null)
        {
            b = new kou();
        }
        return b;
    }

    public mbw a(Account account)
    {
        a.c = account;
        return this;
    }

    public mbw a(Activity activity)
    {
        a(GoogleHelp.a(activity));
        return this;
    }

    public mbw a(Bitmap bitmap)
    {
        a().a = bitmap;
        return this;
    }

    public mbw a(Uri uri)
    {
        a.q = uri;
        return this;
    }

    public mbw a(Map map)
    {
        GoogleHelp googlehelp = a;
        googlehelp.d = new Bundle();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); googlehelp.d.putString((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return this;
    }
}

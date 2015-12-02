// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.about;

import android.content.res.Resources;
import android.os.Bundle;
import android.webkit.WebView;
import com.facebook.base.activity.i;
import com.facebook.k;
import com.facebook.n;
import com.facebook.widget.titlebar.c;
import java.io.IOException;
import java.io.InputStream;

public class MessengerAboutLicenseActivity extends i
{

    public MessengerAboutLicenseActivity()
    {
    }

    private String c(int j)
    {
        InputStream inputstream = getResources().openRawResource(j);
        byte abyte0[] = new byte[inputstream.available()];
        inputstream.read(abyte0);
        String s = new String(abyte0, "UTF-8");
        inputstream.close();
        return s;
    }

    protected void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(k.about_license);
        com.facebook.widget.titlebar.c.a(this);
        try
        {
            ((WebView)b(com.facebook.i.wv)).loadDataWithBaseURL(null, c(n.orca_license), "text/txt", "utf-8", null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return;
        }
    }
}

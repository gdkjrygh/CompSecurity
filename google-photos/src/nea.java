// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Layout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.libraries.social.licenses.LicenseActivity;

public final class nea
    implements Runnable
{

    private int a;
    private ScrollView b;
    private LicenseActivity c;

    public nea(LicenseActivity licenseactivity, int i, ScrollView scrollview)
    {
        c = licenseactivity;
        a = i;
        b = scrollview;
        super();
    }

    public final void run()
    {
        TextView textview = (TextView)c.findViewById(b.Gc);
        int i = textview.getLayout().getLineForOffset(a);
        i = textview.getLayout().getLineTop(i);
        b.scrollTo(0, i);
    }
}

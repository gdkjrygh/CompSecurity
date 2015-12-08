// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.os.Bundle;
import android.widget.TextView;
import com.roidapp.photogrid.release.ParentActivity;

// Referenced classes of package com.roidapp.photogrid.common:
//            cc

public class JoinAndroidBeta extends ParentActivity
{

    private TextView a;
    private TextView b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    public JoinAndroidBeta()
    {
        c = "Join the Android Beta!";
        d = "Photo Grid's Android beta allows you to gain early access to new builds of Photo Grid - Collage Maker before they're released. As a beta tester, you'll receive updated Photo Grid versions periodically. In turn, you'll be able to give us feedback and suggestions, helping us create an even better app.";
        e = "To sign up and install the latest beta:";
        f = "Join our Google+ community.\n(https://plus.google.com/u/0/communities/112943284561729274147 )\n(Make sure you join using the same email you use to access Google Play.)";
        g = "Go to this Google Play link, \n(https://play.google.com/apps/testing/com.roidapp.photogrid)\nthen select \"Become a Tester\" to opt into the program.\n";
        h = "Wait for at least an hour to give Google Play time to update, then uninstall and reinstall Photo Grid. This app will automatically stay updated with future beta versions just like any other Android app.\nOnce installed, spend some time with the app and let us know what you think by posting in the Photo Grid Google+ community or by contacting us at roidapp@gmail.com. Your feedback on both functionality and performance is extremely valuable, and we'll be listening closely and basing future updates on your ideas. The more feedback we receive, the better Photo Grid for Android will be!";
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        try
        {
            setContentView(0x7f0300d9);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            v = true;
            (new cc(this)).a();
        }
        if (!v)
        {
            b = (TextView)findViewById(0x7f0d0390);
            b.setText(c);
            a = (TextView)findViewById(0x7f0d0391);
            a.setText((new StringBuilder()).append(d).append("\n\n").append(e).append("\n\n").append(f).append("\n\n").append(g).append("\n\n").append(h).toString());
        }
    }

    public final void x()
    {
    }
}

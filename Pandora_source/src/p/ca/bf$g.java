// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.Intent;
import android.view.View;
import com.pandora.android.activity.InAppLandingPageActivity;
import com.pandora.android.data.l;
import com.pandora.radio.data.b;
import p.df.a;

// Referenced classes of package p.ca:
//            bf

private class b
    implements android.view.OnClickListener
{

    final bf a;
    private String b;

    public void onClick(View view)
    {
        try
        {
            p.ca.bf.a(a, true);
            view = new Intent(a.f, com/pandora/android/activity/InAppLandingPageActivity);
            view.putExtras(InAppLandingPageActivity.a(new l(new b(), b, null, -1, com.pandora.android.data., null), true));
            view.putExtra("intent_back_to_video_action", true);
            a.startActivityForResult(view, 124);
            a.a(com.pandora.radio.util., -1L, com.pandora.android.ads.AdManager.b.m.toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            p.df.a.c("VIDEO AD", (new StringBuilder()).append("failed to open moreinfo: ").append(b).toString());
        }
    }

    public String(bf bf1, String s)
    {
        a = bf1;
        super();
        b = s;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import android.webkit.WebView;
import com.pandora.android.activity.BaseFragmentActivity;
import com.pandora.android.provider.b;
import com.pandora.android.tablet.TabletHome;
import org.json.JSONObject;
import p.cp.d;

// Referenced classes of package p.ca:
//            bb

public class bc extends bb
{
    private class a extends bb.b
    {

        final bc b;

        protected void a(JSONObject jsonobject)
        {
            super.a(jsonobject);
            p.df.a.c("TrackInfoTabletFragment", "Tablet SendEvent triggered!");
            if (jsonobject.optBoolean("showLess"))
            {
                jsonobject = b.getActivity();
                if (jsonobject instanceof TabletHome)
                {
                    ((TabletHome)jsonobject).an();
                }
            }
        }

        public a(BaseFragmentActivity basefragmentactivity, WebView webview)
        {
            b = bc.this;
            super(bc.this, basefragmentactivity, webview);
        }
    }


    public bc()
    {
    }

    public static bb d(boolean flag)
    {
        bc bc1 = new bc();
        Bundle bundle = a(flag);
        bundle.putInt("intent_color", b.a.h().getResources().getColor(0x7f0b00d5));
        bc1.setArguments(bundle);
        return bc1;
    }

    protected d a(BaseFragmentActivity basefragmentactivity, WebView webview)
    {
        return new a(basefragmentactivity, webview);
    }
}

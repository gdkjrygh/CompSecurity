// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.media.MediaPlayer;
import android.widget.MediaController;

// Referenced classes of package com.jirbo.adcolony:
//            e

class 
    implements android.media.aPlayer.OnErrorListener
{

    final e a;

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        (new StringBuilder("Error: ")).append(i).append(",").append(j);
        a.o = -1;
        a.p = -1;
        if (a.w != null)
        {
            a.w.hide();
        }
        while (a.A != null && a.A.onError(a.r, i, j) || a.getWindowToken() == null) 
        {
            return true;
        }
        a.b().getResources();
        class _cls1
            implements android.content.DialogInterface.OnClickListener
        {

            final e._cls4 a;

            public void onClick(DialogInterface dialoginterface, int k)
            {
                if (a.a.x != null)
                {
                    a.a.x.onCompletion(a.a.r);
                }
            }

            _cls1()
            {
                a = e._cls4.this;
                super();
            }
        }

        if (i == 200)
        {
            mediaplayer = "Invalid progressive playback";
        } else
        {
            mediaplayer = "Unknown error";
        }
        (new android.app.tDialog.Builder(a.b())).setTitle("ERROR").setMessage(mediaplayer).setPositiveButton("OKAY", new _cls1()).setCancelable(false).show();
        return true;
    }

    er(e e1)
    {
        a = e1;
        super();
    }
}

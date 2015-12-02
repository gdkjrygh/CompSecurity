// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.net.Uri;
import android.os.Handler;
import android.widget.Toast;
import com.facebook.common.time.c;
import com.facebook.o;
import com.facebook.orca.d.ao;
import com.facebook.orca.d.aq;
import com.facebook.orca.d.aw;

// Referenced classes of package com.facebook.orca.compose:
//            AudioComposerView, f, h

class e
    implements ao
{

    final Handler a;
    final AudioComposerView b;
    private Runnable c;

    e(AudioComposerView audiocomposerview, Handler handler)
    {
        b = audiocomposerview;
        a = handler;
        super();
    }

    public void a()
    {
        AudioComposerView.b(b, true);
        if (AudioComposerView.j(b))
        {
            AudioComposerView.b(b);
        }
        AudioComposerView.k(b).c();
        AudioComposerView.a(b, com.facebook.common.time.c.b().a());
        c = new f(this);
        a.post(c);
    }

    public void a(Uri uri)
    {
        a.removeCallbacks(c);
        if (uri != null)
        {
            AudioComposerView.a(b, uri);
        }
        AudioComposerView.e(b);
    }

    public void a(Uri uri, int i)
    {
        com.facebook.orca.compose.AudioComposerView.c(b).a(uri);
        a.removeCallbacks(c);
        AudioComposerView.k(b).a(i);
        AudioComposerView.l(b).c();
        AudioComposerView.a(b, 0);
    }

    public void b()
    {
        if (c != null)
        {
            a.removeCallbacks(c);
        }
        b.removeCallbacks(AudioComposerView.m(b));
        AudioComposerView.e(b);
    }

    public void c()
    {
        Toast.makeText(b.getContext(), o.audio_recording_attachment_error, 0).show();
    }
}

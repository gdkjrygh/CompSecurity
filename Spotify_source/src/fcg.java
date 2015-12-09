// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.lang.ref.WeakReference;

public final class fcg
{

    final gou a;
    gpi b;
    private WeakReference c;

    public fcg(Context context)
    {
        c = new WeakReference(context);
        dmz.a(gow);
        a = gow.a(context, new gpi() {

            private fcg a;

            public final void a(RadioStationsModel radiostationsmodel)
            {
                if (a.b != null)
                {
                    a.b.a(radiostationsmodel);
                }
            }

            public final void a(gpg gpg)
            {
                if (a.b != null)
                {
                    a.b.a(gpg);
                }
            }

            public final void p()
            {
                if (a.b != null)
                {
                    a.b.p();
                }
            }

            
            {
                a = fcg.this;
                super();
            }
        });
        dmz.a(fos);
    }

    public final void a()
    {
        a.b();
        b = null;
    }

    public final void a(ThumbState thumbstate)
    {
        Context context = (Context)c.get();
        if (context == null)
        {
            return;
        } else
        {
            fos.a(context, thumbstate.equals(ThumbState.b));
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.res.ColorStateList;
import android.view.View;
import com.spotify.android.paste.widget.SpotifyIconView;

public final class era
{

    public static void a(SpotifyIconView spotifyiconview)
    {
        int ai[] = {
            0x10102fe
        };
        int i = gcg.b(spotifyiconview.getContext(), 0x7f0f00b9);
        int j = gcg.b(spotifyiconview.getContext(), 0x7f0f007c);
        spotifyiconview.a(new ColorStateList(new int[][] {
            ai, new int[] {
                0xfefefd02
            }
        }, new int[] {
            i, j
        }));
    }

    public static void a(fyl fyl1)
    {
        while (fyl1 == null || fyl1.k() == null || fyl1.y_()) 
        {
            return;
        }
        fyl1.k().finish();
    }

    // Unreferenced inner class era$1

/* anonymous class */
    public final class _cls1
        implements android.view.View.OnClickListener
    {

        private eqz a;

        public final void onClick(View view)
        {
            era.a(a);
        }

            public 
            {
                a = eqz;
                super();
            }
    }


    // Unreferenced inner class era$2

/* anonymous class */
    public final class _cls2
        implements android.view.View.OnClickListener
    {

        private eqz a;

        public final void onClick(View view)
        {
            if (a.G())
            {
                a.H();
            }
        }

            public 
            {
                a = eqz1;
                super();
            }
    }


    // Unreferenced inner class era$3

/* anonymous class */
    public final class _cls3
        implements android.view.View.OnClickListener
    {

        private Activity a;

        public final void onClick(View view)
        {
            a.finish();
        }

            public 
            {
                a = activity;
                super();
            }
    }

}

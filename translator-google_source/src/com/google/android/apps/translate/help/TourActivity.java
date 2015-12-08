// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.help;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.de;
import android.view.View;
import android.widget.Button;
import com.google.android.apps.translate.j;
import com.google.android.apps.translate.l;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;

// Referenced classes of package com.google.android.apps.translate.help:
//            e, d

public class TourActivity extends FragmentActivity
    implements de
{

    private static final int i[];
    private static final int j[];
    private static final int k[];
    private static final int l[];
    private static final int m[];
    private static final int n[];
    private static final int o[];
    private int p;
    private int q[];
    private int r[];
    private int s;
    private com.google.android.apps.translate.help.e t;
    private boolean u;

    public TourActivity()
    {
        s = 0;
    }

    static int[] a(TourActivity touractivity)
    {
        return touractivity.q;
    }

    static int[] b(TourActivity touractivity)
    {
        return touractivity.r;
    }

    static int c(TourActivity touractivity)
    {
        return touractivity.s;
    }

    public final void a(int i1)
    {
        StringBuilder stringbuilder;
        byte byte0 = 0;
        Object obj;
        int j1;
        if (i1 >= q.length - 1)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        obj = findViewById(0x102001a);
        if (j1 != 0)
        {
            byte0 = 8;
        }
        ((View) (obj)).setVisibility(byte0);
        obj = (Button)findViewById(0x1020019);
        if (j1 != 0)
        {
            j1 = r.label_done;
        } else
        {
            j1 = r.label_skip;
        }
        ((Button) (obj)).setText(j1);
        obj = Singleton.b();
        stringbuilder = new StringBuilder();
        p;
        JVM INSTR tableswitch 1 3: default 108
    //                   1 146
    //                   2 156
    //                   3 166;
           goto _L1 _L2 _L3 _L4
_L1:
        stringbuilder.append("TourUnknown");
_L6:
        stringbuilder.append(i1 + 1);
        ((e) (obj)).c(stringbuilder.toString());
        return;
_L2:
        stringbuilder.append("TourSpeech");
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuilder.append("TourWordLens");
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append("TourCamera");
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(int i1, float f)
    {
    }

    public final void b(int i1)
    {
    }

    public void onBackPressed()
    {
        Singleton.b().a(Event.TOUR_COMPLETED, null, null, t.b());
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(o.tour_activity);
        u = com.google.android.libraries.translate.e.o.d();
        p = getIntent().getIntExtra("tour_type", -1);
        p;
        JVM INSTR tableswitch 1 3: default 64
    //                   1 106
    //                   2 132
    //                   3 158;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_158;
_L5:
        if (u)
        {
            bundle = new d(this, findViewById(m.pager));
        } else
        {
            bundle = new com.google.android.apps.translate.help.e(this, findViewById(m.pager));
        }
        t = bundle;
        t.c(0);
        a(0);
        return;
_L2:
        q = j;
        r = k;
        s = i[1];
          goto _L5
_L3:
        q = n;
        r = o;
        s = i[2];
          goto _L5
        q = l;
        r = m;
        s = i[3];
          goto _L5
    }

    public void onGoToTranslateClicked(View view)
    {
        view = new Intent();
        view.putExtras(getIntent());
        setResult(-1, view);
        com.google.android.libraries.translate.core.b.b(this, p);
        finish();
    }

    public void onNextSlideClicked(View view)
    {
        t.c(t.b() + 1);
    }

    protected void onStart()
    {
        super.onStart();
        switch (p)
        {
        default:
            return;

        case 1: // '\001'
            Singleton.b().c("tour_speech");
            return;

        case 2: // '\002'
            Singleton.b().c("tour_camera");
            return;

        case 3: // '\003'
            Singleton.b().c("tour_photo");
            break;
        }
    }

    static 
    {
        i = (new int[] {
            0, j.bg_tour_speech, j.bg_tour_instant, j.bg_tour_photo
        });
        j = (new int[] {
            l.tour_speech_01, l.tour_speech_02, l.tour_speech_03, l.tour_speech_04, l.tour_speech_05, l.tour_speech_06
        });
        k = (new int[] {
            r.caption_tour_speech_3, r.caption_tour_speech_4, r.caption_speechtour_listen_both, r.caption_speechtour_speak_either_lang, r.caption_speechtour_pick_specific_lang, r.caption_speechtour_speak_into_mic
        });
        l = (new int[] {
            l.tour_photo_01, l.tour_photo_02, l.tour_photo_03, l.tour_photo_04, l.tour_photo_05, l.tour_photo_06
        });
        m = (new int[] {
            r.caption_camtour_focus_at_text, r.msg_touch_to_search, r.caption_camtour_outline_description, r.msg_smudge_to_read, r.caption_camtour_see_translation, 0
        });
        n = (new int[] {
            l.tour_instant_01, l.tour_instant_02, l.tour_instant_03, l.tour_instant_04, l.tour_instant_05
        });
        o = (new int[] {
            r.msg_point_to_translate, r.caption_tour_camera_live_on_big_sign_menu_text, r.caption_camtour_touch_to_enhance, r.msg_smudge_to_read, r.caption_camtour_see_translation
        });
    }
}

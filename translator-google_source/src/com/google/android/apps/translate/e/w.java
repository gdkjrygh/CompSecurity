// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.translate.TranslateActivity;
import com.google.android.apps.translate.inputs.Camera2InputPopup;
import com.google.android.apps.translate.j;
import com.google.android.apps.translate.m;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.e;
import com.google.android.libraries.translate.speech.c;

// Referenced classes of package com.google.android.apps.translate.e:
//            x

public final class w
{

    public final Context a;

    public w(Context context)
    {
        a = context;
    }

    public static View a(Context context, View view)
    {
        byte byte0 = 8;
        x x1 = new x();
        Language alanguage[] = b.a(context, e.a(context));
        Object obj = alanguage[0];
        Object obj1 = alanguage[1];
        int i;
        boolean flag;
        if (TranslateActivity.a(context))
        {
            if (Camera2InputPopup.a(context, ((Language) (obj)).getShortName(), ((Language) (obj1)).getShortName(), null))
            {
                i = 2;
            } else
            {
                i = 3;
            }
            flag = b.a(context, i);
            obj1 = view.findViewById(m.whats_new_cam);
            if (flag)
            {
                i = 8;
            } else
            {
                i = 0;
            }
            ((View) (obj1)).setVisibility(i);
            if (!flag)
            {
                boolean flag1 = TranslateActivity.a(context, ((Language) (obj)));
                Object obj2 = context.getResources();
                TextView textview = (TextView)view.findViewById(m.btn_take_cam_tour);
                boolean flag2;
                if (flag1)
                {
                    i = j.primary_blue;
                } else
                {
                    i = j.quantum_grey600;
                }
                textview.setTextColor(((Resources) (obj2)).getColor(i));
                view.findViewById(m.btn_take_cam_tour).setOnClickListener(x1);
            }
        } else
        {
            view.findViewById(m.whats_new_cam).setVisibility(8);
            flag = true;
        }
        flag1 = b.a(context, 1);
        obj2 = view.findViewById(m.whats_new_voice);
        if (flag1)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        ((View) (obj2)).setVisibility(i);
        if (!flag1)
        {
            flag2 = ((c)Singleton.e.b()).a(new Language[] {
                obj
            });
            context = context.getResources();
            obj = (TextView)view.findViewById(m.btn_take_voice_tour);
            if (flag2)
            {
                i = j.primary_blue;
            } else
            {
                i = j.quantum_grey600;
            }
            ((TextView) (obj)).setTextColor(context.getColor(i));
            view.findViewById(m.btn_take_voice_tour).setOnClickListener(x1);
        }
        context = view;
        if (flag)
        {
            context = view;
            if (flag1)
            {
                context = null;
            }
        }
        return context;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.google.android.apps.translate.widget.ToggleImage;
import com.google.android.libraries.translate.a.a;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.e.m;
import com.google.android.libraries.translate.e.o;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.d;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.translate.speech.c;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate:
//            l, m, o, r, 
//            TranslateActivity

public class LauncherShortcuts extends Activity
    implements android.widget.AdapterView.OnItemSelectedListener
{

    private final Spinner a[] = new Spinner[2];
    private final ArrayAdapter b[] = new ArrayAdapter[2];
    private final ToggleImage c[] = new ToggleImage[4];
    private final int d[];
    private Language e[];

    public LauncherShortcuts()
    {
        d = (new int[] {
            l.ic_launcher_keyboard, l.ic_launcher_camera, l.ic_launcher_voice, l.ic_launcher_handwriting
        });
    }

    private int a()
    {
        for (int i = 0; i < c.length; i++)
        {
            if (c[i].a)
            {
                return i;
            }
        }

        return 0;
    }

    public static int a(int i)
    {
        switch (i)
        {
        default:
            Singleton.b().a("keyboard");
            return i;

        case 1: // '\001'
        case 4: // '\004'
            Singleton.b().a("camera");
            return m.btn_camera;

        case 2: // '\002'
            Singleton.b().a("voice");
            return m.btn_speech;

        case 3: // '\003'
            Singleton.b().a("handwriting");
            break;
        }
        return m.btn_handwriting;
    }

    private void a(int i, List list, int j)
    {
        b[j] = new ArrayAdapter(this, 0x1090008, 0x1020014, list);
        b[j].setDropDownViewResource(o.lang_picker_item);
        a[j] = (Spinner)findViewById(i);
        a[j].setAdapter(b[j]);
        a[j].setSelection(list.indexOf(e[j]));
    }

    private Language b(int i)
    {
        return (Language)b[i].getItem(a[i].getSelectedItemPosition());
    }

    public void onCancelClicked(View view)
    {
        setResult(0);
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setResult(0);
        setContentView(o.launcher_shortcut_configure);
        bundle = com.google.android.libraries.translate.languages.e.a(this);
        e = com.google.android.libraries.translate.core.b.a(this, bundle);
        if ("auto".equals(e[0].getShortName()))
        {
            e[0] = bundle.a();
            e[1] = bundle.b();
        }
        Object obj = (ViewGroup)findViewById(m.input_method_buttons);
        for (int i = 0; i < c.length; i++)
        {
            c[i] = (ToggleImage)((ViewGroup) (obj)).getChildAt(i);
        }

        c[0].setFirst(true);
        obj = Lists.a(Collections.unmodifiableList(((d) (bundle)).a).toArray(new Language[0]));
        ((List) (obj)).remove(bundle.a("auto"));
        a(m.lang1, ((List) (obj)), 0);
        a[0].setOnItemSelectedListener(this);
        a(m.lang2, Collections.unmodifiableList(((d) (bundle)).b), 1);
        onInputTypeClicked(c[0]);
    }

    public void onInputTypeClicked(View view)
    {
        ToggleImage atoggleimage[] = c;
        int j = atoggleimage.length;
        int i = 0;
        while (i < j) 
        {
            ToggleImage toggleimage = atoggleimage[i];
            boolean flag;
            if (toggleimage == view)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            toggleimage.setChecked(flag);
            i++;
        }
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l1)
    {
        adapterview = (Language)b[0].getItem(i);
        c[1].setEnabled(com.google.android.libraries.translate.a.a.a(this, adapterview));
        c[2].setEnabled(((c)Singleton.e.b()).a(new Language[] {
            adapterview
        }));
        c[3].setEnabled(com.google.android.libraries.translate.core.b.a(this, adapterview));
        if (!c[a()].isEnabled())
        {
            onInputTypeClicked(c[0]);
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        switch (i)
        {
        default:
            super.onRequestPermissionsResult(i, as, ai);
            return;

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        if (ai.length > 0 && ai[0] == 0)
        {
            onSaveClicked(findViewById(m.btn_save));
            return;
        }
        if (1 == i)
        {
            i = r.err_no_permissions_camera;
        } else
        {
            i = r.err_no_permissions_audio;
        }
        m.a(i, 1);
    }

    public void onSaveClicked(View view)
    {
        int i = a();
        if (o.g)
        {
            if (1 == i)
            {
                if (checkSelfPermission("android.permission.CAMERA") != 0)
                {
                    requestPermissions(new String[] {
                        "android.permission.CAMERA"
                    }, i);
                    return;
                }
            } else
            if (2 == i && checkSelfPermission("android.permission.RECORD_AUDIO") != 0)
            {
                requestPermissions(new String[] {
                    "android.permission.RECORD_AUDIO"
                }, i);
                return;
            }
        }
        view = new com.google.android.apps.translate.c.a(b(0), b(1));
        Intent intent = new Intent(this, com/google/android/apps/translate/TranslateActivity);
        String s = view.a();
        intent = intent.setData(Uri.parse((new StringBuilder(String.valueOf(s).length() + 24)).append("app_widget/?").append(i).append("#").append(s).toString()));
        setResult(-1, (new Intent()).putExtra("android.intent.extra.shortcut.INTENT", intent).putExtra("android.intent.extra.shortcut.NAME", view.toString()).putExtra("android.intent.extra.shortcut.ICON_RESOURCE", android.content.Intent.ShortcutIconResource.fromContext(this, d[i])));
        a(i);
        Singleton.b().a(Event.NEW_SHORTCUT, ((com.google.android.apps.translate.c.a) (view)).a.getShortName(), ((com.google.android.apps.translate.c.a) (view)).b.getShortName());
        finish();
    }
}

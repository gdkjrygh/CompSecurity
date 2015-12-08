// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.app.ActionBar;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import com.google.android.apps.translate.help.HelpActivity;
import com.google.android.apps.translate.help.TourActivity;
import com.google.android.apps.translate.inputs.Camera2InputPopup;
import com.google.android.apps.translate.pref.PrefsActivity;
import com.google.android.apps.translate.widget.FloatingInputCard;
import com.google.android.apps.translate.widget.PhrasebookView;
import com.google.android.apps.unveil.textinput.TextInput;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.e.a;
import com.google.android.libraries.translate.e.f;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.j;
import com.google.android.libraries.translate.e.m;
import com.google.android.libraries.translate.e.n;
import com.google.android.libraries.translate.e.o;
import com.google.android.libraries.translate.e.p;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.d;
import com.google.android.libraries.translate.languages.e;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.speech.c;
import com.google.android.libraries.translate.tts.MyTts;
import com.google.android.libraries.wordlens.WordLensSystem;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.translate:
//            m, r, x, ResultScrollView, 
//            z, HomeListView, w, y, 
//            s, o, l, LauncherShortcuts

public class TranslateActivity extends AppCompatActivity
    implements j
{

    private static Boolean t = null;
    private FrameLayout i;
    private HomeListView j;
    private ResultScrollView k;
    private FloatingInputCard l;
    private DrawerLayout m;
    private PhrasebookView n;
    private z o;
    private boolean p;
    private boolean q;
    private int r;
    private w s;

    public TranslateActivity()
    {
        p = true;
    }

    private boolean a(int i1)
    {
        if (i1 == m.menu_phrasebook)
        {
            n.a(1);
            ((DrawerLayout)findViewById(m.drawer_layout)).e(n);
        } else
        {
            if (i1 == m.menu_settings)
            {
                startActivity((new Intent(this, com/google/android/apps/translate/pref/PrefsActivity)).addFlags(0x20000000));
                return true;
            }
            if (i1 == m.menu_sms)
            {
                if (o.g && checkSelfPermission("android.permission.READ_SMS") != 0)
                {
                    i1 = m.menu_sms;
                    requestPermissions(new String[] {
                        "android.permission.READ_SMS"
                    }, i1);
                    return true;
                } else
                {
                    l.a(d());
                    return true;
                }
            }
            if (i1 == m.menu_clear_history)
            {
                com.google.android.libraries.translate.e.p.a(this, getText(r.msg_confirm_clear_history)).setTitle(r.label_clear_history).setNegativeButton(r.label_no, null).setPositiveButton(r.label_yes, new x(this)).show();
                return true;
            }
            if (i1 == m.menu_help_n_feedback)
            {
                startActivity((new Intent(this, com/google/android/apps/translate/help/HelpActivity)).putExtra("extra_screenshot", com.google.android.libraries.translate.e.a.a(this)));
                return true;
            }
            if (DrawerLayout.g(n))
            {
                n.b(i1);
                return true;
            }
        }
        return true;
    }

    public static boolean a(Context context)
    {
        if (t == null)
        {
            context = Boolean.valueOf(TextInput.a(context));
            t = context;
            boolean flag1 = context.booleanValue();
            boolean flag;
            if (WordLensSystem.a() != com.google.android.libraries.wordlens.WordLensSystem.WLSupportLevel.NONE)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            t = Boolean.valueOf(flag & flag1);
        }
        return t.booleanValue();
    }

    public static boolean a(Context context, Language language)
    {
        return com.google.android.libraries.translate.a.a.a(context, language) && WordLensSystem.a() != com.google.android.libraries.wordlens.WordLensSystem.WLSupportLevel.NONE;
    }

    static boolean a(TranslateActivity translateactivity)
    {
        return translateactivity.q;
    }

    static boolean a(TranslateActivity translateactivity, boolean flag)
    {
        translateactivity.q = flag;
        return flag;
    }

    public static String b(Context context, Language language)
    {
        if (language != null)
        {
            if (a(context, language))
            {
                return null;
            }
            if (a(context))
            {
                return context.getString(r.msg_no_camera_for_lang, new Object[] {
                    language.getLongName()
                });
            }
        }
        return context.getString(r.msg_no_camera_for_device);
    }

    private void b(boolean flag)
    {
        ((MyTts)Singleton.b.b()).b();
        int i1;
        if (flag)
        {
            i1 = k.getScrollY();
        } else
        {
            i1 = 0x80000000;
        }
        l.a(i);
        p = true;
        k.setFloatingInputCard(null, false, null);
        o.a();
        k.setVisibility(8);
        j.setVisibility(0);
        j.setFloatingInputCard(l, true, i1);
        j.b();
    }

    public final void a(int i1, Bundle bundle)
    {
        boolean flag = true;
        i1;
        JVM INSTR lookupswitch 7: default 72
    //                   3: 73
    //                   6: 202
    //                   8: 225
    //                   10: 238
    //                   11: 270
    //                   21: 301
    //                   200: 514;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        return;
_L2:
        i.setVisibility(0);
        k.a();
        String s1 = bundle.getString("input");
        if (p)
        {
            p = false;
            j.setFloatingInputCard(null, false, 0);
            j.setVisibility(8);
            j.a();
            k.setVisibility(0);
        }
        boolean flag1 = bundle.getBoolean("animate", true);
        k.setFloatingInputCard(l, flag1, s1);
        o.a(bundle);
        if (bundle.containsKey("output") || bundle.getBoolean("update_lang", false))
        {
            h.a(7, bundle);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!p)
        {
            k.a();
            o.b(bundle);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        a(bundle.getInt("id"));
        return;
_L5:
        i.setVisibility(0);
        try
        {
            startActivityForResult((Intent)bundle.getParcelable("intent"), bundle.getInt("request"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return;
        }
_L6:
        boolean flag2;
        if (bundle == null || bundle.getBoolean("animate", true))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        b(flag2);
        return;
_L7:
        Language alanguage[];
        Language language;
        int j1;
        if (bundle == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        alanguage = com.google.android.libraries.translate.core.b.a(this, e.a(this));
        language = alanguage[0];
        i1 = bundle.getInt("key.tour.type");
        if (m.btn_take_voice_tour != i1)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = m.btn_speech;
        if (((c)Singleton.e.b()).a(new Language[] {
    language
}))
        {
            break MISSING_BLOCK_LABEL_529;
        }
        com.google.android.libraries.translate.e.m.a(getString(r.msg_no_voice_for_lang, new Object[] {
            language.getLongName()
        }), 1);
        bundle = null;
_L10:
        if (bundle != null)
        {
            startActivityForResult(bundle, 102);
            return;
        }
        if (true) goto _L1; else goto _L9
_L9:
        if (m.btn_take_cam_tour == i1)
        {
label0:
            {
                bundle = b(this, language);
                if (bundle == null)
                {
                    break label0;
                }
                com.google.android.libraries.translate.e.m.a(bundle, 1);
                bundle = null;
            }
        } else
        {
            bundle = null;
        }
          goto _L10
        if (Camera2InputPopup.a(this, alanguage[0].getShortName(), alanguage[1].getShortName(), null))
        {
            i1 = 2;
        } else
        {
            i1 = 3;
        }
        j1 = m.btn_camera;
_L11:
        if (com.google.android.libraries.translate.core.b.a(this, i1))
        {
            bundle = null;
        } else
        {
            bundle = new Intent(this, com/google/android/apps/translate/help/TourActivity);
            bundle.putExtra("key.clicked.view.id", j1);
            bundle.putExtra("tour_type", i1);
        }
          goto _L10
_L8:
        startActivity(new Intent(this, com/google/android/apps/translate/pref/PrefsActivity));
        return;
        i1 = ((flag) ? 1 : 0);
          goto _L11
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
label0:
        {
            if (j1 == -1 && !isFinishing())
            {
                if (102 != i1)
                {
                    break label0;
                }
                h.a(22);
                FloatingInputCard floatinginputcard = l;
                i1 = intent.getIntExtra("key.clicked.view.id", m.none);
                if (m.none != i1)
                {
                    floatinginputcard.onClick(floatinginputcard.findViewById(i1));
                }
            }
            return;
        }
        if (103 == i1)
        {
            com.google.android.libraries.translate.e.m.a(r.err_no_permissions_copydrop, 1);
            return;
        } else
        {
            h.a(i1, com.google.android.apps.translate.e.k.a(intent, i1));
            return;
        }
    }

    public void onBackPressed()
    {
        if (DrawerLayout.g(n))
        {
            m.f(n);
            return;
        }
        if (p)
        {
            super.onBackPressed();
            return;
        } else
        {
            b(true);
            return;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (r != configuration.orientation)
        {
            h.a(15);
            r = configuration.orientation;
            if (s != null && s.isShowing())
            {
                s.dismiss();
                s = null;
                return;
            }
            if (q && configuration.orientation == 2 && !p && !DrawerLayout.g(n) && hasWindowFocus())
            {
                configuration = o.e;
                if (configuration != null && ((com.google.android.apps.translate.cards.b) (configuration)).c != null)
                {
                    s = new y(this, this, ((com.google.android.apps.translate.cards.b) (configuration)).c.a(0), ((com.google.android.apps.translate.cards.b) (configuration)).f, Event.RESULT_FULLSCREEN_GESTURE);
                    s.show();
                    return;
                }
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        setTheme(s.AppTheme);
        super.onCreate(bundle);
        if (o.f)
        {
            getWindow().addFlags(0x80000000);
        }
        setContentView(o.activity_translate);
        i = (FrameLayout)findViewById(m.main_content);
        l = (FloatingInputCard)findViewById(m.floating_input_card);
        l.setParentActivity(this);
        j = (HomeListView)findViewById(0x102000a);
        j.setFloatingInputCard(l, false, 0);
        m = (DrawerLayout)findViewById(m.drawer_layout);
        m.setDrawerShadow(l.drawer_shadow, 3);
        m.setDrawerShadow(l.drawer_shadow, 5);
        n = (PhrasebookView)findViewById(m.left_drawer);
        n.setParents(m, this);
        k = (ResultScrollView)findViewById(m.resultScrollView);
        o = new z(this, l, k);
        h.a(this, new int[] {
            3, 6, 8, 10, 11, 21, 200, 201, 202
        });
        bundle = getActionBar();
        if (bundle != null)
        {
            bundle.hide();
        }
        onNewIntent(getIntent());
    }

    protected void onDestroy()
    {
        h.a(this);
        super.onDestroy();
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        if (i1 == 82 && hasWindowFocus())
        {
            if (!DrawerLayout.g(n))
            {
                h.a(17);
                return true;
            } else
            {
                n.findViewById(m.menu_overflow).performClick();
                return true;
            }
        }
        if (i1 == 84 && hasWindowFocus() && DrawerLayout.g(n))
        {
            n.b(m.phrase_search);
            return true;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    protected void onNewIntent(Intent intent)
    {
        Object obj;
        Object obj3;
        boolean flag1;
        flag1 = false;
        obj3 = null;
        obj = null;
        String s1 = intent.getDataString();
        String as[];
        boolean flag;
        if (s1 != null && s1.startsWith("app_widget/?"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        i.setVisibility(4);
        s1 = intent.getData().getFragment();
        obj = e.a(this);
        as = s1.split(",");
        obj = new com.google.android.apps.translate.c.a(((d) (obj)).a(as[0]), ((d) (obj)).c(as[1]));
        l.a(this, com.google.android.apps.translate.LauncherShortcuts.a(Integer.parseInt(intent.getData().getQuery())), ((com.google.android.apps.translate.c.a) (obj)).a, ((com.google.android.apps.translate.c.a) (obj)).b);
        Singleton.b().a(Event.OPENED_BY_SHORTCUT, ((com.google.android.apps.translate.c.a) (obj)).a.getShortName(), ((com.google.android.apps.translate.c.a) (obj)).b.getShortName());
_L9:
        return;
_L2:
        if (!"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null) goto _L4; else goto _L3
_L3:
        Object obj1 = intent.getData().getPath();
        if (obj1 == null) goto _L4; else goto _L5
_L5:
        boolean flag2 = ((String) (obj1)).startsWith("/with_inputmethod");
_L27:
        if (!flag2) goto _L7; else goto _L6
_L6:
        intent = intent.getData();
        obj1 = intent.getQueryParameter("inputmethod");
        if (obj1 == null) goto _L9; else goto _L8
_L8:
        Object obj2;
        Language alanguage[];
        Uri uri;
        d d1;
        Language language;
        int i1;
        try
        {
            i1 = Integer.parseInt(((String) (obj1)));
            obj2 = e.a(this);
            obj1 = com.google.android.apps.translate.e.k.a(intent, ((d) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return;
        }
        intent = ((Intent) (obj1));
        if (obj1 != null) goto _L11; else goto _L10
_L10:
        alanguage = com.google.android.libraries.translate.core.b.a(this, ((d) (obj2)));
        intent = ((Intent) (obj1));
        if (alanguage[0] == null) goto _L11; else goto _L12
_L12:
        intent = ((Intent) (obj1));
        if (alanguage[1] == null) goto _L11; else goto _L13
_L13:
        intent = new com.google.android.apps.translate.c.a(alanguage[0], alanguage[1]);
          goto _L11
_L16:
        if (intent == null) goto _L9; else goto _L14
_L14:
        i1 = com.google.android.apps.translate.LauncherShortcuts.a(i1);
        l.a(this, i1, ((com.google.android.apps.translate.c.a) (intent)).a, ((com.google.android.apps.translate.c.a) (intent)).b);
        Singleton.b().a(Event.API_WITH_INPUT_MODE, ((com.google.android.apps.translate.c.a) (intent)).a.getShortName(), ((com.google.android.apps.translate.c.a) (intent)).b.getShortName());
        return;
_L24:
        obj1 = b(this, ((com.google.android.apps.translate.c.a) (intent)).a);
        if (obj1 == null) goto _L16; else goto _L15
_L15:
        com.google.android.libraries.translate.e.m.a(((CharSequence) (obj1)), 1);
        intent = ((Intent) (obj));
          goto _L16
_L25:
        if (((c)Singleton.e.b()).a(new Language[] {
            ((com.google.android.apps.translate.c.a) (intent)).a
        })) goto _L16; else goto _L17
_L17:
        com.google.android.libraries.translate.e.m.a(getString(r.msg_no_voice_for_lang, new Object[] {
            ((com.google.android.apps.translate.c.a) (intent)).a.getLongName()
        }), 1);
        intent = ((Intent) (obj));
          goto _L16
_L26:
        if (com.google.android.libraries.translate.core.b.a(this, ((com.google.android.apps.translate.c.a) (intent)).a)) goto _L16; else goto _L18
_L18:
        com.google.android.libraries.translate.e.m.a(getString(r.msg_no_handwriting_for_lang, new Object[] {
            ((com.google.android.apps.translate.c.a) (intent)).a.getLongName()
        }), 1);
        intent = ((Intent) (obj));
          goto _L16
_L7:
label0:
        {
            obj = intent.getAction();
            if (!"android.intent.action.SEND".equals(obj))
            {
                continue; /* Loop/switch isn't completed */
            }
            intent = intent.getStringExtra("android.intent.extra.TEXT");
            i1 = ((flag1) ? 1 : 0);
            if (!URLUtil.isValidUrl(intent))
            {
                break label0;
            }
            if (!URLUtil.isHttpUrl(intent))
            {
                i1 = ((flag1) ? 1 : 0);
                if (!URLUtil.isHttpsUrl(intent))
                {
                    break label0;
                }
            }
            i1 = 1;
        }
        if (i1 != 0)
        {
            Singleton.b().a(Event.APP_SHARED_LINK, null, null);
            com.google.android.libraries.translate.e.o.a(this, (new android.net.Uri.Builder()).scheme("https").authority(com.google.android.libraries.translate.core.b.e(Singleton.a())).path("translate").appendQueryParameter("u", intent).appendQueryParameter("hl", f.a(Locale.getDefault())).build());
            return;
        }
        intent = com.google.android.libraries.translate.e.n.a(intent);
        if (intent.isEmpty()) goto _L9; else goto _L19
_L19:
        obj = l.getCurrentLanguages();
        Singleton.b().a(Event.APP_SHARED_TEXT, null, null);
        a(3, com.google.android.apps.translate.e.k.a(intent, ((com.google.android.apps.translate.c.a) (obj)).a, ((com.google.android.apps.translate.c.a) (obj)).b, ""));
        return;
        if (!"android.intent.action.VIEW".equals(obj) || TextUtils.isEmpty(intent.getDataString())) goto _L9; else goto _L20
_L20:
        uri = Uri.parse(intent.getDataString());
        Singleton.b().a(Event.OPENED_BY_LINK, null, null);
        obj1 = uri.getQueryParameter("q");
        if (TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L22; else goto _L21
_L21:
        intent = uri.getQueryParameter("sl");
        obj = uri.getQueryParameter("tl");
_L23:
        alanguage = obj3;
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            d1 = e.a(this);
            alanguage = intent;
            if (TextUtils.isEmpty(intent))
            {
                alanguage = "auto";
            }
            language = d1.b(alanguage);
            alanguage = obj3;
            if (language != null)
            {
                intent = d1.c(((String) (obj)));
                if (intent == null && com.google.android.libraries.translate.languages.c.a(((String) (obj))))
                {
                    intent = d1.a(this);
                }
                obj = intent;
                if (intent == null)
                {
                    obj = d1.c(f.a(Locale.getDefault()));
                }
                alanguage = obj3;
                if (obj != null)
                {
                    alanguage = com.google.android.apps.translate.e.k.a(((String) (obj1)), language, ((Language) (obj)), "source=url");
                    alanguage.putBoolean("update_lang", true);
                }
            }
        }
        if (alanguage == null)
        {
            com.google.android.libraries.translate.e.o.a(this, uri);
            return;
        } else
        {
            a(3, alanguage);
            return;
        }
_L22:
        intent = uri.getFragment();
        if (!TextUtils.isEmpty(intent))
        {
            alanguage = intent.split("[\\|\\/]", 3);
            if (alanguage.length == 3)
            {
                intent = alanguage[0];
                obj = alanguage[1];
                obj1 = alanguage[2];
                continue; /* Loop/switch isn't completed */
            }
        }
        obj = null;
        intent = null;
        if (true) goto _L23; else goto _L11
_L11:
        i1;
        JVM INSTR tableswitch 1 4: default 940
    //                   1 331
    //                   2 355
    //                   3 412
    //                   4 331;
           goto _L16 _L24 _L25 _L26 _L24
_L4:
        flag2 = false;
          goto _L27
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return a(menuitem.getItemId());
    }

    protected void onPause()
    {
        ((MyTts)Singleton.b.b()).b();
        h.b(9, null);
        i.setVisibility(0);
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        return false;
    }

    public void onRequestPermissionsResult(int i1, String as[], int ai[])
    {
        if (m.btn_camera != i1) goto _L2; else goto _L1
_L1:
        if (ai.length <= 0 || ai[0] != 0) goto _L4; else goto _L3
_L3:
        l.onClick(findViewById(m.btn_camera));
_L6:
        return;
_L4:
        com.google.android.libraries.translate.e.m.a(r.err_no_permissions_camera, 1);
        return;
_L2:
        if (m.btn_speech == i1)
        {
            if (ai.length > 0 && ai[0] == 0)
            {
                l.onClick(findViewById(m.btn_speech));
                return;
            } else
            {
                com.google.android.libraries.translate.e.m.a(r.err_no_permissions_audio, 1);
                return;
            }
        }
        if (m.menu_sms == i1)
        {
            if (ai.length > 0 && ai[0] == 0)
            {
                l.a(d());
                return;
            } else
            {
                com.google.android.libraries.translate.e.m.a(r.err_no_permissions_sms, 1);
                return;
            }
        }
        if (m.btn_signin == i1)
        {
            if (ai.length > 0 && ai[0] == 0)
            {
                n.findViewById(m.btn_signin).performClick();
                return;
            }
        } else
        {
            super.onRequestPermissionsResult(i1, as, ai);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onResume()
    {
        boolean flag = true;
        super.onResume();
        setVolumeControlStream(3);
        if (p)
        {
            j.b();
        }
        r = getResources().getConfiguration().orientation;
        if (r != 1 || com.google.android.libraries.translate.e.o.a())
        {
            flag = false;
        }
        q = flag;
        ((c)Singleton.e.b()).a();
        Singleton.b().a();
    }

}

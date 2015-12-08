// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.google.android.apps.translate.inputtools.InputToolsInput;
import com.google.android.apps.translate.j;
import com.google.android.apps.translate.k;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.r;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.b;
import com.google.android.libraries.handwriting.gui.HandwritingOverlayView;
import com.google.android.libraries.handwriting.gui.ScrollableCandidateView;
import com.google.android.libraries.handwriting.gui.UIHandler;
import com.google.android.libraries.handwriting.gui.UndoButtonInterface;
import com.google.android.libraries.handwriting.gui.aa;
import com.google.android.libraries.handwriting.gui.ab;
import com.google.android.libraries.handwriting.gui.af;
import com.google.android.libraries.handwriting.gui.al;
import com.google.android.libraries.handwriting.gui.c;
import com.google.android.libraries.handwriting.gui.i;
import com.google.android.libraries.handwriting.gui.s;
import com.google.android.libraries.handwriting.gui.t;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizer;
import com.google.android.libraries.handwriting.networkrecognizer.a;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.d;
import com.google.android.libraries.translate.e.o;
import com.google.android.libraries.translate.languages.Language;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate.widget:
//            m, g, q, r, 
//            n, p, t, HandwritingUndoButton, 
//            k

public class HandwritingInputView extends LinearLayout
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener, al
{

    private int A;
    private int B;
    private ToggleButton C;
    public final ab a;
    public final UIHandler b;
    public HandwritingOverlayView c;
    public n d;
    public InputToolsInput e;
    public int f;
    private final float g;
    private final float h;
    private final Object i;
    private final a j;
    private ScrollableCandidateView k;
    private String l;
    private Language m;
    private Language n;
    private i o;
    private TextView p;
    private boolean q;
    private boolean r;
    private final Handler s;
    private final com.google.android.apps.translate.widget.m t;
    private com.google.android.apps.translate.widget.t u;
    private final com.google.android.apps.handwriting.service.t v;
    private Button w;
    private ImageButton x;
    private HandwritingUndoButton y;
    private ImageButton z;

    public HandwritingInputView(Context context)
    {
        this(context, null);
    }

    public HandwritingInputView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = new Object();
        j = new a();
        f = -1;
        q = true;
        r = true;
        s = new Handler();
        t = new com.google.android.apps.translate.widget.m(this);
        v = new g(this);
        float f1 = getResources().getDimensionPixelSize(k.handwriting_max_stroke_width);
        float f2 = getResources().getDimensionPixelSize(k.handwriting_min_stroke_width);
        float f3 = getResources().getDimensionPixelSize(k.handwriting_fixed_stroke_width);
        Object obj;
        Intent intent;
        int i1;
        if (f1 + f2 < 2.0F * f3)
        {
            h = f3;
            g = f3;
        } else
        {
            h = f1;
            g = f2;
        }
        setWillNotDraw(false);
        a = new q(this);
        i1 = ((Integer)com.google.android.libraries.translate.e.d.d().second).intValue();
        j.f = 0;
        j.b = "atrans";
        j.d = i1;
        j.e = android.os.Build.VERSION.SDK_INT;
        j.h = 2;
        j.i = 250;
        context = j;
        attributeset = String.valueOf(Build.DEVICE);
        obj = String.valueOf(android.os.Build.VERSION.RELEASE);
        context.c = (new StringBuilder(String.valueOf(attributeset).length() + 19 + String.valueOf(obj).length())).append(attributeset).append(":").append(((String) (obj))).append(":atrans").append(i1).toString();
        context = new s();
        context.a = false;
        context.b = false;
        o = new i(a, context);
        e();
        b = new com.google.android.apps.translate.widget.r(this, this, o, i);
        b.d = this;
        a.b = b;
        a.d = 600;
        a.f = false;
        if (a.e)
        {
            findViewById(m.busyDisplay).setVisibility(8);
        }
        context = Singleton.a().getPackageName();
        attributeset = com/google/android/apps/translate/widget/HandwritingInputView$HandwritingLanguagesBroadCastReceiver.getName();
        obj = getContext();
        intent = new Intent();
        intent.setComponent(new ComponentName("com.google.android.apps.handwriting.ime", "com.google.android.apps.handwriting.ime.GoogleHandwritingRecognitionService$DetermineLanguageAvailabilityIntentService"));
        intent.putExtra("CALLER_PACKAGE", context);
        intent.putExtra("CALLER_RECEIVER", attributeset);
        ((Context) (obj)).startService(intent);
    }

    static void a(HandwritingInputView handwritinginputview)
    {
        handwritinginputview.e();
    }

    static void a(HandwritingInputView handwritinginputview, int i1, InputConnection inputconnection)
    {
        handwritinginputview.d.a.a = i1;
        handwritinginputview.d.a.b = i1;
        if (inputconnection != null)
        {
            inputconnection.setSelection(i1, i1);
        }
    }

    static void a(HandwritingInputView handwritinginputview, String s1)
    {
        handwritinginputview.a(s1);
    }

    private void a(String s1)
    {
        int i1 = 0;
        TextView textview;
        boolean flag;
        if (!TextUtils.isEmpty(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        textview = p;
        if (!flag)
        {
            i1 = 8;
        }
        textview.setVisibility(i1);
        textview = p;
        if (!flag)
        {
            s1 = "";
        }
        textview.setText(s1);
    }

    private void a(boolean flag)
    {
label0:
        {
            if (e != null)
            {
                if (!flag)
                {
                    break label0;
                }
                a(String.format(getContext().getString(r.hint_handwriting_input_text), new Object[] {
                    m.getLongName()
                }));
            }
            return;
        }
        a("");
    }

    static void b(HandwritingInputView handwritinginputview)
    {
        handwritinginputview.getContext().unregisterReceiver(handwritinginputview.u);
        handwritinginputview.u = null;
    }

    static void c(HandwritingInputView handwritinginputview)
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.google.android.apps.handwriting.ime.DOWNLOADS_FINISHED");
        intentfilter.addAction("com.google.android.apps.handwriting.ime.MODEL_DOWNLOAD_FAILED");
        handwritinginputview.u = new com.google.android.apps.translate.widget.t(handwritinginputview);
        handwritinginputview.getContext().registerReceiver(handwritinginputview.u, intentfilter);
    }

    static UIHandler d(HandwritingInputView handwritinginputview)
    {
        return handwritinginputview.b;
    }

    static InputToolsInput e(HandwritingInputView handwritinginputview)
    {
        return handwritinginputview.e;
    }

    private void e()
    {
        if (C == null || C.isChecked())
        {
            i i1 = o;
            com.google.android.libraries.handwriting.networkrecognizer.d d1 = com.google.android.libraries.handwriting.networkrecognizer.d.a();
            com.google.android.libraries.translate.e.d.a(d1);
            i1.a(new CloudRecognizer(d1, j));
        } else
        {
            i j1 = o;
            com.google.android.apps.handwriting.service.r r1 = new com.google.android.apps.handwriting.service.r(getContext(), j);
            r1.f = v;
            j1.a(r1);
        }
        f();
    }

    static ImageButton f(HandwritingInputView handwritinginputview)
    {
        return handwritinginputview.z;
    }

    private void f()
    {
        if (o.a instanceof com.google.android.apps.handwriting.service.r)
        {
            com.google.android.apps.handwriting.service.r r1 = (com.google.android.apps.handwriting.service.r)o.a;
            String s1 = l;
            r1.a.a = s1;
            r1.a(r1.b);
        } else
        if (o.a instanceof CloudRecognizer)
        {
            CloudRecognizer cloudrecognizer = (CloudRecognizer)o.a;
            String s2 = l;
            cloudrecognizer.a.a = s2;
            return;
        }
    }

    static Handler g(HandwritingInputView handwritinginputview)
    {
        return handwritinginputview.s;
    }

    private void g()
    {
        if (e != null)
        {
            e.clearComposingText();
        }
    }

    static boolean h(HandwritingInputView handwritinginputview)
    {
        return handwritinginputview.r;
    }

    static i i(HandwritingInputView handwritinginputview)
    {
        return handwritinginputview.o;
    }

    static void j(HandwritingInputView handwritinginputview)
    {
        handwritinginputview.g();
    }

    static Button k(HandwritingInputView handwritinginputview)
    {
        return handwritinginputview.w;
    }

    static ImageButton l(HandwritingInputView handwritinginputview)
    {
        return handwritinginputview.x;
    }

    static boolean m(HandwritingInputView handwritinginputview)
    {
        return handwritinginputview.q;
    }

    static boolean n(HandwritingInputView handwritinginputview)
    {
        handwritinginputview.q = false;
        return false;
    }

    static void o(HandwritingInputView handwritinginputview)
    {
        handwritinginputview.a(false);
    }

    public final void a()
    {
        b();
        b.d();
        b.b();
        b.h.a.clear();
    }

    public final void a(char c1)
    {
        Editable editable = e.getEditableText();
        if (c1 == b.k)
        {
            if (e.getSelectionStart() >= 0)
            {
                editable.insert(e.getSelectionStart(), " ");
            }
            return;
        } else
        {
            return;
        }
    }

    public final void b()
    {
        b.d();
        a(q);
        b.b();
    }

    public final void c()
    {
        Editable editable = e.getEditableText();
        if (e.getSelectionStart() < 0)
        {
            if (editable.length() > 0)
            {
                editable.delete(editable.length() - 1, editable.length());
            }
        } else
        {
            if (e.getSelectionStart() < e.getSelectionEnd())
            {
                editable.delete(e.getSelectionStart(), e.getSelectionEnd());
                return;
            }
            if (e.getSelectionStart() > 0)
            {
                editable.delete(e.getSelectionStart() - 1, e.getSelectionStart());
                return;
            }
        }
    }

    public final void d()
    {
        b.i();
        b();
    }

    public InputConnection getCurrentInputConnection()
    {
        return d;
    }

    public int getCursorSelectionStart()
    {
        return d.a.a;
    }

    public String getSourceTextToTranslate()
    {
        return e.getText().toString();
    }

    public void onClick(View view)
    {
        int i1;
        if (view == x || view == w)
        {
            i1 = A;
        } else
        if (view == z)
        {
            i1 = B;
        } else
        {
            i1 = 0;
        }
        b.onKey(i1, new int[] {
            i1
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        k = (ScrollableCandidateView)findViewById(m.candidate_view);
        k.setListener(b);
        b.i = k;
        c = (HandwritingOverlayView)findViewById(m.handwriting_overlay);
        c.setHandwritingOverlayListener(b);
        c.setRecoQueueStrokeColor(getResources().getColor(j.gtrStrokeColorHistory));
        c.setPendingStrokeColor(getResources().getColor(j.gtrStrokeColor));
        c.setRecognizedStrokeColor(getResources().getColor(j.gtrStrokeColorRecognized));
        c.setStrokePreviouslyRecognizedColor(getResources().getColor(j.gtrStrokeColorPreviousRecognition));
        a.c = c;
        a.g = findViewById(m.busyDisplay);
        b.c = c;
        y = (HandwritingUndoButton)findViewById(m.handwriting_key_undo);
        w = (Button)findViewById(m.handwriting_key_space_char);
        x = (ImageButton)findViewById(m.handwriting_key_space);
        z = (ImageButton)findViewById(m.handwriting_key_backspace);
        if (!getContext().getResources().getBoolean(com.google.android.apps.translate.i.is_debug) && !getContext().getResources().getBoolean(com.google.android.apps.translate.i.is_dogfood) || !com.google.android.libraries.translate.core.b.k(getContext())) goto _L2; else goto _L1
_L1:
        Iterator iterator = getContext().getPackageManager().getInstalledApplications(0).iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (!((ApplicationInfo)iterator.next()).packageName.equals("com.google.android.apps.handwriting.ime")) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L8:
        if (flag)
        {
            C = (ToggleButton)findViewById(m.cloud_no_cloud);
            C.setVisibility(0);
            C.setOnCheckedChangeListener(new com.google.android.apps.translate.widget.k(this));
        }
_L2:
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        z.setOnClickListener(this);
        z.setOnTouchListener(this);
        Object obj = b;
        HandwritingUndoButton handwritingundobutton = y;
        obj.j = handwritingundobutton;
        if (handwritingundobutton != null)
        {
            ((UIHandler) (obj)).j.setOnClickListener(new af(((UIHandler) (obj))));
        }
        A = b.k;
        B = b.l;
        obj = o;
        ((i) (obj)).i.g();
        ((i) (obj)).b();
        ((i) (obj)).i.h();
        p = (TextView)findViewById(m.handwriting_hint_text);
        return;
_L4:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (view != z) goto _L2; else goto _L1
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 44
    //                   0 46
    //                   1 79
    //                   2 44
    //                   3 79;
           goto _L2 _L3 _L4 _L2 _L4
_L2:
        return false;
_L3:
        z.setPressed(true);
        onClick(z);
        s.postDelayed(t, 300L);
        return true;
_L4:
        view.setPressed(false);
        s.removeCallbacks(t);
        return true;
    }

    protected void onWindowVisibilityChanged(int i1)
    {
        super.onWindowVisibilityChanged(i1);
        g();
        b.h.a.clear();
        b.d();
        b.a(RecognitionResult.i, false);
    }

    public void setSourceAndTargetLanguages(Language language, Language language1)
    {
        boolean flag2 = true;
        boolean flag;
        boolean flag1;
        if (m != null && m != language)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (n != null && n != language1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            g();
            b();
        }
        m = language;
        n = language1;
        language = language.getShortName();
        l = com.google.android.libraries.translate.core.b.a(language);
        e();
        f();
        com.google.android.apps.translate.e.d.a(k, language);
        c.setMinStrokeWidth(g);
        c.setMaxStrokeWidth(h);
        a(q);
        if (com.google.android.libraries.handwriting.gui.t.a(m.getShortName()))
        {
            flag2 = false;
        }
        r = flag2;
        if (!com.google.android.libraries.translate.e.o.b(getContext()))
        {
            a(getContext().getString(r.msg_network_error));
        }
    }
}

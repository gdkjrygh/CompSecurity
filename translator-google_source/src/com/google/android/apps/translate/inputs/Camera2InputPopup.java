// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.CycleInterpolator;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.google.android.apps.translate.anim.AnimationScheme;
import com.google.android.apps.translate.e.i;
import com.google.android.apps.translate.g;
import com.google.android.apps.translate.j;
import com.google.android.apps.translate.l;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.n;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.r;
import com.google.android.apps.translate.s;
import com.google.android.apps.translate.widget.LanguagePicker;
import com.google.android.apps.translate.widget.TintImageView;
import com.google.android.apps.translate.wordlens.GTRNativeGLRenderer;
import com.google.android.apps.translate.wordlens.GTRNativeUI;
import com.google.android.apps.translate.wordlens.GTRNativeViewConfig;
import com.google.android.apps.translate.wordlens.a;
import com.google.android.apps.translate.wordlens.c;
import com.google.android.apps.translatedecoder.preprocess.Tokenizer;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.k;
import com.google.android.apps.unveil.sensors.CameraManager;
import com.google.android.apps.unveil.textinput.TextInput;
import com.google.android.apps.unveil.textinput.x;
import com.google.android.apps.unveil.textinput.y;
import com.google.android.apps.unveil.textinput.z;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.d;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.LogParams;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.OfflineTranslationException;
import com.google.android.libraries.wordlens.GL2SurfaceView;
import com.google.android.libraries.wordlens.LangPackInfo;
import com.google.android.libraries.wordlens.NativeBitmapInfo;
import com.google.android.libraries.wordlens.NativeFrameSink;
import com.google.android.libraries.wordlens.NativeLangMan;
import com.google.android.libraries.wordlens.WordLensSystem;
import com.google.android.libraries.wordlens.messaging.MessageManager;
import com.google.android.libraries.wordlens.messaging.b;
import com.google.android.libraries.wordlens.util.f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            a, as, g, aj, 
//            ac, bt, aq, b, 
//            f, j, k, w, 
//            al, o, z, d, 
//            e, ad, v, ae, 
//            af, c, ai, ah, 
//            h, an, at, u, 
//            aa, ab, y, ak, 
//            n, p, ag, q, 
//            r, s, t, m, 
//            x

public class Camera2InputPopup extends com.google.android.apps.translate.inputs.a
    implements android.view.SurfaceHolder.Callback, android.view.View.OnClickListener, as, a, c, y, b
{

    private static final PausedFrameSource g;
    private boolean A;
    private Timer B;
    private Runnable C;
    private final ViewFlipper D;
    private final TextView E;
    private final TextView F;
    private final TextView G;
    private final TextView H;
    private final EditText I;
    private final TextView J;
    private final aq K;
    private final OrientationEventListener L;
    private int M;
    private int N;
    private String O;
    private boolean P;
    private boolean Q;
    private long R;
    private boolean S;
    private boolean T;
    private long U;
    private boolean V;
    private com.google.android.apps.unveil.env.j W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private Runnable aa;
    private View ab;
    private Runnable ac;
    boolean f;
    private final TextInput h;
    private final CameraManager i;
    private InputUIState j;
    private final GL2SurfaceView k;
    private final GTRNativeGLRenderer l;
    private final com.google.android.libraries.wordlens.c m;
    private View n;
    private Dialog o;
    private Dialog p;
    private boolean q;
    private GTRNativeViewConfig r;
    private bt s;
    private final boolean t;
    private final View u;
    private boolean v;
    private final TextView w;
    private com.google.android.apps.translate.b.b x;
    private ValueAnimator y;
    private final TintImageView z;

    public Camera2InputPopup(Context context, Language language, Language language1)
    {
        super(context, language, language1, "inputm=6", s.CameraDialogTheme);
        j = InputUIState.UNINITIALIZED;
        n = null;
        o = null;
        p = null;
        q = false;
        r = null;
        s = null;
        v = false;
        x = null;
        y = null;
        A = false;
        B = null;
        C = null;
        N = 0;
        P = false;
        Q = false;
        T = false;
        V = false;
        W = null;
        X = false;
        Y = false;
        Z = false;
        aa = new com.google.android.apps.translate.inputs.g(this);
        ac = new aj(this);
        f = true;
        setContentView(o.popup_camera2_input);
        getWindow().setSoftInputMode(48);
        setTitle(r.label_camera);
        if (com.google.android.libraries.translate.e.o.d)
        {
            android.view.WindowManager.LayoutParams layoutparams = getWindow().getAttributes();
            layoutparams.rotationAnimation = 1;
            getWindow().setAttributes(layoutparams);
        }
        h = (TextInput)findViewById(m.camera_input);
        h.setListener(this);
        h.setUserAgent(com.google.android.libraries.translate.e.d.c());
        h.setVisibility(0);
        h.setOnClickListener(new i(this));
        h.setImageLogging(com.google.android.libraries.translate.core.b.b(context));
        i = (CameraManager)findViewById(m.camera_manager);
        com.google.android.apps.translate.inputs.ac.a[g.ordinal()];
        JVM INSTR tableswitch 1 3: default 324
    //                   1 1103
    //                   2 1116
    //                   3 1129;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_1129;
_L5:
        v();
        w = (TextView)findViewById(m.instant_bar);
        Object obj = w;
        bt bt1;
        int i1;
        boolean flag;
        boolean flag1;
        if (X)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((TextView) (obj)).setVisibility(i1);
        z = (TintImageView)findViewById(m.btn_instant);
        i();
        findViewById(m.btn_gallery).setSelected(true);
        findViewById(m.btn_translate).setSelected(true);
        t = true;
        k = (GL2SurfaceView)findViewById(m.camera2_view);
        ab = findViewById(m.focus_reticle);
        obj = new com.google.android.apps.translate.wordlens.b(h, this);
        h.setTextQueryListener(((com.google.android.apps.unveil.textinput.ac) (obj)));
        u = findViewById(m.align_text);
        k.setZOrderMediaOverlay(true);
        k.setVisibility(0);
        GTRNativeViewConfig.setIsAppWindowAutoRotate(true);
        s = new bt();
        obj = h;
        bt1 = s;
        if (((TextInput) (obj)).d == null)
        {
            obj.d = new HashSet();
        }
        ((TextInput) (obj)).d.add(bt1);
        l = new GTRNativeGLRenderer(WordLensSystem.b().b);
        k.setRenderer(l);
        k.setRenderMode(1);
        k.getHolder().addCallback(this);
        WordLensSystem.b().a = k;
        obj = new Rect();
        k.getDrawingRect(((Rect) (obj)));
        m = new com.google.android.libraries.wordlens.c(getContext(), k, ((Rect) (obj)));
        k.setTouchDelegate(m);
        MessageManager.a(this, new int[] {
            0xde2937d6, 0x2a704955, 0xdc06128a
        });
        I = (EditText)findViewById(m.edit_input);
        com.google.android.libraries.translate.e.o.a(I, a);
        com.google.android.apps.translate.e.d.a(I, language.getShortName());
        com.google.android.apps.translate.e.d.c(language1.getShortName());
        J = (TextView)findViewById(m.txt_instant);
        K = new aq(J, language, language1);
        K.a("inputm=6");
        K.e = this;
        K.a();
        I.addTextChangedListener(K);
        F = (TextView)findViewById(m.txt_error);
        E = (TextView)findViewById(m.txt_info);
        D = (ViewFlipper)findViewById(m.message_bar);
        G = (TextView)findViewById(m.txt_lang_from);
        H = (TextView)findViewById(m.txt_lang_to);
        J.setHint(language1.getLongName());
        J.setOnClickListener(this);
        a(new i(this), new int[] {
            m.btn_gallery, m.btn_clear_input, m.btn_flash, m.btn_retake, m.btn_pause, m.btn_translate, m.btn_select_all, m.lang_display_header, m.btn_back, m.btn_cancel, 
            m.btn_instant
        });
        com.google.android.libraries.translate.e.h.a(this, new int[] {
            15, 7, 19
        });
        c(true);
        language = getWindow().getWindowManager().getDefaultDisplay();
        L = new com.google.android.apps.translate.inputs.b(this, context, language);
        M = language.getRotation();
        flag = a.isRTL();
        flag1 = b.isRTL();
        context = (ImageView)findViewById(m.btn_pause_img);
        if (flag1 ^ flag)
        {
            if (b.isRTL())
            {
                context.setImageResource(l.quantum_ic_format_textdirection_r_to_l_white_24);
            } else
            {
                context.setImageResource(l.quantum_ic_format_textdirection_l_to_r_white_24);
            }
        } else
        {
            context.setImageResource(l.quantum_ic_pause_circle_outline_white_24);
        }
        language = Singleton.b();
        if (X)
        {
            context = "wordlens";
        } else
        {
            context = "camera";
        }
        language.c(context);
        return;
_L2:
        h.setSnapMode(com.google.android.apps.unveil.textinput.TextInput.SnapMode.TAKE_PICTURE);
          goto _L5
_L3:
        h.setSnapMode(com.google.android.apps.unveil.textinput.TextInput.SnapMode.RECENT_FRAME);
          goto _L5
        h.setSnapMode(com.google.android.apps.unveil.textinput.TextInput.SnapMode.EXTERNAL);
          goto _L5
    }

    private void A()
    {
        boolean flag1 = true;
        com.google.android.apps.translate.inputs.ac.c[j.ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 41
    //                   2 41
    //                   3 90;
           goto _L1 _L2 _L2 _L3
_L1:
        return;
_L2:
        boolean flag = false;
_L4:
        View view;
        Object obj;
        obj = getContext();
        view = u;
        if (view.getVisibility() != 0)
        {
            flag1 = false;
        }
        if (flag && !flag1)
        {
            view.clearAnimation();
            view.setVisibility(0);
            view.startAnimation(AnimationUtils.loadAnimation(((Context) (obj)), g.grow_from_center));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (X && f)
        {
            flag = false;
        } else
        {
            flag = true;
        }
          goto _L4
        if (flag || !flag1) goto _L1; else goto _L5
_L5:
        obj = AnimationUtils.loadAnimation(((Context) (obj)), g.fade_out);
        view.clearAnimation();
        view.startAnimation(((Animation) (obj)));
        view.setVisibility(8);
        return;
    }

    static int a(Camera2InputPopup camera2inputpopup)
    {
        return camera2inputpopup.M;
    }

    static int a(Camera2InputPopup camera2inputpopup, int i1)
    {
        camera2inputpopup.M = i1;
        return i1;
    }

    static com.google.android.apps.unveil.env.j a(Camera2InputPopup camera2inputpopup, com.google.android.apps.unveil.env.j j1)
    {
        camera2inputpopup.W = j1;
        return j1;
    }

    static com.google.android.apps.unveil.env.j a(Camera2InputPopup camera2inputpopup, boolean flag)
    {
        NativeBitmapInfo nativebitmapinfo;
        nativebitmapinfo = camera2inputpopup.s.a.a();
        if (nativebitmapinfo == null)
        {
            break MISSING_BLOCK_LABEL_422;
        }
        nativebitmapinfo.bytesPerPixel;
        JVM INSTR tableswitch 1 4: default 52
    //                   1 223
    //                   2 52
    //                   3 52
    //                   4 330;
           goto _L1 _L2 _L1 _L1 _L3
_L3:
        break MISSING_BLOCK_LABEL_330;
_L1:
        Bitmap bitmap;
        int i1 = nativebitmapinfo.bytesPerPixel;
        bitmap = null;
_L4:
        if (bitmap != null)
        {
            if (flag)
            {
                Matrix matrix = new Matrix();
                int i2 = CameraManager.a(camera2inputpopup.getContext());
                int j1;
                int k1;
                int l1;
                if (i2 == 90 || i2 == 270)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                if (j1 != 0)
                {
                    k1 = nativebitmapinfo.height;
                } else
                {
                    k1 = nativebitmapinfo.width;
                }
                if (j1 != 0)
                {
                    l1 = nativebitmapinfo.width;
                } else
                {
                    l1 = nativebitmapinfo.height;
                }
                camera2inputpopup = Bitmap.createBitmap(k1, l1, android.graphics.Bitmap.Config.RGB_565);
                if (j1 != 0)
                {
                    float f1 = Math.min(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
                    matrix.postRotate(i2, f1, f1);
                    if (i2 == 270)
                    {
                        matrix.postTranslate(0.0F, bitmap.getWidth() - bitmap.getHeight());
                    }
                } else
                {
                    matrix.postRotate(i2, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
                }
                (new Canvas(camera2inputpopup)).drawBitmap(bitmap, matrix, null);
                bitmap.recycle();
                return com.google.android.apps.unveil.env.k.a(camera2inputpopup, 0);
            } else
            {
                return com.google.android.apps.unveil.env.k.a(bitmap, 0);
            }
        } else
        {
            return null;
        }
_L2:
        bitmap = Bitmap.createBitmap(nativebitmapinfo.width, nativebitmapinfo.height, android.graphics.Bitmap.Config.RGB_565);
        j1 = 0;
        while (j1 < nativebitmapinfo.height) 
        {
            for (k1 = 0; k1 < nativebitmapinfo.width; k1++)
            {
                l1 = nativebitmapinfo.rawData[nativebitmapinfo.width * j1 + k1] & 0xff;
                bitmap.setPixel(k1, j1, Color.argb(255, l1, l1, l1));
            }

            j1++;
        }
          goto _L4
        bitmap = Bitmap.createBitmap(nativebitmapinfo.width, nativebitmapinfo.height, android.graphics.Bitmap.Config.ARGB_8888);
        bitmap.copyPixelsFromBuffer(ByteBuffer.wrap(nativebitmapinfo.rawData));
          goto _L4
        return null;
    }

    private void a(int i1, int j1)
    {
        View view = findViewById(i1);
        if (view != null)
        {
            view.setBackgroundResource(j1);
        }
    }

    private void a(InputUIState inputuistate)
    {
        if (j == inputuistate) goto _L2; else goto _L1
_L1:
        j = inputuistate;
        if (Z)
        {
            AnimationScheme.BOTTOM.showView(findViewById(m.camera_bottom));
            AnimationScheme.TOP.showView(findViewById(m.lang_bar));
            if (!o())
            {
                int i1 = getContext().getResources().getInteger(0x10e0000);
                AnimationScheme.FADE.showView(findViewById(m.camera_options_panel), i1);
            }
            Z = false;
        }
        com.google.android.apps.translate.inputs.ac.c[j.ordinal()];
        JVM INSTR tableswitch 1 3: default 128
    //                   1 193
    //                   2 211
    //                   3 239;
           goto _L3 _L4 _L5 _L6
_L3:
        k.queueEvent(new com.google.android.apps.translate.inputs.f(this));
_L2:
        q();
        A();
        if (j == InputUIState.VIDEO)
        {
            b(true);
        } else
        {
            b(false);
        }
        inputuistate = m;
        ((com.google.android.libraries.wordlens.c) (inputuistate)).a.set(0.0F, 0.0F);
        ((com.google.android.libraries.wordlens.c) (inputuistate)).b.reset();
        inputuistate.c = 1.0F;
        return;
_L4:
        k.queueEvent(new com.google.android.apps.translate.inputs.j(this));
        continue; /* Loop/switch isn't completed */
_L5:
        l.a = true;
        GTRNativeUI.a().a(com.google.android.apps.translate.wordlens.GTRNativeUI.GTRUIMode.SNAPSHOT);
        l.a = false;
        continue; /* Loop/switch isn't completed */
_L6:
        if (k.getVisibility() != 0)
        {
            k.onResume();
            k.setVisibility(0);
        }
        a(((Runnable) (new com.google.android.apps.translate.inputs.k(this))));
        l.a = true;
        n();
        if (true) goto _L3; else goto _L7
_L7:
    }

    static void a(Camera2InputPopup camera2inputpopup, int i1, int j1, byte abyte0[])
    {
        synchronized (camera2inputpopup.k)
        {
            camera2inputpopup.C = new w(camera2inputpopup, i1, j1, abyte0);
            if (camera2inputpopup.v)
            {
                camera2inputpopup.a(camera2inputpopup.C);
                camera2inputpopup.C = null;
            }
        }
        return;
        camera2inputpopup;
        gl2surfaceview;
        JVM INSTR monitorexit ;
        throw camera2inputpopup;
    }

    static void a(Camera2InputPopup camera2inputpopup, View view)
    {
        camera2inputpopup.b(view);
    }

    static void a(Camera2InputPopup camera2inputpopup, InputUIState inputuistate)
    {
        camera2inputpopup.a(inputuistate);
    }

    static void a(Camera2InputPopup camera2inputpopup, OfflinePackage aofflinepackage[], com.google.android.libraries.translate.offline.o o1)
    {
        camera2inputpopup.getContext();
        if (com.google.android.libraries.translate.offline.a.i.a(o1, aofflinepackage))
        {
            (new com.google.android.libraries.translate.offline.a.c(camera2inputpopup.getContext(), o1, 5)).a(aofflinepackage);
            camera2inputpopup.a(aofflinepackage[0]);
            return;
        }
        try
        {
            com.google.android.libraries.translate.e.m.a(r.msg_external_storage_insufficient_available_space, 1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OfflinePackage aofflinepackage[])
        {
            com.google.android.libraries.translate.e.m.a(aofflinepackage.getErrorMessage(camera2inputpopup.getContext()), 1);
        }
        return;
    }

    private void a(OfflinePackage offlinepackage)
    {
        findViewById(m.instant_progress_bar).setVisibility(0);
        x = new com.google.android.apps.translate.b.b(getContext().getResources(), j.camera_instant_bar);
        x.setLevel(0);
        if (com.google.android.libraries.translate.e.o.b)
        {
            findViewById(m.instant_frame_progress).setBackground(x);
        } else
        {
            findViewById(m.instant_frame_progress).setBackgroundDrawable(x);
        }
        B = new Timer();
        B.scheduleAtFixedRate(new al(this, offlinepackage), 1000L, 1000L);
    }

    private void a(boolean flag)
    {
        TextView textview;
        int i1;
        if (flag)
        {
            i1 = j.camera_controlbar_bg_light;
        } else
        {
            i1 = j.camera_controlbar_bg_dark;
        }
        a(m.message_bar, i1);
        if (flag)
        {
            i1 = l.bg_camera_toolbar_light;
        } else
        {
            i1 = l.bg_camera_toolbar_dark;
        }
        a(m.camera_options_panel, i1);
        textview = E;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        textview.setEnabled(flag);
    }

    private void a(boolean flag, String s1, boolean flag1)
    {
        if (flag || D.getDisplayedChild() != 1)
        {
            b(0);
            E.setText(s1);
            if (flag1)
            {
                E.sendAccessibilityEvent(32768);
            }
        }
    }

    private void a(boolean flag, boolean flag1)
    {
        int i1 = 0;
        if (y != null)
        {
            y.cancel();
            y = null;
        }
        Resources resources = getContext().getResources();
        Object obj;
        TextView textview;
        TextView textview1;
        TintImageView tintimageview;
        if (flag1 && X)
        {
            w.setVisibility(0);
            if (flag)
            {
                y = ValueAnimator.ofInt(new int[] {
                    resources.getColor(j.camera_instant_bar), resources.getColor(j.camera_instant_secondary)
                });
                y.setDuration(resources.getInteger(n.instant_pulse_period));
                y.setEvaluator(new ArgbEvaluator());
                y.setRepeatCount(-1);
                y.setRepeatMode(2);
                y.addUpdateListener(new com.google.android.apps.translate.inputs.o(this));
                y.start();
                w.setText(r.label_instant_on);
            } else
            {
                z.a(getContext().getResources().getColorStateList(j.icon_light_normal));
                w.setTextColor(resources.getColor(0x106000b));
                w.setText(r.label_instant_off);
            }
            w.postDelayed(new com.google.android.apps.translate.inputs.z(this), resources.getInteger(n.instant_bar_time_millis));
        } else
        {
            obj = w;
            if (!flag)
            {
                i1 = 8;
            }
            ((TextView) (obj)).setVisibility(i1);
        }
        obj = findViewById(m.lang_display_header);
        textview = (TextView)findViewById(m.txt_lang_from);
        textview1 = (TextView)findViewById(m.txt_lang_to);
        tintimageview = (TintImageView)findViewById(m.btn_swap);
        if (flag)
        {
            ((View) (obj)).setBackgroundResource(j.camera_instant_bar_bg);
            textview.setTextColor(resources.getColor(j.icon_light_clickable));
            textview1.setTextColor(resources.getColor(j.icon_light_clickable));
            tintimageview.setTint(resources.getColor(j.icon_light_clickable));
            return;
        } else
        {
            ((View) (obj)).setBackgroundResource(j.camera_controlbar_bg_dark);
            textview.setTextColor(resources.getColor(j.camera_info_text));
            textview1.setTextColor(resources.getColor(j.camera_info_text));
            tintimageview.setTint(resources.getColor(j.quantum_grey500));
            return;
        }
    }

    private void a(OfflinePackage aofflinepackage[], String s1, String s2)
    {
        View view = View.inflate(getContext(), o.wl_download_dialog, null);
        String s3 = com.google.android.libraries.translate.offline.a.i.a(getContext(), aofflinepackage);
        ((TextView)view.findViewById(m.msg_package_detail)).setText(s3);
        p = (new android.app.AlertDialog.Builder(getContext())).setView(view).setPositiveButton(r.label_download, new com.google.android.apps.translate.inputs.d(this, aofflinepackage)).setNegativeButton(r.label_skip, null).create();
        p.setOnDismissListener(new com.google.android.apps.translate.inputs.e(this));
        p.getWindow().getAttributes().windowAnimations = s.AnimationsDialogWLDownload;
        A = false;
        p.show();
        com.google.android.libraries.translate.core.b.a(getContext(), s1, s2);
    }

    public static boolean a(Context context, String s1, String s2, com.google.android.apps.translate.inputs.a a1)
    {
        if (WordLensSystem.a() == com.google.android.libraries.wordlens.WordLensSystem.WLSupportLevel.WORD_LENS)
        {
            boolean flag1 = NativeLangMan.a(com.google.android.libraries.translate.languages.c.c(s1), com.google.android.libraries.translate.languages.c.c(s2));
            boolean flag = flag1;
            if (flag1)
            {
                flag = WordLensSystem.a(context);
                if (!flag && a1 != null)
                {
                    a1.a(new ad());
                }
                flag = flag1 & flag;
            }
            return flag;
        } else
        {
            return false;
        }
    }

    static CameraManager b(Camera2InputPopup camera2inputpopup)
    {
        return camera2inputpopup.i;
    }

    private void b(int i1)
    {
        if (i1 >= 0)
        {
            D.setVisibility(0);
            D.setDisplayedChild(i1);
            return;
        } else
        {
            D.setVisibility(8);
            return;
        }
    }

    private void b(View view)
    {
        int i1 = view.getWidth();
        int j1 = getContext().getResources().getDimensionPixelSize(com.google.android.apps.translate.k.camera_options_margin);
        view = findViewById(m.hover_card_frame);
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
        layoutparams.width = i1 - j1 * 2;
        view.setLayoutParams(layoutparams);
        view.requestLayout();
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            getWindow().setFlags(128, 128);
            c.removeCallbacks(aa);
            c.postDelayed(aa, 60000L);
            return;
        } else
        {
            c.removeCallbacks(aa);
            getWindow().clearFlags(128);
            return;
        }
    }

    static void c(Camera2InputPopup camera2inputpopup)
    {
        camera2inputpopup.x();
    }

    private void c(boolean flag)
    {
        ViewGroup viewgroup;
        boolean flag1;
        if (getContext().getResources().getConfiguration().orientation == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        viewgroup = (ViewGroup)findViewById(m.cloudhance_bottom);
        if (!flag || flag1)
        {
            int k1 = m.btn_select_all;
            int j1 = 0;
            while (j1 <= 0) 
            {
                Object obj = viewgroup.findViewById((new int[] {
                    k1
                })[0]);
                if (obj instanceof TextView)
                {
                    obj = (TextView)obj;
                    if (com.google.android.libraries.translate.e.o.c)
                    {
                        android.graphics.drawable.Drawable adrawable[] = ((TextView) (obj)).getCompoundDrawablesRelative();
                        if (flag1)
                        {
                            ((TextView) (obj)).setCompoundDrawablesRelative(adrawable[1], null, null, null);
                        } else
                        {
                            ((TextView) (obj)).setCompoundDrawablesRelative(null, adrawable[0], null, null);
                        }
                    } else
                    {
                        android.graphics.drawable.Drawable adrawable1[] = ((TextView) (obj)).getCompoundDrawables();
                        if (flag1)
                        {
                            ((TextView) (obj)).setCompoundDrawables(adrawable1[1], null, null, null);
                        } else
                        {
                            ((TextView) (obj)).setCompoundDrawables(null, adrawable1[0], null, null);
                        }
                    }
                }
                j1++;
            }
        }
        if (flag1)
        {
            int i1 = getContext().getResources().getDimensionPixelSize(com.google.android.apps.translate.k.default_touch_target);
            viewgroup.getLayoutParams().height = i1;
        } else
        {
            viewgroup.getLayoutParams().height = -2;
        }
        if (isShowing())
        {
            findViewById(m.camera_control_btns).requestLayout();
        }
        x();
    }

    static TextView d(Camera2InputPopup camera2inputpopup)
    {
        return camera2inputpopup.w;
    }

    private void d(boolean flag)
    {
        boolean flag1 = false;
        G.setText(a.getLongName());
        H.setText(b.getLongName());
        View view = findViewById(m.btn_swap);
        int i1;
        if (p())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
        view = findViewById(m.btn_swap_locked);
        if (!p())
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
        if (flag)
        {
            b(-1);
        }
    }

    static TintImageView e(Camera2InputPopup camera2inputpopup)
    {
        return camera2inputpopup.z;
    }

    private void e(String s1)
    {
        Toast.makeText(getContext(), s1, 0).show();
    }

    private void e(boolean flag)
    {
        boolean flag1 = true;
        Activity activity = getOwnerActivity();
        if (activity != null)
        {
            int i1;
            if (flag)
            {
                Configuration configuration = activity.getResources().getConfiguration();
                i1 = activity.getWindowManager().getDefaultDisplay().getRotation();
                if ((i1 == 0 || i1 == 2) && configuration.orientation == 2 || (i1 == 1 || i1 == 3) && configuration.orientation == 1)
                {
                    i1 = 2;
                } else
                {
                    i1 = 1;
                }
                if (2 == i1)
                {
                    i1 = ((flag1) ? 1 : 0);
                } else
                {
                    i1 = 0;
                }
            } else
            {
                i1 = ((flag1) ? 1 : 0);
                if (activity.getResources().getConfiguration().orientation != 2)
                {
                    i1 = 0;
                }
            }
            if (i1 != 0)
            {
                i1 = 6;
            } else
            {
                i1 = 7;
            }
            activity.setRequestedOrientation(i1);
        }
        L.disable();
    }

    private void f(String s1)
    {
        a(new v(this, s1));
    }

    static boolean f(Camera2InputPopup camera2inputpopup)
    {
        return camera2inputpopup.X;
    }

    static void g(Camera2InputPopup camera2inputpopup)
    {
        camera2inputpopup.t();
    }

    static TextInput h(Camera2InputPopup camera2inputpopup)
    {
        return camera2inputpopup.h;
    }

    private void i()
    {
        Resources resources;
        TintImageView tintimageview;
        int i1;
        if (X)
        {
            boolean flag = com.google.android.libraries.translate.core.b.j(getContext());
            z.setSelected(flag);
            tintimageview = z;
            resources = getContext().getResources();
            i1 = j.icon_light_normal;
        } else
        {
            z.setSelected(Y);
            tintimageview = z;
            resources = getContext().getResources();
            if (Y)
            {
                i1 = j.icon_light_normal;
            } else
            {
                i1 = j.icon_light_disabled;
            }
        }
        tintimageview.a(resources.getColorStateList(i1));
    }

    static void i(Camera2InputPopup camera2inputpopup)
    {
        camera2inputpopup.m();
    }

    private void j()
    {
        LangPackInfo langpackinfo;
        if (X && com.google.android.libraries.translate.core.b.j(getContext()))
        {
            langpackinfo = new LangPackInfo(com.google.android.libraries.translate.languages.c.c(a.getShortName()), com.google.android.libraries.translate.languages.c.c(b.getShortName()));
        } else
        {
            langpackinfo = new LangPackInfo("", "");
        }
        NativeLangMan.a(langpackinfo);
    }

    static boolean j(Camera2InputPopup camera2inputpopup)
    {
        camera2inputpopup.A = true;
        return true;
    }

    private void k()
    {
        a(new ae(this));
        k.queueEvent(new com.google.android.apps.translate.inputs.af(this));
    }

    static void k(Camera2InputPopup camera2inputpopup)
    {
        if (!camera2inputpopup.A)
        {
            Animation animation = AnimationUtils.loadAnimation(camera2inputpopup.getContext(), g.wobble);
            animation.setInterpolator(new CycleInterpolator(2.0F));
            camera2inputpopup.z.startAnimation(animation);
        }
    }

    static com.google.android.apps.translate.b.b l(Camera2InputPopup camera2inputpopup)
    {
        return camera2inputpopup.x;
    }

    private OfflinePackage[] l()
    {
        if (!WordLensSystem.a(getContext()))
        {
            return null;
        }
        Object obj = a.getShortName();
        String s1 = b.getShortName();
        com.google.android.libraries.translate.offline.o o1 = (com.google.android.libraries.translate.offline.o)Singleton.c.b();
        obj = o1.b(((String) (obj)), s1);
        if (obj != null && ((OfflinePackage) (obj)).c != com.google.android.libraries.translate.offline.OfflinePackage.Status.DOWNLOADED_POST_PROCESSED)
        {
            return com.google.android.libraries.translate.offline.a.i.a(((OfflinePackage) (obj)), o1);
        } else
        {
            return null;
        }
    }

    static InputUIState m(Camera2InputPopup camera2inputpopup)
    {
        return camera2inputpopup.j;
    }

    private void m()
    {
        if (com.google.android.libraries.translate.core.b.c(getContext()))
        {
            View view = View.inflate(getContext(), o.popup_camera_input_logging, null);
            CheckBox checkbox = (CheckBox)view.findViewById(m.chk_camera_logging);
            o = (new android.app.AlertDialog.Builder(getContext())).setTitle(r.label_improve_camera).setView(view).setOnCancelListener(new com.google.android.apps.translate.inputs.c(this)).setPositiveButton(r.label_ok, new ai(this, checkbox)).setNegativeButton(r.label_cancel, new ah(this)).create();
            o.setCanceledOnTouchOutside(false);
            o.show();
            return;
        }
        a(InputUIState.CLOUDHANCE);
        switch (com.google.android.apps.translate.inputs.ac.a[g.ordinal()])
        {
        default:
            String s1 = String.valueOf(g);
            (new StringBuilder(String.valueOf(s1).length() + 50)).append("Cloudhance called with unhandled SNAPSHOT_SOURCE: ").append(s1);
            return;

        case 1: // '\001'
        case 2: // '\002'
            R = System.currentTimeMillis();
            h.h();
            r();
            return;

        case 3: // '\003'
            R = System.currentTimeMillis();
            break;
        }
        if (W != null)
        {
            TextInput textinput = h;
            com.google.android.apps.unveil.env.j j1 = W;
            textinput.i = com.google.android.libraries.translate.languages.c.b(a.getShortName());
            textinput.a(j1);
        }
        r();
    }

    private void n()
    {
        if (o())
        {
            findViewById(m.camera_options_panel).setVisibility(8);
            n = findViewById(m.hover_card_frame);
            ((TextView)n.findViewById(m.tooltip_text)).setText(r.msg_touch_to_reverse);
            View view = findViewById(m.btn_pause);
            b(view);
            view.addOnLayoutChangeListener(new com.google.android.apps.translate.inputs.h(this, view));
            AnimationScheme.FADE.showView(n);
        }
    }

    static void n(Camera2InputPopup camera2inputpopup)
    {
        camera2inputpopup.b(false);
    }

    static GL2SurfaceView o(Camera2InputPopup camera2inputpopup)
    {
        return camera2inputpopup.k;
    }

    private boolean o()
    {
        boolean flag;
        if (X && a.isRTL() ^ b.isRTL())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return getContext().getResources().getInteger(n.hover_card_show_count) > com.google.android.libraries.translate.core.b.b(getContext(), "_rtl_flip");
        } else
        {
            return false;
        }
    }

    private boolean p()
    {
        String s1 = a.getShortName();
        String s2 = b.getShortName();
        if (a(getContext(), s2, s1, ((com.google.android.apps.translate.inputs.a) (null))))
        {
            return true;
        } else
        {
            return com.google.android.libraries.translate.a.a.a(getContext(), b);
        }
    }

    static boolean p(Camera2InputPopup camera2inputpopup)
    {
        camera2inputpopup.S = true;
        return true;
    }

    private void q()
    {
        com.google.android.apps.translate.inputs.ac.c[j.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 555
    //                   2 341
    //                   3 37;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L4:
        View view = findViewById(m.btn_flash);
        CameraManager cameramanager = i;
        int i1;
        boolean flag;
        if (cameramanager.g != null && cameramanager.f != null && cameramanager.g.booleanValue() && cameramanager.f.booleanValue())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
        findViewById(m.instant_frame).setVisibility(0);
        findViewById(m.cloudhance_bottom).setVisibility(8);
        findViewById(m.camera_bottom).setVisibility(0);
        if (com.google.android.libraries.translate.core.b.j(getContext()) && X)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag, true);
        findViewById(m.btn_retake).setVisibility(8);
        view = findViewById(m.btn_pause);
        if (X)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        view.setVisibility(i1);
        findViewById(m.lang_display_header).setEnabled(true);
        view = findViewById(m.btn_swap);
        if (p())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
        view = findViewById(m.btn_swap_locked);
        if (!p())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
        findViewById(m.btn_translate).setEnabled(true);
        if (n == null)
        {
            findViewById(m.camera_options_panel).setVisibility(0);
        }
        if (X)
        {
            findViewById(m.btn_zoom).setVisibility(8);
        }
        findViewById(m.btn_back).setEnabled(true);
        return;
_L3:
        findViewById(m.cloudhance_bottom).setVisibility(8);
        findViewById(m.camera_bottom).setVisibility(0);
        boolean flag1;
        if (com.google.android.libraries.translate.core.b.j(getContext()) && X)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a(flag1, true);
        findViewById(m.btn_flash).setVisibility(8);
        findViewById(m.instant_frame).setVisibility(0);
        findViewById(m.btn_retake).setVisibility(0);
        findViewById(m.btn_pause).setVisibility(8);
        findViewById(m.lang_display_header).setEnabled(false);
        findViewById(m.btn_swap).setVisibility(8);
        findViewById(m.btn_swap_locked).setVisibility(0);
        findViewById(m.btn_translate).setEnabled(false);
        if (n == null)
        {
            findViewById(m.camera_options_panel).setVisibility(0);
        } else
        {
            AnimationScheme.FADE_FAST.hideView(n);
            n = null;
        }
        if (X)
        {
            findViewById(m.btn_zoom).setVisibility(8);
        }
        findViewById(m.btn_back).setEnabled(true);
        return;
_L2:
        a(true);
        a(false, false);
        findViewById(m.cloudhance_bottom).setVisibility(0);
        findViewById(m.camera_bottom).setVisibility(4);
        findViewById(m.btn_flash).setVisibility(8);
        findViewById(m.instant_frame).setVisibility(8);
        findViewById(m.btn_cancel).setVisibility(0);
        findViewById(m.lang_display_header).setEnabled(false);
        findViewById(m.btn_swap).setVisibility(8);
        findViewById(m.btn_swap_locked).setVisibility(0);
        findViewById(m.btn_select_all).setVisibility(8);
        findViewById(m.btn_back).setEnabled(false);
        findViewById(m.camera_options_panel).setVisibility(4);
        if (n != null)
        {
            AnimationScheme.FADE_FAST.hideView(n);
            n = null;
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    static void q(Camera2InputPopup camera2inputpopup)
    {
        camera2inputpopup.d(false);
    }

    static TextView r(Camera2InputPopup camera2inputpopup)
    {
        return camera2inputpopup.H;
    }

    private void r()
    {
        a(InputUIState.CLOUDHANCE);
        if (!com.google.android.libraries.translate.e.o.b(getContext()))
        {
            f(getContext().getString(r.err_no_network));
            Singleton.b().a(-801, "onPreviewFrozen", a.getShortName(), b.getShortName());
        } else
        {
            a(true, getContext().getString(r.msg_waiting_for_ocr, new Object[] {
                a
            }), true);
        }
        V = true;
    }

    private void s()
    {
        K.b();
        e e1 = Singleton.b();
        Event event;
        if (X)
        {
            event = Event.WORDLENS_SESSION;
        } else
        {
            event = Event.CAMERA_SESSION;
        }
        e1.a(event, a.getShortName(), b.getShortName(), N);
        y();
        L.disable();
        k.setVisibility(8);
        h.setVisibility(8);
        findViewById(m.flash_blocker).setVisibility(0);
    }

    static void s(Camera2InputPopup camera2inputpopup)
    {
        camera2inputpopup.n();
    }

    static TextView t(Camera2InputPopup camera2inputpopup)
    {
        return camera2inputpopup.F;
    }

    private void t()
    {
        onClick(findViewById(m.btn_cancel));
    }

    private void u()
    {
        if (!h.i()) goto _L2; else goto _L1
_L1:
        TextInput textinput = h;
        boolean flag;
        if (textinput.e == com.google.android.apps.unveil.textinput.TextInput.SnapMode.TAKE_PICTURE)
        {
            flag = true;
        } else
        if (textinput.c != null && textinput.c.h() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L3
_L3:
        if (!q)
        {
            a(InputUIState.FROZEN);
        }
        com.google.android.apps.translate.inputs.ac.a[g.ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 108
    //                   2 108
    //                   3 124;
           goto _L2 _L4 _L4 _L5
_L2:
        return;
_L4:
        h.a(false);
        U = System.currentTimeMillis();
        return;
_L5:
        h.a(false);
        (new an(this, true)).execute(new Void[0]);
        return;
    }

    static void u(Camera2InputPopup camera2inputpopup)
    {
        camera2inputpopup.b(1);
    }

    private void v()
    {
        X = a(getContext(), a.getShortName(), b.getShortName(), this);
        boolean flag;
        if (!X && l() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Y = flag;
    }

    static boolean v(Camera2InputPopup camera2inputpopup)
    {
        camera2inputpopup.q = true;
        return true;
    }

    private void w()
    {
        j();
        com.google.android.apps.translate.e.d.a(I, a.getShortName());
        com.google.android.apps.translate.e.d.c(b.getShortName());
        i();
        a(j);
    }

    static void w(Camera2InputPopup camera2inputpopup)
    {
        camera2inputpopup.ab.removeCallbacks(camera2inputpopup.ac);
        camera2inputpopup.ac.run();
        int i1 = (int)camera2inputpopup.m.a.x;
        int j1 = (int)camera2inputpopup.m.a.y;
        if (i1 < 0 || j1 < 0)
        {
            return;
        } else
        {
            int k1 = camera2inputpopup.ab.getWidth();
            int l1 = camera2inputpopup.ab.getHeight();
            int i2 = camera2inputpopup.k.getWidth();
            int j2 = camera2inputpopup.k.getHeight();
            ((android.widget.FrameLayout.LayoutParams)camera2inputpopup.ab.getLayoutParams()).setMargins(com.google.android.libraries.wordlens.util.f.a(i1 - k1 / 2, i2 - k1), com.google.android.libraries.wordlens.util.f.a(j1 - l1 / 2, j2 - l1), 0, 0);
            camera2inputpopup.ab.setVisibility(0);
            camera2inputpopup.ab.requestLayout();
            camera2inputpopup.ab.postDelayed(camera2inputpopup.ac, 500L);
            return;
        }
    }

    static View x(Camera2InputPopup camera2inputpopup)
    {
        return camera2inputpopup.ab;
    }

    private void x()
    {
        if (r != null)
        {
            int i1 = com.google.android.libraries.wordlens.util.e.a(getWindow().getWindowManager().getDefaultDisplay().getRotation());
            r.a(i1);
        }
    }

    private void y()
    {
        Activity activity = getOwnerActivity();
        if (activity != null)
        {
            activity.setRequestedOrientation(-1);
        }
        L.enable();
    }

    static void y(Camera2InputPopup camera2inputpopup)
    {
        camera2inputpopup.A();
    }

    private boolean z()
    {
        boolean flag1 = false;
        TextInput textinput = h;
        boolean flag;
        if (textinput.f != null && !textinput.f.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || System.currentTimeMillis() - U > 2000L)
        {
            flag1 = true;
        }
        return flag1;
    }

    public final Rect a(Bitmap bitmap)
    {
        int k1 = bitmap.getWidth();
        int l1 = bitmap.getHeight();
        int i2 = i.getHeight();
        if (i2 == 0)
        {
            return null;
        }
        bitmap = findViewById(m.lang_bar);
        int i1;
        int j1;
        if (bitmap == null)
        {
            i1 = 0;
        } else
        {
            i1 = bitmap.getHeight();
        }
        bitmap = findViewById(m.bottom_bar_background);
        if (bitmap == null)
        {
            j1 = 0;
        } else
        {
            j1 = bitmap.getHeight();
        }
        return new Rect(0, (i1 * l1) / i2, k1, l1 - (j1 * l1) / i2);
    }

    public final void a()
    {
        k();
        f(getContext().getString(r.msg_no_camera_result, new Object[] {
            a
        }));
        Event event;
        e e1;
        if (X)
        {
            event = Event.WORDLENS_NO_RESULT;
        } else
        {
            event = Event.CAMERA_NO_RESULT;
        }
        a(event);
        e1 = Singleton.b();
        if (X)
        {
            event = Event.WORDLENS_NO_RESULT;
        } else
        {
            event = Event.CAMERA_NO_RESULT;
        }
        e1.a(event, R, a.getShortName(), b.getShortName());
    }

    public final void a(int i1)
    {
        if (i1 == 1 && !TextUtils.isEmpty(O) && TextUtils.equals(O, I.getText()))
        {
            P = true;
            Object obj = com.google.android.libraries.translate.e.n.a((String)J.getTag(com.google.android.apps.translate.inputs.aq.a));
            com.google.android.libraries.translate.core.m m1 = (com.google.android.libraries.translate.core.m)J.getTag(com.google.android.apps.translate.inputs.aq.b);
            if (!((String) (obj)).isEmpty() && m1 != null)
            {
                P = true;
                obj = new Entry(a, b, ((String) (obj)), m1.toString());
                (new com.google.android.libraries.translate.c.c()).a(getContext(), ((Entry) (obj)));
            }
        }
    }

    public final void a(int i1, Bundle bundle)
    {
        if (i1 == 15)
        {
            c(false);
            return;
        }
        if (i1 == 7)
        {
            Language language = (Language)bundle.getSerializable("from");
            bundle = (Language)bundle.getSerializable("to");
            a = language;
            b = bundle;
            bundle = com.google.android.libraries.translate.languages.c.b(a.getShortName());
            if (h.i())
            {
                h.c(bundle);
            }
            Object obj = K;
            bundle = a;
            language = b;
            obj = ((aq) (obj)).d.a.obtainMessage(2);
            ((Message) (obj)).getData().putSerializable("from", bundle);
            ((Message) (obj)).getData().putSerializable("to", language);
            ((Message) (obj)).sendToTarget();
            v();
            boolean flag = X;
            (new StringBuilder(52)).append("Language changed (swap?). WordLens experience? ").append(flag);
            flag = Y;
            (new StringBuilder(60)).append("Language changed (swap?). WordLens download available? ").append(flag);
            w();
            return;
        }
        if (i1 == 19)
        {
            v();
            boolean flag1 = X;
            (new StringBuilder(54)).append("Offline Language Installed. WordLens experience? ").append(flag1);
            flag1 = Y;
            (new StringBuilder(62)).append("Offline Language Installed. WordLens download available? ").append(flag1);
            a(((Runnable) (new u(this))));
            findViewById(m.instant_progress_bar).setVisibility(8);
            if (com.google.android.libraries.translate.e.o.b)
            {
                findViewById(m.instant_frame_progress).setBackground(null);
            } else
            {
                findViewById(m.instant_frame_progress).setBackgroundDrawable(null);
            }
            if (B != null)
            {
                B.cancel();
                B = null;
            }
            w();
            Singleton.b().a(Event.WORDLENS_DOWNLOAD_LIVE_SWITCHOVER, null, null);
            return;
        } else
        {
            super.a(i1, bundle);
            return;
        }
    }

    public final void a(Activity activity)
    {
        getWindow().setFlags(8, 8);
        getWindow().getDecorView().setSystemUiVisibility(getOwnerActivity().getWindow().getDecorView().getSystemUiVisibility() | 1);
        super.a(activity);
        getWindow().clearFlags(8);
        b(true);
        activity = com.google.android.libraries.translate.languages.c.b(a.getShortName());
        h.b(activity);
        Q = true;
        j();
    }

    public final void a(com.google.android.libraries.wordlens.messaging.a a1)
    {
        boolean flag = false;
        a1.a;
        JVM INSTR lookupswitch 3: default 40
    //                   -603581814: 54
    //                   -567724074: 41
    //                   712001877: 73;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L3:
        a(((Runnable) (new aa(this))));
        return;
_L2:
        if (j == InputUIState.VIDEO)
        {
            l.a = false;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        a1 = (com.google.android.libraries.wordlens.messaging.c)a1;
        boolean flag1 = f;
        if (a1.a() > 0.49F)
        {
            flag = true;
        }
        f = flag;
        if (flag1 != f)
        {
            a(((Runnable) (new ab(this))));
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void a(com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word aword[])
    {
        while (aword == null || k == null) 
        {
            return;
        }
        findViewById(m.btn_select_all).setVisibility(0);
        AnimationScheme.FADE.hideView(findViewById(m.btn_cancel));
        k.queueEvent(new com.google.android.apps.translate.inputs.y(this, aword));
    }

    public final void b()
    {
        k();
        f(getContext().getString(r.err_no_network));
        e e1 = Singleton.b();
        Event event;
        if (X)
        {
            event = Event.WORDLENS_NETWORK_ERROR;
        } else
        {
            event = Event.CAMERA_NETWORK_ERROR;
        }
        e1.a(event, R, a.getShortName(), b.getShortName(), (new LogParams()).addParam("cause", (new StringBuilder(12)).append("E0").toString()), 0);
        Singleton.b().a(-802, (new LogParams()).addParam("errorCode", Integer.valueOf(0)));
    }

    public final void b(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            findViewById(m.camera_bottom).setVisibility(4);
            findViewById(m.lang_bar).setVisibility(4);
            Z = true;
            a(((Activity) (null)));
            return;
        } else
        {
            e(true);
            d(true);
            (new ak(this)).a(new Uri[] {
                Uri.parse(s1)
            });
            return;
        }
    }

    public final void c()
    {
        if (!z())
        {
            return;
        } else
        {
            s();
            a(new com.google.android.apps.translate.inputs.n(this));
            return;
        }
    }

    public final void c(String s1)
    {
        k();
        f(getContext().getString(r.msg_camera_error));
        e e1 = Singleton.b();
        Event event;
        if (X)
        {
            event = Event.WORDLENS_CAMERA_ERROR;
        } else
        {
            event = Event.CAMERA_CAMERA_ERROR;
        }
        e1.a(event, R, a.getShortName(), b.getShortName());
        Singleton.b().a(-800, s1, a.getShortName(), b.getShortName());
    }

    public final void d()
    {
        if (!z())
        {
            return;
        } else
        {
            s();
            AnimationScheme.BOTTOM.hideView(findViewById(m.camera_bottom));
            AnimationScheme.TOP.hideView(findViewById(m.lang_bar));
            AnimationScheme.TOP.hideView(findViewById(m.message_bar));
            AnimationScheme.FADE.hideView(findViewById(m.camera_options_panel));
            AnimationScheme.FADE.hideView(findViewById(m.popup_frame), 0L, new p(this));
            return;
        }
    }

    public final void d(String s1)
    {
        if (InputUIState.CLOUDHANCE == j)
        {
            if (TextUtils.isEmpty(s1))
            {
                if (V)
                {
                    findViewById(m.btn_select_all).setVisibility(0);
                    AnimationScheme.FADE.hideView(findViewById(m.btn_cancel));
                    V = false;
                    e(getContext().getString(r.msg_smudge_to_read));
                }
                a(false, getContext().getString(r.msg_smudge_to_read), false);
            } else
            {
                b(2);
                N = N + 1;
            }
            O = Tokenizer.deTokenizeCjkt(a.getShortName(), s1);
            I.setText(O);
            k();
            if (R > 0L)
            {
                e e1 = Singleton.b();
                Object obj;
                String s2;
                String s3;
                int i1;
                if (X)
                {
                    obj = Event.WORDLENS_TEXT_RETURNED;
                } else
                {
                    obj = Event.CAMERA_TEXT_RETURNED;
                }
                s2 = a.getShortName();
                s3 = b.getShortName();
                if (s1 == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = s1.length();
                }
                e1.a(((Event) (obj)), s2, s3, i1);
                obj = Singleton.b();
                if (X)
                {
                    s1 = Event.WORDLENS_TEXT_RETURNED;
                } else
                {
                    s1 = Event.CAMERA_TEXT_RETURNED;
                }
                ((e) (obj)).a(s1, R, a.getShortName(), b.getShortName());
                R = 0L;
                S = false;
            } else
            if (!TextUtils.isEmpty(s1))
            {
                Event event;
                if (S)
                {
                    if (X)
                    {
                        event = Event.WORDLENS_ALL_TEXT_SELECTED;
                    } else
                    {
                        event = Event.CAMERA_ALL_TEXT_SELECTED;
                    }
                    S = false;
                } else
                if (X)
                {
                    event = Event.WORDLENS_TEXT_SELECTED;
                } else
                {
                    event = Event.CAMERA_TEXT_SELECTED;
                }
                Singleton.b().a(event, a.getShortName(), b.getShortName(), s1.length());
                return;
            }
        }
    }

    public final void e()
    {
        if (X || !Y) goto _L2; else goto _L1
_L1:
        String s1;
        String s2;
        OfflinePackage aofflinepackage[];
        boolean flag;
        s1 = a.getShortName();
        s2 = b.getShortName();
        if (!X && o == null && com.google.android.libraries.translate.core.b.b(getContext(), s1, s2) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aofflinepackage = l();
        if (aofflinepackage == null) goto _L2; else goto _L3
_L3:
        com.google.android.apps.translate.inputs.ac.b[aofflinepackage[0].c.ordinal()];
        JVM INSTR tableswitch 1 2: default 104
    //                   1 123
    //                   2 133;
           goto _L2 _L4 _L5
_L2:
        a(new ag(this));
        return;
_L4:
        a(aofflinepackage[0]);
        continue; /* Loop/switch isn't completed */
_L5:
        if (flag)
        {
            a(aofflinepackage, s1, s2);
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public final void f()
    {
        if (!q)
        {
            a(InputUIState.FROZEN);
        }
        e(false);
    }

    public final void g()
    {
        findViewById(m.btn_retake).setEnabled(true);
        if (!X && g != PausedFrameSource.WL_VIDEO_FRAME)
        {
            r();
            return;
        }
        if (q)
        {
            m();
            q = false;
            return;
        } else
        {
            findViewById(m.btn_translate).setEnabled(true);
            findViewById(m.btn_debug_share).setEnabled(true);
            return;
        }
    }

    public final void h()
    {
        y();
        d(true);
        if (!X && !com.google.android.libraries.translate.e.o.b(getContext()))
        {
            f(getContext().getString(r.err_no_network));
            Singleton.b().a(-801, "onInputRestart", a.getShortName(), b.getShortName());
        }
        Event event;
        if (X)
        {
            event = Event.WORDLENS_START;
        } else
        {
            event = Event.CAMERA_START;
        }
        a(event);
        k();
        a(false);
    }

    public boolean isRTLLanguage()
    {
        return a.isRTL();
    }

    public void onClick(View view)
    {
        int i1 = view.getId();
        if (m.btn_back != i1) goto _L2; else goto _L1
_L1:
        if (j != InputUIState.CLOUDHANCE) goto _L4; else goto _L3
_L3:
        if (X)
        {
            view = Event.WORDLENS_BACKBTN_RESTART;
        } else
        {
            view = Event.CAMERA_BACKBTN_RESTART;
        }
        a(view);
        t();
_L6:
        return;
_L4:
        if (X)
        {
            view = Event.WORDLENS_BACKBTN_HOME;
        } else
        {
            view = Event.CAMERA_BACKBTN_HOME;
        }
        a(view);
        onBackPressed();
        return;
_L2:
        if (i1 == m.btn_retake || i1 == m.btn_cancel)
        {
            if (!Q)
            {
                findViewById(m.camera_manager).requestLayout();
                view = com.google.android.libraries.translate.languages.c.b(a.getShortName());
                h.b(view);
            } else
            {
                view = h;
                view.b(((TextInput) (view)).i);
            }
            Q = true;
            a(InputUIState.VIDEO);
            return;
        }
        if (i1 == m.btn_pause)
        {
            if (n != null)
            {
                AnimationScheme.FADE_FAST.hideView(n);
                AnimationScheme.FADE_FAST.showView(findViewById(m.camera_options_panel));
                com.google.android.libraries.translate.core.b.a(getContext(), "_rtl_flip");
                n = null;
            }
            if (X)
            {
                view = Event.WORDLENS_PAUSE;
            } else
            {
                view = Event.CAMERA_PAUSE;
            }
            a(view);
            u();
            return;
        }
        if (m.btn_select_all == i1)
        {
            k.queueEvent(new q(this));
            return;
        }
        if (i1 != m.btn_gallery)
        {
            break; /* Loop/switch isn't completed */
        }
        if (X)
        {
            view = Event.WORDLENS_IMPORT_BUTTON;
        } else
        {
            view = Event.PHOTO_IMPORT_BUTTON;
        }
        a(view);
        if (z())
        {
            c();
            com.google.android.libraries.translate.e.h.a(10, com.google.android.apps.translate.e.k.a((new Intent("android.intent.action.GET_CONTENT")).setType("image/*"), 101));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (i1 == m.btn_instant)
        {
            if (X)
            {
                boolean flag;
                if (!com.google.android.libraries.translate.core.b.j(getContext()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.libraries.translate.core.b.d(getContext(), flag);
                z.setSelected(flag);
                j();
                q();
                return;
            }
            if (findViewById(m.instant_progress_bar).getVisibility() == 0)
            {
                com.google.android.libraries.translate.e.m.a("Downloading", 0);
                return;
            }
            if (WordLensSystem.a(getContext()))
            {
                view = l();
                if (view != null)
                {
                    a(view, a.getShortName(), b.getShortName());
                    return;
                } else
                {
                    com.google.android.libraries.translate.e.m.a(getContext().getString(r.msg_no_wordlens_for_lang_pair), 1);
                    return;
                }
            } else
            {
                com.google.android.libraries.translate.e.m.a(getContext().getString(r.msg_no_live_translation_for_device), 1);
                return;
            }
        }
        if (i1 != m.txt_instant)
        {
            break; /* Loop/switch isn't completed */
        }
        String s1 = com.google.android.libraries.translate.e.n.a(I.getText().toString());
        if (!s1.isEmpty())
        {
            if (X)
            {
                view = Event.WORDLENS_TRANSLATE_BTN;
            } else
            {
                view = Event.CAMERA_TRANSLATE_BTN;
            }
            a(view);
            a(s1);
            a(new com.google.android.apps.translate.inputs.r(this));
            return;
        }
        if (true) goto _L6; else goto _L7
_L7:
        if (i1 == m.btn_clear_input)
        {
            a(false, getContext().getString(r.msg_smudge_to_read), false);
            e(getContext().getString(r.msg_smudge_to_read));
            d(false);
            if (X)
            {
                view = Event.WORDLENS_CLEAR_TEXT;
            } else
            {
                view = Event.CAMERA_CLEAR_TEXT;
            }
            a(view);
            return;
        }
        if (i1 != m.btn_flash)
        {
            break; /* Loop/switch isn't completed */
        }
        CameraManager cameramanager;
        boolean flag1;
        if (!T)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        T = flag1;
        cameramanager = i;
        if (T)
        {
            view = "torch";
        } else
        {
            view = "off";
        }
        cameramanager.setFlashMode(view);
        findViewById(m.btn_flash).setSelected(T);
        if (T)
        {
            if (X)
            {
                view = Event.WORDLENS_FLASH_USED;
            } else
            {
                view = Event.FLASH_USED;
            }
            a(view);
            return;
        }
        if (true) goto _L6; else goto _L8
_L8:
        if (i1 != m.btn_translate)
        {
            break; /* Loop/switch isn't completed */
        }
        Context context = getContext();
        if (X)
        {
            view = "_enhance";
        } else
        {
            view = "_translate";
        }
        com.google.android.libraries.translate.core.b.a(context, view);
        if (j == InputUIState.VIDEO)
        {
            if (X)
            {
                view = Event.WORDLENS_SNAP;
            } else
            {
                view = Event.CAMERA_SNAP;
            }
            a(view);
            q = true;
            u();
            return;
        }
        if (j == InputUIState.FROZEN)
        {
            if (X)
            {
                view = Event.WORDLENS_SCAN;
            } else
            {
                view = Event.CAMERA_SCAN;
            }
            a(view);
            m();
            return;
        }
        if (true) goto _L6; else goto _L9
_L9:
        if (m.btn_zoom == i1)
        {
            Toast.makeText(getContext(), "Not yet implemented! Possible?", 0).show();
            return;
        }
        if (m.lang_display_header != i1 && m.btn_swap != i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (InputUIState.VIDEO == j)
        {
            if (p())
            {
                view = LanguagePicker.a(getContext(), a, b);
                if (view != null)
                {
                    Language language;
                    Language language1;
                    e e1;
                    if (com.google.android.libraries.translate.e.o.b)
                    {
                        Object obj = findViewById(m.btn_swap);
                        ((View) (obj)).setRotation(0.0F);
                        long l1 = ((View) (obj)).animate().setStartDelay(0L).rotationBy(180F).getDuration() / 2L;
                        obj = new AnimatorSet();
                        ((AnimatorSet) (obj)).playTogether(new Animator[] {
                            ObjectAnimator.ofFloat(G, View.TRANSLATION_X, new float[] {
                                0.0F, (float)G.getMeasuredWidth()
                            }), ObjectAnimator.ofFloat(H, View.TRANSLATION_X, new float[] {
                                0.0F, (float)(-H.getMeasuredWidth())
                            })
                        });
                        ((AnimatorSet) (obj)).addListener(new com.google.android.apps.translate.inputs.s(this, view));
                        AnimatorSet animatorset = new AnimatorSet();
                        animatorset.playTogether(new Animator[] {
                            ObjectAnimator.ofFloat(G, View.TRANSLATION_X, new float[] {
                                (float)G.getMeasuredWidth(), 0.0F
                            }), ObjectAnimator.ofFloat(H, View.TRANSLATION_X, new float[] {
                                (float)(-H.getMeasuredWidth()), 0.0F
                            })
                        });
                        animatorset.addListener(new t(this));
                        AnimatorSet animatorset1 = new AnimatorSet();
                        animatorset1.playSequentially(new Animator[] {
                            obj, animatorset
                        });
                        animatorset1.setDuration(l1);
                        animatorset1.setStartDelay(0L);
                        animatorset1.start();
                    } else
                    {
                        a = ((com.google.android.apps.translate.c.a) (view)).a;
                        b = ((com.google.android.apps.translate.c.a) (view)).b;
                        d(true);
                    }
                    language = ((com.google.android.apps.translate.c.a) (view)).a;
                    language1 = ((com.google.android.apps.translate.c.a) (view)).b;
                    com.google.android.libraries.translate.core.b.a(getContext(), language, language1);
                    com.google.android.libraries.translate.e.h.a(7, com.google.android.apps.translate.e.k.a(null, language, language1, "swap=1"));
                    e1 = Singleton.b();
                    if (X)
                    {
                        view = Event.WORDLENS_LANG_SWAPPED;
                    } else
                    {
                        view = Event.CAMERA_LANG_SWAPPED;
                    }
                    e1.a(view, language.getShortName(), language1.getShortName());
                    return;
                }
            } else
            {
                com.google.android.libraries.translate.e.m.a(getContext().getString(r.msg_no_camera_for_lang, new Object[] {
                    b.getLongName()
                }), 1);
                return;
            }
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (m.btn_debug_share != i1) goto _L6; else goto _L10
_L10:
        com.google.android.apps.translate.inputs.ac.d[h.getSnapMode().ordinal()];
        JVM INSTR tableswitch 1 5: default 1376
    //                   1 1411
    //                   2 1411
    //                   3 1439
    //                   4 1457
    //                   5 1475;
           goto _L11 _L12 _L12 _L13 _L14 _L15
_L15:
        break MISSING_BLOCK_LABEL_1475;
_L12:
        break; /* Loop/switch isn't completed */
_L11:
        view = null;
_L17:
        com.google.android.apps.translate.a.a a1 = com.google.android.apps.translate.a.a.a(getContext());
        if (a1 != null)
        {
            a1.execute(view);
            Toast.makeText(getContext(), "Saving debug images...", 1).show();
            return;
        }
        if (true) goto _L6; else goto _L16
_L16:
        view = new com.google.android.apps.unveil.env.j[2];
        view[0] = h.getStashedFrame();
        view[1] = h.getStashedPicture();
          goto _L17
_L13:
        view = new com.google.android.apps.unveil.env.j[1];
        view[0] = h.getStashedFrame();
          goto _L17
_L14:
        view = new com.google.android.apps.unveil.env.j[1];
        view[0] = h.getStashedPicture();
          goto _L17
        view = new com.google.android.apps.unveil.env.j[1];
        view[0] = W;
          goto _L17
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        b(false);
        if (o != null)
        {
            o.dismiss();
            o = null;
        }
        if (p != null)
        {
            p.dismiss();
            p = null;
        }
        MessageManager.a(this);
        TextInput textinput = h;
        TextInput.a.a("finish input explicitly.", new Object[0]);
        textinput.k.c();
        textinput.j = null;
        if (textinput.f != null)
        {
            textinput.f.c();
        }
        textinput.h.countDown();
        textinput.b.d();
        textinput.b.e();
        textinput.b();
        com.google.android.goggles.c.a().d();
        ArrayList arraylist = com.google.android.goggles.c.a().c();
        if (!arraylist.isEmpty())
        {
            (new com.google.android.apps.unveil.textinput.m(textinput, arraylist)).execute(new Void[0]);
        }
        textinput.setVisibility(8);
        textinput.b.setVisibility(8);
        textinput.g = false;
        textinput.f = null;
        super.onDismiss(dialoginterface);
        L.disable();
        if (P)
        {
            com.google.android.libraries.translate.e.h.a(13);
        }
    }

    public void onTextSelected(String s1)
    {
        a(new com.google.android.apps.translate.inputs.m(this, s1));
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
    {
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        GL2SurfaceView gl2surfaceview = k;
        gl2surfaceview;
        JVM INSTR monitorenter ;
        Display display;
        r = new GTRNativeViewConfig();
        surfaceholder = new DisplayMetrics();
        display = getWindow().getWindowManager().getDefaultDisplay();
        display.getMetrics(surfaceholder);
        l.pixelDensity = ((DisplayMetrics) (surfaceholder)).density;
        if (!t) goto _L2; else goto _L1
_L1:
        int i1 = display.getRotation();
        i1;
        JVM INSTR tableswitch 0 3: default 207
    //                   0 210
    //                   1 217
    //                   2 224
    //                   3 231;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_231;
_L3:
        surfaceholder = (new StringBuilder(20)).append("UNKNOWN: ").append(i1).toString();
_L12:
        surfaceholder = String.valueOf(surfaceholder);
        if (surfaceholder.length() == 0) goto _L9; else goto _L8
_L8:
        "on GL Surface creation, display rotation is: ".concat(surfaceholder);
_L11:
        i1 = com.google.android.libraries.wordlens.util.e.a(i1);
        r.a(i1);
_L2:
        if (C != null)
        {
            a(C);
            C = null;
        }
        v = true;
        gl2surfaceview;
        JVM INSTR monitorexit ;
        return;
_L9:
        new String("on GL Surface creation, display rotation is: ");
        if (true) goto _L11; else goto _L10
_L10:
        surfaceholder;
        gl2surfaceview;
        JVM INSTR monitorexit ;
        throw surfaceholder;
_L4:
        surfaceholder = "ROTATION_0";
          goto _L12
_L5:
        surfaceholder = "ROTATION_90";
          goto _L12
_L6:
        surfaceholder = "ROTATION_180";
          goto _L12
        surfaceholder = "ROTATION_270";
          goto _L12
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        k.queueEvent(new com.google.android.apps.translate.inputs.x(this));
    }

    static 
    {
        g = PausedFrameSource.WL_VIDEO_FRAME;
    }

    private class InputUIState extends Enum
    {

        public static final InputUIState CLOUDHANCE;
        public static final InputUIState FROZEN;
        public static final InputUIState UNINITIALIZED;
        public static final InputUIState VIDEO;
        private static final InputUIState a[];

        public static InputUIState valueOf(String s1)
        {
            return (InputUIState)Enum.valueOf(com/google/android/apps/translate/inputs/Camera2InputPopup$InputUIState, s1);
        }

        public static InputUIState[] values()
        {
            return (InputUIState[])a.clone();
        }

        static 
        {
            UNINITIALIZED = new InputUIState("UNINITIALIZED", 0);
            VIDEO = new InputUIState("VIDEO", 1);
            FROZEN = new InputUIState("FROZEN", 2);
            CLOUDHANCE = new InputUIState("CLOUDHANCE", 3);
            a = (new InputUIState[] {
                UNINITIALIZED, VIDEO, FROZEN, CLOUDHANCE
            });
        }

        private InputUIState(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class PausedFrameSource extends Enum
    {

        public static final PausedFrameSource TAKE_SNAPSHOT;
        public static final PausedFrameSource TEXTINPUT_VIDEO_FRAME;
        public static final PausedFrameSource WL_VIDEO_FRAME;
        private static final PausedFrameSource a[];

        public static PausedFrameSource valueOf(String s1)
        {
            return (PausedFrameSource)Enum.valueOf(com/google/android/apps/translate/inputs/Camera2InputPopup$PausedFrameSource, s1);
        }

        public static PausedFrameSource[] values()
        {
            return (PausedFrameSource[])a.clone();
        }

        static 
        {
            TAKE_SNAPSHOT = new PausedFrameSource("TAKE_SNAPSHOT", 0);
            TEXTINPUT_VIDEO_FRAME = new PausedFrameSource("TEXTINPUT_VIDEO_FRAME", 1);
            WL_VIDEO_FRAME = new PausedFrameSource("WL_VIDEO_FRAME", 2);
            a = (new PausedFrameSource[] {
                TAKE_SNAPSHOT, TEXTINPUT_VIDEO_FRAME, WL_VIDEO_FRAME
            });
        }

        private PausedFrameSource(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}

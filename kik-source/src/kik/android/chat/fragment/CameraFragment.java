// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import butterknife.ButterKnife;
import com.c.a.b.ab;
import com.kik.h.b;
import com.kik.m.k;
import com.kik.sdkutils.y;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kik.a.e.g;
import kik.a.e.v;
import kik.android.HeadphoneUnpluggedReceiver;
import kik.android.VideoContentProvider;
import kik.android.chat.KikApplication;
import kik.android.f.a.f;
import kik.android.i.d;
import kik.android.sdkutils.a;
import kik.android.util.DeviceUtils;
import kik.android.util.av;
import kik.android.util.bx;
import kik.android.util.ct;
import kik.android.util.cv;
import kik.android.util.u;
import kik.android.widget.AspectRatioImageView;
import kik.android.widget.CameraPreviewView;
import kik.android.widget.ICSCameraPreviewView;
import org.c.c;

// Referenced classes of package kik.android.chat.fragment:
//            KikScopedDialogFragment, k, s, t, 
//            u, l, m, n, 
//            o, p, q, r, 
//            w, v, y, x, 
//            z

public class CameraFragment extends KikScopedDialogFragment
    implements com.kik.h.b, kik.android.sdkutils.a
{
    private final class a extends OrientationEventListener
    {

        final CameraFragment a;

        public final void onOrientationChanged(int i1)
        {
            if (i1 != -1)
            {
                int j1 = kik.android.chat.fragment.CameraFragment.a(a);
                i1 = kik.android.util.u.b(i1, kik.android.chat.fragment.CameraFragment.a(a));
                if (i1 != 180)
                {
                    kik.android.chat.fragment.CameraFragment.a(a, i1);
                    i1 = kik.android.chat.fragment.CameraFragment.a(a);
                    Object obj = a.getActivity();
                    if (obj != null && ((Activity) (obj)).getResources() != null && ((Activity) (obj)).getResources().getConfiguration() != null)
                    {
                        obj = ((Activity) (obj)).getResources().getConfiguration();
                        if (((Configuration) (obj)).orientation == kik.android.chat.fragment.CameraFragment.b(a))
                        {
                            if (kik.android.chat.fragment.CameraFragment.a(a) == 0)
                            {
                                kik.android.chat.fragment.CameraFragment.b(a, kik.android.chat.fragment.CameraFragment.a(a));
                            }
                        } else
                        if (kik.android.chat.fragment.CameraFragment.a(a) == 90 || kik.android.chat.fragment.CameraFragment.a(a) == 270)
                        {
                            kik.android.chat.fragment.CameraFragment.b(a, kik.android.chat.fragment.CameraFragment.a(a));
                        }
                        if (j1 - i1 != 0 && (kik.android.chat.fragment.CameraFragment.a(a) == 90 || kik.android.chat.fragment.CameraFragment.a(a) == 270) && ((Configuration) (obj)).orientation == 2)
                        {
                            kik.android.chat.fragment.CameraFragment.c(a, kik.android.chat.fragment.CameraFragment.a(a));
                            if (kik.android.chat.fragment.CameraFragment.c(a) != null)
                            {
                                kik.android.chat.fragment.CameraFragment.c(a).a(kik.android.chat.fragment.CameraFragment.d(a));
                                return;
                            }
                        }
                    }
                }
            }
        }

        public a(Context context)
        {
            a = CameraFragment.this;
            super(context);
        }
    }

    public static final class b extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        public static final int e;
        private static final int f[];

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = 4;
            e = 5;
            f = (new int[] {
                a, b, c, d, e
            });
        }
    }

    public static interface c
    {

        public abstract void a();

        public abstract void b();
    }


    private static final org.c.b e = org.c.c.a("CameraFragment");
    private static final int j = kik.android.util.u.a();
    private static final List n = Arrays.asList(new String[] {
        "auto", "off", "on"
    });
    private int A;
    private int B;
    private int C;
    private g D;
    private KikChatFragment.d E;
    private int F;
    private boolean G;
    private boolean H;
    private View I;
    private kik.android.widget.a J;
    private kik.android.c.a K;
    private a L;
    private android.hardware.Camera.Size M;
    private int N;
    private Handler O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean U;
    private boolean V;
    private MediaRecorder W;
    private String X;
    private String Y;
    private CountDownTimer Z;
    View _cameraCover;
    View _cameraErrorCover;
    View _cameraShutterBar;
    FrameLayout _clipFrame;
    ImageView _lightingButton;
    View _liveCameraContainer;
    View _previewContainer;
    AspectRatioImageView _previewImage;
    View _retakeButton;
    View _shadeCover;
    View _shutterButton;
    View _swapCameraButton;
    FrameLayout _touchFocusImage;
    View _usePhotoButton;
    TextView _videoInstructionText;
    ProgressBar _videoProgress;
    TextView _videoTime;
    VideoView _videoView;
    v a;
    private c aa;
    private kik.android.e.c ab;
    private float ac;
    private android.hardware.Camera.ShutterCallback ad;
    private android.hardware.Camera.AutoFocusCallback ae;
    private android.hardware.Camera.AutoFocusCallback af;
    private android.hardware.Camera.PictureCallback ag;
    private android.view.View.OnLongClickListener ah;
    private android.view.View.OnTouchListener ai;
    private android.view.View.OnTouchListener aj;
    com.kik.android.a b;
    com.kik.l.ab c;
    boolean d;
    private KikChatFragment.e f;
    private String g;
    private boolean h;
    private int i;
    private Camera k;
    private final Object l = new Object();
    private int m;
    private List o;
    private int p;
    private int q;
    private int r;
    private Bitmap s;
    private int t;
    private int x;
    private int y;
    private int z;

    public CameraFragment()
    {
        f = kik.android.chat.fragment.KikChatFragment.e.d;
        m = -1;
        o = new ArrayList();
        p = 0;
        t = 0xff888888;
        x = -1;
        y = -1;
        z = -1;
        G = false;
        H = false;
        d = false;
        M = null;
        N = kik.android.chat.fragment.b.b;
        O = new Handler();
        P = false;
        Q = false;
        R = false;
        S = false;
        U = false;
        V = false;
        ac = -1F;
        ad = new kik.android.chat.fragment.k(this);
        ae = new s(this);
        af = new t(this);
        ag = new kik.android.chat.fragment.u(this);
        ah = new l(this);
        ai = new m(this);
        aj = new n(this);
    }

    private static int a(int i1)
    {
        int j1;
        if (i1 > 999)
        {
            j1 = 999;
        } else
        {
            j1 = i1;
            if (i1 < -999)
            {
                return -999;
            }
        }
        return j1;
    }

    static int a(CameraFragment camerafragment)
    {
        return camerafragment.A;
    }

    static int a(CameraFragment camerafragment, int i1)
    {
        camerafragment.A = i1;
        return i1;
    }

    static Bitmap a(CameraFragment camerafragment, Bitmap bitmap)
    {
        camerafragment.s = bitmap;
        return bitmap;
    }

    private com.kik.android.a.f a(com.kik.android.a.f f1)
    {
        Object obj;
        boolean flag = true;
        if (f1 == null)
        {
            return null;
        }
        obj = f1.a("Is Maximized", m()).a("Has Front Facing", n()).a("Is Front Facing", o());
        com.kik.android.a.f f2;
        if (i <= 1)
        {
            flag = false;
        }
        f2 = ((com.kik.android.a.f) (obj)).a("Has Flash", flag);
        obj = g;
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!((String) (obj)).equals("on")) goto _L4; else goto _L3
_L3:
        obj = "On";
_L6:
        f2.a("Flash Mode", obj).a("Is Landscape", p()).a("Attempts", F).a("Tapped To Focus During Preview", G);
        return f1;
_L4:
        if (((String) (obj)).equals("auto"))
        {
            obj = "Auto";
            continue; /* Loop/switch isn't completed */
        }
_L2:
        obj = "Off";
        if (true) goto _L6; else goto _L5
_L5:
    }

    static d a(CameraFragment camerafragment, int i1, int j1, boolean flag)
    {
        int j2 = camerafragment.I.getHeight();
        int k2 = camerafragment.I.getWidth();
        int l1 = camerafragment._clipFrame.getHeight();
        int k1 = camerafragment._clipFrame.getWidth();
        double d1 = (double)j1 / (double)j2;
        double d2 = (double)i1 / (double)j2;
        int i2;
        if (flag)
        {
            l1 = (int)Math.ceil((double)(j2 - l1) * d1);
            k1 = (int)Math.ceil((double)(k2 - k1) * d1);
        } else
        {
            l1 = (int)Math.ceil((double)(j2 - l1) * d2);
            k1 = (int)Math.ceil((double)(k2 - k1) * d2);
        }
        i2 = l1;
        if (l1 < 0)
        {
            i2 = 0;
        }
        l1 = k1;
        if (k1 < 0)
        {
            l1 = 0;
        }
        k1 = Math.abs(Math.min(0, camerafragment.I.getLeft()));
        d1 = (double)Math.abs(Math.min(0, camerafragment.I.getTop())) / (double)j2;
        d2 = (double)k1 / (double)k2;
        if (flag)
        {
            j2 = (int)((double)i1 * d2);
            k1 = (int)((double)j1 * d1);
            l1 = i1 - l1;
            k2 = j1 - i2;
            i2 = k1;
            k1 = k2;
        } else
        {
            j2 = (int)((double)i1 * d1);
            int l2 = (int)(d2 * (double)j1);
            i2 = i1 - i2;
            k1 = j1 - l1;
            l1 = i2;
            i2 = l2;
        }
        return new d(new Point(i1, j1), new Point(l1, k1), new Point(j2, i2));
    }

    private void a(Camera camera)
    {
        if (camera == null || f())
        {
            if (camera != null)
            {
                camera.release();
            }
            if (k == null)
            {
                b(true);
            }
            return;
        }
        b(false);
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        k = camera;
        e(-1);
        if (a == null) goto _L2; else goto _L1
_L1:
        if (k != null && !f()) goto _L4; else goto _L3
_L3:
        Object obj1;
        boolean flag;
        if (i > 0 && (i != 1 || !"off".equals(o.get(0))))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (!h) goto _L6; else goto _L5
_L5:
        camera = a.n("kik.android.chat.fragment.CameraFragment.FlashPreference");
        if (camera == null) goto _L8; else goto _L7
_L7:
        if (!o.contains(camera)) goto _L8; else goto _L9
_L9:
        p = o.indexOf(camera);
        g = camera;
_L18:
        a(g);
        _lightingButton.setEnabled(true);
        if (!P || !t()) goto _L11; else goto _L10
_L10:
        b("torch");
_L2:
        if (k == null) goto _L13; else goto _L12
_L12:
        camera = k.getParameters();
        if (K != null && K.a() && N == kik.android.chat.fragment.b.a)
        {
            k();
        }
        obj1 = camera.getSupportedFocusModes();
        if (obj1 == null) goto _L13; else goto _L14
_L14:
        if (!((List) (obj1)).contains("continuous-picture")) goto _L16; else goto _L15
_L15:
        camera.setFocusMode("continuous-picture");
_L20:
        k.setParameters(camera);
_L13:
        K.a(k);
        N = kik.android.chat.fragment.b.a;
        _swapCameraButton.postDelayed(new o(this), 100L);
_L17:
        obj;
        JVM INSTR monitorexit ;
        return;
        camera;
        obj;
        JVM INSTR monitorexit ;
        throw camera;
_L4:
        camera = k.getParameters().getSupportedFlashModes();
        o.clear();
        if (camera != null)
        {
            break MISSING_BLOCK_LABEL_382;
        }
        i = 0;
          goto _L3
        camera;
        b(true);
          goto _L17
        obj1 = n.iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            String s1 = (String)((Iterator) (obj1)).next();
            if (camera.contains(s1))
            {
                o.add(s1);
            }
        } while (true);
        i = o.size();
          goto _L3
_L8:
        p = 0;
        g = (String)o.get(0);
        a.c("kik.android.chat.fragment.CameraFragment.FlashPreference", g);
          goto _L18
_L11:
        b(g);
          goto _L2
_L6:
        a(((String) (null)));
          goto _L2
_L16:
        if (!((List) (obj1)).contains("auto")) goto _L20; else goto _L19
_L19:
        camera.setFocusMode("auto");
          goto _L20
    }

    private void a(String s1)
    {
        if (_lightingButton != null)
        {
            if (s1 == null)
            {
                _lightingButton.setVisibility(8);
                return;
            }
            cv.b(new View[] {
                _lightingButton
            });
            boolean flag;
            if (s1.equals("auto"))
            {
                _lightingButton.setImageResource(0x7f02011e);
            } else
            if (s1.equals("off"))
            {
                _lightingButton.setImageResource(0x7f02011f);
            } else
            if (s1.equals("on"))
            {
                _lightingButton.setImageResource(0x7f020120);
            } else
            {
                cv.e(new View[] {
                    _lightingButton
                });
            }
            if (_previewContainer.getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag || P)
            {
                cv.e(new View[] {
                    _lightingButton
                });
                return;
            }
        }
    }

    static void a(CameraFragment camerafragment, float f1, float f2)
    {
        Rect rect;
        android.hardware.Camera.Parameters parameters;
        List list;
        try
        {
            if (camerafragment.k == null)
            {
                break MISSING_BLOCK_LABEL_306;
            }
            camerafragment.k();
            rect = new Rect((int)(f1 - 100F), (int)(f2 - 100F), (int)(f1 + 100F), (int)(100F + f2));
            int i1 = (rect.left * 2000) / camerafragment._clipFrame.getWidth();
            int j1 = (rect.top * 2000) / camerafragment._clipFrame.getHeight();
            int k1 = (rect.right * 2000) / camerafragment._clipFrame.getWidth();
            int l1 = (rect.bottom * 2000) / camerafragment._clipFrame.getHeight();
            rect = new Rect(a(i1 - 1000), a(j1 - 1000), a(k1 - 1000), a(l1 - 1000));
            parameters = camerafragment.k.getParameters();
            list = parameters.getSupportedFocusModes();
        }
        // Misplaced declaration of an exception variable
        catch (CameraFragment camerafragment)
        {
            bx.a(camerafragment);
            return;
        }
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        if (list.contains("auto"))
        {
            parameters.setFocusMode("auto");
        }
        if (parameters.getMaxNumFocusAreas() > 0)
        {
            parameters.setFocusAreas(com.c.a.b.ab.a(new android.hardware.Camera.Area[] {
                new android.hardware.Camera.Area(rect, 1000)
            }));
        }
        if (parameters.getMaxNumMeteringAreas() > 0)
        {
            parameters.setMeteringAreas(com.c.a.b.ab.a(new android.hardware.Camera.Area[] {
                new android.hardware.Camera.Area(rect, 1000)
            }));
        }
        camerafragment.k.setParameters(parameters);
        cv.b(new View[] {
            camerafragment._touchFocusImage
        });
        camerafragment.V = true;
        camerafragment.k.autoFocus(camerafragment.af);
    }

    static void a(CameraFragment camerafragment, String s1)
    {
        camerafragment.b(s1);
    }

    static int b(CameraFragment camerafragment)
    {
        return camerafragment.q;
    }

    static int b(CameraFragment camerafragment, int i1)
    {
        camerafragment.r = i1;
        return i1;
    }

    private com.kik.android.a.f b(com.kik.android.a.f f1)
    {
        if (f1 == null)
        {
            return null;
        }
        f1 = a(f1);
        if (ac > 0.0F)
        {
            f1.a("Video Length", ac);
        }
        f1.a("Tapped To Focus During Preview", G);
        f1.a("Tapped To Focus During Recording", H);
        return f1;
    }

    private void b(String s1)
    {
        if (k != null)
        {
            android.hardware.Camera.Parameters parameters = k.getParameters();
            if (parameters != null && parameters.getSupportedFlashModes() != null && parameters.getSupportedFlashModes().contains(s1))
            {
                parameters.setFlashMode(s1);
                k.setParameters(parameters);
            }
        }
    }

    private void b(boolean flag)
    {
label0:
        {
            if (_cameraErrorCover != null)
            {
                if (!flag)
                {
                    break label0;
                }
                _cameraErrorCover.setVisibility(0);
                cv.e(new View[] {
                    _shutterButton, _swapCameraButton, _lightingButton
                });
            }
            return;
        }
        if (_usePhotoButton != null && _usePhotoButton.getVisibility() != 0)
        {
            cv.b(new View[] {
                _shutterButton, _swapCameraButton, _lightingButton
            });
        }
        _cameraErrorCover.setVisibility(8);
    }

    private int c(boolean flag)
    {
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(z, camerainfo);
        B = kik.android.util.u.a(camerainfo, r);
        if (flag)
        {
            return kik.android.util.u.a(camerainfo, A);
        } else
        {
            return B;
        }
    }

    static kik.android.c.a c(CameraFragment camerafragment)
    {
        return camerafragment.K;
    }

    static void c(CameraFragment camerafragment, int i1)
    {
        camerafragment.e(i1);
    }

    static Camera d(CameraFragment camerafragment)
    {
        return camerafragment.k;
    }

    private void d(boolean flag)
    {
        if (_shutterButton != null)
        {
            _shutterButton.setEnabled(flag);
        }
        if (_lightingButton != null)
        {
            _lightingButton.setEnabled(flag);
        }
    }

    private void e(int i1)
    {
label0:
        {
            synchronized (l)
            {
                if (k != null && !f())
                {
                    break label0;
                }
            }
            return;
        }
        obj;
        JVM INSTR monitorexit ;
        if (i1 >= 0)
        {
            i1 = kik.android.util.u.a(i1);
        } else
        {
            i1 = kik.android.util.u.a(getActivity());
        }
        i1 = kik.android.util.u.a(i1, z);
        if (m != i1)
        {
            m = i1;
            if (com.kik.sdkutils.y.b(16))
            {
                k.stopPreview();
                d = false;
            }
            k.setDisplayOrientation(m);
            obj = k.getParameters();
            double d2 = 1.3333333333333333D;
            double d1 = d2;
            if (com.kik.sdkutils.y.a(14))
            {
                d1 = d2;
                if (((android.hardware.Camera.Parameters) (obj)).getSupportedVideoSizes() != null)
                {
                    Object obj1 = kik.android.util.u.a(((android.hardware.Camera.Parameters) (obj)).getSupportedVideoSizes());
                    float f1;
                    int ai1[];
                    Object obj2;
                    int j1;
                    if (obj1 != null)
                    {
                        d1 = (double)((android.hardware.Camera.Size) (obj1)).width / (double)((android.hardware.Camera.Size) (obj1)).height;
                        M = ((android.hardware.Camera.Size) (obj1));
                    } else
                    {
                        CamcorderProfile camcorderprofile = f(z);
                        d1 = (double)camcorderprofile.videoFrameWidth / (double)camcorderprofile.videoFrameHeight;
                    }
                }
            }
            obj1 = kik.android.util.u.b(getActivity(), ((android.hardware.Camera.Parameters) (obj)).getSupportedPreviewSizes(), d1);
            ((android.hardware.Camera.Parameters) (obj)).setPreviewSize(((android.hardware.Camera.Size) (obj1)).width, ((android.hardware.Camera.Size) (obj1)).height);
            obj2 = ((android.hardware.Camera.Parameters) (obj)).getSupportedPictureSizes();
            obj2 = kik.android.util.u.a(getActivity(), ((List) (obj2)), (double)((android.hardware.Camera.Size) (obj1)).width / (double)((android.hardware.Camera.Size) (obj1)).height);
            if (obj2 != null)
            {
                ((android.hardware.Camera.Parameters) (obj)).setPictureSize(((android.hardware.Camera.Size) (obj2)).width, ((android.hardware.Camera.Size) (obj2)).height);
            }
            j1 = ((android.hardware.Camera.Size) (obj1)).width;
            i1 = ((android.hardware.Camera.Size) (obj1)).height;
            if (m % 180 != 0)
            {
                j1 = ((android.hardware.Camera.Size) (obj1)).height;
                i1 = ((android.hardware.Camera.Size) (obj1)).width;
            }
            obj1 = I.getResources().getDisplayMetrics();
            f1 = (float)((DisplayMetrics) (obj1)).widthPixels / (float)j1;
            i1 = (int)((float)i1 * f1);
            j1 = ((DisplayMetrics) (obj1)).widthPixels;
            J.a(j1, i1);
            ai1 = kik.android.util.u.b(((android.hardware.Camera.Parameters) (obj)).getSupportedPreviewFpsRange());
            if (ai1 != null)
            {
                ((android.hardware.Camera.Parameters) (obj)).setPreviewFpsRange(ai1[0], ai1[1]);
            }
            k.setParameters(((android.hardware.Camera.Parameters) (obj)));
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void e(boolean flag)
    {
        if (_swapCameraButton != null)
        {
            _swapCameraButton.setEnabled(flag);
        }
    }

    static boolean e(CameraFragment camerafragment)
    {
        camerafragment.V = false;
        return false;
    }

    private static CamcorderProfile f(int i1)
    {
        if (CamcorderProfile.hasProfile(i1, 4))
        {
            return CamcorderProfile.get(i1, 4);
        } else
        {
            return CamcorderProfile.get(i1, 1);
        }
    }

    static void f(CameraFragment camerafragment)
    {
        camerafragment.k();
    }

    private boolean f()
    {
        return _liveCameraContainer == null;
    }

    private void g()
    {
        if (q() || !com.kik.sdkutils.y.a(14))
        {
            cv.e(new View[] {
                _videoInstructionText
            });
            return;
        } else
        {
            cv.b(new View[] {
                _videoInstructionText
            });
            _videoInstructionText.bringToFront();
            return;
        }
    }

    static boolean g(CameraFragment camerafragment)
    {
        return camerafragment.p();
    }

    static int h(CameraFragment camerafragment)
    {
        return camerafragment.B;
    }

    private void h()
    {
label0:
        {
            synchronized (l)
            {
                if (k == null)
                {
                    break label0;
                }
                a(k);
            }
            return;
        }
        obj;
        JVM INSTR monitorexit ;
        if (x != -1 || y != -1)
        {
            obj = a.a("kik.android.chat.fragment.CameraFragment.SelectCameraPreference", -1);
            if (((Integer) (obj)).intValue() >= 0)
            {
                z = ((Integer) (obj)).intValue();
            } else
            {
                if (y != -1)
                {
                    z = y;
                } else
                {
                    z = x;
                }
                a.a("kik.android.chat.fragment.CameraFragment.SelectCameraPreference", Integer.valueOf(z));
            }
        }
        a(kik.android.util.u.b(z));
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void i()
    {
        synchronized (l)
        {
            if (k != null)
            {
                k.stopPreview();
                N = kik.android.chat.fragment.b.b;
                K.b();
                k.release();
                k = null;
                d = false;
                m = -1;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static boolean i(CameraFragment camerafragment)
    {
        return camerafragment.o();
    }

    private void j()
    {
        if (W != null)
        {
            W.stop();
            W.release();
            W = null;
        }
    }

    static void j(CameraFragment camerafragment)
    {
        camerafragment.d(true);
        camerafragment = camerafragment.getActivity();
        if (camerafragment != null)
        {
            Toast.makeText(camerafragment, camerafragment.getString(0x7f0900ae), 1).show();
        }
    }

    private void k()
    {
        if (k == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        k.cancelAutoFocus();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
    }

    static void k(CameraFragment camerafragment)
    {
        if (camerafragment.k != null)
        {
            synchronized (camerafragment.l)
            {
                camerafragment.k.startPreview();
                camerafragment.N = kik.android.chat.fragment.b.a;
            }
            return;
        } else
        {
            return;
        }
        camerafragment;
        obj;
        JVM INSTR monitorexit ;
        throw camerafragment;
    }

    static Bitmap l(CameraFragment camerafragment)
    {
        return camerafragment.s;
    }

    private void l()
    {
        _videoProgress.setProgress(0);
        _videoTime.setText("00:00");
    }

    static void m(CameraFragment camerafragment)
    {
        if (camerafragment._previewContainer != null)
        {
            cv.e(new View[] {
                camerafragment._liveCameraContainer, camerafragment._shutterButton, camerafragment._lightingButton, camerafragment._swapCameraButton, camerafragment._videoTime, camerafragment._videoProgress
            });
            cv.b(new View[] {
                camerafragment._previewContainer, camerafragment._previewImage
            });
            cv.b(new View[] {
                camerafragment._usePhotoButton, camerafragment._retakeButton
            });
            camerafragment.d(true);
        }
    }

    private boolean m()
    {
        return f == kik.android.chat.fragment.KikChatFragment.e.c;
    }

    private boolean n()
    {
        return x >= 0;
    }

    static boolean n(CameraFragment camerafragment)
    {
        return camerafragment.P;
    }

    static void o(CameraFragment camerafragment)
    {
        camerafragment.j();
    }

    private boolean o()
    {
        return n() && z == x;
    }

    static void p(CameraFragment camerafragment)
    {
        camerafragment.i();
    }

    private boolean p()
    {
        for (android.support.v4.app.FragmentActivity fragmentactivity = getActivity(); fragmentactivity == null || fragmentactivity.getResources().getConfiguration().orientation != 2;)
        {
            return false;
        }

        return true;
    }

    static android.view.View.OnTouchListener q(CameraFragment camerafragment)
    {
        return camerafragment.aj;
    }

    private boolean q()
    {
        boolean flag = false;
        if (a.a("kik.num-videos-sent", 0).intValue() >= 3)
        {
            flag = true;
        }
        return flag;
    }

    static kik.android.e.c r(CameraFragment camerafragment)
    {
        return camerafragment.ab;
    }

    private void r()
    {
        if (_previewContainer != null)
        {
            _liveCameraContainer.setVisibility(0);
            cv.b(new View[] {
                _shutterButton
            });
            cv.e(new View[] {
                _usePhotoButton, _retakeButton, _previewContainer, _videoView
            });
            if (h)
            {
                cv.b(new View[] {
                    _lightingButton
                });
            } else
            {
                cv.e(new View[] {
                    _lightingButton
                });
            }
            s();
            d(true);
            cv.b(new View[] {
                I
            });
            if (k != null)
            {
                try
                {
                    k.startPreview();
                }
                catch (RuntimeException runtimeexception)
                {
                    b(true);
                }
            } else
            {
                h();
            }
            g();
            HeadphoneUnpluggedReceiver.a().b(this);
            R = false;
            DeviceUtils.h();
        }
    }

    private void s()
    {
label0:
        {
            if (_swapCameraButton != null)
            {
                if (j <= 1)
                {
                    break label0;
                }
                cv.b(new View[] {
                    _swapCameraButton
                });
            }
            return;
        }
        cv.e(new View[] {
            _swapCameraButton
        });
    }

    static boolean s(CameraFragment camerafragment)
    {
        return camerafragment.t();
    }

    private boolean t()
    {
        return "on".equals(g) && z == y && k.getParameters().getSupportedFlashModes().contains("torch");
    }

    static boolean t(CameraFragment camerafragment)
    {
        return camerafragment.Q;
    }

    static boolean u(CameraFragment camerafragment)
    {
        camerafragment.H = true;
        return true;
    }

    static boolean v(CameraFragment camerafragment)
    {
        camerafragment.G = true;
        return true;
    }

    static void w(CameraFragment camerafragment)
    {
        camerafragment.e(true);
    }

    public final void a()
    {
        boolean flag1 = true;
        if (k != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!m() && com.kik.sdkutils.y.a(16))
        {
            U = true;
            if (E != null)
            {
                E.a();
            }
        }
        F = F + 1;
        CamcorderProfile camcorderprofile;
        android.hardware.Camera.Parameters parameters;
        android.hardware.Camera.Size size;
        camcorderprofile = f(z);
        parameters = k.getParameters();
        size = parameters.getPreviewSize();
        Object obj;
        boolean flag;
        if (parameters.getSupportedVideoSizes() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (parameters.getSupportedFocusModes() != null && parameters.getSupportedFocusModes().contains("continuous-video"))
        {
            parameters.setFocusMode("continuous-video");
        }
        k.setParameters(parameters);
        W = new MediaRecorder();
        k.stopPreview();
        k.unlock();
        W.setCamera(k);
        W.setAudioSource(5);
        W.setVideoSource(1);
        if (r != 0)
        {
            flag1 = false;
        }
        W.setOrientationHint(c(flag1));
        W.setProfile(camcorderprofile);
        if (0xea600 < camcorderprofile.videoBitRate)
        {
            W.setVideoEncodingBitRate(0xea600);
        }
        if (K instanceof kik.android.c.c)
        {
            W.setPreviewDisplay(((kik.android.c.c)K).d());
        }
        if (M == null) goto _L4; else goto _L3
_L3:
        W.setVideoSize(M.width, M.height);
_L6:
        Y = UUID.randomUUID().toString();
        X = c.b(Y);
        W.setOutputFile(X);
        W.setMaxDuration(15000);
        W.setMaxFileSize(0x4c4b40L);
        W.setOnInfoListener(new p(this));
        W.prepare();
        Z = new q(this);
        W.start();
        Z.start();
        P = true;
        cv.b(new View[] {
            _videoTime, _videoProgress
        });
        cv.e(new View[] {
            _retakeButton, _lightingButton, _swapCameraButton, _videoInstructionText
        });
        if (aa != null)
        {
            aa.a();
            return;
        }
          goto _L1
        obj;
        Toast.makeText(_videoView.getContext(), KikApplication.f(0x7f090266), 0).show();
        return;
_L4:
        if (!flag) goto _L6; else goto _L5
_L5:
        if (!com.kik.sdkutils.y.a(16)) goto _L6; else goto _L7
_L7:
        W.setVideoSize(size.width, size.height);
          goto _L6
        obj;
        (new StringBuilder("Something went wrong preparing video recording: ")).append(((IOException) (obj)).toString());
        return;
    }

    public final void a(g g1)
    {
        D = g1;
        if (b != null)
        {
            g1 = b.b("Camera Tray Opened").a("Is Maximized", m()).a("Has Front Facing", n());
            boolean flag;
            if (i > 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            g1.a("Has Flash", flag).a("Is Landscape", p()).a("Has Permission", true).b();
        }
    }

    public final void a(c c1)
    {
        aa = c1;
    }

    public final void a(KikChatFragment.d d1)
    {
        E = d1;
    }

    public final void a(KikChatFragment.e e1)
    {
        if (com.kik.sdkutils.y.b(16))
        {
            if (e1 == kik.android.chat.fragment.KikChatFragment.e.f)
            {
                I.setVisibility(8);
                _shadeCover.setVisibility(0);
                _shadeCover.setBackgroundColor(t);
                _shadeCover.getLayoutParams().width = I.getWidth();
                _shadeCover.getLayoutParams().height = I.getHeight();
            } else
            if (e1 == kik.android.chat.fragment.KikChatFragment.e.g)
            {
                I.setVisibility(0);
                _shadeCover.setBackgroundDrawable(null);
                _shadeCover.getLayoutParams().width = I.getWidth();
                _shadeCover.getLayoutParams().height = I.getHeight();
                _shadeCover.setVisibility(0);
                av.a(_shadeCover, t, com.kik.android.a.c.a.b);
                h();
            }
        }
        if (e1 == kik.android.chat.fragment.KikChatFragment.e.g && N == kik.android.chat.fragment.b.a)
        {
            d(true);
        }
        if (e1 == kik.android.chat.fragment.KikChatFragment.e.a)
        {
            F = 0;
            if (_videoView != null && _videoView.isPlaying())
            {
                _videoView.pause();
            }
        }
        if (e1 == kik.android.chat.fragment.KikChatFragment.e.c || e1 == kik.android.chat.fragment.KikChatFragment.e.b)
        {
            d(true);
            boolean flag;
            if (!Q)
            {
                if (I != null)
                {
                    I.setVisibility(0);
                    I.invalidate();
                }
                h();
            } else
            if (_videoView != null && !_videoView.isPlaying() && Q && S)
            {
                _videoView.start();
            } else
            if (_videoView != null && f != KikChatFragment.e.e && f != kik.android.chat.fragment.KikChatFragment.e.d && f != KikChatFragment.e.h && !U)
            {
                _videoView.pause();
            }
            if (f != kik.android.chat.fragment.KikChatFragment.e.f && S)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            S = flag;
            f = e1;
        }
        if (e1 == kik.android.chat.fragment.KikChatFragment.e.f || e1 == KikChatFragment.e.e || e1 == kik.android.chat.fragment.KikChatFragment.e.a || e1 == kik.android.chat.fragment.KikChatFragment.e.d)
        {
            f = e1;
            G = false;
            H = false;
            cv.e(new View[] {
                _touchFocusImage
            });
        }
        if (e1 == kik.android.chat.fragment.KikChatFragment.e.g)
        {
            S = true;
            if (_videoView != null && !_videoView.isPlaying() && Q)
            {
                _videoView.start();
            }
        }
    }

    public final void a(kik.android.e.c c1)
    {
        ab = c1;
    }

    final void b()
    {
        P = false;
        Z.cancel();
        if (aa != null)
        {
            aa.b();
        }
        if (V)
        {
            k();
            V = false;
            if (_touchFocusImage.getVisibility() == 0)
            {
                av.b(_touchFocusImage, 250);
            }
        }
        if ("on".equals(g))
        {
            b("off");
        }
        MediaRecorder mediarecorder = W;
        if (mediarecorder == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        W.stop();
        W.reset();
        W.release();
        W = null;
        if (k != null)
        {
            k.lock();
            k.reconnect();
        }
        ac = _videoProgress.getProgress() / 1000;
        l();
        if (_videoView != null)
        {
            Q = true;
            HeadphoneUnpluggedReceiver.a().a(this);
            if (g != null)
            {
                b(g);
            }
            cv.b(new View[] {
                _videoView, _usePhotoButton, _retakeButton
            });
            av.b(I, 150);
            av.a(_previewContainer, 150, 0L, null);
            cv.e(new View[] {
                _previewImage, _shutterButton, _lightingButton, _swapCameraButton, _videoTime, _videoProgress
            });
            _videoView.setVideoURI(VideoContentProvider.a(X));
            _videoView.setOnPreparedListener(new r(this));
            _videoView.requestFocus();
            _videoView.start();
            if (U && E != null)
            {
                E.b();
            }
        }
        b(b.b("Video Recorded")).b();
        U = false;
        return;
        Object obj;
        obj;
        Toast.makeText(_videoView.getContext(), KikApplication.f(0x7f0900df), 0).show();
        cv.e(new View[] {
            _videoProgress, _videoTime
        });
        r();
        try
        {
            W.reset();
            W.release();
            W = null;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Toast.makeText(_videoView.getContext(), KikApplication.f(0x7f090266), 0).show();
        }
        l();
        return;
        obj;
        W.reset();
        W.release();
        W = null;
        throw obj;
    }

    public final void c()
    {
        Object obj;
        if (k == null || N != kik.android.chat.fragment.b.a)
        {
            return;
        }
        try
        {
            d(false);
            N = kik.android.chat.fragment.b.d;
            obj = k.getParameters().getFocusMode();
            if ("auto".equals(obj))
            {
                k.autoFocus(ae);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bx.a(((Throwable) (obj)));
            b(true);
            return;
        }
        List list;
        if (!"continuous-picture".equals(obj))
        {
            break MISSING_BLOCK_LABEL_137;
        }
        obj = k.getParameters();
        list = ((android.hardware.Camera.Parameters) (obj)).getSupportedFocusModes();
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        if (list.contains("auto"))
        {
            ((android.hardware.Camera.Parameters) (obj)).setFocusMode("auto");
        }
        k.setParameters(((android.hardware.Camera.Parameters) (obj)));
        k.autoFocus(ae);
        return;
        d();
        return;
    }

    public void changeFlashMode()
    {
        if (k == null || o == null || o.size() <= 0)
        {
            return;
        }
        p = p + 1;
        int i1;
        if (i == 0)
        {
            i1 = 0;
        } else
        {
            i1 = p % i;
        }
        g = (String)o.get(i1);
        b(g);
        a(g);
        a.c("kik.android.chat.fragment.CameraFragment.FlashPreference", g);
    }

    public final void d()
    {
        if (k == null)
        {
            N = kik.android.chat.fragment.b.a;
            return;
        }
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        if (N != kik.android.chat.fragment.b.d && N != kik.android.chat.fragment.b.a)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        F = F + 1;
        a(b.b("Photo Taken")).b();
        N = b.e;
        Exception exception;
        boolean flag;
        if (r == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        C = c(flag);
        k.takePicture(ad, null, ag);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void e()
    {
        if (Q && _videoView != null)
        {
            R = true;
            DeviceUtils.g();
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        L = new a(activity);
        t = activity.getResources().getColor(0x7f0c0009);
        q = kik.android.util.u.b(activity);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        e(-1);
        f = KikChatFragment.e.h;
        if (K != null)
        {
            K.a(k);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        V().a(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        int i1;
        i1 = 0;
        bundle = layoutinflater.inflate(0x7f03001e, viewgroup, false);
        ButterKnife.inject(this, bundle);
        _videoProgress.setMax(15000);
        int j1;
        if (com.kik.sdkutils.y.a(16))
        {
            layoutinflater = (ICSCameraPreviewView)layoutinflater.inflate(0x7f030053, _clipFrame, false);
            viewgroup = viewgroup.getResources().getDisplayMetrics();
            layoutinflater.getLayoutParams().width = ((DisplayMetrics) (viewgroup)).widthPixels;
            I = layoutinflater;
            J = layoutinflater;
            K = new w(this, layoutinflater, new kik.android.chat.fragment.v(this));
            _clipFrame.addView(I);
        } else
        {
            layoutinflater = (CameraPreviewView)layoutinflater.inflate(0x7f030020, _clipFrame, false);
            I = layoutinflater;
            J = layoutinflater;
            K = new kik.android.chat.fragment.y(this, layoutinflater, O, new x(this));
            _clipFrame.addView(I);
        }
        layoutinflater = (android.widget.FrameLayout.LayoutParams)I.getLayoutParams();
        layoutinflater.gravity = 17;
        I.setLayoutParams(layoutinflater);
        _cameraCover.bringToFront();
        j1 = Camera.getNumberOfCameras();
label0:
        {
            if (i1 >= j1)
            {
                break label0;
            }
            layoutinflater = new android.hardware.Camera.CameraInfo();
            try
            {
                Camera.getCameraInfo(i1, layoutinflater);
                if (x != -1 || ((android.hardware.Camera.CameraInfo) (layoutinflater)).facing != 1)
                {
                    break; /* Loop/switch isn't completed */
                }
                x = i1;
            }
            // Misplaced declaration of an exception variable
            catch (LayoutInflater layoutinflater)
            {
                bx.a(layoutinflater, 5);
            }
        }
        i1++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_150;
_L1:
        if (y == -1 && ((android.hardware.Camera.CameraInfo) (layoutinflater)).facing == 0)
        {
            y = i1;
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_193;
        } else
        {
            z = y;
            s();
            _retakeButton.setVisibility(8);
            _usePhotoButton.setVisibility(8);
            _shutterButton.setOnTouchListener(ai);
            _shutterButton.setOnLongClickListener(ah);
            bundle.setOnTouchListener(new z(this));
            g();
            return bundle;
        }
    }

    public void onPause()
    {
        super.onPause();
        if (L != null)
        {
            L.disable();
        }
        if (P)
        {
            j();
        }
        i();
        if (R)
        {
            DeviceUtils.h();
        }
        if (Q)
        {
            _videoView.pause();
        }
    }

    public void onResume()
    {
        super.onResume();
        av.a(_cameraCover, t, com.kik.android.a.c.a.b);
        h();
        _cameraShutterBar.bringToFront();
        if (L != null)
        {
            L.enable();
        }
        if (R)
        {
            DeviceUtils.g();
        }
        if (Q)
        {
            _videoView.start();
        }
    }

    public void retakePhoto()
    {
        Q = false;
        r();
    }

    protected void switchCamera()
    {
        if (N != kik.android.chat.fragment.b.a)
        {
            return;
        }
        if (z == x && y >= 0)
        {
            z = y;
        } else
        {
            z = x;
        }
        e(false);
        i();
        a(kik.android.util.u.b(z));
        a.a("kik.android.chat.fragment.CameraFragment.SelectCameraPreference", Integer.valueOf(z));
    }

    public void usePhoto()
    {
        if (Q)
        {
            if (!q())
            {
                int i1 = a.a("kik.num-videos-sent", 0).intValue();
                a.a("kik.num-videos-sent", Integer.valueOf(i1 + 1));
            }
            b(b.b("Video Sent")).b();
            ac = -1F;
            r();
            Q = false;
            if (k != null)
            {
                k.startPreview();
            }
            _videoView.stopPlayback();
            cv.e(new View[] {
                _videoView
            });
            g();
            HeadphoneUnpluggedReceiver.a().b(this);
            R = false;
            DeviceUtils.h();
            D.a(kik.android.f.a.f.a().a(getActivity(), X, ct.c(X), Y));
            c.a(Y, X);
            File file = new File(VideoContentProvider.a(X).getPath());
            a.b(file);
            X = null;
            Y = null;
            return;
        }
        if (s == null || D == null) goto _L2; else goto _L1
_L1:
        Bitmap bitmap;
        a(b.b("Photo Attached")).b();
        bitmap = s;
        if (C == B)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        Object obj;
        int k1;
        obj = new Matrix();
        k1 = C - B;
        int j1 = k1;
        if (o())
        {
            j1 = (360 - k1) % 360;
        }
        ((Matrix) (obj)).postRotate(j1);
        obj = Bitmap.createBitmap(s, 0, 0, s.getWidth(), s.getHeight(), ((Matrix) (obj)), true);
        bitmap = ((Bitmap) (obj));
_L4:
        D.a(kik.android.f.a.f.a().a(getActivity(), com.kik.m.k.a(bitmap, android.graphics.Bitmap.CompressFormat.JPEG, 100), a));
        s = null;
_L2:
        r();
        return;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        bx.a(outofmemoryerror);
        if (true) goto _L4; else goto _L3
_L3:
    }

}

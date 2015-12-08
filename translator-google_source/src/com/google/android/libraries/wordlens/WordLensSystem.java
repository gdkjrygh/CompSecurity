// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.wordlens.a.a;
import com.google.android.libraries.wordlens.messaging.MessageManager;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Locale;

// Referenced classes of package com.google.android.libraries.wordlens:
//            k, h, g, m, 
//            NativeLangMan, QVTextAlignment, i, l, 
//            NativeBitmapInfo

public class WordLensSystem
{

    private static WLSupportLevel e;
    private static final Object j = new Object();
    private static WordLensSystem sys;
    public GLSurfaceView a;
    public AssetManager assetManagers[];
    public boolean b;
    private m c;
    private android.os.Handler.Callback d;
    private a f;
    private Context g;
    private NativeBitmapInfo h;
    private final Object i;
    private boolean k;
    public final String mCacheDirPath;
    public SharedPreferences mDefaultSharedPrefs;
    public final String mDocsDirPath;

    private WordLensSystem(Context context, String s)
    {
        boolean flag = true;
        int j1 = 0;
        super();
        d = new k(this);
        f = null;
        g = null;
        b = false;
        h = null;
        i = new Object();
        k = true;
        g = context;
        int i1;
        if (Build.MANUFACTURER.toLowerCase(Locale.US).equals("google") && Build.DEVICE.toLowerCase(Locale.US).contains("glass"))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0)
        {
            f = new a(LayoutInflater.from(context).inflate(h.snapshot_header, null), g.snapshot_header_text);
        }
        mDefaultSharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
        mCacheDirPath = context.getCacheDir().getAbsolutePath();
        try
        {
            i1 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            i1 = j1;
            continue; /* Loop/switch isn't completed */
        }
        j1 = mDefaultSharedPrefs.getInt("key.last.clear.cache.version", 0);
        if (i1 <= j1)
        {
            flag = false;
        }
_L2:
        if (flag && a(new File(mCacheDirPath)))
        {
            mDefaultSharedPrefs.edit().putInt("key.last.clear.cache.version", i1).commit();
        }
        mDocsDirPath = s;
        return;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static native boolean CheckCPUHasNeonNative();

    private native void InitNative();

    static android.os.Handler.Callback a(WordLensSystem wordlenssystem)
    {
        return wordlenssystem.d;
    }

    public static WLSupportLevel a()
    {
        if (android.os.Build.VERSION.SDK_INT < 10)
        {
            return WLSupportLevel.NONE;
        } else
        {
            return e;
        }
    }

    public static boolean a(Context context)
    {
        context = context.getPackageManager();
        return context != null && context.hasSystemFeature("android.hardware.camera") && context.hasSystemFeature("android.hardware.camera.autofocus");
    }

    public static boolean a(Context context, String s)
    {
        if (sys != null)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        Object obj = j;
        obj;
        JVM INSTR monitorenter ;
        WordLensSystem wordlenssystem;
        f();
        wordlenssystem = new WordLensSystem(context, s);
        sys = wordlenssystem;
        wordlenssystem.assetManagers = new AssetManager[1];
        wordlenssystem.assetManagers[0] = context.getResources().getAssets();
        wordlenssystem.c = new m(wordlenssystem);
        wordlenssystem.c.start();
        Looper.myLooper();
        Looper.getMainLooper();
        synchronized (j)
        {
            wordlenssystem.InitNative();
        }
        wordlenssystem.b = wordlenssystem.isConcurrentNative();
        int i1 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        (new StringBuilder(35)).append("Word Lens Build number: ").append(i1);
_L1:
        com.google.android.libraries.wordlens.NativeLangMan.a(context);
        MessageManager.a();
        obj;
        JVM INSTR monitorexit ;
        return true;
        context;
        s;
        JVM INSTR monitorexit ;
        throw context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        s;
label0:
        {
            s = String.valueOf(s.getLocalizedMessage());
            if (s.length() == 0)
            {
                break label0;
            }
            "Unable to extract Word Lens build number: ".concat(s);
        }
          goto _L1
        new String("Unable to extract Word Lens build number: ");
          goto _L1
        return false;
    }

    private static boolean a(File file)
    {
        if (file.exists())
        {
            if (file.isDirectory())
            {
                String as[] = file.list();
                for (int i1 = 0; i1 < as.length; i1++)
                {
                    if (!a(new File(file, as[i1])))
                    {
                        return false;
                    }
                }

            }
            return file.delete();
        } else
        {
            return true;
        }
    }

    private static boolean a(String s)
    {
        return Build.CPU_ABI.contains(s) || Build.CPU_ABI2.contains(s);
    }

    public static WordLensSystem b()
    {
        if (sys == null)
        {
            throw new IllegalStateException("Call WordLensSystem.init() before attempting to use it!");
        } else
        {
            return sys;
        }
    }

    static void b(WordLensSystem wordlenssystem)
    {
        wordlenssystem.updateMessageQueuesNative();
    }

    public static Object c()
    {
        return j;
    }

    private static void f()
    {
        if (!a("v7a")) goto _L2; else goto _L1
_L1:
        boolean flag;
        try
        {
            System.loadLibrary("qvlib-detector");
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            String s = String.valueOf(unsatisfiedlinkerror.getLocalizedMessage());
            if (s.length() != 0)
            {
                "Unable to load native library wordlens-detector. Cannot continue! ".concat(s);
            } else
            {
                new String("Unable to load native library wordlens-detector. Cannot continue! ");
            }
            e = WLSupportLevel.NONE;
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        catch (SecurityException securityexception)
        {
            String s1 = String.valueOf(securityexception.getLocalizedMessage());
            if (s1.length() != 0)
            {
                "Unable to load native library wordlens-detector. Cannot continue! ".concat(s1);
            } else
            {
                new String("Unable to load native library wordlens-detector. Cannot continue! ");
            }
            e = WLSupportLevel.NONE;
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
_L4:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (CheckCPUHasNeonNative())
        {
            break MISSING_BLOCK_LABEL_138;
        }
        System.loadLibrary("wordlens-slow");
        e = WLSupportLevel.WORD_LENS;
        return;
        String s3;
        try
        {
            System.loadLibrary("wordlens-neon");
            e = WLSupportLevel.WORD_LENS;
            return;
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror1)
        {
            String s2 = String.valueOf(unsatisfiedlinkerror1.getLocalizedMessage());
            if (s2.length() != 0)
            {
                "Unable to load native library wordlens. Cannot continue! ".concat(s2);
            } else
            {
                new String("Unable to load native library wordlens. Cannot continue! ");
            }
            e = WLSupportLevel.NONE;
            return;
        }
        catch (SecurityException securityexception1)
        {
            s3 = String.valueOf(securityexception1.getLocalizedMessage());
        }
        if (s3.length() != 0)
        {
            "Unable to load native library wordlens. Cannot continue! ".concat(s3);
        } else
        {
            new String("Unable to load native library wordlens. Cannot continue! ");
        }
        e = WLSupportLevel.NONE;
        return;
_L2:
        if (a("x86"))
        {
            String s5;
            try
            {
                System.loadLibrary("wordlens-slow");
                e = WLSupportLevel.WORD_LENS;
                return;
            }
            catch (UnsatisfiedLinkError unsatisfiedlinkerror2)
            {
                String s4 = String.valueOf(unsatisfiedlinkerror2.getLocalizedMessage());
                if (s4.length() != 0)
                {
                    "Unable to load native library wordlens for x86. Cannot continue! ".concat(s4);
                } else
                {
                    new String("Unable to load native library wordlens for x86. Cannot continue! ");
                }
                e = WLSupportLevel.NONE;
                return;
            }
            catch (SecurityException securityexception2)
            {
                s5 = String.valueOf(securityexception2.getLocalizedMessage());
            }
            if (s5.length() != 0)
            {
                "Unable to load native library wordlens for x86. Cannot continue! ".concat(s5);
            } else
            {
                new String("Unable to load native library wordlens for x86. Cannot continue! ");
            }
            e = WLSupportLevel.NONE;
            return;
        }
        if (a("v8a"))
        {
            String s7;
            try
            {
                System.loadLibrary("wordlens-slow");
                e = WLSupportLevel.WORD_LENS;
                return;
            }
            catch (UnsatisfiedLinkError unsatisfiedlinkerror3)
            {
                String s6 = String.valueOf(unsatisfiedlinkerror3.getLocalizedMessage());
                if (s6.length() != 0)
                {
                    "Unable to load native library wordlens for x86. Cannot continue! ".concat(s6);
                } else
                {
                    new String("Unable to load native library wordlens for x86. Cannot continue! ");
                }
                e = WLSupportLevel.NONE;
                return;
            }
            catch (SecurityException securityexception3)
            {
                s7 = String.valueOf(securityexception3.getLocalizedMessage());
            }
            if (s7.length() != 0)
            {
                "Unable to load native library wordlens for x86. Cannot continue! ".concat(s7);
            } else
            {
                new String("Unable to load native library wordlens for x86. Cannot continue! ");
            }
            e = WLSupportLevel.NONE;
            return;
        }
        if (a("armeabi"))
        {
            String s9;
            try
            {
                System.loadLibrary("wordlens-slow");
                e = WLSupportLevel.SMUDGE_ONLY;
                return;
            }
            catch (UnsatisfiedLinkError unsatisfiedlinkerror4)
            {
                String s8 = String.valueOf(unsatisfiedlinkerror4.getLocalizedMessage());
                if (s8.length() != 0)
                {
                    "Unable to load native library wordlens for ARM. Cannot continue! ".concat(s8);
                } else
                {
                    new String("Unable to load native library wordlens for ARM. Cannot continue! ");
                }
                e = WLSupportLevel.NONE;
                return;
            }
            catch (SecurityException securityexception4)
            {
                s9 = String.valueOf(securityexception4.getLocalizedMessage());
            }
            if (s9.length() != 0)
            {
                "Unable to load native library wordlens for ARM. Cannot continue! ".concat(s9);
            } else
            {
                new String("Unable to load native library wordlens for ARM. Cannot continue! ");
            }
            e = WLSupportLevel.NONE;
            return;
        }
        e = WLSupportLevel.NONE;
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private native int getAppPropsIntForKeyNative(String s);

    private native boolean isConcurrentNative();

    private native void onMagicAppletPauseNative();

    private native void setAutoZoomDimsNative(int i1, int j1);

    private native void setAutoZoomOffsetNative(int i1, int j1);

    private native void updateMessageQueuesNative();

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        k = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public byte[] drawTextToImage(String s, int ai[], int i1, int j1, String s1)
    {
        int k1 = ai[0];
        int l1 = ai[1];
        String s2 = String.valueOf(Integer.toHexString(i1));
        (new StringBuilder(String.valueOf(s).length() + 100 + String.valueOf(s2).length() + String.valueOf(s1).length())).append("drawTextToImage: fontName=").append(s).append(", bounds=").append(k1).append("x").append(l1).append(", argb=0x").append(s2).append(", alignment=").append(j1).append(", uString=").append(s1);
        try
        {
            s = f;
            j1 = QVTextAlignment.getGravityFromNativeEnumValue(j1);
            ((a) (s)).a.setGravity(j1);
            f.a.setTextColor(i1);
            s = f;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        i1 = ai[0];
        j1 = ai[1];
        if (i1 != ((a) (s)).d || j1 != ((a) (s)).e)
        {
            s.d = i1;
            s.e = j1;
            s.f = 0;
            s.g = 0;
            s.i = true;
        }
        s = f;
        if (((a) (s)).a == null)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        if (s1.equals(((a) (s)).a.getText()))
        {
            break MISSING_BLOCK_LABEL_255;
        }
        ((a) (s)).a.setText(s1);
        s.i = true;
        s = f;
        if (!((a) (s)).i) goto _L2; else goto _L1
_L1:
        if (((a) (s)).c != null)
        {
            ((a) (s)).c.recycle();
            s.c = null;
            System.gc();
        }
        ((a) (s)).b.setDrawingCacheEnabled(true);
        ai = new android.widget.RelativeLayout.LayoutParams(((a) (s)).d, ((a) (s)).e);
        ((a) (s)).b.setLayoutParams(ai);
        if (((a) (s)).f == 0) goto _L4; else goto _L3
_L3:
        i1 = android.view.View.MeasureSpec.makeMeasureSpec(((a) (s)).f, 0x80000000);
_L7:
        if (((a) (s)).g == 0) goto _L6; else goto _L5
_L5:
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(((a) (s)).g, 0x80000000);
_L8:
        ((a) (s)).b.measure(i1, j1);
        i1 = ((a) (s)).b.getMeasuredWidth();
        j1 = ((a) (s)).b.getMeasuredHeight();
        ((a) (s)).b.layout(0, 0, i1, j1);
        ((a) (s)).b.setDrawingCacheQuality(0x100000);
        s.c = Bitmap.createBitmap(((a) (s)).b.getDrawingCache(true));
        ((a) (s)).b.setDrawingCacheEnabled(false);
        s.i = false;
        s.h = true;
_L2:
        s = ((a) (s)).c;
        ai = new byte[s.getRowBytes() * s.getHeight()];
        s.copyPixelsToBuffer(ByteBuffer.wrap(ai));
        return ai;
_L4:
label0:
        {
            if (-2 == ((a) (s)).d)
            {
                break label0;
            }
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(((a) (s)).d, 0x40000000);
        }
          goto _L7
        i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
          goto _L7
_L6:
label1:
        {
            if (-2 == ((a) (s)).e)
            {
                break label1;
            }
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(((a) (s)).e, 0x40000000);
        }
          goto _L8
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
          goto _L8
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        k = true;
        scheduleDrainMainQueue();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public String getLanguageNameUTF8(String s, String s1)
    {
        s = new Locale(s);
        return (new Locale(s1)).getDisplayLanguage(s);
    }

    public native byte[] getLatestOCRNuggets();

    public native byte[] getLatestOCRWords();

    public String getLocalizedStringUTF8(String s)
    {
        if (s == null)
        {
            return "";
        }
        if (s.equalsIgnoreCase("Lang.Demo.EraseWords"))
        {
            return g.getString(i.lang_demo_erasewords);
        }
        if (s.equalsIgnoreCase("Lang.Demo.ReverseWords"))
        {
            return g.getString(i.lang_demo_reversewords);
        }
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            "QVLocale_android requestd unknown string key: ".concat(s);
        } else
        {
            new String("QVLocale_android requestd unknown string key: ");
        }
        return "";
    }

    public void scheduleDrainMainQueue()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = k;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        a.queueEvent(new l(this));
          goto _L1
        Exception exception;
        exception;
        throw exception;
        com.google.android.libraries.wordlens.m.a(c).sendEmptyMessage(0);
          goto _L1
    }

    static 
    {
        e = WLSupportLevel.NONE;
        f();
    }

    private class WLSupportLevel extends Enum
    {

        public static final WLSupportLevel NONE;
        public static final WLSupportLevel SMUDGE_ONLY;
        public static final WLSupportLevel WORD_LENS;
        private static final WLSupportLevel a[];

        public static WLSupportLevel valueOf(String s)
        {
            return (WLSupportLevel)Enum.valueOf(com/google/android/libraries/wordlens/WordLensSystem$WLSupportLevel, s);
        }

        public static WLSupportLevel[] values()
        {
            return (WLSupportLevel[])a.clone();
        }

        static 
        {
            NONE = new WLSupportLevel("NONE", 0);
            SMUDGE_ONLY = new WLSupportLevel("SMUDGE_ONLY", 1);
            WORD_LENS = new WLSupportLevel("WORD_LENS", 2);
            a = (new WLSupportLevel[] {
                NONE, SMUDGE_ONLY, WORD_LENS
            });
        }

        private WLSupportLevel(String s, int i1)
        {
            super(s, i1);
        }
    }

}

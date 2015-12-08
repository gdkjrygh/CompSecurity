// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.os.Build;
import android.os.Handler;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DWebView, Pulse3DView, Pulse3DGLSurfaceView, Pulse3DGLRenderer, 
//            Log

class this._cls1
    implements Runnable
{

    final ngine this$1;

    public void run()
    {
        initEngine();
    }

    l.amobee3DWebView()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/amobee/pulse3d/Pulse3DWebView$10

/* anonymous class */
    class Pulse3DWebView._cls10
        implements Runnable
    {

        final Pulse3DWebView this$0;
        final Pulse3DWebView val$amobee3DWebView;

        public void run()
        {
            if (amobee3DWebView == null)
            {
                return;
            }
            if (getProgress() == 100)
            {
                Object obj = "";
                String s = ((String) (obj));
                if (mPulse3DView != null)
                {
                    s = ((String) (obj));
                    if (mPulse3DView.mGLView != null)
                    {
                        s = ((String) (obj));
                        if (mPulse3DView.mGLView.renderer != null)
                        {
                            s = mPulse3DView.mGLView.renderer.extensions;
                        }
                    }
                }
                Log.d("JsInterface3D", "calling ensureAdKitReady...");
                obj = (new StringBuilder()).append("javascript:JsInterface.ensureAdKitReady((AdKitNative && AdKitNative.NativeCallbacks && AdKitNative.NativeCallbacks.nativeReady && AdKitNative.NativeCallbacks.nativeReady({ supports3d: true, banner: ");
                boolean flag;
                if (!mPulse3DView.presentAsFullscreen)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                s = ((StringBuilder) (obj)).append(flag).append(", trackingID: \"").append(mPulse3DView.getAdkUniqueUserId()).append("\", manufacturer: \"").append(Build.MANUFACTURER).append("\", model: \"").append(Build.MODEL).append("\", product: \"").append(Build.PRODUCT).append("\", rawResolution: \"").append(getRawResolution()).append("\", publisher: \"").append(getApplicationPackage()).append("\", deviceType: \"Android\", systemVersion: \"").append(android.os.Build.VERSION.RELEASE).append("\", glView: {extensions: \"").append(s).append("\"} })))").toString();
                loadUrl(s);
                return;
            } else
            {
                Log.d("JsInterface3D", "AdKitReady posting initEngine");
                (new Handler()).postDelayed(new Pulse3DWebView._cls10._cls1(), 1000L);
                return;
            }
        }

            
            {
                this$0 = final_pulse3dwebview;
                amobee3DWebView = Pulse3DWebView.this;
                super();
            }
    }

}

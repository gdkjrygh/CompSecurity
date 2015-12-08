// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DView, BinInterpreter, BufferViewIterator, NativeCommandProcessor, 
//            Log, Pulse3DGLSurfaceView, TextureResource, FramebufferResource, 
//            Pulse3DWebView, Pulse3DViewListener, Pulse3DGLRenderer

class Pulse3DJavaScriptInterface
{
    static class NativeCommands
    {

        public static final int ACTIVATE_BUFFER = 27;
        public static final int ACTIVATE_FRAMEBUFFER = 30;
        public static final int ACTIVATE_PROGRAM = 22;
        public static final int ACTIVATE_RENDERBUFFER = 31;
        public static final int ACTIVATE_TEXTURE = 16;
        public static final int APPEND_NODE_TO_DISPLAY_LIST = 37;
        public static final int ATTACH_FRAMEBUFFER_RENDERBUFFER = 33;
        public static final int ATTACH_FRAMEBUFFER_TEXTURE = 32;
        public static final int CLEAR_ALL_DISPLAY_LISTS = 40;
        public static final int CLEAR_DISPLAY_LIST_WITH_PRIORITY = 39;
        public static final int COMMIT_DISPLAY_LIST_CHANGES = 11;
        public static final int CONSOLE_LOG = 10;
        public static final int DEACTIVATE_RESOURCE = 34;
        public static final int DECLARE_DATA_FROM_JS = 24;
        public static final int DECLARE_DATA_FROM_URL = 23;
        public static final int DECLARE_FRAGMENT_SHADER_FROM_DATA = 20;
        public static final int DECLARE_FRAGMENT_SHADER_FROM_STRING = 19;
        public static final int DECLARE_FRAMEBUFFER = 29;
        public static final int DECLARE_IB_FROM_DATA = 26;
        public static final int DECLARE_PRORGRAM = 21;
        public static final int DECLARE_RENDERBUFFER = 28;
        public static final int DECLARE_TEXTURE = 15;
        public static final int DECLARE_VB_FROM_DATA = 25;
        public static final int DECLARE_VERTEX_SHADER_FROM_DATA = 18;
        public static final int DECLARE_VERTEX_SHADER_FROM_STRING = 17;
        public static final int DISABLE_NODES_WITH_PRIORITY_RANGE = 48;
        public static final int DISABLE_NODE_WITH_PRIORITY = 42;
        public static final int ENABLE_NODES_WITH_PRIORITY_RANGE = 47;
        public static final int ENABLE_NODE_WITH_PRIORITY = 41;
        public static final int ENSURE_RENDER = 13;
        public static final int EXECUTE_SINGLE_GL_COMMAND = 45;
        public static final int FENCE = 36;
        public static final int GET_GL_ID_FROM_RESOURCE_HANDLE = 46;
        public static final int INIT_RENDERER = 9;
        public static final int LOAD_TEXTURE_FROM_DATA = 14;
        public static final int NATIVE_COMMAND_SIZE = 49;
        public static final int OPEN_URL = 6;
        public static final int READY_TO_DISPLAY = 4;
        public static final int REPLACE_DISPLAY_LIST_NODE = 38;
        public static final int REPORT_LOADING_FAILURE = 12;
        public static final int REQUEST_GL_CONST_VALUES = 2;
        public static final int REQUEST_NATIVE_COMMAND_BYTE_CODE = 1;
        public static final int RESIZE_BUFFER_2D = 35;
        public static final int RESUME_REDRAW = 44;
        public static final int SET_PANEL_CONFIGURATION = 7;
        public static final int SET_SUPPORTED_ORIENTATION = 8;
        public static final int STOP_REDRAW = 43;
        public static final int SYSTEM_OPEN_URL = 5;
        public static final int TOGGLE_BANNER = 3;

        NativeCommands()
        {
        }
    }

    static class ResultCode
    {

        public static int GENERIC_ERROR = 10;
        public static int HANDLE_NOT_FOUND = 1;
        public static int INVALID_ARGUMENT_TYPE = 2;
        public static int INVALID_ENUM = 4;
        public static int INVALID_FRAMEBUFFER_OPERATION = 7;
        public static int INVALID_HANDLE_TYPE = 3;
        public static int INVALID_OPERATION = 6;
        public static int INVALID_VALUE = 5;
        public static int NOT_YET_IMPLEMENTED = 9;
        public static int NUM_CODE = 11;
        public static int OUT_OF_MEMORY = 8;
        public static int SUCCESS = 0;


        ResultCode()
        {
        }
    }


    static final boolean $assertionsDisabled;
    private static final String GPP_3 = ".3gp";
    private static final String MATROSKA = ".mkv";
    private static final String MPEG_4 = ".mp4";
    private static final String MPEG_TS = ".ts";
    static String TAG = "Pulse3DJavaScriptInterface";
    private static final String WEBM = ".webm";
    Context actContext;
    BinInterpreter binHelper;
    boolean isInterfaceSuspended;
    boolean isRedrawSuspended;
    int lastHandeldCommandSerial;
    private Pulse3DView pulse3DView;

    public Pulse3DJavaScriptInterface(Pulse3DView pulse3dview, Context context)
    {
        actContext = null;
        lastHandeldCommandSerial = 0;
        binHelper = null;
        isRedrawSuspended = false;
        isInterfaceSuspended = false;
        actContext = context;
        pulse3DView = pulse3dview;
        pulse3DView.resources.add("FIRST");
        binHelper = new BinInterpreter(pulse3dview);
    }

    private void processBinPacket(byte abyte0[])
    {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        flag = false;
        flag4 = false;
        flag3 = false;
        flag1 = false;
        flag5 = false;
        flag2 = false;
        obj4 = null;
        obj2 = null;
        obj = null;
        obj3 = null;
        binHelper.addBuffer(abyte0);
        if (!binHelper.bufferReady())
        {
            return;
        }
        BufferViewIterator bufferviewiterator = new BufferViewIterator(binHelper.getBufferView());
        int i;
        i = 0;
        abyte0 = obj4;
        int j = binHelper.getTotalPacketLength();
_L5:
        if (i >= j) goto _L2; else goto _L1
_L1:
        flag3 = false;
        flag2 = false;
        abyte0 = ((byte []) (obj));
        flag1 = flag2;
        flag = flag3;
        i = bufferviewiterator.parseInt();
        abyte0 = ((byte []) (obj));
        flag1 = flag2;
        flag = flag3;
        int k = bufferviewiterator.parseInt();
        abyte0 = ((byte []) (obj));
        flag1 = flag2;
        flag = flag3;
        obj2 = binHelper.commandProcessors_[i];
        obj = obj2;
        abyte0 = ((byte []) (obj));
        flag1 = flag2;
        flag = flag3;
        ((NativeCommandProcessor) (obj2)).serial_set(k);
        abyte0 = ((byte []) (obj));
        flag1 = flag2;
        flag = flag3;
        ((NativeCommandProcessor) (obj2)).parse(bufferviewiterator);
        abyte0 = ((byte []) (obj));
        flag1 = flag2;
        flag = flag3;
        i = bufferviewiterator.getPosition();
        flag4 = true;
        flag3 = true;
        abyte0 = ((byte []) (obj));
        flag1 = flag2;
        flag = flag4;
        if ($assertionsDisabled || i <= j) goto _L4; else goto _L3
_L3:
        Object obj1;
        abyte0 = ((byte []) (obj));
        flag1 = flag2;
        flag = flag4;
        try
        {
            throw new AssertionError();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            obj = bufferviewiterator;
        }
        obj1 = obj2;
_L6:
        Log.e(TAG, (new StringBuilder()).append(((Exception) (obj1)).getMessage()).append(" hasParser = ").append(Boolean.toString(flag)).append(", hasExecuted").append(Boolean.toString(flag1)).toString());
        if (!flag)
        {
            abyte0.parse(((BufferViewIterator) (obj)));
        }
        binHelper.clear();
        return;
_L4:
        abyte0 = ((byte []) (obj));
        flag1 = flag2;
        flag = flag4;
        ((NativeCommandProcessor) (obj2)).execute();
        flag2 = true;
          goto _L5
_L2:
        abyte0 = ((byte []) (obj));
        flag1 = flag2;
        flag = flag3;
        binHelper.clear();
        abyte0 = ((byte []) (obj));
        flag1 = flag2;
        flag = flag3;
        if (isRedrawSuspended)
        {
            break MISSING_BLOCK_LABEL_413;
        }
        abyte0 = ((byte []) (obj));
        flag1 = flag2;
        flag = flag3;
        if (!pulse3DView.commandListHasChanged())
        {
            break MISSING_BLOCK_LABEL_413;
        }
        abyte0 = ((byte []) (obj));
        flag1 = flag2;
        flag = flag3;
        pulse3DView.mGLView.requestRender();
        return;
        obj1;
        obj = obj3;
        abyte0 = ((byte []) (obj2));
        flag1 = flag5;
        flag = flag4;
          goto _L6
    }

    private boolean urlContainsVideo(String s)
    {
        s = s.toLowerCase();
        return s.endsWith(".mkv") || s.endsWith(".3gp") || s.endsWith(".webm") || s.endsWith(".ts") || s.endsWith(".mp4");
    }

    public void callExecBinString(String s)
    {
        if (isInterfaceSuspended)
        {
            return;
        } else
        {
            processBinPacket(Base64.decode(s, 0));
            return;
        }
    }

    void clearAllResources()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist = pulse3DView.resources;
        if (arraylist != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        try
        {
            Iterator iterator = pulse3DView.resources.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = iterator.next();
                if (obj instanceof TextureResource)
                {
                    obj = (TextureResource)obj;
                    if (((TextureResource) (obj)).obj instanceof Bitmap)
                    {
                        ((Bitmap)((TextureResource) (obj)).obj).recycle();
                    }
                }
            } while (true);
            break MISSING_BLOCK_LABEL_88;
        }
        catch (Exception exception) { }
        finally
        {
            throw exception1;
        }
        Log.d(TAG, "Error trying to release resources");
        pulse3DView.resources.clear();
        pulse3DView.resources = null;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void declareFramebuffer(int i)
    {
        int j;
        boolean flag;
        flag = true;
        j = 0;
        int k;
        FramebufferResource framebufferresource = new FramebufferResource();
        pulse3DView.resources.add(framebufferresource);
        k = pulse3DView.resources.indexOf(framebufferresource);
        j = k;
_L2:
        reportBackToJS(i, flag, (new StringBuilder()).append("").append(j).toString());
        return;
        Exception exception;
        exception;
        flag = false;
        Log.e(TAG, (new StringBuilder()).append("declareFramebuffer").append(exception.getMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void ensureAdKitReady(String s)
    {
        if (s != null && s.equals("true"))
        {
            Log.d("JsInterface3D", "AdKit Ready!");
        } else
        if (pulse3DView.mPulse3dWebView != null)
        {
            pulse3DView.mPulse3dWebView.initEngine();
            return;
        }
    }

    public ArrayList getResources()
    {
        if (pulse3DView != null)
        {
            return pulse3DView.resources;
        } else
        {
            return null;
        }
    }

    public void notImplemented(String s)
    {
        Log.d(TAG, (new StringBuilder()).append("command not implemented: ").append(s).toString());
    }

    public void readyToDisplay()
    {
        pulse3DView.mPlaceHolder.post(new Runnable() {

            final Pulse3DJavaScriptInterface this$0;

            public void run()
            {
                pulse3DView.mPlaceHolder.setVisibility(0);
                if (pulse3DView.mBannerCoverImageView != null)
                {
                    pulse3DView.mBannerCoverImageView.setVisibility(4);
                }
                pulse3DView.mGLView.renderer.ready = true;
                if (!isRedrawSuspended)
                {
                    pulse3DView.mGLView.requestRender();
                }
                if (pulse3DView.mPulse3DViewListener != null)
                {
                    pulse3DView.mPulse3DViewListener.onFinishLoadingSceneAtURL(pulse3DView, pulse3DView.mURL);
                }
            }

            
            {
                this$0 = Pulse3DJavaScriptInterface.this;
                super();
            }
        });
    }

    public void reportBackToJS(int i, boolean flag, String s)
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = s;
        if (!s.startsWith("{"))
        {
            s1 = (new StringBuilder()).append("\"").append(s).append("\"").toString();
        }
        s = (new StringBuilder()).append("AdKitNative.NativeCallbacks.executeResultCallbacks(").append(i).append(", ").append(flag).append(",").append(s1).append(")").toString();
        if (pulse3DView.mPulse3dWebView != null)
        {
            pulse3DView.mPulse3dWebView.injectJS(s);
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        Log.d(TAG, (new StringBuilder()).append("executeResultCallbacks: ").append(s).toString());
        if (pulse3DView.mPulse3DViewListener != null)
        {
            pulse3DView.mPulse3DViewListener.onFailLoadingSceneAtURL(pulse3DView, pulse3DView.mURL, new Error("reportLoadingFailure"));
        }
        s = pulse3DView.mPulse3dWebView;
        if (s == null);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void suspend(boolean flag)
    {
        isInterfaceSuspended = flag;
    }

    public void systemOpenURL(String s)
    {
        if (pulse3DView.mPulse3DViewListener != null)
        {
            pulse3DView.mPulse3DViewListener.onLeavingApplication(pulse3DView);
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
        if (urlContainsVideo(s))
        {
            Log.d(TAG, "systemOpenURL is video, calling media intent");
            intent.setDataAndType(Uri.parse(s), "video/*");
            intent.addFlags(0x10000000);
        }
        actContext.startActivity(intent);
    }

    void unimplementedCommand(String s)
    {
        Log.d(TAG, (new StringBuilder()).append("unimplemented command: ").append(s).toString());
    }

    static 
    {
        boolean flag;
        if (!com/amobee/pulse3d/Pulse3DJavaScriptInterface.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

}

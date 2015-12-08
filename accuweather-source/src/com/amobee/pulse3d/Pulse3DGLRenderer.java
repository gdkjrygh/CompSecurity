// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.opengl.GLES20;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DView, Log, CommandList, CommandBase

class Pulse3DGLRenderer
    implements CustomGLSurfaceView.Renderer
{

    private static final String TAG = "Pulse3DGLRenderer";
    public static float content_scale = 1.0F;
    private static TextView fpsTextView = null;
    static boolean logFPS = false;
    public static boolean pvrSupported = false;
    SparseArray commandLists;
    public String extensions;
    private int frames;
    public int height;
    public boolean needCommitDisplayListChanges;
    public boolean ready;
    private Runtime runtimeInfo;
    public int sampling;
    public int screenHeight;
    public int screenWidth;
    private long startTime;
    public boolean stopped;
    public int width;
    public float x;
    public float y;

    Pulse3DGLRenderer(Context context)
    {
        startTime = System.nanoTime();
        frames = 0;
        x = 0.0F;
        y = 0.0F;
        width = 0;
        height = 0;
        sampling = 0;
        screenHeight = 0;
        screenWidth = 0;
        ready = false;
        stopped = false;
        needCommitDisplayListChanges = false;
        commandLists = new SparseArray();
        commandLists = new SparseArray();
        updateDisplayMetrics(context);
        if (logFPS)
        {
            CreateFPSview(context);
        }
    }

    private void CreateFPSview(Context context)
    {
        if (fpsTextView != null)
        {
            return;
        } else
        {
            fpsTextView = new TextView(context);
            fpsTextView.setTextColor(-1);
            fpsTextView.setTypeface(null, 1);
            fpsTextView.setText((new StringBuilder()).append("P3D FPS\n").append(getMemoryState()).toString());
            android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams(-2, -2, 2002, 808, -3);
            layoutparams.gravity = 17;
            ShapeDrawable shapedrawable = new ShapeDrawable(new RoundRectShape(new float[] {
                10F, 10F, 10F, 10F, 10F, 10F, 10F, 10F
            }, null, null));
            shapedrawable.getPaint().setColor(0xbb000000);
            fpsTextView.setBackgroundDrawable(shapedrawable);
            ((WindowManager)context.getSystemService("window")).addView(fpsTextView, layoutparams);
            return;
        }
    }

    public static int er()
    {
        if (Pulse3DView.debugLevel == Log.DebugLevel.DEBUG)
        {
            int i = GLES20.glGetError();
            if (i != 0)
            {
                Log.e("Pulse3DGLRenderer", String.format((new StringBuilder()).append("glError: ").append(i).toString(), new Object[0]));
            }
            return i;
        } else
        {
            return 0;
        }
    }

    private String getMemoryState()
    {
        String s;
        try
        {
            runtimeInfo = Runtime.getRuntime();
            long l = runtimeInfo.freeMemory();
            long l1 = runtimeInfo.totalMemory();
            s = (new StringBuilder()).append("total mem: ").append(l1).append(" free mem: ").append(l).append(" used mem: ").append(l1 - l).toString();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return "";
        }
        return s;
    }

    static int loadShader(int i, String s)
    {
        int k = GLES20.glCreateShader(i);
        GLES20.glShaderSource(k, s);
        GLES20.glCompileShader(k);
        s = new int[1];
        GLES20.glGetShaderiv(k, 35713, s, 0);
        int j = k;
        if (s[0] == 0)
        {
            Log.e("Pulse3DGLRenderer", (new StringBuilder()).append("Could not compile shader ").append(i).append(":").toString());
            Log.e("Pulse3DGLRenderer", GLES20.glGetShaderInfoLog(k));
            GLES20.glDeleteShader(k);
            j = 0;
        }
        return j;
    }

    private void logFrame()
    {
        frames = frames + 1;
        if (System.nanoTime() - startTime >= 0x3b9aca00L)
        {
            final int fps = frames;
            fpsTextView.post(new Runnable() {

                final Pulse3DGLRenderer this$0;
                final int val$fps;

                public void run()
                {
                    Pulse3DGLRenderer.fpsTextView.setText((new StringBuilder()).append(fps).append(" FPS\n").append(getMemoryState()).toString());
                }

            
            {
                this$0 = Pulse3DGLRenderer.this;
                fps = i;
                super();
            }
            });
            frames = 0;
            startTime = System.nanoTime();
        }
    }

    void ClearAllDisplayLists()
    {
        commandLists = new SparseArray();
    }

    void ClearDisplayListWithPriority(float f)
    {
        synchronized (commandLists)
        {
            commandLists.remove((int)f);
        }
        return;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void doRender()
    {
        if (stopped) goto _L2; else goto _L1
_L1:
        SparseArray sparsearray = commandLists;
        sparsearray;
        JVM INSTR monitorenter ;
        int ai[] = new int[commandLists.size()];
        int i = 0;
_L4:
        if (i >= ai.length)
        {
            break; /* Loop/switch isn't completed */
        }
        ai[i] = commandLists.keyAt(i);
        i++;
        if (true) goto _L4; else goto _L3
_L6:
        if (i >= ai.length)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        Object obj = (CommandList)commandLists.get(ai[i]);
        if (((CommandList) (obj)).isEnabled())
        {
            for (obj = ((CommandList) (obj)).commands().iterator(); ((Iterator) (obj)).hasNext(); ((CommandBase)((Iterator) (obj)).next()).execute()) { }
        }
        break MISSING_BLOCK_LABEL_122;
        Exception exception;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        continue; /* Loop/switch isn't completed */
        sparsearray;
        JVM INSTR monitorexit ;
_L2:
        return;
_L3:
        i = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void doRenderPriorities(float f, float f1)
    {
        SparseArray sparsearray = commandLists;
        sparsearray;
        JVM INSTR monitorenter ;
        int ai[] = new int[commandLists.size()];
        int i = 0;
_L2:
        if (i >= ai.length)
        {
            break; /* Loop/switch isn't completed */
        }
        ai[i] = commandLists.keyAt(i);
        i++;
        if (true) goto _L2; else goto _L1
_L4:
        if (i >= ai.length)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        int j;
        j = ai[i];
        if ((float)j < f || (float)j > f1)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        Object obj = (CommandList)commandLists.get(j);
        if (((CommandList) (obj)).isEnabled())
        {
            for (obj = ((CommandList) (obj)).commands().iterator(); ((Iterator) (obj)).hasNext(); ((CommandBase)((Iterator) (obj)).next()).execute()) { }
        }
        break MISSING_BLOCK_LABEL_148;
        Exception exception;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        continue; /* Loop/switch isn't completed */
        sparsearray;
        JVM INSTR monitorexit ;
        return;
_L1:
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onDrawFrame(GL10 gl10)
    {
        if (ready)
        {
            doRender();
            if (logFPS)
            {
                logFrame();
                return;
            }
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int j)
    {
        width = i;
        height = j;
        GLES20.glViewport(0, 0, i, j);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
    {
        gl10 = gl10.glGetString(7938);
        Log.w("Pulse3DGLRenderer", (new StringBuilder()).append("OpenGL Version: ").append(gl10).toString());
        extensions = GLES20.glGetString(7939);
        gl10 = new int[1];
        GLES20.glGetIntegerv(3379, gl10, 0);
        eglconfig = new int[1];
        GLES20.glGetIntegerv(34930, eglconfig, 0);
        Log.d("Pulse3DGLRenderer", (new StringBuilder()).append("maxTextureSize: ").append(gl10[0]).append(", maxTextureUnits: ").append(eglconfig[0]).toString());
    }

    void updateDisplayMetrics(Context context)
    {
        context = context.getResources().getDisplayMetrics();
        screenHeight = ((DisplayMetrics) (context)).heightPixels;
        screenWidth = ((DisplayMetrics) (context)).widthPixels;
        content_scale = ((DisplayMetrics) (context)).density;
    }



}

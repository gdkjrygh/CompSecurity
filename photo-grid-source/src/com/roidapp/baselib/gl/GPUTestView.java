// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.gl;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.SurfaceHolder;

// Referenced classes of package com.roidapp.baselib.gl:
//            a, b

public class GPUTestView extends GLSurfaceView
{

    private String a;
    private String b;
    private Handler c;

    public GPUTestView(Context context)
    {
        super(context);
        a();
    }

    public GPUTestView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    static String a(GPUTestView gputestview)
    {
        return gputestview.a;
    }

    static String a(GPUTestView gputestview, String s)
    {
        gputestview.a = s;
        return s;
    }

    private void a()
    {
        setEGLContextClientVersion(2);
        setEGLConfigChooser(new a(this));
        getHolder().setFormat(1);
        setRenderer(new b(this));
    }

    static String b(GPUTestView gputestview)
    {
        return gputestview.b;
    }

    static String b(GPUTestView gputestview, String s)
    {
        gputestview.b = s;
        return s;
    }

    public final void a(Handler handler)
    {
        c = handler;
        requestRender();
    }

    public final void a(String s)
    {
        if (c != null)
        {
            s = Message.obtain(c, 4656, s);
            c.sendMessage(s);
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow()
    {
        try
        {
            super.onDetachedFromWindow();
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
    }
}

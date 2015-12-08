// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.util.Log;
import java.io.Writer;

// Referenced classes of package com.amobee.pulse3d:
//            CustomGLSurfaceView

static class mBuilder extends Writer
{

    private StringBuilder mBuilder;

    private void flushBuilder()
    {
        if (mBuilder.length() > 0)
        {
            Log.v("CustomGLSurfaceView", mBuilder.toString());
            mBuilder.delete(0, mBuilder.length());
        }
    }

    public void close()
    {
        flushBuilder();
    }

    public void flush()
    {
        flushBuilder();
    }

    public void write(char ac[], int i, int j)
    {
        int k = 0;
        while (k < j) 
        {
            char c = ac[i + k];
            if (c == '\n')
            {
                flushBuilder();
            } else
            {
                mBuilder.append(c);
            }
            k++;
        }
    }

    ()
    {
        mBuilder = new StringBuilder();
    }
}

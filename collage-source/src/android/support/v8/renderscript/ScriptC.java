// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package android.support.v8.renderscript:
//            Script, RSRuntimeException, RenderScript

public class ScriptC extends Script
{

    private static final String TAG = "ScriptC";

    protected ScriptC(long l, RenderScript renderscript)
    {
        super(l, renderscript);
    }

    protected ScriptC(RenderScript renderscript, Resources resources, int i)
    {
        super(0L, renderscript);
        long l = internalCreate(renderscript, resources, i);
        if (l == 0L)
        {
            throw new RSRuntimeException("Loading of ScriptC script failed.");
        } else
        {
            setID(l);
            return;
        }
    }

    protected ScriptC(RenderScript renderscript, String s, byte abyte0[], byte abyte1[])
    {
        super(0L, renderscript);
        long l;
        if (RenderScript.sPointerSize == 4)
        {
            l = internalStringCreate(renderscript, s, abyte0);
        } else
        {
            l = internalStringCreate(renderscript, s, abyte1);
        }
        if (l == 0L)
        {
            throw new RSRuntimeException("Loading of ScriptC script failed.");
        } else
        {
            setID(l);
            return;
        }
    }

    private static long internalCreate(RenderScript renderscript, Resources resources, int i)
    {
        android/support/v8/renderscript/ScriptC;
        JVM INSTR monitorenter ;
        InputStream inputstream = resources.openRawResource(i);
        byte abyte0[] = new byte[1024];
        int j = 0;
_L2:
        int k = abyte0.length - j;
        if (k != 0)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        byte abyte1[];
        abyte1 = new byte[abyte0.length * 2];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        k = abyte1.length - j;
        abyte0 = abyte1;
        k = inputstream.read(abyte0, j, k);
        if (k > 0)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        inputstream.close();
        long l = renderscript.nScriptCCreate(resources.getResourceEntryName(i), renderscript.getApplicationContext().getCacheDir().toString(), abyte0, j);
        android/support/v8/renderscript/ScriptC;
        JVM INSTR monitorexit ;
        return l;
        j = k + j;
        if (true) goto _L2; else goto _L1
_L1:
        renderscript;
        try
        {
            inputstream.close();
            throw renderscript;
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript) { }
        finally
        {
            android/support/v8/renderscript/ScriptC;
        }
        throw new android.content.res.Resources.NotFoundException();
        throw renderscript;
    }

    private static long internalStringCreate(RenderScript renderscript, String s, byte abyte0[])
    {
        android/support/v8/renderscript/ScriptC;
        JVM INSTR monitorenter ;
        long l = renderscript.nScriptCCreate(s, renderscript.getApplicationContext().getCacheDir().toString(), abyte0, abyte0.length);
        android/support/v8/renderscript/ScriptC;
        JVM INSTR monitorexit ;
        return l;
        renderscript;
        throw renderscript;
    }
}

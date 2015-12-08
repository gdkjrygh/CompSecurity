// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.renderscript.BaseObj;
import android.renderscript.RSRuntimeException;
import android.renderscript.Script;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v8.renderscript.RenderScript;

final class bZ extends bY
{

    private ScriptIntrinsicBlur a;

    private bZ(RenderScript renderscript)
    {
        super(0, renderscript);
    }

    public static bZ b(RenderScript renderscript, bN bn)
    {
        bU bu = (bU)renderscript;
        bn = (bO)bn;
        renderscript = new bZ(renderscript);
        try
        {
            renderscript.a = ScriptIntrinsicBlur.create(bu.a, ((bO) (bn)).e);
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw bP.a(renderscript);
        }
        return renderscript;
    }

    final volatile BaseObj a()
    {
        return a;
    }

    public final void a(float f)
    {
        try
        {
            a.setRadius(f);
            return;
        }
        catch (RSRuntimeException rsruntimeexception)
        {
            throw bP.a(rsruntimeexception);
        }
    }

    public final void a(bK bk)
    {
        bk = (bL)bk;
        try
        {
            a.setInput(((bL) (bk)).b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bK bk)
        {
            throw bP.a(bk);
        }
    }

    final volatile Script b()
    {
        return a;
    }

    public final void b(bK bk)
    {
        bk = (bL)bk;
        if (bk == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        a.forEach(((bL) (bk)).b);
        return;
        bk;
        throw bP.a(bk);
    }
}

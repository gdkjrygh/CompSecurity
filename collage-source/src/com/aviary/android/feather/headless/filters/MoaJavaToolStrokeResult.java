// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.filters;

import android.graphics.PointF;
import android.util.Log;
import com.aviary.android.feather.headless.moa.k;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class MoaJavaToolStrokeResult
    implements Serializable, Cloneable
{

    private long a;

    public MoaJavaToolStrokeResult()
    {
        this(nativeCtor());
    }

    MoaJavaToolStrokeResult(long l)
    {
        a = 0L;
        Log.i("MoaJavaToolStrokeResult", (new StringBuilder()).append("MoaJavaToolStrokeResult(").append(l).append(")").toString());
        a = l;
    }

    static native long nativeClone(long l);

    static native long nativeCtor();

    static native void nativeDispose(long l);

    static native int nativeGetBrushMode(long l);

    static native int nativeGetColorSelected(long l);

    static native float nativeGetOffsetPointX(long l);

    static native float nativeGetOffsetPointY(long l);

    static native void nativeSetBrushMode(long l, int i);

    static native void nativeSetColorSelected(long l, int i);

    static native void nativeSetOffsetPoint(long l, float f, float f1);

    public long a()
    {
        return a;
    }

    public int b()
    {
        return nativeGetColorSelected(a);
    }

    public PointF c()
    {
        return new PointF(nativeGetOffsetPointX(a), nativeGetOffsetPointY(a));
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        Log.i("MoaJavaToolStrokeResult", "clone");
        return new MoaJavaToolStrokeResult(nativeClone(a));
    }

    public NativeToolFilter.a d()
    {
        int i = nativeGetBrushMode(a);
        if (i < 0 || i >= NativeToolFilter.a.values().length)
        {
            return null;
        } else
        {
            return NativeToolFilter.a.values()[i];
        }
    }

    public JSONObject e()
        throws JSONException
    {
        PointF pointf = c();
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("colorselected", b());
        jsonobject.put("brushmode", d().ordinal());
        jsonobject.put("offsetpoint", k.b(pointf.x, pointf.y));
        return jsonobject;
    }

    protected void finalize()
        throws Throwable
    {
        Log.i("MoaJavaToolStrokeResult", "finalize");
        nativeDispose(a);
        super.finalize();
    }

    public String toString()
    {
        if (a != 0L)
        {
            PointF pointf = c();
            return (new StringBuilder()).append("MoaJavaToolStrokeResult [colorSelected: 0x").append(Integer.toHexString(b())).append(", offsetPoint: ").append(pointf.x).append("x").append(pointf.y).append(", brushMode: ").append(d()).append("]").toString();
        } else
        {
            return "MoaJavaToolStrokeResult{NULL}";
        }
    }
}

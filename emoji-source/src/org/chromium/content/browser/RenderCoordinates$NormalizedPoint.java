// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


// Referenced classes of package org.chromium.content.browser:
//            RenderCoordinates

public class <init>
{

    private float mXAbsoluteCss;
    private float mYAbsoluteCss;
    final RenderCoordinates this$0;

    public float getXAbsoluteCss()
    {
        return mXAbsoluteCss;
    }

    public float getXLocalDip()
    {
        return (mXAbsoluteCss - RenderCoordinates.access$000(RenderCoordinates.this)) * RenderCoordinates.access$100(RenderCoordinates.this);
    }

    public float getXPix()
    {
        return getXLocalDip() * RenderCoordinates.access$300(RenderCoordinates.this);
    }

    public float getYAbsoluteCss()
    {
        return mYAbsoluteCss;
    }

    public float getYLocalDip()
    {
        return (mYAbsoluteCss - RenderCoordinates.access$200(RenderCoordinates.this)) * RenderCoordinates.access$100(RenderCoordinates.this);
    }

    public float getYPix()
    {
        return getYLocalDip() * RenderCoordinates.access$300(RenderCoordinates.this) + RenderCoordinates.access$400(RenderCoordinates.this);
    }

    public void setAbsoluteCss(float f, float f1)
    {
        mXAbsoluteCss = f;
        mYAbsoluteCss = f1;
    }

    public void setLocalDip(float f, float f1)
    {
        setAbsoluteCss(f / RenderCoordinates.access$100(RenderCoordinates.this) + RenderCoordinates.access$000(RenderCoordinates.this), f1 / RenderCoordinates.access$100(RenderCoordinates.this) + RenderCoordinates.access$200(RenderCoordinates.this));
    }

    public void setScreen(float f, float f1)
    {
        setLocalDip(f / RenderCoordinates.access$300(RenderCoordinates.this), f1 / RenderCoordinates.access$300(RenderCoordinates.this));
    }

    private ()
    {
        this$0 = RenderCoordinates.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}

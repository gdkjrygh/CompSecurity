// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;

import java.util.Iterator;

// Referenced classes of package com.skype.android.video.render:
//            GLHelpers

class index
    implements Iterator
{

    int index;
    final next this$2;

    public boolean hasNext()
    {
        return index < cess._mth200(this._cls2.this).length;
    }

    public em next()
    {
        em em = this._cls2.this;
        javax.microedition.khronos.egl.EGLConfig aeglconfig[] = cess._mth200(this._cls2.this);
        int i = index;
        index = i + 1;
        return new em(em, aeglconfig[i]);
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    em()
    {
        this$2 = this._cls2.this;
        super();
        index = 0;
    }
}

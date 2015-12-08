// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import java.util.Comparator;

// Referenced classes of package android.support.v8.renderscript:
//            ScriptGroup

class this._cls0
    implements Comparator
{

    final compare this$0;

    public int compare(this._cls0 _pcls0, this._cls0 _pcls0_1)
    {
        return _pcls0.r - _pcls0_1.r;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((compare)obj, (compare)obj1);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}

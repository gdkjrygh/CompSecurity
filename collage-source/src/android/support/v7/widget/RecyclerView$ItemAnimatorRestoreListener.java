// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            RecyclerView

private class <init>
    implements tener
{

    final RecyclerView this$0;

    public void onAnimationFinished(tener tener)
    {
        tener.tener(true);
        if (tener.tener != null && tener.tener == null)
        {
            tener.tener = null;
        }
        tener.tener = null;
        if (!tener(tener) && !RecyclerView.access$6200(RecyclerView.this, tener._fld0) && tener._mth0())
        {
            removeDetachedView(tener._fld0, false);
        }
    }

    private tener()
    {
        this$0 = RecyclerView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}

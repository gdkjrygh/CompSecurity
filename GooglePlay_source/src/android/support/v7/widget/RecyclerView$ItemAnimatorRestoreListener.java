// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            RecyclerView

private final class <init>
    implements tener
{

    final RecyclerView this$0;

    public final void onAddFinished(tener tener)
    {
        tener.tener(true);
        if (!tener(tener))
        {
            RecyclerView.access$5100(RecyclerView.this, tener._fld0);
        }
    }

    public final void onChangeFinished(this._cls0 _pcls0)
    {
        _pcls0._mth0(true);
        if (_pcls0._fld0 != null && _pcls0._fld0 == null)
        {
            _pcls0._fld0 = null;
            _pcls0._mth0(-65, _pcls0._fld0);
        }
        _pcls0._fld0 = null;
        if (!this._mth0(_pcls0))
        {
            RecyclerView.access$5100(RecyclerView.this, _pcls0._fld0);
        }
    }

    public final void onMoveFinished(this._cls0 _pcls0)
    {
        _pcls0._mth0(true);
        if (!this._mth0(_pcls0))
        {
            RecyclerView.access$5100(RecyclerView.this, _pcls0._fld0);
        }
    }

    public final void onRemoveFinished(this._cls0 _pcls0)
    {
        _pcls0._mth0(true);
        if (!RecyclerView.access$5100(RecyclerView.this, _pcls0._fld0) && _pcls0._mth0())
        {
            removeDetachedView(_pcls0._fld0, false);
        }
    }

    private tener()
    {
        this$0 = RecyclerView.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}

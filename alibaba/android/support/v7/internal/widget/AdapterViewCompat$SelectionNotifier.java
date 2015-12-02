// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;


// Referenced classes of package android.support.v7.internal.widget:
//            AdapterViewCompat

class <init>
    implements Runnable
{

    final AdapterViewCompat this$0;

    public void run()
    {
        if (mDataChanged)
        {
            if (getAdapter() != null)
            {
                post(this);
            }
            return;
        } else
        {
            AdapterViewCompat.access$200(AdapterViewCompat.this);
            return;
        }
    }

    private ()
    {
        this$0 = AdapterViewCompat.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}

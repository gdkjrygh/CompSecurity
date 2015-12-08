// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//            ContentLoadingProgressBar

class this._cls0
    implements Runnable
{

    final ContentLoadingProgressBar this$0;

    public void run()
    {
        ContentLoadingProgressBar.access$202(ContentLoadingProgressBar.this, false);
        if (!ContentLoadingProgressBar.access$300(ContentLoadingProgressBar.this))
        {
            ContentLoadingProgressBar.access$102(ContentLoadingProgressBar.this, System.currentTimeMillis());
            setVisibility(0);
        }
    }

    ()
    {
        this$0 = ContentLoadingProgressBar.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;


// Referenced classes of package org.xbmc.kore.ui:
//            RemoteActivity

class this._cls0
    implements android.support.v4.view.hangeListener
{

    final RemoteActivity this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        RemoteActivity.access$400(RemoteActivity.this, toolbar, i);
    }

    OnPageChangeListener()
    {
        this$0 = RemoteActivity.this;
        super();
    }
}

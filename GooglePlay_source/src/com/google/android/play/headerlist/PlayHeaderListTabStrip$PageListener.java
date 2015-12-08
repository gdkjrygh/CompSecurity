// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.database.DataSetObserver;
import android.view.View;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListTabStrip, PlayHeaderListTabContainer

private final class <init> extends DataSetObserver
    implements android.support.v4.view.geListener
{

    private int mScrollState;
    final PlayHeaderListTabStrip this$0;

    public final void onChanged()
    {
        PlayHeaderListTabStrip.access$700(PlayHeaderListTabStrip.this);
    }

    public final void onPageScrollStateChanged(int i)
    {
        mScrollState = i;
        if (PlayHeaderListTabStrip.access$600(PlayHeaderListTabStrip.this) != null)
        {
            PlayHeaderListTabStrip.access$600(PlayHeaderListTabStrip.this).eScrollStateChanged(i);
        }
        if (mScrollState == 0)
        {
            PlayHeaderListTabStrip.access$502(PlayHeaderListTabStrip.this, true);
        }
    }

    public final void onPageScrolled(int i, float f, int j)
    {
        if (PlayHeaderListTabStrip.access$600(PlayHeaderListTabStrip.this) != null)
        {
            PlayHeaderListTabStrip.access$600(PlayHeaderListTabStrip.this).eScrolled(i, f, j);
        }
        if (PlayHeaderListTabStrip.access$500(PlayHeaderListTabStrip.this))
        {
            if ((j = PlayHeaderListTabStrip.access$300(PlayHeaderListTabStrip.this).getChildCount()) != 0 && i >= 0 && i < j)
            {
                Object obj = PlayHeaderListTabStrip.access$300(PlayHeaderListTabStrip.this);
                obj.mIndexForSelection = i;
                obj.mSelectionOffset = f;
                ((PlayHeaderListTabContainer) (obj)).invalidate();
                obj = PlayHeaderListTabStrip.access$300(PlayHeaderListTabStrip.this).getChildAt(i);
                int k;
                if (obj == null)
                {
                    j = 0;
                } else
                {
                    j = ((View) (obj)).getWidth();
                }
                obj = PlayHeaderListTabStrip.access$300(PlayHeaderListTabStrip.this).getChildAt(i + 1);
                if (obj == null)
                {
                    k = 0;
                } else
                {
                    k = ((View) (obj)).getWidth();
                }
                j = (int)((float)(j + k) * f * 0.5F);
                PlayHeaderListTabStrip.access$200$77a5b19b(PlayHeaderListTabStrip.this, i, j);
                return;
            }
        }
    }

    public final void onPageSelected(int i)
    {
        if (PlayHeaderListTabStrip.access$600(PlayHeaderListTabStrip.this) != null)
        {
            PlayHeaderListTabStrip.access$600(PlayHeaderListTabStrip.this).eSelected(i);
        }
        PlayHeaderListTabContainer playheaderlisttabcontainer = PlayHeaderListTabStrip.access$300(PlayHeaderListTabStrip.this);
        playheaderlisttabcontainer.mIndexForSelection = i;
        playheaderlisttabcontainer.mSelectionOffset = 0.0F;
        playheaderlisttabcontainer.invalidate();
        updateSelectedTab$1385ff();
    }

    private ()
    {
        this$0 = PlayHeaderListTabStrip.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}

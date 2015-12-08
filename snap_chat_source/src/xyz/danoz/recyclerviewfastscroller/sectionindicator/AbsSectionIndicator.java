// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package xyz.danoz.recyclerviewfastscroller.sectionindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import aoB;
import aoC;
import aoH;
import aoI;

public abstract class AbsSectionIndicator extends FrameLayout
    implements aoH
{

    private static final int a[];
    private aoC b;

    public AbsSectionIndicator(Context context)
    {
        this(context, null);
    }

    public AbsSectionIndicator(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AbsSectionIndicator(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        attributeset = getContext().getTheme().obtainStyledAttributes(attributeset, a, 0, 0);
        i = attributeset.getResourceId(aoA.c.AbsSectionIndicator_rfs_section_indicator_layout, a());
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(i, this, true);
        attributeset.recycle();
        new aoI(this);
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    protected abstract int a();

    public void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (b == null)
        {
            b = new aoC(new aoB(new aoB.a() {

                public final float a()
                {
                    return 0.0F;
                }

            }, new aoB.a() {

                private AbsSectionIndicator a;

                public final float a()
                {
                    return (float)(((ViewGroup)a.getParent()).getHeight() - a.getHeight());
                }

            
            {
                a = AbsSectionIndicator.this;
                super();
            }
            }));
        }
    }

    public void setProgress(float f)
    {
        setY(b.a(f));
    }

    public abstract void setSection(Object obj);

    static 
    {
        a = aoA.c.AbsSectionIndicator;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.lyft.scoop;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.lyft.scoop.transitions.NullTransition;
import dagger.ObjectGraph;

// Referenced classes of package com.lyft.scoop:
//            IUiContainer, Scoop, Utils, Keyboard, 
//            Screen, IHandleBack, Layout, NullScreen, 
//            IScreenTransition

public abstract class SimpleUiContainer extends FrameLayout
    implements IUiContainer
{

    private View active;
    private final ObjectGraph containerGraph;
    private Screen currentScreen;

    public SimpleUiContainer(Context context)
    {
        this(context, null, 0);
    }

    public SimpleUiContainer(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SimpleUiContainer(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        containerGraph = Scoop.a(this).a(new Object[] {
            getModule()
        });
        containerGraph.inject(this);
    }

    private void brokenSwap(Screen screen, IScreenTransition iscreentransition)
    {
        View view;
label0:
        {
            Scoop scoop = Scoop.a(containerGraph, screen);
            int i = getLayout(screen);
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Utils.a(flag);
            Keyboard.a(this);
            view = active;
            if (active != null)
            {
                currentScreen.saveViewState(active);
            }
            active = scoop.a(getContext()).inflate(i, this, false);
            screen.restoreViewState(active);
            addView(active);
            currentScreen = screen;
            if (view != null)
            {
                if (iscreentransition != null)
                {
                    break label0;
                }
                removeView(view);
            }
            return;
        }
        screen = active;
        Utils.a(active, new Utils.OnMeasuredCallback(iscreentransition, view, screen) {

            final IScreenTransition a;
            final View b;
            final View c;
            final SimpleUiContainer d;

            public void a(View view1, int j, int k)
            {
                a.a(d, b, c);
            }

            
            {
                d = SimpleUiContainer.this;
                a = iscreentransition;
                b = view;
                c = view1;
                super();
            }
        });
    }

    private boolean childCanGoBack()
    {
        return (active instanceof IHandleBack) && ((IHandleBack)active).onBack();
    }

    private void clean()
    {
        active = null;
        removeAllViews();
    }

    private void legacySwap(Screen screen, IScreenTransition iscreentransition)
    {
        iscreentransition = Scoop.a(containerGraph, screen);
        int i = getLayout(screen);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Utils.a(flag);
        Keyboard.a(this);
        if (active != null)
        {
            currentScreen.saveViewState(active);
            removeView(active);
        }
        active = iscreentransition.a(getContext()).inflate(i, this, false);
        screen.restoreViewState(active);
        addView(active);
        currentScreen = screen;
    }

    private void swap(Screen screen, IScreenTransition iscreentransition)
    {
        legacySwap(screen, iscreentransition);
    }

    protected int getLayout(Screen screen)
    {
        return ((Layout)Utils.a(screen).getAnnotation(com/lyft/scoop/Layout)).a();
    }

    protected abstract Object getModule();

    public void goTo(Screen screen)
    {
        goTo(screen, ((IScreenTransition) (NullTransition.a)));
    }

    public void goTo(Screen screen, IScreenTransition iscreentransition)
    {
        if (NullScreen.a(screen))
        {
            clean();
            return;
        } else
        {
            swap(screen, iscreentransition);
            return;
        }
    }

    public boolean onBack()
    {
        return childCanGoBack();
    }
}

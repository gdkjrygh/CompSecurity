// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import com.lyft.scoop.IHaveParent;
import com.lyft.scoop.NullScreen;
import com.lyft.scoop.Screen;
import rx.Observable;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.common:
//            Backstack, Objects, ScreenUtils

public class AppFlow
{

    public static final String BACKSTACK_BUNDLE_KEY = "appflow";
    private Backstack backStack;
    private final PublishSubject screenChangeSubject = PublishSubject.create();

    public AppFlow()
    {
        backStack = new Backstack();
    }

    private Screen getScreen()
    {
        return (Screen)Objects.firstNonNull(backStack.peek(), NullScreen.a());
    }

    private void onScreenChanged(Screen screen)
    {
        screenChangeSubject.onNext(screen);
    }

    private boolean sameSingleInstanceScreen(Screen screen)
    {
        return ScreenUtils.sameSingleInstanceScreen(getScreen(), screen);
    }

    public boolean goBack()
    {
        if (!backStack.isEmpty())
        {
            backStack.pop();
            if (!backStack.isEmpty())
            {
                onScreenChanged((Screen)backStack.peek());
                return true;
            }
        }
        return false;
    }

    public void goTo(Screen screen)
    {
        if (sameSingleInstanceScreen(screen))
        {
            return;
        } else
        {
            backStack.push(screen);
            onScreenChanged(screen);
            return;
        }
    }

    public void goUp()
    {
label0:
        {
            if (!backStack.isEmpty())
            {
                Screen screen = (Screen)backStack.peek();
                if (!(screen instanceof IHaveParent))
                {
                    break label0;
                }
                resetTo(((IHaveParent)screen).getParent());
            }
            return;
        }
        goBack();
    }

    public Observable observeScreenChange()
    {
        return screenChangeSubject.asObservable();
    }

    public void onCreate(Screen screen)
    {
        if (backStack.peek() == null)
        {
            backStack.push(screen);
        }
        onScreenChanged((Screen)backStack.peek());
    }

    public void replaceWith(Screen screen)
    {
        if (sameSingleInstanceScreen(screen))
        {
            return;
        } else
        {
            backStack.pop();
            backStack.push(screen);
            onScreenChanged(screen);
            return;
        }
    }

    public void resetTo(Screen screen)
    {
        if (sameSingleInstanceScreen(screen))
        {
            return;
        }
_L3:
        Screen screen1;
        if (!backStack.isEmpty())
        {
            if (screen.equals(screen1 = (Screen)backStack.peek()))
            {
                onScreenChanged(screen1);
                return;
            }
        } else
        {
            backStack.push(screen);
            onScreenChanged(screen);
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        backStack.pop();
        if (true) goto _L3; else goto _L1
_L1:
    }

    public void resetToParent(Screen screen)
    {
        if (sameSingleInstanceScreen(screen))
        {
            return;
        }
        Screen screen1 = ((IHaveParent)screen).getParent();
        do
        {
            if (backStack.isEmpty() || screen1.equals((Screen)backStack.peek()))
            {
                backStack.push(screen);
                onScreenChanged(screen);
                return;
            }
            backStack.pop();
        } while (true);
    }
}

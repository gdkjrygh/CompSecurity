// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import com.lyft.scoop.NullScreen;
import com.lyft.scoop.Screen;
import java.util.ArrayDeque;
import java.util.Queue;
import rx.Observable;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.common:
//            Objects, ScreenUtils

public class DialogFlow
{

    private final PublishSubject dialogChangeSubject = PublishSubject.create();
    private final Queue screenQueue = new ArrayDeque();

    public DialogFlow()
    {
    }

    private Screen getDialog()
    {
        return (Screen)Objects.firstNonNull(screenQueue.peek(), NullScreen.a());
    }

    private void onDialogChanged(Screen screen)
    {
        dialogChangeSubject.onNext(screen);
    }

    private boolean sameSingleInstanceScreen(Screen screen)
    {
        return ScreenUtils.sameSingleInstanceScreen(screen, getDialog());
    }

    public boolean dismiss()
    {
        if (!screenQueue.isEmpty())
        {
            screenQueue.poll();
            Screen screen = (Screen)screenQueue.peek();
            Object obj = screen;
            if (screen == null)
            {
                obj = NullScreen.a();
            }
            onDialogChanged(((Screen) (obj)));
            return true;
        } else
        {
            return false;
        }
    }

    public boolean dismiss(Class class1)
    {
        if (getDialog().getClass().equals(class1))
        {
            dismiss();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean hasActiveDialog()
    {
        return getDialog() != NullScreen.a();
    }

    public Observable observeDialogChange()
    {
        return dialogChangeSubject.asObservable();
    }

    public void onCreate()
    {
        Screen screen = (Screen)screenQueue.peek();
        if (screen != null)
        {
            onDialogChanged(screen);
        }
    }

    public void queue(Screen screen)
    {
        if (sameSingleInstanceScreen(screen))
        {
            return;
        }
        if (screenQueue.isEmpty())
        {
            onDialogChanged(screen);
        }
        screenQueue.offer(screen);
    }

    public void show(Screen screen)
    {
        if (sameSingleInstanceScreen(screen))
        {
            return;
        }
        if (!screenQueue.isEmpty())
        {
            screenQueue.clear();
        }
        screenQueue.offer(screen);
        onDialogChanged(screen);
    }
}

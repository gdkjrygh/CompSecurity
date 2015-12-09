// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.validation;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ValidationGroup
{
    public static interface Groupable
    {

        public abstract boolean checkForError();

        public abstract void setInvalidState(String s);
    }


    private View firstError;
    private final List inputs = new ArrayList();

    public ValidationGroup()
    {
    }

    public final void addInput(View view)
    {
        inputs.add(view);
    }

    public final boolean checkForErrors()
    {
        firstError = null;
        Iterator iterator = inputs.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Groupable groupable = (Groupable)iterator.next();
            if (groupable.checkForError() && firstError == null)
            {
                if (groupable instanceof View)
                {
                    firstError = (View)groupable;
                } else
                {
                    throw new IllegalStateException("Groupable must be a subclass of view");
                }
            }
        } while (true);
        return firstError != null;
    }

    public final void clearInputs()
    {
        inputs.clear();
    }

    public final void focusOnFirstError()
    {
        if (firstError != null)
        {
            firstError.requestFocus();
        }
    }

    public final void removeInput(View view)
    {
        inputs.remove(view);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;


public abstract class ViewMatcher
{

    public ViewMatcher()
    {
    }

    public static ViewMatcher construct(Class aclass[])
    {
        if (aclass == null)
        {
            return Empty.instance;
        }
        switch (aclass.length)
        {
        default:
            return new Multi(aclass);

        case 0: // '\0'
            return Empty.instance;

        case 1: // '\001'
            return new Single(aclass[0]);
        }
    }

    public abstract boolean isVisibleForView(Class class1);

    private class Empty extends ViewMatcher
    {

        static final Empty instance = new Empty();

        public boolean isVisibleForView(Class class1)
        {
            return false;
        }


        private Empty()
        {
        }
    }


    private class Multi extends ViewMatcher
    {

        private final Class _views[];

        public boolean isVisibleForView(Class class1)
        {
            boolean flag1 = false;
            int j = _views.length;
            int i = 0;
            do
            {
label0:
                {
                    boolean flag = flag1;
                    if (i < j)
                    {
                        Class class2 = _views[i];
                        if (class1 != class2 && !class2.isAssignableFrom(class1))
                        {
                            break label0;
                        }
                        flag = true;
                    }
                    return flag;
                }
                i++;
            } while (true);
        }

        public Multi(Class aclass[])
        {
            _views = aclass;
        }
    }


    private class Single extends ViewMatcher
    {

        private final Class _view;

        public boolean isVisibleForView(Class class1)
        {
            return class1 == _view || _view.isAssignableFrom(class1);
        }

        public Single(Class class1)
        {
            _view = class1;
        }
    }

}

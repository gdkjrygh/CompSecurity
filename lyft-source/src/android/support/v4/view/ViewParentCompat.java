// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

public class ViewParentCompat
{

    static final ViewParentCompatImpl a;

    public static void a(ViewParent viewparent, View view)
    {
        a.a(viewparent, view);
    }

    public static void a(ViewParent viewparent, View view, int i, int j, int k, int l)
    {
        a.a(viewparent, view, i, j, k, l);
    }

    public static void a(ViewParent viewparent, View view, int i, int j, int ai[])
    {
        a.a(viewparent, view, i, j, ai);
    }

    public static boolean a(ViewParent viewparent, View view, float f, float f1)
    {
        return a.a(viewparent, view, f, f1);
    }

    public static boolean a(ViewParent viewparent, View view, float f, float f1, boolean flag)
    {
        return a.a(viewparent, view, f, f1, flag);
    }

    public static boolean a(ViewParent viewparent, View view, View view1, int i)
    {
        return a.a(viewparent, view, view1, i);
    }

    public static void b(ViewParent viewparent, View view, View view1, int i)
    {
        a.b(viewparent, view, view1, i);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new ViewParentCompatLollipopImpl();
        } else
        if (i >= 19)
        {
            a = new ViewParentCompatKitKatImpl();
        } else
        if (i >= 14)
        {
            a = new ViewParentCompatICSImpl();
        } else
        {
            a = new ViewParentCompatStubImpl();
        }
    }

    private class ViewParentCompatImpl
    {

        public abstract void a(ViewParent viewparent, View view);

        public abstract void a(ViewParent viewparent, View view, int i, int j, int k, int l);

        public abstract void a(ViewParent viewparent, View view, int i, int j, int ai[]);

        public abstract boolean a(ViewParent viewparent, View view, float f, float f1);

        public abstract boolean a(ViewParent viewparent, View view, float f, float f1, boolean flag);

        public abstract boolean a(ViewParent viewparent, View view, View view1, int i);

        public abstract void b(ViewParent viewparent, View view, View view1, int i);
    }


    private class ViewParentCompatLollipopImpl extends ViewParentCompatKitKatImpl
    {
        private class ViewParentCompatKitKatImpl extends ViewParentCompatICSImpl
        {
            private class ViewParentCompatICSImpl extends ViewParentCompatStubImpl
            {
                private class ViewParentCompatStubImpl
                    implements ViewParentCompatImpl
                {

                    public void a(ViewParent viewparent, View view)
                    {
                        if (viewparent instanceof NestedScrollingParent)
                        {
                            ((NestedScrollingParent)viewparent).onStopNestedScroll(view);
                        }
                    }

                    public void a(ViewParent viewparent, View view, int i, int j, int k, int l)
                    {
                        if (viewparent instanceof NestedScrollingParent)
                        {
                            ((NestedScrollingParent)viewparent).onNestedScroll(view, i, j, k, l);
                        }
                    }

                    public void a(ViewParent viewparent, View view, int i, int j, int ai[])
                    {
                        if (viewparent instanceof NestedScrollingParent)
                        {
                            ((NestedScrollingParent)viewparent).onNestedPreScroll(view, i, j, ai);
                        }
                    }

                    public boolean a(ViewParent viewparent, View view, float f, float f1)
                    {
                        if (viewparent instanceof NestedScrollingParent)
                        {
                            return ((NestedScrollingParent)viewparent).onNestedPreFling(view, f, f1);
                        } else
                        {
                            return false;
                        }
                    }

                    public boolean a(ViewParent viewparent, View view, float f, float f1, boolean flag)
                    {
                        if (viewparent instanceof NestedScrollingParent)
                        {
                            return ((NestedScrollingParent)viewparent).onNestedFling(view, f, f1, flag);
                        } else
                        {
                            return false;
                        }
                    }

                    public boolean a(ViewParent viewparent, View view, View view1, int i)
                    {
                        if (viewparent instanceof NestedScrollingParent)
                        {
                            return ((NestedScrollingParent)viewparent).onStartNestedScroll(view, view1, i);
                        } else
                        {
                            return false;
                        }
                    }

                    public void b(ViewParent viewparent, View view, View view1, int i)
                    {
                        if (viewparent instanceof NestedScrollingParent)
                        {
                            ((NestedScrollingParent)viewparent).onNestedScrollAccepted(view, view1, i);
                        }
                    }

                    ViewParentCompatStubImpl()
                    {
                    }
                }


                ViewParentCompatICSImpl()
                {
                }
            }


            ViewParentCompatKitKatImpl()
            {
            }
        }


        public void a(ViewParent viewparent, View view)
        {
            ViewParentCompatLollipop.a(viewparent, view);
        }

        public void a(ViewParent viewparent, View view, int i, int j, int k, int l)
        {
            ViewParentCompatLollipop.a(viewparent, view, i, j, k, l);
        }

        public void a(ViewParent viewparent, View view, int i, int j, int ai[])
        {
            ViewParentCompatLollipop.a(viewparent, view, i, j, ai);
        }

        public boolean a(ViewParent viewparent, View view, float f, float f1)
        {
            return ViewParentCompatLollipop.a(viewparent, view, f, f1);
        }

        public boolean a(ViewParent viewparent, View view, float f, float f1, boolean flag)
        {
            return ViewParentCompatLollipop.a(viewparent, view, f, f1, flag);
        }

        public boolean a(ViewParent viewparent, View view, View view1, int i)
        {
            return ViewParentCompatLollipop.a(viewparent, view, view1, i);
        }

        public void b(ViewParent viewparent, View view, View view1, int i)
        {
            ViewParentCompatLollipop.b(viewparent, view, view1, i);
        }

        ViewParentCompatLollipopImpl()
        {
        }
    }

}

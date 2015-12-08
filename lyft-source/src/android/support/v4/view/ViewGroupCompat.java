// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewGroup;

public class ViewGroupCompat
{

    static final ViewGroupCompatImpl a;

    public static void a(ViewGroup viewgroup, boolean flag)
    {
        a.a(viewgroup, flag);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new ViewGroupCompatLollipopImpl();
        } else
        if (i >= 18)
        {
            a = new ViewGroupCompatJellybeanMR2Impl();
        } else
        if (i >= 14)
        {
            a = new ViewGroupCompatIcsImpl();
        } else
        if (i >= 11)
        {
            a = new ViewGroupCompatHCImpl();
        } else
        {
            a = new ViewGroupCompatStubImpl();
        }
    }

    private class ViewGroupCompatImpl
    {

        public abstract void a(ViewGroup viewgroup, boolean flag);
    }


    private class ViewGroupCompatLollipopImpl extends ViewGroupCompatJellybeanMR2Impl
    {
        private class ViewGroupCompatJellybeanMR2Impl extends ViewGroupCompatIcsImpl
        {
            private class ViewGroupCompatIcsImpl extends ViewGroupCompatHCImpl
            {
                private class ViewGroupCompatHCImpl extends ViewGroupCompatStubImpl
                {
                    private class ViewGroupCompatStubImpl
                        implements ViewGroupCompatImpl
                    {

                        public void a(ViewGroup viewgroup, boolean flag)
                        {
                        }

                        ViewGroupCompatStubImpl()
                        {
                        }
                    }


                    public void a(ViewGroup viewgroup, boolean flag)
                    {
                        ViewGroupCompatHC.a(viewgroup, flag);
                    }

                    ViewGroupCompatHCImpl()
                    {
                    }
                }


                ViewGroupCompatIcsImpl()
                {
                }
            }


            ViewGroupCompatJellybeanMR2Impl()
            {
            }
        }


        ViewGroupCompatLollipopImpl()
        {
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            LayoutInflaterFactory

public class LayoutInflaterCompat
{

    static final LayoutInflaterCompatImpl a;

    public static void a(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
    {
        a.a(layoutinflater, layoutinflaterfactory);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new LayoutInflaterCompatImplV21();
        } else
        if (i >= 11)
        {
            a = new LayoutInflaterCompatImplV11();
        } else
        {
            a = new LayoutInflaterCompatImplBase();
        }
    }

    private class LayoutInflaterCompatImpl
    {

        public abstract void a(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory);
    }


    private class LayoutInflaterCompatImplV21 extends LayoutInflaterCompatImplV11
    {
        private class LayoutInflaterCompatImplV11 extends LayoutInflaterCompatImplBase
        {
            private class LayoutInflaterCompatImplBase
                implements LayoutInflaterCompatImpl
            {

                public void a(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
                {
                    LayoutInflaterCompatBase.a(layoutinflater, layoutinflaterfactory);
                }

                LayoutInflaterCompatImplBase()
                {
                }
            }


            public void a(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
            {
                LayoutInflaterCompatHC.a(layoutinflater, layoutinflaterfactory);
            }

            LayoutInflaterCompatImplV11()
            {
            }
        }


        public void a(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
        {
            LayoutInflaterCompatLollipop.a(layoutinflater, layoutinflaterfactory);
        }

        LayoutInflaterCompatImplV21()
        {
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewConfiguration;

public class ViewConfigurationCompat
{

    static final ViewConfigurationVersionImpl a;

    public static int a(ViewConfiguration viewconfiguration)
    {
        return a.a(viewconfiguration);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new IcsViewConfigurationVersionImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new HoneycombViewConfigurationVersionImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            a = new FroyoViewConfigurationVersionImpl();
        } else
        {
            a = new BaseViewConfigurationVersionImpl();
        }
    }

    private class ViewConfigurationVersionImpl
    {

        public abstract int a(ViewConfiguration viewconfiguration);
    }


    private class IcsViewConfigurationVersionImpl extends HoneycombViewConfigurationVersionImpl
    {
        private class HoneycombViewConfigurationVersionImpl extends FroyoViewConfigurationVersionImpl
        {
            private class FroyoViewConfigurationVersionImpl extends BaseViewConfigurationVersionImpl
            {
                private class BaseViewConfigurationVersionImpl
                    implements ViewConfigurationVersionImpl
                {

                    public int a(ViewConfiguration viewconfiguration)
                    {
                        return viewconfiguration.getScaledTouchSlop();
                    }

                    BaseViewConfigurationVersionImpl()
                    {
                    }
                }


                public int a(ViewConfiguration viewconfiguration)
                {
                    return ViewConfigurationCompatFroyo.a(viewconfiguration);
                }

                FroyoViewConfigurationVersionImpl()
                {
                }
            }


            HoneycombViewConfigurationVersionImpl()
            {
            }
        }


        IcsViewConfigurationVersionImpl()
        {
        }
    }

}

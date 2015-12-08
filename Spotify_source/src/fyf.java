// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import java.util.HashSet;
import java.util.Set;

public abstract class fyf extends Fragment
{

    private static final fyg Y = new fyg() {

        public final volatile boolean a(Object obj)
        {
            return false;
        }

    };
    private static final fyg Z = new fyg() {

        public final boolean a(Object obj)
        {
            return ((fyh)obj).c();
        }

    };
    private static final fyg a = new fyg() {

        public final volatile boolean a(Object obj)
        {
            return ((fyh)obj).a();
        }

    };
    private static final fyg aa = new fyg() {

        public final volatile boolean a(Object obj)
        {
            return false;
        }

    };
    private static final fyg ab = new fyg() {

        public final boolean a(Object obj)
        {
            return ((fyh)obj).d();
        }

    };
    private static final fyg ac = new fyg() {

        public final boolean a(Object obj)
        {
            return ((fyh)obj).b();
        }

    };
    private static final fyg b = new fyg() {

        public final volatile boolean a(Object obj)
        {
            return false;
        }

    };
    private final Set ad = new HashSet();

    public fyf()
    {
    }

    private void a(fyg fyg, Object obj, Object obj1)
    {
        cuv.a(ad, new cua(fyg) {

            private fyg a;

            public final volatile boolean a(Object obj2)
            {
                obj2 = (fyh)obj2;
                return a.a(obj2);
            }

            
            {
                a = fyg1;
                super();
            }
        });
    }

    public final void A()
    {
        super.A();
        a(ab, null, null);
    }

    public final void B()
    {
        super.B();
        a(ac, null, null);
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        a(a, activity, null);
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
        }
        a(b, bundle, null);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        a(Y, view, bundle);
    }

    public final void a(fyh fyh)
    {
        ad.add(fyh);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        a(aa, bundle, null);
    }

    public final void z()
    {
        super.z();
        a(Z, null, null);
    }

}

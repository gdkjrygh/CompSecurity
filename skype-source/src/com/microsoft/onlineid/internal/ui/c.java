// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.microsoft.onlineid.internal.k;
import com.microsoft.onlineid.internal.n;

// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            ProgressView

public class c extends Fragment
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/microsoft/onlineid/internal/ui/c$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("Header", 0);
            b = new a("Body", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private ProgressView a;

    public c()
    {
    }

    public static c a(String s, String s1, Class class1)
    {
        Bundle bundle = new Bundle();
        try
        {
            class1 = (c)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        bundle.putString(a.a.name(), s);
        bundle.putString(a.b.name(), s1);
        class1.setArguments(bundle);
        return class1;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Object obj = new n(getActivity().getApplicationContext());
        super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater = layoutinflater.inflate(((n) (obj)).c("base_screen"), viewgroup, false);
        a = (ProgressView)layoutinflater.findViewById(((n) (obj)).d("baseScreenProgressView"));
        viewgroup = (TextView)layoutinflater.findViewById(((n) (obj)).d("baseScreenHeader"));
        bundle = (TextView)layoutinflater.findViewById(((n) (obj)).d("baseScreenBody"));
        obj = getArguments();
        String s = a.a.name();
        String s1 = a.b.name();
        k.a(((Bundle) (obj)).getString(s), s);
        k.a(((Bundle) (obj)).getString(s1), s1);
        viewgroup.setText(((Bundle) (obj)).getString(s));
        bundle.setText(((Bundle) (obj)).getString(s1));
        return layoutinflater;
    }
}

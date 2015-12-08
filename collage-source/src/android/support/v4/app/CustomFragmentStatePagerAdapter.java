// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.cardinalblue.android.piccollage.a.f;

// Referenced classes of package android.support.v4.app:
//            FragmentStatePagerAdapter, Fragment, FragmentManager

public abstract class CustomFragmentStatePagerAdapter extends FragmentStatePagerAdapter
{

    public CustomFragmentStatePagerAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
    }

    public abstract String getItemTag(int i);

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        String s = getItemTag(i);
        viewgroup = (Fragment)super.instantiateItem(viewgroup, i);
        Bundle bundle = ((Fragment) (viewgroup)).mSavedFragmentState;
        if (bundle != null)
        {
            bundle.setClassLoader(viewgroup.getClass().getClassLoader());
        }
        if (!TextUtils.isEmpty(s))
        {
            if (((Fragment) (viewgroup)).mTag != null && !s.equals(((Fragment) (viewgroup)).mTag))
            {
                f.a(new IllegalStateException((new StringBuilder()).append("Can't change tag of fragment ").append(viewgroup).append(": was ").append(((Fragment) (viewgroup)).mTag).append(" now ").append(s).toString()));
            }
            viewgroup.mTag = s;
        }
        return viewgroup;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.validation;

import com.google.android.apps.wallet.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.widgets.validation:
//            ValidatedAutoCompleteEditText

public final class  extends Binding
    implements MembersInjector
{

    private Binding accessibilityUtil;

    public final void attach(Linker linker)
    {
        accessibilityUtil = linker.requestBinding("com.google.android.apps.wallet.util.accessibility.AccessibilityUtil", com/google/android/apps/wallet/widgets/validation/ValidatedAutoCompleteEditText, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(accessibilityUtil);
    }

    public final void injectMembers(ValidatedAutoCompleteEditText validatedautocompleteedittext)
    {
        validatedautocompleteedittext.accessibilityUtil = (AccessibilityUtil)accessibilityUtil.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ValidatedAutoCompleteEditText)obj);
    }

    public ()
    {
        super(null, "members/com.google.android.apps.wallet.widgets.validation.ValidatedAutoCompleteEditText", false, com/google/android/apps/wallet/widgets/validation/ValidatedAutoCompleteEditText);
    }
}

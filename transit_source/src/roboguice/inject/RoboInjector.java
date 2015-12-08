// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.google.inject.Injector;

public interface RoboInjector
    extends Injector
{

    public abstract void injectMembersWithoutViews(Object obj);

    public abstract void injectViewMembers(Activity activity);

    public abstract void injectViewMembers(Fragment fragment);
}

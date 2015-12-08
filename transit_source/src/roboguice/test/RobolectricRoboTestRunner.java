// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.test;

import com.xtremelabs.robolectric.Robolectric;
import com.xtremelabs.robolectric.RobolectricConfig;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import com.xtremelabs.robolectric.bytecode.ClassHandler;
import com.xtremelabs.robolectric.bytecode.RobolectricClassLoader;
import java.io.File;
import org.junit.runners.model.InitializationError;
import roboguice.test.shadow.ShadowFragment;
import roboguice.test.shadow.ShadowFragmentActivity;

public class RobolectricRoboTestRunner extends RobolectricTestRunner
{

    public RobolectricRoboTestRunner(Class class1)
        throws InitializationError
    {
        super(class1);
    }

    public RobolectricRoboTestRunner(Class class1, RobolectricConfig robolectricconfig)
        throws InitializationError
    {
        super(class1, robolectricconfig);
    }

    public RobolectricRoboTestRunner(Class class1, ClassHandler classhandler, RobolectricConfig robolectricconfig)
        throws InitializationError
    {
        super(class1, classhandler, robolectricconfig);
    }

    public RobolectricRoboTestRunner(Class class1, ClassHandler classhandler, RobolectricClassLoader robolectricclassloader, RobolectricConfig robolectricconfig)
        throws InitializationError
    {
        super(class1, classhandler, robolectricclassloader, robolectricconfig);
    }

    public RobolectricRoboTestRunner(Class class1, File file)
        throws InitializationError
    {
        super(class1, file);
    }

    public RobolectricRoboTestRunner(Class class1, File file, File file1)
        throws InitializationError
    {
        super(class1, file, file1);
    }

    protected void bindShadowClasses()
    {
        super.bindShadowClasses();
        Robolectric.bindShadowClass(roboguice/test/shadow/ShadowFragmentActivity);
        Robolectric.bindShadowClass(roboguice/test/shadow/ShadowFragment);
    }
}

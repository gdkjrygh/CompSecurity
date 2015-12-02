// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import android.os.StrictMode;
import android.util.Log;
import java.lang.reflect.Field;

// Referenced classes of package com.b.a.a:
//            g

public abstract class a
    implements g
{

    private static final int PENALTY_LOG = 16;
    private static final String POLICY_MASK_FIELD = "mask";
    private static final String TAG = com/b/a/a/a.getSimpleName();

    public a()
    {
    }

    private int clearPenaltyLogBit(int i, int j)
    {
        return ~j & i;
    }

    private void clearPenaltyLogBit(android.os.StrictMode.ThreadPolicy threadpolicy)
    {
        setPolicyMask(threadpolicy, "mask", clearPenaltyLogBit(getPolicyMask(threadpolicy, "mask").intValue(), 16));
    }

    private void clearPenaltyLogBit(android.os.StrictMode.VmPolicy vmpolicy)
    {
        setPolicyMask(vmpolicy, "mask", clearPenaltyLogBit(getPolicyMask(vmpolicy, "mask").intValue(), 16));
    }

    private android.os.StrictMode.VmPolicy.Builder createVmBuilder_v11(android.os.StrictMode.VmPolicy vmpolicy)
    {
        return new android.os.StrictMode.VmPolicy.Builder(vmpolicy);
    }

    private android.os.StrictMode.VmPolicy.Builder createVmBuilder_v9(android.os.StrictMode.VmPolicy vmpolicy)
    {
        android.os.StrictMode.VmPolicy.Builder builder = new android.os.StrictMode.VmPolicy.Builder();
        try
        {
            Object obj1 = vmpolicy.getClass();
            Object obj = builder.getClass();
            obj1 = ((Class) (obj1)).getDeclaredField("mask");
            obj = ((Class) (obj)).getDeclaredField("mMask");
            ((Field) (obj1)).setAccessible(true);
            ((Field) (obj)).setAccessible(true);
            ((Field) (obj)).setInt(builder, ((Field) (obj1)).getInt(vmpolicy));
        }
        // Misplaced declaration of an exception variable
        catch (android.os.StrictMode.VmPolicy vmpolicy)
        {
            Log.e(TAG, "Failed to inherit existing VmPolicy mask to VmPolicy.Builder.", vmpolicy);
            return builder;
        }
        return builder;
    }

    private Integer getPolicyMask(Object obj, String s)
    {
        Class class1 = obj.getClass();
        int i;
        try
        {
            s = class1.getDeclaredField(s);
            s.setAccessible(true);
            i = s.getInt(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(TAG, (new StringBuilder()).append("Failed to get penalty mask in ").append(class1.getSimpleName()).toString(), ((Throwable) (obj)));
            return null;
        }
        return Integer.valueOf(i);
    }

    private boolean isPenaltyLogSet(Object obj, String s, int i)
    {
        for (obj = getPolicyMask(obj, s); obj == null || (((Integer) (obj)).intValue() & i) == 0;)
        {
            return false;
        }

        return true;
    }

    private void setPolicyMask(Object obj, String s, int i)
    {
        Class class1 = obj.getClass();
        try
        {
            s = class1.getDeclaredField(s);
            s.setAccessible(true);
            s.setInt(obj, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(TAG, (new StringBuilder()).append("Failed to set penalty mask in ").append(class1.getSimpleName()).toString(), ((Throwable) (obj)));
        }
    }

    private void updateThreadPolicy()
    {
        android.os.StrictMode.ThreadPolicy threadpolicy = StrictMode.getThreadPolicy();
        boolean flag = isPenaltyLogSet(threadpolicy);
        threadpolicy = onUpdateThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadpolicy));
        if (!flag && shouldRestoreThreadPenaltyLog())
        {
            clearPenaltyLogBit(threadpolicy);
        }
        StrictMode.setThreadPolicy(threadpolicy);
    }

    private void updateVmPolicy()
    {
        android.os.StrictMode.VmPolicy vmpolicy = StrictMode.getVmPolicy();
        boolean flag = isPenaltyLogSet(vmpolicy);
        vmpolicy = onUpdateVmPolicy(createVmBuilder(vmpolicy));
        if (!flag && shouldRestoreVmPenaltyLog())
        {
            clearPenaltyLogBit(vmpolicy);
        }
        StrictMode.setVmPolicy(vmpolicy);
    }

    protected android.os.StrictMode.VmPolicy.Builder createVmBuilder(android.os.StrictMode.VmPolicy vmpolicy)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return createVmBuilder_v11(vmpolicy);
        }
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            return createVmBuilder_v9(vmpolicy);
        } else
        {
            throw new IllegalStateException();
        }
    }

    protected abstract int getMinimumApiLevel();

    protected boolean isPenaltyLogSet(android.os.StrictMode.ThreadPolicy threadpolicy)
    {
        return isPenaltyLogSet(threadpolicy, "mask", 16);
    }

    protected boolean isPenaltyLogSet(android.os.StrictMode.VmPolicy vmpolicy)
    {
        return isPenaltyLogSet(vmpolicy, "mask", 16);
    }

    protected android.os.StrictMode.ThreadPolicy onUpdateThreadPolicy(android.os.StrictMode.ThreadPolicy.Builder builder)
    {
        return builder.build();
    }

    protected android.os.StrictMode.VmPolicy onUpdateVmPolicy(android.os.StrictMode.VmPolicy.Builder builder)
    {
        return builder.build();
    }

    public void set()
    {
        if (android.os.Build.VERSION.SDK_INT >= getMinimumApiLevel() && android.os.Build.VERSION.SDK_INT >= 9)
        {
            updateThreadPolicy();
            updateVmPolicy();
        }
    }

    protected boolean shouldRestoreThreadPenaltyLog()
    {
        return true;
    }

    protected boolean shouldRestoreVmPenaltyLog()
    {
        return true;
    }

}

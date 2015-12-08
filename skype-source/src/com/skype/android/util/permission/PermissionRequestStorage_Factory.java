// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.permission;

import dagger.internal.Factory;

// Referenced classes of package com.skype.android.util.permission:
//            PermissionRequestStorage

public final class PermissionRequestStorage_Factory extends Enum
    implements Factory
{

    private static final PermissionRequestStorage_Factory $VALUES[];
    public static final PermissionRequestStorage_Factory INSTANCE;

    private PermissionRequestStorage_Factory(String s, int i)
    {
        super(s, i);
    }

    public static Factory create()
    {
        return INSTANCE;
    }

    public static PermissionRequestStorage_Factory valueOf(String s)
    {
        return (PermissionRequestStorage_Factory)Enum.valueOf(com/skype/android/util/permission/PermissionRequestStorage_Factory, s);
    }

    public static PermissionRequestStorage_Factory[] values()
    {
        return (PermissionRequestStorage_Factory[])$VALUES.clone();
    }

    public final PermissionRequestStorage get()
    {
        return new PermissionRequestStorage();
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        INSTANCE = new PermissionRequestStorage_Factory("INSTANCE", 0);
        $VALUES = (new PermissionRequestStorage_Factory[] {
            INSTANCE
        });
    }
}

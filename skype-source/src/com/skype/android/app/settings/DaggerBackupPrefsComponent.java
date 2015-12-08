// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import com.skype.SkyLib;
import com.skype.android.SkypeApplicationComponent;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.settings:
//            BackupPrefsComponent, BackupPrefs_MembersInjector, BackupPrefs

public final class DaggerBackupPrefsComponent
    implements BackupPrefsComponent
{
    public static final class Builder
    {

        private SkypeApplicationComponent skypeApplicationComponent;

        public final BackupPrefsComponent build()
        {
            if (skypeApplicationComponent == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerBackupPrefsComponent(this);
            }
        }

        public final Builder skypeApplicationComponent(SkypeApplicationComponent skypeapplicationcomponent)
        {
            if (skypeapplicationcomponent == null)
            {
                throw new NullPointerException();
            } else
            {
                skypeApplicationComponent = skypeapplicationcomponent;
                return this;
            }
        }


        private Builder()
        {
        }

    }


    static final boolean $assertionsDisabled;
    private MembersInjector backupPrefsMembersInjector;
    private Provider skyLibProvider;

    private DaggerBackupPrefsComponent(Builder builder1)
    {
        if (!$assertionsDisabled && builder1 == null)
        {
            throw new AssertionError();
        } else
        {
            initialize(builder1);
            return;
        }
    }


    public static Builder builder()
    {
        return new Builder();
    }

    private void initialize(final Builder builder)
    {
        skyLibProvider = new Factory() {

            private final SkypeApplicationComponent skypeApplicationComponent;
            final DaggerBackupPrefsComponent this$0;
            final Builder val$builder;

            public final SkyLib get()
            {
                SkyLib skylib = skypeApplicationComponent.skyLib();
                if (skylib == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return skylib;
                }
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = DaggerBackupPrefsComponent.this;
                builder = builder1;
                super();
                skypeApplicationComponent = builder.skypeApplicationComponent;
            }
        };
        backupPrefsMembersInjector = BackupPrefs_MembersInjector.create(skyLibProvider);
    }

    public final void inject(BackupPrefs backupprefs)
    {
        backupPrefsMembersInjector.injectMembers(backupprefs);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/settings/DaggerBackupPrefsComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

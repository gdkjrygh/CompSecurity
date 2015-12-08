// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package air.com.nbcuni.com.nbcsports.liveextra;

import com.nbcsports.liveextra.library.configuration.RuntimeConfiguration;
import com.nbcsports.liveextra.library.tve.MvpdLookups;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import com.squareup.okhttp.OkHttpClient;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package air.com.nbcuni.com.nbcsports.liveextra:
//            MainSupportWrapperActivity

public final class MainSupportWrapperActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider clientProvider;
    private final Provider configurationProvider;
    private final Provider lookupsProvider;
    private final MembersInjector supertypeInjector;
    private final Provider trackingHelperProvider;

    public MainSupportWrapperActivity_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        trackingHelperProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        lookupsProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            clientProvider = provider3;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new MainSupportWrapperActivity_MembersInjector(membersinjector, provider, provider1, provider2, provider3);
    }

    public void injectMembers(MainSupportWrapperActivity mainsupportwrapperactivity)
    {
        if (mainsupportwrapperactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(mainsupportwrapperactivity);
            mainsupportwrapperactivity.trackingHelper = (TrackingHelper)trackingHelperProvider.get();
            mainsupportwrapperactivity.lookups = (MvpdLookups)lookupsProvider.get();
            mainsupportwrapperactivity.configuration = (RuntimeConfiguration)configurationProvider.get();
            mainsupportwrapperactivity.client = (OkHttpClient)clientProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((MainSupportWrapperActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!air/com/nbcuni/com/nbcsports/liveextra/MainSupportWrapperActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

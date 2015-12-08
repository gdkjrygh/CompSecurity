// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driverdocuments;

import java.io.File;
import java.util.concurrent.TimeUnit;
import me.lyft.android.IUserSession;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.driverdocuments.DriverDocumentsMapper;
import me.lyft.android.domain.driverdocuments.Inspection;
import me.lyft.android.domain.driverdocuments.Insurance;
import me.lyft.android.domain.driverdocuments.Registration;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.driverdocuments.DriverDocumentsDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.s3.IS3Api;
import me.lyft.android.persistence.driverdocuments.IDriverDocumentsStorage;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.driverdocuments:
//            IDriverDocumentsService

public class DriverDocumentsService
    implements IDriverDocumentsService
{

    private static final long DOCUMENTS_CACHE_MAX_AGE;
    private IS3Api IS3Api;
    private IConstantsProvider constantsProvider;
    private IDriverDocumentsStorage driverDocumentsStorage;
    private ILyftApi lyftApi;
    private IUserSession userSession;

    public DriverDocumentsService(IUserSession iusersession, ILyftApi ilyftapi, IS3Api is3api, IDriverDocumentsStorage idriverdocumentsstorage, IConstantsProvider iconstantsprovider)
    {
        userSession = iusersession;
        lyftApi = ilyftapi;
        IS3Api = is3api;
        driverDocumentsStorage = idriverdocumentsstorage;
        constantsProvider = iconstantsprovider;
    }

    public Observable forceRefresh()
    {
        return lyftApi.getDriverDocuments().doOnNext(new Action1() {

            final DriverDocumentsService this$0;

            public volatile void call(Object obj)
            {
                call((DriverDocumentsDTO)obj);
            }

            public void call(DriverDocumentsDTO driverdocumentsdto)
            {
                driverDocumentsStorage.setDriverDocuments(driverdocumentsdto);
            }

            
            {
                this$0 = DriverDocumentsService.this;
                super();
            }
        }).map(Unit.func1());
    }

    public boolean isDriverDocumentsEnabled()
    {
        return ((Boolean)Objects.firstNonNull(userSession.getUser().getDriverDocumentsEnabled(), Boolean.valueOf(false))).booleanValue();
    }

    public void refresh()
    {
        long l;
        if (isDriverDocumentsEnabled())
        {
            if ((l = driverDocumentsStorage.getLastCachedDriverDocuments()) == 0L || System.currentTimeMillis() - l > DOCUMENTS_CACHE_MAX_AGE)
            {
                forceRefresh().subscribe(new SimpleSubscriber());
                return;
            }
        }
    }

    public Observable updateInspection(final Inspection inspection, File file)
    {
        return IS3Api.uploadFile(inspection.getPhotoUploadUrl(), file).flatMap(new Func1() {

            final DriverDocumentsService this$0;
            final Inspection val$inspection;

            public volatile Object call(Object obj)
            {
                return call((Unit)obj);
            }

            public Observable call(Unit unit)
            {
                unit = new DriverDocumentsDTO(null, null, DriverDocumentsMapper.fromInspection(inspection), null);
                return lyftApi.updateInsurance(unit);
            }

            
            {
                this$0 = DriverDocumentsService.this;
                inspection = inspection1;
                super();
            }
        }).doOnNext(new Action1() {

            final DriverDocumentsService this$0;

            public volatile void call(Object obj)
            {
                call((DriverDocumentsDTO)obj);
            }

            public void call(DriverDocumentsDTO driverdocumentsdto)
            {
                driverDocumentsStorage.setDriverDocuments(driverdocumentsdto);
            }

            
            {
                this$0 = DriverDocumentsService.this;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable updateInsurance(final Insurance insurance, File file)
    {
        return IS3Api.uploadFile(insurance.getPhotoUploadUrl(), file).flatMap(new Func1() {

            final DriverDocumentsService this$0;
            final Insurance val$insurance;

            public volatile Object call(Object obj)
            {
                return call((Unit)obj);
            }

            public Observable call(Unit unit)
            {
                unit = new DriverDocumentsDTO(null, DriverDocumentsMapper.fromInsurance(insurance), null, null);
                return lyftApi.updateInsurance(unit);
            }

            
            {
                this$0 = DriverDocumentsService.this;
                insurance = insurance1;
                super();
            }
        }).doOnNext(new Action1() {

            final DriverDocumentsService this$0;

            public volatile void call(Object obj)
            {
                call((DriverDocumentsDTO)obj);
            }

            public void call(DriverDocumentsDTO driverdocumentsdto)
            {
                driverDocumentsStorage.setDriverDocuments(driverdocumentsdto);
            }

            
            {
                this$0 = DriverDocumentsService.this;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable updateRegistration(final Registration registration, File file)
    {
        return IS3Api.uploadFile(registration.getPhotoUploadUrl(), file).flatMap(new Func1() {

            final DriverDocumentsService this$0;
            final Registration val$registration;

            public volatile Object call(Object obj)
            {
                return call((Unit)obj);
            }

            public Observable call(Unit unit)
            {
                unit = new DriverDocumentsDTO(null, null, null, DriverDocumentsMapper.fromRegistration(registration));
                return lyftApi.updateInsurance(unit);
            }

            
            {
                this$0 = DriverDocumentsService.this;
                registration = registration1;
                super();
            }
        }).doOnNext(new Action1() {

            final DriverDocumentsService this$0;

            public volatile void call(Object obj)
            {
                call((DriverDocumentsDTO)obj);
            }

            public void call(DriverDocumentsDTO driverdocumentsdto)
            {
                driverDocumentsStorage.setDriverDocuments(driverdocumentsdto);
            }

            
            {
                this$0 = DriverDocumentsService.this;
                super();
            }
        }).map(Unit.func1());
    }

    static 
    {
        DOCUMENTS_CACHE_MAX_AGE = TimeUnit.HOURS.toMillis(24L);
    }


}

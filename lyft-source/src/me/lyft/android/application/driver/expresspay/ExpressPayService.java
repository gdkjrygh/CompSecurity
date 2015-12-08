// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driver.expresspay;

import java.util.Iterator;
import java.util.List;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import me.lyft.android.domain.driver.ExpressPay;
import me.lyft.android.domain.driver.ExpressPayAccount;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.LyftApiException;
import me.lyft.android.infrastructure.lyft.driver.ExpressPayDTO;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.driver.expresspay:
//            IExpressPayService, ExpressPayException, IExpressPayRepository

public class ExpressPayService
    implements IExpressPayService
{

    private IExpressPayRepository expressPayRepository;
    private ILyftApi lyftApi;
    private IUserProvider userProvider;

    public ExpressPayService(ILyftApi ilyftapi, IUserProvider iuserprovider, IExpressPayRepository iexpresspayrepository)
    {
        lyftApi = ilyftapi;
        userProvider = iuserprovider;
        expressPayRepository = iexpresspayrepository;
    }

    private Observable handleError(Throwable throwable)
    {
        if (throwable instanceof LyftApiException)
        {
            LyftApiException lyftapiexception = (LyftApiException)throwable;
            if (lyftapiexception.getStatusCode() == 422)
            {
                throwable = "Server validation error";
                Object obj = "SERVER_VALIDATION_ERROR";
                Iterator iterator = lyftapiexception.getValidationErrors().iterator();
                while (iterator.hasNext()) 
                {
                    Object obj1 = (me.lyft.android.infrastructure.lyft.LyftError.ValidationError)iterator.next();
                    if (!Strings.isNullOrEmpty(((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj1)).getMessage()))
                    {
                        obj = ((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj1)).getMessage();
                        throwable = ((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj1)).getReason();
                    } else
                    {
                        Throwable throwable1 = throwable;
                        throwable = ((Throwable) (obj));
                        obj = throwable1;
                    }
                    obj1 = obj;
                    obj = throwable;
                    throwable = ((Throwable) (obj1));
                }
                throwable = new ExpressPayException(throwable, lyftapiexception, ((String) (obj)));
            } else
            {
                throwable = new ExpressPayException("Unable to submit Express Pay", throwable, "express_pay_server_error");
            }
        }
        return Observable.error(throwable);
    }

    public Observable getExpressPay()
    {
        return lyftApi.getExpressPay(userProvider.getUser().getId()).onErrorResumeNext(new Func1() {

            final ExpressPayService this$0;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                return handleError(throwable);
            }

            
            {
                this$0 = ExpressPayService.this;
                super();
            }
        }).doOnNext(new Action1() {

            final ExpressPayService this$0;

            public volatile void call(Object obj)
            {
                call((ExpressPayDTO)obj);
            }

            public void call(ExpressPayDTO expresspaydto)
            {
                expressPayRepository.setExpressPay(ExpressPay.fromDTO(expresspaydto));
                expressPayRepository.setExpressAccount(ExpressPayAccount.fromDTO(expresspaydto.expressAccount));
            }

            
            {
                this$0 = ExpressPayService.this;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable submitPayout()
    {
        return lyftApi.submitPayout(userProvider.getUser().getId()).onErrorResumeNext(new Func1() {

            final ExpressPayService this$0;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                return handleError(throwable);
            }

            
            {
                this$0 = ExpressPayService.this;
                super();
            }
        }).map(Unit.func1());
    }


}

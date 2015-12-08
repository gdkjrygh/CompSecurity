// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import me.lyft.android.application.profile.IProfileService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.profile.IProfilePhotoLoader;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.utils.VersionUtils;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.profile:
//            ProfilePhotoBlurBackgroundTransformation

public class PassengerProfilePhotoWidgetView extends LinearLayout
{

    AppFlow appFlow;
    ImageLoader imageLoader;
    TextView nameTextView;
    ImageView photoImageView;
    IProfilePhotoLoader profilePhotoLoader;
    IProfileService profileService;

    public PassengerProfilePhotoWidgetView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = Scoop.a(this);
        attributeset.b(this);
        setOrientation(1);
        attributeset.a(context).inflate(0x7f03010a, this, true);
    }

    private static Observable observeViewLaidOut(final View view)
    {
        if (view.getWidth() > 0 || view.getHeight() > 0)
        {
            return Unit.just();
        } else
        {
            return Observable.create(new rx.Observable.OnSubscribe() {

                final View val$view;

                public volatile void call(Object obj)
                {
                    call((Subscriber)obj);
                }

                public void call(Subscriber subscriber)
                {
                    if (view.getViewTreeObserver().isAlive())
                    {
                        view.getViewTreeObserver().addOnGlobalLayoutListener(subscriber. new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                            final _cls3 this$0;
                            final Subscriber val$subscriber;

                            public void onGlobalLayout()
                            {
                                if (view.getViewTreeObserver().isAlive())
                                {
                                    if (VersionUtils.hasJellyBean())
                                    {
                                        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                    } else
                                    {
                                        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                                    }
                                }
                                subscriber.onNext(Unit.create());
                                subscriber.onCompleted();
                            }

            
            {
                this$0 = final__pcls3;
                subscriber = Subscriber.this;
                super();
            }
                        });
                    }
                }

            
            {
                view = view1;
                super();
            }
            });
        }
    }

    private RequestCreator requestProfilePhoto(String s, boolean flag)
    {
        if (flag)
        {
            return profilePhotoLoader.load();
        } else
        {
            return imageLoader.load(s);
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }

    public void setUserInfo(String s, final String userPhotoUrl, final boolean isSelf)
    {
        nameTextView.setText(s);
        observeViewLaidOut(photoImageView).subscribe(new Action1() {

            final PassengerProfilePhotoWidgetView this$0;
            final boolean val$isSelf;
            final String val$userPhotoUrl;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                int i = photoImageView.getHeight();
                int j = photoImageView.getWidth();
                requestProfilePhoto(userPhotoUrl, isSelf).placeholder(photoImageView.getDrawable()).error(0x7f0201ba).resize(0, i).transform(new ProfilePhotoBlurBackgroundTransformation(getContext(), j, i)).into(photoImageView);
            }

            
            {
                this$0 = PassengerProfilePhotoWidgetView.this;
                userPhotoUrl = s;
                isSelf = flag;
                super();
            }
        });
        photoImageView.setOnClickListener(new android.view.View.OnClickListener() {

            final PassengerProfilePhotoWidgetView this$0;
            final boolean val$isSelf;
            final String val$userPhotoUrl;

            public void onClick(View view)
            {
                if (profileService.isPassengerPhotoUploadEnabled() && isSelf)
                {
                    appFlow.goTo(new ProfileScreens.UpdatePassengerProfilePhotoScreen());
                    return;
                } else
                {
                    appFlow.goTo(new me.lyft.android.ui.MainScreens.FullscreenPhotoScreen(userPhotoUrl));
                    return;
                }
            }

            
            {
                this$0 = PassengerProfilePhotoWidgetView.this;
                isSelf = flag;
                userPhotoUrl = s;
                super();
            }
        });
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.adobe.adobepass.accessenabler.api.IAccessEnablerDelegate;
import com.adobe.adobepass.accessenabler.models.MetadataKey;
import com.adobe.adobepass.accessenabler.models.MetadataStatus;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.nbcsports.liveextra.library.api.models.VideoSource;
import com.nbcsports.liveextra.library.tve.AuthDelegate;
import com.nbcsports.liveextra.library.tve.AuthService;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity, PlayerPresenter, PlayerPresenterListener, AbstractPresenterListener

public class PlayerToolbar extends Toolbar
    implements android.support.v7.widget.Toolbar.OnMenuItemClickListener
{

    private IAccessEnablerDelegate _flddelegate;
    PlayerPresenterListener listener;
    AuthService pass;
    PlayerPresenter playerPresenter;
    private Subscription timer;

    public PlayerToolbar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _flddelegate = new AuthDelegate() {

            final PlayerToolbar this$0;

            public void selectedProvider(Mvpd mvpd)
            {
                super.selectedProvider(mvpd);
                if (mvpd != null && mvpd.getId().startsWith("TempPass"))
                {
                    pass.getAuthNTTL();
                }
            }

            public void setMetadataStatus(MetadataKey metadatakey, MetadataStatus metadatastatus)
            {
                super.setMetadataStatus(metadatakey, metadatastatus);
                if (metadatakey == null) goto _L2; else goto _L1
_L1:
                metadatakey.getKey();
                JVM INSTR tableswitch 0 0: default 32
            //                           0 33;
                   goto _L2 _L3
_L2:
                return;
_L3:
                metadatakey = metadatastatus.getSimpleResult();
                if (pass.getSelectedMvpd() != null && pass.getSelectedMvpd().getId().startsWith("TempPass") && !TextUtils.isEmpty(metadatakey) && !playerPresenter.isFree())
                {
                    post(metadatakey. new Runnable() {

                        final _cls3 this$1;
                        final String val$authNResult;

                        public void run()
                        {
                            getMenu().findItem(0x7f0f020a).setVisible(true);
                            playerPresenter.showTempPass(false);
                            startTimer(authNResult);
                        }

            
            {
                this$1 = final__pcls3;
                authNResult = String.this;
                super();
            }
                    });
                    return;
                }
                if (true) goto _L2; else goto _L4
_L4:
            }

            
            {
                this$0 = PlayerToolbar.this;
                super();
            }
        };
        listener = new AbstractPresenterListener() {

            final PlayerToolbar this$0;

            public void onHideChrome()
            {
                if (!playerPresenter.isFullScreen())
                {
                    return;
                } else
                {
                    setVisibility(8);
                    return;
                }
            }

            public void onShowChrome()
            {
                setVisibility(0);
            }

            public void onSourceSelected(VideoSource videosource)
            {
                setTitle(playerPresenter.getTitle());
            }

            public void onToggleFullScreen(boolean flag)
            {
                setToobarBackground(playerPresenter.isFullScreen());
                if (!playerPresenter.isFullScreen())
                {
                    setVisibility(0);
                }
            }

            
            {
                this$0 = PlayerToolbar.this;
                super();
            }
        };
        if (isInEditMode())
        {
            return;
        } else
        {
            PlayerActivity.component().inject(this);
            return;
        }
    }

    private void setFavoriteStatus(MenuItem menuitem, Drawable drawable)
    {
        if (playerPresenter.isFavorite())
        {
            playerPresenter.removeFavorite();
            if (drawable != null)
            {
                menuitem.setIcon(0x7f02008a);
            }
        } else
        {
            playerPresenter.addFavorite();
            if (drawable != null)
            {
                menuitem.setIcon(0x7f02008b);
                return;
            }
        }
    }

    private void setToobarBackground(boolean flag)
    {
        Object obj;
        if (flag)
        {
            obj = new ColorDrawable(getResources().getColor(0x7f0e0028));
        } else
        {
            obj = getResources().getDrawable(0x7f020129);
        }
        setBackgroundDrawable(((Drawable) (obj)));
    }

    private void startTimer(String s)
    {
        if (timer != null)
        {
            return;
        } else
        {
            timer = Observable.timer(DateTime.parse(s.replaceAll("/", "-").replaceFirst(" ", "T").replaceFirst(" GMT ", ""), ISODateTimeFormat.dateTimeNoMillis().withZone(DateTimeZone.getDefault())).getMillis() - DateTime.now().getMillis(), TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).single().subscribe(new Subscriber() {

                final PlayerToolbar this$0;

                public void onCompleted()
                {
                }

                public void onError(Throwable throwable)
                {
                    Timber.i(throwable, "error showing temp pass dialog expiration", new Object[0]);
                }

                public void onNext(Long long1)
                {
                    playerPresenter.showTempPass(true);
                }

                public volatile void onNext(Object obj)
                {
                    onNext((Long)obj);
                }

            
            {
                this$0 = PlayerToolbar.this;
                super();
            }
            });
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        playerPresenter.register(listener);
        MenuItem menuitem = getMenu().findItem(0x7f0f0209);
        if (menuitem.getIcon() != null && playerPresenter.isFavorite())
        {
            menuitem.setTitle("Remove Favorite");
            menuitem.setIcon(0x7f02008b);
        }
        setNavigationIcon(0x7f020013);
        setNavigationOnClickListener(new android.view.View.OnClickListener() {

            final PlayerToolbar this$0;

            public void onClick(View view)
            {
                playerPresenter.close();
            }

            
            {
                this$0 = PlayerToolbar.this;
                super();
            }
        });
        setTitle(playerPresenter.getTitle());
        pass.register(_flddelegate);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        playerPresenter.unregister(listener);
        pass.unregister(_flddelegate);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        }
        inflateMenu(0x7f100008);
        setOnMenuItemClickListener(this);
        MenuItem menuitem = getMenu().findItem(0x7f0f020b);
        menuitem.setVisible(playerPresenter.hasOverlays());
        int i;
        if (playerPresenter.isFullScreen())
        {
            i = 0x7f02008d;
        } else
        {
            i = 0x7f020087;
        }
        menuitem.setIcon(i);
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 16908332: 
            playerPresenter.close();
            return true;

        case 2131689993: 
            setFavoriteStatus(menuitem, menuitem.getIcon());
            return true;

        case 2131689992: 
            playerPresenter.toggleQoS();
            return true;

        case 2131689994: 
            playerPresenter.showTempPass(false);
            return true;

        case 2131689995: 
            playerPresenter.toggleFullScreen();
            break;
        }
        int i;
        if (playerPresenter.isFullScreen())
        {
            i = 0x7f02008d;
        } else
        {
            i = 0x7f020087;
        }
        menuitem.setIcon(i);
        setToobarBackground(playerPresenter.isFullScreen());
        return true;
    }


}

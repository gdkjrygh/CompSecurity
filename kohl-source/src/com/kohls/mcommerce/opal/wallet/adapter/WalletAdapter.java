// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.adapter;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.BarcodeCreator;
import com.kohls.mcommerce.opal.wallet.util.Constants;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class WalletAdapter extends PagerAdapter
{

    private Animation animation1;
    private Animation animation2;
    private TimeZone mCentralTimezone;
    private Activity mContext;
    private TimeZone mCurrentTimezone;
    private int mPosition;
    ViewPager mViewPager;
    private long timeDifference;
    public List walletData;

    public WalletAdapter(Activity activity, int i, List list)
    {
        walletData = list;
        mContext = activity;
        mPosition = i;
        animation1 = AnimationUtils.loadAnimation(activity, 0x7f040004);
        animation2 = AnimationUtils.loadAnimation(activity, 0x7f040000);
        mCentralTimezone = TimeZone.getTimeZone("US/Central");
        mCurrentTimezone = TimeZone.getDefault();
        timeDifference = (mCentralTimezone.getRawOffset() + mCentralTimezone.getDSTSavings()) - (mCurrentTimezone.getDSTSavings() + mCurrentTimezone.getRawOffset());
    }

    private void cardFlipAnimation(View view, ViewHolder viewholder, int i)
    {
        view.startAnimation(animation1);
        animation1.setAnimationListener(new _cls7(view));
        animation2.setAnimationListener(new _cls8(viewholder, i));
    /* block-local class not found */
    class ViewHolder {}

        viewholder.walletTerms.setOnTouchListener(new _cls9(viewholder));
    }

    private void setGiftCard(int i, ViewHolder viewholder, View view)
    {
        WalletItemResponse walletitemresponse = (WalletItemResponse)walletData.get(i);
        Resources resources = mContext.getResources();
        Object obj = (new DecimalFormat("0.00")).format(Double.valueOf(((WalletItemResponse)walletData.get(i)).getValue()));
        if (walletitemresponse.getTypeCode().equalsIgnoreCase("kmrc"))
        {
            viewholder.title.setText("Merchandise Credit");
            viewholder.expirationTime.setText((new StringBuilder()).append("$").append(((String) (obj)).replaceFirst("\\.00+$", "")).toString());
            viewholder.expirationTime_back.setText((new StringBuilder()).append("$").append(((String) (obj)).replaceFirst("\\.00+$", "")).toString());
            viewholder.walletDescTitle.setText("Merchandise Credit");
            viewholder.kohlsCashLogo.setImageResource(0x7f020159);
            viewholder.imageBack.setImageResource(0x7f020159);
        } else
        {
            viewholder.title.setText("Kohl's Gift Card");
            viewholder.expirationTime.setText((new StringBuilder()).append("$").append(((String) (obj)).replaceFirst("\\.00+$", "")).append(" ").toString());
            viewholder.expirationTime_back.setText((new StringBuilder()).append("$").append(((String) (obj)).replaceFirst("\\.00+$", "")).append(" ").toString());
            viewholder.walletDescTitle.setText("Kohl's Gift Card");
            viewholder.kohlsCashLogo.setImageResource(0x7f0200b0);
            viewholder.imageBack.setImageResource(0x7f0200b0);
        }
        viewholder.expirationTime.setPadding(0, 0, 0, 0);
        viewholder.expirationTime.setGravity(48);
        viewholder.expiryDate.setVisibility(8);
        obj = Calendar.getInstance(mCentralTimezone);
        ((Calendar) (obj)).setTimeInMillis(Long.valueOf(walletitemresponse.getEffectiveEndDate()).longValue());
        ((Calendar) (obj)).set(((Calendar) (obj)).get(1), ((Calendar) (obj)).get(2), ((Calendar) (obj)).get(5), 23, 59);
        viewholder.kohlsCashLogo.setVisibility(0);
        viewholder.setReminder.setVisibility(8);
        viewholder.setReminder.setOnClickListener(new _cls6(walletitemresponse));
        viewholder.itemState.setVisibility(4);
        if (TextUtils.isEmpty(walletitemresponse.getDisclaimer()))
        {
            viewholder.walletTerms.setText(Appconfig.discalimer);
        } else
        {
            viewholder.walletTerms.setText(walletitemresponse.getDisclaimer());
        }
        viewholder.promoCode.setVisibility(0);
        viewholder.promoCode.setText(walletitemresponse.getGiftCardNum());
        viewholder.promoCode.setPadding(mContext.getResources().getDimensionPixelSize(0x7f090131), 0, 0, 0);
        viewholder.walletTerms.setMovementMethod(new ScrollingMovementMethod());
        if (walletitemresponse.isNewItem() && walletitemresponse.isAnimationPending())
        {
            obj = new ScaleAnimation(1.0F, 1.0F, 0.0F, 1.0F);
            ((Animation) (obj)).setDuration(750L);
            view.startAnimation(((Animation) (obj)));
            walletitemresponse.setAnimationPending(false);
        }
        view = (android.widget.RelativeLayout.LayoutParams)viewholder.barcodePanel.getLayoutParams();
        view.addRule(13, -1);
        viewholder.barcodePanel.setLayoutParams(view);
        viewholder.title.setTextColor(resources.getColor(0x106000b));
        viewholder.cardFront.setVisibility(0);
        viewholder.barCodeId.setText(walletitemresponse.getId());
        viewholder.barCodeId.setTextSize(mContext.getResources().getDimension(0x7f090136));
        viewholder.pinNo.setText(walletitemresponse.getPin());
        viewholder.pinNo.setTextSize(mContext.getResources().getDimension(0x7f090136));
        viewholder.barCode.setImageBitmap((Bitmap)(new BarcodeCreator()).renderBarcode(walletitemresponse.getId(), mContext.getResources().getDimensionPixelSize(0x7f09012e), mContext.getResources().getDimensionPixelSize(0x7f09012c), 0xff000000).get());
    }

    private void setKohlsCashView(int i, ViewHolder viewholder, View view)
    {
        WalletItemResponse walletitemresponse = (WalletItemResponse)walletData.get(i);
        Object obj = mContext.getResources();
        Object obj1 = new DecimalFormat("0.00");
        Object obj2 = ((DecimalFormat) (obj1)).format(Double.valueOf(((WalletItemResponse)walletData.get(i)).getValue()));
        viewholder.title.setText((new StringBuilder()).append("$").append(((String) (obj2)).replaceFirst("\\.00+$", "")).append(" ").append("Kohl's Cash").toString());
        viewholder.walletDescTitle.setText((new StringBuilder()).append("$").append(((String) (obj2)).replaceFirst("\\.00+$", "")).append(" ").append("Kohl's Cash").toString());
        viewholder.imageBack.setImageResource(0x7f0200d7);
        viewholder.promoCode.setVisibility(4);
        ((DecimalFormat) (obj1)).format(Double.valueOf(((WalletItemResponse)walletData.get(i)).getValueAsOf()));
        obj1 = Calendar.getInstance(mCentralTimezone);
        ((Calendar) (obj1)).setTimeInMillis(Long.valueOf(walletitemresponse.getEffectiveEndDate()).longValue());
        ((Calendar) (obj1)).set(((Calendar) (obj1)).get(1), ((Calendar) (obj1)).get(2), ((Calendar) (obj1)).get(5), 23, 59);
        String s = DateUtils.getRelativeTimeSpanString(((Calendar) (obj1)).getTimeInMillis() + timeDifference, Calendar.getInstance().getTimeInMillis(), 0L).toString();
        obj2 = Calendar.getInstance(mCentralTimezone);
        ((Calendar) (obj2)).setTimeInMillis(Long.valueOf(walletitemresponse.getEffectiveStartDate()).longValue());
        String s1 = DateUtils.getRelativeTimeSpanString(((Calendar) (obj2)).getTimeInMillis() + timeDifference, Calendar.getInstance().getTimeInMillis(), 0L).toString();
        viewholder.kohlsCashLogo.setVisibility(0);
        boolean flag;
        if (walletitemresponse.getCouponState() == Constants.AVAILABLE.intValue() || walletitemresponse.getCouponState() == Constants.PENDING.intValue())
        {
            viewholder.setReminder.setVisibility(0);
        } else
        {
            viewholder.setReminder.setVisibility(8);
        }
        viewholder.setReminder.setOnClickListener(new _cls2(walletitemresponse));
        if (TextUtils.isEmpty(walletitemresponse.getDisclaimer()))
        {
            viewholder.walletTerms.setText(Appconfig.discalimer);
        } else
        {
            viewholder.walletTerms.setText(walletitemresponse.getDisclaimer());
        }
        viewholder.walletTerms.setMovementMethod(new ScrollingMovementMethod());
        if (walletitemresponse.isNewItem() && walletitemresponse.isAnimationPending())
        {
            ScaleAnimation scaleanimation = new ScaleAnimation(1.0F, 1.0F, 0.0F, 1.0F);
            scaleanimation.setDuration(750L);
            view.startAnimation(scaleanimation);
            walletitemresponse.setAnimationPending(false);
        }
        if (walletitemresponse.getCouponState() == Constants.EXPIRED.intValue() || s.contains(" ago"))
        {
            viewholder.expirationTime.setText((new StringBuilder()).append("Expired ").append(s).toString());
            viewholder.itemState.setText("Expired");
        } else
        if (walletitemresponse.getCouponState() == Constants.REDEEMED.intValue())
        {
            viewholder.itemState.setText("Redeemed");
            viewholder.expirationTime.setText("Redeemed ");
        } else
        if (s.contains(","))
        {
            if (walletitemresponse.getCouponState() == Constants.PENDING.intValue())
            {
                viewholder.itemState.setText("Pending");
                viewholder.expirationTime.setText((new StringBuilder()).append("Available ").append(s1).toString());
            } else
            {
                viewholder.expirationTime.setText((new StringBuilder()).append("Expires ").append(s).toString());
                viewholder.itemState.setText("Available");
            }
            if (walletitemresponse.getTypeCode().equals("kohlscash"))
            {
                viewholder.title.setTextColor(((Resources) (obj)).getColor(0x106000b));
            } else
            if (walletitemresponse.getTypeCode().equals("loyalty"))
            {
                viewholder.expirationTime.setText((new StringBuilder()).append("Expires ").append(s).toString());
            }
        } else
        {
            if (walletitemresponse.getCouponState() == Constants.PENDING.intValue())
            {
                viewholder.expirationTime.setText((new StringBuilder()).append("Available ").append(s1).toString());
                viewholder.itemState.setText("Pending");
            } else
            {
                viewholder.expirationTime.setText((new StringBuilder()).append("Expires ").append(s).toString());
                viewholder.itemState.setText("Available");
            }
            if (walletitemresponse.getTypeCode().equals("kohlscash"))
            {
                viewholder.title.setTextColor(((Resources) (obj)).getColor(0x106000b));
            } else
            if (walletitemresponse.getTypeCode().equals("loyalty"))
            {
                viewholder.expirationTime.setText((new StringBuilder()).append("Expires ").append(s).toString());
                viewholder.itemState.setText("Available");
            }
            viewholder.promoCode.setText("Please present barcode at checkout");
        }
        if (walletitemresponse.getTypeCode().equals("loyalty"))
        {
            viewholder.parent.setBackgroundResource(0x7f020047);
            viewholder.descback.setBackgroundResource(0x7f020047);
            viewholder.cardtitleback.setBackgroundResource(0x7f020048);
            viewholder.footer.setImageResource(0x7f020046);
            viewholder.imageBack.setImageResource(0x7f020104);
            viewholder.kohlsCashLogo.setImageResource(0x7f020104);
        } else
        if (walletitemresponse.getTypeCode().equals("kohlscash"))
        {
            viewholder.imageBack.setImageResource(0x7f0200d7);
            viewholder.kohlsCashLogo.setImageResource(0x7f0200d7);
            viewholder.footer.setImageResource(0x7f0200d2);
        }
        viewholder.cardFront.setVisibility(0);
        flag = walletitemresponse.isShortTermOffer();
        view = new SimpleDateFormat("MMMM d, yyyy");
        view.setTimeZone(TimeZone.getTimeZone("US/Central"));
        obj = view.format(((Calendar) (obj2)).getTime());
        view = view.format(((Calendar) (obj1)).getTime());
        if (flag)
        {
            viewholder.expiryDate.setText((new StringBuilder()).append(((String) (obj))).append(" to ").append(view).toString());
        } else
        {
            viewholder.expiryDate.setText((new StringBuilder()).append(((String) (obj))).append(" - ").append(view).toString());
        }
        viewholder.barCodeId.setText(walletitemresponse.getId());
        viewholder.pinNo.setText(Appconfig.generatePinWithBarcodeNumber(walletitemresponse.getId()));
        if (viewholder.expirationTime.getText().toString().toLowerCase().contains("expires"))
        {
            viewholder.barCode.setImageBitmap((Bitmap)(new BarcodeCreator()).renderBarcode(walletitemresponse.getId(), mContext.getResources().getDimensionPixelSize(0x7f09012e), mContext.getResources().getDimensionPixelSize(0x7f09012c), 0xff000000).get());
        } else
        {
            viewholder.barCode.setImageBitmap((Bitmap)(new BarcodeCreator()).renderBarcode(walletitemresponse.getId(), mContext.getResources().getDimensionPixelSize(0x7f09012e), mContext.getResources().getDimensionPixelSize(0x7f09012c), 0xffcccccc).get());
        }
        viewholder.expirationTime_back.setText(viewholder.expirationTime.getText());
    }

    private void setOffersView(int i, ViewHolder viewholder, View view)
    {
        WalletItemResponse walletitemresponse = (WalletItemResponse)walletData.get(i);
        Resources resources = mContext.getResources();
        Calendar calendar = Calendar.getInstance(mCentralTimezone);
        calendar.setTimeInMillis(Long.valueOf(walletitemresponse.getEffectiveEndDate()).longValue());
        String s1 = DateUtils.getRelativeTimeSpanString(calendar.getTimeInMillis() + timeDifference, Calendar.getInstance().getTimeInMillis(), 0L).toString();
        Calendar calendar1 = Calendar.getInstance(mCentralTimezone);
        calendar1.setTimeInMillis(Long.valueOf(walletitemresponse.getEffectiveStartDate()).longValue());
        String s = DateUtils.getRelativeTimeSpanString(calendar1.getTimeInMillis() + timeDifference, Calendar.getInstance().getTimeInMillis(), 0L).toString();
        viewholder.title.setSelected(true);
        viewholder.walletDescTitle.setSelected(true);
        boolean flag;
        if (!TextUtils.isEmpty(walletitemresponse.getDescription()))
        {
            viewholder.walletDescTitle.setText(walletitemresponse.getDescription());
            viewholder.title.setText(walletitemresponse.getDescription());
        } else
        {
            viewholder.title.setText(walletitemresponse.getPromoCode());
            viewholder.walletDescTitle.setText(walletitemresponse.getPromoCode());
        }
        viewholder.setReminder.setVisibility(8);
        viewholder.promoCode.setVisibility(0);
        viewholder.kohlsCashLogo.setVisibility(8);
        viewholder.imageBack.setImageResource(0x7f0201a6);
        if (TextUtils.isEmpty(walletitemresponse.getDisclaimer()))
        {
            viewholder.walletTerms.setText(Appconfig.discalimer);
        } else
        {
            viewholder.walletTerms.setText(walletitemresponse.getDisclaimer());
        }
        viewholder.walletTerms.setMovementMethod(new ScrollingMovementMethod());
        if (walletitemresponse.isShortTermOffer())
        {
            s1 = DateUtils.getRelativeTimeSpanString(Long.valueOf(walletitemresponse.getEffectiveEndDate()).longValue(), Calendar.getInstance().getTimeInMillis(), 0L).toString();
        }
        if (walletitemresponse.isNewItem() && walletitemresponse.isAnimationPending())
        {
            ScaleAnimation scaleanimation = new ScaleAnimation(1.0F, 1.0F, 0.0F, 1.0F);
            scaleanimation.setDuration(750L);
            view.startAnimation(scaleanimation);
            walletitemresponse.setAnimationPending(false);
        }
        if (walletitemresponse.getCouponState() == Constants.EXPIRED.intValue() || s1.contains(" ago"))
        {
            viewholder.expirationTime.setText((new StringBuilder()).append("Expired ").append(s1).toString());
            viewholder.itemState.setText("Expired");
        } else
        if (walletitemresponse.getCouponState() == Constants.REDEEMED.intValue())
        {
            viewholder.expirationTime.setText("Redeemed ");
            viewholder.itemState.setText("Redeemed");
        } else
        if (s1.contains(","))
        {
            if (walletitemresponse.getCouponState() == Constants.PENDING.intValue())
            {
                if (walletitemresponse.isShortTermOffer())
                {
                    s = DateUtils.getRelativeTimeSpanString(Long.valueOf(walletitemresponse.getEffectiveStartDate()).longValue(), Calendar.getInstance().getTimeInMillis(), 0L).toString();
                }
                viewholder.expirationTime.setText((new StringBuilder()).append("Available ").append(s).toString());
                viewholder.itemState.setText("Pending");
            } else
            {
                viewholder.expirationTime.setText((new StringBuilder()).append("Expires ").append(s1).toString());
                viewholder.itemState.setText("Available");
            }
            viewholder.title.setTextColor(resources.getColor(0x106000b));
        } else
        {
            if (walletitemresponse.getCouponState() == Constants.PENDING.intValue())
            {
                if (walletitemresponse.isShortTermOffer())
                {
                    s = DateUtils.getRelativeTimeSpanString(Long.valueOf(walletitemresponse.getEffectiveStartDate()).longValue(), Calendar.getInstance().getTimeInMillis(), 0L).toString();
                }
                viewholder.expirationTime.setText((new StringBuilder()).append("Available ").append(s).toString());
                viewholder.itemState.setText("Pending");
            } else
            {
                viewholder.expirationTime.setText((new StringBuilder()).append("Expires ").append(s1).toString());
                viewholder.itemState.setText("Available");
            }
            viewholder.title.setTextColor(resources.getColor(0x106000b));
        }
        flag = walletitemresponse.isShortTermOffer();
        if (flag)
        {
            view = new SimpleDateFormat("hh:mm a (z) MMMM d, yyyy");
        } else
        {
            view = new SimpleDateFormat("MMMM d, yyyy");
            view.setTimeZone(mCentralTimezone);
        }
        s = view.format(calendar1.getTime());
        if (walletitemresponse.isShortTermOffer())
        {
            s = view.format(Long.valueOf(walletitemresponse.getEffectiveStartDate()));
        }
        s1 = view.format(calendar.getTime());
        if (walletitemresponse.isShortTermOffer())
        {
            s1 = view.format(Long.valueOf(walletitemresponse.getEffectiveEndDate()));
        }
        if (flag)
        {
            viewholder.expiryDate.setText((new StringBuilder()).append(s).append(" to ").append(s1).toString());
        } else
        {
            viewholder.expiryDate.setText((new StringBuilder()).append(s).append(" - ").append(s1).toString());
        }
        viewholder.barCodeId.setText(walletitemresponse.getId());
        viewholder.pinNo.setText(Appconfig.generatePinWithBarcodeNumber(walletitemresponse.getId()));
        if (viewholder.expirationTime.getText().toString().toLowerCase().contains("expires"))
        {
            viewholder.barCode.setImageBitmap((Bitmap)(new BarcodeCreator()).renderBarcode(walletitemresponse.getId(), mContext.getResources().getDimensionPixelSize(0x7f09012e), mContext.getResources().getDimensionPixelSize(0x7f09012c), 0xff000000).get());
        } else
        {
            viewholder.barCode.setImageBitmap((Bitmap)(new BarcodeCreator()).renderBarcode(walletitemresponse.getId(), mContext.getResources().getDimensionPixelSize(0x7f09012e), mContext.getResources().getDimensionPixelSize(0x7f09012c), 0xffcccccc).get());
        }
        viewholder.promoCode.setText((new StringBuilder()).append("Use Promo Code: ").append(walletitemresponse.getPromoCode()).toString());
        if (walletitemresponse.getShareable())
        {
            viewholder.facebookShareBtn.setVisibility(0);
        } else
        {
            viewholder.facebookShareBtn.setVisibility(4);
        }
        viewholder.facebookShareBtn.setClickable(true);
        view = walletitemresponse.getDescription();
        viewholder.facebookShareBtn.setOnClickListener(new _cls1(view, i));
        viewholder.expirationTime_back.setText(viewholder.expirationTime.getText());
    }

    public void destroyItem(View view, int i, Object obj)
    {
        ((ViewPager)view).removeView((View)obj);
    }

    public int getCount()
    {
        return walletData.size();
    }

    public int getItemPosition(Object obj)
    {
        return -2;
    }

    public List getWalletData()
    {
        return walletData;
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        View view;
        ViewHolder viewholder;
        view = ((LayoutInflater)mContext.getSystemService("layout_inflater")).inflate(0x7f030115, viewgroup, false);
        viewholder = new ViewHolder(view, null);
        if (mPosition != Constants.POSITION_OF_CASH_TAB_IN_WALLET) goto _L2; else goto _L1
_L1:
        setKohlsCashView(i, viewholder, view);
_L4:
        ((ViewPager)viewgroup).addView(view, 0);
        if (mViewPager == null)
        {
            mViewPager = (ViewPager)viewgroup;
        }
        viewholder.closebtn.setOnClickListener(new _cls3(viewholder, i));
        viewholder.deleteItem.setOnClickListener(new _cls4(view, viewholder, i));
        viewholder.cardFlipButton.setOnClickListener(new _cls5(viewholder, view, i));
        return view;
_L2:
        if (mPosition == Constants.POSITION_OF_OFFERS_TAB_IN_WALLET)
        {
            setOffersView(i, viewholder, view);
        } else
        if (mPosition == Constants.POSITION_OF_GIFTCARD_TAB_IN_WALLET)
        {
            setGiftCard(i, viewholder, view);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == (View)obj;
    }




    // Unreferenced inner class com/kohls/mcommerce/opal/wallet/adapter/WalletAdapter$DeleteWalletItemAsyncTask
    /* block-local class not found */
    class DeleteWalletItemAsyncTask {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls9 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}

}

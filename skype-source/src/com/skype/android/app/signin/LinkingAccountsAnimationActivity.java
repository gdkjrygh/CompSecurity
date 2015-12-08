// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.Account;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.HttpUtil;
import com.skype.android.widget.CircleImageView;
import com.skype.android.widget.animator.BezierEasingInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingAbstractActivity, LinkingAccountsItem, LinkingUtil, LinkingDoneActivity, 
//            LiveIdWebClient

public class LinkingAccountsAnimationActivity extends LinkingAbstractActivity
    implements android.os.Handler.Callback, android.view.View.OnClickListener
{
    private final class a
    {

        private LinkingAccountsAnimationActivity activity;
        private AnimatorSet finishAnimatorSet;
        float finishButtonPositions[];
        float finishIconPositions[];
        float finishIconScaleX[];
        float finishIconScaleY[];
        float finishNamePositions[];
        float finishTextPositions[];
        float finishTitlePositions[];
        float finishVisibility[];
        private AnimatorSet loopAnimatorSet;
        float textVisibility[];
        final LinkingAccountsAnimationActivity this$0;

        private void buildFinishAnimation()
        {
            AnimatorSet animatorset = new AnimatorSet();
            Object obj = getResources();
            float f = ((Resources) (obj)).getDimension(0x7f0c0040) + (float)msaAvatarImg.getDrawable().getIntrinsicHeight() / 2.0F;
            obj = ((Resources) (obj)).getDisplayMetrics();
            finishIconPositions = (new float[] {
                0.0F, 20F * ((DisplayMetrics) (obj)).density, f, f, f
            });
            finishIconScaleX = (new float[] {
                1.0F, 0.98F, 1.16F, 1.65F, 1.54F
            });
            finishIconScaleY = (new float[] {
                1.0F, 1.02F, 1.04F, 1.65F, 1.54F
            });
            textVisibility = (new float[] {
                1.0F, 1.0F, 0.0F, 0.0F, 0.0F
            });
            finishVisibility = (new float[] {
                0.0F, 0.0F, 0.0F, 1.0F, 1.0F
            });
            finishTextPositions = (new float[] {
                0.0F, 10F * ((DisplayMetrics) (obj)).density, 55F * ((DisplayMetrics) (obj)).density, 55F * ((DisplayMetrics) (obj)).density, 55F * ((DisplayMetrics) (obj)).density
            });
            finishTitlePositions = (new float[] {
                0.0F, 0.0F, -2F * ((DisplayMetrics) (obj)).density, -5F * ((DisplayMetrics) (obj)).density, 0.0F
            });
            finishButtonPositions = (new float[] {
                0.0F, 0.0F, 5F * ((DisplayMetrics) (obj)).density, 12F * ((DisplayMetrics) (obj)).density, 0.0F
            });
            finishNamePositions = (new float[] {
                0.0F, 0.0F, -6F * ((DisplayMetrics) (obj)).density, 7F * ((DisplayMetrics) (obj)).density, 0.0F
            });
            long al[] = new long[5];
            long[] _tmp = al;
            al[0] = 500L;
            al[1] = 1530L;
            al[2] = 300L;
            al[3] = 40L;
            al[4] = 530L;
            float af[] = finishTextPositions;
            float af1[] = finishIconPositions;
            float af2[] = textVisibility;
            float af3[] = finishIconScaleX;
            float af4[] = finishIconScaleY;
            float af5[] = finishVisibility;
            float af6[] = finishTitlePositions;
            float af7[] = finishButtonPositions;
            float af8[] = finishNamePositions;
            Interpolator ainterpolator[] = new Interpolator[5];
            ainterpolator[0] = null;
            ainterpolator[1] = new BezierEasingInterpolator(0.33F, 0.0F, 1.0F, al[1]);
            ainterpolator[2] = new BezierEasingInterpolator(1.0F, 0.78F, 1.0F, al[2]);
            ainterpolator[3] = new BezierEasingInterpolator(0.33F, 0.67F, 1.0F, al[3]);
            ainterpolator[4] = new BezierEasingInterpolator(0.33F, 0.0F, 1.0F, al[4]);
            Interpolator interpolator = ainterpolator[1];
            BezierEasingInterpolator beziereasinginterpolator = new BezierEasingInterpolator(1.0F, 0.4F, 1.0F, al[2]);
            Interpolator interpolator1 = ainterpolator[3];
            Interpolator interpolator2 = ainterpolator[4];
            chainAnimations(animatorset, new float[][] {
                af, af1, af2, af3, af4, af5, af6, af7, af8
            }, new String[] {
                "topTextTranslateY", "topCircleTranslateY", "textVisibility", "circleScaleX", "circleScaleY", "finishVisibility", "finishTitlePositions", "finishButtonPositions", "finishNamePositions"
            }, al, new Interpolator[][] {
                new Interpolator[] {
                    null, interpolator, beziereasinginterpolator, interpolator1, interpolator2
                }, ainterpolator, ainterpolator, ainterpolator, ainterpolator, ainterpolator, ainterpolator, ainterpolator, ainterpolator
            });
            animatorset.addListener(new android.animation.Animator.AnimatorListener() {

                final a this$1;

                public final void onAnimationCancel(Animator animator)
                {
                }

                public final void onAnimationEnd(Animator animator)
                {
                }

                public final void onAnimationRepeat(Animator animator)
                {
                }

                public final void onAnimationStart(Animator animator)
                {
                }

            
            {
                this$1 = a.this;
                super();
            }
            });
            finishAnimatorSet = animatorset;
        }

        private void buildLoopAnimation()
        {
            Object obj = getResources().getDisplayMetrics();
            long al[] = new long[5];
            long[] _tmp = al;
            al[0] = 500L;
            al[1] = 1530L;
            al[2] = 140L;
            al[3] = 430L;
            al[4] = 570L;
            BezierEasingInterpolator beziereasinginterpolator = new BezierEasingInterpolator(0.0F, 0.0F, 0.0F, al[0]);
            BezierEasingInterpolator beziereasinginterpolator1 = new BezierEasingInterpolator(0.33F, 0.0F, 1.0F, al[1]);
            BezierEasingInterpolator beziereasinginterpolator2 = new BezierEasingInterpolator(1.0F, 0.4F, 1.0F, al[2]);
            BezierEasingInterpolator beziereasinginterpolator3 = new BezierEasingInterpolator(1.0F, 0.78F, 1.0F, al[3]);
            BezierEasingInterpolator beziereasinginterpolator4 = new BezierEasingInterpolator(0.33F, 0.0F, 1.0F, al[4]);
            float f = ((DisplayMetrics) (obj)).density;
            float f1 = ((DisplayMetrics) (obj)).density;
            float f2 = ((DisplayMetrics) (obj)).density;
            float af[] = {
                0.0F, 10F * ((DisplayMetrics) (obj)).density, 10F * ((DisplayMetrics) (obj)).density, -6F * ((DisplayMetrics) (obj)).density, 0.0F
            };
            float af1[] = {
                1.0F, 0.98F, 0.98F, 1.0F, 1.0F
            };
            float af2[] = {
                1.0F, 1.02F, 1.02F, 1.0F, 1.0F
            };
            obj = new AnimatorSet();
            chainAnimations(((AnimatorSet) (obj)), new float[][] {
                af, new float[] {
                    0.0F, 20F * f, 20F * f1, -8F * f2, 0.0F
                }, af1, af2
            }, new String[] {
                "topTextTranslateY", "topCircleTranslateY", "circleScaleX", "circleScaleY"
            }, al, new BezierEasingInterpolator[][] {
                new BezierEasingInterpolator[] {
                    beziereasinginterpolator, beziereasinginterpolator1, beziereasinginterpolator2, beziereasinginterpolator3, beziereasinginterpolator4
                }
            });
            ((AnimatorSet) (obj)).addListener(new android.animation.Animator.AnimatorListener() {

                final a this$1;

                public final void onAnimationCancel(Animator animator)
                {
                }

                public final void onAnimationEnd(Animator animator)
                {
                    if (!loggedIn)
                    {
                        loopAnimatorSet.start();
                        return;
                    } else
                    {
                        setAvatarPositions();
                        finishAnimatorSet.start();
                        return;
                    }
                }

                public final void onAnimationRepeat(Animator animator)
                {
                }

                public final void onAnimationStart(Animator animator)
                {
                    setAvatarPositions();
                }

            
            {
                this$1 = a.this;
                super();
            }
            });
            loopAnimatorSet = ((AnimatorSet) (obj));
        }

        private void chainAnimations(AnimatorSet animatorset, float af[][], String as[], long al[], Interpolator ainterpolator[][])
        {
            ArrayList arraylist = new ArrayList();
            int l = af[0].length;
            for (int i = 0; i < l; i++)
            {
                ArrayList arraylist1 = new ArrayList();
                int i1 = af.length;
                int j;
                int k;
                if (i <= 0)
                {
                    j = 0;
                } else
                {
                    j = i - 1;
                }
                k = 0;
                while (k < i1) 
                {
                    float f;
                    float f1;
                    Interpolator interpolator;
                    String s;
                    long l1;
                    if (ainterpolator.length > 1)
                    {
                        interpolator = ainterpolator[k][i];
                    } else
                    {
                        interpolator = ainterpolator[0][i];
                    }
                    s = as[k];
                    f = af[k][j];
                    f1 = af[k][i];
                    l1 = al[i];
                    if (i == 0 || f != f1)
                    {
                        arraylist1.add(createAnimator(s, f, f1, l1, interpolator));
                    }
                    k++;
                }
                arraylist.add(arraylist1);
            }

            as = null;
            al = arraylist.iterator();
            do
            {
label0:
                {
                    if (!al.hasNext())
                    {
                        break label0;
                    }
                    af = (ArrayList)al.next();
                    boolean flag = true;
                    ainterpolator = af.iterator();
                    af = as;
                    do
                    {
                        as = af;
                        if (!ainterpolator.hasNext())
                        {
                            break;
                        }
                        Animator animator = (Animator)ainterpolator.next();
                        as = af;
                        if (flag)
                        {
                            as = af;
                            if (af != null)
                            {
                                af.before(animator);
                                as = null;
                            }
                        }
                        flag = false;
                        if (as == null)
                        {
                            af = animatorset.play(animator);
                        } else
                        {
                            af = as.with(animator);
                        }
                    } while (true);
                }
            } while (true);
        }

        private Animator createAnimator(String s, float f, float f1, long l, Interpolator interpolator)
        {
            s = ObjectAnimator.ofFloat(activity, s, new float[] {
                f, f1
            });
            s.setDuration(l);
            s.setInterpolator(interpolator);
            return s;
        }

        private void playAnimation()
        {
            if (android.os.Build.VERSION.SDK_INT >= 12)
            {
                if (loopAnimatorSet != null)
                {
                    loopAnimatorSet.cancel();
                    loopAnimatorSet.start();
                }
                if (finishAnimatorSet != null)
                {
                    finishAnimatorSet.cancel();
                }
            }
        }

        public final void goToFinishPositions()
        {
            loopAnimatorSet.setupEndValues();
            finishAnimatorSet.setupEndValues();
        }




        a(LinkingAccountsAnimationActivity linkingaccountsanimationactivity1)
        {
            this$0 = LinkingAccountsAnimationActivity.this;
            super();
            activity = linkingaccountsanimationactivity1;
            buildLoopAnimation();
            buildFinishAnimation();
        }
    }


    private static final String SIGNINWITHMSA_KEY = "signInWithMsaKey";
    private static final int WHAT_ANIMATION_SUPPORTED = 1;
    a animationBuilder;
    Button button;
    private ImageView frontmostImg;
    private Handler handler;
    HttpUtil httpUtil;
    TextView linkingDoneText;
    TextView linkingTitleText;
    LinkingUtil linkingUtil;
    private boolean loggedIn;
    TextView mergedAccountText;
    TextView mergedFullnameText;
    private ArrayList microsoftAccounts;
    TextView msaAccountText;
    CircleImageView msaAvatarImg;
    TextView msaFullnameText;
    private ImageView rearmostImg;
    private boolean signInWithMsaDone;
    TextView skypeAccountText;
    Bitmap skypeAvatarBitmap;
    CircleImageView skypeAvatarImg;
    TextView skypeFullnameText;
    LinkingAccountsItem suggestedAccount;
    private ArrayList suggestedAccounts;
    private LiveIdWebClient webClient;
    View whiteBackground;

    public LinkingAccountsAnimationActivity()
    {
        loggedIn = false;
    }

    private void displayMicrosoftAccounts(ArrayList arraylist)
    {
        arraylist = (LinkingAccountsItem)arraylist.get(0);
        String s = arraylist.getAvatar();
        if (s != null)
        {
            linkingUtil.showMsaAvatar(webClient, s, msaAvatarImg);
        }
        s = arraylist.getFullname();
        msaFullnameText.setText(s);
        mergedFullnameText.setText(s);
        arraylist = arraylist.getAccount();
        msaAccountText.setText(arraylist);
        mergedAccountText.setText(arraylist);
    }

    private void displaySuggestedAccounts(ArrayList arraylist)
    {
        String s1;
        suggestedAccount = (LinkingAccountsItem)arraylist.get(0);
        arraylist = suggestedAccount.getAvatar();
        s1 = suggestedAccount.getAccount();
        if (TextUtils.isEmpty(arraylist)) goto _L2; else goto _L1
_L1:
        linkingUtil.showSkypeAvatar(arraylist, skypeAvatarImg);
_L4:
        String s = suggestedAccount.getFullname();
        arraylist = s;
        if (TextUtils.isEmpty(s))
        {
            arraylist = account.getFullnameProp();
        }
        skypeFullnameText.setText(arraylist);
        skypeAccountText.setText(s1);
        return;
_L2:
        if (account != null)
        {
            if (!TextUtils.isEmpty(account.getSkypenameProp()))
            {
                linkingUtil.showSkypeAvatar(account, skypeAvatarImg);
            } else
            if (!TextUtils.isEmpty(s1))
            {
                skypeAvatarBitmap = linkingUtil.getBitmap(s1);
                if (skypeAvatarBitmap != null)
                {
                    skypeAvatarImg.setImageBitmap(skypeAvatarBitmap);
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void goToNext()
    {
        Intent intent;
        intent = new Intent(this, com/skype/android/app/signin/LinkingDoneActivity);
        intent.putParcelableArrayListExtra("microsoftAccounts", microsoftAccounts);
        intent.putExtra("accessToken", skypeAccessToken);
        intent.putExtra("refreshToken", refreshToken);
        if (TextUtils.isEmpty(account.getSkypenameProp())) goto _L2; else goto _L1
_L1:
        intent.putExtra("username", account.getSkypenameProp());
_L4:
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
        overridePendingTransition(0, 0);
        return;
_L2:
        if (suggestedAccount != null)
        {
            intent.putExtra("username", suggestedAccount.getAccount());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void setAvatarPositions()
    {
        boolean flag = linkingUtil.isDefaultAvatar(skypeAvatarImg, ((LinkingAccountsItem)suggestedAccounts.get(0)).getAvatar());
        boolean flag1 = linkingUtil.isDefaultAvatar(msaAvatarImg, ((LinkingAccountsItem)microsoftAccounts.get(0)).getAvatar());
        if (flag || !flag1)
        {
            frontmostImg = skypeAvatarImg;
            rearmostImg = msaAvatarImg;
        } else
        {
            frontmostImg = msaAvatarImg;
            rearmostImg = skypeAvatarImg;
        }
        frontmostImg.bringToFront();
        frontmostImg.requestLayout();
    }

    public boolean handleLoggedIn()
    {
        if (animationBuilder == null)
        {
            goToNext();
            return true;
        } else
        {
            loggedIn = true;
            return super.handleLoggedIn();
        }
    }

    public boolean handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 26;
           goto _L1 _L2
_L1:
        return true;
_L2:
        if (animationBuilder != null)
        {
            if (loggedIn)
            {
                animationBuilder.goToFinishPositions();
            } else
            {
                animationBuilder.playAnimation();
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void nextIntent()
    {
        throw new RuntimeException("Not implemented!!!");
    }

    public void onClick(View view)
    {
        navigation.home();
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        button.setOnClickListener(this);
        int i = getResources().getConfiguration().orientation;
        if (!layoutExperience.isMultipane() && i == 2)
        {
            setRequestedOrientation(7);
        }
        signInWithMsaDone = false;
        handler = new Handler(this);
        skypeAccessToken = getIntent().getStringExtra("accessToken");
        webClient = new LiveIdWebClient(skypeAccessToken, configuration.getMSALoginScope(), httpUtil);
        refreshToken = getIntent().getStringExtra("refreshToken");
        loginAccessToken = getIntent().getStringExtra("loginAccessToken");
        suggestedAccounts = getIntent().getParcelableArrayListExtra("suggestedAccounts");
        microsoftAccounts = getIntent().getParcelableArrayListExtra("microsoftAccounts");
        if (android.os.Build.VERSION.SDK_INT >= 12 && android.os.Build.VERSION.SDK_INT < 19 && !Build.HARDWARE.equalsIgnoreCase("SQW100-1") && !Build.HARDWARE.equalsIgnoreCase("SQN100-1") && !Build.HARDWARE.equalsIgnoreCase("SQC100-4") && !Build.HARDWARE.equalsIgnoreCase("SQR100-1"))
        {
            animationBuilder = new a(this);
        } else
        {
            mergedFullnameText.setVisibility(8);
            mergedAccountText.setVisibility(8);
            button.setVisibility(8);
            linkingDoneText.setVisibility(8);
        }
        if (bundle != null)
        {
            signInWithMsaDone = bundle.getBoolean("signInWithMsaKey");
        }
        if (!signInWithMsaDone)
        {
            signInWithMsa();
            signInWithMsaDone = true;
            return;
        } else
        {
            account = accountProvider.get();
            return;
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnAccountAvatarResult onaccountavatarresult)
    {
        if (onaccountavatarresult.getCode() == com.skype.SkyLib.AUTH_RESULT.AUTH_OK && skypeAvatarBitmap == null && suggestedAccount != null)
        {
            String s = suggestedAccount.getAccount();
            if (!TextUtils.isEmpty(s))
            {
                skypeAvatarBitmap = linkingUtil.retrieveSkypeAvatar(s, onaccountavatarresult.getData());
                if (skypeAvatarBitmap != null)
                {
                    skypeAvatarImg.setImageBitmap(skypeAvatarBitmap);
                }
            }
        }
    }

    protected void onLoggedIn()
    {
    }

    public void onResume()
    {
        super.onResume();
        displaySuggestedAccounts(suggestedAccounts);
        displayMicrosoftAccounts(microsoftAccounts);
        handler.sendMessage(handler.obtainMessage(1));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("signInWithMsaKey", signInWithMsaDone);
        super.onSaveInstanceState(bundle);
    }

    public void setCircleScaleX(float f)
    {
        msaAvatarImg.setScaleX(f);
        skypeAvatarImg.setScaleX(f);
    }

    public void setCircleScaleY(float f)
    {
        msaAvatarImg.setScaleY(f);
        skypeAvatarImg.setScaleY(f);
    }

    public void setFinishButtonPositions(float f)
    {
        button.setTranslationY(f);
    }

    public void setFinishNamePositions(float f)
    {
        mergedFullnameText.setTranslationY(f);
        mergedAccountText.setTranslationY(f);
    }

    public void setFinishTitlePositions(float f)
    {
        linkingDoneText.setTranslationY(f);
    }

    public void setFinishVisibility(float f)
    {
        float f1 = 1.0F - f;
        rearmostImg.setAlpha(f1);
        linkingTitleText.setAlpha(f1);
        linkingDoneText.setAlpha(f);
        whiteBackground.setAlpha(f1);
        button.setAlpha(f);
        mergedFullnameText.setAlpha(f);
        mergedAccountText.setAlpha(f);
    }

    public void setTextVisibility(float f)
    {
        msaFullnameText.setAlpha(f);
        msaAccountText.setAlpha(f);
        skypeFullnameText.setAlpha(f);
        skypeAccountText.setAlpha(f);
    }

    public void setTopCircleTranslateY(float f)
    {
        msaAvatarImg.setTranslationY(f);
        skypeAvatarImg.setTranslationY(-1F * f);
    }

    public void setTopTextTranslateY(float f)
    {
        msaAccountText.setTranslationY(f);
        msaFullnameText.setTranslationY(f);
        f *= -1F;
        skypeFullnameText.setTranslationY(f);
        skypeAccountText.setTranslationY(f);
        mergedFullnameText.setTranslationY(f);
        mergedAccountText.setTranslationY(f);
    }


}

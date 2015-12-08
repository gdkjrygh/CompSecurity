// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.security;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.EnterpriseMobileBanking.AppHeaderTouchHandler;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.AppRelContainer;
import com.EnterpriseMobileBanking.EnterpriseMobileBanking;
import com.EnterpriseMobileBanking.Plugins.Components.AppHeader;
import com.EnterpriseMobileBanking.Plugins.Components.MenuBuilder;
import com.EnterpriseMobileBanking.Plugins.Components.MenuItem;
import com.EnterpriseMobileBanking.Utils.Log;
import com.EnterpriseMobileBanking.Utils.MenuItemSingleton;
import com.capitalone.mobile.banking.session.TimeoutBroadcastReceiver;
import group.pals.android.lib.ui.lockpattern.BaseLockPatternActivity;
import group.pals.android.lib.ui.lockpattern.widget.LockPatternUtils;
import group.pals.android.lib.ui.lockpattern.widget.LockPatternView;
import java.util.List;

// Referenced classes of package com.capitalone.mobile.banking.security:
//            ExpressSignInHelpActivity

public class LockPatternActivity extends BaseLockPatternActivity
    implements com.EnterpriseMobileBanking.Utils.MenuItemSingleton.ChangeListener
{

    private static final int EXPRESS_SIGN_IN_HELP_REQUEST_CODE = 0x4c2ac11;
    private static String TAG = "LockPatternActivity";
    private static Animation anims[] = new Animation[2];
    protected View MenuContainer;
    private View MenuList;
    private MenuBuilder adapter;
    private AppHeader appHeader;
    private String isSlideUpOffer;
    private int lclResultCode;
    private final android.view.View.OnClickListener mBtnConfirmOnClickListener = new android.view.View.OnClickListener() ;
    private final android.view.View.OnClickListener mBtnPasswordSignInOnClickListener = new android.view.View.OnClickListener() {

        final LockPatternActivity this$0;

        public void onClick(View view)
        {
            finish();
        }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
    };
    private final android.view.View.OnClickListener mBtnPatternHelpOnClickListener = new android.view.View.OnClickListener() {

        final LockPatternActivity this$0;

        public void onClick(View view)
        {
            view = new Intent(LockPatternActivity.this, com/capitalone/mobile/banking/security/ExpressSignInHelpActivity);
            startActivityForResult(view, 0x4c2ac11);
        }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
    };
    private String patternMode;
    protected View relContainer;
    private String strMode;

    public LockPatternActivity()
    {
    }

    private void handleNavigationSideMenu(View view)
    {
        int i = 1;
        Log.d(TAG, (new StringBuilder()).append("AAA contentContainer getLeft = ").append(relContainer.getLeft()).toString());
        boolean flag;
        if (relContainer.getLeft() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = anims;
        if (flag)
        {
            i = 0;
        }
        view = view[i];
        if (flag)
        {
            i = 240;
        } else
        {
            i = 0;
        }
        AppHelper.setLastMovement(i);
        AppHelper.supressClick(flag);
        if (getCurrentFocus() != null)
        {
            getCurrentFocus().clearFocus();
        }
        MenuContainer.setVisibility(0);
        view.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final LockPatternActivity this$0;

            public void onAnimationEnd(Animation animation)
            {
                animation = new android.widget.RelativeLayout.LayoutParams(relContainer.getLayoutParams());
                int j = (int)((float)AppHelper.getLastMovement() * AppHelper.getDensity());
                Object obj = MenuContainer;
                Object obj1;
                String s;
                byte byte0;
                if (j == 0)
                {
                    byte0 = 4;
                } else
                {
                    byte0 = 0;
                }
                ((View) (obj)).setVisibility(byte0);
                animation.setMargins(j, 0, -j, 0);
                relContainer.setLayoutParams(animation);
                relContainer.setTag(null);
                s = getResources().getString(0x7f090128);
                obj1 = getResources().getString(0x7f090129);
                obj = obj1;
                animation = s;
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    animation = (new StringBuilder()).append(s).append(" ").append(getResources().getString(0x7f09012e)).toString();
                    obj = (new StringBuilder()).append(((String) (obj1))).append(" ").append(getResources().getString(0x7f09012e)).toString();
                }
                obj1 = findViewById(0x7f080020);
                if (j != 0)
                {
                    animation = ((Animation) (obj));
                }
                ((View) (obj1)).setContentDescription(animation);
                if (j != 0)
                {
                    relContainer.postDelayed(new Runnable() {

                        final _cls22 this$1;

                        public void run()
                        {
                            AppHelper.hideKeyboard();
                        }

            
            {
                this$1 = _cls22.this;
                super();
            }
                    }, 250L);
                }
                relContainer.postDelayed(new Runnable() {

                    final _cls22 this$1;

                    public void run()
                    {
                        MenuList.requestFocus();
                    }

            
            {
                this$1 = _cls22.this;
                super();
            }
                }, 300L);
                animation = new TranslateAnimation(0.0F, 0.0F, 0.0F, 0.0F);
                animation.setDuration(1L);
                relContainer.startAnimation(animation);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
        });
        relContainer.startAnimation(view);
    }

    private void setupMenuList()
    {
        ListView listview = (ListView)findViewById(0x7f0800b0);
        adapter = new MenuBuilder(getBaseContext(), getLayoutInflater(), MenuItemSingleton.getInstance().getItems());
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final LockPatternActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
label0:
                {
label1:
                    {
                        adapterview = (MenuItem)MenuItemSingleton.getInstance().getItems().get(i);
                        Log.d(LockPatternActivity.TAG, (new StringBuilder()).append("Option chosen was: '").append(adapterview.getText()).append("'  '").append(adapterview.getAction()).append("'").toString());
                        if (adapterview.getAction().length() > 0)
                        {
                            if (AppHelper.handleNative(adapterview.getAction()))
                            {
                                break label0;
                            }
                            AppHelper.getApplicationLink().setLastItem(adapterview);
                            view = adapterview.getAction().replace("javascript:", "");
                            if (!view.contains(getString(0x7f090106)))
                            {
                                break label1;
                            }
                            i = view.indexOf("'") + 1;
                            String s = view.substring(i, view.indexOf("'", i));
                            Log.v(LockPatternActivity.TAG, (new StringBuilder()).append("Hash: ").append(s).toString());
                            if (!AppHelper.getApplicationLink().getAppView().getUrl().contains(s))
                            {
                                break label1;
                            }
                            handleNavigationSideMenu(null);
                        }
                        return;
                    }
                    AppHelper.getApplicationLink().sendJavascript(view);
                    finish();
                }
                if (adapterview.getAction().startsWith(getString(0x7f090102)))
                {
                    AppHelper.getApplicationLink().setLastItem(adapterview);
                }
                finish();
            }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
        });
    }

    public void dataChanged()
    {
        adapter.notifyDataSetChanged();
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (relContainer.getLeft() >= (int)(AppHelper.getDensity() * 240F))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (motionevent.getX() >= AppHelper.getDensity() * 240F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = ((AppRelContainer)relContainer).isAnimating();
        if (flag && flag1 && !flag2)
        {
            handleNavigationSideMenu(null);
            return true;
        } else
        {
            return super.dispatchTouchEvent(motionevent);
        }
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public View getELI_LockImage(View view)
    {
        return findViewById(0x7f080028);
    }

    public View getHeaderContainer(View view)
    {
        return findViewById(0x7f080027);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        Log.d(TAG, (new StringBuilder()).append("LP onActivityResult(requestCode=").append(i).append(", resultCode=").append(j).append(")").toString());
        if (i == 0x4c2ac11 && j == 0xdeadbeef)
        {
            Intent intent1 = getIntent();
            intent1.putExtra("signInMessageType", "NONE");
            intent1.putExtra("signInMessage", "");
            headerContainer = findViewById(0x7f080027);
            headerContainer.setVisibility(0);
            ((TextView)findViewById(0x7f080015)).setVisibility(0);
            findViewById(0x7f08002c).setVisibility(8);
            findViewById(0x7f080029).setVisibility(8);
            ((TextView)findViewById(0x7f08002e)).setText(getIntent().getStringExtra("signInMessage"));
        }
        lclResultCode = i;
        if (j == -1 || j == 2000)
        {
            setResult(j, intent);
            finish();
        }
    }

    public void onBackPressed()
    {
        if (TextUtils.equals(patternMode, "compare"))
        {
            Intent intent = new Intent();
            intent.putExtra("LockPatternAction", "ReturnToHome");
            setResult(2000, intent);
            finish();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onCreate(final Bundle errmsg)
    {
        android.app.AlertDialog.Builder builder;
        TextView textview;
        TextView textview1;
        String s1;
        super.onCreate(errmsg);
        setContentView(0x7f030003);
        errmsg = getIntent().getStringExtra("lockpattern_mode");
        if (errmsg != null)
        {
            patternMode = errmsg.toString();
        }
        isSlideUpOffer = getIntent().getStringExtra("isSlideUpOffer");
        relContainer = findViewById(0x7f080024);
        relContainer.setEnabled(false);
        appHeader = (AppHeader)findViewById(0x7f080026);
        if (TextUtils.equals(patternMode, "compare"))
        {
            ((TextView)findViewById(0x7f08001f)).setText(getResources().getString(0x7f0900a3));
        }
        setupMenuList();
        MenuContainer = findViewById(0x7f080023);
        MenuList = findViewById(0x7f0800b0);
        MenuContainer.getLayoutParams().width = (int)(240F * AppHelper.getDensity());
        MenuContainer.requestLayout();
        MenuContainer.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final LockPatternActivity this$0;

            public void onGlobalLayout()
            {
                relContainer.setOnTouchListener(new AppHeaderTouchHandler(MenuContainer.getWidth(), appHeader.getNavButton()));
                MenuContainer.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
        });
        init();
        mBtnConfirm.setOnClickListener(mBtnConfirmOnClickListener);
        mBtnPasswordSignIn.setOnClickListener(mBtnPasswordSignInOnClickListener);
        mBtnPatternHelp.setOnClickListener(mBtnPatternHelpOnClickListener);
        strMode = getIntent().getStringExtra("AppHeaderNavOption");
        String s;
        if (TextUtils.equals(strMode, "CLOSE"))
        {
            appHeader.setNavOption(2);
            appHeader.hideGlobalButton();
        } else
        {
            appHeader.setNavOption(0);
        }
        appHeader.setOnGlobalButtonClick(new android.view.View.OnClickListener() {

            final LockPatternActivity this$0;

            public void onClick(View view)
            {
                view = new Intent();
                view.putExtra("LockPatternAction", "ReturnToHome");
                setResult(2000, view);
                finish();
            }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
        });
        appHeader.setOnNavOptionClick(new android.view.View.OnClickListener() {

            final LockPatternActivity this$0;

            public void onClick(View view)
            {
                if (TextUtils.equals(strMode, "CLOSE"))
                {
                    finish();
                    return;
                } else
                {
                    handleNavigationSideMenu(view);
                    relContainer.setVisibility(0);
                    return;
                }
            }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
        });
        anims[0] = AnimationUtils.loadAnimation(this, 0x7f040005);
        anims[1] = AnimationUtils.loadAnimation(this, 0x7f040006);
        builder = new android.app.AlertDialog.Builder(this);
        builder.setCancelable(false);
        textview = new TextView(this);
        textview.setTextSize(22F);
        textview.setPadding(10, 10, 10, 5);
        textview.setGravity(17);
        textview1 = new TextView(this);
        textview1.setGravity(17);
        textview1.setTextSize(16F);
        textview1.setPadding(20, 5, 20, 20);
        if (!TextUtils.equals(patternMode, "compare")) goto _L2; else goto _L1
_L1:
        if (!getIntent().hasExtra("errorcode")) goto _L4; else goto _L3
_L3:
        int i;
        try
        {
            i = Integer.parseInt(getIntent().getStringExtra("errorcode"));
        }
        // Misplaced declaration of an exception variable
        catch (final Bundle errmsg)
        {
            Log.d(TAG, "Unable to parse int from errorcode extra.");
            i = 0x7fffffff;
        }
        Log.d(TAG, (new StringBuilder()).append("LockPattern has errorcode = ").append(i).toString());
        i;
        JVM INSTR lookupswitch 12: default 584
    //                   21: 1724
    //                   100196: 1600
    //                   110039: 1015
    //                   120708: 1179
    //                   120709: 896
    //                   120710: 1600
    //                   120711: 1600
    //                   120712: 1600
    //                   120715: 1600
    //                   120716: 1600
    //                   120725: 1485
    //                   120726: 1321;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L7 _L7 _L7 _L7 _L7 _L11 _L12
_L5:
        Log.d(TAG, "LockPattern error Unknown");
        super.mTxtInfo.setText(0x7f09007f);
        super.mDynamicTxtInfo.setText((new StringBuilder()).append(getString(0x7f090071)).append(' ').append(super.userName).toString());
        textview.setText(getString(0x7f0900e1));
        builder.setCustomTitle(textview);
        int j;
        if (super.errorMessage != null && super.errorMessage != "")
        {
            textview1.setText(super.errorMessage);
        } else
        {
            textview1.setText(getString(0x7f0900e2));
        }
        builder.setView(textview1).setNeutralButton("Continue", new android.content.DialogInterface.OnClickListener() {

            final LockPatternActivity this$0;

            public void onClick(DialogInterface dialoginterface, int l)
            {
                dialoginterface.cancel();
                finish();
            }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
        });
        errmsg = builder.create();
        errmsg.setCanceledOnTouchOutside(false);
        errmsg.show();
_L4:
        if (!getIntent().hasExtra("signInMessageType")) goto _L14; else goto _L13
_L13:
        s1 = getIntent().getStringExtra("signInMessageType");
        s = getIntent().getStringExtra("signInMessage");
        errmsg = s;
        if (s == null)
        {
            errmsg = "";
        }
        Log.d(TAG, (new StringBuilder()).append("LP this.getIntent().getStringExtra(signInMessageType) = ").append(s1).toString());
        if (!TextUtils.equals(s1, "ERROR")) goto _L16; else goto _L15
_L15:
        headerContainer = findViewById(0x7f080027);
        headerContainer.setVisibility(8);
        ((TextView)findViewById(0x7f080015)).setVisibility(8);
        findViewById(0x7f080029).setVisibility(0);
        ((TextView)findViewById(0x7f08002b)).setText(errmsg);
_L14:
        return;
_L10:
        mLockPatternView.setEnabled(false);
        super.mTxtInfo.setText(0x7f090081);
        super.mDynamicTxtInfo.setText(0x7f09007e);
        j = mDynamicTxtInfo.getPaddingLeft();
        mTxtInfo.setPadding(j, 0, 0, 0);
        ELI_LockImage.setVisibility(8);
        headerContainer.setBackgroundColor(Color.parseColor("#A12830"));
        mDynamicTxtInfo.setBackgroundColor(Color.parseColor("#A12830"));
        mLockPatternView.setPattern(group.pals.android.lib.ui.lockpattern.widget.LockPatternView.DisplayMode.Wrong, LockPatternUtils.stringToPattern(errorPattern));
        mLockPatternView.postDelayed(mLockPatternViewReloader, 3000L);
        continue; /* Loop/switch isn't completed */
_L8:
        super.mTxtInfo.setText(0x7f09007f);
        super.mDynamicTxtInfo.setText((new StringBuilder()).append(getString(0x7f090071)).append(' ').append(super.userName).toString());
        textview.setText(getString(0x7f0900de));
        builder.setCustomTitle(textview);
        textview1.setText(super.errorMessage);
        builder.setView(textview1).setPositiveButton("Cancel", new android.content.DialogInterface.OnClickListener() {

            final LockPatternActivity this$0;

            public void onClick(DialogInterface dialoginterface, int l)
            {
                dialoginterface.cancel();
            }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
        });
        errmsg = getIntent().getStringExtra("errorMessage");
        if (errmsg != null && errmsg.length() > 0 && errmsg.indexOf("1-8") > 0)
        {
            builder.setNegativeButton("Call", new android.content.DialogInterface.OnClickListener() {

                final LockPatternActivity this$0;
                final String val$errmsg;

                public void onClick(DialogInterface dialoginterface, int l)
                {
                    dialoginterface = errmsg.substring(errmsg.indexOf("1-8") + 2, errmsg.indexOf("1-8") + 14);
                    dialoginterface = new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder()).append("tel:").append(dialoginterface.replaceAll("[\\D]", "")).toString()));
                    startActivity(dialoginterface);
                }

            
            {
                this$0 = LockPatternActivity.this;
                errmsg = s;
                super();
            }
            });
        }
        errmsg = builder.create();
        errmsg.setCanceledOnTouchOutside(false);
        errmsg.show();
        continue; /* Loop/switch isn't completed */
_L9:
        super.mTxtInfo.setText(0x7f090080);
        super.mDynamicTxtInfo.setText("");
        j = mDynamicTxtInfo.getPaddingLeft();
        mTxtInfo.setPadding(j, 0, 0, 0);
        ELI_LockImage.setVisibility(8);
        headerContainer.setBackgroundColor(Color.parseColor("#A12830"));
        mDynamicTxtInfo.setBackgroundColor(Color.parseColor("#A12830"));
        textview.setText(getString(0x7f0900df));
        builder.setCustomTitle(textview);
        textview1.setText(super.errorMessage);
        builder.setView(textview1).setNeutralButton("Continue", new android.content.DialogInterface.OnClickListener() {

            final LockPatternActivity this$0;

            public void onClick(DialogInterface dialoginterface, int l)
            {
                dialoginterface.cancel();
                dialoginterface = new Intent();
                setResult(2000, dialoginterface);
                finish();
            }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
        });
        errmsg = builder.create();
        errmsg.setCanceledOnTouchOutside(false);
        errmsg.show();
        continue; /* Loop/switch isn't completed */
_L12:
        super.mTxtInfo.setText(0x7f09007f);
        super.mDynamicTxtInfo.setText((new StringBuilder()).append(getString(0x7f090071)).append(' ').append(super.userName).toString());
        textview.setText(getString(0x7f0900e0));
        builder.setCustomTitle(textview);
        textview1.setText(super.errorMessage);
        builder.setView(textview1).setPositiveButton("Cancel", new android.content.DialogInterface.OnClickListener() {

            final LockPatternActivity this$0;

            public void onClick(DialogInterface dialoginterface, int l)
            {
                dialoginterface.cancel();
            }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
        });
        errmsg = getIntent().getStringExtra("errorMessage");
        if (errmsg != null && errmsg.length() > 0 && errmsg.indexOf("1-8") > 0)
        {
            builder.setNegativeButton("Call", new android.content.DialogInterface.OnClickListener() {

                final LockPatternActivity this$0;
                final String val$errmsg;

                public void onClick(DialogInterface dialoginterface, int l)
                {
                    dialoginterface = errmsg.substring(errmsg.indexOf("1-8") + 2, errmsg.indexOf("1-8") + 14);
                    dialoginterface = new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder()).append("tel:").append(dialoginterface.replaceAll("[\\D]", "")).toString()));
                    startActivity(dialoginterface);
                }

            
            {
                this$0 = LockPatternActivity.this;
                errmsg = s;
                super();
            }
            });
        }
        errmsg = builder.create();
        errmsg.setCanceledOnTouchOutside(false);
        errmsg.show();
        continue; /* Loop/switch isn't completed */
_L11:
        super.mTxtInfo.setText(0x7f09007f);
        super.mDynamicTxtInfo.setText((new StringBuilder()).append(getString(0x7f090071)).append(' ').append(super.userName).toString());
        textview.setText(getString(0x7f0900e0));
        builder.setCustomTitle(textview);
        textview1.setText(super.errorMessage);
        builder.setView(textview1).setNeutralButton("OK", new android.content.DialogInterface.OnClickListener() {

            final LockPatternActivity this$0;

            public void onClick(DialogInterface dialoginterface, int l)
            {
                dialoginterface.cancel();
                finish();
            }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
        });
        errmsg = builder.create();
        errmsg.setCanceledOnTouchOutside(false);
        errmsg.show();
        continue; /* Loop/switch isn't completed */
_L7:
        Log.d(TAG, "LockPattern error in case 120710: case 120711: case 120712: case 120715: case 120716: case 100196");
        super.mTxtInfo.setText(0x7f09007f);
        super.mDynamicTxtInfo.setText((new StringBuilder()).append(getString(0x7f090071)).append(' ').append(super.userName).toString());
        textview.setText(getString(0x7f0900e1));
        builder.setCustomTitle(textview);
        textview1.setText(super.errorMessage);
        builder.setView(textview1).setNeutralButton("Continue", new android.content.DialogInterface.OnClickListener() {

            final LockPatternActivity this$0;

            public void onClick(DialogInterface dialoginterface, int l)
            {
                dialoginterface.cancel();
                finish();
            }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
        });
        errmsg = builder.create();
        errmsg.setCanceledOnTouchOutside(false);
        errmsg.show();
        continue; /* Loop/switch isn't completed */
_L6:
        super.mTxtInfo.setText(0x7f09007f);
        super.mDynamicTxtInfo.setText((new StringBuilder()).append(getString(0x7f090071)).append(' ').append(super.userName).toString());
        textview.setText(getString(0x7f0900e1));
        builder.setCustomTitle(textview);
        textview1.setText(super.errorMessage);
        builder.setView(textview1).setPositiveButton("Cancel", new android.content.DialogInterface.OnClickListener() {

            final LockPatternActivity this$0;

            public void onClick(DialogInterface dialoginterface, int l)
            {
                dialoginterface.cancel();
            }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
        });
        errmsg = getIntent().getStringExtra("errorMessage");
        if (errmsg != null && errmsg.length() > 0 && errmsg.indexOf("1-8") > 0)
        {
            builder.setNegativeButton("Call", new android.content.DialogInterface.OnClickListener() {

                final LockPatternActivity this$0;
                final String val$errmsg;

                public void onClick(DialogInterface dialoginterface, int l)
                {
                    dialoginterface = errmsg.substring(errmsg.indexOf("1-8") + 2, errmsg.indexOf("1-8") + 14);
                    dialoginterface = new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder()).append("tel:").append(dialoginterface.replaceAll("[\\D]", "")).toString()));
                    startActivity(dialoginterface);
                }

            
            {
                this$0 = LockPatternActivity.this;
                errmsg = s;
                super();
            }
            });
        }
        errmsg = builder.create();
        errmsg.setCanceledOnTouchOutside(false);
        errmsg.show();
        continue; /* Loop/switch isn't completed */
_L16:
        if (TextUtils.equals(s1, "SUCCESS"))
        {
            headerContainer = findViewById(0x7f080027);
            headerContainer.setVisibility(8);
            ((TextView)findViewById(0x7f080015)).setVisibility(8);
            findViewById(0x7f08002c).setVisibility(0);
            ((TextView)findViewById(0x7f08002e)).setText(errmsg);
            return;
        }
        if (!TextUtils.equals(s1, "FATAL")) goto _L14; else goto _L17
_L17:
        super.mTxtInfo.setText(getString(0x7f0900de));
        super.mDynamicTxtInfo.setText(errmsg);
        int k = mDynamicTxtInfo.getPaddingLeft();
        mTxtInfo.setPadding(k, 0, 0, 0);
        ELI_LockImage.setVisibility(8);
        headerContainer.setBackgroundColor(Color.parseColor("#A12830"));
        mDynamicTxtInfo.setBackgroundColor(Color.parseColor("#A12830"));
        textview.setText(getString(0x7f0900de));
        builder.setCustomTitle(textview);
        textview1.setText(getString(0x7f0900e4));
        builder.setView(textview1).setPositiveButton("Cancel", new android.content.DialogInterface.OnClickListener() {

            final LockPatternActivity this$0;

            public void onClick(DialogInterface dialoginterface, int l)
            {
                dialoginterface.cancel();
            }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
        }).setNegativeButton("Call", new android.content.DialogInterface.OnClickListener() {

            final LockPatternActivity this$0;

            public void onClick(DialogInterface dialoginterface, int l)
            {
                dialoginterface = new Intent("android.intent.action.DIAL", Uri.parse("tel:8667500873"));
                startActivity(dialoginterface);
            }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
        });
        errmsg = builder.create();
        errmsg.setCanceledOnTouchOutside(false);
        errmsg.show();
        return;
_L2:
        if (!TextUtils.equals(patternMode, "create") || super.errorCode == null) goto _L14; else goto _L18
_L18:
        textview.setText(getString(0x7f0900e1));
        builder.setCustomTitle(textview);
        Log.d(TAG, (new StringBuilder()).append("super.errorMessage = [").append(super.errorMessage).append("]").toString());
        if (super.errorMessage == null || TextUtils.equals(super.errorMessage, "null") || TextUtils.equals(super.errorMessage, ""))
        {
            Log.d(TAG, "Enrollment super.errorMessage is empty, null or 'null'");
            textview1.setText(getString(0x7f0900e3));
        } else
        {
            textview1.setText(super.errorMessage);
        }
        builder.setView(textview1).setPositiveButton("Cancel", new android.content.DialogInterface.OnClickListener() {

            final LockPatternActivity this$0;

            public void onClick(DialogInterface dialoginterface, int l)
            {
                dialoginterface.cancel();
            }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
        });
        errmsg = getIntent().getStringExtra("errorMessage");
        if (errmsg != null && errmsg.indexOf("1-8") > 0)
        {
            builder.setNegativeButton("Call", new android.content.DialogInterface.OnClickListener() {

                final LockPatternActivity this$0;
                final String val$errmsg;

                public void onClick(DialogInterface dialoginterface, int l)
                {
                    if (errmsg.length() > 0 && errmsg.indexOf("1-8") > 0)
                    {
                        dialoginterface = errmsg.substring(errmsg.indexOf("1-8") + 2, errmsg.indexOf("1-8") + 14);
                        dialoginterface = new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder()).append("tel:").append(dialoginterface.replaceAll("[\\D]", "")).toString()));
                        startActivity(dialoginterface);
                    }
                }

            
            {
                this$0 = LockPatternActivity.this;
                errmsg = s;
                super();
            }
            });
        }
        errmsg = builder.create();
        errmsg.setCanceledOnTouchOutside(false);
        errmsg.show();
        return;
        if (true) goto _L4; else goto _L19
_L19:
    }

    protected void onPause()
    {
        super.onPause();
        MenuItemSingleton.getInstance().registerListener(null);
    }

    protected void onResume()
    {
        super.onResume();
        if (TextUtils.equals("create", patternMode) && !AppHelper.isAuthenticated())
        {
            sendBroadcast(new Intent(this, com/capitalone/mobile/banking/session/TimeoutBroadcastReceiver));
        }
        MenuItemSingleton.getInstance().registerListener(this);
        if (lclResultCode == 22)
        {
            (new Thread(super.mLockPatternViewReloader)).run();
        }
    }

    protected void onStart()
    {
        super.onStart();
        relContainer.postDelayed(new Runnable() {

            final LockPatternActivity this$0;

            public void run()
            {
                relContainer.setEnabled(true);
            }

            
            {
                this$0 = LockPatternActivity.this;
                super();
            }
        }, 500L);
    }









}

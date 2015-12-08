// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.accounts.Account;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.Searchable;
import com.google.android.gms.games.ui.common.matches.MultiplayerInboxHelper;
import com.google.android.gms.games.ui.common.quests.DestinationQuestInboxHelper;
import com.google.android.gms.games.ui.common.quests.QuestInboxHelper;
import com.google.android.gms.games.ui.common.quests.QuestMetadataProvider;
import com.google.android.gms.games.ui.common.quests.QuestUiConfiguration;
import com.google.android.gms.games.ui.common.requests.RequestInboxHelper;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivityBase;
import com.google.android.gms.games.ui.destination.HelpContextProvider;
import com.google.android.gms.games.ui.destination.LoggablePage;
import com.google.android.gms.games.ui.destination.matches.DestinationMultiplayerInboxHelper;
import com.google.android.gms.games.ui.destination.requests.DestinationRequestInboxHelper;
import com.google.android.gms.games.ui.destination.sharedprefs.SharedPrefsConfig;
import com.google.android.gms.games.ui.destination.util.NavigationDrawerUtils;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.util.AccountUtils;

public final class MainActivity extends DestinationFragmentActivity
    implements com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener, com.google.android.gms.games.ui.common.matches.MultiplayerInboxHelper.MultiplayerInboxHelperProvider, com.google.android.gms.games.ui.common.quests.QuestInboxHelper.QuestInboxHelperProvider, QuestMetadataProvider, QuestUiConfiguration, com.google.android.gms.games.ui.common.requests.RequestInboxHelper.RequestInboxHelperProvider, HelpContextProvider, com.google.android.gms.games.ui.dialog.changeaccount.InvitationChangeAccountDialogFragment.InvitationAccountSwitcherProvider, com.google.android.gms.games.ui.dialog.changeaccount.MatchChangeAccountDialogFragment.MatchAccountSwitcherProvider, com.google.android.gms.games.ui.dialog.changeaccount.QuestChangeAccountDialogFragment.QuestAccountSwitcherProvider, com.google.android.gms.games.ui.dialog.changeaccount.RequestChangeAccountDialogFragment.RequestAccountSwitcherProvider
{

    private static final int QUEST_SELECTORS[] = {
        3
    };
    private static final String TAG = com/google/android/gms/games/ui/destination/main/MainActivity.getSimpleName();
    private Fragment mCurrentFragment;
    private boolean mIsDrawerOpen;
    private DestinationMultiplayerInboxHelper mMultiplayerInboxHelper;
    private DestinationQuestInboxHelper mQuestInboxHelper;
    private DestinationRequestInboxHelper mRequestInboxHelper;
    private boolean mShouldLaunchSettingForRecording;
    private boolean mShowConnectionErrorDialog;
    private boolean mShowLoginFailedDialog;
    private boolean mShowUpgradeDialog;
    private String mVideoRecordingGameId;
    private String mVideoRecordingGamePackage;

    public MainActivity()
    {
        super(0x7f040060, 0, false);
        mShouldLaunchSettingForRecording = false;
    }

    private void loadFragment(boolean flag)
    {
        Object obj = super.mFragments;
        if (!flag)
        {
            mCurrentFragment = ((FragmentManager) (obj)).findFragmentById(0x7f0d016c);
        }
        if (flag || mCurrentFragment == null)
        {
            mCurrentFragment = NavigationDrawerUtils.instantiateCurrentFragment();
            obj = ((FragmentManager) (obj)).beginTransaction();
            ((FragmentTransaction) (obj)).replace(0x7f0d016c, mCurrentFragment);
            ((FragmentTransaction) (obj)).commit();
        }
        NavigationDrawerUtils.updateCurrentTitle(this);
        NavigationDrawerUtils.updateCurrentMenu(this);
    }

    private void setFocusabilityBelowNavigationDrawer(boolean flag)
    {
        Asserts.checkNotNull(mCurrentFragment);
        Object obj = mCurrentFragment.mView;
        if (obj instanceof ViewGroup)
        {
            obj = (ViewGroup)obj;
            int i;
            if (flag)
            {
                i = 0x20000;
            } else
            {
                i = 0x60000;
            }
            ((ViewGroup) (obj)).setDescendantFocusability(i);
        }
    }

    public final String getHelpContext()
    {
        return NavigationDrawerUtils.getHelpContext();
    }

    public final com.google.android.gms.games.ui.dialog.changeaccount.InvitationChangeAccountDialogFragment.InvitationAccountSwitcher getInvitationAccountSwitcher()
    {
        return mMultiplayerInboxHelper;
    }

    public final com.google.android.gms.games.ui.dialog.changeaccount.MatchChangeAccountDialogFragment.MatchAccountSwitcher getMatchAccountSwitcher()
    {
        return mMultiplayerInboxHelper;
    }

    public final MultiplayerInboxHelper getMultiplayerInboxHelper()
    {
        return mMultiplayerInboxHelper;
    }

    public final com.google.android.gms.games.ui.dialog.changeaccount.QuestChangeAccountDialogFragment.QuestAccountSwitcher getQuestAccountSwitcher()
    {
        return mQuestInboxHelper;
    }

    public final QuestInboxHelper getQuestInboxHelper()
    {
        return mQuestInboxHelper;
    }

    public final int[] getQuestSelectors()
    {
        return QUEST_SELECTORS;
    }

    public final com.google.android.gms.games.ui.dialog.changeaccount.RequestChangeAccountDialogFragment.RequestAccountSwitcher getRequestAccountSwitcher()
    {
        return mRequestInboxHelper;
    }

    public final RequestInboxHelper getRequestInboxHelper()
    {
        return mRequestInboxHelper;
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 2002 && j == -1)
        {
            mVideoRecordingGameId = intent.getStringExtra("com.google.android.gms.games.GAME_ID");
            mVideoRecordingGamePackage = intent.getStringExtra("com.google.android.gms.games.GAME_PACKAGE_NAME");
            mShouldLaunchSettingForRecording = true;
        } else
        {
            super.onActivityResult(i, j, intent);
            if (j == -1)
            {
                DialogFragmentUtil.dismissAllowingStateLoss(this, "com.google.android.gms.games.ui.dialog.loginFailedDialog");
                return;
            }
        }
    }

    public final void onBackPressed()
    {
        if (!NavigationDrawerUtils.onBackPressed(this))
        {
            super.onBackPressed();
            return;
        } else
        {
            logClickEvent(900);
            return;
        }
    }

    public final void onConnected(Bundle bundle)
    {
        super.onConnected(bundle);
        if (!isFinishing() && mCurrentFragment == null)
        {
            loadFragment(true);
        }
        if (mShouldLaunchSettingForRecording)
        {
            PrebuiltDialogs.showVideoRecordingPrerecordDialog(this, mVideoRecordingGameId, mVideoRecordingGamePackage, null);
            mShouldLaunchSettingForRecording = false;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        boolean flag1 = true;
        if (bundle != null)
        {
            mRetryingSignIn = bundle.getBoolean("savedStateRetryingSignIn");
        }
        super.onCreate(bundle);
        startOnboardingFlow();
        mMultiplayerInboxHelper = new DestinationMultiplayerInboxHelper(this);
        mRequestInboxHelper = new DestinationRequestInboxHelper(this);
        mQuestInboxHelper = new DestinationQuestInboxHelper(this);
        boolean flag;
        if (((Boolean)G.playGamesDogfoodMode.get()).booleanValue())
        {
            if (SharedPrefsConfig.getBoolean(this, "showDogfoodInvite", true))
            {
                final String emailAddress = null;
                Account aaccount[] = AccountUtils.getAvailableAccounts(this);
                int j = aaccount.length;
                for (int i = 0; i < j; i++)
                {
                    Account account = aaccount[i];
                    if (account.name.endsWith("@google.com"))
                    {
                        emailAddress = account.name;
                    }
                }

                if (emailAddress != null)
                {
                    android.support.v7.app.AlertDialog.Builder builder = PrebuiltDialogs.getGamesThemedBuilder(this).setTitle("Stay in the Dogfood").setMessage("Would you like to continue dogfooding Play Games after October 3rd?\n\nKeep dogfooding to tryout the latest features before they are released.\n\nLeave to switch to the public version of Play Games starting on October 4th.");
                    android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener() {

                        final MainActivity this$0;

                        public final void onClick(DialogInterface dialoginterface, int k)
                        {
                            SharedPrefsConfig.setBoolean(MainActivity.this, "showDogfoodInvite", false);
                        }

            
            {
                this$0 = MainActivity.this;
                super();
            }
                    };
                    builder.P.mNegativeButtonText = "LEAVE";
                    builder.P.mNegativeButtonListener = onclicklistener;
                    emailAddress = new android.content.DialogInterface.OnClickListener() {

                        final MainActivity this$0;
                        final String val$emailAddress;

                        public final void onClick(DialogInterface dialoginterface, int k)
                        {
                            SharedPrefsConfig.setBoolean(MainActivity.this, "showDogfoodInvite", false);
                            dialoginterface = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "join-play-games-dogfood@google.com", null));
                            dialoginterface.putExtra("android.intent.extra.SUBJECT", "Please add me to the Play Games dogfood");
                            dialoginterface.putExtra("android.intent.extra.TEXT", (new StringBuilder("Google email: ")).append(emailAddress).toString());
                            startActivity(Intent.createChooser(dialoginterface, "Send email using..."));
                        }

            
            {
                this$0 = MainActivity.this;
                emailAddress = s;
                super();
            }
                    };
                    builder.P.mPositiveButtonText = "KEEP DOGFOODING";
                    builder.P.mPositiveButtonListener = emailAddress;
                    builder.setCancelable(false).show();
                }
            } else
            if (SharedPrefsConfig.getBoolean(this, "showConfidentialityWarning", true))
            {
                SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder((new StringBuilder()).append("GOOGLE CONFIDENTIAL").append(" YOU ARE RUNNING UNRELEASED SOFTWARE. DO NOT DISCUSS OR SHOW EXTERNALLY.").toString());
                spannablestringbuilder.setSpan(new ForegroundColorSpan(0xffff0000), 0, "GOOGLE CONFIDENTIAL".length(), 0);
                PrebuiltDialogs.getGamesThemedBuilder(this).setMessage(spannablestringbuilder).setNeutralButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                    final MainActivity this$0;

                    public final void onClick(DialogInterface dialoginterface, int k)
                    {
                        SharedPrefsConfig.setBoolean(MainActivity.this, "showConfidentialityWarning", false);
                    }

            
            {
                this$0 = MainActivity.this;
                super();
            }
                }).setCancelable(false).show();
            }
        }
        if (bundle == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            NavigationDrawerUtils.resetFromIntent(getIntent());
            SharedPrefsConfig.setLong(this, "shuffleHomePageSeed", System.currentTimeMillis());
        }
        if (!flag)
        {
            loadFragment(false);
        }
        if (bundle != null)
        {
            mShowUpgradeDialog = bundle.getBoolean("savedStateShowUpgradeDialog");
            return;
        } else
        {
            mShowUpgradeDialog = getIntent().getBooleanExtra("com.google.android.gms.games.SHOW_UPGRADE_DIALOG", false);
            return;
        }
    }

    public final void onCurrentViewCreated()
    {
        if (mIsDrawerOpen)
        {
            setFocusabilityBelowNavigationDrawer(false);
        }
    }

    protected final void onDrawerClosed()
    {
        super.onDrawerClosed();
        mIsDrawerOpen = false;
        if (mCurrentFragment != null && mCurrentFragment.mView != null)
        {
            setFocusabilityBelowNavigationDrawer(true);
        }
    }

    protected final void onDrawerOpened()
    {
        super.onDrawerOpened();
        mIsDrawerOpen = true;
        if (mCurrentFragment != null && mCurrentFragment.mView != null)
        {
            setFocusabilityBelowNavigationDrawer(false);
        }
    }

    public final void onHeaderClicked(String s)
    {
        String s1 = null;
        byte byte0 = -1;
        if ("invitationsButton".equals(s))
        {
            s1 = "com.google.android.gms.games.destination.SHOW_MULTIPLAYER_LIST";
            byte0 = 0;
        } else
        if ("myTurnButton".equals(s))
        {
            s1 = "com.google.android.gms.games.destination.SHOW_MULTIPLAYER_LIST";
            byte0 = 1;
        } else
        if ("theirTurnButton".equals(s))
        {
            s1 = "com.google.android.gms.games.destination.SHOW_MULTIPLAYER_LIST";
            byte0 = 2;
        } else
        if ("completedMatchesButton".equals(s))
        {
            s1 = "com.google.android.gms.games.destination.SHOW_MULTIPLAYER_LIST";
            byte0 = 3;
        } else
        if ("giftsButton".equals(s))
        {
            s1 = "com.google.android.gms.games.destination.SHOW_REQUEST_LIST";
            byte0 = 0;
        } else
        if ("wishesButton".equals(s))
        {
            s1 = "com.google.android.gms.games.destination.SHOW_REQUEST_LIST";
            byte0 = 1;
        }
        if (s1 != null)
        {
            s = new Intent(s1);
            s.putExtra("com.google.android.gms.games.FRAGMENT_INDEX", byte0);
            s.putExtra("com.google.android.gms.games.GAME_ID", super.mConfiguration.getCurrentGameId());
            startActivity(s);
            return;
        } else
        {
            GamesLog.w(TAG, (new StringBuilder("onSeeMoreClicked - Unexpected buttonTag: ")).append(s).toString());
            return;
        }
    }

    public final void onLoginFailed(Status status)
    {
        mRetryingSignIn = true;
        int i = -1;
        if (status != null)
        {
            i = status.mStatusCode;
        }
        if (i == 4 || i == 6)
        {
            mShowConnectionErrorDialog = true;
            mShowLoginFailedDialog = false;
            return;
        } else
        {
            mShowConnectionErrorDialog = false;
            mShowLoginFailedDialog = true;
            return;
        }
    }

    protected final void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
        loadFragment(true);
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131559251: 
            NavigationDrawerUtils.launchSearch(this);
            break;
        }
        return true;
    }

    public final void onPostResume()
    {
        super.onPostResume();
        if (mShowConnectionErrorDialog)
        {
            DialogFragmentUtil.dismissAllowingStateLoss(this, "com.google.android.gms.games.ui.dialog.loginFailedDialog");
            DialogFragmentUtil.dismissAllowingStateLoss(this, "com.google.android.gms.games.ui.dialog.connectionErrorDialog");
            DialogFragmentUtil.show(this, new GamesDialogFragment() {

                final MainActivity this$0;

                protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
                {
                    return gamesdialogbuilder.setTitle(0x7f1000c4).setMessage(0x7f1000c3).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

                        final _cls4 this$1;

                        public final void onClick(DialogInterface dialoginterface, int i)
                        {
                            if (isAttachedToParent())
                            {
                                mActivity.finish();
                            }
                        }

            
            {
                this$1 = _cls4.this;
                super();
            }
                    }).setPositiveButton(0x7f10014b, new android.content.DialogInterface.OnClickListener() {

                        final _cls4 this$1;

                        public final void onClick(DialogInterface dialoginterface, int i)
                        {
                            if (isAttachedToParent())
                            {
                                MainActivity.access$100((MainActivity)mActivity);
                            }
                            dismissInternal(false);
                        }

            
            {
                this$1 = _cls4.this;
                super();
            }
                    }).setCancelable(false);
                }



            
            {
                this$0 = MainActivity.this;
                super();
            }
            }, "com.google.android.gms.games.ui.dialog.connectionErrorDialog");
            mShowConnectionErrorDialog = false;
        } else
        {
            if (mShowLoginFailedDialog)
            {
                DialogFragmentUtil.dismissAllowingStateLoss(this, "com.google.android.gms.games.ui.dialog.loginFailedDialog");
                DialogFragmentUtil.dismissAllowingStateLoss(this, "com.google.android.gms.games.ui.dialog.connectionErrorDialog");
                DialogFragmentUtil.show(this, new GamesDialogFragment() {

                    final MainActivity this$0;

                    protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
                    {
                        return gamesdialogbuilder.setTitle(0x7f10014a).setMessage(0x7f100149).setNeutralButton(0x7f100148, new android.content.DialogInterface.OnClickListener() {

                            final _cls5 this$1;

                            public final void onClick(DialogInterface dialoginterface, int i)
                            {
                                if (isAttachedToParent())
                                {
                                    dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse((String)G.playGamesHelpWebpageUrl.get()));
                                    startActivity(dialoginterface);
                                }
                                dismissInternal(false);
                            }

            
            {
                this$1 = _cls5.this;
                super();
            }
                        }).setPositiveButton(0x7f10014b, new android.content.DialogInterface.OnClickListener() {

                            final _cls5 this$1;

                            public final void onClick(DialogInterface dialoginterface, int i)
                            {
                                if (isAttachedToParent())
                                {
                                    MainActivity.access$100(_fld0);
                                }
                                dismissInternal(false);
                            }

            
            {
                this$1 = _cls5.this;
                super();
            }
                        });
                    }



            
            {
                this$0 = MainActivity.this;
                super();
            }
                }, "com.google.android.gms.games.ui.dialog.loginFailedDialog");
                mShowLoginFailedDialog = false;
                return;
            }
            if (mShowUpgradeDialog)
            {
                DialogFragmentUtil.show(this, new com.google.android.gms.games.ui.dialog.PrebuiltDialogs._cls3(), "com.google.android.gms.games.ui.dialog.upgradeDialog");
                mShowUpgradeDialog = false;
                return;
            }
        }
    }

    protected final void onResume()
    {
        super.onResume();
        if (mCurrentFragment instanceof LoggablePage)
        {
            ((LoggablePage)mCurrentFragment).logPageView(super.mPlayLogger);
        }
    }

    protected final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("savedStateShowUpgradeDialog", mShowUpgradeDialog);
        bundle.putBoolean("savedStateRetryingSignIn", mRetryingSignIn);
    }

    public final boolean onSearchRequested()
    {
        if (mCurrentFragment != null && (mCurrentFragment instanceof Searchable))
        {
            return ((Searchable)mCurrentFragment).onSearchRequested();
        } else
        {
            return super.onSearchRequested();
        }
    }

    protected final boolean shouldDrawerBeOpenInitially()
    {
        boolean flag = false;
        if (!SharedPrefsConfig.getBoolean(this, "drawerHasBeenOpened", false))
        {
            flag = true;
        }
        return flag;
    }

    public final boolean useActionBarProgressBar()
    {
        return true;
    }

    public final boolean useFixedHeightQuestTiles()
    {
        return true;
    }



/*
    static void access$100(MainActivity mainactivity)
    {
        if (AccountUtils.getAvailableAccounts(mainactivity).length > 1)
        {
            mainactivity.createGoogleApiClient();
        }
        mainactivity.getGoogleApiClient().connect();
        return;
    }

*/
}

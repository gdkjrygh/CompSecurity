// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesIntents;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.OnLogInGameActionListener;
import com.google.android.gms.games.ui.OnLogLeaderboardActionListener;
import com.google.android.gms.games.ui.Searchable;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.util.AccountUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class ClientFragmentActivity extends GamesFragmentActivity
    implements OnLogInGameActionListener, OnLogLeaderboardActionListener
{

    private ArrayList mAttachedFragments;
    public GameEntity mClientGame;
    public String mClientPackageName;
    public int mClientVersionCode;
    public String mGameThemeColor;
    private final boolean mIsActionBarVisible;
    private ArrayList mOnCurrentGameLoadedListeners;
    public boolean mShowGameIconInActionBar;
    public boolean mShowGameNameAsTitle;
    public boolean mShowTitleInActionBar;

    public ClientFragmentActivity(int i)
    {
        this(i, 0);
    }

    public ClientFragmentActivity(int i, int j)
    {
        this(i, j, true);
    }

    public ClientFragmentActivity(int i, int j, boolean flag)
    {
        this(i, j, flag, false);
    }

    public ClientFragmentActivity(int i, int j, boolean flag, boolean flag1)
    {
        super(1, 0, i, j, flag1);
        mShowGameNameAsTitle = true;
        mShowGameIconInActionBar = true;
        mShowTitleInActionBar = true;
        mOnCurrentGameLoadedListeners = new ArrayList();
        mIsActionBarVisible = flag;
    }

    public void addApisToGoogleApiClient(com.google.android.gms.common.api.GoogleApiClient.Builder builder)
    {
        super.addApisToGoogleApiClient(builder);
        com.google.android.gms.games.Games.GamesOptions.Builder builder1 = com.google.android.gms.games.Games.GamesOptions.builder();
        modifyGamesOptions(builder1);
        builder.addApi(Games.API, builder1.build());
    }

    public final boolean canContinueWithStatus(int i)
    {
        if (i == 2)
        {
            setResult(10001);
            finish();
            return false;
        }
        if (i == 7)
        {
            setResult(10003);
            finish();
            return false;
        } else
        {
            return true;
        }
    }

    public abstract int getLogEventType();

    protected final GoogleApiClient instantiateGoogleApiClient()
    {
        Object obj;
        Object obj1;
        obj1 = getIntent();
        mClientVersionCode = GamesIntents.getClientVersion(((Intent) (obj1)));
        android.content.Context context = AndroidUtils.getCallingContext(this);
        obj = null;
        if (context != null)
        {
            obj = com.google.android.gms.common.internal.DowngradeableSafeParcel.DowngradeableSafeParcelHelper.getExtras(((Intent) (obj1)), context, Integer.valueOf(mClientVersionCode));
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new Bundle();
        }
        mClientPackageName = AndroidUtils.getCallingPackage(this);
        if (mClientPackageName == null)
        {
            GamesLog.e("ClientUiFragAct", "Client UI activities must be started with startActivityForResult");
            return null;
        }
        if (!mClientPackageName.equals(getPackageName()))
        {
            break MISSING_BLOCK_LABEL_183;
        }
        mClientPackageName = ((Bundle) (obj1)).getString("com.google.android.gms.games.GAME_PACKAGE_NAME");
        Asserts.checkNotNull(mClientPackageName, "EXTRA_GAME_PACKAGE_NAME missing when coming from Games UI");
        if (mClientPackageName == null)
        {
            GamesLog.e("ClientUiFragAct", "EXTRA_GAME_PACKAGE_NAME missing when coming from Games UI");
            return null;
        }
        if (!PlatformVersion.checkVersion(21))
        {
            break MISSING_BLOCK_LABEL_183;
        }
        obj = getPackageManager();
        android.content.pm.ApplicationInfo applicationinfo = ((PackageManager) (obj)).getApplicationInfo(mClientPackageName, 128);
        if (applicationinfo != null)
        {
            setTaskDescription(new android.app.ActivityManager.TaskDescription((String)((PackageManager) (obj)).getApplicationLabel(applicationinfo), ((BitmapDrawable)((PackageManager) (obj)).getApplicationIcon(applicationinfo)).getBitmap()));
        }
_L2:
        com.google.android.gms.common.api.GoogleApiClient.Builder builder = new com.google.android.gms.common.api.GoogleApiClient.Builder(this, this, this);
        builder.mRealClientPackageName = mClientPackageName;
        if (!TextUtils.isEmpty(((Bundle) (obj1)).getString("com.google.android.gms.games.ACCOUNT_KEY")))
        {
            Account aaccount[] = AccountUtils.getAvailableAccounts(this);
            boolean flag1 = false;
            int j = aaccount.length;
            int i = 0;
label0:
            do
            {
label1:
                {
                    boolean flag = flag1;
                    if (i < j)
                    {
                        Account account = aaccount[i];
                        if (!GamesIntents.checkObfuscatedAccount(((Bundle) (obj1)), account.name))
                        {
                            break label1;
                        }
                        builder.setAccountName(account.name);
                        flag = true;
                    }
                    if (!flag)
                    {
                        Log.wtf("ClientUiFragAct", "Account key was provided but the account is no longer on the device.");
                        return null;
                    }
                    break label0;
                }
                i++;
            } while (true);
        }
        addApisToGoogleApiClient(builder);
        return builder.build();
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void logInGameAction(int i)
    {
        if (mClientGame != null)
        {
            String s = Games.getCurrentAccountName(getGoogleApiClient());
            GamesPlayLogger.logInGameAction(this, mClientPackageName, mClientGame.mApplicationId, s, i);
        }
    }

    public final void logLeaderboardAction(String s, int i, int j)
    {
        if (mClientGame != null)
        {
            String s1 = Games.getCurrentAccountName(getGoogleApiClient());
            GamesPlayLogger.logLeaderboardAction(this, mClientPackageName, mClientGame.mApplicationId, s1, s, i, j);
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 900 && j == 10001)
        {
            GamesLog.d("ClientUiFragAct", "onActivityResult: Reconnect required.");
            setResult(10001);
            finish();
            return;
        }
        if (i == 1000 && j == -1)
        {
            GamesLog.d("ClientUiFragAct", "onActivityResult: RESULT_OK received from a public items UI. Forwarding...");
            setResult(-1, intent);
            finish();
            return;
        } else
        {
            super.onActivityResult(i, j, intent);
            return;
        }
    }

    public void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if (mAttachedFragments != null)
        {
            mAttachedFragments.add(new WeakReference(fragment));
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (useGameThemeColorAsBackground())
        {
            getWindow().getDecorView().setBackgroundColor(getResources().getColor(0x7f0b0048));
            return;
        } else
        {
            getWindow().getDecorView().setBackgroundResource(0x7f0200d8);
            return;
        }
    }

    public void onConnected(Bundle bundle)
    {
        super.onConnected(bundle);
        bundle = getGoogleApiClient();
        Game game = Games.GamesMetadata.getCurrentGame(bundle);
        if (game != null)
        {
            setClientGame(game);
        } else
        {
            Games.GamesMetadata.loadGame(bundle).setResultCallback(new ResultCallback() {

                final ClientFragmentActivity this$0;

                public final volatile void onResult(Result result)
                {
                    Object obj;
                    ClientFragmentActivity clientfragmentactivity;
                    GameBuffer gamebuffer;
                    int i;
                    obj = null;
                    result = (com.google.android.gms.games.GamesMetadata.LoadGamesResult)result;
                    clientfragmentactivity = ClientFragmentActivity.this;
                    i = result.getStatus().mStatusCode;
                    gamebuffer = result.getGames();
                    boolean flag = clientfragmentactivity.canContinueWithStatus(i);
                    if (!flag)
                    {
                        gamebuffer.release();
                        return;
                    }
                    clientfragmentactivity.mClientGame = null;
                    result = obj;
                    if (gamebuffer.getCount() > 0)
                    {
                        result = (Game)gamebuffer.get(0).freeze();
                    }
                    if (result != null)
                    {
                        break MISSING_BLOCK_LABEL_97;
                    }
                    GamesLog.w("ClientUiFragAct", "onGamesLoaded: couldn't load gameId ");
                    gamebuffer.release();
                    return;
                    clientfragmentactivity.setClientGame(result);
                    gamebuffer.release();
                    return;
                    result;
                    gamebuffer.release();
                    throw result;
                }

            
            {
                this$0 = ClientFragmentActivity.this;
                super();
            }
            });
        }
        logInGameAction(getLogEventType());
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        GamesLog.d("ClientUiFragAct", (new StringBuilder("Connection failed: result = ")).append(connectionresult.mStatusCode).toString());
        if (connectionresult.mStatusCode == 10)
        {
            GamesLog.e("ClientUiFragAct", "Developer error.");
            setResult(10001);
            finish();
            return;
        }
        if (connectionresult.mStatusCode == 11)
        {
            GamesLog.e("ClientUiFragAct", "License check failed.");
            setResult(10003);
            finish();
            return;
        }
        if (connectionresult.mStatusCode == 4)
        {
            GamesLog.e("ClientUiFragAct", "Not signed in. To launch Client UI activities, you must be connected to the games service AND signed in.");
            setResult(10001);
            finish();
            return;
        } else
        {
            super.onConnectionFailed(connectionresult);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (mIsActionBarVisible)
        {
            setTitle("");
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        if (getIntent().getBooleanExtra("com.google.android.gms.games.EXTRA_DISABLE_SETTINGS", false))
        {
            menu.removeItem(0x7f0d0352);
        }
        return true;
    }

    public final boolean onFragmentSearchRequested()
    {
label0:
        {
            if (mAttachedFragments != null)
            {
                Iterator iterator = mAttachedFragments.iterator();
                Fragment fragment;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    fragment = (Fragment)((WeakReference)iterator.next()).get();
                } while (fragment == null || fragment.mActivity != this || !(fragment instanceof Searchable));
                return ((Searchable)fragment).onSearchRequested();
            }
            GamesLog.e("ClientUiFragAct", "onFragmentSearchRequested: need to call trackFragments first");
        }
        return false;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (i == 0x102002c)
        {
            onBackPressed();
            return true;
        }
        if (i == 0x7f0d0352)
        {
            onShowSettings();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected final void onSetActionBar()
    {
        super.onSetActionBar();
        if (mIsActionBarVisible)
        {
            getDelegate().getSupportActionBar();
            getDelegate().getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public final void onShowSettings()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (googleapiclient.isConnected())
        {
            startActivityForResult(Games.getSettingsIntent(googleapiclient), 900);
            return;
        } else
        {
            GamesLog.w("ClientUiFragAct", "onShowSettings: googleApiClient not connected; ignoring menu click");
            return;
        }
    }

    void setClientGame(Game game)
    {
        mClientGame = (GameEntity)game.freeze();
        if (mShowGameNameAsTitle)
        {
            setTitle(mClientGame.mDisplayName);
        }
        game = getDelegate().getSupportActionBar();
        if (game != null)
        {
            game.setDisplayShowTitleEnabled(mShowTitleInActionBar);
        }
        setWindowBackground(mClientGame.mThemeColor);
        int i = 0;
        for (int j = mOnCurrentGameLoadedListeners.size(); i < j; i++)
        {
            mOnCurrentGameLoadedListeners.get(i);
        }

    }

    public void setWindowBackground(String s)
    {
        if (useGameThemeColorAsBackground())
        {
            mGameThemeColor = s;
            int i = UiUtils.parseThemeColor(s, 216);
            getWindow().getDecorView().setBackgroundColor(i);
            s = getDelegate().getSupportActionBar();
            if (s != null)
            {
                s.setBackgroundDrawable(new ColorDrawable(i));
            }
            return;
        } else
        {
            getWindow().getDecorView().setBackgroundResource(0x7f0200d8);
            return;
        }
    }

    public final void shareGame(String s, String s1)
    {
        String s2 = Games.getCurrentAccountName(getGoogleApiClient());
        GamesPlayLogger.logInGameAction(this, s1, mClientGame.mApplicationId, s2, 23);
        super.shareGame(s, s1);
    }

    public final void trackFragments()
    {
        if (mAttachedFragments == null)
        {
            mAttachedFragments = new ArrayList();
            return;
        } else
        {
            GamesLog.w("ClientUiFragAct", "trackFragments: should only be called once per activity");
            return;
        }
    }

    public boolean useGameThemeColorAsBackground()
    {
        return false;
    }
}

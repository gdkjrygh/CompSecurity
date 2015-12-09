// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.audience.dialogs.AudienceSelectionIntentBuilder;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.GmsIntents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.achievement.Achievement;
import com.google.android.gms.games.achievement.AchievementEntity;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.internal.GamesIntents;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.common.players.ProfileSummaryDialogFragment;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;
import com.google.android.gms.people.internal.PeopleUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.ui.util:
//            InboxCountAdapter, DialogFragmentUtil

public final class UiUtils
{
    public static final class Fade
    {

        public static void show(View view)
        {
            if (PlatformVersion.checkVersion(14)) goto _L2; else goto _L1
_L1:
            view.setVisibility(0);
_L4:
            return;
_L2:
            if (view.getVisibility() != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            boolean flag;
            if (view.getTag(0x7f0d0020) == "fading_out")
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag) goto _L4; else goto _L3
_L3:
            view.animate().cancel();
            view.setTag(0x7f0d0020, null);
            view.setAlpha(0.0F);
            view.setVisibility(0);
            view.animate().setDuration(250L);
            view.animate().alpha(1.0F);
            return;
        }
    }

    public static interface IdentitySharingOnClickListener
    {

        public abstract void onIdentitySharingAccepted(Invitation invitation);
    }


    private static void adjustChildrenForGar(ViewGroup viewgroup, int i)
    {
        int i1 = viewgroup.getChildCount();
        int j = 0;
        while (j < i1) 
        {
            Object obj = viewgroup.getChildAt(j);
            if (obj instanceof ViewGroup)
            {
                adjustChildrenForGar((ViewGroup)obj, i);
            } else
            {
                ColorMatrixColorFilter colormatrixcolorfilter = new ColorMatrixColorFilter(new ColorMatrix(new float[] {
                    0.0F, 0.0F, 0.0F, 0.0F, (float)i, 0.0F, 0.0F, 0.0F, 0.0F, (float)i, 
                    0.0F, 0.0F, 0.0F, 0.0F, (float)i, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F
                }));
                if (obj instanceof ImageButton)
                {
                    ((ImageButton)obj).setColorFilter(colormatrixcolorfilter);
                } else
                if (obj instanceof ActionMenuItemView)
                {
                    ActionMenuItemView actionmenuitemview = (ActionMenuItemView)obj;
                    obj = actionmenuitemview.getCompoundDrawables();
                    if (obj != null && obj.length == 4)
                    {
                        if (actionmenuitemview.getTag(0x7f0d0016) == null)
                        {
                            actionmenuitemview.setTag(0x7f0d0016, new Object());
                            Drawable adrawable[] = new Drawable[obj.length];
                            for (int k = 0; k < obj.length; k++)
                            {
                                if (obj[k] != null)
                                {
                                    adrawable[k] = obj[k].mutate();
                                }
                            }

                            actionmenuitemview.setCompoundDrawables(adrawable[0], adrawable[1], adrawable[2], adrawable[3]);
                            obj = adrawable;
                        }
                        int l = 0;
                        while (l < obj.length) 
                        {
                            Drawable drawable = obj[l];
                            if (drawable != null)
                            {
                                drawable.setColorFilter(colormatrixcolorfilter);
                            }
                            l++;
                        }
                    }
                } else
                if (obj instanceof ImageView)
                {
                    ((ImageView)obj).setColorFilter(colormatrixcolorfilter);
                }
            }
            j++;
        }
    }

    public static void adjustForGar(View view, int i)
    {
        if (view instanceof Toolbar)
        {
            adjustChildrenForGar((Toolbar)view, i);
        }
    }

    public static void bindTabViewData(Resources resources, View view, PagerAdapter pageradapter, int i)
    {
        ((TextView)view.findViewById(0x7f0d0075)).setText(pageradapter.getPageTitle(i));
        InboxCountAdapter inboxcountadapter = null;
        if (pageradapter instanceof InboxCountAdapter.InboxCountAdapterProvider)
        {
            inboxcountadapter = ((InboxCountAdapter.InboxCountAdapterProvider)pageradapter).getInboxCountAdapter();
        }
        int j = 0;
        if (inboxcountadapter != null)
        {
            j = inboxcountadapter.getPageInboxCount(i);
        }
        view = (TextView)view.findViewById(0x7f0d01a4);
        if (j > 0)
        {
            pageradapter = new GradientDrawable();
            if (j >= 10)
            {
                pageradapter.setShape(0);
                pageradapter.setCornerRadius(resources.getDimensionPixelSize(0x7f0c00e2));
            } else
            {
                pageradapter.setShape(1);
            }
            pageradapter.setColor(-1);
            if (PlatformVersion.checkVersion(16))
            {
                view.setBackground(pageradapter);
            } else
            {
                view.setBackgroundDrawable(pageradapter);
            }
            if (j > 99)
            {
                view.setText(0x7f100183);
            } else
            {
                view.setText(String.valueOf(j));
            }
            view.setVisibility(0);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    public static boolean checkClientDisconnected(GoogleApiClient googleapiclient, GamesFragmentActivity gamesfragmentactivity)
    {
        Asserts.checkNotNull(googleapiclient);
        Asserts.checkNotNull(gamesfragmentactivity);
        if (!googleapiclient.isConnected())
        {
            GamesLog.e("UiUtils", "googleApiClient not connected...calling activity.finish()");
            if (gamesfragmentactivity.mConfiguration.isClientUi())
            {
                GamesLog.i("UiUtils", "calling setResult RESULT_RECONNECT_REQUIRED on activity");
                gamesfragmentactivity.setResult(10001);
            }
            gamesfragmentactivity.finish();
            return true;
        } else
        {
            return false;
        }
    }

    public static double computeAverageLuminance(Bitmap bitmap, Rect rect)
    {
        double d;
        int i;
        int j;
        d = 0.0D;
        j = 0;
        i = rect.top;
_L2:
        if (i >= rect.bottom || i >= bitmap.getHeight())
        {
            break; /* Loop/switch isn't completed */
        }
        int k = rect.left;
        do
        {
label0:
            {
                int l;
                int i1;
                int j1;
                if (k < rect.right)
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
                if (k < bitmap.getWidth())
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (!((l & i1) != 0))
                {
                    break label0;
                }
                j1 = bitmap.getPixel(k, i);
                l = Color.red(j1);
                i1 = Color.blue(j1);
                j1 = Color.green(j1);
                d += 0.21260000000000001D * (double)l + 0.71519999999999995D * (double)j1 + 0.0722D * (double)i1;
                j++;
                k++;
            }
        } while (true);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return d / (double)j;
    }

    public static Drawable constructButtonBackground(Drawable drawable, int i, int j)
    {
        if (PlatformVersion.checkVersion(21))
        {
            drawable = new LayerDrawable(new Drawable[] {
                drawable
            });
            return new RippleDrawable(ColorStateList.valueOf(i), drawable, null);
        }
        Object obj;
        StateListDrawable statelistdrawable;
        if (drawable instanceof BitmapDrawable)
        {
            obj = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(((Bitmap) (obj)));
            float f = (float)((0xff000000 & i) >>> 24) / 255F;
            Object obj1 = new ColorMatrix(new float[] {
                0.0F, 0.0F, 0.0F, 0.0F, (float)(i & 0xff), 0.0F, 0.0F, 0.0F, 0.0F, (float)(i & 0xff), 
                0.0F, 0.0F, 0.0F, 0.0F, (float)(i & 0xff), 0.0F, 0.0F, 0.0F, f, 0.0F
            });
            BitmapDrawable bitmapdrawable = (BitmapDrawable)drawable.getConstantState().newDrawable();
            obj1 = new ColorMatrixColorFilter(((ColorMatrix) (obj1)));
            Paint paint = new Paint();
            paint.setColorFilter(((android.graphics.ColorFilter) (obj1)));
            canvas.drawBitmap(bitmapdrawable.getBitmap(), 0.0F, 0.0F, paint);
            obj = new BitmapDrawable(null, ((Bitmap) (obj)));
        } else
        {
            obj = new GradientDrawable();
            ((GradientDrawable) (obj)).setShape(1);
            ((GradientDrawable) (obj)).setColor(i);
        }
        obj = new LayerDrawable(new Drawable[] {
            drawable, obj
        });
        statelistdrawable = new StateListDrawable();
        statelistdrawable.addState(new int[] {
            0x10100a7
        }, ((Drawable) (obj)));
        statelistdrawable.addState(new int[] {
            0x101009c
        }, ((Drawable) (obj)));
        statelistdrawable.addState(new int[] {
            0x10100a1
        }, ((Drawable) (obj)));
        statelistdrawable.addState(new int[0], drawable);
        return statelistdrawable;
    }

    public static Drawable constructColorButtonBackground$548e7414(int i, int j)
    {
        GradientDrawable gradientdrawable = new GradientDrawable();
        gradientdrawable.setShape(1);
        gradientdrawable.setColor(i);
        return constructButtonBackground(gradientdrawable, j, 1);
    }

    public static Intent createAddUpdateCirclesIntent(Context context, String s, String s1, ArrayList arraylist)
    {
        AudienceSelectionIntentBuilder audienceselectionintentbuilder = new AudienceSelectionIntentBuilder("com.google.android.gms.common.acl.UPDATE_CIRCLES");
        audienceselectionintentbuilder.setAccountName(s);
        audienceselectionintentbuilder.setUpdatePersonId(PeopleUtils.gaiaIdToPeopleQualifiedId(s1));
        if (arraylist != null && arraylist.size() > 0)
        {
            audienceselectionintentbuilder.setInitialCircles(arraylist);
            context = context.getString(0x7f10011b);
        } else
        {
            context = context.getString(0x7f10011a);
        }
        audienceselectionintentbuilder.setTitleText(context);
        return audienceselectionintentbuilder.build();
    }

    public static Intent createPlayStoreIntent(Context context, String s, String s1)
    {
        context = context.getPackageName();
        boolean flag;
        if (context.equals("com.google.android.play.games") || context.equals("com.google.android.gms"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        context = GmsIntents.createPlayStoreIntent(s);
        if (s1 != null)
        {
            context.setData(context.getData().buildUpon().appendQueryParameter("pcampaignid", s1).build());
        }
        return context;
    }

    public static com.google.android.gms.games.ui.PlayHeaderListHelper.PlayHeaderListWrappable findPlayHeaderListWrappable(Fragment fragment)
    {
        Object obj1;
        boolean flag1;
label0:
        {
            obj1 = fragment.mActivity;
            boolean flag = false;
            Object obj = null;
            if (obj1 instanceof com.google.android.gms.games.ui.PlayHeaderListHelper.PlayHeaderListWrappable)
            {
                obj = (com.google.android.gms.games.ui.PlayHeaderListHelper.PlayHeaderListWrappable)obj1;
                flag = ((com.google.android.gms.games.ui.PlayHeaderListHelper.PlayHeaderListWrappable) (obj)).hasPlayHeader();
            }
            flag1 = flag;
            obj1 = obj;
            if (flag)
            {
                break label0;
            }
            Object obj2 = fragment;
            do
            {
                flag1 = flag;
                fragment = ((Fragment) (obj));
                if (obj2 instanceof com.google.android.gms.games.ui.PlayHeaderListHelper.PlayHeaderListWrappable)
                {
                    fragment = (com.google.android.gms.games.ui.PlayHeaderListHelper.PlayHeaderListWrappable)obj2;
                    flag = fragment.hasPlayHeader();
                    flag1 = flag;
                    obj1 = fragment;
                    if (flag)
                    {
                        break label0;
                    }
                    flag1 = flag;
                }
                obj1 = obj2;
                if (obj2 != null)
                {
                    obj1 = ((Fragment) (obj2)).mParentFragment;
                }
                flag = flag1;
                obj = fragment;
                obj2 = obj1;
            } while (obj1 != null);
            obj1 = fragment;
        }
        if (flag1)
        {
            return ((com.google.android.gms.games.ui.PlayHeaderListHelper.PlayHeaderListWrappable) (obj1));
        } else
        {
            return null;
        }
    }

    public static int getActionBarColorForFragment(Fragment fragment)
    {
        fragment = findPlayHeaderListWrappable(fragment);
        boolean flag;
        if (fragment != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return getActionBarColorFromWrappable(fragment);
    }

    public static int getActionBarColorFromWrappable(com.google.android.gms.games.ui.PlayHeaderListHelper.PlayHeaderListWrappable playheaderlistwrappable)
    {
        Asserts.checkState(true);
        Activity activity = playheaderlistwrappable.getPlayHeaderActivity();
        if ((activity instanceof GamesFragmentActivity) && ((GamesFragmentActivity)activity).mConfiguration.isDestinationUi())
        {
            return activity.getResources().getColor(0x7f0b0257);
        } else
        {
            TypedValue typedvalue = new TypedValue();
            playheaderlistwrappable.getPlayHeaderActivity().getTheme().resolveAttribute(0x7f01013c, typedvalue, true);
            return typedvalue.data;
        }
    }

    public static String getActualDateTimeString(Context context, long l)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar();
        gregoriancalendar.set(11, 0);
        gregoriancalendar.set(12, 0);
        gregoriancalendar.set(13, 0);
        gregoriancalendar.set(14, 0);
        gregoriancalendar.add(5, -1);
        if (l >= gregoriancalendar.getTimeInMillis())
        {
            return DateUtils.getRelativeDateTimeString(context, l, 0x5265c00L, 0x5265c00L, 0).toString();
        } else
        {
            return DateUtils.getRelativeTimeSpanString(context, l).toString();
        }
    }

    public static Context getDestinationAppContext(Context context)
    {
        if (context.getPackageName().equals("com.google.android.play.games"))
        {
            return context;
        }
        try
        {
            context = context.createPackageContext("com.google.android.play.games", 3);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static int getDestinationAppVersion(Context context)
    {
        context = context.getPackageManager();
        int i;
        try
        {
            i = context.getPackageInfo("com.google.android.play.games", 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("UiUtils", "Cannot find the installed destination app. Something is clearly wrong.");
            return 0;
        }
        return i;
    }

    public static String getDestinationAppVersionName(Context context)
    {
        context = context.getPackageManager();
        try
        {
            context = context.getPackageInfo("com.google.android.play.games", 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("UiUtils", "Cannot find the installed destination app. Something is clearly wrong.");
            return "";
        }
        return context;
    }

    public static ArrayList getDisplayOrderedParticipants(ArrayList arraylist)
    {
        ArrayList arraylist1 = new ArrayList(arraylist.size());
        ArrayList arraylist2 = new ArrayList(arraylist.size());
        int i = 0;
        int j = arraylist.size();
        while (i < j) 
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getPlayer() != null)
            {
                arraylist1.add(participant);
            } else
            {
                arraylist2.add(participant);
            }
            i++;
        }
        arraylist1.addAll(arraylist2);
        return arraylist1;
    }

    public static int getLevelColor(Resources resources, int i)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "The level must be higher or equal to 1");
        resources = resources.getIntArray(0x7f090001);
        return resources[(i - 1) % resources.length];
    }

    public static int getLevelColorForBackground(Resources resources, int i)
    {
        i = getLevelColor(resources, i);
        resources = new float[3];
        Color.colorToHSV(i, resources);
        resources[2] = resources[2] * 0.5F;
        return Color.HSVToColor(resources);
    }

    public static String getMatchElapsedTimeString(Context context, long l)
    {
        long l1 = System.currentTimeMillis();
        long l2 = l1 - l;
        if (l2 <= 60000L)
        {
            return context.getResources().getString(0x7f1001db);
        }
        if (l2 < 0x240c8400L)
        {
            return DateUtils.getRelativeTimeSpanString(l, l1, 1000L).toString();
        } else
        {
            return DateUtils.getRelativeTimeSpanString(context, l).toString();
        }
    }

    public static int getOnyxCardType(int i, boolean flag)
    {
        int j = i;
        if (i == 1)
        {
            j = i;
            if (flag)
            {
                j = 2;
            }
        }
        i = j;
        switch (j)
        {
        case 6: // '\006'
        default:
            i = 5;
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
            return i;
        }
    }

    public static String getPlayerLevelContentDescription(Context context, Player player)
    {
        player = player.getLevelInfo();
        if (player != null && ((PlayerLevelInfo) (player)).mCurrentLevel != null)
        {
            return context.getString(0x7f1000a2, new Object[] {
                Integer.valueOf(((PlayerLevelInfo) (player)).mCurrentLevel.mLevelNumber)
            });
        } else
        {
            return "";
        }
    }

    public static Object getValidTag(View view)
    {
        view = ((View) (view.getTag()));
        if (!(view instanceof Freezable) || ((Freezable)view).isDataValid())
        {
            return view;
        } else
        {
            return null;
        }
    }

    public static void heightAdjustLeftTextViewDrawable(TextView textview, float f)
    {
        float f1 = textview.getTextSize();
        Drawable adrawable[] = textview.getCompoundDrawables();
        if (adrawable != null && adrawable.length > 0)
        {
            Object obj = adrawable[0];
            f = (float)((Drawable) (obj)).getIntrinsicHeight() / f1 / f;
            if (f != 1.0F)
            {
                int i = (int)((float)((Drawable) (obj)).getIntrinsicHeight() / f);
                int j = (int)((float)((Drawable) (obj)).getIntrinsicWidth() / f);
                obj = Bitmap.createScaledBitmap(((BitmapDrawable)obj).getBitmap(), j, i, false);
                textview.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(textview.getResources(), ((Bitmap) (obj))), null, null, null);
            }
        }
    }

    public static void hideViewAndItsDescendantsFromAccessibilityServices(View view)
    {
        if (PlatformVersion.checkVersion(16))
        {
            view.setImportantForAccessibility(4);
        }
    }

    public static void hideViewFromAccessibilityServices(View view)
    {
        if (PlatformVersion.checkVersion(16))
        {
            view.setImportantForAccessibility(2);
        }
    }

    public static int interpolateColor(int i, int j, float f)
    {
        float f1 = 1.0F - f;
        return (int)((float)(i >> 24 & 0xff) * f + (float)(j >> 24 & 0xff) * f1) << 24 | (int)((float)(i >> 16 & 0xff) * f + (float)(j >> 16 & 0xff) * f1) << 16 | (int)((float)(i >> 8 & 0xff) * f + (float)(j >> 8 & 0xff) * f1) << 8 | (int)((float)(i & 0xff) * f + (float)(j & 0xff) * f1);
    }

    public static boolean isDestinationAppInstalled(Context context)
    {
        context = context.getPackageManager();
        try
        {
            context.getApplicationInfo("com.google.android.play.games", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    public static boolean isNetworkError(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return true;
        }
    }

    public static void launchGame(Context context, Game game, Bundle bundle)
    {
        Asserts.checkNotNull(game);
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle1.putParcelable("com.google.android.gms.games.GAME", new GameEntity(game));
        game = new Intent("com.google.android.gms.games.LAUNCH_GAME");
        game.putExtras(bundle1);
        context.sendBroadcast(game);
        game.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.sendBroadcast(game);
    }

    public static void launchGameForInvitation(Context context, String s, Game game, Invitation invitation)
    {
        Asserts.checkNotNull(s);
        Asserts.checkNotNull(game);
        Asserts.checkNotNull(invitation);
        Bundle bundle = new Bundle();
        bundle.putParcelable("invitation", (Parcelable)invitation.freeze());
        GamesIntents.addObfuscatedAccount(bundle, s);
        launchGame(context, game, bundle);
    }

    public static void launchGameForQuest(Context context, String s, Game game, Quest quest)
    {
        Asserts.checkNotNull(s);
        Asserts.checkNotNull(game);
        Asserts.checkNotNull(quest);
        Bundle bundle = new Bundle();
        bundle.putParcelable("quest", (Parcelable)quest.freeze());
        GamesIntents.addObfuscatedAccount(bundle, s);
        launchGame(context, game, bundle);
    }

    public static void launchGameForRequest(Context context, String s, Game game, ArrayList arraylist)
    {
        Asserts.checkNotNull(s);
        Asserts.checkNotNull(game);
        Asserts.checkNotNull(arraylist);
        int i;
        boolean flag;
        if (!arraylist.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            arraylist.add(i, ((GameRequest)arraylist.remove(i)).freeze());
        }

        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("requests", arraylist);
        GamesIntents.addObfuscatedAccount(bundle, s);
        launchGame(context, game, bundle);
    }

    public static void launchGameForSnapshot(Context context, String s, Game game, SnapshotMetadata snapshotmetadata)
    {
        Asserts.checkNotNull(s);
        Asserts.checkNotNull(game);
        Asserts.checkNotNull(snapshotmetadata);
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.games.SNAPSHOT_METADATA", (Parcelable)snapshotmetadata.freeze());
        GamesIntents.addObfuscatedAccount(bundle, s);
        launchGame(context, game, bundle);
    }

    public static void launchGameForTurnBasedMatch(Context context, String s, Game game, TurnBasedMatch turnbasedmatch)
    {
        Asserts.checkNotNull(game);
        Asserts.checkNotNull(turnbasedmatch);
        Bundle bundle = new Bundle();
        bundle.putParcelable("turn_based_match", (Parcelable)turnbasedmatch.freeze());
        GamesIntents.addObfuscatedAccount(bundle, s);
        launchGame(context, game, bundle);
    }

    public static void launchNearbyLearnMore(Context context)
    {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)G.playGamesNearbyPlayersWebpageUrl.get())));
    }

    public static int parseThemeColor(String s, int i)
    {
        if (TextUtils.isEmpty(s))
        {
            return i << 24 | 0x456b;
        }
        String s1 = s;
        if (s.startsWith("#"))
        {
            s1 = s.substring(1);
        }
        long l1 = Long.parseLong(s1, 16);
        int j = s1.length();
        long l = l1;
        if (j != 6)
        {
            l = l1;
            if (j != 8)
            {
                l = 17771L;
            }
        }
        return (int)((long)(i << 24) | 0xffffffL & l);
    }

    public static void sendAccessibilityEventWithText(Context context, String s, View view)
    {
        AccessibilityManager accessibilitymanager = (AccessibilityManager)context.getSystemService("accessibility");
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = accessibilitymanager.isTouchExplorationEnabled();
        } else
        {
            flag = accessibilitymanager.isEnabled();
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        char c;
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            continue; /* Loop/switch isn't completed */
        }
        c = '\u4000';
_L4:
        AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(c);
        accessibilityevent.getText().add(s);
        accessibilityevent.setEnabled(true);
        if (view != null)
        {
            s = AccessibilityEventCompat.asRecord(accessibilityevent);
            AccessibilityRecordCompat.IMPL.setSource(((AccessibilityRecordCompat) (s)).mRecord, view);
        }
        ((AccessibilityManager)context.getSystemService("accessibility")).sendAccessibilityEvent(accessibilityevent);
        return;
        if (view == null) goto _L1; else goto _L3
_L3:
        c = '\b';
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static void setSmallMetagameAvatarSizes(MetagameAvatarView metagameavatarview)
    {
        Asserts.checkNotNull(metagameavatarview);
        metagameavatarview.setOutlineStrokeWidthResId(0x7f0c010f);
        metagameavatarview.setShadowStrokeWidthResId(0x7f0c0110);
    }

    public static transient void setVisible(boolean flag, int i, View aview[])
    {
        if (flag)
        {
            i = 0;
        }
        int k = aview.length;
        for (int j = 0; j < k; j++)
        {
            aview[j].setVisibility(i);
        }

    }

    public static boolean shouldShowIdentitySharingDialog(Invitation invitation)
    {
        return invitation.getInvitationType() == 1 && invitation.getAvailableAutoMatchSlots() > 0;
    }

    public static void showPopularMultiplayer(GamesFragmentActivity gamesfragmentactivity)
    {
        if (gamesfragmentactivity.mConfiguration.isDestinationUi())
        {
            Intent intent = new Intent("com.google.android.gms.games.destination.VIEW_SHOP_GAMES_LIST");
            intent.putExtra("com.google.android.gms.games.TAB", 2);
            gamesfragmentactivity.startActivity(intent);
            return;
        } else
        {
            GamesLog.w("UiUtils", "showPopularMultiplayer: Trying to show Popular Multiplayer screen when not in the destination app");
            return;
        }
    }

    public static void showProfileSummaryDialog(FragmentActivity fragmentactivity, Player player, boolean flag)
    {
        DialogFragmentUtil.show(fragmentactivity, ProfileSummaryDialogFragment.newInstance(player, flag), "com.google.android.gms.games.ui.dialog.profileSummaryDialog");
    }

    public static void slideViewToTop$5359d8d9(View view)
    {
        TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, view.getHeight(), 0.0F);
        translateanimation.setDuration(300L);
        translateanimation.setFillAfter(true);
        translateanimation.setInterpolator(new DecelerateInterpolator());
        view.startAnimation(translateanimation);
    }

    public static void startActivityForResultFromFragment(Fragment fragment, Intent intent, int i)
    {
        Fragment fragment1 = fragment.mParentFragment;
        if (fragment1 != null)
        {
            fragment1.startActivityForResult(intent, i);
            return;
        } else
        {
            fragment.startActivityForResult(intent, i);
            return;
        }
    }

    public static void viewAchievementDescription(GoogleApiClient googleapiclient, Context context, GamesUiConfiguration gamesuiconfiguration, Achievement achievement)
    {
        achievement = (AchievementEntity)achievement.freeze();
        if (gamesuiconfiguration.isDestinationUi())
        {
            googleapiclient = new Intent("com.google.android.gms.games.destination.ACTION_VIEW_ACHIEVEMENT_DESCRIPTION");
            googleapiclient.putExtra("com.google.android.gms.games.ACHIEVEMENT", achievement);
        } else
        {
            googleapiclient = Games.Achievements.getAchievementDescriptionIntentRestricted(googleapiclient, achievement);
        }
        context.startActivity(googleapiclient);
    }

    public static void viewDestAppParticipantList(Context context, GoogleApiClient googleapiclient, ArrayList arraylist, int i, String s, String s1, Game game)
    {
        viewParticipantList(context, googleapiclient, arraylist, i, s, s1, game, true);
    }

    public static void viewInPlayStore(Context context, String s, String s1)
    {
        s = createPlayStoreIntent(context, s, (new StringBuilder()).append(s1).append("_").append(G.gamesPlayNowOrdering.get()).append("_").append(G.playNowCardType.get()).toString());
        try
        {
            context.startActivity(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("UiUtils", "Unable to launch play store intent", context);
        }
    }

    public static void viewMyProfile(GamesFragmentActivity gamesfragmentactivity, Player player, SharedElementTransition sharedelementtransition)
    {
        Asserts.checkState(gamesfragmentactivity.mConfiguration.isDestinationUi());
        Intent intent = new Intent("com.google.android.gms.games.destination.VIEW_MY_PROFILE");
        if (player != null)
        {
            intent.putExtra("com.google.android.gms.games.PLAYER", (Parcelable)player.freeze());
        }
        if (sharedelementtransition != null)
        {
            sharedelementtransition.startActivity(gamesfragmentactivity, intent);
            return;
        } else
        {
            gamesfragmentactivity.startActivity(intent);
            return;
        }
    }

    public static void viewParticipantList(Context context, GoogleApiClient googleapiclient, ArrayList arraylist, int i, String s, String s1, Game game)
    {
        viewParticipantList(context, googleapiclient, arraylist, i, s, s1, game, false);
    }

    private static void viewParticipantList(Context context, GoogleApiClient googleapiclient, ArrayList arraylist, int i, String s, String s1, Game game, boolean flag)
    {
        Preconditions.checkNotNull(s1);
        Preconditions.checkNotNull(s);
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("UiUtils", "googleApiClient not connected, ignoring request for participant list");
        } else
        if (arraylist.size() + i > 0)
        {
            ParticipantEntity aparticipantentity[] = new ParticipantEntity[arraylist.size() + i];
            Object obj = null;
            int k = 0;
            int i1 = arraylist.size();
            int j = 0;
            while (k < i1) 
            {
                Participant participant = (Participant)arraylist.get(k);
                Player player = participant.getPlayer();
                if (player == null || !player.getPlayerId().equals(s1))
                {
                    int l = j + 1;
                    aparticipantentity[j] = (ParticipantEntity)participant.freeze();
                    j = l;
                } else
                {
                    obj = participant;
                }
                k++;
            }
            if (obj != null)
            {
                aparticipantentity[j + i] = (ParticipantEntity)((Participant) (obj)).freeze();
            }
            arraylist = game.getFeaturedImageUri();
            obj = game.getIconImageUri();
            if (!flag)
            {
                context.startActivity(Games.Multiplayer.getParticipantListIntentRestricted(googleapiclient, aparticipantentity, game.getApplicationId(), s, s1, arraylist, ((Uri) (obj))));
                return;
            } else
            {
                googleapiclient = new Intent("com.google.android.gms.games.destination.VIEW_PARTICIPANT_LIST");
                googleapiclient.putExtra("com.google.android.gms.games.PARTICIPANTS", aparticipantentity);
                googleapiclient.putExtra("com.google.android.gms.games.ACCOUNT_NAME", s);
                googleapiclient.putExtra("com.google.android.gms.games.PLAYER_ID", s1);
                googleapiclient.putExtra("com.google.android.gms.games.FEATURED_URI", arraylist);
                googleapiclient.putExtra("com.google.android.gms.games.ICON_URI", ((Parcelable) (obj)));
                googleapiclient.putExtra("com.google.android.gms.games.GAME_ID", game.getApplicationId());
                context.startActivity(googleapiclient);
                return;
            }
        }
    }

    public static void viewProfileComparison(GamesFragmentActivity gamesfragmentactivity, Player player, SharedElementTransition sharedelementtransition)
    {
        Asserts.checkState(gamesfragmentactivity.mConfiguration.isDestinationUi());
        Intent intent = new Intent("com.google.android.gms.games.destination.VIEW_PROFILE_COMPARISON");
        intent.putExtra("com.google.android.gms.games.OTHER_PLAYER", (Parcelable)player.freeze());
        if (sharedelementtransition != null)
        {
            sharedelementtransition.startActivity(gamesfragmentactivity, intent);
            return;
        } else
        {
            gamesfragmentactivity.startActivity(intent);
            return;
        }
    }

    // Unreferenced inner class com/google/android/gms/games/ui/util/UiUtils$2

/* anonymous class */
    public static final class _cls2
        implements android.support.v7.widget.PopupMenu.OnDismissListener
    {

        final ImageView val$overflowImageView;

        public final void onDismiss$add183e()
        {
            overflowImageView.setImageResource(0x7f0201b3);
        }

            public 
            {
                overflowImageView = imageview;
                super();
            }
    }

}

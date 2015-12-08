// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.WindowManager;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.List;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.ui.RemoteActivity;

// Referenced classes of package org.xbmc.kore.utils:
//            CharacterDrawable, Utils, NetUtils

public class UIUtils
{

    private static int avatarColorsIdx = 0;
    private static TypedArray characterAvatarColors = null;
    static int iconPauseResId = 0x7f020070;
    static int iconPlayResId = 0x7f020074;
    public static boolean playPauseIconsLoaded = false;

    public static String formatFileSize(int i)
    {
        if (i <= 0)
        {
            return null;
        }
        if (i < 1024)
        {
            return (new StringBuilder()).append(i).append("B").toString();
        }
        if (i < 0x100000)
        {
            return String.format("%.1f KB", new Object[] {
                Double.valueOf((double)i / 1024D)
            });
        }
        if (i < 0x40000000)
        {
            return String.format("%.1f MB", new Object[] {
                Double.valueOf((double)i / 1048576D)
            });
        } else
        {
            return String.format("%.1f GB", new Object[] {
                Double.valueOf((double)i / 1073741824D)
            });
        }
    }

    public static String formatTime(int i)
    {
        return formatTime(i / 3600, (i % 3600) / 60, i % 3600 % 60);
    }

    public static String formatTime(int i, int j, int k)
    {
        if (i > 0)
        {
            return String.format("%d:%02d:%02d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
            });
        } else
        {
            return String.format("%1d:%02d", new Object[] {
                Integer.valueOf(j), Integer.valueOf(k)
            });
        }
    }

    public static String formatTime(org.xbmc.kore.jsonrpc.type.GlobalType.Time time)
    {
        return formatTime(time.hours, time.minutes, time.seconds);
    }

    public static CharacterDrawable getCharacterAvatar(Context context, String s)
    {
        int i = 0;
        if (characterAvatarColors == null)
        {
            characterAvatarColors = context.getResources().obtainTypedArray(0x7f0c0000);
        }
        char c;
        if (TextUtils.isEmpty(s))
        {
            c = ' ';
        } else
        {
            c = s.charAt(0);
        }
        if (!TextUtils.isEmpty(s))
        {
            i = Math.max(Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(s.length() - 1)) + s.length(), 0) % characterAvatarColors.length();
        }
        avatarColorsIdx = i;
        return new CharacterDrawable(c, characterAvatarColors.getColor(avatarColorsIdx, 0xff000000));
    }

    public static int getThemeResourceId(String s)
    {
        switch (Integer.valueOf(s).intValue())
        {
        case 0: // '\0'
        default:
            return 0x7f0900ac;

        case 1: // '\001'
            return 0x7f0900a8;

        case 2: // '\002'
            return 0x7f0900ab;

        case 3: // '\003'
            return 0x7f0900ae;

        case 4: // '\004'
            return 0x7f0900ad;
        }
    }

    public static void handleVibration(Context context)
    {
        Vibrator vibrator;
        if (context != null)
        {
            if ((vibrator = (Vibrator)context.getSystemService("vibrator")).hasVibrator() && PreferenceManager.getDefaultSharedPreferences(context).getBoolean("pref_vibrate_remote_buttons", false))
            {
                vibrator.vibrate(50L);
                return;
            }
        }
    }

    public static void loadImageIntoImageview(HostManager hostmanager, String s, ImageView imageview, int i, int j)
    {
        if (i > 0 && j > 0)
        {
            hostmanager.getPicasso().load(hostmanager.getHostInfo().getImageUrl(s)).resize(i, j).centerCrop().into(imageview);
            return;
        } else
        {
            hostmanager.getPicasso().load(hostmanager.getHostInfo().getImageUrl(s)).fit().centerCrop().into(imageview);
            return;
        }
    }

    public static void loadImageWithCharacterAvatar(Context context, HostManager hostmanager, String s, String s1, ImageView imageview, int i, int j)
    {
        context = getCharacterAvatar(context, s1);
        if (TextUtils.isEmpty(s))
        {
            imageview.setImageDrawable(context);
            return;
        }
        if (i > 0 && j > 0)
        {
            hostmanager.getPicasso().load(hostmanager.getHostInfo().getImageUrl(s)).placeholder(context).resize(i, j).centerCrop().into(imageview);
            return;
        } else
        {
            hostmanager.getPicasso().load(hostmanager.getHostInfo().getImageUrl(s)).fit().centerCrop().into(imageview);
            return;
        }
    }

    public static void sendWolAsync(Context context, HostInfo hostinfo)
    {
        if (hostinfo == null)
        {
            return;
        } else
        {
            (new Thread(new Runnable(hostinfo) {

                final HostInfo val$hostInfo;

                public void run()
                {
                    NetUtils.sendWolMagicPacket(hostInfo.getMacAddress(), hostInfo.getAddress(), hostInfo.getWolPort());
                }

            
            {
                hostInfo = hostinfo;
                super();
            }
            })).start();
            Toast.makeText(context, 0x7f0700c9, 0).show();
            return;
        }
    }

    public static void setPlayPauseButtonIcon(Context context, ImageView imageview, int i)
    {
        if (!playPauseIconsLoaded)
        {
            context = context.obtainStyledAttributes(new int[] {
                0x7f010029, 0x7f01002b
            });
            iconPauseResId = context.getResourceId(0, 0x7f020070);
            iconPlayResId = context.getResourceId(1, 0x7f020074);
            context.recycle();
            playPauseIconsLoaded = true;
        }
        if (i == 1)
        {
            i = iconPauseResId;
        } else
        {
            i = iconPlayResId;
        }
        imageview.setImageResource(i);
    }

    public static void setupCastInfo(Activity activity, List list, GridLayout gridlayout, Intent intent)
    {
        HostManager hostmanager = HostManager.getInstance(activity);
        Resources resources = activity.getResources();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)activity.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener(activity) {

            final Activity val$activity;

            public void onClick(View view2)
            {
                Utils.openImdbForPerson(activity, (String)view2.getTag());
            }

            
            {
                activity = activity1;
                super();
            }
        };
        gridlayout.removeAllViews();
        int i = gridlayout.getColumnCount();
        int j = i * resources.getInteger(0x7f0b0001);
        int k = resources.getDimensionPixelSize(0x7f080092);
        int l = resources.getDimensionPixelSize(0x7f080081);
        k = (displaymetrics.widthPixels - k * 2 - i * (l * 2)) / i;
        l = (int)((double)k * 1.5D);
        i = 0;
        while (i < Math.min(list.size(), j)) 
        {
            Object obj = (org.xbmc.kore.jsonrpc.type.VideoType.Cast)list.get(i);
            View view = LayoutInflater.from(activity).inflate(0x7f03003a, gridlayout, false);
            ImageView imageview = (ImageView)view.findViewById(0x7f0e00b7);
            TextView textview = (TextView)view.findViewById(0x7f0e00b6);
            TextView textview1 = (TextView)view.findViewById(0x7f0e00b9);
            view.getLayoutParams().width = k;
            view.getLayoutParams().height = l;
            view.setTag(((org.xbmc.kore.jsonrpc.type.VideoType.Cast) (obj)).name);
            loadImageWithCharacterAvatar(activity, hostmanager, ((org.xbmc.kore.jsonrpc.type.VideoType.Cast) (obj)).thumbnail, ((org.xbmc.kore.jsonrpc.type.VideoType.Cast) (obj)).name, imageview, k, l);
            if (i == j - 1 && list.size() > i + 1)
            {
                obj = view.findViewById(0x7f0e00b8);
                View view1 = view.findViewById(0x7f0e00ba);
                textview = (TextView)view.findViewById(0x7f0e00bb);
                ((View) (obj)).setVisibility(8);
                view1.setVisibility(0);
                textview.setText(String.format(activity.getString(0x7f0700e5), new Object[] {
                    Integer.valueOf((list.size() - j) + 1)
                }));
                view.setOnClickListener(new android.view.View.OnClickListener(activity, intent) {

                    final Activity val$activity;
                    final Intent val$allCastActivityLaunchIntent;

                    public void onClick(View view2)
                    {
                        activity.startActivity(allCastActivityLaunchIntent);
                        activity.overridePendingTransition(0x7f04000a, 0x7f04000b);
                    }

            
            {
                activity = activity1;
                allCastActivityLaunchIntent = intent;
                super();
            }
                });
            } else
            {
                textview.setText(((org.xbmc.kore.jsonrpc.type.VideoType.Cast) (obj)).name);
                textview1.setText(((org.xbmc.kore.jsonrpc.type.VideoType.Cast) (obj)).role);
                view.setOnClickListener(onclicklistener);
            }
            gridlayout.addView(view);
            i++;
        }
    }

    public static void switchToRemoteWithAnimation(Context context, int i, int j, View view)
    {
        Intent intent = new Intent(context, org/xbmc/kore/ui/RemoteActivity);
        if (Utils.isLollipopOrLater())
        {
            Animator animator = ViewAnimationUtils.createCircularReveal(view, i, j, 0.0F, Math.max(view.getHeight(), view.getWidth()));
            animator.setDuration(200L);
            animator.addListener(new android.animation.Animator.AnimatorListener(context, intent) {

                final Context val$context;
                final Intent val$launchIntent;

                public void onAnimationCancel(Animator animator1)
                {
                }

                public void onAnimationEnd(Animator animator1)
                {
                    context.startActivity(launchIntent);
                }

                public void onAnimationRepeat(Animator animator1)
                {
                }

                public void onAnimationStart(Animator animator1)
                {
                }

            
            {
                context = context1;
                launchIntent = intent;
                super();
            }
            });
            view.setVisibility(0);
            animator.start();
            return;
        } else
        {
            context.startActivity(intent);
            return;
        }
    }

}

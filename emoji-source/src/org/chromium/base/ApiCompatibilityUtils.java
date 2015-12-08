// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.animation.ValueAnimator;
import android.app.ActivityOptions;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RemoteViews;
import android.widget.TextView;

public class ApiCompatibilityUtils
{

    private static final String TAG = "ApiCompatibilityUtils";

    private ApiCompatibilityUtils()
    {
    }

    public static Notification build(android.app.Notification.Builder builder)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return builder.build();
        } else
        {
            return builder.getNotification();
        }
    }

    public static String getCreatorPackage(PendingIntent pendingintent)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return pendingintent.getCreatorPackage();
        } else
        {
            return pendingintent.getTargetPackage();
        }
    }

    private static long getFrameTime()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return ValueAnimator.getFrameDelay();
        } else
        {
            return 10L;
        }
    }

    public static int getLayoutDirection(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return configuration.getLayoutDirection();
        } else
        {
            return 0;
        }
    }

    public static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return marginlayoutparams.getMarginEnd();
        } else
        {
            return marginlayoutparams.rightMargin;
        }
    }

    public static int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return marginlayoutparams.getMarginStart();
        } else
        {
            return marginlayoutparams.leftMargin;
        }
    }

    public static int getPaddingEnd(View view)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return view.getPaddingEnd();
        } else
        {
            return view.getPaddingRight();
        }
    }

    public static int getPaddingStart(View view)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return view.getPaddingStart();
        } else
        {
            return view.getPaddingLeft();
        }
    }

    public static boolean isHTMLClipboardSupported()
    {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

    public static boolean isLayoutRtl(View view)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return view.getLayoutDirection() == 1;
        } else
        {
            return false;
        }
    }

    public static boolean isPrintingSupported()
    {
        return android.os.Build.VERSION.SDK_INT >= 19;
    }

    public static void postInvalidateOnAnimation(View view)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.postInvalidateOnAnimation();
            return;
        } else
        {
            view.postInvalidate();
            return;
        }
    }

    public static void postOnAnimation(View view, Runnable runnable)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.postOnAnimation(runnable);
            return;
        } else
        {
            view.postDelayed(runnable, getFrameTime());
            return;
        }
    }

    public static void postOnAnimationDelayed(View view, Runnable runnable, long l)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.postOnAnimationDelayed(runnable, l);
            return;
        } else
        {
            view.postDelayed(runnable, getFrameTime() + l);
            return;
        }
    }

    public static void removeOnGlobalLayoutListener(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(ongloballayoutlistener);
            return;
        } else
        {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(ongloballayoutlistener);
            return;
        }
    }

    public static void setBackgroundForView(View view, Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.setBackground(drawable);
            return;
        } else
        {
            view.setBackgroundDrawable(drawable);
            return;
        }
    }

    public static void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
    {
        if (android.os.Build.VERSION.SDK_INT == 17)
        {
            boolean flag = isLayoutRtl(textview);
            Drawable drawable4;
            if (flag)
            {
                drawable4 = drawable2;
            } else
            {
                drawable4 = drawable;
            }
            if (!flag)
            {
                drawable = drawable2;
            }
            textview.setCompoundDrawables(drawable4, drawable1, drawable, drawable3);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT > 17)
        {
            textview.setCompoundDrawablesRelative(drawable, drawable1, drawable2, drawable3);
            return;
        } else
        {
            textview.setCompoundDrawables(drawable, drawable1, drawable2, drawable3);
            return;
        }
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
    {
        if (android.os.Build.VERSION.SDK_INT == 17)
        {
            boolean flag = isLayoutRtl(textview);
            int i1;
            if (flag)
            {
                i1 = k;
            } else
            {
                i1 = i;
            }
            if (!flag)
            {
                i = k;
            }
            textview.setCompoundDrawablesWithIntrinsicBounds(i1, j, i, l);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT > 17)
        {
            textview.setCompoundDrawablesRelativeWithIntrinsicBounds(i, j, k, l);
            return;
        } else
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(i, j, k, l);
            return;
        }
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
    {
        if (android.os.Build.VERSION.SDK_INT == 17)
        {
            boolean flag = isLayoutRtl(textview);
            Drawable drawable4;
            if (flag)
            {
                drawable4 = drawable2;
            } else
            {
                drawable4 = drawable;
            }
            if (!flag)
            {
                drawable = drawable2;
            }
            textview.setCompoundDrawablesWithIntrinsicBounds(drawable4, drawable1, drawable, drawable3);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT > 17)
        {
            textview.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
            return;
        } else
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
            return;
        }
    }

    public static void setContentDescriptionForRemoteView(RemoteViews remoteviews, int i, CharSequence charsequence)
    {
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            remoteviews.setContentDescription(i, charsequence);
        }
    }

    public static void setImageAlpha(ImageView imageview, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            imageview.setImageAlpha(i);
            return;
        } else
        {
            imageview.setAlpha(i);
            return;
        }
    }

    public static void setLayoutDirection(View view, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            view.setLayoutDirection(i);
        }
    }

    public static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            marginlayoutparams.setMarginEnd(i);
            return;
        } else
        {
            marginlayoutparams.rightMargin = i;
            return;
        }
    }

    public static void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            marginlayoutparams.setMarginStart(i);
            return;
        } else
        {
            marginlayoutparams.leftMargin = i;
            return;
        }
    }

    public static void setPaddingRelative(View view, int i, int j, int k, int l)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            view.setPaddingRelative(i, j, k, l);
            return;
        } else
        {
            view.setPadding(i, j, k, l);
            return;
        }
    }

    public static void setTextAlignment(View view, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            view.setTextAlignment(i);
        }
    }

    public static void setTextDirection(View view, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            view.setTextDirection(i);
        }
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            context.startActivity(intent, bundle);
            return;
        } else
        {
            context.startActivity(intent);
            return;
        }
    }

    public static Bundle toBundle(ActivityOptions activityoptions)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return activityoptions.toBundle();
        } else
        {
            return null;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package wei.mark.standout;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import wei.mark.standout.a.a;
import wei.mark.standout.ui.Window;

// Referenced classes of package wei.mark.standout:
//            c, b

public abstract class StandOutWindow extends Service
{
    public class StandOutLayoutParams extends android.view.WindowManager.LayoutParams
    {

        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        final StandOutWindow f;

        public final void a(boolean flag)
        {
            if (flag)
            {
                flags = flags ^ 8;
                return;
            } else
            {
                flags = flags | 8;
                return;
            }
        }

        private StandOutLayoutParams(int i)
        {
            f = StandOutWindow.this;
            super(200, 200, 2002, 0x40020, -3);
            int j = getFlags(i);
            a(false);
            if (!wei.mark.standout.b.a(j, wei.mark.standout.a.a.j))
            {
                flags = flags | 0x200;
            }
            j = width;
            int k = f.mWindowManager.getDefaultDisplay().getWidth();
            x = (StandOutWindow.sWindowCache.a() * 100 + i * 100) % (k - j);
            j = height;
            standoutwindow = f.mWindowManager.getDefaultDisplay();
            k = getWidth();
            int l = getHeight();
            int i1 = StandOutWindow.sWindowCache.a();
            int j1 = x;
            y = ((i * 100 * 200) / (k - width) + j1 + i1 * 100) % (l - j);
            gravity = 51;
            a = 10;
            c = 0;
            b = 0;
            e = 0x7fffffff;
            d = 0x7fffffff;
        }

        private StandOutLayoutParams(int i, int j, int k)
        {
            this(i);
            width = j;
            height = k;
        }

        public StandOutLayoutParams(int i, int j, int k, int l, int i1)
        {
            this(i, j, k);
            if (l != 0x80000001)
            {
                x = l;
            }
            if (i1 != 0x80000001)
            {
                y = i1;
            }
            standoutwindow = mWindowManager.getDefaultDisplay();
            i = getWidth();
            l = getHeight();
            if (x != 0x7fffffff) goto _L2; else goto _L1
_L1:
            x = i - j;
_L8:
            if (y != 0x7fffffff) goto _L4; else goto _L3
_L3:
            y = l - k;
_L6:
            return;
_L2:
            if (x == 0x80000000)
            {
                x = (i - j) / 2;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (y != 0x80000000) goto _L6; else goto _L5
_L5:
            y = (l - k) / 2;
            return;
            if (true) goto _L8; else goto _L7
_L7:
        }
    }

    protected final class a
    {

        public int a;
        public String b;
        public Runnable c;
        final StandOutWindow d;

        public final String toString()
        {
            return b;
        }

        public a(String s, Runnable runnable)
        {
            d = StandOutWindow.this;
            super();
            a = 0x1080038;
            b = s;
            c = runnable;
        }
    }


    public static final String ACTION_CLOSE = "CLOSE";
    public static final String ACTION_CLOSE_ALL = "CLOSE_ALL";
    public static final String ACTION_HIDE = "HIDE";
    public static final String ACTION_RESTORE = "RESTORE";
    public static final String ACTION_SEND_DATA = "SEND_DATA";
    public static final String ACTION_SHOW = "SHOW";
    public static final int DEFAULT_ID = 0;
    public static final int DISREGARD_ID = -2;
    public static final int ONGOING_NOTIFICATION_ID = -1;
    static final String TAG = "StandOutWindow";
    static Window sFocusedWindow = null;
    static c sWindowCache = new c();
    LayoutInflater mLayoutInflater;
    private NotificationManager mNotificationManager;
    WindowManager mWindowManager;
    private boolean startedForeground;

    public StandOutWindow()
    {
    }

    public static void close(Context context, Class class1, int i)
    {
        context.startService(getCloseIntent(context, class1, i));
    }

    public static void closeAll(Context context, Class class1)
    {
        context.startService(getCloseAllIntent(context, class1));
    }

    public static Intent getCloseAllIntent(Context context, Class class1)
    {
        return (new Intent(context, class1)).setAction("CLOSE_ALL");
    }

    public static Intent getCloseIntent(Context context, Class class1, int i)
    {
        return (new Intent(context, class1)).putExtra("id", i).setAction("CLOSE");
    }

    public static Intent getHideIntent(Context context, Class class1, int i)
    {
        return (new Intent(context, class1)).putExtra("id", i).setAction("HIDE");
    }

    public static Intent getSendDataIntent(Context context, Class class1, int i, int j, Bundle bundle, Class class2, int k)
    {
        return (new Intent(context, class1)).putExtra("id", i).putExtra("requestCode", j).putExtra("wei.mark.standout.data", bundle).putExtra("wei.mark.standout.fromCls", class2).putExtra("fromId", k).setAction("SEND_DATA");
    }

    public static Intent getShowIntent(Context context, Class class1, int i)
    {
        boolean flag = sWindowCache.a(i, class1);
        String s;
        Uri uri;
        if (flag)
        {
            s = "RESTORE";
        } else
        {
            s = "SHOW";
        }
        if (flag)
        {
            uri = Uri.parse((new StringBuilder("standout://")).append(class1).append('/').append(i).toString());
        } else
        {
            uri = null;
        }
        return (new Intent(context, class1)).putExtra("id", i).setAction(s).setData(uri);
    }

    public static void hide(Context context, Class class1, int i)
    {
        context.startService(getHideIntent(context, class1, i));
    }

    public static void sendData(Context context, Class class1, int i, int j, Bundle bundle, Class class2, int k)
    {
        context.startService(getSendDataIntent(context, class1, i, j, bundle, class2, k));
    }

    public static void show(Context context, Class class1, int i)
    {
        context.startService(getShowIntent(context, class1, i));
    }

    public final void bringToFront(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = getWindow(i);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        throw new IllegalArgumentException((new StringBuilder("Tried to bringToFront(")).append(i).append(") a null window.").toString());
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        int j;
        if (((Window) (obj)).c == 0)
        {
            throw new IllegalStateException((new StringBuilder("Tried to bringToFront(")).append(i).append(") a window that is not shown.").toString());
        }
        j = ((Window) (obj)).c;
        if (j != 2) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
label0:
        {
            if (!onBringToFront(i, ((Window) (obj))))
            {
                break label0;
            }
            Log.w("StandOutWindow", (new StringBuilder("Window ")).append(i).append(" bring to front cancelled by implementation.").toString());
        }
          goto _L1
        StandOutLayoutParams standoutlayoutparams = ((Window) (obj)).b();
        mWindowManager.removeView(((View) (obj)));
_L3:
        mWindowManager.addView(((View) (obj)), standoutlayoutparams);
          goto _L1
        Exception exception;
        exception;
        exception.printStackTrace();
          goto _L1
        Exception exception1;
        exception1;
        exception1.printStackTrace();
          goto _L3
    }

    public final void close(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = getWindow(i);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        throw new IllegalArgumentException((new StringBuilder("Tried to close(")).append(i).append(") a null window.").toString());
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        int j = ((Window) (obj)).c;
        if (j != 2) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
label0:
        {
            if (!onClose(i, ((Window) (obj))))
            {
                break label0;
            }
            Log.w("StandOutWindow", (new StringBuilder("Window ")).append(i).append(" close cancelled by implementation.").toString());
        }
          goto _L1
        Animation animation;
        mNotificationManager.cancel(getClass().hashCode() + i);
        unfocus(((Window) (obj)));
        obj.c = 2;
        animation = getCloseAnimation(i);
        if (animation == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener(((Window) (obj)), i) {

            final Window a;
            final int b;
            final StandOutWindow c;

            public final void onAnimationEnd(Animation animation1)
            {
                c.mWindowManager.removeView(a);
                a.c = 0;
                StandOutWindow.sWindowCache.c(b, c.getClass());
                if (c.getExistingIds().size() == 0)
                {
                    c.startedForeground = false;
                    c.stopForeground(c.isPersistentNotificationRemovable());
                }
            }

            public final void onAnimationRepeat(Animation animation1)
            {
            }

            public final void onAnimationStart(Animation animation1)
            {
            }

            
            {
                c = StandOutWindow.this;
                a = window;
                b = i;
                super();
            }
        });
        ((Window) (obj)).getChildAt(0).startAnimation(animation);
          goto _L1
        obj;
        ((Exception) (obj)).printStackTrace();
          goto _L1
        mWindowManager.removeView(((View) (obj)));
        sWindowCache.c(i, getClass());
        obj = sWindowCache;
        Class class1 = getClass();
        obj = (SparseArray)((c) (obj)).a.get(class1);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        i = 0;
_L4:
        if (i != 0) goto _L1; else goto _L3
_L3:
        startedForeground = false;
        stopForeground(isPersistentNotificationRemovable());
          goto _L1
        i = ((SparseArray) (obj)).size();
          goto _L4
    }

    public final void closeAll()
    {
        this;
        JVM INSTR monitorenter ;
        if (!onCloseAll()) goto _L2; else goto _L1
_L1:
        Log.w("StandOutWindow", "Windows close all cancelled by implementation.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        obj = new LinkedList();
        for (Iterator iterator = getExistingIds().iterator(); iterator.hasNext(); ((LinkedList) (obj)).add(Integer.valueOf(((Integer)iterator.next()).intValue()))) { }
        break MISSING_BLOCK_LABEL_76;
        obj;
        throw obj;
        obj = ((LinkedList) (obj)).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            close(((Integer)((Iterator) (obj)).next()).intValue());
        }
          goto _L3
    }

    public abstract void createAndAttachView(int i, FrameLayout framelayout);

    public final boolean focus(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = getWindow(i);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        throw new IllegalArgumentException((new StringBuilder("Tried to focus(")).append(i).append(") a null window.").toString());
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (wei.mark.standout.b.a(((Window) (obj)).f, wei.mark.standout.a.a.m)) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (sFocusedWindow != null)
        {
            unfocus(sFocusedWindow);
        }
        flag = ((Window) (obj)).a(true);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public abstract int getAppIcon();

    public abstract String getAppName();

    public Animation getCloseAnimation(int i)
    {
        return AnimationUtils.loadAnimation(this, 0x10a0001);
    }

    public PopupWindow getDropDown(int i)
    {
        Object obj = getDropDownItems(i);
        LinearLayout linearlayout;
        PopupWindow popupwindow;
        if (obj == null)
        {
            obj = new ArrayList();
        }
        ((List) (obj)).add(new a((new StringBuilder("Quit ")).append(getAppName()).toString(), new Runnable() {

            final StandOutWindow a;

            public final void run()
            {
                a.closeAll();
            }

            
            {
                a = StandOutWindow.this;
                super();
            }
        }));
        linearlayout = new LinearLayout(this);
        linearlayout.setOrientation(1);
        popupwindow = new PopupWindow(linearlayout, -2, -2, true);
        a a1;
        ViewGroup viewgroup;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); viewgroup.setOnClickListener(new android.view.View.OnClickListener(a1, popupwindow) {

        final a a;
        final PopupWindow b;
        final StandOutWindow c;

        public final void onClick(View view)
        {
            a.c.run();
            b.dismiss();
        }

            
            {
                c = StandOutWindow.this;
                a = a1;
                b = popupwindow;
                super();
            }
    }))
        {
            a1 = (a)((Iterator) (obj)).next();
            viewgroup = (ViewGroup)mLayoutInflater.inflate(a.c.drop_down_list_item, null);
            linearlayout.addView(viewgroup);
            ((ImageView)viewgroup.findViewById(a.b.icon)).setImageResource(a1.a);
            ((TextView)viewgroup.findViewById(a.b.description)).setText(a1.b);
        }

        popupwindow.setBackgroundDrawable(getResources().getDrawable(0x108001a));
        return popupwindow;
    }

    public List getDropDownItems(int i)
    {
        return null;
    }

    public final Set getExistingIds()
    {
        Object obj = sWindowCache;
        Object obj1 = getClass();
        obj = (SparseArray)((c) (obj)).a.get(obj1);
        if (obj == null)
        {
            return new HashSet();
        }
        obj1 = new HashSet();
        for (int i = 0; i < ((SparseArray) (obj)).size(); i++)
        {
            ((Set) (obj1)).add(Integer.valueOf(((SparseArray) (obj)).keyAt(i)));
        }

        return ((Set) (obj1));
    }

    public int getFlags(int i)
    {
        return 0;
    }

    public final Window getFocusedWindow()
    {
        return sFocusedWindow;
    }

    public int getHiddenIcon()
    {
        return getAppIcon();
    }

    public Notification getHiddenNotification(int i)
    {
        int j = getHiddenIcon();
        long l = System.currentTimeMillis();
        Context context = getApplicationContext();
        String s = getHiddenNotificationTitle(i);
        String s1 = getHiddenNotificationMessage(i);
        String s2 = String.format("%s: %s", new Object[] {
            s, s1
        });
        Intent intent = getHiddenNotificationIntent(i);
        PendingIntent pendingintent = null;
        if (intent != null)
        {
            pendingintent = PendingIntent.getService(this, 0, intent, 0x8000000);
        }
        return (new android.support.v4.app.x.d(context)).a(j).c(s2).a(l).a(s).b(s1).a(pendingintent).e();
    }

    public Intent getHiddenNotificationIntent(int i)
    {
        return null;
    }

    public String getHiddenNotificationMessage(int i)
    {
        return "";
    }

    public String getHiddenNotificationTitle(int i)
    {
        return (new StringBuilder()).append(getAppName()).append(" Hidden").toString();
    }

    public Animation getHideAnimation(int i)
    {
        return AnimationUtils.loadAnimation(this, 0x10a0001);
    }

    public int getIcon(int i)
    {
        return getAppIcon();
    }

    public abstract StandOutLayoutParams getParams(int i, Window window);

    public Notification getPersistentNotification(int i)
    {
        int j = getAppIcon();
        long l = System.currentTimeMillis();
        Context context = getApplicationContext();
        String s = getPersistentNotificationTitle(i);
        String s1 = getPersistentNotificationMessage(i);
        String s2 = String.format("%s: %s", new Object[] {
            s, s1
        });
        Intent intent = getPersistentNotificationIntent(i);
        PendingIntent pendingintent = null;
        if (intent != null)
        {
            pendingintent = PendingIntent.getService(this, 0, intent, 0x8000000);
        }
        return (new android.support.v4.app.x.d(context)).a(j).c(s2).a(l).a(s).b(s1).a(pendingintent).e();
    }

    public int getPersistentNotificationId()
    {
        return getClass().hashCode() - 1;
    }

    public Intent getPersistentNotificationIntent(int i)
    {
        return null;
    }

    public String getPersistentNotificationMessage(int i)
    {
        return "";
    }

    public String getPersistentNotificationTitle(int i)
    {
        return (new StringBuilder()).append(getAppName()).append(" Running").toString();
    }

    public Animation getShowAnimation(int i)
    {
        return AnimationUtils.loadAnimation(this, 0x10a0000);
    }

    public int getThemeStyle()
    {
        return 0;
    }

    public String getTitle(int i)
    {
        return getAppName();
    }

    public final int getUniqueId()
    {
        int i = 0;
        for (Iterator iterator = getExistingIds().iterator(); iterator.hasNext();)
        {
            i = Math.max(i, ((Integer)iterator.next()).intValue() + 1);
        }

        return i;
    }

    public final Window getWindow(int i)
    {
        return sWindowCache.b(i, getClass());
    }

    public final void hide(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = getWindow(i);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        throw new IllegalArgumentException((new StringBuilder("Tried to hide(")).append(i).append(") a null window.").toString());
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (!onHide(i, ((Window) (obj)))) goto _L2; else goto _L1
_L1:
        (new StringBuilder("Window ")).append(i).append(" hide cancelled by implementation.");
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Notification notification;
        Animation animation;
        if (((Window) (obj)).c == 0)
        {
            (new StringBuilder("Window ")).append(i).append(" is already hidden.");
        }
        if (!wei.mark.standout.b.a(((Window) (obj)).f, wei.mark.standout.a.a.g))
        {
            break MISSING_BLOCK_LABEL_230;
        }
        obj.c = 2;
        notification = getHiddenNotification(i);
        animation = getHideAnimation(i);
        if (animation == null) goto _L4; else goto _L3
_L3:
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener(((Window) (obj))) {

            final Window a;
            final StandOutWindow b;

            public final void onAnimationEnd(Animation animation1)
            {
                b.mWindowManager.removeView(a);
                a.c = 0;
            }

            public final void onAnimationRepeat(Animation animation1)
            {
            }

            public final void onAnimationStart(Animation animation1)
            {
            }

            
            {
                b = StandOutWindow.this;
                a = window;
                super();
            }
        });
        ((Window) (obj)).getChildAt(0).startAnimation(animation);
_L6:
        notification.flags = notification.flags | 0x20 | 0x10;
        mNotificationManager.notify(getClass().hashCode() + i, notification);
_L7:
        onVisibilityChange(i, ((Window) (obj)), false);
          goto _L5
_L4:
        mWindowManager.removeView(((View) (obj)));
          goto _L6
        Exception exception;
        exception;
        exception.printStackTrace();
          goto _L6
        close(i);
          goto _L7
    }

    public final boolean isExistingId(int i)
    {
        return sWindowCache.a(i, getClass());
    }

    public boolean isPersistentNotificationRemovable()
    {
        return true;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public boolean onBringToFront(int i, Window window)
    {
        return false;
    }

    public boolean onClose(int i, Window window)
    {
        return false;
    }

    public boolean onCloseAll()
    {
        return false;
    }

    public void onCreate()
    {
        super.onCreate();
        mWindowManager = (WindowManager)getSystemService("window");
        mNotificationManager = (NotificationManager)getSystemService("notification");
        mLayoutInflater = (LayoutInflater)getSystemService("layout_inflater");
        startedForeground = false;
    }

    public void onDestroy()
    {
        super.onDestroy();
        closeAll();
    }

    public boolean onFocusChange(int i, Window window, boolean flag)
    {
        return false;
    }

    public boolean onHide(int i, Window window)
    {
        return false;
    }

    public boolean onKeyEvent(int i, Window window, KeyEvent keyevent)
    {
        return false;
    }

    public void onMove(int i, Window window, View view, MotionEvent motionevent)
    {
    }

    public void onReceiveData(int i, int j, Bundle bundle, Class class1, int k)
    {
    }

    public void onResize(int i, Window window, View view, MotionEvent motionevent)
    {
    }

    public boolean onShow(int i, Window window)
    {
        return false;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        super.onStartCommand(intent, i, j);
        if (intent == null) goto _L2; else goto _L1
_L1:
        String s;
        s = intent.getAction();
        i = intent.getIntExtra("id", 0);
        if (i == -1)
        {
            throw new RuntimeException("ID cannot equals StandOutWindow.ONGOING_NOTIFICATION_ID");
        }
        if (!"SHOW".equals(s) && !"RESTORE".equals(s)) goto _L4; else goto _L3
_L3:
        show(i);
_L6:
        return 2;
_L4:
        if ("HIDE".equals(s))
        {
            hide(i);
        } else
        if ("CLOSE".equals(s))
        {
            close(i);
        } else
        if ("CLOSE_ALL".equals(s))
        {
            closeAll();
        } else
        if ("SEND_DATA".equals(s))
        {
            if (!isExistingId(i) && i != -2)
            {
                Log.w("StandOutWindow", "Sending data to non-existant window. If this is not intended, make sure toId is either an existing window's id or DISREGARD_ID.");
            }
            Bundle bundle = intent.getBundleExtra("wei.mark.standout.data");
            onReceiveData(i, intent.getIntExtra("requestCode", 0), bundle, (Class)intent.getSerializableExtra("wei.mark.standout.fromCls"), intent.getIntExtra("fromId", 0));
        }
        continue; /* Loop/switch isn't completed */
_L2:
        Log.w("StandOutWindow", "Tried to onStartCommand() with a null intent.");
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onTouchBody(int i, Window window, View view, MotionEvent motionevent)
    {
        return false;
    }

    public boolean onTouchHandleMove(int i, Window window, View view, MotionEvent motionevent)
    {
        StandOutLayoutParams standoutlayoutparams;
        int l;
        int i1;
        int j1;
        l = 0;
        standoutlayoutparams = window.b();
        i1 = window.g.c - window.g.a;
        j1 = window.g.d - window.g.b;
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 76
    //                   0 87
    //                   1 325
    //                   2 144;
           goto _L1 _L2 _L3 _L4
_L1:
        onMove(i, window, view, motionevent);
        return true;
_L2:
        window.g.c = (int)motionevent.getRawX();
        window.g.d = (int)motionevent.getRawY();
        window.g.a = window.g.c;
        window.g.b = window.g.d;
        continue; /* Loop/switch isn't completed */
_L4:
        int j = (int)motionevent.getRawX();
        l = window.g.c;
        int k1 = (int)motionevent.getRawY();
        int l1 = window.g.d;
        window.g.c = (int)motionevent.getRawX();
        window.g.d = (int)motionevent.getRawY();
        if (window.g.j || Math.abs(i1) >= standoutlayoutparams.a || Math.abs(j1) >= standoutlayoutparams.a)
        {
            window.g.j = true;
            if (wei.mark.standout.b.a(window.f, wei.mark.standout.a.a.f))
            {
                if (motionevent.getPointerCount() == 1)
                {
                    standoutlayoutparams.x = standoutlayoutparams.x + (j - l);
                    standoutlayoutparams.y = standoutlayoutparams.y + (k1 - l1);
                }
                window.a().b(standoutlayoutparams.x, standoutlayoutparams.y).a();
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        window.g.j = false;
        if (motionevent.getPointerCount() == 1)
        {
            int k = l;
            if (Math.abs(i1) < standoutlayoutparams.a)
            {
                k = l;
                if (Math.abs(j1) < standoutlayoutparams.a)
                {
                    k = 1;
                }
            }
            if (k != 0 && wei.mark.standout.b.a(window.f, wei.mark.standout.a.a.i))
            {
                bringToFront(i);
            }
        } else
        if (wei.mark.standout.b.a(window.f, wei.mark.standout.a.a.h))
        {
            bringToFront(i);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public boolean onTouchHandleResize(int i, Window window, View view, MotionEvent motionevent)
    {
        StandOutLayoutParams standoutlayoutparams = window.b();
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 36
    //                   0 47
    //                   1 36
    //                   2 104;
           goto _L1 _L2 _L1 _L3
_L1:
        onResize(i, window, view, motionevent);
        return true;
_L2:
        window.g.c = (int)motionevent.getRawX();
        window.g.d = (int)motionevent.getRawY();
        window.g.a = window.g.c;
        window.g.b = window.g.d;
        continue; /* Loop/switch isn't completed */
_L3:
        int j = (int)motionevent.getRawX();
        int k = window.g.c;
        int l = (int)motionevent.getRawY();
        int i1 = window.g.d;
        standoutlayoutparams.width = standoutlayoutparams.width + (j - k);
        standoutlayoutparams.height = standoutlayoutparams.height + (l - i1);
        if (standoutlayoutparams.width >= standoutlayoutparams.b && standoutlayoutparams.width <= standoutlayoutparams.d)
        {
            window.g.c = (int)motionevent.getRawX();
        }
        if (standoutlayoutparams.height >= standoutlayoutparams.c && standoutlayoutparams.height <= standoutlayoutparams.e)
        {
            window.g.d = (int)motionevent.getRawY();
        }
        window.a().a(standoutlayoutparams.width, standoutlayoutparams.height).a();
        if (true) goto _L1; else goto _L4
_L4:
    }

    public boolean onUpdate(int i, Window window, StandOutLayoutParams standoutlayoutparams)
    {
        return false;
    }

    public void onVisibilityChange(int i, Window window, boolean flag)
    {
    }

    public final void sendData(int i, Class class1, int j, int k, Bundle bundle)
    {
        sendData(((Context) (this)), class1, j, k, bundle, getClass(), i);
    }

    public final void setFocusedWindow(Window window)
    {
        sFocusedWindow = window;
    }

    public final void setIcon(int i, int j)
    {
        Object obj = getWindow(i);
        if (obj != null)
        {
            obj = ((Window) (obj)).findViewById(a.b.window_icon);
            if (obj instanceof ImageView)
            {
                ((ImageView)obj).setImageResource(j);
            }
        }
    }

    public final void setTitle(int i, String s)
    {
        Object obj = getWindow(i);
        if (obj != null)
        {
            obj = ((Window) (obj)).findViewById(a.b.title);
            if (obj instanceof TextView)
            {
                ((TextView)obj).setText(s);
            }
        }
    }

    public final Window show(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = getWindow(i);
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!onShow(i, ((Window) (obj)))) goto _L4; else goto _L3
_L3:
        (new StringBuilder("Window ")).append(i).append(" show cancelled by implementation.");
        obj = null;
_L5:
        this;
        JVM INSTR monitorexit ;
        return ((Window) (obj));
_L2:
        obj = new Window(this, i);
          goto _L1
_L4:
        if (((Window) (obj)).c != 1)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        (new StringBuilder("Window ")).append(i).append(" is already shown.");
        focus(i);
          goto _L5
        obj;
        throw obj;
        Object obj1;
        Object obj2;
        obj.c = 1;
        obj1 = getShowAnimation(i);
        obj2 = ((Window) (obj)).b();
        mWindowManager.addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (obj2)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        ((Window) (obj)).getChildAt(0).startAnimation(((Animation) (obj1)));
_L10:
        c c1;
        Class class1;
        c1 = sWindowCache;
        class1 = getClass();
        obj2 = (SparseArray)c1.a.get(class1);
        obj1 = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        obj1 = new SparseArray();
        c1.a.put(class1, obj1);
        ((SparseArray) (obj1)).put(i, obj);
        obj1 = getPersistentNotification(i);
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        obj1.flags = ((Notification) (obj1)).flags | 0x20;
        if (startedForeground) goto _L9; else goto _L8
_L8:
        startForeground(getPersistentNotificationId(), ((Notification) (obj1)));
        startedForeground = true;
_L11:
        focus(i);
        onVisibilityChange(i, ((Window) (obj)), true);
          goto _L5
        obj1;
        ((Exception) (obj1)).printStackTrace();
          goto _L10
_L9:
        mNotificationManager.notify(getClass().hashCode() - 1, ((Notification) (obj1)));
          goto _L11
_L7:
        if (startedForeground) goto _L11; else goto _L12
_L12:
        throw new RuntimeException("Your StandOutWindow service mustprovide a persistent notification.The notification prevents Androidfrom killing your service in lowmemory situations.");
          goto _L1
    }

    public final boolean unfocus(int i)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = unfocus(getWindow(i));
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean unfocus(Window window)
    {
        this;
        JVM INSTR monitorenter ;
        if (window != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        throw new IllegalArgumentException("Tried to unfocus a null window.");
        window;
        this;
        JVM INSTR monitorexit ;
        throw window;
        boolean flag = window.a(false);
        this;
        JVM INSTR monitorexit ;
        return flag;
    }

    public void updateViewLayout(int i, StandOutLayoutParams standoutlayoutparams)
    {
        Window window = getWindow(i);
        if (window == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Tried to updateViewLayout(")).append(i).append(") a null window.").toString());
        }
        while (window.c == 0 || window.c == 2) 
        {
            return;
        }
        if (onUpdate(i, window, standoutlayoutparams))
        {
            Log.w("StandOutWindow", (new StringBuilder("Window ")).append(i).append(" update cancelled by implementation.").toString());
            return;
        }
        try
        {
            window.setLayoutParams(standoutlayoutparams);
            mWindowManager.updateViewLayout(window, standoutlayoutparams);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StandOutLayoutParams standoutlayoutparams)
        {
            standoutlayoutparams.printStackTrace();
        }
    }



/*
    static boolean access$002(StandOutWindow standoutwindow, boolean flag)
    {
        standoutwindow.startedForeground = flag;
        return flag;
    }

*/
}

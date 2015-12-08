// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import android.view.View;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.kit.utils.PStringUtils;
import java.util.ArrayList;
import java.util.List;
import storm.trident.util.LRUMap;

// Referenced classes of package com.pinterest.activity.task.toast:
//            BaseToast

public class PinFromClipboardToast extends BaseToast
{

    private static final int MAX_HISTORY = 20;
    private static final int TIME_TO_NEXT_PROMPT = 0x5265c00;
    private final String _url;

    public PinFromClipboardToast(String s)
    {
        _url = s;
        addSilencedUrl(_url);
    }

    public static void addSilencedUrl(String s)
    {
        Object obj = DiskCache.getSerializable("SILENCED_URL");
        if (obj != null)
        {
            obj = (LRUMap)obj;
        } else
        {
            obj = new LRUMap(20);
        }
        ((LRUMap) (obj)).put(s, Long.valueOf(System.currentTimeMillis()));
        DiskCache.setSerializable("SILENCED_URL", ((java.io.Serializable) (obj)));
    }

    public static boolean shouldPrompt(String s)
    {
        Object obj = DiskCache.getSerializable("SILENCED_URL");
        if (obj != null)
        {
            obj = (LRUMap)obj;
        } else
        {
            obj = new LRUMap(20);
        }
        if (((LRUMap) (obj)).containsKey(s))
        {
            ArrayList arraylist = new ArrayList(((LRUMap) (obj)).keySet());
            if (arraylist.get(arraylist.size() - 1).equals(s))
            {
                return false;
            }
            s = (Long)((LRUMap) (obj)).get(s);
            if (System.currentTimeMillis() - s.longValue() < 0x5265c00L)
            {
                return false;
            }
        }
        return true;
    }

    public View getView(final ToastContainer container)
    {
        setMessage(0x7f070404);
        setSecondaryMessage(PStringUtils.stripSchemeFromUrl(_url));
        setButtonDrawable(0x7f0201d5);
        setButtonBackgroundResource(0x7f02009b);
        setOnButtonClickListener(new _cls1());
        setDuration(7000);
        setLayoutGravity(81);
        return super.getView(container);
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinFromClipboardToast this$0;
        final ToastContainer val$container;

        public void onClick(View view)
        {
            Context context = container.getContext();
            Pinalytics.a(ElementType.PIN_REPIN_BUTTON, ComponentType.TOAST);
            Intent intent = new Intent(context, com/pinterest/activity/create/PinItActivity);
            intent.putExtra("android.intent.extra.TEXT", _url);
            intent.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", Resources.string(0x7f070733));
            context.startActivity(intent);
            onToastCompleted(view.getContext());
        }

        _cls1()
        {
            this$0 = PinFromClipboardToast.this;
            container = toastcontainer;
            super();
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.view.style;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.TextView;
import com.pinterest.activity.home.view.BaseNotificationListCell;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.model.NavigationList;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Model;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Notification;
import com.pinterest.api.model.NotificationTemplate;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.time.FuzzyDateFormatter;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.imageview.GrayWebImageView;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class BaseNotificationCell extends BaseNotificationListCell
{

    protected Notification _notificationItem;

    public BaseNotificationCell(Context context)
    {
        super(context);
    }

    public BaseNotificationCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public BaseNotificationCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private Spanned formatClickSections(NotificationTemplate notificationtemplate, String s)
    {
        Iterator iterator;
        ArrayList arraylist = new ArrayList();
        for (Matcher matcher = Pattern.compile("\\{[^}]+\\}").matcher(s); matcher.find(); arraylist.add(matcher.toMatchResult())) { }
        Collections.sort(arraylist, new _cls2());
        s = new SpannableStringBuilder(s);
        iterator = arraylist.iterator();
_L2:
        final ElementType type;
        SpannableStringBuilder spannablestringbuilder;
        MatchResult matchresult;
        com.pinterest.api.model.NotificationTemplate.NotificationSubject notificationsubject;
        String s2;
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_319;
                }
                matchresult = (MatchResult)iterator.next();
                String s1 = matchresult.group();
                notificationsubject = notificationtemplate.getSubject(s1.substring(1, s1.length() - 1));
            } while (notificationsubject == null);
            type = notificationsubject.getType();
            s2 = notificationsubject.getValue();
            spannablestringbuilder = s.replace(matchresult.start(), matchresult.end(), s2);
            s = spannablestringbuilder;
        } while (notificationsubject.getIsArray().booleanValue());
        s = spannablestringbuilder;
        switch (_cls4..SwitchMap.com.pinterest.api.model.NotificationTemplate.SubjectType[type.ordinal()])
        {
        default:
            PLog.error((new StringBuilder("unknown subjectType in template:")).append(type).toString(), new Object[0]);
            s = spannablestringbuilder;
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_308;

        case 4: // '\004'
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            s = Location.USER;
            type = ElementType.NEWS_FEED_USER;
            break;
        }
_L3:
        spannablestringbuilder.setSpan(new _cls3(), matchresult.start(), matchresult.start() + s2.length(), 17);
        s = spannablestringbuilder;
        if (true) goto _L2; else goto _L1
_L1:
        s = Location.PIN;
        type = ElementType.NEWS_FEED_PIN;
          goto _L3
        s = Location.BOARD;
        type = ElementType.NEWS_FEED_BOARD;
          goto _L3
        return s;
    }

    private void loadImageView(GrayWebImageView graywebimageview, final Model model, String s, final ElementType elementType, final Location location)
    {
        if (ModelHelper.isValid(s))
        {
            graywebimageview.setVisibility(0);
            graywebimageview.loadUrl(s);
            graywebimageview.setOnClickListener(new _cls1());
            return;
        } else
        {
            graywebimageview.setVisibility(8);
            return;
        }
    }

    protected abstract void drawTemplate();

    protected void navigateToModel(com.pinterest.api.model.Notification.DataType datatype, String s)
    {
        NavigationList navigationlist = new NavigationList();
        _cls4..SwitchMap.com.pinterest.api.model.Notification.DataType[datatype.ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 72
    //                   2 106
    //                   3 129
    //                   4 152;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        PLog.error((new StringBuilder("unknown modeltype:")).append(datatype).toString(), new Object[0]);
        return;
_L2:
        datatype = ElementType.NEWS_FEED_USER;
        navigationlist.add(new Navigation(Location.USER, s));
_L7:
        Pinalytics.a(datatype, ComponentType.NEWS_FEED, s);
        Events.post(navigationlist);
        return;
_L3:
        datatype = ElementType.NEWS_FEED_PIN;
        navigationlist.add(new Navigation(Location.PIN, s));
        continue; /* Loop/switch isn't completed */
_L4:
        datatype = ElementType.NEWS_FEED_BOARD;
        navigationlist.add(new Navigation(Location.BOARD, s));
        continue; /* Loop/switch isn't completed */
_L5:
        datatype = ElementType.PIN_CAPTION_COMMENT;
        navigationlist.add(new Navigation(Location.PIN, s));
        navigationlist.add(new Navigation(Location.PIN_COMMENTS, s));
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void setNotificationItem(Notification notification, com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition cellposition)
    {
        _notificationItem = notification;
        drawTemplate();
    }

    protected void showDate(String s, TextView textview)
    {
        s = ModelHelper.stringToDate(s);
        textview.setVisibility(0);
        textview.setText(FuzzyDateFormatter.a(new Timestamp(s.getTime())));
    }

    protected void showModel(com.pinterest.api.model.Notification.DataType datatype, GrayWebImageView graywebimageview, String s)
    {
        _cls4..SwitchMap.com.pinterest.api.model.Notification.DataType[datatype.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 60
    //                   2 86
    //                   3 112;
           goto _L1 _L2 _L3 _L4
_L1:
        PLog.error((new StringBuilder("unknown modeltype:")).append(datatype).toString(), new Object[0]);
_L6:
        return;
_L2:
        datatype = ModelHelper.getUser(s);
        if (datatype != null)
        {
            loadImageView(graywebimageview, datatype, datatype.getImageLargeUrlByDpi(), ElementType.NEWS_FEED_USER, Location.USER);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        datatype = ModelHelper.getPin(s);
        if (datatype != null)
        {
            loadImageView(graywebimageview, datatype, datatype.getImageSquareUrl(), ElementType.NEWS_FEED_PIN, Location.PIN);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        datatype = ModelHelper.getBoard(s);
        if (datatype != null)
        {
            loadImageView(graywebimageview, datatype, datatype.getImagePreviewUrl(), ElementType.NEWS_FEED_BOARD, Location.BOARD);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void showTemplate(NotificationTemplate notificationtemplate, TextView textview)
    {
        if (notificationtemplate == null)
        {
            return;
        } else
        {
            textview.setText(formatClickSections(notificationtemplate, notificationtemplate.getTemplateString()));
            return;
        }
    }

    protected void updateViewState(boolean flag)
    {
        int i = getResources().getColor(0x7f0e0019);
        int j = getResources().getColor(0x7f0e001a);
        if (flag)
        {
            i = j;
        }
        setBackgroundColor(i);
    }

    private class _cls2
        implements Comparator
    {

        final BaseNotificationCell this$0;

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((MatchResult)obj, (MatchResult)obj1);
        }

        public int compare(MatchResult matchresult, MatchResult matchresult1)
        {
            if (matchresult.start() > matchresult1.start())
            {
                return -1;
            }
            return matchresult.start() >= matchresult1.start() ? 0 : 1;
        }

        _cls2()
        {
            this$0 = BaseNotificationCell.this;
            super();
        }
    }


    private class _cls4
    {

        static final int $SwitchMap$com$pinterest$api$model$Notification$DataType[];
        static final int $SwitchMap$com$pinterest$api$model$NotificationTemplate$SubjectType[];

        static 
        {
            $SwitchMap$com$pinterest$api$model$NotificationTemplate$SubjectType = new int[com.pinterest.api.model.NotificationTemplate.SubjectType.values().length];
            try
            {
                $SwitchMap$com$pinterest$api$model$NotificationTemplate$SubjectType[com.pinterest.api.model.NotificationTemplate.SubjectType.USER.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$pinterest$api$model$NotificationTemplate$SubjectType[com.pinterest.api.model.NotificationTemplate.SubjectType.PIN.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$pinterest$api$model$NotificationTemplate$SubjectType[com.pinterest.api.model.NotificationTemplate.SubjectType.BOARD.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$pinterest$api$model$NotificationTemplate$SubjectType[com.pinterest.api.model.NotificationTemplate.SubjectType.COMMENT.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            $SwitchMap$com$pinterest$api$model$Notification$DataType = new int[com.pinterest.api.model.Notification.DataType.values().length];
            try
            {
                $SwitchMap$com$pinterest$api$model$Notification$DataType[com.pinterest.api.model.Notification.DataType.USER.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$api$model$Notification$DataType[com.pinterest.api.model.Notification.DataType.PIN.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$api$model$Notification$DataType[com.pinterest.api.model.Notification.DataType.BOARD.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$api$model$Notification$DataType[com.pinterest.api.model.Notification.DataType.PIN_COMMENT.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls3 extends BlackClickSpan
    {

        final BaseNotificationCell this$0;
        final Location val$location;
        final ElementType val$type;
        final String val$uid;

        public void onClick(View view)
        {
            super.onClick(view);
            Pinalytics.a(type, ComponentType.NEWS_FEED, uid);
            Events.post(new Navigation(location, uid));
        }

        public void updateDrawState(TextPaint textpaint)
        {
            super.updateDrawState(textpaint);
            textpaint.setTypeface(Typeface.DEFAULT_BOLD);
        }

        _cls3()
        {
            this$0 = BaseNotificationCell.this;
            type = elementtype;
            uid = s;
            location = location1;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final BaseNotificationCell this$0;
        final ElementType val$elementType;
        final Location val$location;
        final Model val$model;

        public void onClick(View view)
        {
            Pinalytics.a(elementType, ComponentType.NEWS_FEED, model.getUid());
            Events.post(new Navigation(location, model.getUid()));
        }

        _cls1()
        {
            this$0 = BaseNotificationCell.this;
            elementType = elementtype;
            model = model1;
            location = location1;
            super();
        }
    }

}

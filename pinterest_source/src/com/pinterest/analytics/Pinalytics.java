// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.View;
import com.pinterest.activity.search.GuidedSearchFragment;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.fragment.ViewPagerFragment;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Category;
import com.pinterest.api.model.DynamicRelationship;
import com.pinterest.api.model.DynamicStory;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.appwidget.SwitcherActivity;
import com.pinterest.base.Application;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.base.Device;
import com.pinterest.developer.DeveloperHelper;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.CollectionUtils;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.networking.MccMnc;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.event.BoardImpression;
import com.pinterest.schemas.event.ComponentData;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.Context;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.Event;
import com.pinterest.schemas.event.EventBatch;
import com.pinterest.schemas.event.EventData;
import com.pinterest.schemas.event.EventType;
import com.pinterest.schemas.event.InterestImpressionData;
import com.pinterest.schemas.event.PinImpression;
import com.pinterest.schemas.event.PinImpressionType;
import com.pinterest.schemas.event.SearchImpression;
import com.pinterest.schemas.event.StoryImpression;
import com.pinterest.schemas.event.UserImpression;
import com.pinterest.schemas.event.ViewData;
import com.pinterest.schemas.event.ViewParameterType;
import com.pinterest.schemas.event.ViewType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.analytics:
//            PinalyticsUploader, ViewTypeResolver, ViewParameterTypeResolver, ExternalAnalytics, 
//            ImpressionView

public class Pinalytics
{

    private static Context a;
    private static EventBatch b = new EventBatch();

    public static Event a(Activity activity)
    {
        return a(activity, ((Class) (null)));
    }

    public static Event a(Activity activity, Class class1)
    {
        ViewType viewtype1 = ViewTypeResolver.a(activity.getClass());
        Object obj = null;
        if (!(activity instanceof BaseActivity)) goto _L2; else goto _L1
_L1:
        if (!(activity instanceof SwitcherActivity)) goto _L4; else goto _L3
_L3:
        if (!MyUser.hasAccessToken()) goto _L6; else goto _L5
_L5:
        obj = ViewParameterType.FEED_HOME;
        ViewType viewtype = viewtype1;
_L13:
        class1 = new Context();
        a = class1;
        class1.setViewType(viewtype);
        if (obj == null) goto _L8; else goto _L7
_L7:
        if (!(obj instanceof ViewParameterType)) goto _L10; else goto _L9
_L9:
        a.setViewParameter((ViewParameterType)obj);
_L8:
        c(activity.getClass());
          goto _L11
_L6:
        obj = ViewParameterType.FEED_WELCOME;
        viewtype = viewtype1;
        continue; /* Loop/switch isn't completed */
_L4:
        if (class1 == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        viewtype = viewtype1;
        if (viewtype1 != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        viewtype = ViewTypeResolver.a(class1);
        obj = ViewParameterTypeResolver.a(class1);
        continue; /* Loop/switch isn't completed */
        class1 = ((BaseActivity)activity).getActiveFragment();
        if (class1 == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        obj = ViewParameterTypeResolver.a(class1.getClass());
        viewtype = viewtype1;
        continue; /* Loop/switch isn't completed */
        obj = ViewParameterTypeResolver.a(activity.getClass());
        viewtype = viewtype1;
        continue; /* Loop/switch isn't completed */
_L2:
        viewtype = viewtype1;
        if (class1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ViewParameterTypeResolver.a(class1);
        viewtype = viewtype1;
        continue; /* Loop/switch isn't completed */
_L10:
        a.setViewType((ViewType)obj);
          goto _L8
        activity;
_L11:
        if (a == null)
        {
            return new Event();
        }
        activity = new Event();
        activity.setApp(Device.getAppType());
        activity.setAppState(ApplicationInfo.getState().getContextEnum());
        activity.setTime(System.currentTimeMillis() * 0xf4240L);
        activity.setEventType(EventType.VIEW);
        if (MyUser.getUid() != null)
        {
            activity.setUserIdStr(MyUser.getUid());
        }
        activity.setUnauthId(ApplicationInfo.getInstallId());
        activity.setContext(a.deepCopy());
        a(((Event) (activity)));
        ExternalAnalytics.a(a.getViewType(), a.getViewParameter());
        if (ApplicationInfo.isNonProduction() && DeveloperHelper.a())
        {
            c(activity);
        }
        b(activity);
        return activity;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public static Event a(Fragment fragment)
    {
        Object obj3;
        obj3 = null;
        if (fragment instanceof GuidedSearchFragment)
        {
            return null;
        }
        Object obj;
        if (!(fragment instanceof BaseFragment))
        {
            break MISSING_BLOCK_LABEL_601;
        }
        obj = ((BaseFragment)fragment).getNavigation();
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        Location location;
        location = ((Navigation) (obj)).getLocation();
        obj1 = ((Navigation) (obj)).getId();
_L27:
        ViewType viewtype1 = ViewTypeResolver.a(fragment.getClass());
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (location != Location.CATEGORY) goto _L4; else goto _L5
_L5:
        obj = ((Navigation) (obj)).getCachedModel();
        if (!(obj instanceof Category)) goto _L7; else goto _L6
_L6:
        obj = ViewParameterType.findByValue(((Category)obj).getId().intValue());
        ViewType viewtype;
        Object obj2;
        obj2 = obj1;
        viewtype = viewtype1;
_L26:
        obj1 = new Context();
        a = ((Context) (obj1));
        ((Context) (obj1)).setViewType(viewtype);
        if (obj == null) goto _L9; else goto _L8
_L8:
        if (!(obj instanceof ViewParameterType)) goto _L11; else goto _L10
_L10:
        a.setViewParameter((ViewParameterType)obj);
_L9:
        if (location == Location.BROWSER || location == Location.CATEGORY || !StringUtils.isNotBlank(((CharSequence) (obj2)))) goto _L13; else goto _L12
_L12:
        obj = new ViewData();
        ((ViewData) (obj)).setViewObjectIdStr(((String) (obj2)));
_L25:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        a.setViewData(((ViewData) (obj)));
        c(fragment.getClass());
_L19:
        if (a == null)
        {
            return new Event();
        }
          goto _L14
_L4:
        if (!(fragment instanceof ViewPagerFragment)) goto _L16; else goto _L15
_L15:
        obj = ((ViewPagerFragment)fragment).getActiveFragment();
        if (obj == null) goto _L18; else goto _L17
_L17:
        org.apache.thrift.TEnum tenum;
        Navigation navigation;
        viewtype1 = ViewTypeResolver.a(obj.getClass());
        tenum = ViewParameterTypeResolver.a(obj.getClass());
        navigation = ((BaseFragment) (obj)).getNavigation();
        obj = tenum;
        viewtype = viewtype1;
        obj2 = obj1;
        if (navigation == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = navigation.getId();
        obj = tenum;
        viewtype = viewtype1;
        continue; /* Loop/switch isn't completed */
_L16:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        if (((Navigation) (obj)).getFragmentClass() == com/pinterest/activity/search/GuidedSearchFragment)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        obj = ViewParameterTypeResolver.a(((Navigation) (obj)).getFragmentClass());
        viewtype = viewtype1;
        obj2 = obj1;
        continue; /* Loop/switch isn't completed */
        tenum = ViewParameterTypeResolver.a(fragment.getClass());
        obj = tenum;
        viewtype = viewtype1;
        obj2 = obj1;
        if (!(tenum instanceof ViewParameterType))
        {
            obj = null;
            viewtype = viewtype1;
            obj2 = obj1;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        a.setViewType((ViewType)obj);
          goto _L9
        obj;
        CrashReporting.a(((Throwable) (obj)));
          goto _L19
_L14:
        if (!(fragment instanceof ViewPagerFragment)) goto _L21; else goto _L20
_L20:
        fragment = ((ViewPagerFragment)fragment).getActiveFragment();
        if (fragment == null) goto _L23; else goto _L22
_L22:
        fragment = fragment.getNavigation();
_L24:
        obj = obj3;
        if (fragment != null)
        {
            obj = fragment.getId();
        }
        fragment = new Event();
        fragment.setApp(Device.getAppType());
        fragment.setAppState(ApplicationInfo.getState().getContextEnum());
        fragment.setTime(System.currentTimeMillis() * 0xf4240L);
        fragment.setEventType(EventType.VIEW);
        if (StringUtils.isNotEmpty(((CharSequence) (obj))))
        {
            fragment.setObjectIdStr(((String) (obj)));
        }
        if (MyUser.getUid() != null)
        {
            fragment.setUserIdStr(MyUser.getUid());
        }
        fragment.setUnauthId(ApplicationInfo.getInstallId());
        fragment.setContext(a.deepCopy());
        a(((Event) (fragment)));
        ExternalAnalytics.a(a.getViewType(), a.getViewParameter());
        if (ApplicationInfo.isNonProduction() && DeveloperHelper.a())
        {
            c(fragment);
        }
        b(fragment);
        return fragment;
_L21:
        if (fragment instanceof BaseFragment)
        {
            fragment = ((BaseFragment)fragment).getNavigation();
            continue; /* Loop/switch isn't completed */
        }
_L23:
        fragment = null;
        if (true) goto _L24; else goto _L13
_L13:
        obj = null;
          goto _L25
_L18:
        obj = null;
        viewtype = viewtype1;
        obj2 = obj1;
        continue; /* Loop/switch isn't completed */
_L7:
        obj = null;
        viewtype = viewtype1;
        obj2 = obj1;
        if (true) goto _L26; else goto _L2
_L2:
        obj1 = null;
        location = null;
          goto _L27
        obj1 = null;
        location = null;
        obj = null;
          goto _L27
    }

    public static Event a(ComponentType componenttype, ComponentData componentdata)
    {
        return a(EventType.TAP, null, componenttype, null, null, componentdata);
    }

    public static Event a(ElementType elementtype, ComponentType componenttype, String s)
    {
        return b(EventType.TAP, elementtype, componenttype, s);
    }

    public static Event a(ElementType elementtype, ComponentType componenttype, String s, ComponentData componentdata)
    {
        return a(EventType.TAP, elementtype, componenttype, s, null, componentdata);
    }

    public static Event a(EventType eventtype, ElementType elementtype, ComponentType componenttype, String s)
    {
        return b(eventtype, elementtype, componenttype, s);
    }

    public static Event a(EventType eventtype, ElementType elementtype, ComponentType componenttype, String s, HashMap hashmap, ComponentData componentdata)
    {
        if (a == null)
        {
            eventtype = null;
        } else
        {
            if (a != null)
            {
                a.unsetElement();
                a.unsetElementData();
                a.unsetComponent();
                a.unsetComponentData();
                if (elementtype != null)
                {
                    a.setElement(elementtype);
                }
                if (componenttype != null)
                {
                    a.setComponent(componenttype);
                }
                if (componentdata != null)
                {
                    a.setComponentData(componentdata);
                }
            }
            elementtype = new Event();
            elementtype.setApp(Device.getAppType());
            elementtype.setAppState(ApplicationInfo.getState().getContextEnum());
            elementtype.setTime(System.currentTimeMillis() * 0xf4240L);
            elementtype.setEventType(eventtype);
            if (s != null)
            {
                elementtype.setObjectIdStr(s);
            }
            if (MyUser.getUid() != null)
            {
                elementtype.setUserIdStr(MyUser.getUid());
            }
            elementtype.setUnauthId(ApplicationInfo.getInstallId());
            elementtype.setContext(a.deepCopy());
            if (hashmap != null)
            {
                elementtype.setAuxData(a(hashmap));
            }
            a(((Event) (elementtype)));
            ExternalAnalytics.a(elementtype.getEventType(), a.getElement(), a.getComponent());
            eventtype = elementtype;
            if (ApplicationInfo.isNonProduction())
            {
                b(elementtype);
                eventtype = elementtype;
                if (DeveloperHelper.a())
                {
                    c(elementtype);
                    return elementtype;
                }
            }
        }
        return eventtype;
    }

    private static Event a(EventType eventtype, ViewType viewtype, ComponentType componenttype, String s, HashMap hashmap)
    {
        Context context = new Context();
        context.setViewType(viewtype);
        context.setViewParameter(null);
        context.setComponent(componenttype);
        context.setViewData((new ViewData()).setViewObjectIdStr(s));
        viewtype = a;
        a = context;
        eventtype = a(eventtype, s, ((EventData) (null)), hashmap);
        a = viewtype;
        return eventtype;
    }

    public static Event a(EventType eventtype, String s)
    {
        return a(eventtype, s, ((EventData) (null)), ((HashMap) (null)));
    }

    public static Event a(EventType eventtype, String s, EventData eventdata, HashMap hashmap)
    {
        Event event = new Event();
        event.setApp(Device.getAppType());
        event.setAppState(ApplicationInfo.getState().getContextEnum());
        event.setTime(System.currentTimeMillis() * 0xf4240L);
        event.setEventType(eventtype);
        if (a != null)
        {
            event.setContext(a.deepCopy());
        }
        if (s != null)
        {
            event.setObjectIdStr(s);
        }
        if (eventdata != null)
        {
            event.setEventData(eventdata);
        }
        if (MyUser.getUid() != null)
        {
            event.setUserIdStr(MyUser.getUid());
        }
        event.setUnauthId(ApplicationInfo.getInstallId());
        if (hashmap != null)
        {
            event.setAuxData(a(hashmap));
        }
        a(event);
        ExternalAnalytics.a(eventtype);
        if (ApplicationInfo.isNonProduction())
        {
            b(event);
            if (DeveloperHelper.a())
            {
                c(event);
            }
        }
        return event;
    }

    public static Event a(EventType eventtype, String s, HashMap hashmap)
    {
        return a(eventtype, s, ((EventData) (null)), hashmap);
    }

    public static Event a(EventType eventtype, List list)
    {
        Object obj = null;
        if (CollectionUtils.isNotEmpty(list))
        {
            obj = new EventData();
            ((EventData) (obj)).setPinImpressions(list);
            obj = a(eventtype, ((String) (null)), ((EventData) (obj)), ((HashMap) (null)));
        }
        return ((Event) (obj));
    }

    public static Event a(ViewType viewtype, ComponentType componenttype)
    {
        return a(EventType.PIN_IMPRESSION_ONE_PIXEL, viewtype, componenttype, null, null);
    }

    public static Event a(ViewType viewtype, ComponentType componenttype, String s)
    {
        return a(EventType.VIEW_BEGIN, viewtype, componenttype, s, null);
    }

    public static Event a(ViewType viewtype, HashMap hashmap)
    {
        return a(EventType.VIEW_END, viewtype, null, null, hashmap);
    }

    public static EventBatch a()
    {
        EventBatch eventbatch1;
        synchronized (b)
        {
            eventbatch1 = b.deepCopy();
            b.clear();
        }
        return eventbatch1;
        exception;
        eventbatch;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static ViewType a(Class class1)
    {
        ViewType viewtype = ViewTypeResolver.a(class1);
        class1 = ViewParameterTypeResolver.a(class1);
        if (class1 instanceof ViewType)
        {
            return (ViewType)class1;
        } else
        {
            return viewtype;
        }
    }

    private static HashMap a(HashMap hashmap)
    {
        HashMap hashmap1 = new HashMap();
        for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            String s1 = (String)hashmap.get(s);
            if (s1 != null)
            {
                hashmap1.put(s, s1);
            } else
            {
                Application.showDebugToast((new StringBuilder("auxdata key ")).append(s).append(" contains null value, please check!").toString());
            }
        }

        return hashmap1;
    }

    public static void a(View view, List list)
    {
        if (view instanceof ImpressionView)
        {
            view = ((View) (((ImpressionView)view).markImpressionEnd()));
            if (view instanceof BoardImpression)
            {
                list.add((BoardImpression)view);
            }
        }
    }

    public static void a(View view, List list, PinImpressionType pinimpressiontype)
    {
        if (view instanceof ImpressionView)
        {
            view = ((View) (((ImpressionView)view).markImpressionEnd()));
            if (view instanceof PinImpression)
            {
                ((PinImpression)view).setType(pinimpressiontype);
                list.add((PinImpression)view);
            } else
            if (view instanceof StoryImpression)
            {
                list = (StoryImpression)view;
                if (list != null)
                {
                    pinimpressiontype = new EventData();
                    pinimpressiontype.setStoryImpression(list);
                    HashMap hashmap = new HashMap();
                    hashmap.put("total_time", String.valueOf(list.getEndTime() - list.getTime()));
                    DynamicStory dynamicstory = ModelHelper.getDynamicStory(list.getIdStr());
                    if (dynamicstory != null)
                    {
                        hashmap.putAll(dynamicstory.getAuxData());
                        view = null;
                        if (dynamicstory.getRelationship() != null)
                        {
                            view = dynamicstory.getRelationship().getHighlightedId();
                        }
                        if (StringUtils.isNoneEmpty(new CharSequence[] {
    view
}))
                        {
                            list.setIdStr(view);
                        }
                        a(EventType.STORY_IMPRESSION_ONE_PIXEL, list.getIdStr(), ((EventData) (pinimpressiontype)), hashmap);
                        return;
                    }
                }
            }
        }
    }

    public static void a(ElementType elementtype)
    {
        a(EventType.TAP, elementtype, null, null, null, null);
    }

    public static void a(ElementType elementtype, ComponentType componenttype)
    {
        a(EventType.TAP, elementtype, componenttype, null, null, null);
    }

    public static void a(ElementType elementtype, ComponentType componenttype, String s, HashMap hashmap)
    {
        a(EventType.TAP, elementtype, componenttype, s, hashmap, null);
    }

    public static void a(ElementType elementtype, ComponentType componenttype, HashMap hashmap)
    {
        a(EventType.TAP, elementtype, componenttype, null, hashmap, null);
    }

    public static void a(ElementType elementtype, HashMap hashmap)
    {
        a(EventType.TAP, elementtype, null, null, hashmap, null);
    }

    private static void a(Event event)
    {
        synchronized (b)
        {
            b.addToEvents(event);
        }
        return;
        event;
        eventbatch;
        JVM INSTR monitorexit ;
        throw event;
    }

    public static void a(String s, int i, String s1)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put("index", Integer.toString(i));
        if (ModelHelper.isValid(s1))
        {
            hashmap.put("image_signature", s1);
        }
        a(EventType.SWIPE, ElementType.PIN_SOURCE_IMAGE, ComponentType.MODAL_PIN, s, hashmap, null);
    }

    public static Event b(EventType eventtype, ElementType elementtype, ComponentType componenttype, String s)
    {
        return a(eventtype, elementtype, componenttype, s, null, null);
    }

    public static Event b(EventType eventtype, List list)
    {
        Object obj = null;
        if (CollectionUtils.isNotEmpty(list))
        {
            obj = new EventData();
            ((EventData) (obj)).setBoardImpressions(list);
            obj = a(eventtype, ((String) (null)), ((EventData) (obj)), ((HashMap) (null)));
        }
        return ((Event) (obj));
    }

    public static Event b(ViewType viewtype, ComponentType componenttype, String s)
    {
        return a(EventType.VIEW_END, viewtype, componenttype, s, null);
    }

    public static ViewParameterType b(Class class1)
    {
        org.apache.thrift.TEnum tenum = ViewParameterTypeResolver.a(class1);
        class1 = tenum;
        if (tenum instanceof ViewType)
        {
            class1 = null;
        }
        return (ViewParameterType)class1;
    }

    public static HashMap b()
    {
        HashMap hashmap = new HashMap(3);
        hashmap.put("android_preinstall", String.valueOf(ApplicationInfo.isPreinstalled()));
        MccMnc mccmnc = NetworkUtils.getInstance().getCarrierMccMnc();
        hashmap.put("device_mcc", String.valueOf(mccmnc.a));
        hashmap.put("device_mnc", String.valueOf(mccmnc.b));
        return hashmap;
    }

    public static void b(View view, List list)
    {
        if (view instanceof ImpressionView)
        {
            view = ((View) (((ImpressionView)view).markImpressionEnd()));
            if (view instanceof UserImpression)
            {
                list.add((UserImpression)view);
            }
        }
    }

    private static void b(Event event)
    {
        if (!ApplicationInfo.isNonProduction())
        {
            break MISSING_BLOCK_LABEL_269;
        }
        StringBuilder stringbuilder;
        Object obj;
        try
        {
            stringbuilder = new StringBuilder("Event {\n\t");
            stringbuilder.append("EventType: ").append(event.getEventType()).append("\n\t");
            obj = event.getObjectIdStr();
        }
        // Misplaced declaration of an exception variable
        catch (Event event)
        {
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        stringbuilder.append("ObjectId: ").append(((String) (obj))).append("\n\t");
        obj = event.getAuxData();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        if (((Map) (obj)).values().size() > 0)
        {
            stringbuilder.append("AuxData: ").append(obj).append("\n\t");
        }
        obj = event.getContext();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        stringbuilder.append("Context: ").append(obj).append("\n\t");
        obj = event.getEventData();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        if (((EventData) (obj)).getPinImpressions() != null)
        {
            stringbuilder.append("PinImpressions: ").append(((EventData) (obj)).getPinImpressions()).append("\n\t");
        }
        if (((EventData) (obj)).getStoryImpression() != null)
        {
            stringbuilder.append("StoryImpressions: ").append(((EventData) (obj)).getStoryImpression()).append("\n\t");
        }
        if (((EventData) (obj)).getInterestImpressionData() != null)
        {
            stringbuilder.append("InterestImpressions: ").append(((EventData) (obj)).getInterestImpressionData()).append("\n\t");
        }
        stringbuilder.append("AppState: ").append(event.getAppState()).append("\n\t");
        stringbuilder.append("}");
        PLog.log("Pinalytics", stringbuilder.toString(), new Object[0]);
    }

    public static Event c()
    {
        return null;
    }

    public static Event c(EventType eventtype, List list)
    {
        Object obj = null;
        if (CollectionUtils.isNotEmpty(list))
        {
            obj = new EventData();
            ((EventData) (obj)).setUserImpressions(list);
            obj = a(eventtype, ((String) (null)), ((EventData) (obj)), ((HashMap) (null)));
        }
        return ((Event) (obj));
    }

    public static void c(View view, List list)
    {
        if (view instanceof ImpressionView)
        {
            view = ((View) (((ImpressionView)view).markImpressionEnd()));
            if (view instanceof SearchImpression)
            {
                list.add((SearchImpression)view);
            }
        }
    }

    private static void c(Event event)
    {
        boolean flag = false;
        StringBuilder stringbuilder;
        Context context;
        int i;
        if (event.eventType == EventType.DRAG || event.eventType == EventType.SWIPE)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        stringbuilder = new StringBuilder();
        stringbuilder.append(String.format("%-15s:", new Object[] {
            event.getEventType()
        }));
        context = event.getContext();
        if (context != null)
        {
            if (context.getElement() != null)
            {
                stringbuilder.append(String.format("%-15s:", new Object[] {
                    context.getElement()
                }));
            } else
            {
                stringbuilder.append(String.format("%-15s:", new Object[] {
                    " "
                }));
            }
            if (context.getComponent() != null)
            {
                stringbuilder.append(String.format("%-15s:", new Object[] {
                    context.getComponent()
                }));
            } else
            {
                stringbuilder.append(String.format("%-15s:", new Object[] {
                    " "
                }));
            }
        } else
        {
            stringbuilder.append(String.format("%-15s:", new Object[] {
                " "
            })).append(String.format("%-15s:", new Object[] {
                " "
            }));
        }
        if (context != null)
        {
            if (context.getViewType() != null)
            {
                stringbuilder.append(String.format("%-15s:", new Object[] {
                    context.getViewType()
                }));
            } else
            {
                stringbuilder.append(String.format("%-15s:", new Object[] {
                    " "
                }));
            }
            if (context.getViewParameter() != null)
            {
                stringbuilder.append(String.format("%-15s:", new Object[] {
                    context.getViewParameter()
                }));
            } else
            {
                stringbuilder.append(String.format("%-15s:", new Object[] {
                    " "
                }));
            }
        }
        if (event.getObjectIdStr() != null)
        {
            stringbuilder.append(String.format("%-15s:", new Object[] {
                event.getObjectIdStr()
            }));
        } else
        {
            stringbuilder.append(String.format("%-15s:", new Object[] {
                " "
            }));
        }
        stringbuilder.append(String.format("%-15s:", new Object[] {
            event.getUnauthId()
        }));
        event = stringbuilder.toString();
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 1;
        }
        Application.showDebugToast(event, i);
    }

    private static void c(Class class1)
    {
        if (!ApplicationInfo.isNonProduction()) goto _L2; else goto _L1
_L1:
        Object obj;
        ViewType viewtype;
        ViewParameterType viewparametertype;
        obj = null;
        viewtype = a.getViewType();
        viewparametertype = a.getViewParameter();
        if (viewtype != null) goto _L4; else goto _L3
_L3:
        String s = (new StringBuilder("Context: View for ")).append(class1.getSimpleName()).append(" is missing!").toString();
_L6:
        if (s != null)
        {
            Application.showDebugErrorToast(s);
            PLog.error((new StringBuilder()).append(s).append("\nPlease see Pinalytics.java for View and ViewParameter context logging.").toString(), new Object[0]);
        }
_L2:
        return;
_L4:
        s = obj;
        if (viewtype.equals(ViewType.FEED))
        {
            s = obj;
            if (viewparametertype == null)
            {
                s = (new StringBuilder("Context: ViewParameter for ")).append(class1.getSimpleName()).append(" is missing!").toString();
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static Event d()
    {
        return null;
    }

    public static Event d(EventType eventtype, List list)
    {
        Object obj = null;
        if (CollectionUtils.isNotEmpty(list))
        {
            obj = new EventData();
            ((EventData) (obj)).setSearchImpressions(list);
            obj = a(eventtype, ((String) (null)), ((EventData) (obj)), ((HashMap) (null)));
        }
        return ((Event) (obj));
    }

    public static Event e(EventType eventtype, List list)
    {
        Object obj1 = null;
        Object obj = obj1;
        if (list != null)
        {
            obj = obj1;
            if (!list.isEmpty())
            {
                obj = new EventData();
                InterestImpressionData interestimpressiondata = new InterestImpressionData();
                interestimpressiondata.setInterestImpressions(list);
                ((EventData) (obj)).setInterestImpressionData(interestimpressiondata);
                obj = a(eventtype, ((String) (null)), ((EventData) (obj)), ((HashMap) (null)));
            }
        }
        return ((Event) (obj));
    }

    public static void e()
    {
        b(EventType.DRAG, null, ComponentType.NAVIGATION, null);
    }

    public static void f()
    {
        b(EventType.SWIPE, null, ComponentType.NAVIGATION, null);
    }

    public static void g()
    {
        a(ElementType.BACK_BUTTON, ComponentType.NAVIGATION);
    }

    public static Context h()
    {
        return a;
    }

    static 
    {
        PinalyticsUploader.a();
    }
}

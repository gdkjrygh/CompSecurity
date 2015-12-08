// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.layouts;

import android.content.Context;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.LayoutInflaterFactory;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.google.android.gms.games.ui.layouts:
//            LayoutSpec, AutoLayoutSlotBuilder, AutoLayoutSlot, OverflowAutoLayoutSlot, 
//            ArrayLayoutSlot, LayoutSlot

public final class LayoutSlotInflater extends LayoutInflater
{
    private final class Factory
        implements LayoutInflaterFactory
    {

        final LayoutSlotInflater this$0;

        public final View onCreateView(View view, String s, Context context, AttributeSet attributeset)
        {
            if (attributeset.getAttributeBooleanValue("http://schemas.android.com/apk/res-auto", "layoutSlotContainer", false))
            {
                view = new LayoutSpec("WHOLE_CARD", -1, 0, null, 0, null, -1, 0);
            } else
            {
                view = attributeset.getAttributeValue("http://schemas.android.com/apk/res-auto", "layoutSlot");
                int i = attributeset.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "layoutSubSlot", -1);
                int j = attributeset.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "layoutSlotAnimationType", 0);
                s = attributeset.getAttributeValue("http://schemas.android.com/apk/res-auto", "layoutSlotSharedView");
                int k = attributeset.getAttributeResourceValue("http://schemas.android.com/apk/res-auto", "layoutSlotRoot", 0);
                context = attributeset.getAttributeValue("http://schemas.android.com/apk/res-auto", "layoutSlotType");
                int l = attributeset.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "layoutSlotIndex", -1);
                int i1 = attributeset.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "layoutSlotImageResizeMode", 0);
                if (!TextUtils.isEmpty(view) || i != -1)
                {
                    view = new LayoutSpec(view, i, j, s, k, context, l, i1);
                } else
                {
                    view = null;
                }
            }
            mLayoutSpecs.addLast(view);
            return null;
        }

        private Factory()
        {
            this$0 = LayoutSlotInflater.this;
            super();
        }

        Factory(byte byte0)
        {
            this();
        }
    }

    private static final class LayoutSlotProviderImpl
        implements LayoutSlot.LayoutSlotProvider
    {

        HashMap mLayoutSlots;

        public final LayoutSlot getLayoutSlot(String s)
        {
            return (LayoutSlot)mLayoutSlots.get(s);
        }

        public final Collection getLayoutSlots()
        {
            return mLayoutSlots.values();
        }

        public LayoutSlotProviderImpl()
        {
            mLayoutSlots = new HashMap();
        }
    }


    private static final Map sInflaterMap = Collections.synchronizedMap(new WeakHashMap());
    private boolean mInflating;
    private HashMap mLayoutSlotProviders;
    private LinkedList mLayoutSpecs;
    private final LayoutInflater mOriginalInflater;

    private LayoutSlotInflater(Context context)
    {
        super(context);
        mOriginalInflater = LayoutInflater.from(context).cloneInContext(context);
        LayoutInflaterCompat.setFactory(mOriginalInflater, new Factory((byte)0));
        mLayoutSpecs = new LinkedList();
    }

    public static LayoutSlotInflater from(Context context)
    {
        Map map = sInflaterMap;
        map;
        JVM INSTR monitorenter ;
        Object obj = (WeakReference)sInflaterMap.get(context);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        obj = (LayoutSlotInflater)((WeakReference) (obj)).get();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        map;
        JVM INSTR monitorexit ;
        return ((LayoutSlotInflater) (obj));
        obj = new LayoutSlotInflater(context);
        sInflaterMap.put(context, new WeakReference(obj));
        map;
        JVM INSTR monitorexit ;
        return ((LayoutSlotInflater) (obj));
        context;
        map;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static Map getAllSlotProviders(View view)
    {
        return (Map)view.getTag(0x7f0d004b);
    }

    public static LayoutSlot.LayoutSlotProvider getSlotProvider(View view)
    {
        Object obj = getAllSlotProviders(view);
        if (obj == null || ((Map) (obj)).isEmpty())
        {
            return new LayoutSlotProviderImpl();
        }
        obj = (View)((Map) (obj)).keySet().iterator().next();
        view = getAllSlotProviders(view);
        if (view == null)
        {
            return new LayoutSlotProviderImpl();
        } else
        {
            return (LayoutSlot.LayoutSlotProvider)view.get(obj);
        }
    }

    private void searchForLayoutSlots(AutoLayoutSlotBuilder autolayoutslotbuilder, ViewGroup viewgroup, View view, String s)
    {
        Object obj;
        obj = (LayoutSpec)mLayoutSpecs.pollFirst();
        String s1 = s;
        s = s1;
        if (obj != null)
        {
            s = s1;
            if (!TextUtils.isEmpty(((LayoutSpec) (obj)).mLayoutSlot))
            {
                s = ((LayoutSpec) (obj)).mLayoutSlot;
            }
        }
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        ViewGroup viewgroup1;
        viewgroup1 = (ViewGroup)view;
        int i;
        int l;
        if (obj != null && "WHOLE_CARD".equals(((LayoutSpec) (obj)).mLayoutSlot) && ((LayoutSpec) (obj)).mLayoutSubSlot == -1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L4; else goto _L3
_L3:
        Iterator iterator;
        view = new AutoLayoutSlotBuilder(getContext());
        i = 0;
        for (l = viewgroup1.getChildCount(); i < l; i++)
        {
            searchForLayoutSlots(((AutoLayoutSlotBuilder) (view)), viewgroup, viewgroup1.getChildAt(i), s);
        }

        s = new LayoutSlotProviderImpl();
        autolayoutslotbuilder = new AutoLayoutSlot(viewgroup1);
        viewgroup = autolayoutslotbuilder.getLayoutSlotName();
        ((LayoutSlotProviderImpl) (s)).mLayoutSlots.put(viewgroup, autolayoutslotbuilder);
        obj = new HashMap();
        iterator = ((AutoLayoutSlotBuilder) (view)).mBuildMap.entrySet().iterator();
_L13:
        if (!iterator.hasNext()) goto _L6; else goto _L5
_L5:
        java.util.Map.Entry entry;
        AutoLayoutSlotBuilder.AutoLayoutSlotComponents autolayoutslotcomponents;
        entry = (java.util.Map.Entry)iterator.next();
        autolayoutslotcomponents = (AutoLayoutSlotBuilder.AutoLayoutSlotComponents)entry.getValue();
        if (autolayoutslotcomponents.mOverflowImage == null) goto _L8; else goto _L7
_L7:
        autolayoutslotbuilder = new OverflowAutoLayoutSlot(((AutoLayoutSlotBuilder) (view)).mContext, (String)entry.getKey(), autolayoutslotcomponents.mRoot, autolayoutslotcomponents.mImageContainer, autolayoutslotcomponents.mImage, autolayoutslotcomponents.mTitle, autolayoutslotcomponents.mSubtitle, autolayoutslotcomponents.mProgressBar, autolayoutslotcomponents.mOverlay, autolayoutslotcomponents.mAnimationType, autolayoutslotcomponents.mSharedViews, autolayoutslotcomponents.mOverflowImage);
_L9:
        ((HashMap) (obj)).put(entry.getKey(), autolayoutslotbuilder);
        if (autolayoutslotcomponents.mOverflowImage != null && !((String)entry.getKey()).equals("OVERFLOW_MENU"))
        {
            ((HashMap) (obj)).put("OVERFLOW_MENU", autolayoutslotbuilder);
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (!autolayoutslotcomponents.mSlotArray.isEmpty())
        {
            viewgroup = new ArrayLayoutSlot();
            int j = 0;
            do
            {
                autolayoutslotbuilder = viewgroup;
                if (j >= autolayoutslotcomponents.mSlotArray.size())
                {
                    continue; /* Loop/switch isn't completed */
                }
                autolayoutslotbuilder = (AutoLayoutSlotBuilder.AutoLayoutSlotComponents)autolayoutslotcomponents.mSlotArray.get(j);
                if (autolayoutslotbuilder != null)
                {
                    autolayoutslotbuilder = view.createLayoutSlot(autolayoutslotbuilder, (String)entry.getKey());
                    ((ArrayLayoutSlot)viewgroup).addLayoutSlot(j, autolayoutslotbuilder);
                }
                j++;
            } while (true);
        }
        autolayoutslotbuilder = view.createLayoutSlot(autolayoutslotcomponents, (String)entry.getKey());
        if (true) goto _L9; else goto _L6
_L6:
        ((LayoutSlotProviderImpl) (s)).mLayoutSlots.putAll(((Map) (obj)));
        mLayoutSlotProviders.put(viewgroup1, s);
_L10:
        return;
_L4:
        if (autolayoutslotbuilder != null)
        {
            autolayoutslotbuilder.addView(viewgroup, view, ((LayoutSpec) (obj)), s);
        }
        int k = 0;
        int i1 = viewgroup1.getChildCount();
        while (k < i1) 
        {
            searchForLayoutSlots(autolayoutslotbuilder, viewgroup, viewgroup1.getChildAt(k), s);
            k++;
        }
        if (true) goto _L10; else goto _L2
_L2:
        if (autolayoutslotbuilder == null) goto _L10; else goto _L11
_L11:
        autolayoutslotbuilder.addView(viewgroup, view, ((LayoutSpec) (obj)), s);
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public final LayoutInflater cloneInContext(Context context)
    {
        return mOriginalInflater.cloneInContext(context);
    }

    protected final void finalize()
        throws Throwable
    {
        Map map = sInflaterMap;
        map;
        JVM INSTR monitorenter ;
        Iterator iterator = sInflaterMap.entrySet().iterator();
_L2:
        LayoutSlotInflater layoutslotinflater;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_76;
            }
            layoutslotinflater = (LayoutSlotInflater)((WeakReference)((java.util.Map.Entry)iterator.next()).getValue()).get();
        } while (layoutslotinflater != null && layoutslotinflater != this);
        iterator.remove();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        map;
        JVM INSTR monitorexit ;
        super.finalize();
        return;
    }

    public final View inflate(XmlPullParser xmlpullparser, ViewGroup viewgroup, boolean flag)
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = mInflating;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        mLayoutSpecs.clear();
        mLayoutSlotProviders = new HashMap();
        mInflating = true;
        viewgroup = mOriginalInflater.inflate(xmlpullparser, viewgroup, flag);
        mInflating = flag1;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        xmlpullparser = obj;
        if (viewgroup instanceof ViewGroup)
        {
            xmlpullparser = (ViewGroup)viewgroup;
        }
        searchForLayoutSlots(null, xmlpullparser, viewgroup, null);
        viewgroup.setTag(0x7f0d004b, mLayoutSlotProviders);
        this;
        JVM INSTR monitorexit ;
        return viewgroup;
        xmlpullparser;
        throw xmlpullparser;
    }


}

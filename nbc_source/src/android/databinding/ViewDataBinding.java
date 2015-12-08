// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

// Referenced classes of package android.databinding:
//            DataBinderMapper, DataBindingUtil, CallbackRegistry, OnRebindCallback, 
//            Observable, ObservableList, ObservableMap

public abstract class ViewDataBinding
{
    private static interface CreateWeakListener
    {

        public abstract WeakListener create(ViewDataBinding viewdatabinding, int i);
    }

    protected static class IncludedLayouts
    {

        public final int indexes[][];
        public final int layoutIds[][];
        public final String layouts[][];

        public void setIncludes(int i, String as[], int ai[], int ai1[])
        {
            layouts[i] = as;
            indexes[i] = ai;
            layoutIds[i] = ai1;
        }

        public IncludedLayouts(int i)
        {
            layouts = new String[i][];
            indexes = new int[i][];
            layoutIds = new int[i][];
        }
    }

    private static interface ObservableReference
    {

        public abstract void addListener(Object obj);

        public abstract WeakListener getListener();

        public abstract void removeListener(Object obj);
    }

    private static class WeakListListener extends ObservableList.OnListChangedCallback
        implements ObservableReference
    {

        final WeakListener mListener;

        public void addListener(ObservableList observablelist)
        {
            observablelist.addOnListChangedCallback(this);
        }

        public volatile void addListener(Object obj)
        {
            addListener((ObservableList)obj);
        }

        public WeakListener getListener()
        {
            return mListener;
        }

        public void onChanged(ObservableList observablelist)
        {
            ViewDataBinding viewdatabinding = mListener.getBinder();
            ObservableList observablelist1;
            if (viewdatabinding != null)
            {
                if ((observablelist1 = (ObservableList)mListener.getTarget()) == observablelist)
                {
                    viewdatabinding.handleFieldChange(mListener.mLocalFieldId, observablelist1, 0);
                    return;
                }
            }
        }

        public void onItemRangeChanged(ObservableList observablelist, int i, int j)
        {
            onChanged(observablelist);
        }

        public void onItemRangeInserted(ObservableList observablelist, int i, int j)
        {
            onChanged(observablelist);
        }

        public void onItemRangeMoved(ObservableList observablelist, int i, int j, int k)
        {
            onChanged(observablelist);
        }

        public void onItemRangeRemoved(ObservableList observablelist, int i, int j)
        {
            onChanged(observablelist);
        }

        public void removeListener(ObservableList observablelist)
        {
            observablelist.removeOnListChangedCallback(this);
        }

        public volatile void removeListener(Object obj)
        {
            removeListener((ObservableList)obj);
        }

        public WeakListListener(ViewDataBinding viewdatabinding, int i)
        {
            mListener = new WeakListener(viewdatabinding, i, this);
        }
    }

    private static class WeakListener extends WeakReference
    {

        protected final int mLocalFieldId;
        private final ObservableReference mObservable;
        private Object mTarget;

        protected ViewDataBinding getBinder()
        {
            ViewDataBinding viewdatabinding = (ViewDataBinding)get();
            if (viewdatabinding == null)
            {
                unregister();
            }
            return viewdatabinding;
        }

        public Object getTarget()
        {
            return mTarget;
        }

        public void setTarget(Object obj)
        {
            unregister();
            mTarget = obj;
            if (mTarget != null)
            {
                mObservable.addListener(mTarget);
            }
        }

        public boolean unregister()
        {
            boolean flag = false;
            if (mTarget != null)
            {
                mObservable.removeListener(mTarget);
                flag = true;
            }
            mTarget = null;
            return flag;
        }

        public WeakListener(ViewDataBinding viewdatabinding, int i, ObservableReference observablereference)
        {
            super(viewdatabinding);
            mLocalFieldId = i;
            mObservable = observablereference;
        }
    }

    private static class WeakMapListener extends ObservableMap.OnMapChangedCallback
        implements ObservableReference
    {

        final WeakListener mListener;

        public void addListener(ObservableMap observablemap)
        {
            observablemap.addOnMapChangedCallback(this);
        }

        public volatile void addListener(Object obj)
        {
            addListener((ObservableMap)obj);
        }

        public WeakListener getListener()
        {
            return mListener;
        }

        public void onMapChanged(ObservableMap observablemap, Object obj)
        {
            obj = mListener.getBinder();
            if (obj == null || observablemap != mListener.getTarget())
            {
                return;
            } else
            {
                ((ViewDataBinding) (obj)).handleFieldChange(mListener.mLocalFieldId, observablemap, 0);
                return;
            }
        }

        public void removeListener(ObservableMap observablemap)
        {
            observablemap.removeOnMapChangedCallback(this);
        }

        public volatile void removeListener(Object obj)
        {
            removeListener((ObservableMap)obj);
        }

        public WeakMapListener(ViewDataBinding viewdatabinding, int i)
        {
            mListener = new WeakListener(viewdatabinding, i, this);
        }
    }

    private static class WeakPropertyListener extends Observable.OnPropertyChangedCallback
        implements ObservableReference
    {

        final WeakListener mListener;

        public void addListener(Observable observable)
        {
            observable.addOnPropertyChangedCallback(this);
        }

        public volatile void addListener(Object obj)
        {
            addListener((Observable)obj);
        }

        public WeakListener getListener()
        {
            return mListener;
        }

        public void onPropertyChanged(Observable observable, int i)
        {
            ViewDataBinding viewdatabinding;
            for (viewdatabinding = mListener.getBinder(); viewdatabinding == null || (Observable)mListener.getTarget() != observable;)
            {
                return;
            }

            viewdatabinding.handleFieldChange(mListener.mLocalFieldId, observable, i);
        }

        public void removeListener(Observable observable)
        {
            observable.removeOnPropertyChangedCallback(this);
        }

        public volatile void removeListener(Object obj)
        {
            removeListener((Observable)obj);
        }

        public WeakPropertyListener(ViewDataBinding viewdatabinding, int i)
        {
            mListener = new WeakListener(viewdatabinding, i, this);
        }
    }


    private static final int BINDING_NUMBER_START = "binding_".length();
    public static final String BINDING_TAG_PREFIX = "binding_";
    private static final CreateWeakListener CREATE_LIST_LISTENER = new CreateWeakListener() {

        public WeakListener create(ViewDataBinding viewdatabinding, int i)
        {
            return (new WeakListListener(viewdatabinding, i)).getListener();
        }

    };
    private static final CreateWeakListener CREATE_MAP_LISTENER = new CreateWeakListener() {

        public WeakListener create(ViewDataBinding viewdatabinding, int i)
        {
            return (new WeakMapListener(viewdatabinding, i)).getListener();
        }

    };
    private static final CreateWeakListener CREATE_PROPERTY_LISTENER = new CreateWeakListener() {

        public WeakListener create(ViewDataBinding viewdatabinding, int i)
        {
            return (new WeakPropertyListener(viewdatabinding, i)).getListener();
        }

    };
    private static final int HALTED = 2;
    private static final int REBIND = 1;
    private static final CallbackRegistry.NotifierCallback REBIND_NOTIFIER = new CallbackRegistry.NotifierCallback() {

        public void onNotifyCallback(OnRebindCallback onrebindcallback, ViewDataBinding viewdatabinding, int i, Void void1)
        {
            i;
            JVM INSTR tableswitch 1 3: default 28
        //                       1 29
        //                       2 44
        //                       3 50;
               goto _L1 _L2 _L3 _L4
_L1:
            return;
_L2:
            if (!onrebindcallback.onPreBind(viewdatabinding))
            {
                viewdatabinding.mRebindHalted = true;
                return;
            }
              goto _L1
_L3:
            onrebindcallback.onCanceled(viewdatabinding);
            return;
_L4:
            onrebindcallback.onBound(viewdatabinding);
            return;
        }

        public volatile void onNotifyCallback(Object obj, Object obj1, int i, Object obj2)
        {
            onNotifyCallback((OnRebindCallback)obj, (ViewDataBinding)obj1, i, (Void)obj2);
        }

    };
    private static final int REBOUND = 3;
    private static final android.view.View.OnAttachStateChangeListener ROOT_REATTACHED_LISTENER;
    static int SDK_INT;
    private static final boolean USE_CHOREOGRAPHER;
    private static final boolean USE_TAG_ID;
    private Choreographer mChoreographer;
    private final android.view.Choreographer.FrameCallback mFrameCallback;
    private boolean mIsExecutingPendingBindings;
    private WeakListener mLocalFieldObservers[];
    private boolean mPendingRebind;
    private CallbackRegistry mRebindCallbacks;
    private boolean mRebindHalted;
    private final Runnable mRebindRunnable = new Runnable() {

        final ViewDataBinding this$0;

        public void run()
        {
            this;
            JVM INSTR monitorenter ;
            mPendingRebind = false;
            this;
            JVM INSTR monitorexit ;
            Exception exception;
            if (android.os.Build.VERSION.SDK_INT >= 19 && !mRoot.isAttachedToWindow())
            {
                mRoot.removeOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
                mRoot.addOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
                return;
            } else
            {
                executePendingBindings();
                return;
            }
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                this$0 = ViewDataBinding.this;
                super();
            }
    };
    private final View mRoot;
    private Handler mUIThreadHandler;

    protected ViewDataBinding(View view, int i)
    {
        mPendingRebind = false;
        mRebindHalted = false;
        mLocalFieldObservers = new WeakListener[i];
        mRoot = view;
        if (Looper.myLooper() == null)
        {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (USE_CHOREOGRAPHER)
        {
            mChoreographer = Choreographer.getInstance();
            mFrameCallback = new android.view.Choreographer.FrameCallback() {

                final ViewDataBinding this$0;

                public void doFrame(long l)
                {
                    mRebindRunnable.run();
                }

            
            {
                this$0 = ViewDataBinding.this;
                super();
            }
            };
            return;
        } else
        {
            mFrameCallback = null;
            mUIThreadHandler = new Handler(Looper.myLooper());
            return;
        }
    }

    protected static ViewDataBinding bind(View view, int i)
    {
        return DataBindingUtil.bind(view, i);
    }

    private static int findIncludeIndex(String s, int i, IncludedLayouts includedlayouts, int j)
    {
        s = s.subSequence(s.indexOf('/') + 1, s.length() - 2);
        includedlayouts = includedlayouts.layouts[j];
        for (j = includedlayouts.length; i < j; i++)
        {
            if (TextUtils.equals(s, includedlayouts[i]))
            {
                return i;
            }
        }

        return -1;
    }

    private static int findLastMatching(ViewGroup viewgroup, int i)
    {
        String s = (String)viewgroup.getChildAt(i).getTag();
        String s1 = s.substring(0, s.length() - 1);
        int l = s1.length();
        int i1 = viewgroup.getChildCount();
        int j = i;
        i++;
        do
        {
            int k;
label0:
            {
                String s2;
label1:
                {
                    if (i < i1)
                    {
                        s2 = (String)viewgroup.getChildAt(i).getTag();
                        k = j;
                        if (s2 == null)
                        {
                            break label0;
                        }
                        k = j;
                        if (!s2.startsWith(s1))
                        {
                            break label0;
                        }
                        if (s2.length() != s.length() || s2.charAt(s2.length() - 1) != '0')
                        {
                            break label1;
                        }
                    }
                    return j;
                }
                k = j;
                if (isNumeric(s2, l))
                {
                    k = i;
                }
            }
            i++;
            j = k;
        } while (true);
    }

    static ViewDataBinding getBinding(View view)
    {
        if (view != null)
        {
            if (USE_TAG_ID)
            {
                return (ViewDataBinding)view.getTag(com.android.databinding.library.R.id.dataBinding);
            }
            view = ((View) (view.getTag()));
            if (view instanceof ViewDataBinding)
            {
                return (ViewDataBinding)view;
            }
        }
        return null;
    }

    public static int getBuildSdkInt()
    {
        return SDK_INT;
    }

    private void handleFieldChange(int i, Object obj, int j)
    {
        if (onFieldChange(i, obj, j))
        {
            requestRebind();
        }
    }

    private static boolean isNumeric(String s, int i)
    {
        int j = s.length();
        if (j != i) goto _L2; else goto _L1
_L1:
        return false;
_L2:
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                if (!Character.isDigit(s.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private static void mapBindings(View view, Object aobj[], IncludedLayouts includedlayouts, SparseIntArray sparseintarray, boolean flag)
    {
        if (getBinding(view) == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        int j;
        obj = (String)view.getTag();
        j = 0;
        if (!flag || obj == null || !((String) (obj)).startsWith("layout")) goto _L4; else goto _L3
_L3:
        int i;
        i = ((String) (obj)).lastIndexOf('_');
        String s;
        int l;
        boolean flag1;
        boolean flag2;
        int k1;
        int l1;
        if (i > 0 && isNumeric(((String) (obj)), i + 1))
        {
            i = parseTagInt(((String) (obj)), i + 1);
            if (aobj[i] == null)
            {
                aobj[i] = view;
            }
            if (includedlayouts == null)
            {
                i = -1;
            }
            j = 1;
        } else
        {
            i = -1;
        }
_L5:
        if (j == 0)
        {
            j = view.getId();
            if (j > 0 && sparseintarray != null)
            {
                j = sparseintarray.get(j, -1);
                if (j >= 0 && aobj[j] == null)
                {
                    aobj[j] = view;
                }
            }
        }
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            k1 = view.getChildCount();
            int i1 = 0;
            j = 0;
            while (j < k1) 
            {
                obj = view.getChildAt(j);
                flag2 = false;
                int k = j;
                flag1 = flag2;
                l = i1;
                if (i >= 0)
                {
                    s = (String)((View) (obj)).getTag();
                    k = j;
                    flag1 = flag2;
                    l = i1;
                    if (s != null)
                    {
                        k = j;
                        flag1 = flag2;
                        l = i1;
                        if (s.endsWith("_0"))
                        {
                            k = j;
                            flag1 = flag2;
                            l = i1;
                            if (s.startsWith("layout"))
                            {
                                k = j;
                                flag1 = flag2;
                                l = i1;
                                if (s.indexOf('/') > 0)
                                {
                                    l1 = findIncludeIndex(s, i1, includedlayouts, i);
                                    k = j;
                                    flag1 = flag2;
                                    l = i1;
                                    if (l1 >= 0)
                                    {
                                        flag1 = true;
                                        l = l1 + 1;
                                        i1 = includedlayouts.indexes[i][l1];
                                        int j1 = includedlayouts.layoutIds[i][l1];
                                        k = findLastMatching(view, j);
                                        if (k == j)
                                        {
                                            aobj[i1] = DataBindingUtil.bind(((View) (obj)), j1);
                                            k = j;
                                        } else
                                        {
                                            int i2 = (k - j) + 1;
                                            View aview[] = new View[i2];
                                            for (k = 0; k < i2; k++)
                                            {
                                                aview[k] = view.getChildAt(j + k);
                                            }

                                            aobj[i1] = DataBindingUtil.bind(aview, j1);
                                            k = j + (i2 - 1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (!flag1)
                {
                    mapBindings(((View) (obj)), aobj, includedlayouts, sparseintarray, false);
                }
                j = k + 1;
                i1 = l;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (obj != null && ((String) (obj)).startsWith("binding_"))
        {
            i = parseTagInt(((String) (obj)), BINDING_NUMBER_START);
            if (aobj[i] == null)
            {
                aobj[i] = view;
            }
            j = 1;
            if (includedlayouts == null)
            {
                i = -1;
            }
        } else
        {
            i = -1;
        }
          goto _L5
    }

    protected static Object[] mapBindings(View view, int i, IncludedLayouts includedlayouts, SparseIntArray sparseintarray)
    {
        Object aobj[] = new Object[i];
        mapBindings(view, aobj, includedlayouts, sparseintarray, true);
        return aobj;
    }

    protected static Object[] mapBindings(View aview[], int i, IncludedLayouts includedlayouts, SparseIntArray sparseintarray)
    {
        Object aobj[] = new Object[i];
        for (i = 0; i < aview.length; i++)
        {
            mapBindings(aview[i], aobj, includedlayouts, sparseintarray, true);
        }

        return aobj;
    }

    private static int parseTagInt(String s, int i)
    {
        int k = s.length();
        int j = 0;
        for (; i < k; i++)
        {
            j = j * 10 + (s.charAt(i) - 48);
        }

        return j;
    }

    private boolean updateRegistration(int i, Object obj, CreateWeakListener createweaklistener)
    {
        if (obj == null)
        {
            return unregisterFrom(i);
        }
        WeakListener weaklistener = mLocalFieldObservers[i];
        if (weaklistener == null)
        {
            registerTo(i, obj, createweaklistener);
            return true;
        }
        if (weaklistener.getTarget() == obj)
        {
            return false;
        } else
        {
            unregisterFrom(i);
            registerTo(i, obj, createweaklistener);
            return true;
        }
    }

    public void addOnRebindCallback(OnRebindCallback onrebindcallback)
    {
        if (mRebindCallbacks == null)
        {
            mRebindCallbacks = new CallbackRegistry(REBIND_NOTIFIER);
        }
        mRebindCallbacks.add(onrebindcallback);
    }

    protected abstract void executeBindings();

    public void executePendingBindings()
    {
        if (mIsExecutingPendingBindings)
        {
            requestRebind();
        } else
        if (hasPendingBindings())
        {
            mIsExecutingPendingBindings = true;
            mRebindHalted = false;
            if (mRebindCallbacks != null)
            {
                mRebindCallbacks.notifyCallbacks(this, 1, null);
                if (mRebindHalted)
                {
                    mRebindCallbacks.notifyCallbacks(this, 2, null);
                }
            }
            if (!mRebindHalted)
            {
                executeBindings();
                if (mRebindCallbacks != null)
                {
                    mRebindCallbacks.notifyCallbacks(this, 3, null);
                }
            }
            mIsExecutingPendingBindings = false;
            return;
        }
    }

    protected void finalize()
        throws Throwable
    {
        unbind();
    }

    void forceExecuteBindings()
    {
        executeBindings();
    }

    protected Object getObservedField(int i)
    {
        WeakListener weaklistener = mLocalFieldObservers[i];
        if (weaklistener == null)
        {
            return null;
        } else
        {
            return weaklistener.getTarget();
        }
    }

    public View getRoot()
    {
        return mRoot;
    }

    public abstract boolean hasPendingBindings();

    public abstract void invalidateAll();

    protected abstract boolean onFieldChange(int i, Object obj, int j);

    protected void registerTo(int i, Object obj, CreateWeakListener createweaklistener)
    {
        if (obj == null)
        {
            return;
        }
        WeakListener weaklistener1 = mLocalFieldObservers[i];
        WeakListener weaklistener = weaklistener1;
        if (weaklistener1 == null)
        {
            weaklistener = createweaklistener.create(this, i);
            mLocalFieldObservers[i] = weaklistener;
        }
        weaklistener.setTarget(obj);
    }

    public void removeOnRebindCallback(OnRebindCallback onrebindcallback)
    {
        if (mRebindCallbacks != null)
        {
            mRebindCallbacks.remove(onrebindcallback);
        }
    }

    protected void requestRebind()
    {
        this;
        JVM INSTR monitorenter ;
        if (!mPendingRebind)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        mPendingRebind = true;
        this;
        JVM INSTR monitorexit ;
        Exception exception;
        if (USE_CHOREOGRAPHER)
        {
            mChoreographer.postFrameCallback(mFrameCallback);
            return;
        } else
        {
            mUIThreadHandler.post(mRebindRunnable);
            return;
        }
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void setRootTag(View view)
    {
        if (USE_TAG_ID)
        {
            view.setTag(com.android.databinding.library.R.id.dataBinding, this);
            return;
        } else
        {
            view.setTag(this);
            return;
        }
    }

    protected void setRootTag(View aview[])
    {
        if (USE_TAG_ID)
        {
            int k = aview.length;
            for (int i = 0; i < k; i++)
            {
                aview[i].setTag(com.android.databinding.library.R.id.dataBinding, this);
            }

        } else
        {
            int l = aview.length;
            for (int j = 0; j < l; j++)
            {
                aview[j].setTag(this);
            }

        }
    }

    public abstract boolean setVariable(int i, Object obj);

    public void unbind()
    {
        WeakListener aweaklistener[] = mLocalFieldObservers;
        int j = aweaklistener.length;
        for (int i = 0; i < j; i++)
        {
            WeakListener weaklistener = aweaklistener[i];
            if (weaklistener != null)
            {
                weaklistener.unregister();
            }
        }

    }

    protected boolean unregisterFrom(int i)
    {
        WeakListener weaklistener = mLocalFieldObservers[i];
        if (weaklistener != null)
        {
            return weaklistener.unregister();
        } else
        {
            return false;
        }
    }

    protected boolean updateRegistration(int i, Observable observable)
    {
        return updateRegistration(i, observable, CREATE_PROPERTY_LISTENER);
    }

    protected boolean updateRegistration(int i, ObservableList observablelist)
    {
        return updateRegistration(i, observablelist, CREATE_LIST_LISTENER);
    }

    protected boolean updateRegistration(int i, ObservableMap observablemap)
    {
        return updateRegistration(i, observablemap, CREATE_MAP_LISTENER);
    }

    static 
    {
        boolean flag1 = true;
        SDK_INT = android.os.Build.VERSION.SDK_INT;
        boolean flag;
        if (DataBinderMapper.TARGET_MIN_SDK >= 14)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        USE_TAG_ID = flag;
        if (SDK_INT >= 16)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        USE_CHOREOGRAPHER = flag;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            ROOT_REATTACHED_LISTENER = null;
        } else
        {
            ROOT_REATTACHED_LISTENER = new android.view.View.OnAttachStateChangeListener() {

                public void onViewAttachedToWindow(View view)
                {
                    ViewDataBinding.getBinding(view).mRebindRunnable.run();
                    view.removeOnAttachStateChangeListener(this);
                }

                public void onViewDetachedFromWindow(View view)
                {
                }

            };
        }
    }


/*
    static boolean access$002(ViewDataBinding viewdatabinding, boolean flag)
    {
        viewdatabinding.mRebindHalted = flag;
        return flag;
    }

*/



/*
    static boolean access$202(ViewDataBinding viewdatabinding, boolean flag)
    {
        viewdatabinding.mPendingRebind = flag;
        return flag;
    }

*/



}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            IntEvaluator, FloatEvaluator, KeyframeSet, IntKeyframeSet, 
//            FloatKeyframeSet, Keyframe, TypeEvaluator

public class PropertyValuesHolder
    implements Cloneable
{
    static class FloatPropertyValuesHolder extends PropertyValuesHolder
    {

        float mFloatAnimatedValue;
        FloatKeyframeSet mFloatKeyframeSet;

        void calculateValue(float f)
        {
            mFloatAnimatedValue = mFloatKeyframeSet.getFloatValue(f);
        }

        public FloatPropertyValuesHolder clone()
        {
            FloatPropertyValuesHolder floatpropertyvaluesholder = (FloatPropertyValuesHolder)clone();
            floatpropertyvaluesholder.mFloatKeyframeSet = (FloatKeyframeSet)floatpropertyvaluesholder.mKeyframeSet;
            return floatpropertyvaluesholder;
        }

        public volatile PropertyValuesHolder clone()
        {
            return clone();
        }

        Object getAnimatedValue()
        {
            return Float.valueOf(mFloatAnimatedValue);
        }

        void setAnimatedValue(Object obj)
        {
            if (mSetter == null)
            {
                break MISSING_BLOCK_LABEL_33;
            }
            mTmpValueArray[0] = Float.valueOf(mFloatAnimatedValue);
            mSetter.invoke(obj, mTmpValueArray);
            return;
            obj;
            Log.e("PropertyValuesHolder", ((InvocationTargetException) (obj)).toString());
            return;
            obj;
            Log.e("PropertyValuesHolder", ((IllegalAccessException) (obj)).toString());
            return;
        }

        public transient void setFloatValues(float af[])
        {
            setFloatValues(af);
            mFloatKeyframeSet = (FloatKeyframeSet)mKeyframeSet;
        }

        void setupSetter(Class class1)
        {
            setupSetter(class1);
        }

        public FloatPropertyValuesHolder(String s, FloatKeyframeSet floatkeyframeset)
        {
            super(s, null);
            mValueType = Float.TYPE;
            mKeyframeSet = floatkeyframeset;
            mFloatKeyframeSet = (FloatKeyframeSet)mKeyframeSet;
        }

        public transient FloatPropertyValuesHolder(String s, float af[])
        {
            super(s, null);
            setFloatValues(af);
        }
    }

    static class IntPropertyValuesHolder extends PropertyValuesHolder
    {

        int mIntAnimatedValue;
        IntKeyframeSet mIntKeyframeSet;

        void calculateValue(float f)
        {
            mIntAnimatedValue = mIntKeyframeSet.getIntValue(f);
        }

        public IntPropertyValuesHolder clone()
        {
            IntPropertyValuesHolder intpropertyvaluesholder = (IntPropertyValuesHolder)clone();
            intpropertyvaluesholder.mIntKeyframeSet = (IntKeyframeSet)intpropertyvaluesholder.mKeyframeSet;
            return intpropertyvaluesholder;
        }

        public volatile PropertyValuesHolder clone()
        {
            return clone();
        }

        Object getAnimatedValue()
        {
            return Integer.valueOf(mIntAnimatedValue);
        }

        void setAnimatedValue(Object obj)
        {
            if (mSetter == null)
            {
                break MISSING_BLOCK_LABEL_33;
            }
            mTmpValueArray[0] = Integer.valueOf(mIntAnimatedValue);
            mSetter.invoke(obj, mTmpValueArray);
            return;
            obj;
            Log.e("PropertyValuesHolder", ((InvocationTargetException) (obj)).toString());
            return;
            obj;
            Log.e("PropertyValuesHolder", ((IllegalAccessException) (obj)).toString());
            return;
        }

        public transient void setIntValues(int ai[])
        {
            setIntValues(ai);
            mIntKeyframeSet = (IntKeyframeSet)mKeyframeSet;
        }

        void setupSetter(Class class1)
        {
            setupSetter(class1);
        }

        public IntPropertyValuesHolder(String s, IntKeyframeSet intkeyframeset)
        {
            super(s, null);
            mValueType = Integer.TYPE;
            mKeyframeSet = intkeyframeset;
            mIntKeyframeSet = (IntKeyframeSet)mKeyframeSet;
        }

        public transient IntPropertyValuesHolder(String s, int ai[])
        {
            super(s, null);
            setIntValues(ai);
        }
    }


    private static Class DOUBLE_VARIANTS[];
    private static Class FLOAT_VARIANTS[];
    private static Class INTEGER_VARIANTS[];
    private static final TypeEvaluator sFloatEvaluator = new FloatEvaluator();
    private static final HashMap sGetterPropertyMap = new HashMap();
    private static final TypeEvaluator sIntEvaluator = new IntEvaluator();
    private static final HashMap sSetterPropertyMap = new HashMap();
    private Object mAnimatedValue;
    private TypeEvaluator mEvaluator;
    private Method mGetter;
    KeyframeSet mKeyframeSet;
    final ReentrantReadWriteLock mPropertyMapLock;
    String mPropertyName;
    Method mSetter;
    final Object mTmpValueArray[];
    Class mValueType;

    private PropertyValuesHolder(String s)
    {
        mSetter = null;
        mGetter = null;
        mKeyframeSet = null;
        mPropertyMapLock = new ReentrantReadWriteLock();
        mTmpValueArray = new Object[1];
        mPropertyName = s;
    }

    PropertyValuesHolder(String s, PropertyValuesHolder propertyvaluesholder)
    {
        this(s);
    }

    static String getMethodName(String s, String s1)
    {
        if (s1 == null || s1.length() == 0)
        {
            return s;
        } else
        {
            char c = Character.toUpperCase(s1.charAt(0));
            s1 = s1.substring(1);
            return (new StringBuilder(String.valueOf(s))).append(c).append(s1).toString();
        }
    }

    private Method getPropertyFunction(Class class1, String s, Class class2)
    {
        Method method;
        Method method1;
        String s1;
        method = null;
        method1 = null;
        s1 = getMethodName(s, mPropertyName);
        if (class2 != null) goto _L2; else goto _L1
_L1:
        try
        {
            method = class1.getMethod(s1, null);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("PropertyValuesHolder", (new StringBuilder(String.valueOf(class1.getSimpleName()))).append(" - ").append("Couldn't find no-arg method for property ").append(mPropertyName).append(": ").append(s).toString());
            method = method1;
        }
_L4:
        return method;
_L2:
        Class aclass[];
        int i;
        aclass = new Class[1];
        int j;
        if (mValueType.equals(java/lang/Float))
        {
            class2 = FLOAT_VARIANTS;
        } else
        if (mValueType.equals(java/lang/Integer))
        {
            class2 = INTEGER_VARIANTS;
        } else
        if (mValueType.equals(java/lang/Double))
        {
            class2 = DOUBLE_VARIANTS;
        } else
        {
            class2 = new Class[1];
            class2[0] = mValueType;
        }
        j = class2.length;
        i = 0;
_L5:
label0:
        {
            if (i < j)
            {
                break label0;
            }
            Log.e("PropertyValuesHolder", (new StringBuilder("Couldn't find ")).append(s).append("ter property ").append(mPropertyName).append(" for ").append(class1.getSimpleName()).append(" with value type ").append(mValueType).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
        Class class3;
        class3 = class2[i];
        aclass[0] = class3;
        method1 = class1.getMethod(s1, aclass);
        method = method1;
        mValueType = class3;
        return method1;
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        i++;
          goto _L5
    }

    public static transient PropertyValuesHolder ofFloat(String s, float af[])
    {
        return new FloatPropertyValuesHolder(s, af);
    }

    public static transient PropertyValuesHolder ofInt(String s, int ai[])
    {
        return new IntPropertyValuesHolder(s, ai);
    }

    public static transient PropertyValuesHolder ofKeyframe(String s, Keyframe akeyframe[])
    {
        KeyframeSet keyframeset = KeyframeSet.ofKeyframe(akeyframe);
        if (keyframeset instanceof IntKeyframeSet)
        {
            return new IntPropertyValuesHolder(s, (IntKeyframeSet)keyframeset);
        }
        if (keyframeset instanceof FloatKeyframeSet)
        {
            return new FloatPropertyValuesHolder(s, (FloatKeyframeSet)keyframeset);
        } else
        {
            s = new PropertyValuesHolder(s);
            s.mKeyframeSet = keyframeset;
            s.mValueType = akeyframe[0].getType();
            return s;
        }
    }

    public static transient PropertyValuesHolder ofObject(String s, TypeEvaluator typeevaluator, Object aobj[])
    {
        s = new PropertyValuesHolder(s);
        s.setObjectValues(aobj);
        s.setEvaluator(typeevaluator);
        return s;
    }

    private void setupGetter(Class class1)
    {
        mGetter = setupSetterOrGetter(class1, sGetterPropertyMap, "get", null);
    }

    private Method setupSetterOrGetter(Class class1, HashMap hashmap, String s, Class class2)
    {
        Method method = null;
        HashMap hashmap1;
        mPropertyMapLock.writeLock().lock();
        hashmap1 = (HashMap)hashmap.get(class1);
        if (hashmap1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        method = (Method)hashmap1.get(mPropertyName);
        Method method1;
        method1 = method;
        if (method != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        method1 = getPropertyFunction(class1, s, class2);
        s = hashmap1;
        if (hashmap1 != null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        s = new HashMap();
        hashmap.put(class1, s);
        s.put(mPropertyName, method1);
        mPropertyMapLock.writeLock().unlock();
        return method1;
        class1;
        mPropertyMapLock.writeLock().unlock();
        throw class1;
    }

    private void setupValue(Object obj, Keyframe keyframe)
    {
        try
        {
            if (mGetter == null)
            {
                setupGetter(obj.getClass());
            }
            keyframe.setValue(mGetter.invoke(obj, new Object[0]));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("PropertyValuesHolder", ((InvocationTargetException) (obj)).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("PropertyValuesHolder", ((IllegalAccessException) (obj)).toString());
        }
    }

    void calculateValue(float f)
    {
        mAnimatedValue = mKeyframeSet.getValue(f);
    }

    public PropertyValuesHolder clone()
    {
        PropertyValuesHolder propertyvaluesholder;
        try
        {
            propertyvaluesholder = (PropertyValuesHolder)super.clone();
            propertyvaluesholder.mPropertyName = mPropertyName;
            propertyvaluesholder.mKeyframeSet = mKeyframeSet.clone();
            propertyvaluesholder.mEvaluator = mEvaluator;
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        return propertyvaluesholder;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    Object getAnimatedValue()
    {
        return mAnimatedValue;
    }

    public String getPropertyName()
    {
        return mPropertyName;
    }

    void init()
    {
        if (mEvaluator == null)
        {
            TypeEvaluator typeevaluator;
            if (mValueType == java/lang/Integer)
            {
                typeevaluator = sIntEvaluator;
            } else
            if (mValueType == java/lang/Float)
            {
                typeevaluator = sFloatEvaluator;
            } else
            {
                typeevaluator = null;
            }
            mEvaluator = typeevaluator;
        }
        if (mEvaluator != null)
        {
            mKeyframeSet.setEvaluator(mEvaluator);
        }
    }

    void setAnimatedValue(Object obj)
    {
        if (mSetter == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        mTmpValueArray[0] = getAnimatedValue();
        mSetter.invoke(obj, mTmpValueArray);
        return;
        obj;
        Log.e("PropertyValuesHolder", ((InvocationTargetException) (obj)).toString());
        return;
        obj;
        Log.e("PropertyValuesHolder", ((IllegalAccessException) (obj)).toString());
        return;
    }

    public void setEvaluator(TypeEvaluator typeevaluator)
    {
        mEvaluator = typeevaluator;
        mKeyframeSet.setEvaluator(typeevaluator);
    }

    public transient void setFloatValues(float af[])
    {
        mValueType = Float.TYPE;
        mKeyframeSet = KeyframeSet.ofFloat(af);
    }

    public transient void setIntValues(int ai[])
    {
        mValueType = Integer.TYPE;
        mKeyframeSet = KeyframeSet.ofInt(ai);
    }

    public transient void setKeyframes(Keyframe akeyframe[])
    {
        int j = akeyframe.length;
        Keyframe akeyframe1[] = new Keyframe[Math.max(j, 2)];
        mValueType = akeyframe[0].getType();
        int i = 0;
        do
        {
            if (i >= j)
            {
                mKeyframeSet = new KeyframeSet(akeyframe1);
                return;
            }
            akeyframe1[i] = akeyframe[i];
            i++;
        } while (true);
    }

    public transient void setObjectValues(Object aobj[])
    {
        mValueType = aobj[0].getClass();
        mKeyframeSet = KeyframeSet.ofObject(aobj);
    }

    public void setPropertyName(String s)
    {
        mPropertyName = s;
    }

    void setupEndValue(Object obj)
    {
        setupValue(obj, (Keyframe)mKeyframeSet.mKeyframes.get(mKeyframeSet.mKeyframes.size() - 1));
    }

    void setupSetter(Class class1)
    {
        mSetter = setupSetterOrGetter(class1, sSetterPropertyMap, "set", mValueType);
    }

    void setupSetterAndGetter(Object obj)
    {
        Class class1 = obj.getClass();
        if (mSetter == null)
        {
            setupSetter(class1);
        }
        Iterator iterator = mKeyframeSet.mKeyframes.iterator();
        do
        {
            Keyframe keyframe;
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                keyframe = (Keyframe)iterator.next();
            } while (keyframe.hasValue());
            if (mGetter == null)
            {
                setupGetter(class1);
            }
            try
            {
                keyframe.setValue(mGetter.invoke(obj, new Object[0]));
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                Log.e("PropertyValuesHolder", invocationtargetexception.toString());
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                Log.e("PropertyValuesHolder", illegalaccessexception.toString());
            }
        } while (true);
    }

    void setupStartValue(Object obj)
    {
        setupValue(obj, (Keyframe)mKeyframeSet.mKeyframes.get(0));
    }

    public String toString()
    {
        return (new StringBuilder(String.valueOf(mPropertyName))).append(": ").append(mKeyframeSet.toString()).toString();
    }

    static 
    {
        FLOAT_VARIANTS = (new Class[] {
            Float.TYPE, java/lang/Float, Double.TYPE, Integer.TYPE, java/lang/Double, java/lang/Integer
        });
        INTEGER_VARIANTS = (new Class[] {
            Integer.TYPE, java/lang/Integer, Float.TYPE, Double.TYPE, java/lang/Float, java/lang/Double
        });
        DOUBLE_VARIANTS = (new Class[] {
            Double.TYPE, java/lang/Double, Float.TYPE, Integer.TYPE, java/lang/Float, java/lang/Integer
        });
    }
}

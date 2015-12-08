// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;

import android.view.View;
import com.nineoldandroids.util.FloatProperty;
import com.nineoldandroids.util.IntProperty;
import com.nineoldandroids.util.Property;
import com.nineoldandroids.view.animation.AnimatorProxy;

final class PreHoneycombCompat
{

    static Property ALPHA = new FloatProperty("alpha") {

        public Float get(View view)
        {
            return Float.valueOf(AnimatorProxy.wrap(view).getAlpha());
        }

        public volatile Object get(Object obj)
        {
            return get((View)obj);
        }

        public void setValue(View view, float f)
        {
            AnimatorProxy.wrap(view).setAlpha(f);
        }

        public volatile void setValue(Object obj, float f)
        {
            setValue((View)obj, f);
        }

    };
    static Property PIVOT_X = new FloatProperty("pivotX") {

        public Float get(View view)
        {
            return Float.valueOf(AnimatorProxy.wrap(view).getPivotX());
        }

        public volatile Object get(Object obj)
        {
            return get((View)obj);
        }

        public void setValue(View view, float f)
        {
            AnimatorProxy.wrap(view).setPivotX(f);
        }

        public volatile void setValue(Object obj, float f)
        {
            setValue((View)obj, f);
        }

    };
    static Property PIVOT_Y = new FloatProperty("pivotY") {

        public Float get(View view)
        {
            return Float.valueOf(AnimatorProxy.wrap(view).getPivotY());
        }

        public volatile Object get(Object obj)
        {
            return get((View)obj);
        }

        public void setValue(View view, float f)
        {
            AnimatorProxy.wrap(view).setPivotY(f);
        }

        public volatile void setValue(Object obj, float f)
        {
            setValue((View)obj, f);
        }

    };
    static Property ROTATION = new FloatProperty("rotation") {

        public Float get(View view)
        {
            return Float.valueOf(AnimatorProxy.wrap(view).getRotation());
        }

        public volatile Object get(Object obj)
        {
            return get((View)obj);
        }

        public void setValue(View view, float f)
        {
            AnimatorProxy.wrap(view).setRotation(f);
        }

        public volatile void setValue(Object obj, float f)
        {
            setValue((View)obj, f);
        }

    };
    static Property ROTATION_X = new FloatProperty("rotationX") {

        public Float get(View view)
        {
            return Float.valueOf(AnimatorProxy.wrap(view).getRotationX());
        }

        public volatile Object get(Object obj)
        {
            return get((View)obj);
        }

        public void setValue(View view, float f)
        {
            AnimatorProxy.wrap(view).setRotationX(f);
        }

        public volatile void setValue(Object obj, float f)
        {
            setValue((View)obj, f);
        }

    };
    static Property ROTATION_Y = new FloatProperty("rotationY") {

        public Float get(View view)
        {
            return Float.valueOf(AnimatorProxy.wrap(view).getRotationY());
        }

        public volatile Object get(Object obj)
        {
            return get((View)obj);
        }

        public void setValue(View view, float f)
        {
            AnimatorProxy.wrap(view).setRotationY(f);
        }

        public volatile void setValue(Object obj, float f)
        {
            setValue((View)obj, f);
        }

    };
    static Property SCALE_X = new FloatProperty("scaleX") {

        public Float get(View view)
        {
            return Float.valueOf(AnimatorProxy.wrap(view).getScaleX());
        }

        public volatile Object get(Object obj)
        {
            return get((View)obj);
        }

        public void setValue(View view, float f)
        {
            AnimatorProxy.wrap(view).setScaleX(f);
        }

        public volatile void setValue(Object obj, float f)
        {
            setValue((View)obj, f);
        }

    };
    static Property SCALE_Y = new FloatProperty("scaleY") {

        public Float get(View view)
        {
            return Float.valueOf(AnimatorProxy.wrap(view).getScaleY());
        }

        public volatile Object get(Object obj)
        {
            return get((View)obj);
        }

        public void setValue(View view, float f)
        {
            AnimatorProxy.wrap(view).setScaleY(f);
        }

        public volatile void setValue(Object obj, float f)
        {
            setValue((View)obj, f);
        }

    };
    static Property SCROLL_X = new IntProperty("scrollX") {

        public Integer get(View view)
        {
            return Integer.valueOf(AnimatorProxy.wrap(view).getScrollX());
        }

        public volatile Object get(Object obj)
        {
            return get((View)obj);
        }

        public void setValue(View view, int i)
        {
            AnimatorProxy.wrap(view).setScrollX(i);
        }

        public volatile void setValue(Object obj, int i)
        {
            setValue((View)obj, i);
        }

    };
    static Property SCROLL_Y = new IntProperty("scrollY") {

        public Integer get(View view)
        {
            return Integer.valueOf(AnimatorProxy.wrap(view).getScrollY());
        }

        public volatile Object get(Object obj)
        {
            return get((View)obj);
        }

        public void setValue(View view, int i)
        {
            AnimatorProxy.wrap(view).setScrollY(i);
        }

        public volatile void setValue(Object obj, int i)
        {
            setValue((View)obj, i);
        }

    };
    static Property TRANSLATION_X = new FloatProperty("translationX") {

        public Float get(View view)
        {
            return Float.valueOf(AnimatorProxy.wrap(view).getTranslationX());
        }

        public volatile Object get(Object obj)
        {
            return get((View)obj);
        }

        public void setValue(View view, float f)
        {
            AnimatorProxy.wrap(view).setTranslationX(f);
        }

        public volatile void setValue(Object obj, float f)
        {
            setValue((View)obj, f);
        }

    };
    static Property TRANSLATION_Y = new FloatProperty("translationY") {

        public Float get(View view)
        {
            return Float.valueOf(AnimatorProxy.wrap(view).getTranslationY());
        }

        public volatile Object get(Object obj)
        {
            return get((View)obj);
        }

        public void setValue(View view, float f)
        {
            AnimatorProxy.wrap(view).setTranslationY(f);
        }

        public volatile void setValue(Object obj, float f)
        {
            setValue((View)obj, f);
        }

    };
    static Property X = new FloatProperty("x") {

        public Float get(View view)
        {
            return Float.valueOf(AnimatorProxy.wrap(view).getX());
        }

        public volatile Object get(Object obj)
        {
            return get((View)obj);
        }

        public void setValue(View view, float f)
        {
            AnimatorProxy.wrap(view).setX(f);
        }

        public volatile void setValue(Object obj, float f)
        {
            setValue((View)obj, f);
        }

    };
    static Property Y = new FloatProperty("y") {

        public Float get(View view)
        {
            return Float.valueOf(AnimatorProxy.wrap(view).getY());
        }

        public volatile Object get(Object obj)
        {
            return get((View)obj);
        }

        public void setValue(View view, float f)
        {
            AnimatorProxy.wrap(view).setY(f);
        }

        public volatile void setValue(Object obj, float f)
        {
            setValue((View)obj, f);
        }

    };

    private PreHoneycombCompat()
    {
    }

}

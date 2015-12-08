// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

class ad extends Resources
{

    private final Resources a;

    public ad(Resources resources)
    {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        a = resources;
    }

    public XmlResourceParser getAnimation(int i)
    {
        return a.getAnimation(i);
    }

    public boolean getBoolean(int i)
    {
        return a.getBoolean(i);
    }

    public int getColor(int i)
    {
        return a.getColor(i);
    }

    public ColorStateList getColorStateList(int i)
    {
        return a.getColorStateList(i);
    }

    public Configuration getConfiguration()
    {
        return a.getConfiguration();
    }

    public float getDimension(int i)
    {
        return a.getDimension(i);
    }

    public int getDimensionPixelOffset(int i)
    {
        return a.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i)
    {
        return a.getDimensionPixelSize(i);
    }

    public DisplayMetrics getDisplayMetrics()
    {
        return a.getDisplayMetrics();
    }

    public Drawable getDrawable(int i)
    {
        return a.getDrawable(i);
    }

    public Drawable getDrawable(int i, android.content.res.Resources.Theme theme)
    {
        return a.getDrawable(i, theme);
    }

    public Drawable getDrawableForDensity(int i, int j)
    {
        return a.getDrawableForDensity(i, j);
    }

    public Drawable getDrawableForDensity(int i, int j, android.content.res.Resources.Theme theme)
    {
        return a.getDrawableForDensity(i, j, theme);
    }

    public float getFraction(int i, int j, int k)
    {
        return a.getFraction(i, j, k);
    }

    public int getIdentifier(String s, String s1, String s2)
    {
        return a.getIdentifier(s, s1, s2);
    }

    public int[] getIntArray(int i)
    {
        return a.getIntArray(i);
    }

    public int getInteger(int i)
    {
        return a.getInteger(i);
    }

    public XmlResourceParser getLayout(int i)
    {
        return a.getLayout(i);
    }

    public Movie getMovie(int i)
    {
        return a.getMovie(i);
    }

    public String getQuantityString(int i, int j)
    {
        return a.getQuantityString(i, j);
    }

    public transient String getQuantityString(int i, int j, Object aobj[])
    {
        return a.getQuantityString(i, j, aobj);
    }

    public CharSequence getQuantityText(int i, int j)
    {
        return a.getQuantityText(i, j);
    }

    public String getResourceEntryName(int i)
    {
        return a.getResourceEntryName(i);
    }

    public String getResourceName(int i)
    {
        return a.getResourceName(i);
    }

    public String getResourcePackageName(int i)
    {
        return a.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i)
    {
        return a.getResourceTypeName(i);
    }

    public String getString(int i)
    {
        return a.getString(i);
    }

    public transient String getString(int i, Object aobj[])
    {
        return a.getString(i, aobj);
    }

    public String[] getStringArray(int i)
    {
        return a.getStringArray(i);
    }

    public CharSequence getText(int i)
    {
        return a.getText(i);
    }

    public CharSequence getText(int i, CharSequence charsequence)
    {
        return a.getText(i, charsequence);
    }

    public CharSequence[] getTextArray(int i)
    {
        return a.getTextArray(i);
    }

    public void getValue(int i, TypedValue typedvalue, boolean flag)
    {
        a.getValue(i, typedvalue, flag);
    }

    public void getValue(String s, TypedValue typedvalue, boolean flag)
    {
        a.getValue(s, typedvalue, flag);
    }

    public void getValueForDensity(int i, int j, TypedValue typedvalue, boolean flag)
    {
        a.getValueForDensity(i, j, typedvalue, flag);
    }

    public XmlResourceParser getXml(int i)
    {
        return a.getXml(i);
    }

    public TypedArray obtainAttributes(AttributeSet attributeset, int ai[])
    {
        return a.obtainAttributes(attributeset, ai);
    }

    public TypedArray obtainTypedArray(int i)
    {
        return a.obtainTypedArray(i);
    }

    public InputStream openRawResource(int i)
    {
        return a.openRawResource(i);
    }

    public InputStream openRawResource(int i, TypedValue typedvalue)
    {
        return a.openRawResource(i, typedvalue);
    }

    public AssetFileDescriptor openRawResourceFd(int i)
    {
        return a.openRawResourceFd(i);
    }

    public void parseBundleExtra(String s, AttributeSet attributeset, Bundle bundle)
    {
        a.parseBundleExtra(s, attributeset, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlresourceparser, Bundle bundle)
    {
        a.parseBundleExtras(xmlresourceparser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displaymetrics)
    {
        super.updateConfiguration(configuration, displaymetrics);
        if (a != null)
        {
            a.updateConfiguration(configuration, displaymetrics);
        }
    }
}

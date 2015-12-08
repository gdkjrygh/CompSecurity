// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

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
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

class ResourcesWrapper extends Resources
{

    private final Resources mResources;

    public ResourcesWrapper(Resources resources)
    {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        mResources = resources;
    }

    public XmlResourceParser getAnimation(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getAnimation(i);
    }

    public boolean getBoolean(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getBoolean(i);
    }

    public int getColor(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getColor(i);
    }

    public ColorStateList getColorStateList(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getColorStateList(i);
    }

    public Configuration getConfiguration()
    {
        return mResources.getConfiguration();
    }

    public float getDimension(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getDimension(i);
    }

    public int getDimensionPixelOffset(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getDimensionPixelSize(i);
    }

    public DisplayMetrics getDisplayMetrics()
    {
        return mResources.getDisplayMetrics();
    }

    public Drawable getDrawable(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getDrawable(i);
    }

    public Drawable getDrawable(int i, android.content.res.Resources.Theme theme)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getDrawable(i, theme);
    }

    public Drawable getDrawableForDensity(int i, int j)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getDrawableForDensity(i, j);
    }

    public Drawable getDrawableForDensity(int i, int j, android.content.res.Resources.Theme theme)
    {
        return mResources.getDrawableForDensity(i, j, theme);
    }

    public float getFraction(int i, int j, int k)
    {
        return mResources.getFraction(i, j, k);
    }

    public int getIdentifier(String s, String s1, String s2)
    {
        return mResources.getIdentifier(s, s1, s2);
    }

    public int[] getIntArray(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getIntArray(i);
    }

    public int getInteger(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getInteger(i);
    }

    public XmlResourceParser getLayout(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getLayout(i);
    }

    public Movie getMovie(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getMovie(i);
    }

    public String getQuantityString(int i, int j)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getQuantityString(i, j);
    }

    public transient String getQuantityString(int i, int j, Object aobj[])
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getQuantityString(i, j, aobj);
    }

    public CharSequence getQuantityText(int i, int j)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getQuantityText(i, j);
    }

    public String getResourceEntryName(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getResourceEntryName(i);
    }

    public String getResourceName(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getResourceName(i);
    }

    public String getResourcePackageName(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getResourceTypeName(i);
    }

    public String getString(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getString(i);
    }

    public transient String getString(int i, Object aobj[])
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getString(i, aobj);
    }

    public String[] getStringArray(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getStringArray(i);
    }

    public CharSequence getText(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getText(i);
    }

    public CharSequence getText(int i, CharSequence charsequence)
    {
        return mResources.getText(i, charsequence);
    }

    public CharSequence[] getTextArray(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getTextArray(i);
    }

    public void getValue(int i, TypedValue typedvalue, boolean flag)
        throws android.content.res.Resources.NotFoundException
    {
        mResources.getValue(i, typedvalue, flag);
    }

    public void getValue(String s, TypedValue typedvalue, boolean flag)
        throws android.content.res.Resources.NotFoundException
    {
        mResources.getValue(s, typedvalue, flag);
    }

    public void getValueForDensity(int i, int j, TypedValue typedvalue, boolean flag)
        throws android.content.res.Resources.NotFoundException
    {
        mResources.getValueForDensity(i, j, typedvalue, flag);
    }

    public XmlResourceParser getXml(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.getXml(i);
    }

    public TypedArray obtainAttributes(AttributeSet attributeset, int ai[])
    {
        return mResources.obtainAttributes(attributeset, ai);
    }

    public TypedArray obtainTypedArray(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.obtainTypedArray(i);
    }

    public InputStream openRawResource(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.openRawResource(i);
    }

    public InputStream openRawResource(int i, TypedValue typedvalue)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.openRawResource(i, typedvalue);
    }

    public AssetFileDescriptor openRawResourceFd(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return mResources.openRawResourceFd(i);
    }

    public void parseBundleExtra(String s, AttributeSet attributeset, Bundle bundle)
        throws XmlPullParserException
    {
        mResources.parseBundleExtra(s, attributeset, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlresourceparser, Bundle bundle)
        throws XmlPullParserException, IOException
    {
        mResources.parseBundleExtras(xmlresourceparser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displaymetrics)
    {
        super.updateConfiguration(configuration, displaymetrics);
        if (mResources != null)
        {
            mResources.updateConfiguration(configuration, displaymetrics);
        }
    }
}

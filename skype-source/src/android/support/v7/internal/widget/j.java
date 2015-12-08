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
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

class j extends Resources
{

    private final Resources a;

    public j(Resources resources)
    {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        a = resources;
    }

    public XmlResourceParser getAnimation(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getAnimation(i);
    }

    public boolean getBoolean(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getBoolean(i);
    }

    public int getColor(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getColor(i);
    }

    public ColorStateList getColorStateList(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getColorStateList(i);
    }

    public Configuration getConfiguration()
    {
        return a.getConfiguration();
    }

    public float getDimension(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getDimension(i);
    }

    public int getDimensionPixelOffset(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getDimensionPixelSize(i);
    }

    public DisplayMetrics getDisplayMetrics()
    {
        return a.getDisplayMetrics();
    }

    public Drawable getDrawable(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getDrawable(i);
    }

    public Drawable getDrawable(int i, android.content.res.Resources.Theme theme)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getDrawable(i, theme);
    }

    public Drawable getDrawableForDensity(int i, int k)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getDrawableForDensity(i, k);
    }

    public Drawable getDrawableForDensity(int i, int k, android.content.res.Resources.Theme theme)
    {
        return a.getDrawableForDensity(i, k, theme);
    }

    public float getFraction(int i, int k, int l)
    {
        return a.getFraction(i, k, l);
    }

    public int getIdentifier(String s, String s1, String s2)
    {
        return a.getIdentifier(s, s1, s2);
    }

    public int[] getIntArray(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getIntArray(i);
    }

    public int getInteger(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getInteger(i);
    }

    public XmlResourceParser getLayout(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getLayout(i);
    }

    public Movie getMovie(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getMovie(i);
    }

    public String getQuantityString(int i, int k)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getQuantityString(i, k);
    }

    public transient String getQuantityString(int i, int k, Object aobj[])
        throws android.content.res.Resources.NotFoundException
    {
        return a.getQuantityString(i, k, aobj);
    }

    public CharSequence getQuantityText(int i, int k)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getQuantityText(i, k);
    }

    public String getResourceEntryName(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getResourceEntryName(i);
    }

    public String getResourceName(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getResourceName(i);
    }

    public String getResourcePackageName(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getResourceTypeName(i);
    }

    public String getString(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getString(i);
    }

    public transient String getString(int i, Object aobj[])
        throws android.content.res.Resources.NotFoundException
    {
        return a.getString(i, aobj);
    }

    public String[] getStringArray(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getStringArray(i);
    }

    public CharSequence getText(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getText(i);
    }

    public CharSequence getText(int i, CharSequence charsequence)
    {
        return a.getText(i, charsequence);
    }

    public CharSequence[] getTextArray(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getTextArray(i);
    }

    public void getValue(int i, TypedValue typedvalue, boolean flag)
        throws android.content.res.Resources.NotFoundException
    {
        a.getValue(i, typedvalue, flag);
    }

    public void getValue(String s, TypedValue typedvalue, boolean flag)
        throws android.content.res.Resources.NotFoundException
    {
        a.getValue(s, typedvalue, flag);
    }

    public void getValueForDensity(int i, int k, TypedValue typedvalue, boolean flag)
        throws android.content.res.Resources.NotFoundException
    {
        a.getValueForDensity(i, k, typedvalue, flag);
    }

    public XmlResourceParser getXml(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.getXml(i);
    }

    public TypedArray obtainAttributes(AttributeSet attributeset, int ai[])
    {
        return a.obtainAttributes(attributeset, ai);
    }

    public TypedArray obtainTypedArray(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.obtainTypedArray(i);
    }

    public InputStream openRawResource(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.openRawResource(i);
    }

    public InputStream openRawResource(int i, TypedValue typedvalue)
        throws android.content.res.Resources.NotFoundException
    {
        return a.openRawResource(i, typedvalue);
    }

    public AssetFileDescriptor openRawResourceFd(int i)
        throws android.content.res.Resources.NotFoundException
    {
        return a.openRawResourceFd(i);
    }

    public void parseBundleExtra(String s, AttributeSet attributeset, Bundle bundle)
        throws XmlPullParserException
    {
        a.parseBundleExtra(s, attributeset, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlresourceparser, Bundle bundle)
        throws XmlPullParserException, IOException
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

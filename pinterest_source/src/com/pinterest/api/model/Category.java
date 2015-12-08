// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.kit.application.Resources;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.model:
//            Model, ModelHelper

public class Category extends Model
{

    public static final String CATEGORY_ALL = "everything";
    public static final String CATEGORY_ALL_COLOR = "#23326C";
    public static final String CATEGORY_ALL_ID = "2";
    public static final String CATEGORY_OTHER_ID = "1000";
    public static final String CATEGORY_POPULAR = "popular";
    public static final String CATEGORY_POPULAR_ID = "3";
    public static final String CATEGORY_TRAVEL = "travel";
    private static final String DELIM = "  &#183;  ";
    public static final String LOCAL_CATEGORIES[] = {
        "everything", "popular"
    };
    public static final String LOCAL_CATEGORY_IDS[] = {
        "2", "3"
    };
    public static final int LOCAL_CATEGORY_STRINGS[] = {
        0x7f070046, 0x7f070463, 0x7f07059c
    };
    private static final boolean SHOW_PIN_PICKS = false;
    public static final int TYPE_CATEGORY = 0;
    public static final int TYPE_INTEREST = 1;
    private List _subCategories;
    private Boolean browsable;
    private Date cacheExpirationDate;
    private String hash;
    private Long id;
    private String imageFullUrl;
    private String imageLargeUrl;
    private String imageMediumUrl;
    private String imageSmallUrl;
    private String key;
    private String name;
    private String pinImages;
    private String subCatString;
    private String subKeys;
    public int type;
    private String uid;

    public Category()
    {
        browsable = Boolean.valueOf(true);
        type = 0;
    }

    public Category(Long long1)
    {
        browsable = Boolean.valueOf(true);
        type = 0;
        id = long1;
    }

    public Category(Long long1, String s, Date date, String s1, Boolean boolean1, String s2, String s3, 
            String s4, String s5, String s6, String s7, String s8, String s9, String s10)
    {
        browsable = Boolean.valueOf(true);
        type = 0;
        id = long1;
        uid = s;
        cacheExpirationDate = date;
        key = s1;
        browsable = boolean1;
        name = s2;
        hash = s3;
        imageSmallUrl = s4;
        imageMediumUrl = s5;
        imageLargeUrl = s6;
        imageFullUrl = s7;
        pinImages = s8;
        subKeys = s9;
        subCatString = s10;
    }

    private static void addLocalCategories(List list)
    {
        for (int i = 0; i < 2; i++)
        {
            Category category = new Category();
            category.setName(Resources.string(LOCAL_CATEGORY_STRINGS[i]));
            category.setKey(LOCAL_CATEGORIES[i]);
            category.setId(Long.valueOf(LOCAL_CATEGORY_IDS[i]));
            category.setUid(LOCAL_CATEGORY_IDS[i]);
            category.setBrowsable(Boolean.valueOf(true));
            list.add(category);
        }

    }

    private static String getImageUrl(PinterestJsonObject pinterestjsonobject, String s)
    {
        pinterestjsonobject = pinterestjsonobject.c(s);
        if (pinterestjsonobject == null)
        {
            return null;
        } else
        {
            return pinterestjsonobject.a("url", "");
        }
    }

    public static Category make(PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        if (pinterestjsonobject == null)
        {
            pinterestjsonobject = new Category();
        } else
        {
            Category category = (Category)pinterestjsonobject.a(com/pinterest/api/model/Category);
            long l = pinterestjsonobject.a("enum_type", -1L);
            if (l != -1L)
            {
                category.setId(Long.valueOf(l));
            }
            category.setImageFullUrl(category.getImageLargeUrl());
            PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c("images");
            if (pinterestjsonobject1 != null)
            {
                String s = getImageUrl(pinterestjsonobject1, "45x");
                category.setImageSmallUrl(s);
                category.setImageMediumUrl(s);
                category.setImageLargeUrl(s);
                category.setImageFullUrl(getImageUrl(pinterestjsonobject1, "200x"));
            }
            pinterestjsonobject = pinterestjsonobject.e("subcategories");
            if (pinterestjsonobject.a() > 0)
            {
                ArrayList arraylist = new ArrayList();
                int j = pinterestjsonobject.a();
                for (int i = 0; i < j; i++)
                {
                    arraylist.add(make(pinterestjsonobject.d(i), false));
                }

                category.cacheSubCategories(arraylist);
                ModelHelper.setCategories(arraylist);
                pinterestjsonobject = "";
                for (Iterator iterator = arraylist.iterator(); iterator.hasNext();)
                {
                    Category category1 = (Category)iterator.next();
                    Object obj = pinterestjsonobject;
                    if (pinterestjsonobject.length() > 0)
                    {
                        obj = (new StringBuilder()).append(pinterestjsonobject).append(",").toString();
                    }
                    pinterestjsonobject = (new StringBuilder()).append(((String) (obj))).append(category1.getKey()).toString();
                }

                category.setSubKeys(pinterestjsonobject);
            }
            makeSubCatText(category);
            pinterestjsonobject = category;
            if (flag)
            {
                ModelHelper.setCategory(category);
                return category;
            }
        }
        return pinterestjsonobject;
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray)
    {
        return makeAll(pinterestjsonarray, false, true, true);
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray, boolean flag)
    {
        return makeAll(pinterestjsonarray, false, true, flag);
    }

    public static List makeAll(final PinterestJsonArray allCategories, boolean flag, boolean flag1, boolean flag2)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        if (flag1)
        {
            addLocalCategories(arraylist);
        }
        if (allCategories != null)
        {
            int j = allCategories.a();
            int i = 0;
            while (i < j) 
            {
                Category category = make(allCategories.d(i), false);
                if (category.getBrowsable().booleanValue())
                {
                    arraylist.add(category);
                } else
                {
                    arraylist1.add(category);
                    if (category.getName().equalsIgnoreCase("other"))
                    {
                        category.setId(Long.valueOf("1000"));
                        category.setUid("1000");
                    }
                }
                i++;
            }
        }
        allCategories = new ArrayList(arraylist);
        allCategories.addAll(arraylist1);
        if (flag2)
        {
            (new _cls1()).execute();
            Preferences.user().set("PREF_CATEGORIES_LOCALE", Locale.getDefault().toString());
        }
        if (flag)
        {
            return arraylist;
        } else
        {
            return allCategories;
        }
    }

    private static void makeSubCatText(Category category)
    {
        List list = category.getSubCategories();
        if (list == null || list.size() == 0)
        {
            return;
        }
        int j = list.size();
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(((Category)list.get(i)).getName());
            if (i != j - 1)
            {
                stringbuilder.append("  &#183;  ");
            }
        }

        category.setSubCatString(stringbuilder.toString());
    }

    public void cacheSubCategories(List list)
    {
        _subCategories = list;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Category)obj;
            if (key == null || !key.equals(((Category) (obj)).key))
            {
                return false;
            }
        }
        return true;
    }

    public Boolean getBrowsable()
    {
        return browsable;
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public String getHash()
    {
        return hash;
    }

    public Long getId()
    {
        return id;
    }

    public String getImageFullUrl()
    {
        return imageFullUrl;
    }

    public String getImageLargeUrl()
    {
        return imageLargeUrl;
    }

    public String getImageMediumUrl()
    {
        return imageMediumUrl;
    }

    public String getImageSmallUrl()
    {
        return imageSmallUrl;
    }

    public String getKey()
    {
        return key;
    }

    public String getName()
    {
        return name;
    }

    public String getPinImages()
    {
        return pinImages;
    }

    public List getPreviewImageUrls()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = arraylist;
        if (pinImages != null)
        {
            obj = arraylist;
            if (pinImages.length() > 0)
            {
                obj = Arrays.asList(StringUtils.split(pinImages, ","));
            }
        }
        return ((List) (obj));
    }

    public String getSubCatString()
    {
        return subCatString;
    }

    public List getSubCategories()
    {
        if (_subCategories == null && StringUtils.isNotEmpty(subKeys))
        {
            _subCategories = ModelHelper.getCategories(Arrays.asList(subKeys.split(",")));
        }
        return _subCategories;
    }

    public String getSubKeys()
    {
        return subKeys;
    }

    public int getType()
    {
        return type;
    }

    public String getUid()
    {
        return uid;
    }

    public boolean isLocal()
    {
        return Arrays.asList(LOCAL_CATEGORIES).contains(getKey());
    }

    public void setBrowsable(Boolean boolean1)
    {
        browsable = boolean1;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setHash(String s)
    {
        hash = s;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setImageFullUrl(String s)
    {
        imageFullUrl = s;
    }

    public void setImageLargeUrl(String s)
    {
        imageLargeUrl = s;
    }

    public void setImageMediumUrl(String s)
    {
        imageMediumUrl = s;
    }

    public void setImageSmallUrl(String s)
    {
        imageSmallUrl = s;
    }

    public void setKey(String s)
    {
        key = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPinImages(String s)
    {
        pinImages = s;
    }

    public void setSubCatString(String s)
    {
        subCatString = s;
    }

    public void setSubKeys(String s)
    {
        subKeys = s;
    }

    public void setTypeInterest()
    {
        type = 1;
    }

    public void setUid(String s)
    {
        uid = s;
    }


    private class _cls1 extends BackgroundTask
    {

        final List val$allCategories;

        public final void run()
        {
            ModelHelper.setCategories(allCategories);
        }

        _cls1()
        {
            allCategories = list;
            super();
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.analytics.utils.enums;


public final class ProductFindingMethod extends Enum
{

    private static final ProductFindingMethod $VALUES[];
    public static final ProductFindingMethod BROWSE;
    public static final ProductFindingMethod BROWSE_REFINE;
    public static final ProductFindingMethod EXTERNAL;
    public static final ProductFindingMethod EXTERNAL_CAMPAIGN;
    public static final ProductFindingMethod INTERNAL_CAMPAIGN;
    public static final ProductFindingMethod LIST;
    public static final ProductFindingMethod LIST_GUEST;
    public static final ProductFindingMethod LIST_OWNER;
    public static final ProductFindingMethod RECOMMENDATION;
    public static final ProductFindingMethod REGISTRY;
    public static final ProductFindingMethod REGISTRY_GUEST;
    public static final ProductFindingMethod REGISTRY_OWNER;
    public static final ProductFindingMethod SCAN;
    public static final ProductFindingMethod SCAN_REFINE;
    public static final ProductFindingMethod SEARCH;
    public static final ProductFindingMethod SEARCH_NO_MATCHES;
    public static final ProductFindingMethod SEARCH_REDIRECT;
    public static final ProductFindingMethod SEARCH_REDIRECT_REFINE;
    public static final ProductFindingMethod SEARCH_REFINE;
    public static final ProductFindingMethod SEARCH_VISUAL;
    public static final ProductFindingMethod SEARCH_VOICE;
    private String stringValue;

    private ProductFindingMethod(String s, int i, String s1)
    {
        super(s, i);
        stringValue = s1;
    }

    public static ProductFindingMethod valueOf(String s)
    {
        return (ProductFindingMethod)Enum.valueOf(com/analytics/utils/enums/ProductFindingMethod, s);
    }

    public static ProductFindingMethod[] values()
    {
        return (ProductFindingMethod[])$VALUES.clone();
    }

    public String toString()
    {
        return stringValue;
    }

    static 
    {
        BROWSE = new ProductFindingMethod("BROWSE", 0, "browse");
        BROWSE_REFINE = new ProductFindingMethod("BROWSE_REFINE", 1, "browse refine");
        SEARCH = new ProductFindingMethod("SEARCH", 2, "search");
        SEARCH_REFINE = new ProductFindingMethod("SEARCH_REFINE", 3, "search refine");
        SEARCH_REDIRECT = new ProductFindingMethod("SEARCH_REDIRECT", 4, "search-redirect");
        SEARCH_REDIRECT_REFINE = new ProductFindingMethod("SEARCH_REDIRECT_REFINE", 5, "search-redirect refine");
        RECOMMENDATION = new ProductFindingMethod("RECOMMENDATION", 6, "recommendation");
        INTERNAL_CAMPAIGN = new ProductFindingMethod("INTERNAL_CAMPAIGN", 7, "internal campaign");
        EXTERNAL = new ProductFindingMethod("EXTERNAL", 8, "external");
        EXTERNAL_CAMPAIGN = new ProductFindingMethod("EXTERNAL_CAMPAIGN", 9, "external campaign");
        LIST_GUEST = new ProductFindingMethod("LIST_GUEST", 10, "list|guest");
        LIST_OWNER = new ProductFindingMethod("LIST_OWNER", 11, "list|owner");
        SCAN = new ProductFindingMethod("SCAN", 12, "scan");
        SEARCH_VISUAL = new ProductFindingMethod("SEARCH_VISUAL", 13, "search-visual");
        SEARCH_NO_MATCHES = new ProductFindingMethod("SEARCH_NO_MATCHES", 14, "search-no matches");
        SEARCH_VOICE = new ProductFindingMethod("SEARCH_VOICE", 15, "search_voice");
        LIST = new ProductFindingMethod("LIST", 16, "list");
        REGISTRY_OWNER = new ProductFindingMethod("REGISTRY_OWNER", 17, "registry|owner");
        REGISTRY_GUEST = new ProductFindingMethod("REGISTRY_GUEST", 18, "registry|guest");
        REGISTRY = new ProductFindingMethod("REGISTRY", 19, "registry");
        SCAN_REFINE = new ProductFindingMethod("SCAN_REFINE", 20, "scan refine");
        $VALUES = (new ProductFindingMethod[] {
            BROWSE, BROWSE_REFINE, SEARCH, SEARCH_REFINE, SEARCH_REDIRECT, SEARCH_REDIRECT_REFINE, RECOMMENDATION, INTERNAL_CAMPAIGN, EXTERNAL, EXTERNAL_CAMPAIGN, 
            LIST_GUEST, LIST_OWNER, SCAN, SEARCH_VISUAL, SEARCH_NO_MATCHES, SEARCH_VOICE, LIST, REGISTRY_OWNER, REGISTRY_GUEST, REGISTRY, 
            SCAN_REFINE
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Extras
    implements Serializable
{

    public static final Set ALL_EXTRAS;
    public static final String DATE_TAKEN = "date_taken";
    public static final String DATE_UPLOAD = "date_upload";
    public static final String DESCRIPTION = "description";
    public static final String GEO = "geo";
    public static final String ICON_SERVER = "icon_server";
    public static final String KEY_EXTRAS = "extras";
    public static final String LAST_UPDATE = "last_update";
    public static final String LICENSE = "license";
    public static final String MACHINE_TAGS = "machine_tags";
    public static final String MEDIA = "media";
    public static final Set MIN_EXTRAS;
    public static final String ORIGINAL_FORMAT = "original_format";
    public static final String OWNER_NAME = "owner_name";
    public static final String O_DIMS = "o_dims";
    public static final String PATH_ALIAS = "path_alias";
    public static final String TAGS = "tags";
    public static final String URL_L = "url_l";
    public static final String URL_M = "url_m";
    public static final String URL_O = "url_o";
    public static final String URL_Q = "url_q";
    public static final String URL_S = "url_s";
    public static final String URL_SQ = "url_sq";
    public static final String URL_T = "url_t";
    public static final String VIEWS = "views";
    public static final long serialVersionUID = 12L;

    private Extras()
    {
    }

    static 
    {
        ALL_EXTRAS = new HashSet();
        MIN_EXTRAS = new HashSet();
        ALL_EXTRAS.add("date_taken");
        ALL_EXTRAS.add("date_upload");
        ALL_EXTRAS.add("icon_server");
        ALL_EXTRAS.add("last_update");
        ALL_EXTRAS.add("license");
        ALL_EXTRAS.add("original_format");
        ALL_EXTRAS.add("owner_name");
        ALL_EXTRAS.add("geo");
        ALL_EXTRAS.add("tags");
        ALL_EXTRAS.add("machine_tags");
        ALL_EXTRAS.add("o_dims");
        ALL_EXTRAS.add("media");
        ALL_EXTRAS.add("views");
        ALL_EXTRAS.add("path_alias");
        ALL_EXTRAS.add("url_s");
        ALL_EXTRAS.add("url_sq");
        ALL_EXTRAS.add("url_t");
        ALL_EXTRAS.add("url_m");
        ALL_EXTRAS.add("url_o");
        ALL_EXTRAS.add("url_l");
        ALL_EXTRAS.add("url_q");
        ALL_EXTRAS.add("description");
        MIN_EXTRAS.add("original_format");
        MIN_EXTRAS.add("owner_name");
    }
}

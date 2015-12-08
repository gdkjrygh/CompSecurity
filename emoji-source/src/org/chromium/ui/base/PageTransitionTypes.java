// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.base;


public class PageTransitionTypes
{

    public static final int PAGE_TRANSITION_AUTO_BOOKMARK = 2;
    public static final int PAGE_TRANSITION_AUTO_SUBFRAME = 3;
    public static final int PAGE_TRANSITION_AUTO_TOPLEVEL = 6;
    public static final int PAGE_TRANSITION_BLOCKED = 0x800000;
    public static final int PAGE_TRANSITION_CHAIN_END = 0x20000000;
    public static final int PAGE_TRANSITION_CHAIN_START = 0x10000000;
    public static final int PAGE_TRANSITION_CLIENT_REDIRECT = 0x40000000;
    public static final int PAGE_TRANSITION_CORE_MASK = 255;
    public static final int PAGE_TRANSITION_FORM_SUBMIT = 7;
    public static final int PAGE_TRANSITION_FORWARD_BACK = 0x1000000;
    public static final int PAGE_TRANSITION_FROM_ADDRESS_BAR = 0x2000000;
    public static final int PAGE_TRANSITION_FROM_API = 0x8000000;
    public static final int PAGE_TRANSITION_GENERATED = 5;
    public static final int PAGE_TRANSITION_HOME_PAGE = 0x4000000;
    public static final int PAGE_TRANSITION_IS_REDIRECT_MASK = 0xc0000000;
    public static final int PAGE_TRANSITION_KEYWORD = 9;
    public static final int PAGE_TRANSITION_KEYWORD_GENERATED = 10;
    public static final int PAGE_TRANSITION_LAST_CORE = 10;
    public static final int PAGE_TRANSITION_LINK = 0;
    public static final int PAGE_TRANSITION_MANUAL_SUBFRAME = 4;
    public static final int PAGE_TRANSITION_QUALIFIER_MASK = -256;
    public static final int PAGE_TRANSITION_RELOAD = 8;
    public static final int PAGE_TRANSITION_SERVER_REDIRECT = 0x80000000;
    public static final int PAGE_TRANSITION_TYPED = 1;

    public PageTransitionTypes()
    {
    }
}

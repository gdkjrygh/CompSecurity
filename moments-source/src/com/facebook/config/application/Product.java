// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.application;


public final class Product extends Enum
{

    private static final Product $VALUES[];
    public static final Product APPMANAGER;
    public static final Product FACEBOOK_SERVICES;
    public static final Product FB4A;
    public static final Product GAMESPORTAL;
    public static final Product GETAPPS;
    public static final Product GIFTS;
    public static final Product GROUPS;
    public static final Product HOME;
    public static final Product ME;
    public static final Product MESSENGER;
    public static final Product MOMENTS;
    public static final Product NATIVEMSITE;
    public static final Product PAA;
    public static final Product PETOPE;
    public static final Product PHONE;
    public static final Product SAMPLE;
    public static final Product UNKNOWN;

    private Product(String s, int i)
    {
        super(s, i);
    }

    public static Product valueOf(String s)
    {
        return (Product)Enum.valueOf(com/facebook/config/application/Product, s);
    }

    public static Product[] values()
    {
        return (Product[])$VALUES.clone();
    }

    static 
    {
        MESSENGER = new Product("MESSENGER", 0);
        FB4A = new Product("FB4A", 1);
        PAA = new Product("PAA", 2);
        SAMPLE = new Product("SAMPLE", 3);
        GIFTS = new Product("GIFTS", 4);
        NATIVEMSITE = new Product("NATIVEMSITE", 5);
        HOME = new Product("HOME", 6);
        GAMESPORTAL = new Product("GAMESPORTAL", 7);
        PHONE = new Product("PHONE", 8);
        PETOPE = new Product("PETOPE", 9);
        GROUPS = new Product("GROUPS", 10);
        ME = new Product("ME", 11);
        MOMENTS = new Product("MOMENTS", 12);
        APPMANAGER = new Product("APPMANAGER", 13);
        FACEBOOK_SERVICES = new Product("FACEBOOK_SERVICES", 14);
        GETAPPS = new Product("GETAPPS", 15);
        UNKNOWN = new Product("UNKNOWN", 16);
        $VALUES = (new Product[] {
            MESSENGER, FB4A, PAA, SAMPLE, GIFTS, NATIVEMSITE, HOME, GAMESPORTAL, PHONE, PETOPE, 
            GROUPS, ME, MOMENTS, APPMANAGER, FACEBOOK_SERVICES, GETAPPS, UNKNOWN
        });
    }
}

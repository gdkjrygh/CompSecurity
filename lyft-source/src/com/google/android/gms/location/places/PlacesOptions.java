// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;


public final class PlacesOptions
    implements com.google.android.gms.common.api.Api.ApiOptions.Optional
{

    public final String a;

    private PlacesOptions(Builder builder)
    {
        a = Builder.a(builder);
    }


    private class Builder
    {

        private String a;

        static String a(Builder builder)
        {
            return builder.a;
        }

        public PlacesOptions a()
        {
            return new PlacesOptions(this);
        }

        public Builder()
        {
        }
    }

}

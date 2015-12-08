// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.parse;

import com.dominos.android.sdk.core.models.FoodMenu;
import com.dominos.android.sdk.core.models.json.MenuDeserializer;
import com.google.b.k;
import com.google.b.r;

public class ModelsParse
{

    public ModelsParse()
    {
    }

    public static FoodMenu fromFoodMenu(String s)
    {
        return (FoodMenu)(new r()).a(com/dominos/android/sdk/core/models/FoodMenu, new MenuDeserializer()).f().a(s, com/dominos/android/sdk/core/models/FoodMenu);
    }
}

.class public final Lcom/actionbarsherlock/internal/ResourcesCompat;
.super Ljava/lang/Object;
.source "ResourcesCompat.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "ResourcesCompat"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getResources_getBoolean(Landroid/content/Context;I)Z
    .locals 9
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "id"    # I

    .prologue
    const/high16 v8, 0x43f00000    # 480.0f

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 33
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0xe

    if-lt v6, v7, :cond_1

    .line 34
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, p1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v4

    .line 64
    :cond_0
    :goto_0
    return v4

    .line 37
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 38
    .local v1, "metrics":Landroid/util/DisplayMetrics;
    iget v6, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v6, v6

    iget v7, v1, Landroid/util/DisplayMetrics;->density:F

    div-float v3, v6, v7

    .line 39
    .local v3, "widthDp":F
    iget v6, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v6, v6

    iget v7, v1, Landroid/util/DisplayMetrics;->density:F

    div-float v0, v6, v7

    .line 40
    .local v0, "heightDp":F
    cmpg-float v6, v3, v0

    if-gez v6, :cond_2

    move v2, v3

    .line 42
    .local v2, "smallestWidthDp":F
    :goto_1
    sget v6, Lcom/actionbarsherlock/R$bool;->abs__action_bar_embed_tabs:I

    if-ne p1, v6, :cond_3

    .line 43
    cmpl-float v6, v3, v8

    if-gez v6, :cond_0

    move v4, v5

    .line 46
    goto :goto_0

    .end local v2    # "smallestWidthDp":F
    :cond_2
    move v2, v0

    .line 40
    goto :goto_1

    .line 48
    .restart local v2    # "smallestWidthDp":F
    :cond_3
    sget v6, Lcom/actionbarsherlock/R$bool;->abs__split_action_bar_is_narrow:I

    if-ne p1, v6, :cond_4

    .line 49
    cmpl-float v6, v3, v8

    if-ltz v6, :cond_0

    move v4, v5

    .line 50
    goto :goto_0

    .line 54
    :cond_4
    sget v6, Lcom/actionbarsherlock/R$bool;->abs__action_bar_expanded_action_views_exclusive:I

    if-ne p1, v6, :cond_5

    .line 55
    const/high16 v6, 0x44160000    # 600.0f

    cmpl-float v6, v2, v6

    if-ltz v6, :cond_0

    move v4, v5

    .line 56
    goto :goto_0

    .line 60
    :cond_5
    sget v6, Lcom/actionbarsherlock/R$bool;->abs__config_allowActionMenuItemTextWithIcon:I

    if-ne p1, v6, :cond_6

    .line 61
    cmpl-float v6, v3, v8

    if-gez v6, :cond_0

    move v4, v5

    .line 64
    goto :goto_0

    .line 67
    :cond_6
    new-instance v4, Ljava/lang/IllegalArgumentException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Unknown boolean resource ID "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4
.end method

.method public static getResources_getInteger(Landroid/content/Context;I)I
    .locals 5
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "id"    # I

    .prologue
    .line 81
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xd

    if-lt v2, v3, :cond_0

    .line 82
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v2

    .line 98
    :goto_0
    return v2

    .line 85
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 86
    .local v0, "metrics":Landroid/util/DisplayMetrics;
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v2, v2

    iget v3, v0, Landroid/util/DisplayMetrics;->density:F

    div-float v1, v2, v3

    .line 88
    .local v1, "widthDp":F
    sget v2, Lcom/actionbarsherlock/R$integer;->abs__max_action_buttons:I

    if-ne p1, v2, :cond_4

    .line 89
    const/high16 v2, 0x44160000    # 600.0f

    cmpl-float v2, v1, v2

    if-ltz v2, :cond_1

    .line 90
    const/4 v2, 0x5

    goto :goto_0

    .line 92
    :cond_1
    const/high16 v2, 0x43fa0000    # 500.0f

    cmpl-float v2, v1, v2

    if-ltz v2, :cond_2

    .line 93
    const/4 v2, 0x4

    goto :goto_0

    .line 95
    :cond_2
    const/high16 v2, 0x43b40000    # 360.0f

    cmpl-float v2, v1, v2

    if-ltz v2, :cond_3

    .line 96
    const/4 v2, 0x3

    goto :goto_0

    .line 98
    :cond_3
    const/4 v2, 0x2

    goto :goto_0

    .line 101
    :cond_4
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unknown integer resource ID "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static loadLogoFromManifest(Landroid/app/Activity;)I
    .locals 15
    .param p0, "activity"    # Landroid/app/Activity;

    .prologue
    .line 113
    const/4 v8, 0x0

    .line 115
    .local v8, "logo":I
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    .line 118
    .local v11, "thisPackage":Ljava/lang/String;
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v13

    iget-object v10, v13, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 119
    .local v10, "packageName":Ljava/lang/String;
    const/4 v13, 0x0

    invoke-virtual {p0, v10, v13}, Landroid/app/Activity;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v13

    invoke-virtual {v13}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    .line 120
    .local v2, "am":Landroid/content/res/AssetManager;
    const-string v13, "AndroidManifest.xml"

    invoke-virtual {v2, v13}, Landroid/content/res/AssetManager;->openXmlResourceParser(Ljava/lang/String;)Landroid/content/res/XmlResourceParser;

    move-result-object v12

    .line 122
    .local v12, "xml":Landroid/content/res/XmlResourceParser;
    invoke-interface {v12}, Landroid/content/res/XmlResourceParser;->getEventType()I

    move-result v5

    .line 123
    .local v5, "eventType":I
    :goto_0
    const/4 v13, 0x1

    if-ne v5, v13, :cond_0

    .line 180
    .end local v2    # "am":Landroid/content/res/AssetManager;
    .end local v5    # "eventType":I
    .end local v10    # "packageName":Ljava/lang/String;
    .end local v11    # "thisPackage":Ljava/lang/String;
    .end local v12    # "xml":Landroid/content/res/XmlResourceParser;
    :goto_1
    return v8

    .line 124
    .restart local v2    # "am":Landroid/content/res/AssetManager;
    .restart local v5    # "eventType":I
    .restart local v10    # "packageName":Ljava/lang/String;
    .restart local v11    # "thisPackage":Ljava/lang/String;
    .restart local v12    # "xml":Landroid/content/res/XmlResourceParser;
    :cond_0
    const/4 v13, 0x2

    if-ne v5, v13, :cond_1

    .line 125
    invoke-interface {v12}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v9

    .line 127
    .local v9, "name":Ljava/lang/String;
    const-string v13, "application"

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    .line 131
    invoke-interface {v12}, Landroid/content/res/XmlResourceParser;->getAttributeCount()I

    move-result v13

    add-int/lit8 v6, v13, -0x1

    .local v6, "i":I
    :goto_2
    if-gez v6, :cond_2

    .line 174
    .end local v6    # "i":I
    .end local v9    # "name":Ljava/lang/String;
    :cond_1
    :goto_3
    invoke-interface {v12}, Landroid/content/res/XmlResourceParser;->nextToken()I

    move-result v5

    goto :goto_0

    .line 134
    .restart local v6    # "i":I
    .restart local v9    # "name":Ljava/lang/String;
    :cond_2
    const-string v13, "logo"

    invoke-interface {v12, v6}, Landroid/content/res/XmlResourceParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3

    .line 135
    const/4 v13, 0x0

    invoke-interface {v12, v6, v13}, Landroid/content/res/XmlResourceParser;->getAttributeResourceValue(II)I

    move-result v8

    .line 136
    goto :goto_3

    .line 131
    :cond_3
    add-int/lit8 v6, v6, -0x1

    goto :goto_2

    .line 139
    .end local v6    # "i":I
    :cond_4
    const-string v13, "activity"

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    .line 142
    const/4 v0, 0x0

    .line 143
    .local v0, "activityLogo":Ljava/lang/Integer;
    const/4 v1, 0x0

    .line 144
    .local v1, "activityPackage":Ljava/lang/String;
    const/4 v7, 0x0

    .line 146
    .local v7, "isOurActivity":Z
    invoke-interface {v12}, Landroid/content/res/XmlResourceParser;->getAttributeCount()I

    move-result v13

    add-int/lit8 v6, v13, -0x1

    .restart local v6    # "i":I
    :goto_4
    if-gez v6, :cond_6

    .line 167
    :cond_5
    if-eqz v7, :cond_1

    goto :goto_1

    .line 150
    :cond_6
    invoke-interface {v12, v6}, Landroid/content/res/XmlResourceParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v3

    .line 151
    .local v3, "attrName":Ljava/lang/String;
    const-string v13, "logo"

    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    .line 152
    const/4 v13, 0x0

    invoke-interface {v12, v6, v13}, Landroid/content/res/XmlResourceParser;->getAttributeResourceValue(II)I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 162
    :cond_7
    :goto_5
    if-eqz v0, :cond_8

    if-eqz v1, :cond_8

    .line 164
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 146
    :cond_8
    add-int/lit8 v6, v6, -0x1

    goto :goto_4

    .line 153
    :cond_9
    const-string v13, "name"

    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    .line 154
    invoke-interface {v12, v6}, Landroid/content/res/XmlResourceParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v10, v13}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->cleanActivityName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 155
    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v13

    if-eqz v13, :cond_5

    .line 158
    const/4 v7, 0x1

    goto :goto_5

    .line 176
    .end local v0    # "activityLogo":Ljava/lang/Integer;
    .end local v1    # "activityPackage":Ljava/lang/String;
    .end local v2    # "am":Landroid/content/res/AssetManager;
    .end local v3    # "attrName":Ljava/lang/String;
    .end local v5    # "eventType":I
    .end local v6    # "i":I
    .end local v7    # "isOurActivity":Z
    .end local v9    # "name":Ljava/lang/String;
    .end local v10    # "packageName":Ljava/lang/String;
    .end local v11    # "thisPackage":Ljava/lang/String;
    .end local v12    # "xml":Landroid/content/res/XmlResourceParser;
    :catch_0
    move-exception v4

    .line 177
    .local v4, "e":Ljava/lang/Exception;
    invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_1
.end method

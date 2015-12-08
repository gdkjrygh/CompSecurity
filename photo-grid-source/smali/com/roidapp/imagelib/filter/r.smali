.class public final Lcom/roidapp/imagelib/filter/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Context;
    .locals 3

    .prologue
    .line 1030
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 47
    sput-object v0, Lcom/roidapp/imagelib/filter/r;->a:Ljava/util/Map;

    .line 49
    const/4 v0, 0x0

    .line 50
    sget-object v1, Lcom/roidapp/imagelib/filter/r;->a:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 51
    sget-object v0, Lcom/roidapp/imagelib/filter/r;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 63
    :cond_0
    :goto_0
    return-object v0

    .line 55
    :cond_1
    const/4 v1, 0x2

    :try_start_0
    invoke-virtual {p0, p1, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 59
    :goto_1
    if-eqz v0, :cond_0

    .line 60
    sget-object v1, Lcom/roidapp/imagelib/filter/r;->a:Ljava/util/Map;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 57
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    goto :goto_1
.end method

.method public static a()V
    .locals 1

    .prologue
    .line 34
    sget-object v0, Lcom/roidapp/imagelib/filter/r;->a:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 35
    sget-object v0, Lcom/roidapp/imagelib/filter/r;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 36
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/imagelib/filter/r;->a:Ljava/util/Map;

    .line 38
    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;
    .locals 11

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 68
    :try_start_0
    invoke-static {p0, p1}, Lcom/roidapp/imagelib/filter/r;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Context;

    move-result-object v2

    .line 69
    if-nez v2, :cond_0

    move-object v0, v1

    .line 129
    :goto_0
    return-object v0

    .line 71
    :cond_0
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    const-string v3, "plugin"

    invoke-virtual {v2, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    .line 73
    new-instance v3, Lorg/json/JSONObject;

    const-string v4, "utf-8"

    invoke-static {v2, v4}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 75
    const-string v2, "infos"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 76
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    move-object v0, v1

    goto :goto_0

    .line 78
    :cond_2
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v2

    new-array v4, v2, [Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 79
    array-length v5, v4

    move v2, v0

    :goto_1
    if-ge v2, v5, :cond_4

    .line 80
    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    .line 81
    new-instance v6, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    invoke-direct {v6}, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;-><init>()V

    .line 83
    const-string v7, "type"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    iput v7, v6, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->b:I

    .line 84
    const-string v7, "id"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v7

    iput v7, v6, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a:I

    .line 85
    const-string v7, "icon"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->e:Ljava/lang/String;

    .line 87
    const-string v7, "name"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 88
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v8

    iget-object v8, v8, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v8}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v8

    .line 89
    const-string v9, "default"

    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->c:Ljava/lang/String;

    .line 90
    iput-object p1, v6, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->d:Ljava/lang/String;

    .line 92
    const-string v7, "extra"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 100
    invoke-virtual {v7}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v8

    .line 101
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 102
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 103
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 104
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 111
    invoke-virtual {v9, v0, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 127
    :catch_0
    move-exception v0

    :goto_3
    move-object v0, v1

    .line 129
    goto/16 :goto_0

    .line 114
    :cond_3
    iput-object v9, v6, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->f:Landroid/os/Bundle;

    .line 115
    aput-object v6, v4, v2

    .line 79
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 118
    :cond_4
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 119
    const/4 v2, 0x0

    new-instance v3, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    const/4 v6, 0x0

    sget v7, Lcom/roidapp/imagelib/f;->aH:I

    const-string v8, "Original"

    const/16 v9, 0x400

    invoke-direct {v3, v6, v7, v8, v9}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(IILjava/lang/String;I)V

    aput-object v3, v0, v2

    .line 121
    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v4, v2, v0, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v0

    goto :goto_3
.end method

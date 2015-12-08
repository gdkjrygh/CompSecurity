.class public final Lcom/roidapp/imagelib/filter/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/e/s;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lcom/roidapp/baselib/e/r;

.field private c:Lcom/roidapp/imagelib/filter/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/a;->a:Landroid/content/Context;

    .line 34
    return-void
.end method

.method private declared-synchronized b(Ljava/lang/String;)V
    .locals 10

    .prologue
    const/4 v0, 0x0

    .line 74
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/a;->a:Landroid/content/Context;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/a;->c:Lcom/roidapp/imagelib/filter/c;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    .line 111
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 75
    :cond_1
    :try_start_1
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 77
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 78
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move v1, v0

    .line 79
    :goto_1
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v1, v4, :cond_3

    .line 81
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 82
    const-string v5, "position"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    .line 83
    new-instance v6, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    const-string v7, "id"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v8

    invoke-direct {v6, v8, v9}, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;-><init>(J)V

    .line 85
    const-string v7, "name"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 86
    iget-object v8, p0, Lcom/roidapp/imagelib/filter/a;->a:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v8

    iget-object v8, v8, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v8}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v8

    .line 87
    const-string v9, "default"

    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->b:Ljava/lang/String;

    .line 89
    const-string v7, "bg"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    iput v7, v6, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->g:I

    .line 90
    const-string v7, "img_url"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->d:Ljava/lang/String;

    .line 91
    const-string v7, "package_name"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    .line 92
    const-string v7, "version"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v6, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->e:I

    .line 93
    iget v4, v6, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->e:I

    const/4 v7, 0x3

    if-gt v4, v7, :cond_2

    .line 96
    new-instance v4, Lcom/roidapp/imagelib/filter/b;

    invoke-direct {v4, p0}, Lcom/roidapp/imagelib/filter/b;-><init>(Lcom/roidapp/imagelib/filter/a;)V

    .line 97
    iput-object v6, v4, Lcom/roidapp/imagelib/filter/b;->a:Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    .line 98
    iput v5, v4, Lcom/roidapp/imagelib/filter/b;->b:I

    .line 99
    iput v0, v4, Lcom/roidapp/imagelib/filter/b;->c:I

    .line 100
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    add-int/lit8 v0, v0, 0x1

    .line 79
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 106
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/a;->c:Lcom/roidapp/imagelib/filter/c;

    invoke-interface {v0, v3}, Lcom/roidapp/imagelib/filter/c;->a(Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    .line 109
    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    .line 74
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;
    .locals 7

    .prologue
    .line 114
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "filterGroupJsonKey"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 115
    if-nez v0, :cond_0

    .line 116
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    .line 118
    :try_start_0
    const-string v2, "info"

    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    .line 119
    const-string v2, "utf-8"

    invoke-static {v1, v2}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 124
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 126
    :try_start_1
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 127
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 128
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 129
    const-string v4, "position"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 130
    const-string v4, "package_name"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 131
    invoke-virtual {v4, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 132
    new-instance v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    const-string v2, "id"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-direct {v0, v4, v5}, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;-><init>(J)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_2

    .line 134
    :try_start_2
    const-string v1, "name"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 135
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/a;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget-object v2, v2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    .line 136
    const-string v4, "default"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->b:Ljava/lang/String;

    .line 138
    const-string v1, "bg"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->g:I

    .line 139
    const-string v1, "img_url"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->d:Ljava/lang/String;

    .line 140
    const-string v1, "package_name"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    .line 141
    const-string v1, "version"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->e:I
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_3

    .line 153
    :goto_2
    return-object v0

    .line 121
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 127
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move-object v0, v1

    .line 152
    goto :goto_2

    .line 148
    :catch_1
    move-exception v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    :goto_3
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_2

    .line 151
    :catch_2
    move-exception v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    :goto_4
    invoke-virtual {v1}, Ljava/lang/NullPointerException;->printStackTrace()V

    goto :goto_2

    :catch_3
    move-exception v1

    goto :goto_4

    .line 148
    :catch_4
    move-exception v1

    goto :goto_3
.end method

.method public final a()V
    .locals 3

    .prologue
    .line 51
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/a;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 70
    :goto_0
    return-void

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/a;->b:Lcom/roidapp/baselib/e/r;

    if-eqz v0, :cond_1

    .line 53
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/a;->b:Lcom/roidapp/baselib/e/r;

    invoke-virtual {v0}, Lcom/roidapp/baselib/e/r;->f()V

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/a;->b:Lcom/roidapp/baselib/e/r;

    .line 57
    :cond_1
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "filterGroupJsonKey"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 58
    if-nez v1, :cond_3

    .line 59
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    .line 61
    :try_start_0
    const-string v2, "info"

    invoke-virtual {v0, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    .line 62
    const-string v2, "utf-8"

    invoke-static {v0, v2}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 67
    :goto_1
    if-eqz v0, :cond_2

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/filter/a;->b(Ljava/lang/String;)V

    .line 68
    :cond_2
    new-instance v0, Lcom/roidapp/baselib/e/r;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/imagelib/ImageLibrary;->h()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/roidapp/baselib/e/r;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/s;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/a;->b:Lcom/roidapp/baselib/e/r;

    .line 69
    invoke-static {}, Lcom/roidapp/baselib/c/t;->a()Ljava/util/concurrent/AbstractExecutorService;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/a;->b:Lcom/roidapp/baselib/e/r;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 64
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    :cond_3
    move-object v0, v1

    goto :goto_1
.end method

.method public final a(ILjava/lang/Exception;)V
    .locals 0

    .prologue
    .line 48
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/filter/c;)V
    .locals 0

    .prologue
    .line 158
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/a;->c:Lcom/roidapp/imagelib/filter/c;

    .line 159
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 26
    check-cast p1, Ljava/lang/String;

    .line 1039
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/a;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 1041
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "filterGroupJsonKey"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-string v1, "UTF-8"

    invoke-static {p1, v0, v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Z

    .line 1043
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/filter/a;->b(Ljava/lang/String;)V

    .line 26
    :cond_0
    return-void
.end method

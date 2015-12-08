.class public Lcom/roidapp/photogrid/release/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/e/s;


# static fields
.field public static final a:Ljava/lang/String;


# instance fields
.field private b:Lcom/roidapp/baselib/e/r;

.field private c:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Jamin + "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v1, Lcom/roidapp/photogrid/release/a/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/photogrid/release/a/a;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/StickerInfo;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 62
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 85
    :cond_0
    :goto_0
    return-object v0

    .line 65
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 69
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 70
    const-string v3, "data"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 71
    if-eqz v3, :cond_0

    .line 72
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v2, v4, :cond_3

    .line 73
    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 74
    if-eqz v4, :cond_2

    .line 75
    new-instance v5, Lcom/roidapp/photogrid/release/StickerInfo;

    invoke-direct {v5, v4}, Lcom/roidapp/photogrid/release/StickerInfo;-><init>(Lorg/json/JSONObject;)V

    .line 76
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    move-object v0, v1

    .line 79
    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public final a(ILjava/lang/Exception;)V
    .locals 0

    .prologue
    .line 92
    return-void
.end method

.method public final a(Ljava/io/File;)V
    .locals 2

    .prologue
    .line 38
    iput-object p1, p0, Lcom/roidapp/photogrid/release/a/a;->c:Ljava/io/File;

    .line 39
    new-instance v0, Lcom/roidapp/baselib/e/r;

    sget-object v1, Lcom/roidapp/cloudlib/al;->f:Ljava/lang/String;

    invoke-direct {v0, v1, p0}, Lcom/roidapp/baselib/e/r;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/s;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/a/a;->b:Lcom/roidapp/baselib/e/r;

    .line 40
    invoke-static {}, Lcom/roidapp/baselib/c/t;->a()Ljava/util/concurrent/AbstractExecutorService;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/a/a;->b:Lcom/roidapp/baselib/e/r;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 41
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 29
    check-cast p1, Ljava/lang/String;

    .line 1046
    iget-object v0, p0, Lcom/roidapp/photogrid/release/a/a;->c:Ljava/io/File;

    if-eqz v0, :cond_0

    .line 1051
    invoke-static {p1}, Lcom/roidapp/photogrid/release/a/a;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 1052
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "stickerInfoList.toJson ------------- "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/google/a/k;

    invoke-direct {v2}, Lcom/google/a/k;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/a/k;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1053
    new-instance v1, Lcom/google/a/k;

    invoke-direct {v1}, Lcom/google/a/k;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/a/k;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/a/a;->c:Ljava/io/File;

    const-string v2, "UTF-8"

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Z

    .line 1055
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 1056
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v2

    invoke-static {v2}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "sticker_check_cycle"

    invoke-interface {v2, v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 29
    :cond_0
    return-void
.end method

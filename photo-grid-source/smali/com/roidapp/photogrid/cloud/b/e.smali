.class public final Lcom/roidapp/photogrid/cloud/b/e;
.super Ljava/util/Observable;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/e/s;


# static fields
.field private static a:Z


# instance fields
.field private final b:Ljava/io/File;

.field private final c:Lcom/roidapp/baselib/e/r;


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/util/Observable;-><init>()V

    .line 35
    new-instance v0, Lcom/roidapp/baselib/e/r;

    sget-object v1, Lcom/roidapp/cloudlib/al;->e:Ljava/lang/String;

    invoke-direct {v0, v1, p0}, Lcom/roidapp/baselib/e/r;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/s;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/b/e;->c:Lcom/roidapp/baselib/e/r;

    .line 39
    const-string v0, "cloud_push"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/b/e;->b:Ljava/io/File;

    .line 40
    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/cloud/b/d;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 65
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 126
    :cond_0
    :goto_0
    return-object v0

    .line 70
    :cond_1
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 71
    const-string v2, "version"

    const v4, 0x7fffffff

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    .line 72
    if-gt v2, v5, :cond_0

    .line 76
    const-string v2, "data"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 77
    if-eqz v5, :cond_0

    .line 78
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move v4, v3

    .line 79
    :goto_1
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v4, v2, :cond_6

    .line 80
    invoke-virtual {v5, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 81
    if-eqz v6, :cond_5

    .line 82
    new-instance v7, Lcom/roidapp/photogrid/cloud/b/d;

    invoke-direct {v7}, Lcom/roidapp/photogrid/cloud/b/d;-><init>()V

    .line 83
    const-string v2, "id"

    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    iput v2, v7, Lcom/roidapp/photogrid/cloud/b/d;->a:I

    .line 84
    const-string v2, "stime"

    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v8

    iput-wide v8, v7, Lcom/roidapp/photogrid/cloud/b/d;->c:J

    .line 85
    const-string v2, "etime"

    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v8

    iput-wide v8, v7, Lcom/roidapp/photogrid/cloud/b/d;->d:J

    .line 86
    const-string v2, "title"

    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v7, Lcom/roidapp/photogrid/cloud/b/d;->e:Ljava/lang/String;

    .line 87
    const-string v2, "action"

    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v7, Lcom/roidapp/photogrid/cloud/b/d;->f:Ljava/lang/String;

    .line 88
    const-string v2, "url"

    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v7, Lcom/roidapp/photogrid/cloud/b/d;->g:Ljava/lang/String;

    .line 89
    const-string v2, "mode"

    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    iput v2, v7, Lcom/roidapp/photogrid/cloud/b/d;->i:I

    .line 90
    const-string v2, "resource"

    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v7, Lcom/roidapp/photogrid/cloud/b/d;->h:Ljava/lang/String;

    .line 92
    const-string v2, "blackcountry"

    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    .line 93
    if-eqz v8, :cond_2

    .line 94
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, v7, Lcom/roidapp/photogrid/cloud/b/d;->j:Ljava/util/Set;

    move v2, v3

    .line 95
    :goto_2
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-ge v2, v9, :cond_2

    .line 96
    iget-object v9, v7, Lcom/roidapp/photogrid/cloud/b/d;->j:Ljava/util/Set;

    invoke-virtual {v8, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 95
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 100
    :cond_2
    const-string v2, "whitecountry"

    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    .line 101
    if-eqz v8, :cond_3

    .line 102
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, v7, Lcom/roidapp/photogrid/cloud/b/d;->k:Ljava/util/Set;

    move v2, v3

    .line 103
    :goto_3
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-ge v2, v9, :cond_3

    .line 104
    iget-object v9, v7, Lcom/roidapp/photogrid/cloud/b/d;->k:Ljava/util/Set;

    invoke-virtual {v8, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 103
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 108
    :cond_3
    const-string v2, "code"

    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 109
    if-eqz v6, :cond_4

    .line 110
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v7, Lcom/roidapp/photogrid/cloud/b/d;->b:Ljava/util/List;

    move v2, v3

    .line 111
    :goto_4
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v8

    if-ge v2, v8, :cond_4

    .line 112
    invoke-virtual {v6, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "#"

    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 113
    const/4 v9, 0x0

    aget-object v9, v8, v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 114
    const/4 v10, 0x1

    aget-object v8, v8, v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 115
    new-instance v10, Lcom/roidapp/baselib/c/x;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v10, v9, v8}, Lcom/roidapp/baselib/c/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    iget-object v8, v7, Lcom/roidapp/photogrid/cloud/b/d;->b:Ljava/util/List;

    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 119
    :cond_4
    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    :cond_5
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    goto/16 :goto_1

    :cond_6
    move-object v0, v1

    .line 122
    goto/16 :goto_0

    :catch_0
    move-exception v1

    goto/16 :goto_0
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/cloud/b/d;",
            ">;"
        }
    .end annotation

    .prologue
    .line 43
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/e;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/e;->b:Ljava/io/File;

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/b/e;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 46
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(ILjava/lang/Exception;)V
    .locals 0

    .prologue
    .line 141
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 27
    check-cast p1, Ljava/lang/String;

    .line 1131
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/b/e;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 1132
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1133
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/b/e;->b:Ljava/io/File;

    const-string v2, "UTF-8"

    invoke-static {p1, v1, v2}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Z

    .line 1134
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/b/e;->setChanged()V

    .line 1135
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/b/e;->notifyObservers(Ljava/lang/Object;)V

    .line 27
    :cond_0
    return-void
.end method

.method public final a(Ljava/util/Observer;)V
    .locals 2

    .prologue
    .line 50
    sget-boolean v0, Lcom/roidapp/photogrid/cloud/b/e;->a:Z

    if-eqz v0, :cond_0

    .line 58
    :goto_0
    return-void

    .line 53
    :cond_0
    if-eqz p1, :cond_1

    .line 54
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/cloud/b/e;->addObserver(Ljava/util/Observer;)V

    .line 56
    :cond_1
    const/4 v0, 0x1

    sput-boolean v0, Lcom/roidapp/photogrid/cloud/b/e;->a:Z

    .line 57
    invoke-static {}, Lcom/roidapp/baselib/c/t;->a()Ljava/util/concurrent/AbstractExecutorService;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/b/e;->c:Lcom/roidapp/baselib/e/r;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

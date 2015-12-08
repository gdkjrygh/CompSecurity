.class public final Lcom/roidapp/cloudlib/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/e/s;


# static fields
.field private static a:Lcom/roidapp/cloudlib/a/a;

.field private static volatile b:Z


# instance fields
.field private c:Ljava/io/File;

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/roidapp/baselib/e/r;

.field private f:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lcom/roidapp/cloudlib/a/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const-string v0, "cloud_params"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/a/a;->c:Ljava/io/File;

    .line 54
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/a/a;->f:Ljava/util/Queue;

    .line 1347
    iget-object v0, p0, Lcom/roidapp/cloudlib/a/a;->c:Ljava/io/File;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/a/a;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 55
    :goto_0
    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;)Z

    .line 56
    return-void

    .line 1347
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/a/a;->c:Ljava/io/File;

    const-string v1, "utf-8"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;
    .locals 2

    .prologue
    .line 37
    const-class v1, Lcom/roidapp/cloudlib/a/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/roidapp/cloudlib/a/a;->a:Lcom/roidapp/cloudlib/a/a;

    if-nez v0, :cond_0

    .line 38
    new-instance v0, Lcom/roidapp/cloudlib/a/a;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/a/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/roidapp/cloudlib/a/a;->a:Lcom/roidapp/cloudlib/a/a;

    .line 39
    :cond_0
    sget-object v0, Lcom/roidapp/cloudlib/a/a;->a:Lcom/roidapp/cloudlib/a/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 37
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 306
    if-nez p1, :cond_0

    move v0, v2

    .line 342
    :goto_0
    return v0

    .line 308
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 311
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 313
    invoke-virtual {v4}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v5

    .line 314
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 315
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 316
    if-eqz v0, :cond_1

    .line 317
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 318
    invoke-virtual {v6}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v7

    .line 319
    :cond_2
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 320
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 321
    if-eqz v1, :cond_2

    .line 322
    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 323
    if-eqz v8, :cond_2

    .line 324
    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/a/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 325
    invoke-interface {v3, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 333
    :catch_0
    move-exception v0

    .line 334
    const/4 v1, 0x0

    .line 335
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    move-object v0, v1

    .line 338
    :goto_2
    if-eqz v0, :cond_4

    .line 339
    iput-object v0, p0, Lcom/roidapp/cloudlib/a/a;->d:Ljava/util/Map;

    .line 340
    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    move-object v0, v3

    .line 336
    goto :goto_2

    :cond_4
    move v0, v2

    .line 342
    goto :goto_0
.end method

.method private static f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 358
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .prologue
    .line 118
    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 119
    if-eqz v0, :cond_0

    .line 121
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result p3

    .line 127
    :cond_0
    :goto_0
    return p3

    .line 124
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/NumberFormatException;->printStackTrace()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 90
    const/4 v0, 0x0

    .line 91
    iget-object v1, p0, Lcom/roidapp/cloudlib/a/a;->d:Ljava/util/Map;

    .line 92
    if-eqz v1, :cond_0

    .line 93
    invoke-static {p1, p2}, Lcom/roidapp/cloudlib/a/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 95
    :cond_0
    return-object v0
.end method

.method public final a(ILjava/lang/Exception;)V
    .locals 1

    .prologue
    .line 300
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/a/a;->e:Lcom/roidapp/baselib/e/r;

    .line 302
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/cloudlib/a/a;->b:Z

    .line 303
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/a/b;)V
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/roidapp/cloudlib/a/a;->f:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/roidapp/cloudlib/a/a;->f:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 78
    :cond_0
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 32
    check-cast p1, Ljava/lang/String;

    .line 2289
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/a/a;->e:Lcom/roidapp/baselib/e/r;

    .line 2290
    if-eqz p1, :cond_0

    .line 2291
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2292
    iget-object v0, p0, Lcom/roidapp/cloudlib/a/a;->c:Ljava/io/File;

    const-string v1, "UTF-8"

    invoke-static {p1, v0, v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Z

    .line 2351
    iget-object v0, p0, Lcom/roidapp/cloudlib/a/a;->f:Ljava/util/Queue;

    if-eqz v0, :cond_0

    .line 2352
    iget-object v0, p0, Lcom/roidapp/cloudlib/a/a;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/a/b;

    .line 2353
    invoke-interface {v0}, Lcom/roidapp/cloudlib/a/b;->c()V

    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 64
    sget-boolean v1, Lcom/roidapp/cloudlib/a/a;->b:Z

    if-eqz v1, :cond_0

    .line 65
    const/4 v0, 0x0

    .line 72
    :goto_0
    return v0

    .line 66
    :cond_0
    sput-boolean v0, Lcom/roidapp/cloudlib/a/a;->b:Z

    .line 67
    iget-object v1, p0, Lcom/roidapp/cloudlib/a/a;->e:Lcom/roidapp/baselib/e/r;

    if-eqz v1, :cond_1

    .line 68
    iget-object v1, p0, Lcom/roidapp/cloudlib/a/a;->e:Lcom/roidapp/baselib/e/r;

    invoke-virtual {v1}, Lcom/roidapp/baselib/e/r;->f()V

    .line 69
    :cond_1
    new-instance v1, Lcom/roidapp/baselib/e/r;

    sget-object v2, Lcom/roidapp/cloudlib/al;->a:Ljava/lang/String;

    invoke-direct {v1, v2, p0}, Lcom/roidapp/baselib/e/r;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/s;)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/a/a;->e:Lcom/roidapp/baselib/e/r;

    .line 71
    invoke-static {}, Lcom/roidapp/baselib/c/t;->a()Ljava/util/concurrent/AbstractExecutorService;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/a/a;->e:Lcom/roidapp/baselib/e/r;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/AbstractExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 2

    .prologue
    .line 106
    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 107
    if-nez v0, :cond_0

    :goto_0
    return p3

    :cond_0
    const-string v1, "1"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    goto :goto_0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)F
    .locals 1

    .prologue
    .line 138
    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 139
    if-eqz v0, :cond_0

    .line 141
    :try_start_0
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 147
    :goto_0
    return v0

    .line 144
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/NumberFormatException;->printStackTrace()V

    .line 147
    :cond_0
    const/high16 v0, 0x3f000000    # 0.5f

    goto :goto_0
.end method

.method public final b(Lcom/roidapp/cloudlib/a/b;)Z
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/roidapp/cloudlib/a/a;->f:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 182
    const/4 v1, 0x0

    .line 183
    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 184
    if-eqz v0, :cond_1

    .line 186
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 187
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    .line 188
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v3, :cond_0

    .line 190
    :try_start_1
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 189
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 194
    :catch_0
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    :goto_1
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    .line 197
    :cond_0
    :goto_2
    return-object v0

    .line 194
    :catch_1
    move-exception v1

    goto :goto_1

    :cond_1
    move-object v0, v1

    goto :goto_2
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)[I
    .locals 4

    .prologue
    .line 207
    const/4 v0, 0x0

    .line 208
    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 209
    if-eqz v1, :cond_0

    .line 211
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 212
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v1

    new-array v0, v1, [I

    .line 213
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 214
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->optInt(I)I

    move-result v3

    aput v3, v0, v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 218
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    .line 221
    :cond_0
    return-object v0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Queue;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Queue",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 233
    const/4 v1, 0x0

    .line 234
    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 235
    if-eqz v0, :cond_2

    .line 237
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 238
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    .line 239
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 240
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v3, :cond_1

    .line 241
    :try_start_1
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v4

    .line 242
    if-eqz v4, :cond_0

    .line 245
    :try_start_2
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    move-result v4

    .line 250
    :try_start_3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    .line 240
    :cond_0
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 255
    :catch_0
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    :goto_2
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    .line 258
    :cond_1
    :goto_3
    return-object v0

    .line 248
    :catch_1
    move-exception v4

    goto :goto_1

    .line 255
    :catch_2
    move-exception v1

    goto :goto_2

    :cond_2
    move-object v0, v1

    goto :goto_3
.end method

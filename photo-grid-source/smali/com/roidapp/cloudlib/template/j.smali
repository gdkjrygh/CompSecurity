.class public final Lcom/roidapp/cloudlib/template/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/cloudlib/template/b;

.field private static b:Lcom/roidapp/cloudlib/template/a;

.field private static c:Ljava/util/concurrent/ExecutorService;

.field private static d:Z

.field private static final e:[J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x3

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    sput-object v0, Lcom/roidapp/cloudlib/template/j;->e:[J

    return-void

    nop

    :array_0
    .array-data 8
        0x77fda406
        0x77fda407
        0x77fda40a
    .end array-data
.end method

.method public static a(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 207
    :try_start_0
    new-instance v0, Lcom/google/a/ac;

    invoke-direct {v0}, Lcom/google/a/ac;-><init>()V

    .line 2045
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/a/ac;->a(Ljava/io/Reader;)Lcom/google/a/x;

    move-result-object v0

    .line 207
    invoke-virtual {v0}, Lcom/google/a/x;->i()Lcom/google/a/aa;

    move-result-object v0

    .line 208
    const-string v1, "data_version"

    invoke-virtual {v0, v1}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 209
    const-string v1, "data_version"

    invoke-virtual {v0, v1}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/a/x;->g()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 214
    :goto_0
    return v0

    .line 212
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 214
    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public static a()Lcom/roidapp/cloudlib/template/b;
    .locals 1

    .prologue
    .line 60
    sget-object v0, Lcom/roidapp/cloudlib/template/j;->a:Lcom/roidapp/cloudlib/template/b;

    if-nez v0, :cond_0

    .line 61
    new-instance v0, Lcom/roidapp/cloudlib/template/b;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/b;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/template/j;->a:Lcom/roidapp/cloudlib/template/b;

    .line 63
    :cond_0
    sget-object v0, Lcom/roidapp/cloudlib/template/j;->a:Lcom/roidapp/cloudlib/template/b;

    return-object v0
.end method

.method public static a(Ljava/lang/String;Z)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 260
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 304
    :goto_0
    return-object v0

    .line 264
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 266
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 267
    const-string v3, "data"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 268
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v2, v4, :cond_3

    .line 269
    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 270
    const-string v5, "version"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v6

    double-to-float v5, v6

    .line 271
    const-string v6, "needFilter"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v6

    .line 272
    const-string v7, "toCameraPreview"

    const/4 v8, 0x1

    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v7

    .line 273
    const/high16 v8, 0x40800000    # 4.0f

    cmpl-float v8, v5, v8

    if-gtz v8, :cond_2

    .line 276
    if-eqz v7, :cond_1

    if-eqz v6, :cond_1

    if-nez p1, :cond_2

    .line 279
    :cond_1
    if-nez v6, :cond_2

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v8

    invoke-virtual {v8}, Lcom/roidapp/cloudlib/al;->f()Z

    move-result v8

    if-eqz v8, :cond_2

    .line 283
    new-instance v8, Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-direct {v8}, Lcom/roidapp/cloudlib/template/TemplateInfo;-><init>()V

    .line 284
    invoke-virtual {v8, v5}, Lcom/roidapp/cloudlib/template/TemplateInfo;->a(F)V

    .line 285
    invoke-virtual {v8, v6}, Lcom/roidapp/cloudlib/template/TemplateInfo;->b(Z)V

    .line 286
    const-string v5, "id"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v10

    invoke-virtual {v8, v10, v11}, Lcom/roidapp/cloudlib/template/TemplateInfo;->a(J)V

    .line 287
    const-string v5, "download"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    int-to-long v10, v5

    invoke-virtual {v8, v10, v11}, Lcom/roidapp/cloudlib/template/TemplateInfo;->b(J)V

    .line 288
    const-string v5, "count"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v8, v5}, Lcom/roidapp/cloudlib/template/TemplateInfo;->b(I)V

    .line 289
    const-string v5, "width"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v8, v5}, Lcom/roidapp/cloudlib/template/TemplateInfo;->c(I)V

    .line 290
    const-string v5, "height"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v8, v5}, Lcom/roidapp/cloudlib/template/TemplateInfo;->d(I)V

    .line 291
    const-string v5, "url"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Lcom/roidapp/cloudlib/template/TemplateInfo;->b(Ljava/lang/String;)V

    .line 292
    const-string v5, "supportLayout"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v5

    invoke-virtual {v8, v5}, Lcom/roidapp/cloudlib/template/TemplateInfo;->a(Z)V

    .line 293
    invoke-virtual {v8, v7}, Lcom/roidapp/cloudlib/template/TemplateInfo;->c(Z)V

    .line 294
    const-string v5, "templateName"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Lcom/roidapp/cloudlib/template/TemplateInfo;->c(Ljava/lang/String;)V

    .line 295
    const-string v5, "downloadUrl"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Lcom/roidapp/cloudlib/template/TemplateInfo;->a(Ljava/lang/String;)V

    .line 296
    const-string v5, "needWeather"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v5

    invoke-virtual {v8, v5}, Lcom/roidapp/cloudlib/template/TemplateInfo;->d(Z)V

    .line 297
    const-string v5, "needLock"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v4

    invoke-virtual {v8, v4}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e(Z)V

    .line 298
    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 268
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    :cond_3
    move-object v0, v1

    .line 300
    goto/16 :goto_0

    .line 302
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_0
.end method

.method public static a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 1

    .prologue
    .line 85
    sget-object v0, Lcom/roidapp/cloudlib/template/j;->b:Lcom/roidapp/cloudlib/template/a;

    if-eqz v0, :cond_0

    .line 86
    invoke-static {p0}, Lcom/roidapp/cloudlib/template/a;->a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    .line 87
    sget-object v0, Lcom/roidapp/cloudlib/template/j;->b:Lcom/roidapp/cloudlib/template/a;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/template/a;->d(Lcom/roidapp/cloudlib/template/TemplateInfo;)Z

    move-result v0

    sput-boolean v0, Lcom/roidapp/cloudlib/template/j;->d:Z

    .line 92
    :goto_0
    return-void

    .line 90
    :cond_0
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/cloudlib/template/j;->d:Z

    goto :goto_0
.end method

.method public static a(Ljava/lang/ref/WeakReference;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 160
    invoke-static {}, Lcom/roidapp/cloudlib/template/a;->d()Lcom/roidapp/cloudlib/template/TemplateInfo;

    move-result-object v0

    .line 161
    if-eqz v0, :cond_0

    .line 162
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    .line 163
    invoke-static {v1}, Lcom/roidapp/cloudlib/template/j;->a(Z)V

    .line 164
    sput-boolean v1, Lcom/roidapp/cloudlib/template/j;->d:Z

    .line 166
    :cond_0
    return-void
.end method

.method public static a(Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/util/Map",
            "<**>;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 314
    sget-object v0, Lcom/roidapp/cloudlib/template/j;->c:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 315
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/template/j;->c:Ljava/util/concurrent/ExecutorService;

    .line 317
    :cond_0
    sget-object v0, Lcom/roidapp/cloudlib/template/j;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/roidapp/cloudlib/template/k;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/cloudlib/template/k;-><init>(Ljava/util/ArrayList;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 348
    return-void
.end method

.method private static a(Z)V
    .locals 2

    .prologue
    .line 355
    sget-object v0, Lcom/roidapp/cloudlib/template/j;->c:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 356
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/template/j;->c:Ljava/util/concurrent/ExecutorService;

    .line 358
    :cond_0
    sget-object v0, Lcom/roidapp/cloudlib/template/j;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/roidapp/cloudlib/template/l;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/template/l;-><init>(Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 401
    return-void
.end method

.method public static a(J)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 223
    sget-object v2, Lcom/roidapp/cloudlib/template/j;->e:[J

    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-wide v4, v2, v1

    .line 224
    cmp-long v4, v4, p0

    if-nez v4, :cond_1

    .line 225
    const/4 v0, 0x1

    .line 228
    :cond_0
    return v0

    .line 223
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public static b()Lcom/roidapp/cloudlib/template/a;
    .locals 1

    .prologue
    .line 68
    sget-object v0, Lcom/roidapp/cloudlib/template/j;->b:Lcom/roidapp/cloudlib/template/a;

    if-nez v0, :cond_0

    .line 69
    new-instance v0, Lcom/roidapp/cloudlib/template/a;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/a;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/template/j;->b:Lcom/roidapp/cloudlib/template/a;

    .line 71
    :cond_0
    sget-object v0, Lcom/roidapp/cloudlib/template/j;->b:Lcom/roidapp/cloudlib/template/a;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 244
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/roidapp/cloudlib/template/j;->a(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static b(J)Z
    .locals 4

    .prologue
    .line 404
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    .line 405
    const-string v1, "TemplateUtils"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static c()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1045
    sget-object v0, Lcom/roidapp/cloudlib/template/j;->a:Lcom/roidapp/cloudlib/template/b;

    if-eqz v0, :cond_0

    .line 1046
    sget-object v0, Lcom/roidapp/cloudlib/template/j;->a:Lcom/roidapp/cloudlib/template/b;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b;->b()V

    .line 1047
    sput-object v1, Lcom/roidapp/cloudlib/template/j;->a:Lcom/roidapp/cloudlib/template/b;

    .line 1053
    :cond_0
    sget-object v0, Lcom/roidapp/cloudlib/template/j;->b:Lcom/roidapp/cloudlib/template/a;

    if-eqz v0, :cond_1

    .line 1054
    sget-object v0, Lcom/roidapp/cloudlib/template/j;->b:Lcom/roidapp/cloudlib/template/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/a;->g()V

    .line 1055
    sput-object v1, Lcom/roidapp/cloudlib/template/j;->b:Lcom/roidapp/cloudlib/template/a;

    .line 78
    :cond_1
    return-void
.end method

.method public static c(J)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 409
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    .line 410
    const-string v1, "TemplateUtils"

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 411
    return-void
.end method

.method public static d()V
    .locals 1

    .prologue
    .line 95
    sget-object v0, Lcom/roidapp/cloudlib/template/j;->b:Lcom/roidapp/cloudlib/template/a;

    if-eqz v0, :cond_0

    .line 96
    invoke-static {}, Lcom/roidapp/cloudlib/template/a;->a()V

    .line 98
    :cond_0
    return-void
.end method

.method public static e()Z
    .locals 1

    .prologue
    .line 105
    sget-boolean v0, Lcom/roidapp/cloudlib/template/j;->d:Z

    return v0
.end method

.method public static f()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 112
    invoke-static {}, Lcom/roidapp/cloudlib/template/a;->d()Lcom/roidapp/cloudlib/template/TemplateInfo;

    move-result-object v1

    .line 113
    if-eqz v1, :cond_0

    .line 114
    invoke-virtual {v1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->n()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 117
    :cond_0
    return v0
.end method

.method public static g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 125
    invoke-static {}, Lcom/roidapp/cloudlib/template/a;->d()Lcom/roidapp/cloudlib/template/TemplateInfo;

    move-result-object v0

    .line 126
    if-eqz v0, :cond_0

    .line 127
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->i()Ljava/lang/String;

    move-result-object v0

    .line 130
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static h()J
    .locals 2

    .prologue
    .line 138
    invoke-static {}, Lcom/roidapp/cloudlib/template/a;->d()Lcom/roidapp/cloudlib/template/TemplateInfo;

    move-result-object v0

    .line 139
    if-eqz v0, :cond_0

    .line 140
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v0

    .line 143
    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method public static i()Z
    .locals 1

    .prologue
    .line 152
    invoke-static {}, Lcom/roidapp/cloudlib/template/a;->d()Lcom/roidapp/cloudlib/template/TemplateInfo;

    move-result-object v0

    .line 153
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static j()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 172
    invoke-static {v0}, Lcom/roidapp/cloudlib/template/j;->a(Z)V

    .line 173
    sput-boolean v0, Lcom/roidapp/cloudlib/template/j;->d:Z

    .line 174
    return-void
.end method

.method public static k()I
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 182
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/baselib/d/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/.Template/info"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 183
    invoke-static {v1, v0}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 187
    const/4 v3, 0x0

    .line 189
    :try_start_0
    new-instance v2, Ljava/io/FileReader;

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v4}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    :try_start_1
    new-instance v1, Lcom/google/a/ac;

    invoke-direct {v1}, Lcom/google/a/ac;-><init>()V

    invoke-static {v2}, Lcom/google/a/ac;->a(Ljava/io/Reader;)Lcom/google/a/x;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/a/x;->i()Lcom/google/a/aa;

    move-result-object v1

    .line 191
    const-string v3, "data_version"

    invoke-virtual {v1, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/a/x;->g()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    .line 198
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 202
    :cond_0
    :goto_0
    return v0

    .line 193
    :catch_0
    move-exception v1

    move-object v2, v3

    :goto_1
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 197
    if-eqz v2, :cond_0

    .line 198
    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    .line 200
    :catch_1
    move-exception v1

    goto :goto_0

    .line 196
    :catchall_0
    move-exception v0

    move-object v2, v3

    .line 197
    :goto_2
    if-eqz v2, :cond_1

    .line 198
    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 199
    :cond_1
    :goto_3
    throw v0

    :catch_2
    move-exception v1

    goto :goto_0

    :catch_3
    move-exception v1

    goto :goto_3

    .line 196
    :catchall_1
    move-exception v0

    goto :goto_2

    .line 193
    :catch_4
    move-exception v1

    goto :goto_1
.end method

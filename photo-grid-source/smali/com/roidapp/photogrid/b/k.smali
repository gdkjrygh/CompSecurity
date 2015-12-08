.class public final Lcom/roidapp/photogrid/b/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/roidapp/photogrid/b/k;


# instance fields
.field private a:Landroid/content/SharedPreferences;


# direct methods
.method private constructor <init>()V
    .locals 3

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/b/k;->a:Landroid/content/SharedPreferences;

    .line 71
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 72
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    const-string v1, "infoc_preference"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/b/k;->a:Landroid/content/SharedPreferences;

    .line 75
    return-void
.end method

.method private a(Ljava/lang/String;I)I
    .locals 1

    .prologue
    .line 280
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 2347
    iget-object v0, p0, Lcom/roidapp/photogrid/b/k;->a:Landroid/content/SharedPreferences;

    .line 281
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static declared-synchronized a()Lcom/roidapp/photogrid/b/k;
    .locals 2

    .prologue
    .line 78
    const-class v1, Lcom/roidapp/photogrid/b/k;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/roidapp/photogrid/b/k;->b:Lcom/roidapp/photogrid/b/k;

    if-nez v0, :cond_0

    .line 79
    new-instance v0, Lcom/roidapp/photogrid/b/k;

    invoke-direct {v0}, Lcom/roidapp/photogrid/b/k;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/b/k;->b:Lcom/roidapp/photogrid/b/k;

    .line 81
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/b/k;->b:Lcom/roidapp/photogrid/b/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 78
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private a(Ljava/lang/String;F)V
    .locals 1

    .prologue
    .line 339
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 7347
    iget-object v0, p0, Lcom/roidapp/photogrid/b/k;->a:Landroid/content/SharedPreferences;

    .line 340
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 341
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 342
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 344
    return-void
.end method

.method private b(Ljava/lang/String;)F
    .locals 2

    .prologue
    .line 298
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 4347
    iget-object v0, p0, Lcom/roidapp/photogrid/b/k;->a:Landroid/content/SharedPreferences;

    .line 299
    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method private b(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 323
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 5347
    iget-object v0, p0, Lcom/roidapp/photogrid/b/k;->a:Landroid/content/SharedPreferences;

    .line 324
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 325
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 326
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 328
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 289
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 3347
    iget-object v0, p0, Lcom/roidapp/photogrid/b/k;->a:Landroid/content/SharedPreferences;

    .line 290
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(F)V
    .locals 1

    .prologue
    .line 231
    const-string v0, "PG_LAST_OUTER_BORDER"

    invoke-direct {p0, v0, p1}, Lcom/roidapp/photogrid/b/k;->a(Ljava/lang/String;F)V

    .line 232
    return-void
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 199
    const-string v0, "pg_last_grid_mode"

    invoke-direct {p0, v0, p1}, Lcom/roidapp/photogrid/b/k;->b(Ljava/lang/String;I)V

    .line 200
    return-void
.end method

.method public final a(JLjava/lang/String;)V
    .locals 3

    .prologue
    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 92
    const-string v1, "InfocReportAvailable"

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/photogrid/b/k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 276
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 1347
    iget-object v1, p0, Lcom/roidapp/photogrid/b/k;->a:Landroid/content/SharedPreferences;

    .line 276
    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()I
    .locals 2

    .prologue
    .line 195
    const-string v0, "pg_last_grid_mode"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/b/k;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final b(F)V
    .locals 1

    .prologue
    .line 239
    const-string v0, "pg_last_corner_radious"

    invoke-direct {p0, v0, p1}, Lcom/roidapp/photogrid/b/k;->a(Ljava/lang/String;F)V

    .line 240
    return-void
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 207
    const-string v0, "pg_last_grid_bg_color"

    invoke-direct {p0, v0, p1}, Lcom/roidapp/photogrid/b/k;->b(Ljava/lang/String;I)V

    .line 208
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 331
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 6347
    iget-object v0, p0, Lcom/roidapp/photogrid/b/k;->a:Landroid/content/SharedPreferences;

    .line 332
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 333
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 334
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 336
    return-void
.end method

.method public final c()I
    .locals 2

    .prologue
    .line 203
    const-string v0, "pg_last_grid_bg_color"

    const/16 v1, -0x14

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/b/k;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final c(I)V
    .locals 1

    .prologue
    .line 215
    const-string v0, "pg_last_grid_bg_patten0"

    invoke-direct {p0, v0, p1}, Lcom/roidapp/photogrid/b/k;->b(Ljava/lang/String;I)V

    .line 216
    return-void
.end method

.method public final d()I
    .locals 2

    .prologue
    .line 211
    const-string v0, "pg_last_grid_bg_patten0"

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/b/k;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final d(I)V
    .locals 1

    .prologue
    .line 223
    const-string v0, "pg_last_grid_bg_patten1"

    invoke-direct {p0, v0, p1}, Lcom/roidapp/photogrid/b/k;->b(Ljava/lang/String;I)V

    .line 224
    return-void
.end method

.method public final e()I
    .locals 2

    .prologue
    .line 219
    const-string v0, "pg_last_grid_bg_patten1"

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/b/k;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final e(I)V
    .locals 1

    .prologue
    .line 247
    const-string v0, "pg_last_shape_index"

    invoke-direct {p0, v0, p1}, Lcom/roidapp/photogrid/b/k;->b(Ljava/lang/String;I)V

    .line 248
    return-void
.end method

.method public final f()F
    .locals 1

    .prologue
    .line 227
    const-string v0, "PG_LAST_OUTER_BORDER"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/b/k;->b(Ljava/lang/String;)F

    move-result v0

    return v0
.end method

.method public final f(I)V
    .locals 1

    .prologue
    .line 255
    const-string v0, "pg_last_filter_image_code"

    invoke-direct {p0, v0, p1}, Lcom/roidapp/photogrid/b/k;->b(Ljava/lang/String;I)V

    .line 256
    return-void
.end method

.method public final g()F
    .locals 1

    .prologue
    .line 235
    const-string v0, "pg_last_corner_radious"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/b/k;->b(Ljava/lang/String;)F

    move-result v0

    return v0
.end method

.method public final g(I)V
    .locals 1

    .prologue
    .line 263
    const-string v0, "pg_last_crop_image_code"

    invoke-direct {p0, v0, p1}, Lcom/roidapp/photogrid/b/k;->b(Ljava/lang/String;I)V

    .line 264
    return-void
.end method

.method public final h()I
    .locals 2

    .prologue
    .line 243
    const-string v0, "pg_last_shape_index"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/b/k;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final i()I
    .locals 2

    .prologue
    .line 251
    const-string v0, "pg_last_filter_image_code"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/b/k;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final j()I
    .locals 2

    .prologue
    .line 259
    const-string v0, "pg_last_crop_image_code"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/b/k;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

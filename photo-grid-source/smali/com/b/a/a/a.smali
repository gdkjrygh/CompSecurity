.class public Lcom/b/a/a/a;
.super La/a/a/a/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/a/a/a/p",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field a:Lcom/b/a/a/j;

.field b:Lcom/b/a/a/v;

.field c:La/a/a/a/a;

.field private d:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, La/a/a/a/p;-><init>()V

    return-void
.end method

.method private e()Ljava/lang/Boolean;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 388
    :try_start_0
    invoke-static {}, La/a/a/a/a/g/q;->a()La/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/g/q;->b()La/a/a/a/a/g/v;

    move-result-object v0

    .line 389
    if-nez v0, :cond_0

    .line 390
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v0

    const-string v1, "Answers"

    const-string v2, "Failed to retrieve settings"

    invoke-interface {v0, v1, v2}, La/a/a/a/s;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 408
    :goto_0
    return-object v0

    .line 394
    :cond_0
    iget-object v1, v0, La/a/a/a/a/g/v;->d:La/a/a/a/a/g/m;

    iget-boolean v1, v1, La/a/a/a/a/g/m;->d:Z

    if-eqz v1, :cond_1

    .line 395
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 396
    iget-object v1, p0, Lcom/b/a/a/a;->b:Lcom/b/a/a/v;

    iget-object v0, v0, La/a/a/a/a/g/v;->e:La/a/a/a/a/g/b;

    .line 4449
    invoke-virtual {p0}, Lcom/b/a/a/a;->v()Landroid/content/Context;

    move-result-object v2

    const-string v3, "com.crashlytics.ApiEndpoint"

    invoke-static {v2, v3}, La/a/a/a/a/b/l;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 5066
    iget-object v1, v1, Lcom/b/a/a/v;->a:Lcom/b/a/a/b;

    invoke-virtual {v1, v0, v2}, Lcom/b/a/a/b;->a(La/a/a/a/a/g/b;Ljava/lang/String;)V

    .line 398
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    .line 400
    :cond_1
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 401
    iget-object v0, p0, Lcom/b/a/a/a;->c:La/a/a/a/a;

    invoke-virtual {v0}, La/a/a/a/a;->a()V

    .line 402
    iget-object v0, p0, Lcom/b/a/a/a;->b:Lcom/b/a/a/v;

    .line 5070
    iget-object v0, v0, Lcom/b/a/a/v;->a:Lcom/b/a/a/b;

    invoke-virtual {v0}, Lcom/b/a/a/b;->a()V

    .line 403
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 405
    :catch_0
    move-exception v0

    .line 406
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "Answers"

    const-string v3, "Error dealing with settings"

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 408
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 418
    const-string v0, "1.3.2.79"

    return-object v0
.end method

.method public final a(La/a/a/a/a/b/p;)V
    .locals 4

    .prologue
    .line 345
    iget-object v0, p0, Lcom/b/a/a/a;->b:Lcom/b/a/a/v;

    if-eqz v0, :cond_1

    .line 346
    iget-object v0, p0, Lcom/b/a/a/a;->b:Lcom/b/a/a/v;

    invoke-virtual {p1}, La/a/a/a/a/b/p;->a()Ljava/lang/String;

    move-result-object v1

    .line 1038
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    if-ne v2, v3, :cond_0

    .line 1039
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "onCrash called from main thread!!!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1045
    :cond_0
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 1046
    iget-object v0, v0, Lcom/b/a/a/v;->a:Lcom/b/a/a/b;

    .line 1055
    const-string v2, "sessionId"

    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    .line 1056
    new-instance v2, Lcom/b/a/a/y;

    sget-object v3, Lcom/b/a/a/z;->i:Lcom/b/a/a/z;

    invoke-direct {v2, v3}, Lcom/b/a/a/y;-><init>(Lcom/b/a/a/z;)V

    .line 1107
    iput-object v1, v2, Lcom/b/a/a/y;->c:Ljava/util/Map;

    .line 2069
    const/4 v1, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lcom/b/a/a/b;->a(Lcom/b/a/a/y;ZZ)V

    .line 348
    :cond_1
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 413
    const-string v0, "com.crashlytics.sdk.android:answers"

    return-object v0
.end method

.method protected final synthetic d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/b/a/a/a;->e()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected final e_()Z
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 354
    :try_start_0
    invoke-virtual {p0}, Lcom/b/a/a/a;->v()Landroid/content/Context;

    move-result-object v2

    .line 355
    new-instance v0, La/a/a/a/a/f/d;

    const-string v1, "settings"

    invoke-direct {v0, v2, v1}, La/a/a/a/a/f/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 357
    new-instance v1, Lcom/b/a/a/j;

    invoke-direct {v1, v0}, Lcom/b/a/a/j;-><init>(La/a/a/a/a/f/c;)V

    iput-object v1, p0, Lcom/b/a/a/a;->a:Lcom/b/a/a/j;

    .line 358
    new-instance v0, La/a/a/a/a;

    invoke-direct {v0, v2}, La/a/a/a/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/b/a/a/a;->c:La/a/a/a/a;

    .line 360
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 361
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 362
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 364
    iget v0, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/a/a;->d:Ljava/lang/String;

    .line 365
    iget-object v0, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, "0.0"

    :goto_0
    iput-object v0, p0, Lcom/b/a/a/a;->j:Ljava/lang/String;

    .line 368
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x9

    if-lt v0, v3, :cond_2

    .line 369
    iget-wide v0, v1, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    iput-wide v0, p0, Lcom/b/a/a/a;->k:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2423
    :goto_1
    :try_start_1
    new-instance v4, Lcom/b/a/a/ac;

    invoke-virtual {p0}, Lcom/b/a/a/a;->u()La/a/a/a/a/b/x;

    move-result-object v0

    iget-object v1, p0, Lcom/b/a/a/a;->d:Ljava/lang/String;

    iget-object v3, p0, Lcom/b/a/a/a;->j:Ljava/lang/String;

    invoke-direct {v4, v2, v0, v1, v3}, Lcom/b/a/a/ac;-><init>(Landroid/content/Context;La/a/a/a/a/b/x;Ljava/lang/String;Ljava/lang/String;)V

    .line 2425
    new-instance v3, Lcom/b/a/a/h;

    new-instance v0, La/a/a/a/a/f/b;

    invoke-direct {v0, p0}, La/a/a/a/a/f/b;-><init>(La/a/a/a/p;)V

    invoke-direct {v3, v2, v0}, Lcom/b/a/a/h;-><init>(Landroid/content/Context;La/a/a/a/a/f/a;)V

    .line 2427
    new-instance v0, Lcom/b/a/a/b;

    new-instance v5, La/a/a/a/a/e/b;

    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    invoke-direct {v5, v1}, La/a/a/a/a/e/b;-><init>(La/a/a/a/s;)V

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/b/a/a/b;-><init>(La/a/a/a/p;Landroid/content/Context;Lcom/b/a/a/h;Lcom/b/a/a/ac;La/a/a/a/a/e/m;)V

    .line 2431
    invoke-virtual {v0}, Lcom/b/a/a/b;->c()V

    .line 2432
    new-instance v1, Lcom/b/a/a/v;

    invoke-direct {v1, v0}, Lcom/b/a/a/v;-><init>(Lcom/b/a/a/b;)V

    iput-object v1, p0, Lcom/b/a/a/a;->b:Lcom/b/a/a/v;

    .line 2433
    iget-object v0, p0, Lcom/b/a/a/a;->c:La/a/a/a/a;

    new-instance v1, Lcom/b/a/a/i;

    iget-object v2, p0, Lcom/b/a/a/a;->b:Lcom/b/a/a/v;

    invoke-direct {v1, v2}, Lcom/b/a/a/i;-><init>(Lcom/b/a/a/v;)V

    invoke-virtual {v0, v1}, La/a/a/a/a;->a(La/a/a/a/d;)Z

    .line 2435
    iget-wide v0, p0, Lcom/b/a/a/a;->k:J

    .line 2462
    iget-object v2, p0, Lcom/b/a/a/a;->a:Lcom/b/a/a/j;

    invoke-virtual {v2}, Lcom/b/a/a/j;->b()Z

    move-result v2

    if-nez v2, :cond_4

    .line 2472
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v0, v2, v0

    .line 2473
    const-wide/32 v2, 0x36ee80

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    move v0, v6

    .line 2462
    :goto_2
    if-eqz v0, :cond_4

    move v0, v6

    .line 2435
    :goto_3
    if-eqz v0, :cond_0

    .line 2436
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 2437
    iget-object v0, p0, Lcom/b/a/a/a;->b:Lcom/b/a/a/v;

    .line 3055
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 3056
    iget-object v0, v0, Lcom/b/a/a/v;->a:Lcom/b/a/a/b;

    .line 4046
    new-instance v1, Lcom/b/a/a/y;

    sget-object v2, Lcom/b/a/a/z;->j:Lcom/b/a/a/z;

    invoke-direct {v1, v2}, Lcom/b/a/a/y;-><init>(Lcom/b/a/a/z;)V

    .line 4062
    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/b/a/a/b;->a(Lcom/b/a/a/y;ZZ)V

    .line 2438
    iget-object v0, p0, Lcom/b/a/a/a;->a:Lcom/b/a/a/j;

    invoke-virtual {v0}, Lcom/b/a/a/j;->a()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_0
    :goto_4
    move v0, v6

    .line 382
    :goto_5
    return v0

    .line 365
    :cond_1
    :try_start_2
    iget-object v0, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    goto/16 :goto_0

    .line 371
    :cond_2
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 373
    new-instance v1, Ljava/io/File;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/b/a/a/a;->k:J
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_1

    .line 379
    :catch_0
    move-exception v0

    .line 380
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "Answers"

    const-string v3, "Error retrieving app properties"

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v7

    .line 382
    goto :goto_5

    :cond_3
    move v0, v7

    .line 2473
    goto :goto_2

    :cond_4
    move v0, v7

    .line 2462
    goto :goto_3

    .line 2441
    :catch_1
    move-exception v0

    .line 2442
    :try_start_3
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "Answers"

    const-string v3, "Failed to initialize"

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_4
.end method

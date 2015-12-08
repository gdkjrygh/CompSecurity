.class public Lcom/b/a/c/h;
.super La/a/a/a/p;
.source "SourceFile"


# annotations
.annotation runtime La/a/a/a/a/c/n;
    a = {
        Lcom/b/a/c/a/a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/a/a/a/p",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:J

.field private final b:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/io/File;

.field private d:Ljava/io/File;

.field private j:Lcom/b/a/c/x;

.field private k:Lcom/b/a/c/aa;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:F

.field private u:Z

.field private final v:Lcom/b/a/c/bn;

.field private w:La/a/a/a/a/e/m;

.field private x:Lcom/b/a/c/u;

.field private y:Lcom/b/a/c/a/a;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 200
    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-direct {p0, v0, v2, v2, v1}, Lcom/b/a/c/h;-><init>(FLcom/b/a/c/x;Lcom/b/a/c/bn;Z)V

    .line 201
    return-void
.end method

.method constructor <init>(FLcom/b/a/c/x;Lcom/b/a/c/bn;Z)V
    .locals 6

    .prologue
    .line 205
    const-string v0, "Crashlytics Exception Handler"

    invoke-static {v0}, La/a/a/a/a/b/t;->a(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/b/a/c/h;-><init>(FLcom/b/a/c/x;Lcom/b/a/c/bn;ZLjava/util/concurrent/ExecutorService;)V

    .line 207
    return-void
.end method

.method private constructor <init>(FLcom/b/a/c/x;Lcom/b/a/c/bn;ZLjava/util/concurrent/ExecutorService;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 214
    invoke-direct {p0}, La/a/a/a/p;-><init>()V

    .line 97
    iput-object v0, p0, Lcom/b/a/c/h;->l:Ljava/lang/String;

    .line 98
    iput-object v0, p0, Lcom/b/a/c/h;->m:Ljava/lang/String;

    .line 99
    iput-object v0, p0, Lcom/b/a/c/h;->n:Ljava/lang/String;

    .line 215
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/b/a/c/h;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 216
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/b/a/c/h;->a:J

    .line 217
    iput p1, p0, Lcom/b/a/c/h;->t:F

    .line 218
    iput-object p2, p0, Lcom/b/a/c/h;->j:Lcom/b/a/c/x;

    .line 219
    iput-object p3, p0, Lcom/b/a/c/h;->v:Lcom/b/a/c/bn;

    .line 220
    iput-boolean p4, p0, Lcom/b/a/c/h;->u:Z

    .line 221
    new-instance v0, Lcom/b/a/c/u;

    invoke-direct {v0, p5}, Lcom/b/a/c/u;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lcom/b/a/c/h;->x:Lcom/b/a/c/u;

    .line 222
    return-void
.end method

.method private A()V
    .locals 2

    .prologue
    .line 812
    iget-object v0, p0, Lcom/b/a/c/h;->x:Lcom/b/a/c/u;

    new-instance v1, Lcom/b/a/c/k;

    invoke-direct {v1, p0}, Lcom/b/a/c/k;-><init>(Lcom/b/a/c/h;)V

    invoke-virtual {v0, v1}, Lcom/b/a/c/u;->b(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 827
    return-void
.end method

.method static synthetic a(FI)I
    .locals 1

    .prologue
    .line 61
    .line 6061
    int-to-float v0, p1

    mul-float/2addr v0, p0

    float-to-int v0, v0

    .line 61
    return v0
.end method

.method static synthetic a(Lcom/b/a/c/h;)Ljava/io/File;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/b/a/c/h;->d:Ljava/io/File;

    return-object v0
.end method

.method static a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 722
    const-class v0, Lcom/b/a/a/a;

    invoke-static {v0}, La/a/a/a/f;->a(Ljava/lang/Class;)La/a/a/a/p;

    move-result-object v0

    check-cast v0, Lcom/b/a/a/a;

    .line 723
    if-eqz v0, :cond_0

    .line 724
    new-instance v1, La/a/a/a/a/b/p;

    invoke-direct {v1, p0}, La/a/a/a/a/b/p;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/b/a/a/a;->a(La/a/a/a/a/b/p;)V

    .line 727
    :cond_0
    return-void
.end method

.method private a(Landroid/content/Context;)Z
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 238
    iget-boolean v0, p0, Lcom/b/a/c/h;->u:Z

    if-eqz v0, :cond_0

    move v0, v6

    .line 302
    :goto_0
    return v0

    .line 243
    :cond_0
    new-instance v0, La/a/a/a/a/b/j;

    invoke-direct {v0}, La/a/a/a/a/b/j;-><init>()V

    invoke-static {p1}, La/a/a/a/a/b/j;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 245
    if-nez v0, :cond_1

    move v0, v6

    .line 246
    goto :goto_0

    .line 249
    :cond_1
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v0

    const-string v1, "CrashlyticsCore"

    const-string v2, "Initializing Crashlytics 2.3.5.79"

    invoke-interface {v0, v1, v2}, La/a/a/a/s;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/b/a/c/h;->q()Ljava/io/File;

    move-result-object v1

    const-string v2, "initialization_marker"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/b/a/c/h;->d:Ljava/io/File;

    .line 2306
    :try_start_0
    iget-object v0, p0, Lcom/b/a/c/h;->v:Lcom/b/a/c/bn;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/b/a/c/z;

    iget-object v1, p0, Lcom/b/a/c/h;->v:Lcom/b/a/c/bn;

    invoke-direct {v0, v1}, Lcom/b/a/c/z;-><init>(Lcom/b/a/c/bn;)V

    .line 2308
    :goto_1
    new-instance v1, La/a/a/a/a/e/b;

    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    invoke-direct {v1, v2}, La/a/a/a/a/e/b;-><init>(La/a/a/a/s;)V

    iput-object v1, p0, Lcom/b/a/c/h;->w:La/a/a/a/a/e/m;

    .line 2309
    iget-object v1, p0, Lcom/b/a/c/h;->w:La/a/a/a/a/e/m;

    invoke-interface {v1, v0}, La/a/a/a/a/e/m;->a(La/a/a/a/a/e/n;)V
    :try_end_0
    .catch Lcom/b/a/c/y; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 2312
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/c/h;->p:Ljava/lang/String;

    .line 2313
    invoke-virtual {p0}, Lcom/b/a/c/h;->u()La/a/a/a/a/b/x;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/b/x;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/c/h;->q:Ljava/lang/String;

    .line 2314
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Installer package name is: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/b/a/c/h;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2316
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 2317
    iget-object v1, p0, Lcom/b/a/c/h;->p:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 2318
    iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/b/a/c/h;->r:Ljava/lang/String;

    .line 2319
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v1, :cond_3

    const-string v0, "0.0"

    :goto_2
    iput-object v0, p0, Lcom/b/a/c/h;->s:Ljava/lang/String;

    .line 2324
    invoke-static {p1}, La/a/a/a/a/b/l;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/c/h;->o:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/b/a/c/y; {:try_start_1 .. :try_end_1} :catch_1

    .line 2332
    :goto_3
    :try_start_2
    invoke-virtual {p0}, Lcom/b/a/c/h;->u()La/a/a/a/a/b/x;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/b/x;->j()Ljava/lang/String;

    .line 2336
    iget-object v0, p0, Lcom/b/a/c/h;->o:Ljava/lang/String;

    .line 3026
    const-string v1, "com.crashlytics.RequireBuildId"

    const/4 v2, 0x1

    invoke-static {p1, v1, v2}, La/a/a/a/a/b/l;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    .line 3739
    new-instance v2, Lcom/b/a/c/a;

    invoke-direct {v2, v0, v1}, Lcom/b/a/c/a;-><init>(Ljava/lang/String;Z)V

    .line 2336
    invoke-virtual {v2}, Lcom/b/a/c/a;->a()V
    :try_end_2
    .catch Lcom/b/a/c/y; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 258
    :try_start_3
    new-instance v4, Lcom/b/a/c/bu;

    invoke-virtual {p0}, Lcom/b/a/c/h;->v()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/b/a/c/h;->o:Ljava/lang/String;

    .line 3743
    iget-object v2, p0, Lcom/b/a/c/h;->p:Ljava/lang/String;

    .line 258
    invoke-direct {v4, v0, v1, v2}, Lcom/b/a/c/bu;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 261
    new-instance v0, Lcom/b/a/c/aa;

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    iget-object v2, p0, Lcom/b/a/c/h;->x:Lcom/b/a/c/u;

    invoke-virtual {p0}, Lcom/b/a/c/h;->u()La/a/a/a/a/b/x;

    move-result-object v3

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/b/a/c/aa;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;Lcom/b/a/c/u;La/a/a/a/a/b/x;Lcom/b/a/c/bu;Lcom/b/a/c/h;)V

    iput-object v0, p0, Lcom/b/a/c/h;->k:Lcom/b/a/c/aa;

    .line 3830
    iget-object v0, p0, Lcom/b/a/c/h;->x:Lcom/b/a/c/u;

    new-instance v1, Lcom/b/a/c/l;

    invoke-direct {v1, p0}, Lcom/b/a/c/l;-><init>(Lcom/b/a/c/h;)V

    invoke-virtual {v0, v1}, Lcom/b/a/c/u;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lcom/b/a/c/y; {:try_start_3 .. :try_end_3} :catch_1

    move-result v1

    .line 277
    :try_start_4
    iget-object v0, p0, Lcom/b/a/c/h;->k:Lcom/b/a/c/aa;

    invoke-virtual {v0}, Lcom/b/a/c/aa;->b()V

    .line 279
    iget-object v0, p0, Lcom/b/a/c/h;->k:Lcom/b/a/c/aa;

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 280
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lcom/b/a/c/y; {:try_start_4 .. :try_end_4} :catch_1

    .line 287
    :goto_4
    if-eqz v1, :cond_4

    :try_start_5
    invoke-static {p1}, La/a/a/a/a/b/l;->m(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 290
    invoke-direct {p0}, Lcom/b/a/c/h;->z()V
    :try_end_5
    .catch Lcom/b/a/c/y; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    move v0, v6

    .line 292
    goto/16 :goto_0

    .line 2306
    :cond_2
    const/4 v0, 0x0

    goto/16 :goto_1

    .line 2319
    :cond_3
    :try_start_6
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catch Lcom/b/a/c/y; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_2

    .line 2326
    :catch_0
    move-exception v0

    .line 2327
    :try_start_7
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "CrashlyticsCore"

    const-string v3, "Error setting up app properties"

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_7
    .catch Lcom/b/a/c/y; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_3

    .line 295
    :catch_1
    move-exception v0

    .line 297
    new-instance v1, La/a/a/a/a/c/z;

    invoke-direct {v1, v0}, La/a/a/a/a/c/z;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 282
    :catch_2
    move-exception v0

    move v1, v6

    .line 283
    :goto_5
    :try_start_8
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    const-string v3, "CrashlyticsCore"

    const-string v4, "There was a problem installing the exception handler."

    invoke-interface {v2, v3, v4, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_8
    .catch Lcom/b/a/c/y; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    goto :goto_4

    .line 298
    :catch_3
    move-exception v0

    .line 299
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "CrashlyticsCore"

    const-string v3, "Crashlytics was not started due to an exception during initialization"

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v6

    .line 302
    goto/16 :goto_0

    :cond_4
    move v0, v7

    .line 294
    goto/16 :goto_0

    .line 282
    :catch_4
    move-exception v0

    goto :goto_5
.end method

.method static synthetic a(Lcom/b/a/c/h;Landroid/app/Activity;La/a/a/a/a/g/o;)Z
    .locals 6

    .prologue
    .line 5939
    new-instance v4, Lcom/b/a/c/at;

    invoke-direct {v4, p1, p2}, Lcom/b/a/c/at;-><init>(Landroid/content/Context;La/a/a/a/a/g/o;)V

    .line 5943
    new-instance v3, Lcom/b/a/c/t;

    const/4 v0, 0x0

    invoke-direct {v3, p0, v0}, Lcom/b/a/c/t;-><init>(Lcom/b/a/c/h;B)V

    .line 5947
    new-instance v0, Lcom/b/a/c/o;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/b/a/c/o;-><init>(Lcom/b/a/c/h;Landroid/app/Activity;Lcom/b/a/c/t;Lcom/b/a/c/at;La/a/a/a/a/g/o;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 6012
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 6013
    invoke-virtual {v3}, Lcom/b/a/c/t;->b()V

    .line 6014
    invoke-virtual {v3}, Lcom/b/a/c/t;->a()Z

    move-result v0

    .line 61
    return v0
.end method

.method public static f()Lcom/b/a/c/h;
    .locals 1

    .prologue
    .line 406
    const-class v0, Lcom/b/a/c/h;

    invoke-static {v0}, La/a/a/a/f;->a(Ljava/lang/Class;)La/a/a/a/p;

    move-result-object v0

    check-cast v0, Lcom/b/a/c/h;

    return-object v0
.end method

.method static s()La/a/a/a/a/g/p;
    .locals 1

    .prologue
    .line 1021
    invoke-static {}, La/a/a/a/a/g/q;->a()La/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/g/q;->b()La/a/a/a/a/g/v;

    move-result-object v0

    .line 1022
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, v0, La/a/a/a/a/g/v;->b:La/a/a/a/a/g/p;

    goto :goto_0
.end method

.method private z()V
    .locals 4

    .prologue
    .line 658
    new-instance v1, Lcom/b/a/c/i;

    invoke-direct {v1, p0}, Lcom/b/a/c/i;-><init>(Lcom/b/a/c/h;)V

    .line 670
    invoke-virtual {p0}, Lcom/b/a/c/h;->y()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/a/a/c/y;

    .line 671
    invoke-virtual {v1, v0}, La/a/a/a/a/c/s;->a(La/a/a/a/a/c/y;)V

    goto :goto_0

    .line 674
    :cond_0
    invoke-virtual {p0}, Lcom/b/a/c/h;->w()La/a/a/a/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/f;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    .line 676
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 681
    const-wide/16 v2, 0x4

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2

    .line 689
    :goto_1
    return-void

    .line 682
    :catch_0
    move-exception v0

    .line 683
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "CrashlyticsCore"

    const-string v3, "Crashlytics was interrupted during initialization."

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 684
    :catch_1
    move-exception v0

    .line 685
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "CrashlyticsCore"

    const-string v3, "Problem encountered during Crashlytics initialization."

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 686
    :catch_2
    move-exception v0

    .line 687
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "CrashlyticsCore"

    const-string v3, "Crashlytics timed out during initialization."

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method


# virtual methods
.method final a(La/a/a/a/a/g/v;)Lcom/b/a/c/ar;
    .locals 4

    .prologue
    .line 929
    if-eqz p1, :cond_0

    .line 930
    new-instance v0, Lcom/b/a/c/as;

    .line 5765
    invoke-virtual {p0}, Lcom/b/a/c/h;->v()Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.crashlytics.ApiEndpoint"

    invoke-static {v1, v2}, La/a/a/a/a/b/l;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 930
    iget-object v2, p1, La/a/a/a/a/g/v;->a:La/a/a/a/a/g/e;

    iget-object v2, v2, La/a/a/a/a/g/e;->d:Ljava/lang/String;

    iget-object v3, p0, Lcom/b/a/c/h;->w:La/a/a/a/a/e/m;

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/b/a/c/as;-><init>(La/a/a/a/p;Ljava/lang/String;Ljava/lang/String;La/a/a/a/a/e/m;)V

    .line 934
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 399
    const-string v0, "2.3.5.79"

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 394
    const-string v0, "com.crashlytics.sdk.android.crashlytics-core"

    return-object v0
.end method

.method protected final synthetic d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 59
    invoke-virtual {p0}, Lcom/b/a/c/h;->e()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected final e()Ljava/lang/Void;
    .locals 7

    .prologue
    const/4 v5, 0x0

    .line 342
    .line 4796
    iget-object v0, p0, Lcom/b/a/c/h;->x:Lcom/b/a/c/u;

    new-instance v1, Lcom/b/a/c/j;

    invoke-direct {v1, p0}, Lcom/b/a/c/j;-><init>(Lcom/b/a/c/h;)V

    invoke-virtual {v0, v1}, Lcom/b/a/c/u;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 343
    iget-object v0, p0, Lcom/b/a/c/h;->k:Lcom/b/a/c/aa;

    invoke-virtual {v0}, Lcom/b/a/c/aa;->d()V

    .line 346
    const/4 v0, 0x1

    .line 349
    :try_start_0
    invoke-static {}, La/a/a/a/a/g/q;->a()La/a/a/a/a/g/q;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/a/a/g/q;->b()La/a/a/a/a/g/v;

    move-result-object v1

    .line 351
    if-nez v1, :cond_0

    .line 352
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "CrashlyticsCore"

    const-string v3, "Received null settings, skipping initialization!"

    invoke-interface {v1, v2, v3}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 386
    invoke-direct {p0}, Lcom/b/a/c/h;->A()V

    .line 389
    :goto_0
    return-object v5

    .line 356
    :cond_0
    :try_start_1
    iget-object v2, v1, La/a/a/a/a/g/v;->d:La/a/a/a/a/g/m;

    iget-boolean v2, v2, La/a/a/a/a/g/m;->c:Z

    if-eqz v2, :cond_1

    .line 357
    const/4 v0, 0x0

    .line 358
    iget-object v2, p0, Lcom/b/a/c/h;->k:Lcom/b/a/c/aa;

    invoke-virtual {v2}, Lcom/b/a/c/aa;->c()Z

    .line 360
    invoke-virtual {p0, v1}, Lcom/b/a/c/h;->a(La/a/a/a/a/g/v;)Lcom/b/a/c/ar;

    move-result-object v1

    .line 361
    if-eqz v1, :cond_3

    .line 362
    new-instance v2, Lcom/b/a/c/br;

    invoke-direct {v2, v1}, Lcom/b/a/c/br;-><init>(Lcom/b/a/c/ar;)V

    iget v1, p0, Lcom/b/a/c/h;->t:F

    invoke-virtual {v2, v1}, Lcom/b/a/c/br;->a(F)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 371
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    .line 372
    :try_start_2
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 386
    :cond_2
    invoke-direct {p0}, Lcom/b/a/c/h;->A()V

    goto :goto_0

    .line 364
    :cond_3
    :try_start_3
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "CrashlyticsCore"

    const-string v3, "Unable to create a call to upload reports."

    invoke-interface {v1, v2, v3}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 367
    :catch_0
    move-exception v1

    move-object v6, v1

    move v1, v0

    move-object v0, v6

    .line 368
    :try_start_4
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    const-string v3, "CrashlyticsCore"

    const-string v4, "Error dealing with settings"

    invoke-interface {v2, v3, v4, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move v0, v1

    goto :goto_1

    .line 374
    :catch_1
    move-exception v0

    .line 375
    :try_start_5
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "CrashlyticsCore"

    const-string v3, "Problem encountered during Crashlytics initialization."

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 386
    invoke-direct {p0}, Lcom/b/a/c/h;->A()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-direct {p0}, Lcom/b/a/c/h;->A()V

    throw v0
.end method

.method protected final e_()Z
    .locals 1

    .prologue
    .line 230
    invoke-super {p0}, La/a/a/a/p;->v()Landroid/content/Context;

    move-result-object v0

    .line 231
    invoke-direct {p0, v0}, Lcom/b/a/c/h;->a(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method final g()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 735
    iget-object v0, p0, Lcom/b/a/c/h;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 743
    iget-object v0, p0, Lcom/b/a/c/h;->p:Ljava/lang/String;

    return-object v0
.end method

.method final i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 753
    iget-object v0, p0, Lcom/b/a/c/h;->q:Ljava/lang/String;

    return-object v0
.end method

.method final j()Ljava/lang/String;
    .locals 1

    .prologue
    .line 757
    iget-object v0, p0, Lcom/b/a/c/h;->s:Ljava/lang/String;

    return-object v0
.end method

.method final k()Ljava/lang/String;
    .locals 1

    .prologue
    .line 761
    iget-object v0, p0, Lcom/b/a/c/h;->r:Ljava/lang/String;

    return-object v0
.end method

.method final l()Lcom/b/a/c/aa;
    .locals 1

    .prologue
    .line 773
    iget-object v0, p0, Lcom/b/a/c/h;->k:Lcom/b/a/c/aa;

    return-object v0
.end method

.method final m()Ljava/lang/String;
    .locals 1

    .prologue
    .line 777
    invoke-virtual {p0}, Lcom/b/a/c/h;->u()La/a/a/a/a/b/x;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/b/x;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/b/a/c/h;->l:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final n()Ljava/lang/String;
    .locals 1

    .prologue
    .line 781
    invoke-virtual {p0}, Lcom/b/a/c/h;->u()La/a/a/a/a/b/x;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/b/x;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/b/a/c/h;->m:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final o()Ljava/lang/String;
    .locals 1

    .prologue
    .line 785
    invoke-virtual {p0}, Lcom/b/a/c/h;->u()La/a/a/a/a/b/x;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/b/x;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/b/a/c/h;->n:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final p()Lcom/b/a/c/a/a/d;
    .locals 2

    .prologue
    .line 851
    const/4 v0, 0x0

    .line 852
    iget-object v1, p0, Lcom/b/a/c/h;->y:Lcom/b/a/c/a/a;

    if-eqz v1, :cond_0

    .line 853
    iget-object v0, p0, Lcom/b/a/c/h;->y:Lcom/b/a/c/a/a;

    invoke-interface {v0}, Lcom/b/a/c/a/a;->a()Lcom/b/a/c/a/a/d;

    move-result-object v0

    .line 855
    :cond_0
    return-object v0
.end method

.method final q()Ljava/io/File;
    .locals 1

    .prologue
    .line 877
    iget-object v0, p0, Lcom/b/a/c/h;->c:Ljava/io/File;

    if-nez v0, :cond_0

    .line 878
    new-instance v0, La/a/a/a/a/f/b;

    invoke-direct {v0, p0}, La/a/a/a/a/f/b;-><init>(La/a/a/a/p;)V

    invoke-virtual {v0}, La/a/a/a/a/f/b;->a()Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/c/h;->c:Ljava/io/File;

    .line 880
    :cond_0
    iget-object v0, p0, Lcom/b/a/c/h;->c:Ljava/io/File;

    return-object v0
.end method

.method final r()Z
    .locals 3

    .prologue
    .line 884
    invoke-static {}, La/a/a/a/a/g/q;->a()La/a/a/a/a/g/q;

    move-result-object v0

    new-instance v1, Lcom/b/a/c/m;

    invoke-direct {v1, p0}, Lcom/b/a/c/m;-><init>(Lcom/b/a/c/h;)V

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, La/a/a/a/a/g/q;->a(La/a/a/a/a/g/s;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

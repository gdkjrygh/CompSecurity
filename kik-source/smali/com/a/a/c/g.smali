.class public Lcom/a/a/c/g;
.super Lb/a/a/a/l;
.source "SourceFile"


# annotations
.annotation runtime Lb/a/a/a/a/c/h;
    a = {
        Lcom/a/a/c/a/a;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/a/a/c/g$a;
    }
.end annotation


# instance fields
.field private final a:J

.field private final b:Ljava/util/concurrent/ConcurrentHashMap;

.field private c:Ljava/io/File;

.field private d:Lcom/a/a/c/u;

.field private j:Lcom/a/a/c/x;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:F

.field private t:Z

.field private final u:Lcom/a/a/c/au;

.field private v:Lb/a/a/a/a/e/g;

.field private w:Lcom/a/a/c/r;

.field private x:Lcom/a/a/c/a/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 197
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/a/a/c/g;-><init>(B)V

    .line 198
    return-void
.end method

.method private constructor <init>(B)V
    .locals 1

    .prologue
    .line 202
    const-string v0, "Crashlytics Exception Handler"

    invoke-static {v0}, Lb/a/a/a/a/b/p;->a(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/a/a/c/g;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 204
    return-void
.end method

.method private constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 211
    invoke-direct {p0}, Lb/a/a/a/l;-><init>()V

    .line 94
    iput-object v2, p0, Lcom/a/a/c/g;->k:Ljava/lang/String;

    .line 95
    iput-object v2, p0, Lcom/a/a/c/g;->l:Ljava/lang/String;

    .line 96
    iput-object v2, p0, Lcom/a/a/c/g;->m:Ljava/lang/String;

    .line 212
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/a/a/c/g;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 213
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/a/a/c/g;->a:J

    .line 214
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/a/a/c/g;->s:F

    .line 215
    iput-object v2, p0, Lcom/a/a/c/g;->d:Lcom/a/a/c/u;

    .line 216
    iput-object v2, p0, Lcom/a/a/c/g;->u:Lcom/a/a/c/au;

    .line 217
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/a/a/c/g;->t:Z

    .line 218
    new-instance v0, Lcom/a/a/c/r;

    invoke-direct {v0, p1}, Lcom/a/a/c/r;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lcom/a/a/c/g;->w:Lcom/a/a/c/r;

    .line 219
    return-void
.end method

.method private A()V
    .locals 2

    .prologue
    .line 810
    iget-object v0, p0, Lcom/a/a/c/g;->w:Lcom/a/a/c/r;

    new-instance v1, Lcom/a/a/c/j;

    invoke-direct {v1, p0}, Lcom/a/a/c/j;-><init>(Lcom/a/a/c/g;)V

    invoke-virtual {v0, v1}, Lcom/a/a/c/r;->b(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 825
    return-void
.end method

.method static synthetic a(FI)I
    .locals 1

    .prologue
    .line 61
    int-to-float v0, p1

    mul-float/2addr v0, p0

    float-to-int v0, v0

    return v0
.end method

.method static synthetic a(Lcom/a/a/c/g;)Ljava/io/File;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/a/a/c/g;->c:Ljava/io/File;

    return-object v0
.end method

.method private a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 452
    iget-boolean v0, p0, Lcom/a/a/c/g;->t:Z

    if-eqz v0, :cond_1

    .line 460
    :cond_0
    :goto_0
    return-void

    .line 456
    :cond_1
    const-string v0, "prior to logging messages."

    invoke-static {v0}, Lcom/a/a/c/g;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 457
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/a/a/c/g;->a:J

    sub-long/2addr v0, v2

    .line 458
    iget-object v2, p0, Lcom/a/a/c/g;->j:Lcom/a/a/c/x;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lb/a/a/a/a/b/j;->b(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v1, v3}, Lcom/a/a/c/x;->a(JLjava/lang/String;)V

    goto :goto_0
.end method

.method private a(Landroid/content/Context;)Z
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 235
    iget-boolean v0, p0, Lcom/a/a/c/g;->t:Z

    if-eqz v0, :cond_0

    move v0, v6

    .line 299
    :goto_0
    return v0

    .line 240
    :cond_0
    new-instance v0, Lb/a/a/a/a/b/h;

    invoke-direct {v0}, Lb/a/a/a/a/b/h;-><init>()V

    invoke-static {p1}, Lb/a/a/a/a/b/h;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 242
    if-nez v0, :cond_1

    move v0, v6

    .line 243
    goto :goto_0

    .line 246
    :cond_1
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 247
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/a/a/c/g;->q()Ljava/io/File;

    move-result-object v1

    const-string v2, "initialization_marker"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/a/a/c/g;->c:Ljava/io/File;

    .line 252
    :try_start_0
    iget-object v0, p0, Lcom/a/a/c/g;->u:Lcom/a/a/c/au;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/a/a/c/w;

    iget-object v1, p0, Lcom/a/a/c/g;->u:Lcom/a/a/c/au;

    invoke-direct {v0, v1}, Lcom/a/a/c/w;-><init>(Lcom/a/a/c/au;)V

    :goto_1
    new-instance v1, Lb/a/a/a/a/e/b;

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    invoke-direct {v1, v2}, Lb/a/a/a/a/e/b;-><init>(Lb/a/a/a/o;)V

    iput-object v1, p0, Lcom/a/a/c/g;->v:Lb/a/a/a/a/e/g;

    iget-object v1, p0, Lcom/a/a/c/g;->v:Lb/a/a/a/a/e/g;

    invoke-interface {v1, v0}, Lb/a/a/a/a/e/g;->a(Lb/a/a/a/a/e/h;)V
    :try_end_0
    .catch Lcom/a/a/c/v; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/c/g;->o:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/a/a/c/g;->u()Lb/a/a/a/a/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/a/b/t;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/c/g;->p:Ljava/lang/String;

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Installer package name is: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/a/a/c/g;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/c/g;->o:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/a/a/c/g;->q:Ljava/lang/String;

    iget-object v1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v1, :cond_3

    const-string v0, "0.0"

    :goto_2
    iput-object v0, p0, Lcom/a/a/c/g;->r:Ljava/lang/String;

    invoke-static {p1}, Lb/a/a/a/a/b/j;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/c/g;->n:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/a/a/c/v; {:try_start_1 .. :try_end_1} :catch_1

    :goto_3
    :try_start_2
    invoke-virtual {p0}, Lcom/a/a/c/g;->u()Lb/a/a/a/a/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/a/b/t;->i()Ljava/lang/String;

    iget-object v0, p0, Lcom/a/a/c/g;->n:Ljava/lang/String;

    const-string v1, "com.crashlytics.RequireBuildId"

    const/4 v2, 0x1

    invoke-static {p1, v1, v2}, Lb/a/a/a/a/b/j;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    new-instance v2, Lcom/a/a/c/a;

    invoke-direct {v2, v0, v1}, Lcom/a/a/c/a;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v2}, Lcom/a/a/c/a;->a()V
    :try_end_2
    .catch Lcom/a/a/c/v; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 255
    :try_start_3
    new-instance v4, Lcom/a/a/c/ay;

    invoke-virtual {p0}, Lcom/a/a/c/g;->v()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/c/g;->n:Ljava/lang/String;

    iget-object v2, p0, Lcom/a/a/c/g;->o:Ljava/lang/String;

    invoke-direct {v4, v0, v1, v2}, Lcom/a/a/c/ay;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 258
    new-instance v0, Lcom/a/a/c/x;

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    iget-object v2, p0, Lcom/a/a/c/g;->w:Lcom/a/a/c/r;

    invoke-virtual {p0}, Lcom/a/a/c/g;->u()Lb/a/a/a/a/b/t;

    move-result-object v3

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/a/a/c/x;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;Lcom/a/a/c/r;Lb/a/a/a/a/b/t;Lcom/a/a/c/ay;Lcom/a/a/c/g;)V

    iput-object v0, p0, Lcom/a/a/c/g;->j:Lcom/a/a/c/x;

    .line 269
    iget-object v0, p0, Lcom/a/a/c/g;->w:Lcom/a/a/c/r;

    new-instance v1, Lcom/a/a/c/k;

    invoke-direct {v1, p0}, Lcom/a/a/c/k;-><init>(Lcom/a/a/c/g;)V

    invoke-virtual {v0, v1}, Lcom/a/a/c/r;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lcom/a/a/c/v; {:try_start_3 .. :try_end_3} :catch_1

    move-result v1

    .line 274
    :try_start_4
    iget-object v0, p0, Lcom/a/a/c/g;->j:Lcom/a/a/c/x;

    invoke-virtual {v0}, Lcom/a/a/c/x;->b()V

    .line 276
    iget-object v0, p0, Lcom/a/a/c/g;->j:Lcom/a/a/c/x;

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 277
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lcom/a/a/c/v; {:try_start_4 .. :try_end_4} :catch_1

    .line 284
    :goto_4
    if-eqz v1, :cond_4

    :try_start_5
    invoke-static {p1}, Lb/a/a/a/a/b/j;->n(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 287
    invoke-direct {p0}, Lcom/a/a/c/g;->z()V
    :try_end_5
    .catch Lcom/a/a/c/v; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    move v0, v6

    .line 289
    goto/16 :goto_0

    .line 252
    :cond_2
    const/4 v0, 0x0

    goto/16 :goto_1

    :cond_3
    :try_start_6
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catch Lcom/a/a/c/v; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_7
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Error setting up app properties"

    invoke-interface {v1, v2, v3, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_7
    .catch Lcom/a/a/c/v; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_3

    .line 292
    :catch_1
    move-exception v0

    .line 294
    new-instance v1, Lb/a/a/a/a/c/r;

    invoke-direct {v1, v0}, Lb/a/a/a/a/c/r;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 279
    :catch_2
    move-exception v0

    move v1, v6

    .line 280
    :goto_5
    :try_start_8
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "There was a problem installing the exception handler."

    invoke-interface {v2, v3, v4, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_8
    .catch Lcom/a/a/c/v; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    goto :goto_4

    .line 295
    :catch_3
    move-exception v0

    .line 296
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Crashlytics was not started due to an exception during initialization"

    invoke-interface {v1, v2, v3, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v6

    .line 299
    goto/16 :goto_0

    :cond_4
    move v0, v7

    .line 291
    goto/16 :goto_0

    .line 279
    :catch_4
    move-exception v0

    goto :goto_5
.end method

.method static synthetic a(Lcom/a/a/c/g;Landroid/app/Activity;Lb/a/a/a/a/g/o;)Z
    .locals 6

    .prologue
    .line 61
    new-instance v4, Lcom/a/a/c/ap;

    invoke-direct {v4, p1, p2}, Lcom/a/a/c/ap;-><init>(Landroid/content/Context;Lb/a/a/a/a/g/o;)V

    new-instance v3, Lcom/a/a/c/g$a;

    const/4 v0, 0x0

    invoke-direct {v3, p0, v0}, Lcom/a/a/c/g$a;-><init>(Lcom/a/a/c/g;B)V

    new-instance v0, Lcom/a/a/c/n;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/a/a/c/n;-><init>(Lcom/a/a/c/g;Landroid/app/Activity;Lcom/a/a/c/g$a;Lcom/a/a/c/ap;Lb/a/a/a/a/g/o;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    invoke-virtual {v3}, Lcom/a/a/c/g$a;->b()V

    invoke-virtual {v3}, Lcom/a/a/c/g$a;->a()Z

    move-result v0

    return v0
.end method

.method static c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 709
    const-class v0, Lcom/a/a/a/a;

    invoke-static {v0}, Lb/a/a/a/d;->a(Ljava/lang/Class;)Lb/a/a/a/l;

    move-result-object v0

    check-cast v0, Lcom/a/a/a/a;

    .line 710
    if-eqz v0, :cond_0

    .line 711
    new-instance v1, Lb/a/a/a/a/b/l$b;

    invoke-direct {v1, p0}, Lb/a/a/a/a/b/l$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/a/a/a/a;->a(Lb/a/a/a/a/b/l$b;)V

    .line 714
    :cond_0
    return-void
.end method

.method static d(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 720
    const-class v0, Lcom/a/a/a/a;

    invoke-static {v0}, Lb/a/a/a/d;->a(Ljava/lang/Class;)Lb/a/a/a/l;

    move-result-object v0

    check-cast v0, Lcom/a/a/a/a;

    .line 721
    if-eqz v0, :cond_0

    .line 722
    new-instance v1, Lb/a/a/a/a/b/l$a;

    invoke-direct {v1, p0}, Lb/a/a/a/a/b/l$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/a/a/a/a;->a(Lb/a/a/a/a/b/l$a;)V

    .line 725
    :cond_0
    return-void
.end method

.method private static e(Ljava/lang/String;)Z
    .locals 4

    .prologue
    .line 1034
    invoke-static {}, Lcom/a/a/c/g;->f()Lcom/a/a/c/g;

    move-result-object v0

    .line 1035
    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/a/a/c/g;->j:Lcom/a/a/c/x;

    if-nez v0, :cond_1

    .line 1036
    :cond_0
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v0

    const-string v1, "Fabric"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Crashlytics must be initialized by calling Fabric.with(Context) "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1039
    const/4 v0, 0x0

    .line 1041
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static f()Lcom/a/a/c/g;
    .locals 1

    .prologue
    .line 404
    const-class v0, Lcom/a/a/c/g;

    invoke-static {v0}, Lb/a/a/a/d;->a(Ljava/lang/Class;)Lb/a/a/a/l;

    move-result-object v0

    check-cast v0, Lcom/a/a/c/g;

    return-object v0
.end method

.method private static f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    const/16 v1, 0x400

    .line 1046
    if-eqz p0, :cond_0

    .line 1047
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 1048
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v1, :cond_0

    .line 1049
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 1052
    :cond_0
    return-object p0
.end method

.method static s()Lb/a/a/a/a/g/p;
    .locals 1

    .prologue
    .line 1016
    invoke-static {}, Lb/a/a/a/a/g/q;->a()Lb/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/a/g/q;->b()Lb/a/a/a/a/g/t;

    move-result-object v0

    .line 1017
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, v0, Lb/a/a/a/a/g/t;->b:Lb/a/a/a/a/g/p;

    goto :goto_0
.end method

.method private z()V
    .locals 4

    .prologue
    .line 656
    new-instance v1, Lcom/a/a/c/h;

    invoke-direct {v1, p0}, Lcom/a/a/c/h;-><init>(Lcom/a/a/c/g;)V

    .line 668
    invoke-virtual {p0}, Lcom/a/a/c/g;->y()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/a/a/a/c/q;

    .line 669
    invoke-virtual {v1, v0}, Lb/a/a/a/a/c/l;->a(Lb/a/a/a/a/c/q;)V

    goto :goto_0

    .line 672
    :cond_0
    invoke-virtual {p0}, Lcom/a/a/c/g;->w()Lb/a/a/a/d;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/d;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    .line 674
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 679
    const-wide/16 v2, 0x4

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2

    .line 687
    :goto_1
    return-void

    .line 680
    :catch_0
    move-exception v0

    .line 681
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Crashlytics was interrupted during initialization."

    invoke-interface {v1, v2, v3, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 682
    :catch_1
    move-exception v0

    .line 683
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Problem encountered during Crashlytics initialization."

    invoke-interface {v1, v2, v3, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 684
    :catch_2
    move-exception v0

    .line 685
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Crashlytics timed out during initialization."

    invoke-interface {v1, v2, v3, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method


# virtual methods
.method final a(Lb/a/a/a/a/g/t;)Lcom/a/a/c/an;
    .locals 4

    .prologue
    .line 924
    if-eqz p1, :cond_0

    .line 925
    new-instance v0, Lcom/a/a/c/ao;

    invoke-virtual {p0}, Lcom/a/a/c/g;->v()Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.crashlytics.ApiEndpoint"

    invoke-static {v1, v2}, Lb/a/a/a/a/b/j;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, Lb/a/a/a/a/g/t;->a:Lb/a/a/a/a/g/e;

    iget-object v2, v2, Lb/a/a/a/a/g/e;->d:Ljava/lang/String;

    iget-object v3, p0, Lcom/a/a/c/g;->v:Lb/a/a/a/a/e/g;

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/a/a/c/ao;-><init>(Lb/a/a/a/l;Ljava/lang/String;Ljava/lang/String;Lb/a/a/a/a/e/g;)V

    .line 929
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 397
    const-string v0, "2.3.2.56"

    return-object v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 448
    const/4 v0, 0x3

    const-string v1, "Fabric"

    invoke-direct {p0, v0, v1, p1}, Lcom/a/a/c/g;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 449
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 476
    invoke-direct {p0, v1, p1, p2}, Lcom/a/a/c/g;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 479
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v0

    invoke-interface {v0, v1, p1, p2, v1}, Lb/a/a/a/o;->a(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 480
    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 422
    iget-boolean v0, p0, Lcom/a/a/c/g;->t:Z

    if-eqz v0, :cond_1

    .line 435
    :cond_0
    :goto_0
    return-void

    .line 426
    :cond_1
    const-string v0, "prior to logging exceptions."

    invoke-static {v0}, Lcom/a/a/c/g;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 427
    if-nez p1, :cond_2

    .line 428
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v0

    const/4 v1, 0x5

    const-string v2, "Fabric"

    const-string v3, "Crashlytics is ignoring a request to log a null exception."

    invoke-interface {v0, v1, v2, v3}, Lb/a/a/a/o;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 433
    :cond_2
    iget-object v0, p0, Lcom/a/a/c/g;->j:Lcom/a/a/c/x;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/a/a/c/x;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method protected final a_()Z
    .locals 1

    .prologue
    .line 227
    invoke-super {p0}, Lb/a/a/a/l;->v()Landroid/content/Context;

    move-result-object v0

    .line 228
    invoke-direct {p0, v0}, Lcom/a/a/c/g;->a(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 392
    const-string v0, "com.crashlytics.sdk.android.crashlytics-core"

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 504
    iget-boolean v0, p0, Lcom/a/a/c/g;->t:Z

    if-eqz v0, :cond_0

    .line 509
    :goto_0
    return-void

    .line 508
    :cond_0
    invoke-static {p1}, Lcom/a/a/c/g;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/c/g;->k:Ljava/lang/String;

    goto :goto_0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 546
    iget-boolean v0, p0, Lcom/a/a/c/g;->t:Z

    if-eqz v0, :cond_0

    .line 574
    :goto_0
    return-void

    .line 550
    :cond_0
    invoke-static {p1}, Lcom/a/a/c/g;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 561
    iget-object v0, p0, Lcom/a/a/c/g;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    const/16 v2, 0x40

    if-lt v0, v2, :cond_1

    iget-object v0, p0, Lcom/a/a/c/g;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 564
    :cond_1
    if-nez p2, :cond_2

    .line 565
    const-string v0, ""

    .line 569
    :goto_1
    iget-object v2, p0, Lcom/a/a/c/g;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 567
    :cond_2
    invoke-static {p2}, Lcom/a/a/c/g;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 571
    :cond_3
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    goto :goto_0
.end method

.method protected final c()Ljava/lang/Void;
    .locals 7

    .prologue
    const/4 v5, 0x0

    .line 340
    iget-object v0, p0, Lcom/a/a/c/g;->w:Lcom/a/a/c/r;

    new-instance v1, Lcom/a/a/c/i;

    invoke-direct {v1, p0}, Lcom/a/a/c/i;-><init>(Lcom/a/a/c/g;)V

    invoke-virtual {v0, v1}, Lcom/a/a/c/r;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 341
    iget-object v0, p0, Lcom/a/a/c/g;->j:Lcom/a/a/c/x;

    invoke-virtual {v0}, Lcom/a/a/c/x;->e()V

    .line 344
    const/4 v0, 0x1

    .line 347
    :try_start_0
    invoke-static {}, Lb/a/a/a/a/g/q;->a()Lb/a/a/a/a/g/q;

    move-result-object v1

    invoke-virtual {v1}, Lb/a/a/a/a/g/q;->b()Lb/a/a/a/a/g/t;

    move-result-object v1

    .line 349
    if-nez v1, :cond_0

    .line 350
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Received null settings, skipping initialization!"

    invoke-interface {v1, v2, v3}, Lb/a/a/a/o;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 351
    invoke-direct {p0}, Lcom/a/a/c/g;->A()V

    .line 387
    :goto_0
    return-object v5

    .line 354
    :cond_0
    :try_start_1
    iget-object v2, v1, Lb/a/a/a/a/g/t;->d:Lb/a/a/a/a/g/m;

    iget-boolean v2, v2, Lb/a/a/a/a/g/m;->c:Z

    if-eqz v2, :cond_1

    .line 355
    const/4 v0, 0x0

    .line 356
    iget-object v2, p0, Lcom/a/a/c/g;->j:Lcom/a/a/c/x;

    invoke-virtual {v2}, Lcom/a/a/c/x;->d()Z

    .line 358
    invoke-virtual {p0, v1}, Lcom/a/a/c/g;->a(Lb/a/a/a/a/g/t;)Lcom/a/a/c/an;

    move-result-object v1

    .line 359
    if-eqz v1, :cond_3

    .line 360
    new-instance v2, Lcom/a/a/c/aw;

    invoke-direct {v2, v1}, Lcom/a/a/c/aw;-><init>(Lcom/a/a/c/an;)V

    iget v1, p0, Lcom/a/a/c/g;->s:F

    invoke-virtual {v2, v1}, Lcom/a/a/c/aw;->a(F)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 369
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    .line 370
    :try_start_2
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 384
    :cond_2
    invoke-direct {p0}, Lcom/a/a/c/g;->A()V

    goto :goto_0

    .line 362
    :cond_3
    :try_start_3
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Unable to create a call to upload reports."

    invoke-interface {v1, v2, v3}, Lb/a/a/a/o;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 365
    :catch_0
    move-exception v1

    move-object v6, v1

    move v1, v0

    move-object v0, v6

    .line 366
    :try_start_4
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Error dealing with settings"

    invoke-interface {v2, v3, v4, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move v0, v1

    goto :goto_1

    .line 372
    :catch_1
    move-exception v0

    .line 373
    :try_start_5
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Problem encountered during Crashlytics initialization."

    invoke-interface {v1, v2, v3, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 384
    invoke-direct {p0}, Lcom/a/a/c/g;->A()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-direct {p0}, Lcom/a/a/c/g;->A()V

    throw v0
.end method

.method protected final synthetic e()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 59
    invoke-virtual {p0}, Lcom/a/a/c/g;->c()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method final g()Ljava/util/Map;
    .locals 1

    .prologue
    .line 733
    iget-object v0, p0, Lcom/a/a/c/g;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 741
    iget-object v0, p0, Lcom/a/a/c/g;->o:Ljava/lang/String;

    return-object v0
.end method

.method final i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 751
    iget-object v0, p0, Lcom/a/a/c/g;->p:Ljava/lang/String;

    return-object v0
.end method

.method final j()Ljava/lang/String;
    .locals 1

    .prologue
    .line 755
    iget-object v0, p0, Lcom/a/a/c/g;->r:Ljava/lang/String;

    return-object v0
.end method

.method final k()Ljava/lang/String;
    .locals 1

    .prologue
    .line 759
    iget-object v0, p0, Lcom/a/a/c/g;->q:Ljava/lang/String;

    return-object v0
.end method

.method final l()Lcom/a/a/c/x;
    .locals 1

    .prologue
    .line 771
    iget-object v0, p0, Lcom/a/a/c/g;->j:Lcom/a/a/c/x;

    return-object v0
.end method

.method final m()Ljava/lang/String;
    .locals 1

    .prologue
    .line 775
    invoke-virtual {p0}, Lcom/a/a/c/g;->u()Lb/a/a/a/a/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/a/b/t;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/c/g;->k:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final n()Ljava/lang/String;
    .locals 1

    .prologue
    .line 779
    invoke-virtual {p0}, Lcom/a/a/c/g;->u()Lb/a/a/a/a/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/a/b/t;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/c/g;->l:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final o()Ljava/lang/String;
    .locals 1

    .prologue
    .line 783
    invoke-virtual {p0}, Lcom/a/a/c/g;->u()Lb/a/a/a/a/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/a/b/t;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/c/g;->m:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final p()Lcom/a/a/c/a/a/d;
    .locals 2

    .prologue
    .line 849
    const/4 v0, 0x0

    .line 850
    iget-object v1, p0, Lcom/a/a/c/g;->x:Lcom/a/a/c/a/a;

    if-eqz v1, :cond_0

    .line 851
    iget-object v0, p0, Lcom/a/a/c/g;->x:Lcom/a/a/c/a/a;

    invoke-interface {v0}, Lcom/a/a/c/a/a;->a()Lcom/a/a/c/a/a/d;

    move-result-object v0

    .line 853
    :cond_0
    return-object v0
.end method

.method final q()Ljava/io/File;
    .locals 1

    .prologue
    .line 875
    new-instance v0, Lb/a/a/a/a/f/a;

    invoke-direct {v0, p0}, Lb/a/a/a/a/f/a;-><init>(Lb/a/a/a/l;)V

    invoke-virtual {v0}, Lb/a/a/a/a/f/a;->a()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method final r()Z
    .locals 3

    .prologue
    .line 879
    invoke-static {}, Lb/a/a/a/a/g/q;->a()Lb/a/a/a/a/g/q;

    move-result-object v0

    new-instance v1, Lcom/a/a/c/l;

    invoke-direct {v1, p0}, Lcom/a/a/c/l;-><init>(Lcom/a/a/c/g;)V

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lb/a/a/a/a/g/q;->a(Lb/a/a/a/a/g/q$b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

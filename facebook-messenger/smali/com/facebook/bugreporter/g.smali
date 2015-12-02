.class public Lcom/facebook/bugreporter/g;
.super Ljava/lang/Object;
.source "BugReporter.java"


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/res/Resources;

.field private final c:Lcom/google/common/d/a/u;

.field private final d:Ljava/util/concurrent/Executor;

.field private final e:Lcom/facebook/bugreporter/m;

.field private final f:Lcom/facebook/common/e/h;

.field private final g:Lcom/facebook/bugreporter/l;

.field private final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/bugreporter/c;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lcom/facebook/bugreporter/z;

.field private final j:Lcom/facebook/ui/i/g;

.field private final k:Landroid/net/ConnectivityManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 60
    const-class v0, Lcom/facebook/bugreporter/g;

    sput-object v0, Lcom/facebook/bugreporter/g;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;Lcom/google/common/d/a/u;Ljava/util/concurrent/Executor;Lcom/facebook/bugreporter/m;Lcom/facebook/common/e/h;Lcom/facebook/bugreporter/l;Ljava/util/Set;Lcom/facebook/bugreporter/z;Lcom/facebook/ui/i/g;Landroid/net/ConnectivityManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "Lcom/google/common/d/a/u;",
            "Ljava/util/concurrent/Executor;",
            "Lcom/facebook/bugreporter/m;",
            "Lcom/facebook/common/e/h;",
            "Lcom/facebook/bugreporter/l;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/bugreporter/c;",
            ">;",
            "Lcom/facebook/bugreporter/z;",
            "Lcom/facebook/ui/i/g;",
            "Landroid/net/ConnectivityManager;",
            ")V"
        }
    .end annotation

    .prologue
    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-object p1, p0, Lcom/facebook/bugreporter/g;->b:Landroid/content/res/Resources;

    .line 90
    iput-object p2, p0, Lcom/facebook/bugreporter/g;->c:Lcom/google/common/d/a/u;

    .line 91
    iput-object p3, p0, Lcom/facebook/bugreporter/g;->d:Ljava/util/concurrent/Executor;

    .line 92
    iput-object p4, p0, Lcom/facebook/bugreporter/g;->e:Lcom/facebook/bugreporter/m;

    .line 93
    iput-object p5, p0, Lcom/facebook/bugreporter/g;->f:Lcom/facebook/common/e/h;

    .line 94
    iput-object p6, p0, Lcom/facebook/bugreporter/g;->g:Lcom/facebook/bugreporter/l;

    .line 95
    iput-object p7, p0, Lcom/facebook/bugreporter/g;->h:Ljava/util/Set;

    .line 96
    iput-object p8, p0, Lcom/facebook/bugreporter/g;->i:Lcom/facebook/bugreporter/z;

    .line 97
    iput-object p9, p0, Lcom/facebook/bugreporter/g;->j:Lcom/facebook/ui/i/g;

    .line 98
    iput-object p10, p0, Lcom/facebook/bugreporter/g;->k:Landroid/net/ConnectivityManager;

    .line 99
    return-void
.end method

.method private a(Landroid/app/Activity;)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 228
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v2, 0x1020002

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 230
    :try_start_0
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v3

    sget-object v4, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 231
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 240
    :goto_0
    return-object v0

    .line 233
    :catch_0
    move-exception v0

    .line 234
    iget-object v2, p0, Lcom/facebook/bugreporter/g;->j:Lcom/facebook/ui/i/g;

    new-instance v3, Lcom/facebook/ui/i/a;

    const-string v4, "Insufficient memory to capture a screenshot. Sorry!"

    invoke-direct {v3, v4}, Lcom/facebook/ui/i/a;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v2, v3}, Lcom/facebook/ui/i/g;->a(Lcom/facebook/ui/i/a;)V

    .line 235
    iget-object v2, p0, Lcom/facebook/bugreporter/g;->f:Lcom/facebook/common/e/h;

    sget-object v3, Lcom/facebook/bugreporter/g;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Out of memory while creating screenshot"

    invoke-interface {v2, v3, v4, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 236
    goto :goto_0

    .line 237
    :catch_1
    move-exception v0

    .line 238
    iget-object v2, p0, Lcom/facebook/bugreporter/g;->j:Lcom/facebook/ui/i/g;

    new-instance v3, Lcom/facebook/ui/i/a;

    const-string v4, "Failed to capture a screenshot. Sorry!"

    invoke-direct {v3, v4}, Lcom/facebook/ui/i/a;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v2, v3}, Lcom/facebook/ui/i/g;->a(Lcom/facebook/ui/i/a;)V

    .line 239
    iget-object v2, p0, Lcom/facebook/bugreporter/g;->f:Lcom/facebook/common/e/h;

    sget-object v3, Lcom/facebook/bugreporter/g;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Exception while creating screenshot"

    invoke-interface {v2, v3, v4, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 240
    goto :goto_0
.end method

.method private a(Landroid/graphics/Bitmap;Ljava/io/File;)Landroid/net/Uri;
    .locals 4

    .prologue
    .line 374
    :try_start_0
    new-instance v0, Ljava/io/File;

    const-string v1, "screenshot.png"

    invoke-direct {v0, p2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 375
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 377
    :try_start_1
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x64

    invoke-virtual {p1, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 378
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V

    .line 379
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 381
    const/4 v2, 0x0

    :try_start_2
    invoke-static {v1, v2}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;Z)V

    .line 385
    :goto_0
    return-object v0

    .line 381
    :catchall_0
    move-exception v0

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;Z)V

    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 383
    :catch_0
    move-exception v0

    .line 384
    sget-object v1, Lcom/facebook/bugreporter/g;->a:Ljava/lang/Class;

    const-string v2, "Exception saving screenshot"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 385
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Ljava/io/File;)Landroid/net/Uri;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 397
    :try_start_0
    new-instance v0, Ljava/io/File;

    const-string v2, "report.txt"

    invoke-direct {v0, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 398
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 400
    :try_start_1
    invoke-static {}, Lorg/acra/ErrorReporter;->getInstance()Lorg/acra/ErrorReporter;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v2}, Lorg/acra/ErrorReporter;->writeReportToStream(Ljava/lang/Throwable;Ljava/io/OutputStream;)V

    .line 401
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V

    .line 402
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 404
    const/4 v3, 0x0

    :try_start_2
    invoke-static {v2, v3}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;Z)V

    .line 408
    :goto_0
    return-object v0

    .line 404
    :catchall_0
    move-exception v0

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;Z)V

    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 406
    :catch_0
    move-exception v0

    .line 407
    sget-object v2, Lcom/facebook/bugreporter/g;->a:Ljava/lang/Class;

    const-string v3, "Exception generating ACRA report"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 408
    goto :goto_0
.end method

.method private a(Landroid/graphics/Bitmap;Lcom/google/common/a/ev;Lcom/google/common/a/ev;)Lcom/facebook/bugreporter/BugReport;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/bugreporter/BugReport;"
        }
    .end annotation

    .prologue
    .line 259
    iget-object v0, p0, Lcom/facebook/bugreporter/g;->e:Lcom/facebook/bugreporter/m;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/m;->a()Ljava/io/File;

    move-result-object v2

    .line 260
    if-nez v2, :cond_0

    .line 261
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Could not create directory"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 263
    :cond_0
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    .line 266
    if-nez p1, :cond_1

    const/4 v0, 0x0

    move-object v1, v0

    .line 267
    :goto_0
    invoke-direct {p0, v2}, Lcom/facebook/bugreporter/g;->a(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v4

    .line 269
    iget-object v0, p0, Lcom/facebook/bugreporter/g;->k:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v5

    .line 271
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v6

    .line 272
    invoke-virtual {v6, p2}, Lcom/google/common/a/ew;->b(Ljava/util/Map;)Lcom/google/common/a/ew;

    .line 273
    iget-object v0, p0, Lcom/facebook/bugreporter/g;->h:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/c;

    .line 274
    invoke-interface {v0}, Lcom/facebook/bugreporter/c;->b()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/google/common/a/ew;->b(Ljava/util/Map;)Lcom/google/common/a/ew;

    goto :goto_1

    .line 266
    :cond_1
    invoke-direct {p0, p1, v2}, Lcom/facebook/bugreporter/g;->a(Landroid/graphics/Bitmap;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 277
    :cond_2
    invoke-virtual {v6}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    .line 279
    invoke-static {}, Lcom/facebook/bugreporter/BugReport;->newBuilder()Lcom/facebook/bugreporter/b;

    move-result-object v6

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/facebook/bugreporter/b;->a(Landroid/net/Uri;)Lcom/facebook/bugreporter/b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/facebook/bugreporter/b;->c(Landroid/net/Uri;)Lcom/facebook/bugreporter/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/bugreporter/b;->a(Lcom/google/common/a/ev;)Lcom/facebook/bugreporter/b;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/facebook/bugreporter/b;->b(Lcom/google/common/a/ev;)Lcom/facebook/bugreporter/b;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/facebook/bugreporter/b;->b(Landroid/net/Uri;)Lcom/facebook/bugreporter/b;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/bugreporter/b;->b(Ljava/lang/String;)Lcom/facebook/bugreporter/b;

    move-result-object v0

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/bugreporter/b;->h(Ljava/lang/String;)Lcom/facebook/bugreporter/b;

    move-result-object v0

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/bugreporter/b;->i(Ljava/lang/String;)Lcom/facebook/bugreporter/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/bugreporter/b;->o()Lcom/facebook/bugreporter/BugReport;

    move-result-object v0

    .line 289
    return-object v0
.end method

.method static synthetic a(Lcom/facebook/bugreporter/g;Landroid/graphics/Bitmap;Lcom/google/common/a/ev;Lcom/google/common/a/ev;)Lcom/facebook/bugreporter/BugReport;
    .locals 1

    .prologue
    .line 58
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/bugreporter/g;->a(Landroid/graphics/Bitmap;Lcom/google/common/a/ev;Lcom/google/common/a/ev;)Lcom/facebook/bugreporter/BugReport;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/content/Context;ILjava/util/concurrent/Callable;)Lcom/google/common/d/a/s;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/content/Context;",
            "I",
            "Ljava/util/concurrent/Callable",
            "<TT;>;)",
            "Lcom/google/common/d/a/s",
            "<TT;>;"
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 306
    const/4 v0, 0x0

    .line 309
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 310
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    .line 311
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 312
    if-eqz v1, :cond_0

    .line 313
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 319
    :cond_0
    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Strings;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 320
    sget v0, Lcom/facebook/o;->bug_report_title:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 323
    :cond_1
    iget-object v1, p0, Lcom/facebook/bugreporter/g;->b:Landroid/content/res/Resources;

    invoke-virtual {v1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 326
    new-instance v2, Landroid/app/ProgressDialog;

    invoke-direct {v2, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 327
    invoke-virtual {v2, v0}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 328
    invoke-virtual {v2, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 329
    invoke-virtual {v2, v5}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 330
    instance-of v0, p1, Landroid/app/Activity;

    if-nez v0, :cond_2

    .line 331
    invoke-virtual {v2}, Landroid/app/ProgressDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x7d2

    invoke-virtual {v0, v1}, Landroid/view/Window;->setType(I)V

    .line 333
    :cond_2
    invoke-virtual {v2}, Landroid/app/ProgressDialog;->show()V

    .line 334
    iget-object v0, p0, Lcom/facebook/bugreporter/g;->c:Lcom/google/common/d/a/u;

    invoke-interface {v0, p3}, Lcom/google/common/d/a/u;->c(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 337
    new-instance v1, Lcom/facebook/bugreporter/j;

    invoke-direct {v1, p0, v2}, Lcom/facebook/bugreporter/j;-><init>(Lcom/facebook/bugreporter/g;Landroid/app/ProgressDialog;)V

    .line 348
    iget-object v3, p0, Lcom/facebook/bugreporter/g;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v3}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    .line 351
    invoke-virtual {v2, v5}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 352
    invoke-virtual {v2, v4}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 353
    new-instance v1, Lcom/facebook/bugreporter/k;

    invoke-direct {v1, p0, v0}, Lcom/facebook/bugreporter/k;-><init>(Lcom/facebook/bugreporter/g;Lcom/google/common/d/a/s;)V

    invoke-virtual {v2, v1}, Landroid/app/ProgressDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 362
    return-object v0

    .line 315
    :catch_0
    move-exception v1

    .line 316
    sget-object v2, Lcom/facebook/bugreporter/g;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a()Ljava/lang/String;
    .locals 6

    .prologue
    .line 419
    iget-object v0, p0, Lcom/facebook/bugreporter/g;->i:Lcom/facebook/bugreporter/z;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/z;->a()Ljava/util/List;

    move-result-object v0

    .line 420
    new-instance v1, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v2, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v1, v2}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 422
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/aa;

    .line 423
    new-instance v3, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v4, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 424
    const-string v4, "Package"

    iget-object v5, v0, Lcom/facebook/bugreporter/aa;->a:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 425
    const-string v4, "Git_Hash"

    iget-object v5, v0, Lcom/facebook/bugreporter/aa;->c:Lcom/facebook/common/l/a;

    iget-object v5, v5, Lcom/facebook/common/l/a;->a:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 426
    const-string v4, "Git_Branch"

    iget-object v5, v0, Lcom/facebook/bugreporter/aa;->c:Lcom/facebook/common/l/a;

    iget-object v5, v5, Lcom/facebook/common/l/a;->b:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 427
    const-string v4, "Build_Time"

    iget-object v5, v0, Lcom/facebook/bugreporter/aa;->c:Lcom/facebook/common/l/a;

    iget-object v5, v5, Lcom/facebook/common/l/a;->d:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 428
    const-string v4, "Build_Num"

    iget v0, v0, Lcom/facebook/bugreporter/aa;->b:I

    invoke-virtual {v3, v4, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 429
    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_0

    .line 432
    :cond_0
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/content/Context;Lcom/facebook/bugreporter/BugReport;)V
    .locals 3

    .prologue
    .line 197
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/facebook/bugreporter/activity/BugReportActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 199
    const-string v1, "report"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 200
    const-string v1, "reporter_config"

    iget-object v2, p0, Lcom/facebook/bugreporter/g;->g:Lcom/facebook/bugreporter/l;

    invoke-static {v2}, Lcom/facebook/bugreporter/ConstBugReporterConfig;->a(Lcom/facebook/bugreporter/l;)Lcom/facebook/bugreporter/ConstBugReporterConfig;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 204
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 205
    return-void
.end method

.method static synthetic a(Lcom/facebook/bugreporter/g;Landroid/content/Context;Lcom/facebook/bugreporter/BugReport;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0, p1, p2}, Lcom/facebook/bugreporter/g;->a(Landroid/content/Context;Lcom/facebook/bugreporter/BugReport;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/bugreporter/g;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/g;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method private a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 213
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    .line 219
    :goto_0
    return-void

    .line 217
    :cond_0
    const-string v0, "Failed to create bug report"

    invoke-static {v0, p1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 108
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/bugreporter/g;->a(Landroid/content/Context;Ljava/util/Map;)V

    .line 109
    return-void
.end method

.method public a(Landroid/content/Context;Ljava/util/Map;)V
    .locals 5
    .param p2    # Ljava/util/Map;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 122
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v1

    .line 123
    instance-of v0, p1, Lcom/facebook/bugreporter/activity/b;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 124
    check-cast v0, Lcom/facebook/bugreporter/activity/b;

    invoke-interface {v0}, Lcom/facebook/bugreporter/activity/b;->a()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/ew;->b(Ljava/util/Map;)Lcom/google/common/a/ew;

    .line 126
    :cond_0
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_1

    move-object v0, p1

    .line 127
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 128
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 129
    const-string v2, "intent_extras"

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 134
    :cond_1
    const-string v0, "all_fb_apks"

    invoke-direct {p0}, Lcom/facebook/bugreporter/g;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 136
    iget-object v0, p0, Lcom/facebook/bugreporter/g;->h:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/c;

    .line 137
    invoke-interface {v0}, Lcom/facebook/bugreporter/c;->a()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/ew;->b(Ljava/util/Map;)Lcom/google/common/a/ew;

    goto :goto_0

    .line 140
    :cond_2
    invoke-virtual {v1}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v1

    .line 143
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v2

    .line 144
    if-eqz p2, :cond_3

    .line 145
    invoke-virtual {v2, p2}, Lcom/google/common/a/ew;->b(Ljava/util/Map;)Lcom/google/common/a/ew;

    .line 147
    :cond_3
    instance-of v0, p1, Lcom/facebook/bugreporter/activity/a;

    if-eqz v0, :cond_4

    move-object v0, p1

    .line 148
    check-cast v0, Lcom/facebook/bugreporter/activity/a;

    invoke-interface {v0}, Lcom/facebook/bugreporter/activity/a;->a()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/ew;->b(Ljava/util/Map;)Lcom/google/common/a/ew;

    .line 150
    :cond_4
    invoke-virtual {v2}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v2

    .line 152
    const/4 v0, 0x0

    .line 153
    instance-of v3, p1, Landroid/app/Activity;

    if-eqz v3, :cond_5

    move-object v0, p1

    .line 156
    check-cast v0, Landroid/app/Activity;

    invoke-direct {p0, v0}, Lcom/facebook/bugreporter/g;->a(Landroid/app/Activity;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 163
    :cond_5
    sget v3, Lcom/facebook/o;->bug_report_progress:I

    new-instance v4, Lcom/facebook/bugreporter/h;

    invoke-direct {v4, p0, v0, v1, v2}, Lcom/facebook/bugreporter/h;-><init>(Lcom/facebook/bugreporter/g;Landroid/graphics/Bitmap;Lcom/google/common/a/ev;Lcom/google/common/a/ev;)V

    invoke-direct {p0, p1, v3, v4}, Lcom/facebook/bugreporter/g;->a(Landroid/content/Context;ILjava/util/concurrent/Callable;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 175
    new-instance v1, Lcom/facebook/bugreporter/i;

    invoke-direct {v1, p0, p1}, Lcom/facebook/bugreporter/i;-><init>(Lcom/facebook/bugreporter/g;Landroid/content/Context;)V

    .line 186
    iget-object v2, p0, Lcom/facebook/bugreporter/g;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    .line 187
    return-void
.end method

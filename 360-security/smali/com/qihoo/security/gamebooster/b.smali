.class public Lcom/qihoo/security/gamebooster/b;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/gamebooster/b$b;,
        Lcom/qihoo/security/gamebooster/b$a;
    }
.end annotation


# instance fields
.field a:Lcom/qihoo/security/service/a;

.field private b:Landroid/content/Context;

.field private c:Landroid/content/pm/PackageManager;

.field private d:Lcom/qihoo/security/gamebooster/g;

.field private e:Landroid/os/Handler;

.field private f:Landroid/os/Handler;

.field private g:J

.field private h:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/qihoo/security/receiver/a;

.field private final j:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private k:Ljava/lang/String;

.field private final l:Lcom/qihoo/security/receiver/a$b;

.field private final m:Lcom/qihoo/security/service/c$a;

.field private final n:Landroid/content/ServiceConnection;


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/b;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 709
    new-instance v0, Lcom/qihoo/security/gamebooster/b$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/gamebooster/b$3;-><init>(Lcom/qihoo/security/gamebooster/b;)V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/b;->l:Lcom/qihoo/security/receiver/a$b;

    .line 1057
    new-instance v0, Lcom/qihoo/security/gamebooster/b$4;

    invoke-direct {v0, p0}, Lcom/qihoo/security/gamebooster/b$4;-><init>(Lcom/qihoo/security/gamebooster/b;)V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/b;->m:Lcom/qihoo/security/service/c$a;

    .line 1066
    new-instance v0, Lcom/qihoo/security/gamebooster/b$5;

    invoke-direct {v0, p0}, Lcom/qihoo/security/gamebooster/b$5;-><init>(Lcom/qihoo/security/gamebooster/b;)V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/b;->n:Landroid/content/ServiceConnection;

    .line 109
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    .line 110
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/b;->c:Landroid/content/pm/PackageManager;

    .line 111
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/b;->f:Landroid/os/Handler;

    .line 112
    new-instance v0, Landroid/os/HandlerThread;

    const-string/jumbo v1, "game-booster"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 113
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 114
    new-instance v1, Lcom/qihoo/security/gamebooster/b$1;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/gamebooster/b$1;-><init>(Lcom/qihoo/security/gamebooster/b;Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    .line 336
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 337
    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/gamebooster/b$1;)V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;-><init>()V

    return-void
.end method

.method private a(Ljava/util/List;I)Landroid/graphics/Bitmap;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;I)",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 926
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 927
    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 928
    const v1, 0x7f02008f

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 929
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const/high16 v5, 0x42400000    # 48.0f

    invoke-static {v1, v5}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;F)I

    move-result v5

    .line 930
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const/high16 v6, 0x41800000    # 16.0f

    invoke-static {v1, v6}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;F)I

    move-result v6

    .line 931
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const/high16 v7, 0x40000000    # 2.0f

    invoke-static {v1, v7}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;F)I

    move-result v7

    .line 932
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const/high16 v8, 0x40e00000    # 7.0f

    invoke-static {v1, v8}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;F)I

    move-result v1

    .line 933
    invoke-virtual {v3, v0, v0, v5, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 934
    invoke-virtual {v4, v0, v0, v5, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 935
    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v5, v5, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 936
    new-instance v9, Landroid/graphics/Canvas;

    invoke-direct {v9, v8}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 937
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x4

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 943
    invoke-virtual {v3, v9}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 944
    if-nez v10, :cond_1

    .line 946
    const v1, 0x7f02008c

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 947
    invoke-virtual {v1, v0, v0, v5, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 948
    invoke-virtual {v1, v9}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 973
    :cond_0
    invoke-virtual {v4, v9}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 974
    return-object v8

    :cond_1
    move v3, v0

    .line 950
    :goto_0
    if-ge v3, v10, :cond_0

    .line 951
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 952
    invoke-static {}, Lcom/qihoo/utils/a/a;->a()Lcom/qihoo/utils/a/a;

    move-result-object v2

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/qihoo/utils/a/a;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 953
    if-nez v5, :cond_2

    .line 950
    :goto_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 956
    :cond_2
    if-eqz v3, :cond_3

    const/4 v0, 0x1

    if-ne v3, v0, :cond_5

    :cond_3
    move v2, v1

    .line 961
    :goto_2
    if-eqz v3, :cond_4

    const/4 v0, 0x2

    if-ne v3, v0, :cond_6

    :cond_4
    move v0, v1

    .line 967
    :goto_3
    add-int v11, v0, v6

    .line 968
    add-int v12, v2, v6

    .line 969
    invoke-virtual {v5, v0, v2, v11, v12}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 970
    invoke-virtual {v5, v9}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_1

    .line 959
    :cond_5
    add-int v0, v1, v7

    add-int/2addr v0, v6

    move v2, v0

    goto :goto_2

    .line 965
    :cond_6
    add-int v0, v1, v7

    add-int/2addr v0, v6

    goto :goto_3
.end method

.method public static a(Ljava/util/List;Ljava/lang/String;)Lcom/qihoo/security/gamebooster/LocalGamePkg;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 381
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 393
    :goto_0
    return-object v0

    .line 385
    :cond_0
    if-nez p0, :cond_1

    move-object v0, v1

    .line 386
    goto :goto_0

    .line 388
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 389
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_3
    move-object v0, v1

    .line 393
    goto :goto_0
.end method

.method public static a()Lcom/qihoo/security/gamebooster/b;
    .locals 1

    .prologue
    .line 340
    sget-object v0, Lcom/qihoo/security/gamebooster/b$a;->a:Lcom/qihoo/security/gamebooster/b;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->d:Lcom/qihoo/security/gamebooster/g;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/b;Lcom/qihoo/security/gamebooster/g;)Lcom/qihoo/security/gamebooster/g;
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/b;->d:Lcom/qihoo/security/gamebooster/g;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/b;Ljava/util/Set;)Ljava/util/List;
    .locals 1

    .prologue
    .line 65
    invoke-direct {p0, p1}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/Set;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/util/Set;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;"
        }
    .end annotation

    .prologue
    .line 470
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 471
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/a/a/a/c;->e(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/appclear/IClearApp;

    move-result-object v1

    .line 472
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 478
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 483
    invoke-interface {v1, v0}, Lcom/qihoo360/mobilesafe/opti/i/appclear/IClearApp;->getAppInfo(Ljava/lang/String;)Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;

    move-result-object v6

    .line 484
    if-eqz v6, :cond_0

    .line 487
    iget v6, v6, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->appType:I

    const/4 v7, 0x1

    if-ne v6, v7, :cond_0

    .line 488
    new-instance v6, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    sget-object v7, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->CleanRecmd:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    invoke-direct {v6, v0, v7, v2, v3}, Lcom/qihoo/security/gamebooster/LocalGamePkg;-><init>(Ljava/lang/String;Lcom/qihoo/security/gamebooster/LocalGamePkg$State;J)V

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 498
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v2

    .line 502
    return-object v4
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/b;Lcom/qihoo/security/gamebooster/h;Lcom/qihoo/security/gamebooster/g;)V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/h;Lcom/qihoo/security/gamebooster/g;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/b;Z)V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0, p1}, Lcom/qihoo/security/gamebooster/b;->a(Z)V

    return-void
.end method

.method private a(Lcom/qihoo/security/gamebooster/h;Lcom/qihoo/security/gamebooster/g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/gamebooster/h",
            "<",
            "Lcom/qihoo/security/gamebooster/g;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/qihoo/security/gamebooster/g;",
            ")V"
        }
    .end annotation

    .prologue
    .line 700
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->f:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/gamebooster/b$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/qihoo/security/gamebooster/b$2;-><init>(Lcom/qihoo/security/gamebooster/b;Lcom/qihoo/security/gamebooster/h;Lcom/qihoo/security/gamebooster/g;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 707
    return-void
.end method

.method private a(Ljava/util/List;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 459
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 460
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 461
    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v3

    invoke-static {p2, v3}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/List;Ljava/lang/String;)Lcom/qihoo/security/gamebooster/LocalGamePkg;

    move-result-object v3

    .line 462
    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/qihoo360/mobilesafe/b/o;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 463
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 466
    :cond_1
    invoke-interface {p2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 467
    return-void
.end method

.method private static a(Ljava/util/List;Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 506
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 515
    :cond_0
    return-void

    .line 509
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 510
    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v0

    .line 511
    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 512
    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method private a(Z)V
    .locals 4

    .prologue
    .line 400
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->m()Lcom/qihoo/security/gamebooster/g;

    move-result-object v0

    .line 401
    if-nez v0, :cond_0

    .line 402
    invoke-static {}, Lcom/qihoo/security/gamebooster/g;->d()Lcom/qihoo/security/gamebooster/g;

    move-result-object v0

    .line 404
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->l()Ljava/util/Set;

    move-result-object v1

    .line 408
    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v2

    .line 409
    invoke-static {v2, v1}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/List;Ljava/util/Set;)V

    .line 413
    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->a()Ljava/util/List;

    move-result-object v2

    .line 414
    invoke-static {v2, v1}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/List;Ljava/util/Set;)V

    .line 419
    if-eqz p1, :cond_3

    .line 420
    invoke-direct {p0, v1}, Lcom/qihoo/security/gamebooster/b;->b(Ljava/util/Set;)Ljava/util/List;

    move-result-object v1

    .line 421
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-string/jumbo v3, "b_g.dat"

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/b/s;->e(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v2

    .line 422
    invoke-virtual {v0, v2, v3}, Lcom/qihoo/security/gamebooster/g;->a(J)V

    move-object v0, v1

    .line 427
    :goto_0
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->m()Lcom/qihoo/security/gamebooster/g;

    move-result-object v1

    .line 428
    if-nez v1, :cond_1

    .line 429
    invoke-static {}, Lcom/qihoo/security/gamebooster/g;->d()Lcom/qihoo/security/gamebooster/g;

    move-result-object v1

    .line 431
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_2

    .line 432
    invoke-virtual {v1}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v2

    .line 433
    invoke-direct {p0, v0, v2}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/List;Ljava/util/List;)V

    .line 434
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v2, "com.qihoo.security.gamebooster.LocalGamePackageUpdate"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 435
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    invoke-virtual {v2, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 438
    :cond_2
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v0, v2, :cond_4

    .line 439
    iput-object v1, p0, Lcom/qihoo/security/gamebooster/b;->d:Lcom/qihoo/security/gamebooster/g;

    .line 440
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->d:Lcom/qihoo/security/gamebooster/g;

    invoke-direct {p0, v0}, Lcom/qihoo/security/gamebooster/b;->b(Lcom/qihoo/security/gamebooster/g;)V

    .line 441
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.security.gamebooster.LocalGamePackageUpdate"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 442
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 450
    :goto_1
    return-void

    .line 425
    :cond_3
    invoke-direct {p0, v1}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/Set;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 448
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    const/4 v3, 0x4

    invoke-virtual {v2, v3, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_1
.end method

.method static synthetic b(Lcom/qihoo/security/gamebooster/b;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    return-object v0
.end method

.method private b(Ljava/util/Set;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 521
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 526
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 528
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-string/jumbo v2, "b_g.dat"

    invoke-static {v0, v2}, Lcom/qihoo360/mobilesafe/b/s;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 529
    if-eqz v4, :cond_11

    .line 530
    :try_start_1
    sget-object v0, Lcom/qihoo360/mobilesafe/support/NativeManager;->a:Ljava/lang/String;

    invoke-static {v4, v0}, Lcom/qihoo360/mobilesafe/b/s;->a(Ljava/io/InputStream;Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_16
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_12
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v3

    .line 531
    if-eqz v3, :cond_10

    .line 532
    :try_start_2
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_17
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_13
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 533
    :try_start_3
    new-instance v0, Lcom/qihoo/security/json/a;

    invoke-direct {v0, v2}, Lcom/qihoo/security/json/a;-><init>(Ljava/io/Reader;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_18
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_14
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 534
    :try_start_4
    invoke-virtual {v0}, Lcom/qihoo/security/json/a;->a()V

    .line 535
    :cond_0
    invoke-virtual {v0}, Lcom/qihoo/security/json/a;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 536
    invoke-virtual {v0}, Lcom/qihoo/security/json/a;->e()Ljava/lang/String;

    move-result-object v1

    .line 537
    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 538
    new-instance v8, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    sget-object v9, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->V5Recmd:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    invoke-direct {v8, v1, v9, v6, v7}, Lcom/qihoo/security/gamebooster/LocalGamePkg;-><init>(Ljava/lang/String;Lcom/qihoo/security/gamebooster/LocalGamePkg$State;J)V

    .line 539
    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 540
    invoke-interface {p1, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 541
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v1

    if-nez v1, :cond_0

    .line 546
    :cond_1
    invoke-virtual {v0}, Lcom/qihoo/security/json/a;->b()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_19
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_15
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    move-object v1, v0

    .line 562
    :goto_0
    if-eqz v1, :cond_2

    .line 564
    :try_start_5
    invoke-virtual {v1}, Lcom/qihoo/security/json/a;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 568
    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    .line 570
    :try_start_6
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 574
    :cond_3
    :goto_2
    if-eqz v3, :cond_4

    .line 576
    :try_start_7
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 580
    :cond_4
    :goto_3
    if-eqz v4, :cond_5

    .line 582
    :try_start_8
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 591
    :cond_5
    :goto_4
    return-object v5

    .line 553
    :catch_0
    move-exception v0

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    .line 562
    :goto_5
    if-eqz v0, :cond_6

    .line 564
    :try_start_9
    invoke-virtual {v0}, Lcom/qihoo/security/json/a;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 568
    :cond_6
    :goto_6
    if-eqz v1, :cond_7

    .line 570
    :try_start_a
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    .line 574
    :cond_7
    :goto_7
    if-eqz v2, :cond_8

    .line 576
    :try_start_b
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_a

    .line 580
    :cond_8
    :goto_8
    if-eqz v3, :cond_5

    .line 582
    :try_start_c
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_1

    goto :goto_4

    .line 583
    :catch_1
    move-exception v0

    goto :goto_4

    .line 557
    :catch_2
    move-exception v0

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    .line 562
    :goto_9
    if-eqz v0, :cond_9

    .line 564
    :try_start_d
    invoke-virtual {v0}, Lcom/qihoo/security/json/a;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_b

    .line 568
    :cond_9
    :goto_a
    if-eqz v2, :cond_a

    .line 570
    :try_start_e
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_c

    .line 574
    :cond_a
    :goto_b
    if-eqz v3, :cond_b

    .line 576
    :try_start_f
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_d

    .line 580
    :cond_b
    :goto_c
    if-eqz v4, :cond_5

    .line 582
    :try_start_10
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_3

    goto :goto_4

    .line 583
    :catch_3
    move-exception v0

    goto :goto_4

    .line 562
    :catchall_0
    move-exception v0

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    :goto_d
    if-eqz v1, :cond_c

    .line 564
    :try_start_11
    invoke-virtual {v1}, Lcom/qihoo/security/json/a;->close()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_e

    .line 568
    :cond_c
    :goto_e
    if-eqz v2, :cond_d

    .line 570
    :try_start_12
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_f

    .line 574
    :cond_d
    :goto_f
    if-eqz v3, :cond_e

    .line 576
    :try_start_13
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_10

    .line 580
    :cond_e
    :goto_10
    if-eqz v4, :cond_f

    .line 582
    :try_start_14
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_11

    .line 584
    :cond_f
    :goto_11
    throw v0

    .line 565
    :catch_4
    move-exception v0

    goto :goto_1

    .line 571
    :catch_5
    move-exception v0

    goto :goto_2

    .line 577
    :catch_6
    move-exception v0

    goto :goto_3

    .line 583
    :catch_7
    move-exception v0

    goto :goto_4

    .line 565
    :catch_8
    move-exception v0

    goto :goto_6

    .line 571
    :catch_9
    move-exception v0

    goto :goto_7

    .line 577
    :catch_a
    move-exception v0

    goto :goto_8

    .line 565
    :catch_b
    move-exception v0

    goto :goto_a

    .line 571
    :catch_c
    move-exception v0

    goto :goto_b

    .line 577
    :catch_d
    move-exception v0

    goto :goto_c

    .line 565
    :catch_e
    move-exception v1

    goto :goto_e

    .line 571
    :catch_f
    move-exception v1

    goto :goto_f

    .line 577
    :catch_10
    move-exception v1

    goto :goto_10

    .line 583
    :catch_11
    move-exception v1

    goto :goto_11

    .line 562
    :catchall_1
    move-exception v0

    move-object v2, v1

    move-object v3, v1

    goto :goto_d

    :catchall_2
    move-exception v0

    move-object v2, v1

    goto :goto_d

    :catchall_3
    move-exception v0

    goto :goto_d

    :catchall_4
    move-exception v1

    move-object v10, v1

    move-object v1, v0

    move-object v0, v10

    goto :goto_d

    .line 557
    :catch_12
    move-exception v0

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    goto :goto_9

    :catch_13
    move-exception v0

    move-object v0, v1

    move-object v2, v1

    goto :goto_9

    :catch_14
    move-exception v0

    move-object v0, v1

    goto :goto_9

    :catch_15
    move-exception v1

    goto :goto_9

    .line 553
    :catch_16
    move-exception v0

    move-object v0, v1

    move-object v2, v1

    move-object v3, v4

    goto/16 :goto_5

    :catch_17
    move-exception v0

    move-object v0, v1

    move-object v2, v3

    move-object v3, v4

    goto/16 :goto_5

    :catch_18
    move-exception v0

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    goto/16 :goto_5

    :catch_19
    move-exception v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    goto/16 :goto_5

    :cond_10
    move-object v2, v1

    goto/16 :goto_0

    :cond_11
    move-object v2, v1

    move-object v3, v1

    goto/16 :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/gamebooster/b;Lcom/qihoo/security/gamebooster/g;)V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0, p1}, Lcom/qihoo/security/gamebooster/b;->b(Lcom/qihoo/security/gamebooster/g;)V

    return-void
.end method

.method private b(Lcom/qihoo/security/gamebooster/g;)V
    .locals 4

    .prologue
    .line 631
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/g;->a(Lcom/qihoo/security/gamebooster/g;)Ljava/lang/String;

    move-result-object v0

    .line 632
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-string/jumbo v2, "sp_key_local_game_package"

    invoke-static {v1, v2, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 633
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 634
    iput-wide v0, p0, Lcom/qihoo/security/gamebooster/b;->g:J

    .line 635
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-string/jumbo v3, "sp_key_local_game_package_time"

    invoke-static {v2, v3, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 640
    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/gamebooster/b;)V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->o()V

    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/gamebooster/g;
    .locals 1

    .prologue
    .line 65
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->m()Lcom/qihoo/security/gamebooster/g;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 595
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-string/jumbo v1, "sp_key_has_create_game_booster_shortcut"

    invoke-static {v0, v1, p1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 596
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-string/jumbo v1, "sp_key_create_game_booster_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 597
    return-void
.end method

.method static synthetic e(Lcom/qihoo/security/gamebooster/b;)V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->p()V

    return-void
.end method

.method private e(Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 600
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->k:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 601
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/b;->k:Ljava/lang/String;

    .line 608
    :cond_0
    :goto_0
    return v0

    .line 604
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->k:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 607
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/b;->k:Ljava/lang/String;

    .line 608
    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic f(Lcom/qihoo/security/gamebooster/b;)V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->n()V

    return-void
.end method

.method static synthetic g(Lcom/qihoo/security/gamebooster/b;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    return-object v0
.end method

.method public static h()Ljava/lang/String;
    .locals 6

    .prologue
    .line 1038
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v2

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-int v0, v0

    .line 1040
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic h(Lcom/qihoo/security/gamebooster/b;)V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->q()V

    return-void
.end method

.method static synthetic i(Lcom/qihoo/security/gamebooster/b;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic j(Lcom/qihoo/security/gamebooster/b;)Ljava/util/Hashtable;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->h:Ljava/util/Hashtable;

    return-object v0
.end method

.method static synthetic k(Lcom/qihoo/security/gamebooster/b;)Lcom/qihoo/security/service/c$a;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->m:Lcom/qihoo/security/service/c$a;

    return-object v0
.end method

.method private k()Z
    .locals 4

    .prologue
    .line 352
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-string/jumbo v1, "sp_key_local_game_package_time"

    const-wide/16 v2, -0x1

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    .line 353
    iget-wide v2, p0, Lcom/qihoo/security/gamebooster/b;->g:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 354
    const/4 v0, 0x1

    .line 356
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private l()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 368
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "android.intent.action.MAIN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 369
    const-string/jumbo v1, "android.intent.category.LAUNCHER"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 370
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->c:Landroid/content/pm/PackageManager;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 371
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 372
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 373
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 374
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 376
    :cond_0
    return-object v1
.end method

.method static synthetic l(Lcom/qihoo/security/gamebooster/b;)V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->s()V

    return-void
.end method

.method private m()Lcom/qihoo/security/gamebooster/g;
    .locals 6

    .prologue
    .line 643
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-string/jumbo v1, "sp_key_local_game_package"

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 644
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 645
    const/4 v0, 0x0

    .line 654
    :goto_0
    return-object v0

    .line 647
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-string/jumbo v2, "sp_key_local_game_package_time"

    const-wide/16 v4, -0x1

    invoke-static {v1, v2, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/qihoo/security/gamebooster/b;->g:J

    .line 653
    invoke-static {v0}, Lcom/qihoo/security/gamebooster/g;->a(Ljava/lang/String;)Lcom/qihoo/security/gamebooster/g;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/b;->d:Lcom/qihoo/security/gamebooster/g;

    .line 654
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->d:Lcom/qihoo/security/gamebooster/g;

    goto :goto_0
.end method

.method private n()V
    .locals 4

    .prologue
    .line 659
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->d:Lcom/qihoo/security/gamebooster/g;

    if-nez v0, :cond_1

    .line 673
    :cond_0
    :goto_0
    return-void

    .line 662
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->d:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->b()J

    move-result-wide v0

    .line 663
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-string/jumbo v3, "b_g.dat"

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/b/s;->e(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v2

    .line 667
    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 671
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/gamebooster/b;->a(Z)V

    goto :goto_0
.end method

.method private o()V
    .locals 4

    .prologue
    .line 676
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-string/jumbo v1, "sp_key_local_game_package_time"

    const-wide/16 v2, -0x1

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    .line 677
    iget-wide v2, p0, Lcom/qihoo/security/gamebooster/b;->g:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 681
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->m()Lcom/qihoo/security/gamebooster/g;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/b;->d:Lcom/qihoo/security/gamebooster/g;

    .line 685
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->d:Lcom/qihoo/security/gamebooster/g;

    if-nez v0, :cond_1

    .line 686
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->p()V

    .line 688
    :cond_1
    return-void
.end method

.method private p()V
    .locals 1

    .prologue
    .line 694
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/gamebooster/b;->a(Z)V

    .line 695
    return-void
.end method

.method private q()V
    .locals 5

    .prologue
    const v4, 0x7f0c0082

    .line 875
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->m()Lcom/qihoo/security/gamebooster/g;

    move-result-object v0

    .line 876
    if-nez v0, :cond_1

    .line 887
    :cond_0
    :goto_0
    return-void

    .line 879
    :cond_1
    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v0

    .line 880
    if-eqz v0, :cond_0

    .line 883
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-static {v1, v2, v4}, Lcom/qihoo360/mobilesafe/b/m;->a(Landroid/content/Context;Ljava/lang/Class;I)V

    .line 884
    const v1, 0x7f02008e

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/List;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 885
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    const/4 v3, 0x0

    invoke-static {v1, v2, v3, v4, v0}, Lcom/qihoo360/mobilesafe/b/m;->a(Landroid/content/Context;Ljava/lang/Class;IILandroid/graphics/Bitmap;)V

    .line 886
    const-string/jumbo v0, "1.0.8.3742"

    invoke-direct {p0, v0}, Lcom/qihoo/security/gamebooster/b;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private r()V
    .locals 2

    .prologue
    .line 999
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.security.lite.gamebooster.CreateGameShortActivity"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1000
    const/high16 v1, 0x50040000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1002
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1004
    return-void
.end method

.method private s()V
    .locals 2

    .prologue
    .line 1111
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1112
    return-void
.end method


# virtual methods
.method protected a(Lcom/qihoo/security/gamebooster/b$b;)V
    .locals 10

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 745
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/qihoo/security/gamebooster/b$b;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 861
    :cond_0
    :goto_0
    return-void

    .line 753
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 754
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->o()V

    .line 755
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long v4, v6, v4

    .line 759
    const-wide/16 v6, 0xbb8

    cmp-long v0, v4, v6

    if-gtz v0, :cond_0

    .line 762
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/b;->f()Z

    move-result v3

    .line 763
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-string/jumbo v4, "sp_key_last_recommend_create_shortcut_time"

    const-wide/16 v6, 0x0

    invoke-static {v0, v4, v6, v7}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v4

    .line 764
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-string/jumbo v6, "sp_key_last_recommend_create_shortcut_times"

    invoke-static {v0, v6, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 765
    int-to-long v6, v0

    const-wide/16 v8, 0x3

    cmp-long v0, v6, v8

    if-ltz v0, :cond_3

    move v0, v1

    .line 766
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long v4, v6, v4

    const-wide/32 v6, 0x240c8400

    cmp-long v4, v4, v6

    if-lez v4, :cond_4

    .line 774
    :goto_2
    iget-boolean v2, p1, Lcom/qihoo/security/gamebooster/b$b;->a:Z

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/b;->g()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 775
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/b;->d:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v2}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v2

    iget-object v4, p1, Lcom/qihoo/security/gamebooster/b$b;->f:Ljava/lang/String;

    invoke-static {v2, v4}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/List;Ljava/lang/String;)Lcom/qihoo/security/gamebooster/LocalGamePkg;

    move-result-object v2

    .line 777
    if-eqz v2, :cond_2

    .line 782
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->q()V

    .line 785
    :cond_2
    iget-boolean v2, p1, Lcom/qihoo/security/gamebooster/b$b;->a:Z

    if-eqz v2, :cond_5

    .line 790
    if-nez v3, :cond_5

    if-eqz v1, :cond_5

    if-nez v0, :cond_5

    .line 791
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->d:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v0

    iget-object v1, p1, Lcom/qihoo/security/gamebooster/b$b;->f:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/List;Ljava/lang/String;)Lcom/qihoo/security/gamebooster/LocalGamePkg;

    move-result-object v0

    .line 797
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 798
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->r()V

    goto :goto_0

    :cond_3
    move v0, v2

    .line 765
    goto :goto_1

    :cond_4
    move v1, v2

    .line 766
    goto :goto_2

    .line 860
    :cond_5
    iget-object v0, p1, Lcom/qihoo/security/gamebooster/b$b;->d:Ljava/lang/String;

    invoke-static {v0}, Lcom/qihoo/security/installreport/a;->a(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public a(Lcom/qihoo/security/gamebooster/g;)V
    .locals 3

    .prologue
    .line 625
    invoke-virtual {p1}, Lcom/qihoo/security/gamebooster/g;->e()Lcom/qihoo/security/gamebooster/g;

    move-result-object v0

    .line 626
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    const/4 v2, 0x4

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 627
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 628
    return-void
.end method

.method public a(Lcom/qihoo/security/gamebooster/h;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/gamebooster/h",
            "<",
            "Lcom/qihoo/security/gamebooster/g;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 344
    if-nez p1, :cond_0

    .line 349
    :goto_0
    return-void

    .line 347
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x7

    .line 348
    :goto_1
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    invoke-virtual {v2, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 347
    :cond_1
    const/4 v0, 0x2

    goto :goto_1
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1049
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    const/4 v2, 0x5

    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1050
    return-void
.end method

.method public a(ZZZLjava/lang/String;)V
    .locals 7

    .prologue
    .line 612
    iget-object v6, p0, Lcom/qihoo/security/gamebooster/b;->k:Ljava/lang/String;

    .line 613
    invoke-direct {p0, p4}, Lcom/qihoo/security/gamebooster/b;->e(Ljava/lang/String;)Z

    move-result v5

    .line 614
    if-nez v5, :cond_0

    .line 622
    :goto_0
    return-void

    .line 617
    :cond_0
    new-instance v0, Lcom/qihoo/security/gamebooster/b$b;

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/security/gamebooster/b$b;-><init>(ZZZLjava/lang/String;ZLjava/lang/String;)V

    .line 619
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 620
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;"
        }
    .end annotation

    .prologue
    .line 363
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->o()V

    .line 364
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->d:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1053
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    const/4 v2, 0x6

    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1054
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 864
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 865
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1115
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    const/16 v2, 0xa

    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1116
    return-void
.end method

.method public d()Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 893
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->d:Lcom/qihoo/security/gamebooster/g;

    .line 894
    if-nez v0, :cond_2

    .line 895
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->m()Lcom/qihoo/security/gamebooster/g;

    move-result-object v0

    move-object v1, v0

    .line 897
    :goto_0
    const/4 v0, 0x0

    .line 898
    if-eqz v1, :cond_0

    .line 899
    invoke-virtual {v1}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v0

    .line 901
    :cond_0
    if-nez v0, :cond_1

    .line 902
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 905
    :cond_1
    const v1, 0x7f020090

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/gamebooster/b;->a(Ljava/util/List;I)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :cond_2
    move-object v1, v0

    goto :goto_0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 914
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->d:Lcom/qihoo/security/gamebooster/g;

    .line 915
    if-nez v0, :cond_0

    .line 916
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/b;->m()Lcom/qihoo/security/gamebooster/g;

    move-result-object v0

    .line 918
    :cond_0
    if-eqz v0, :cond_1

    .line 919
    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 921
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()Z
    .locals 3

    .prologue
    .line 979
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-string/jumbo v1, "sp_key_has_create_game_booster_shortcut"

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 980
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 984
    const-string/jumbo v1, "1.0.8.3742"

    .line 985
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-string/jumbo v3, "sp_key_has_create_game_booster_shortcut"

    const-string/jumbo v4, ""

    invoke-static {v2, v3, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 986
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 995
    :cond_0
    :goto_0
    return v0

    .line 989
    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 995
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public i()V
    .locals 4

    .prologue
    .line 1045
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->e:Landroid/os/Handler;

    const/4 v1, 0x3

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1046
    return-void
.end method

.method public j()V
    .locals 5

    .prologue
    .line 1088
    new-instance v0, Lcom/qihoo/security/receiver/a;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/receiver/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/b;->i:Lcom/qihoo/security/receiver/a;

    .line 1089
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->i:Lcom/qihoo/security/receiver/a;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/b;->l:Lcom/qihoo/security/receiver/a$b;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/receiver/a;->a(Lcom/qihoo/security/receiver/a$b;)V

    .line 1090
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    const-class v1, Lcom/qihoo/security/service/SecurityService;

    const-string/jumbo v2, "com.qihoo.security.service.INTERNAL_CONTROL"

    iget-object v3, p0, Lcom/qihoo/security/gamebooster/b;->n:Landroid/content/ServiceConnection;

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V

    .line 1092
    new-instance v0, Lcom/qihoo/security/gamebooster/b$6;

    invoke-direct {v0, p0}, Lcom/qihoo/security/gamebooster/b$6;-><init>(Lcom/qihoo/security/gamebooster/b;)V

    .line 1106
    new-instance v1, Landroid/content/IntentFilter;

    const-string/jumbo v2, "clear_cloud_query_success"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 1107
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/b;->b:Landroid/content/Context;

    invoke-virtual {v2, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1108
    return-void
.end method

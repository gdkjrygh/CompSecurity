.class Lcom/facebook/fbservice/ops/r;
.super Ljava/lang/Object;
.source "DefaultBlueServiceOperationFactory.java"

# interfaces
.implements Lcom/facebook/fbservice/ops/m;


# static fields
.field public static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final c:Lcom/facebook/debug/log/l;


# instance fields
.field private d:Lcom/facebook/fbservice/service/OperationType;

.field private e:Landroid/os/Bundle;

.field private final f:Landroid/content/Context;

.field private final g:Lcom/facebook/fbservice/ops/x;

.field private final h:Lcom/facebook/fbservice/service/p;

.field private final i:Lcom/facebook/common/executors/a;

.field private final j:Lcom/facebook/auth/viewercontext/e;

.field private final k:Landroid/content/Context;

.field private final l:Lcom/facebook/fbservice/ops/z;

.field private m:Landroid/os/Handler;

.field private n:Lcom/facebook/fbservice/service/w;

.field private o:Z

.field private p:Lcom/facebook/fbservice/ops/ab;

.field private q:Lcom/facebook/fbservice/ops/y;

.field private r:Ljava/lang/String;

.field private s:Z

.field private t:Z

.field private u:Lcom/facebook/common/d/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 104
    const-class v0, Lcom/facebook/fbservice/ops/m;

    sput-object v0, Lcom/facebook/fbservice/ops/r;->b:Ljava/lang/Class;

    .line 106
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/fbservice/ops/r;->c:Lcom/facebook/debug/log/l;

    .line 180
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    sput-object v0, Lcom/facebook/fbservice/ops/r;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;Landroid/content/Context;Lcom/facebook/fbservice/service/p;Lcom/facebook/common/executors/a;Lcom/facebook/auth/viewercontext/e;Lcom/facebook/common/process/d;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 247
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 226
    sget-object v0, Lcom/facebook/fbservice/ops/y;->INIT:Lcom/facebook/fbservice/ops/y;

    iput-object v0, p0, Lcom/facebook/fbservice/ops/r;->q:Lcom/facebook/fbservice/ops/y;

    .line 248
    iput-object p1, p0, Lcom/facebook/fbservice/ops/r;->d:Lcom/facebook/fbservice/service/OperationType;

    .line 249
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object v0, p0, Lcom/facebook/fbservice/ops/r;->e:Landroid/os/Bundle;

    .line 250
    iput-object p3, p0, Lcom/facebook/fbservice/ops/r;->f:Landroid/content/Context;

    .line 251
    new-instance v0, Lcom/facebook/fbservice/ops/x;

    invoke-direct {v0, p0, v1}, Lcom/facebook/fbservice/ops/x;-><init>(Lcom/facebook/fbservice/ops/r;Lcom/facebook/fbservice/ops/q;)V

    iput-object v0, p0, Lcom/facebook/fbservice/ops/r;->g:Lcom/facebook/fbservice/ops/x;

    .line 252
    iput-object p4, p0, Lcom/facebook/fbservice/ops/r;->h:Lcom/facebook/fbservice/service/p;

    .line 253
    iput-object p5, p0, Lcom/facebook/fbservice/ops/r;->i:Lcom/facebook/common/executors/a;

    .line 254
    new-instance v0, Lcom/facebook/fbservice/ops/z;

    invoke-direct {v0, p0, v1}, Lcom/facebook/fbservice/ops/z;-><init>(Lcom/facebook/fbservice/ops/r;Lcom/facebook/fbservice/ops/q;)V

    iput-object v0, p0, Lcom/facebook/fbservice/ops/r;->l:Lcom/facebook/fbservice/ops/z;

    .line 255
    iput-object p6, p0, Lcom/facebook/fbservice/ops/r;->j:Lcom/facebook/auth/viewercontext/e;

    .line 256
    invoke-direct {p0, p3}, Lcom/facebook/fbservice/ops/r;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/ops/r;->k:Landroid/content/Context;

    .line 257
    new-instance v0, Lcom/facebook/fbservice/ops/s;

    invoke-direct {v0, p0}, Lcom/facebook/fbservice/ops/s;-><init>(Lcom/facebook/fbservice/ops/r;)V

    iput-object v0, p0, Lcom/facebook/fbservice/ops/r;->u:Lcom/facebook/common/d/e;

    .line 269
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->e:Landroid/os/Bundle;

    const-string v1, "overridden_viewer_context"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 270
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->j:Lcom/facebook/auth/viewercontext/e;

    invoke-interface {v0}, Lcom/facebook/auth/viewercontext/e;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    .line 271
    if-eqz v0, :cond_0

    .line 272
    iget-object v1, p0, Lcom/facebook/fbservice/ops/r;->e:Landroid/os/Bundle;

    const-string v2, "overridden_viewer_context"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 279
    :cond_0
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->e:Landroid/os/Bundle;

    const-string v1, "calling_process_name"

    invoke-interface {p7}, Lcom/facebook/common/process/d;->b()Lcom/facebook/common/process/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/common/process/c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    return-void
.end method

.method private a(Landroid/content/Context;)Landroid/content/Context;
    .locals 2

    .prologue
    .line 358
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 359
    check-cast v0, Landroid/app/Activity;

    .line 360
    invoke-virtual {v0}, Landroid/app/Activity;->getParent()Landroid/app/Activity;

    move-result-object v1

    instance-of v1, v1, Landroid/app/ActivityGroup;

    if-eqz v1, :cond_0

    .line 361
    invoke-virtual {v0}, Landroid/app/Activity;->getParent()Landroid/app/Activity;

    move-result-object p1

    .line 364
    :cond_0
    return-object p1
.end method

.method static synthetic a(Lcom/facebook/fbservice/ops/r;)Lcom/facebook/common/d/e;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->u:Lcom/facebook/common/d/e;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/fbservice/ops/r;Lcom/facebook/fbservice/service/w;)Lcom/facebook/fbservice/service/w;
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lcom/facebook/fbservice/ops/r;->n:Lcom/facebook/fbservice/service/w;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/fbservice/ops/r;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/ops/r;->c(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/fbservice/ops/r;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/ops/r;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 541
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/r;->o:Z

    if-eqz v0, :cond_0

    .line 542
    invoke-virtual {p0}, Lcom/facebook/fbservice/ops/r;->d()V

    .line 555
    :goto_0
    return-void

    .line 546
    :cond_0
    new-instance v0, Lcom/facebook/fbservice/ops/w;

    invoke-direct {v0, p0, p1}, Lcom/facebook/fbservice/ops/w;-><init>(Lcom/facebook/fbservice/ops/r;Lcom/facebook/fbservice/service/OperationResult;)V

    invoke-direct {p0, v0}, Lcom/facebook/fbservice/ops/r;->a(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 602
    sget-object v0, Lcom/facebook/fbservice/ops/y;->COMPLETED:Lcom/facebook/fbservice/ops/y;

    iput-object v0, p0, Lcom/facebook/fbservice/ops/r;->q:Lcom/facebook/fbservice/ops/y;

    .line 603
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/fbservice/ops/r;->r:Ljava/lang/String;

    .line 604
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/r;->k()V

    .line 606
    const/4 v0, 0x0

    .line 607
    iget-object v1, p0, Lcom/facebook/fbservice/ops/r;->f:Landroid/content/Context;

    instance-of v1, v1, Lcom/facebook/base/activity/h;

    if-eqz v1, :cond_0

    .line 608
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->f:Landroid/content/Context;

    check-cast v0, Lcom/facebook/base/activity/h;

    .line 609
    invoke-interface {v0, p1}, Lcom/facebook/base/activity/h;->a(Ljava/lang/Exception;)Z

    move-result v0

    .line 613
    :cond_0
    if-nez v0, :cond_1

    .line 614
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->l:Lcom/facebook/fbservice/ops/z;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/ops/z;->a_(Ljava/lang/Throwable;)Z

    .line 616
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/fbservice/ops/r;->d()V

    .line 617
    return-void
.end method

.method private a(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 558
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->m:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 559
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->m:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 563
    :goto_0
    return-void

    .line 561
    :cond_0
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->i:Lcom/facebook/common/executors/a;

    invoke-interface {v0, p1}, Lcom/facebook/common/executors/a;->c(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/fbservice/ops/r;Z)Z
    .locals 0

    .prologue
    .line 102
    iput-boolean p1, p0, Lcom/facebook/fbservice/ops/r;->t:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/fbservice/ops/r;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->m:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/fbservice/ops/r;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/ops/r;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 571
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 572
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/ops/r;->d(Lcom/facebook/fbservice/service/OperationResult;)V

    .line 576
    :goto_0
    return-void

    .line 574
    :cond_0
    new-instance v0, Lcom/facebook/fbservice/service/ServiceException;

    invoke-direct {v0, p1}, Lcom/facebook/fbservice/service/ServiceException;-><init>(Lcom/facebook/fbservice/service/OperationResult;)V

    invoke-direct {p0, v0}, Lcom/facebook/fbservice/ops/r;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/fbservice/ops/r;)V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/r;->h()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/fbservice/ops/r;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/ops/r;->b(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method private c(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 584
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->l:Lcom/facebook/fbservice/ops/z;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/z;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    .line 585
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->l:Lcom/facebook/fbservice/ops/z;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/z;->a()Lcom/facebook/fbservice/ops/l;

    move-result-object v0

    .line 586
    if-eqz v0, :cond_0

    .line 587
    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/ops/l;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    .line 590
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/facebook/fbservice/ops/r;)V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/r;->f()V

    return-void
.end method

.method private d(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 593
    sget-object v0, Lcom/facebook/fbservice/ops/y;->COMPLETED:Lcom/facebook/fbservice/ops/y;

    iput-object v0, p0, Lcom/facebook/fbservice/ops/r;->q:Lcom/facebook/fbservice/ops/y;

    .line 594
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/fbservice/ops/r;->r:Ljava/lang/String;

    .line 595
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/r;->k()V

    .line 597
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->l:Lcom/facebook/fbservice/ops/z;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/ops/z;->a(Lcom/facebook/fbservice/service/OperationResult;)Z

    .line 598
    invoke-virtual {p0}, Lcom/facebook/fbservice/ops/r;->d()V

    .line 599
    return-void
.end method

.method static synthetic e(Lcom/facebook/fbservice/ops/r;)V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/r;->k()V

    return-void
.end method

.method static synthetic f(Lcom/facebook/fbservice/ops/r;)Lcom/facebook/fbservice/ops/z;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->l:Lcom/facebook/fbservice/ops/z;

    return-object v0
.end method

.method private f()V
    .locals 5

    .prologue
    .line 368
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/r;->s:Z

    if-eqz v0, :cond_0

    .line 370
    :try_start_0
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->k:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/fbservice/ops/r;->g:Lcom/facebook/fbservice/ops/x;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 377
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/fbservice/ops/r;->s:Z

    .line 382
    :cond_0
    return-void

    .line 371
    :catch_0
    move-exception v0

    .line 375
    sget-object v1, Lcom/facebook/fbservice/ops/r;->c:Lcom/facebook/debug/log/l;

    sget-object v2, Lcom/facebook/fbservice/ops/r;->b:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception unbinding: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/fbservice/ops/r;->d:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3, v0}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private g()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 426
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->n:Lcom/facebook/fbservice/service/w;

    if-eqz v0, :cond_1

    .line 429
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/r;->h()V

    .line 457
    :cond_0
    :goto_0
    return-void

    .line 430
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/r;->s:Z

    if-nez v0, :cond_0

    .line 433
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->h:Lcom/facebook/fbservice/service/p;

    iget-object v1, p0, Lcom/facebook/fbservice/ops/r;->d:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/service/p;->c(Lcom/facebook/fbservice/service/OperationType;)Landroid/content/Intent;

    move-result-object v0

    .line 434
    if-nez v0, :cond_2

    .line 435
    sget-object v0, Lcom/facebook/fbservice/service/t;->ORCA_SERVICE_IPC_FAILURE:Lcom/facebook/fbservice/service/t;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown operation type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/fbservice/ops/r;->d:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 437
    invoke-direct {p0, v0}, Lcom/facebook/fbservice/ops/r;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    goto :goto_0

    .line 439
    :cond_2
    iget-object v1, p0, Lcom/facebook/fbservice/ops/r;->k:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/fbservice/ops/r;->g:Lcom/facebook/fbservice/ops/x;

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 449
    iput-boolean v3, p0, Lcom/facebook/fbservice/ops/r;->s:Z

    goto :goto_0

    .line 451
    :cond_3
    sget-object v0, Lcom/facebook/fbservice/service/t;->ORCA_SERVICE_IPC_FAILURE:Lcom/facebook/fbservice/service/t;

    const-string v1, "Bind to BlueService failed"

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 453
    invoke-direct {p0, v0}, Lcom/facebook/fbservice/ops/r;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    goto :goto_0
.end method

.method static synthetic g(Lcom/facebook/fbservice/ops/r;)V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/r;->g()V

    return-void
.end method

.method private h()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 465
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->q:Lcom/facebook/fbservice/ops/y;

    sget-object v3, Lcom/facebook/fbservice/ops/y;->READY_TO_QUEUE:Lcom/facebook/fbservice/ops/y;

    if-ne v0, v3, :cond_5

    .line 466
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->d:Lcom/facebook/fbservice/service/OperationType;

    if-eqz v0, :cond_1

    move v0, v1

    :goto_0
    const-string v3, "Null operation type"

    invoke-static {v0, v3}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 467
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->r:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    const-string v3, "Non-null operation id"

    invoke-static {v0, v3}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 468
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/r;->t:Z

    if-nez v0, :cond_3

    :goto_2
    const-string v0, "Registered for completion and haven\'t yet sent"

    invoke-static {v1, v0}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 472
    :try_start_0
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->n:Lcom/facebook/fbservice/service/w;

    iget-object v1, p0, Lcom/facebook/fbservice/ops/r;->d:Lcom/facebook/fbservice/service/OperationType;

    iget-object v2, p0, Lcom/facebook/fbservice/ops/r;->e:Landroid/os/Bundle;

    invoke-interface {v0, v1, v2}, Lcom/facebook/fbservice/service/w;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/ops/r;->r:Ljava/lang/String;

    .line 473
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->n:Lcom/facebook/fbservice/service/w;

    if-nez v0, :cond_4

    .line 477
    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 481
    :catch_0
    move-exception v0

    .line 482
    sget-object v0, Lcom/facebook/fbservice/service/t;->ORCA_SERVICE_IPC_FAILURE:Lcom/facebook/fbservice/service/t;

    const-string v1, "BlueService.<method> or registerCompletionHandler failed"

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 485
    invoke-direct {p0, v0}, Lcom/facebook/fbservice/ops/r;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    .line 500
    :cond_0
    :goto_3
    return-void

    :cond_1
    move v0, v2

    .line 466
    goto :goto_0

    :cond_2
    move v0, v2

    .line 467
    goto :goto_1

    :cond_3
    move v1, v2

    .line 468
    goto :goto_2

    .line 479
    :cond_4
    :try_start_1
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/r;->i()V

    .line 480
    sget-object v0, Lcom/facebook/fbservice/ops/y;->OPERATION_QUEUED:Lcom/facebook/fbservice/ops/y;

    iput-object v0, p0, Lcom/facebook/fbservice/ops/r;->q:Lcom/facebook/fbservice/ops/y;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    .line 487
    :cond_5
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->q:Lcom/facebook/fbservice/ops/y;

    sget-object v3, Lcom/facebook/fbservice/ops/y;->OPERATION_QUEUED:Lcom/facebook/fbservice/ops/y;

    if-ne v0, v3, :cond_0

    .line 488
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->r:Ljava/lang/String;

    if-eqz v0, :cond_6

    :goto_4
    const-string v0, "null operation id"

    invoke-static {v1, v0}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 489
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/r;->t:Z

    if-nez v0, :cond_0

    .line 491
    :try_start_2
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/r;->i()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    .line 492
    :catch_1
    move-exception v0

    .line 493
    sget-object v0, Lcom/facebook/fbservice/service/t;->ORCA_SERVICE_IPC_FAILURE:Lcom/facebook/fbservice/service/t;

    const-string v1, "BlueService.registerCompletionHandler failed"

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 496
    invoke-direct {p0, v0}, Lcom/facebook/fbservice/ops/r;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    goto :goto_3

    :cond_6
    move v1, v2

    .line 488
    goto :goto_4
.end method

.method static synthetic h(Lcom/facebook/fbservice/ops/r;)Z
    .locals 1

    .prologue
    .line 102
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/r;->o:Z

    return v0
.end method

.method private i()V
    .locals 3

    .prologue
    .line 508
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->n:Lcom/facebook/fbservice/service/w;

    iget-object v1, p0, Lcom/facebook/fbservice/ops/r;->r:Ljava/lang/String;

    new-instance v2, Lcom/facebook/fbservice/ops/u;

    invoke-direct {v2, p0}, Lcom/facebook/fbservice/ops/u;-><init>(Lcom/facebook/fbservice/ops/r;)V

    invoke-interface {v0, v1, v2}, Lcom/facebook/fbservice/service/w;->a(Ljava/lang/String;Lcom/facebook/fbservice/service/z;)Z

    move-result v0

    .line 530
    if-eqz v0, :cond_0

    .line 531
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/fbservice/ops/r;->t:Z

    .line 538
    :goto_0
    return-void

    .line 533
    :cond_0
    sget-object v0, Lcom/facebook/fbservice/service/t;->ORCA_SERVICE_IPC_FAILURE:Lcom/facebook/fbservice/service/t;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown operation: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/fbservice/ops/r;->r:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 536
    invoke-direct {p0, v0}, Lcom/facebook/fbservice/ops/r;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    goto :goto_0
.end method

.method private j()V
    .locals 1

    .prologue
    .line 620
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->p:Lcom/facebook/fbservice/ops/ab;

    if-eqz v0, :cond_0

    .line 621
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->p:Lcom/facebook/fbservice/ops/ab;

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/ab;->a()V

    .line 623
    :cond_0
    return-void
.end method

.method private k()V
    .locals 1

    .prologue
    .line 626
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->p:Lcom/facebook/fbservice/ops/ab;

    if-eqz v0, :cond_0

    .line 627
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->p:Lcom/facebook/fbservice/ops/ab;

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/ab;->b()V

    .line 629
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/ops/ab;)Lcom/facebook/fbservice/ops/m;
    .locals 2

    .prologue
    .line 330
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->q:Lcom/facebook/fbservice/ops/y;

    sget-object v1, Lcom/facebook/fbservice/ops/y;->READY_TO_QUEUE:Lcom/facebook/fbservice/ops/y;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->q:Lcom/facebook/fbservice/ops/y;

    sget-object v1, Lcom/facebook/fbservice/ops/y;->OPERATION_QUEUED:Lcom/facebook/fbservice/ops/y;

    if-ne v0, v1, :cond_1

    .line 332
    :cond_0
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/r;->k()V

    .line 334
    :cond_1
    iput-object p1, p0, Lcom/facebook/fbservice/ops/r;->p:Lcom/facebook/fbservice/ops/ab;

    .line 335
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->q:Lcom/facebook/fbservice/ops/y;

    sget-object v1, Lcom/facebook/fbservice/ops/y;->READY_TO_QUEUE:Lcom/facebook/fbservice/ops/y;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->q:Lcom/facebook/fbservice/ops/y;

    sget-object v1, Lcom/facebook/fbservice/ops/y;->OPERATION_QUEUED:Lcom/facebook/fbservice/ops/y;

    if-ne v0, v1, :cond_3

    .line 337
    :cond_2
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/r;->j()V

    .line 339
    :cond_3
    return-object p0
.end method

.method public a(Z)Lcom/facebook/fbservice/ops/m;
    .locals 0

    .prologue
    .line 349
    iput-boolean p1, p0, Lcom/facebook/fbservice/ops/r;->o:Z

    .line 350
    return-object p0
.end method

.method public a()Lcom/facebook/fbservice/ops/n;
    .locals 2

    .prologue
    .line 386
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->q:Lcom/facebook/fbservice/ops/y;

    sget-object v1, Lcom/facebook/fbservice/ops/y;->INIT:Lcom/facebook/fbservice/ops/y;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Incorrect operation state"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 391
    sget-object v0, Lcom/facebook/fbservice/ops/y;->READY_TO_QUEUE:Lcom/facebook/fbservice/ops/y;

    iput-object v0, p0, Lcom/facebook/fbservice/ops/r;->q:Lcom/facebook/fbservice/ops/y;

    .line 393
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 394
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/fbservice/ops/r;->m:Landroid/os/Handler;

    .line 396
    :cond_0
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/r;->j()V

    .line 397
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/r;->g()V

    .line 398
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->l:Lcom/facebook/fbservice/ops/z;

    return-object v0

    .line 386
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Lcom/facebook/fbservice/ops/n;
    .locals 2

    .prologue
    .line 403
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->q:Lcom/facebook/fbservice/ops/y;

    sget-object v1, Lcom/facebook/fbservice/ops/y;->INIT:Lcom/facebook/fbservice/ops/y;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Incorrect operation state"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 408
    sget-object v0, Lcom/facebook/fbservice/ops/y;->READY_TO_QUEUE:Lcom/facebook/fbservice/ops/y;

    iput-object v0, p0, Lcom/facebook/fbservice/ops/r;->q:Lcom/facebook/fbservice/ops/y;

    .line 410
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/facebook/fbservice/ops/r;->m:Landroid/os/Handler;

    .line 411
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/r;->j()V

    .line 412
    new-instance v0, Lcom/facebook/fbservice/ops/t;

    invoke-direct {v0, p0}, Lcom/facebook/fbservice/ops/t;-><init>(Lcom/facebook/fbservice/ops/r;)V

    invoke-direct {p0, v0}, Lcom/facebook/fbservice/ops/r;->a(Ljava/lang/Runnable;)V

    .line 418
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->l:Lcom/facebook/fbservice/ops/z;

    return-object v0

    .line 403
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Z
    .locals 2

    .prologue
    .line 297
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->q:Lcom/facebook/fbservice/ops/y;

    sget-object v1, Lcom/facebook/fbservice/ops/y;->INIT:Lcom/facebook/fbservice/ops/y;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->q:Lcom/facebook/fbservice/ops/y;

    sget-object v1, Lcom/facebook/fbservice/ops/y;->COMPLETED:Lcom/facebook/fbservice/ops/y;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()V
    .locals 1

    .prologue
    .line 287
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->u:Lcom/facebook/common/d/e;

    invoke-interface {v0}, Lcom/facebook/common/d/e;->a()V

    .line 288
    return-void
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 292
    iget-object v0, p0, Lcom/facebook/fbservice/ops/r;->u:Lcom/facebook/common/d/e;

    invoke-interface {v0}, Lcom/facebook/common/d/e;->c()Z

    move-result v0

    return v0
.end method

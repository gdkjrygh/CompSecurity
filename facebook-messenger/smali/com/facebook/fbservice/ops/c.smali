.class public Lcom/facebook/fbservice/ops/c;
.super Ljava/lang/Object;
.source "BlueServiceOperation.java"


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
.field private final d:Landroid/content/Context;

.field private final e:Lcom/facebook/fbservice/service/p;

.field private final f:Lcom/facebook/fbservice/ops/g;

.field private final g:Lcom/facebook/common/executors/a;

.field private final h:Lcom/facebook/auth/viewercontext/e;

.field private final i:Landroid/content/Context;

.field private final j:Lcom/facebook/common/process/d;

.field private k:Landroid/os/Handler;

.field private l:Lcom/facebook/fbservice/service/w;

.field private m:Lcom/facebook/fbservice/ops/h;

.field private n:Lcom/facebook/fbservice/ops/i;

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Lcom/facebook/fbservice/ops/ab;

.field private s:Lcom/facebook/fbservice/ops/j;

.field private t:Lcom/facebook/fbservice/service/OperationType;

.field private u:Landroid/os/Bundle;

.field private v:Ljava/lang/String;

.field private w:Z

.field private x:Z

.field private y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 47
    const-class v0, Lcom/facebook/fbservice/ops/c;

    sput-object v0, Lcom/facebook/fbservice/ops/c;->b:Ljava/lang/Class;

    .line 49
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/fbservice/ops/c;->c:Lcom/facebook/debug/log/l;

    .line 100
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    sput-object v0, Lcom/facebook/fbservice/ops/c;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/fbservice/service/p;Lcom/facebook/common/executors/a;Lcom/facebook/auth/viewercontext/e;Lcom/facebook/common/process/d;)V
    .locals 2

    .prologue
    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 152
    sget-object v0, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    .line 181
    iput-object p1, p0, Lcom/facebook/fbservice/ops/c;->d:Landroid/content/Context;

    .line 182
    new-instance v0, Lcom/facebook/fbservice/ops/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/fbservice/ops/g;-><init>(Lcom/facebook/fbservice/ops/c;Lcom/facebook/fbservice/ops/d;)V

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->f:Lcom/facebook/fbservice/ops/g;

    .line 183
    iput-object p2, p0, Lcom/facebook/fbservice/ops/c;->e:Lcom/facebook/fbservice/service/p;

    .line 184
    iput-object p3, p0, Lcom/facebook/fbservice/ops/c;->g:Lcom/facebook/common/executors/a;

    .line 185
    iput-object p4, p0, Lcom/facebook/fbservice/ops/c;->h:Lcom/facebook/auth/viewercontext/e;

    .line 186
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/ops/c;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->i:Landroid/content/Context;

    .line 187
    iput-object p5, p0, Lcom/facebook/fbservice/ops/c;->j:Lcom/facebook/common/process/d;

    .line 188
    return-void
.end method

.method private a(Landroid/content/Context;)Landroid/content/Context;
    .locals 2

    .prologue
    .line 420
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 421
    check-cast v0, Landroid/app/Activity;

    .line 422
    invoke-virtual {v0}, Landroid/app/Activity;->getParent()Landroid/app/Activity;

    move-result-object v1

    instance-of v1, v1, Landroid/app/ActivityGroup;

    if-eqz v1, :cond_0

    .line 423
    invoke-virtual {v0}, Landroid/app/Activity;->getParent()Landroid/app/Activity;

    move-result-object p1

    .line 426
    :cond_0
    return-object p1
.end method

.method static synthetic a(Lcom/facebook/fbservice/ops/c;Lcom/facebook/fbservice/service/w;)Lcom/facebook/fbservice/service/w;
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/facebook/fbservice/ops/c;->l:Lcom/facebook/fbservice/service/w;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/fbservice/ops/c;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/ops/c;->b(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/fbservice/ops/c;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/ops/c;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 606
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/c;->q:Z

    if-eqz v0, :cond_0

    .line 607
    invoke-virtual {p0}, Lcom/facebook/fbservice/ops/c;->a()V

    .line 620
    :goto_0
    return-void

    .line 611
    :cond_0
    new-instance v0, Lcom/facebook/fbservice/ops/f;

    invoke-direct {v0, p0, p1}, Lcom/facebook/fbservice/ops/f;-><init>(Lcom/facebook/fbservice/ops/c;Lcom/facebook/fbservice/service/OperationResult;)V

    invoke-direct {p0, v0}, Lcom/facebook/fbservice/ops/c;->a(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 671
    sget-object v0, Lcom/facebook/fbservice/ops/j;->COMPLETED:Lcom/facebook/fbservice/ops/j;

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    .line 672
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->v:Ljava/lang/String;

    .line 673
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->j()V

    .line 675
    const/4 v0, 0x0

    .line 676
    iget-object v1, p0, Lcom/facebook/fbservice/ops/c;->d:Landroid/content/Context;

    instance-of v1, v1, Lcom/facebook/base/activity/h;

    if-eqz v1, :cond_0

    .line 677
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->d:Landroid/content/Context;

    check-cast v0, Lcom/facebook/base/activity/h;

    .line 678
    invoke-interface {v0, p1}, Lcom/facebook/base/activity/h;->a(Ljava/lang/Exception;)Z

    move-result v0

    .line 681
    :cond_0
    iget-boolean v1, p0, Lcom/facebook/fbservice/ops/c;->o:Z

    if-eqz v1, :cond_1

    .line 682
    invoke-virtual {p0}, Lcom/facebook/fbservice/ops/c;->d()V

    .line 684
    :cond_1
    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->m:Lcom/facebook/fbservice/ops/h;

    if-eqz v0, :cond_2

    .line 685
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->m:Lcom/facebook/fbservice/ops/h;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/ops/h;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    .line 687
    :cond_2
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/c;->p:Z

    if-eqz v0, :cond_3

    .line 688
    invoke-virtual {p0}, Lcom/facebook/fbservice/ops/c;->a()V

    .line 690
    :cond_3
    return-void
.end method

.method private a(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 623
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->k:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 624
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->k:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 628
    :goto_0
    return-void

    .line 626
    :cond_0
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->g:Lcom/facebook/common/executors/a;

    invoke-interface {v0, p1}, Lcom/facebook/common/executors/a;->c(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/fbservice/ops/c;)Z
    .locals 1

    .prologue
    .line 45
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/c;->y:Z

    return v0
.end method

.method static synthetic a(Lcom/facebook/fbservice/ops/c;Z)Z
    .locals 0

    .prologue
    .line 45
    iput-boolean p1, p0, Lcom/facebook/fbservice/ops/c;->x:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/fbservice/ops/c;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->g()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/fbservice/ops/c;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 636
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->n:Lcom/facebook/fbservice/ops/i;

    if-eqz v0, :cond_0

    .line 637
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->n:Lcom/facebook/fbservice/ops/i;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/ops/i;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    .line 639
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/facebook/fbservice/ops/c;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/ops/c;->c(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method private c(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 647
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 648
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/ops/c;->d(Lcom/facebook/fbservice/service/OperationResult;)V

    .line 652
    :goto_0
    return-void

    .line 650
    :cond_0
    new-instance v0, Lcom/facebook/fbservice/service/ServiceException;

    invoke-direct {v0, p1}, Lcom/facebook/fbservice/service/ServiceException;-><init>(Lcom/facebook/fbservice/service/OperationResult;)V

    invoke-direct {p0, v0}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/fbservice/ops/c;)Z
    .locals 1

    .prologue
    .line 45
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/c;->q:Z

    return v0
.end method

.method private d(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 655
    sget-object v0, Lcom/facebook/fbservice/ops/j;->COMPLETED:Lcom/facebook/fbservice/ops/j;

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    .line 656
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->v:Ljava/lang/String;

    .line 657
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->j()V

    .line 659
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/c;->o:Z

    if-eqz v0, :cond_0

    .line 660
    invoke-virtual {p0}, Lcom/facebook/fbservice/ops/c;->d()V

    .line 662
    :cond_0
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->m:Lcom/facebook/fbservice/ops/h;

    if-eqz v0, :cond_1

    .line 663
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->m:Lcom/facebook/fbservice/ops/h;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/ops/h;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    .line 665
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/c;->p:Z

    if-eqz v0, :cond_2

    .line 666
    invoke-virtual {p0}, Lcom/facebook/fbservice/ops/c;->a()V

    .line 668
    :cond_2
    return-void
.end method

.method private e()V
    .locals 5

    .prologue
    .line 430
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/c;->w:Z

    if-eqz v0, :cond_0

    .line 432
    :try_start_0
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->i:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/fbservice/ops/c;->f:Lcom/facebook/fbservice/ops/g;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 439
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/fbservice/ops/c;->w:Z

    .line 444
    :cond_0
    return-void

    .line 433
    :catch_0
    move-exception v0

    .line 437
    sget-object v1, Lcom/facebook/fbservice/ops/c;->c:Lcom/facebook/debug/log/l;

    sget-object v2, Lcom/facebook/fbservice/ops/c;->b:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception unbinding "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/fbservice/ops/c;->t:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3, v0}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private f()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 490
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->l:Lcom/facebook/fbservice/service/w;

    if-eqz v0, :cond_1

    .line 493
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->g()V

    .line 523
    :cond_0
    :goto_0
    return-void

    .line 494
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/c;->w:Z

    if-nez v0, :cond_0

    .line 497
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->e:Lcom/facebook/fbservice/service/p;

    iget-object v1, p0, Lcom/facebook/fbservice/ops/c;->t:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/service/p;->d(Lcom/facebook/fbservice/service/OperationType;)Ljava/lang/Class;

    move-result-object v0

    .line 499
    if-nez v0, :cond_2

    .line 500
    sget-object v0, Lcom/facebook/fbservice/service/t;->ORCA_SERVICE_IPC_FAILURE:Lcom/facebook/fbservice/service/t;

    const-string v1, "Unknown operation type"

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 502
    invoke-direct {p0, v0}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    goto :goto_0

    .line 504
    :cond_2
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/facebook/fbservice/ops/c;->d:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 505
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->i:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/fbservice/ops/c;->f:Lcom/facebook/fbservice/ops/g;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 515
    iput-boolean v3, p0, Lcom/facebook/fbservice/ops/c;->w:Z

    goto :goto_0

    .line 517
    :cond_3
    sget-object v0, Lcom/facebook/fbservice/service/t;->ORCA_SERVICE_IPC_FAILURE:Lcom/facebook/fbservice/service/t;

    const-string v1, "Bind to BlueService failed"

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 519
    invoke-direct {p0, v0}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    goto :goto_0
.end method

.method private g()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 531
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    sget-object v3, Lcom/facebook/fbservice/ops/j;->READY_TO_QUEUE:Lcom/facebook/fbservice/ops/j;

    if-ne v0, v3, :cond_5

    .line 532
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->t:Lcom/facebook/fbservice/service/OperationType;

    if-eqz v0, :cond_1

    move v0, v1

    :goto_0
    const-string v3, "Null operation type"

    invoke-static {v0, v3}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 533
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->v:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    const-string v3, "Non-null operation id"

    invoke-static {v0, v3}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 534
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/c;->x:Z

    if-nez v0, :cond_3

    :goto_2
    const-string v0, "Registered for completion and haven\'t yet sent"

    invoke-static {v1, v0}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 538
    :try_start_0
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->l:Lcom/facebook/fbservice/service/w;

    iget-object v1, p0, Lcom/facebook/fbservice/ops/c;->t:Lcom/facebook/fbservice/service/OperationType;

    iget-object v2, p0, Lcom/facebook/fbservice/ops/c;->u:Landroid/os/Bundle;

    invoke-interface {v0, v1, v2}, Lcom/facebook/fbservice/service/w;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->v:Ljava/lang/String;

    .line 539
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->l:Lcom/facebook/fbservice/service/w;

    if-nez v0, :cond_4

    .line 543
    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 547
    :catch_0
    move-exception v0

    .line 548
    sget-object v0, Lcom/facebook/fbservice/service/t;->ORCA_SERVICE_IPC_FAILURE:Lcom/facebook/fbservice/service/t;

    const-string v1, "BlueService.<method> or registerCompletionHandler failed"

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 551
    invoke-direct {p0, v0}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    .line 566
    :cond_0
    :goto_3
    return-void

    :cond_1
    move v0, v2

    .line 532
    goto :goto_0

    :cond_2
    move v0, v2

    .line 533
    goto :goto_1

    :cond_3
    move v1, v2

    .line 534
    goto :goto_2

    .line 545
    :cond_4
    :try_start_1
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->h()V

    .line 546
    sget-object v0, Lcom/facebook/fbservice/ops/j;->OPERATION_QUEUED:Lcom/facebook/fbservice/ops/j;

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    .line 553
    :cond_5
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    sget-object v3, Lcom/facebook/fbservice/ops/j;->OPERATION_QUEUED:Lcom/facebook/fbservice/ops/j;

    if-ne v0, v3, :cond_0

    .line 554
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->v:Ljava/lang/String;

    if-eqz v0, :cond_6

    :goto_4
    const-string v0, "null operation id"

    invoke-static {v1, v0}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 555
    iget-boolean v0, p0, Lcom/facebook/fbservice/ops/c;->x:Z

    if-nez v0, :cond_0

    .line 557
    :try_start_2
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->h()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    .line 558
    :catch_1
    move-exception v0

    .line 559
    sget-object v0, Lcom/facebook/fbservice/service/t;->ORCA_SERVICE_IPC_FAILURE:Lcom/facebook/fbservice/service/t;

    const-string v1, "BlueService.registerCompletionHandler failed"

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 562
    invoke-direct {p0, v0}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    goto :goto_3

    :cond_6
    move v1, v2

    .line 554
    goto :goto_4
.end method

.method private h()V
    .locals 3

    .prologue
    .line 574
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->l:Lcom/facebook/fbservice/service/w;

    iget-object v1, p0, Lcom/facebook/fbservice/ops/c;->v:Ljava/lang/String;

    new-instance v2, Lcom/facebook/fbservice/ops/d;

    invoke-direct {v2, p0}, Lcom/facebook/fbservice/ops/d;-><init>(Lcom/facebook/fbservice/ops/c;)V

    invoke-interface {v0, v1, v2}, Lcom/facebook/fbservice/service/w;->a(Ljava/lang/String;Lcom/facebook/fbservice/service/z;)Z

    move-result v0

    .line 595
    if-eqz v0, :cond_0

    .line 596
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/fbservice/ops/c;->x:Z

    .line 603
    :goto_0
    return-void

    .line 598
    :cond_0
    sget-object v0, Lcom/facebook/fbservice/service/t;->ORCA_SERVICE_IPC_FAILURE:Lcom/facebook/fbservice/service/t;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown operation: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/fbservice/ops/c;->v:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 601
    invoke-direct {p0, v0}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    goto :goto_0
.end method

.method private i()V
    .locals 1

    .prologue
    .line 693
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->r:Lcom/facebook/fbservice/ops/ab;

    if-eqz v0, :cond_0

    .line 694
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->r:Lcom/facebook/fbservice/ops/ab;

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/ab;->a()V

    .line 696
    :cond_0
    return-void
.end method

.method private j()V
    .locals 1

    .prologue
    .line 699
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->r:Lcom/facebook/fbservice/ops/ab;

    if-eqz v0, :cond_0

    .line 700
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->r:Lcom/facebook/fbservice/ops/ab;

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/ab;->b()V

    .line 702
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 194
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/fbservice/ops/c;->y:Z

    .line 195
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->e()V

    .line 196
    iput-object v1, p0, Lcom/facebook/fbservice/ops/c;->l:Lcom/facebook/fbservice/service/w;

    .line 197
    iput-object v1, p0, Lcom/facebook/fbservice/ops/c;->n:Lcom/facebook/fbservice/ops/i;

    .line 198
    iput-object v1, p0, Lcom/facebook/fbservice/ops/c;->m:Lcom/facebook/fbservice/ops/h;

    .line 199
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->j()V

    .line 200
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 209
    const-string v0, "operationState"

    iget-object v1, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 210
    const-string v0, "type"

    iget-object v1, p0, Lcom/facebook/fbservice/ops/c;->t:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 211
    const-string v0, "param"

    iget-object v1, p0, Lcom/facebook/fbservice/ops/c;->u:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 212
    const-string v0, "operationId"

    iget-object v1, p0, Lcom/facebook/fbservice/ops/c;->v:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    return-void
.end method

.method public a(Lcom/facebook/fbservice/ops/ab;)V
    .locals 2

    .prologue
    .line 335
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    sget-object v1, Lcom/facebook/fbservice/ops/j;->READY_TO_QUEUE:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    sget-object v1, Lcom/facebook/fbservice/ops/j;->OPERATION_QUEUED:Lcom/facebook/fbservice/ops/j;

    if-ne v0, v1, :cond_1

    .line 337
    :cond_0
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->j()V

    .line 339
    :cond_1
    iput-object p1, p0, Lcom/facebook/fbservice/ops/c;->r:Lcom/facebook/fbservice/ops/ab;

    .line 340
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    sget-object v1, Lcom/facebook/fbservice/ops/j;->READY_TO_QUEUE:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    sget-object v1, Lcom/facebook/fbservice/ops/j;->OPERATION_QUEUED:Lcom/facebook/fbservice/ops/j;

    if-ne v0, v1, :cond_3

    .line 342
    :cond_2
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->i()V

    .line 344
    :cond_3
    return-void
.end method

.method public a(Lcom/facebook/fbservice/ops/h;)V
    .locals 0
    .param p1    # Lcom/facebook/fbservice/ops/h;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 299
    iput-object p1, p0, Lcom/facebook/fbservice/ops/c;->m:Lcom/facebook/fbservice/ops/h;

    .line 300
    return-void
.end method

.method public a(Lcom/facebook/fbservice/ops/i;)V
    .locals 0

    .prologue
    .line 317
    iput-object p1, p0, Lcom/facebook/fbservice/ops/c;->n:Lcom/facebook/fbservice/ops/i;

    .line 318
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 454
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    sget-object v3, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-ne v0, v3, :cond_2

    move v0, v1

    :goto_0
    const-string v3, "Incorrect operation state"

    invoke-static {v0, v3}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 455
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->t:Lcom/facebook/fbservice/service/OperationType;

    if-nez v0, :cond_3

    :goto_1
    const-string v0, "Initially operationType should be null"

    invoke-static {v1, v0}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 456
    const-string v0, "non-null operationType"

    invoke-static {p1, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    sget-object v0, Lcom/facebook/fbservice/ops/j;->READY_TO_QUEUE:Lcom/facebook/fbservice/ops/j;

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    .line 459
    iput-object p1, p0, Lcom/facebook/fbservice/ops/c;->t:Lcom/facebook/fbservice/service/OperationType;

    .line 460
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->u:Landroid/os/Bundle;

    .line 462
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 463
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->k:Landroid/os/Handler;

    .line 466
    :cond_0
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->u:Landroid/os/Bundle;

    const-string v1, "overridden_viewer_context"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 467
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->h:Lcom/facebook/auth/viewercontext/e;

    invoke-interface {v0}, Lcom/facebook/auth/viewercontext/e;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    .line 468
    if-eqz v0, :cond_1

    .line 469
    iget-object v1, p0, Lcom/facebook/fbservice/ops/c;->u:Landroid/os/Bundle;

    const-string v2, "overridden_viewer_context"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 476
    :cond_1
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->u:Landroid/os/Bundle;

    const-string v1, "calling_process_name"

    iget-object v2, p0, Lcom/facebook/fbservice/ops/c;->j:Lcom/facebook/common/process/d;

    invoke-interface {v2}, Lcom/facebook/common/process/d;->b()Lcom/facebook/common/process/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/common/process/c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 481
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->i()V

    .line 482
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->f()V

    .line 483
    return-void

    :cond_2
    move v0, v2

    .line 454
    goto :goto_0

    :cond_3
    move v1, v2

    .line 455
    goto :goto_1
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 361
    iput-boolean p1, p0, Lcom/facebook/fbservice/ops/c;->o:Z

    .line 362
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 221
    const-string v0, "operationState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/j;

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    .line 222
    const-string v0, "param"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->u:Landroid/os/Bundle;

    .line 223
    const-string v0, "type"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/OperationType;

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->t:Lcom/facebook/fbservice/service/OperationType;

    .line 224
    const-string v0, "operationId"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->v:Ljava/lang/String;

    .line 228
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 229
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->k:Landroid/os/Handler;

    .line 232
    :cond_0
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    sget-object v1, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-ne v0, v1, :cond_2

    .line 246
    :cond_1
    :goto_0
    return-void

    .line 234
    :cond_2
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    sget-object v1, Lcom/facebook/fbservice/ops/j;->READY_TO_QUEUE:Lcom/facebook/fbservice/ops/j;

    if-ne v0, v1, :cond_3

    .line 236
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->i()V

    .line 237
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->f()V

    goto :goto_0

    .line 238
    :cond_3
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    sget-object v1, Lcom/facebook/fbservice/ops/j;->OPERATION_QUEUED:Lcom/facebook/fbservice/ops/j;

    if-ne v0, v1, :cond_4

    .line 241
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->i()V

    .line 242
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->f()V

    goto :goto_0

    .line 243
    :cond_4
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    sget-object v1, Lcom/facebook/fbservice/ops/j;->COMPLETED:Lcom/facebook/fbservice/ops/j;

    if-ne v0, v1, :cond_1

    goto :goto_0
.end method

.method public b(Z)V
    .locals 0

    .prologue
    .line 398
    iput-boolean p1, p0, Lcom/facebook/fbservice/ops/c;->q:Z

    .line 399
    return-void
.end method

.method public b()Z
    .locals 2

    .prologue
    .line 254
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    sget-object v1, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    sget-object v1, Lcom/facebook/fbservice/ops/j;->COMPLETED:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Lcom/facebook/fbservice/ops/j;
    .locals 1

    .prologue
    .line 263
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    return-object v0
.end method

.method public d()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 405
    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    sget-object v2, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    sget-object v2, Lcom/facebook/fbservice/ops/j;->COMPLETED:Lcom/facebook/fbservice/ops/j;

    if-ne v0, v2, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 406
    sget-object v0, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    iput-object v0, p0, Lcom/facebook/fbservice/ops/c;->s:Lcom/facebook/fbservice/ops/j;

    .line 407
    iput-object v3, p0, Lcom/facebook/fbservice/ops/c;->t:Lcom/facebook/fbservice/service/OperationType;

    .line 408
    iput-object v3, p0, Lcom/facebook/fbservice/ops/c;->u:Landroid/os/Bundle;

    .line 409
    iput-object v3, p0, Lcom/facebook/fbservice/ops/c;->v:Ljava/lang/String;

    .line 410
    iput-boolean v1, p0, Lcom/facebook/fbservice/ops/c;->x:Z

    .line 411
    invoke-direct {p0}, Lcom/facebook/fbservice/ops/c;->e()V

    .line 412
    iput-object v3, p0, Lcom/facebook/fbservice/ops/c;->l:Lcom/facebook/fbservice/service/w;

    .line 413
    return-void

    :cond_1
    move v0, v1

    .line 405
    goto :goto_0
.end method

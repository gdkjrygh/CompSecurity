.class public Lcom/facebook/i/a/d;
.super Ljava/lang/Object;
.source "PeerProcessManagerImpl.java"

# interfaces
.implements Lcom/facebook/i/a/b;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/base/broadcast/j;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/common/process/d;

.field private final e:Lcom/facebook/common/e/h;

.field private final f:Lcom/facebook/i/a/a;

.field private final g:Landroid/os/HandlerThread;

.field private h:Landroid/os/Handler;

.field private i:Landroid/os/Messenger;

.field private j:Lcom/facebook/base/broadcast/l;

.field private final k:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/facebook/i/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/i/a/r;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/facebook/i/a/q;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Lcom/facebook/auth/c/b;

.field private final o:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Z

.field private volatile q:Lcom/facebook/auth/c/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/auth/c/c",
            "<",
            "Lcom/facebook/auth/c/d;",
            ">;"
        }
    .end annotation
.end field

.field private r:Landroid/content/Intent;

.field private final s:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/facebook/base/broadcast/j;Ljavax/inject/a;Lcom/facebook/common/process/d;Lcom/facebook/common/e/h;Lcom/facebook/auth/c/b;Landroid/os/HandlerThread;Ljavax/inject/a;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/facebook/base/broadcast/j;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/facebook/common/process/d;",
            "Lcom/facebook/common/e/h;",
            "Lcom/facebook/auth/c/b;",
            "Landroid/os/HandlerThread;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/i/a/d;->k:Ljava/util/concurrent/ConcurrentMap;

    .line 78
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/i/a/d;->l:Ljava/util/concurrent/ConcurrentMap;

    .line 81
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/i/a/d;->m:Ljava/util/concurrent/ConcurrentMap;

    .line 91
    new-instance v0, Lcom/facebook/i/a/e;

    invoke-direct {v0, p0}, Lcom/facebook/i/a/e;-><init>(Lcom/facebook/i/a/d;)V

    iput-object v0, p0, Lcom/facebook/i/a/d;->s:Ljava/lang/Runnable;

    .line 122
    iput-object p1, p0, Lcom/facebook/i/a/d;->a:Ljava/lang/String;

    .line 123
    iput-object p2, p0, Lcom/facebook/i/a/d;->b:Lcom/facebook/base/broadcast/j;

    .line 124
    iput-object p3, p0, Lcom/facebook/i/a/d;->c:Ljavax/inject/a;

    .line 125
    iput-object p4, p0, Lcom/facebook/i/a/d;->d:Lcom/facebook/common/process/d;

    .line 126
    iput-object p5, p0, Lcom/facebook/i/a/d;->e:Lcom/facebook/common/e/h;

    .line 127
    iput-object p6, p0, Lcom/facebook/i/a/d;->n:Lcom/facebook/auth/c/b;

    .line 128
    iput-object p7, p0, Lcom/facebook/i/a/d;->g:Landroid/os/HandlerThread;

    .line 129
    iput-object p8, p0, Lcom/facebook/i/a/d;->o:Ljavax/inject/a;

    .line 130
    iput-boolean p9, p0, Lcom/facebook/i/a/d;->p:Z

    .line 131
    new-instance v1, Lcom/facebook/i/a/a;

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/facebook/i/a/d;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v3, p0, Lcom/facebook/i/a/d;->d:Lcom/facebook/common/process/d;

    invoke-interface {v3}, Lcom/facebook/common/process/d;->b()Lcom/facebook/common/process/c;

    move-result-object v3

    invoke-direct {v1, v2, v0, v3}, Lcom/facebook/i/a/a;-><init>(Landroid/os/Messenger;ILcom/facebook/common/process/c;)V

    iput-object v1, p0, Lcom/facebook/i/a/d;->f:Lcom/facebook/i/a/a;

    .line 133
    return-void
.end method

.method static synthetic a(Lcom/facebook/i/a/d;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/i/a/d;->r:Landroid/content/Intent;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/i/a/d;Landroid/os/Message;)Lcom/facebook/i/a/a;
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0, p1}, Lcom/facebook/i/a/d;->b(Landroid/os/Message;)Lcom/facebook/i/a/a;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 334
    iget-object v0, p0, Lcom/facebook/i/a/d;->a:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 335
    iget-boolean v0, p0, Lcom/facebook/i/a/d;->p:Z

    if-eqz v0, :cond_2

    .line 336
    iget-object v0, p0, Lcom/facebook/i/a/d;->o:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 337
    if-nez v0, :cond_1

    .line 398
    :cond_0
    :goto_0
    return-void

    .line 341
    :cond_1
    const-string v1, "__KEY_LOGGED_USER_ID__"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 342
    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 348
    :cond_2
    const-string v0, "peer_info"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 349
    if-nez v0, :cond_3

    .line 350
    iget-object v0, p0, Lcom/facebook/i/a/d;->e:Lcom/facebook/common/e/h;

    const-class v1, Lcom/facebook/i/a/b;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Peer info bundle should be in the broadcast intent with action "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/i/a/d;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 358
    :cond_3
    :try_start_0
    invoke-static {v0}, Lcom/facebook/i/a/a;->a(Landroid/os/Bundle;)Lcom/facebook/i/a/a;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 367
    invoke-virtual {p0}, Lcom/facebook/i/a/d;->b()Lcom/facebook/i/a/a;

    move-result-object v1

    .line 368
    iget v2, v0, Lcom/facebook/i/a/a;->b:I

    iget v3, v1, Lcom/facebook/i/a/a;->b:I

    if-eq v2, v3, :cond_0

    .line 373
    iget-object v2, p0, Lcom/facebook/i/a/d;->k:Ljava/util/concurrent/ConcurrentMap;

    iget v3, v0, Lcom/facebook/i/a/a;->b:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 375
    const-class v2, Lcom/facebook/i/a/d;

    const-string v3, "%s received peer connecting broadcast from process %s but it has already been connected."

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v1, v1, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    aput-object v1, v4, v5

    const/4 v1, 0x1

    iget-object v0, v0, Lcom/facebook/i/a/a;->c:Lcom/facebook/common/process/c;

    aput-object v0, v4, v1

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 359
    :catch_0
    move-exception v0

    .line 360
    iget-object v0, p0, Lcom/facebook/i/a/d;->e:Lcom/facebook/common/e/h;

    const-class v1, Lcom/facebook/i/a/b;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Peer info bundle in the broadcast intent with action "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/i/a/d;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " was malformed"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 383
    :cond_4
    iget-object v2, v1, Lcom/facebook/i/a/a;->a:Landroid/os/Messenger;

    const-string v3, "The mMessenger member should have been set in init()"

    invoke-static {v2, v3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    const/4 v2, 0x0

    invoke-static {v2, v5}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v2

    .line 389
    invoke-virtual {v1}, Lcom/facebook/i/a/a;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 391
    :try_start_1
    iget-object v1, v0, Lcom/facebook/i/a/a;->a:Landroid/os/Messenger;

    invoke-virtual {v1, v2}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 396
    sget-object v1, Lcom/facebook/i/a/s;->Incoming:Lcom/facebook/i/a/s;

    invoke-direct {p0, v0, v1}, Lcom/facebook/i/a/d;->a(Lcom/facebook/i/a/a;Lcom/facebook/i/a/s;)V

    goto/16 :goto_0

    .line 392
    :catch_1
    move-exception v0

    goto/16 :goto_0
.end method

.method private a(Lcom/facebook/i/a/a;)V
    .locals 2

    .prologue
    .line 401
    iget-object v0, p0, Lcom/facebook/i/a/d;->k:Ljava/util/concurrent/ConcurrentMap;

    iget v1, p1, Lcom/facebook/i/a/a;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 402
    iget-object v0, p0, Lcom/facebook/i/a/d;->l:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/i/a/r;

    .line 403
    invoke-interface {v0, p1}, Lcom/facebook/i/a/r;->a(Lcom/facebook/i/a/a;)V

    goto :goto_0

    .line 406
    :cond_0
    return-void
.end method

.method private a(Lcom/facebook/i/a/a;Lcom/facebook/i/a/s;)V
    .locals 2

    .prologue
    .line 430
    iget-object v0, p0, Lcom/facebook/i/a/d;->k:Ljava/util/concurrent/ConcurrentMap;

    iget v1, p1, Lcom/facebook/i/a/a;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    iget-object v0, p0, Lcom/facebook/i/a/d;->l:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/i/a/r;

    .line 432
    invoke-interface {v0, p1, p2}, Lcom/facebook/i/a/r;->a(Lcom/facebook/i/a/a;Lcom/facebook/i/a/s;)V

    goto :goto_0

    .line 434
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/i/a/d;->b(Lcom/facebook/i/a/a;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 435
    invoke-direct {p0, p1}, Lcom/facebook/i/a/d;->a(Lcom/facebook/i/a/a;)V

    .line 437
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/facebook/i/a/d;Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/i/a/d;->a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/i/a/d;Lcom/facebook/i/a/a;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1}, Lcom/facebook/i/a/d;->a(Lcom/facebook/i/a/a;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/i/a/d;Lcom/facebook/i/a/a;Lcom/facebook/i/a/s;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1, p2}, Lcom/facebook/i/a/d;->a(Lcom/facebook/i/a/a;Lcom/facebook/i/a/s;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/i/a/d;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/i/a/d;->h:Landroid/os/Handler;

    return-object v0
.end method

.method private b(Landroid/os/Message;)Lcom/facebook/i/a/a;
    .locals 6

    .prologue
    .line 483
    iget v1, p1, Landroid/os/Message;->arg1:I

    .line 484
    iget-object v0, p0, Lcom/facebook/i/a/d;->k:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/i/a/a;

    .line 485
    if-nez v0, :cond_0

    .line 486
    iget-object v2, p0, Lcom/facebook/i/a/d;->e:Lcom/facebook/common/e/h;

    const-class v3, Lcom/facebook/i/a/b;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Message from unknown process: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ", probably the message\'s arg1 is not set to the pid of source process. "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "Message details: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ", peer infos: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v4, p0, Lcom/facebook/i/a/d;->k:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    :cond_0
    return-object v0
.end method

.method static synthetic b(Lcom/facebook/i/a/d;Landroid/os/Message;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1}, Lcom/facebook/i/a/d;->c(Landroid/os/Message;)V

    return-void
.end method

.method private b(Lcom/facebook/i/a/a;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 410
    :try_start_0
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    iget-object v1, p1, Lcom/facebook/i/a/a;->a:Landroid/os/Messenger;

    invoke-virtual {v1}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v1

    new-instance v2, Lcom/facebook/i/a/k;

    invoke-direct {v2, p0, p1}, Lcom/facebook/i/a/k;-><init>(Lcom/facebook/i/a/d;Lcom/facebook/i/a/a;)V

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 422
    const/4 v0, 0x1

    .line 425
    :goto_0
    return v0

    .line 423
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/i/a/d;)Lcom/facebook/base/broadcast/j;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/i/a/d;->b:Lcom/facebook/base/broadcast/j;

    return-object v0
.end method

.method private c()V
    .locals 2

    .prologue
    .line 172
    iget-object v0, p0, Lcom/facebook/i/a/d;->h:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/i/a/g;

    invoke-direct {v1, p0}, Lcom/facebook/i/a/g;-><init>(Lcom/facebook/i/a/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 186
    return-void
.end method

.method private c(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 496
    .line 497
    iget-object v1, p0, Lcom/facebook/i/a/d;->m:Ljava/util/concurrent/ConcurrentMap;

    monitor-enter v1

    .line 498
    :try_start_0
    iget-object v0, p0, Lcom/facebook/i/a/d;->m:Ljava/util/concurrent/ConcurrentMap;

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/i/a/q;

    .line 499
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 500
    if-eqz v0, :cond_0

    .line 501
    invoke-direct {p0, p1}, Lcom/facebook/i/a/d;->b(Landroid/os/Message;)Lcom/facebook/i/a/a;

    move-result-object v1

    .line 502
    if-nez v1, :cond_1

    .line 507
    :cond_0
    :goto_0
    return-void

    .line 499
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 505
    :cond_1
    invoke-interface {v0, v1, p1}, Lcom/facebook/i/a/q;->a(Lcom/facebook/i/a/a;Landroid/os/Message;)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/facebook/i/a/d;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/i/a/d;->s:Ljava/lang/Runnable;

    return-object v0
.end method

.method private e()Ljava/lang/String;
    .locals 3

    .prologue
    .line 189
    iget-object v0, p0, Lcom/facebook/i/a/d;->o:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 190
    if-eqz v0, :cond_0

    .line 191
    iget-object v1, p0, Lcom/facebook/i/a/d;->r:Landroid/content/Intent;

    const-string v2, "__KEY_LOGGED_USER_ID__"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 192
    invoke-direct {p0}, Lcom/facebook/i/a/d;->g()V

    .line 194
    :cond_0
    return-object v0
.end method

.method static synthetic e(Lcom/facebook/i/a/d;)Z
    .locals 1

    .prologue
    .line 51
    iget-boolean v0, p0, Lcom/facebook/i/a/d;->p:Z

    return v0
.end method

.method private f()V
    .locals 2

    .prologue
    .line 198
    iget-object v0, p0, Lcom/facebook/i/a/d;->q:Lcom/facebook/auth/c/c;

    if-nez v0, :cond_0

    .line 200
    new-instance v0, Lcom/facebook/i/a/h;

    invoke-direct {v0, p0}, Lcom/facebook/i/a/h;-><init>(Lcom/facebook/i/a/d;)V

    iput-object v0, p0, Lcom/facebook/i/a/d;->q:Lcom/facebook/auth/c/c;

    .line 223
    :cond_0
    iget-object v0, p0, Lcom/facebook/i/a/d;->n:Lcom/facebook/auth/c/b;

    iget-object v1, p0, Lcom/facebook/i/a/d;->q:Lcom/facebook/auth/c/c;

    invoke-virtual {v0, v1}, Lcom/facebook/auth/c/b;->a(Lcom/facebook/c/a/c;)Z

    .line 224
    return-void
.end method

.method static synthetic f(Lcom/facebook/i/a/d;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Lcom/facebook/i/a/d;->g()V

    return-void
.end method

.method static synthetic g(Lcom/facebook/i/a/d;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0}, Lcom/facebook/i/a/d;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private g()V
    .locals 4

    .prologue
    .line 227
    iget-object v0, p0, Lcom/facebook/i/a/d;->b:Lcom/facebook/base/broadcast/j;

    iget-object v1, p0, Lcom/facebook/i/a/d;->r:Landroid/content/Intent;

    invoke-interface {v0, v1}, Lcom/facebook/base/broadcast/j;->a(Landroid/content/Intent;)V

    .line 233
    iget-object v0, p0, Lcom/facebook/i/a/d;->h:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/i/a/d;->s:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 234
    return-void
.end method

.method static synthetic h(Lcom/facebook/i/a/d;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Lcom/facebook/i/a/d;->f()V

    return-void
.end method

.method static synthetic i(Lcom/facebook/i/a/d;)Lcom/facebook/auth/c/c;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/i/a/d;->q:Lcom/facebook/auth/c/c;

    return-object v0
.end method

.method static synthetic j(Lcom/facebook/i/a/d;)Lcom/facebook/auth/c/b;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/i/a/d;->n:Lcom/facebook/auth/c/b;

    return-object v0
.end method

.method static synthetic k(Lcom/facebook/i/a/d;)Lcom/facebook/common/e/h;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/i/a/d;->e:Lcom/facebook/common/e/h;

    return-object v0
.end method

.method static synthetic l(Lcom/facebook/i/a/d;)Ljava/util/concurrent/ConcurrentMap;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/i/a/d;->k:Ljava/util/concurrent/ConcurrentMap;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 137
    new-instance v0, Landroid/os/Messenger;

    new-instance v1, Lcom/facebook/i/a/m;

    iget-object v2, p0, Lcom/facebook/i/a/d;->g:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Lcom/facebook/i/a/m;-><init>(Lcom/facebook/i/a/d;Landroid/os/Looper;Lcom/facebook/i/a/e;)V

    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/facebook/i/a/d;->i:Landroid/os/Messenger;

    .line 138
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/i/a/d;->g:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/facebook/i/a/d;->h:Landroid/os/Handler;

    .line 139
    iget-object v0, p0, Lcom/facebook/i/a/d;->f:Lcom/facebook/i/a/a;

    iget-object v1, p0, Lcom/facebook/i/a/d;->i:Landroid/os/Messenger;

    iput-object v1, v0, Lcom/facebook/i/a/a;->a:Landroid/os/Messenger;

    .line 141
    iget-object v0, p0, Lcom/facebook/i/a/d;->b:Lcom/facebook/base/broadcast/j;

    invoke-interface {v0}, Lcom/facebook/base/broadcast/j;->a()Lcom/facebook/base/broadcast/k;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/i/a/d;->a:Ljava/lang/String;

    new-instance v2, Lcom/facebook/i/a/f;

    invoke-direct {v2, p0}, Lcom/facebook/i/a/f;-><init>(Lcom/facebook/i/a/d;)V

    invoke-interface {v0, v1, v2}, Lcom/facebook/base/broadcast/k;->a(Ljava/lang/String;Lcom/facebook/c/b;)Lcom/facebook/base/broadcast/k;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/i/a/d;->h:Landroid/os/Handler;

    invoke-interface {v0, v1}, Lcom/facebook/base/broadcast/k;->a(Landroid/os/Handler;)Lcom/facebook/base/broadcast/k;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/base/broadcast/k;->a()Lcom/facebook/base/broadcast/l;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/i/a/d;->j:Lcom/facebook/base/broadcast/l;

    .line 150
    iget-object v0, p0, Lcom/facebook/i/a/d;->j:Lcom/facebook/base/broadcast/l;

    invoke-interface {v0}, Lcom/facebook/base/broadcast/l;->b()V

    .line 152
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/i/a/d;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/i/a/d;->r:Landroid/content/Intent;

    .line 153
    iget-object v0, p0, Lcom/facebook/i/a/d;->r:Landroid/content/Intent;

    const-string v1, "peer_info"

    iget-object v2, p0, Lcom/facebook/i/a/d;->f:Lcom/facebook/i/a/a;

    invoke-virtual {v2}, Lcom/facebook/i/a/a;->a()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 156
    invoke-direct {p0}, Lcom/facebook/i/a/d;->c()V

    .line 157
    return-void
.end method

.method public a(ILcom/facebook/i/a/q;)V
    .locals 3

    .prologue
    .line 320
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    iget-object v0, p0, Lcom/facebook/i/a/d;->m:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 322
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The listener for message type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " has already registered"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 325
    :cond_0
    iget-object v0, p0, Lcom/facebook/i/a/d;->m:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    return-void
.end method

.method public a(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 253
    iget-object v0, p0, Lcom/facebook/i/a/d;->k:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 281
    :goto_0
    return-void

    .line 256
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/i/a/d;->b()Lcom/facebook/i/a/a;

    move-result-object v0

    iget v0, v0, Lcom/facebook/i/a/a;->b:I

    iput v0, p1, Landroid/os/Message;->arg1:I

    .line 258
    iget-object v0, p0, Lcom/facebook/i/a/d;->h:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/i/a/i;

    invoke-direct {v1, p0, p1}, Lcom/facebook/i/a/i;-><init>(Lcom/facebook/i/a/d;Landroid/os/Message;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public a(Lcom/facebook/i/a/a;Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 285
    invoke-virtual {p0}, Lcom/facebook/i/a/d;->b()Lcom/facebook/i/a/a;

    move-result-object v0

    iget v0, v0, Lcom/facebook/i/a/a;->b:I

    iput v0, p2, Landroid/os/Message;->arg1:I

    .line 287
    iget-object v0, p0, Lcom/facebook/i/a/d;->h:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/i/a/j;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/i/a/j;-><init>(Lcom/facebook/i/a/d;Lcom/facebook/i/a/a;Landroid/os/Message;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 304
    return-void
.end method

.method public a(Lcom/facebook/i/a/r;)V
    .locals 2

    .prologue
    .line 308
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    iget-object v0, p0, Lcom/facebook/i/a/d;->l:Ljava/util/concurrent/ConcurrentMap;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    return-void
.end method

.method public b()Lcom/facebook/i/a/a;
    .locals 1

    .prologue
    .line 238
    iget-object v0, p0, Lcom/facebook/i/a/d;->f:Lcom/facebook/i/a/a;

    return-object v0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 162
    iget-boolean v0, p0, Lcom/facebook/i/a/d;->p:Z

    if-eqz v0, :cond_0

    .line 164
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    .line 165
    invoke-virtual {p0, v0}, Lcom/facebook/i/a/d;->a(Landroid/os/Message;)V

    .line 166
    iget-object v0, p0, Lcom/facebook/i/a/d;->k:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    .line 167
    invoke-direct {p0}, Lcom/facebook/i/a/d;->c()V

    .line 169
    :cond_0
    return-void
.end method

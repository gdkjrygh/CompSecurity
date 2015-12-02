.class public Lcom/facebook/orca/f/r;
.super Ljava/lang/Object;
.source "SendMessageManager.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/orca/app/g;

.field private final c:Lcom/facebook/fbservice/ops/k;

.field private final d:Lcom/facebook/orca/notify/av;

.field private final e:Lcom/facebook/common/executors/a;

.field private final f:Lcom/facebook/orca/f/ad;

.field private final g:Lcom/facebook/analytics/av;

.field private final h:Lcom/facebook/common/time/a;

.field private final i:Lcom/facebook/common/time/a;

.field private final j:Lcom/facebook/orca/f/ac;

.field private final k:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/google/common/a/gr;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/gr",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation
.end field

.field private final m:Lcom/google/common/a/gr;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/gr",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation
.end field

.field private final n:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation
.end field

.field private final o:Lcom/google/common/a/gr;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/gr",
            "<",
            "Lcom/facebook/user/UserIdentifierKey;",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation
.end field

.field private final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation
.end field

.field private final q:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final r:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/messages/threads/model/ThreadViewSpec;",
            "Lcom/facebook/fbservice/service/ServiceException;",
            ">;"
        }
    .end annotation
.end field

.field private final s:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private t:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 93
    const-class v0, Lcom/facebook/orca/f/r;

    sput-object v0, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/app/g;Lcom/facebook/fbservice/ops/k;Lcom/facebook/orca/notify/av;Lcom/facebook/common/executors/a;Lcom/facebook/orca/f/ad;Lcom/facebook/analytics/av;Lcom/facebook/common/time/a;Lcom/facebook/common/time/a;Lcom/facebook/orca/f/ac;Ljavax/inject/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/app/g;",
            "Lcom/facebook/fbservice/ops/k;",
            "Lcom/facebook/orca/notify/av;",
            "Lcom/facebook/common/executors/a;",
            "Lcom/facebook/orca/f/ad;",
            "Lcom/facebook/analytics/av;",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/orca/f/ac;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 162
    iput-object p1, p0, Lcom/facebook/orca/f/r;->b:Lcom/facebook/orca/app/g;

    .line 163
    iput-object p2, p0, Lcom/facebook/orca/f/r;->c:Lcom/facebook/fbservice/ops/k;

    .line 164
    iput-object p3, p0, Lcom/facebook/orca/f/r;->d:Lcom/facebook/orca/notify/av;

    .line 165
    iput-object p4, p0, Lcom/facebook/orca/f/r;->e:Lcom/facebook/common/executors/a;

    .line 166
    iput-object p5, p0, Lcom/facebook/orca/f/r;->f:Lcom/facebook/orca/f/ad;

    .line 167
    iput-object p6, p0, Lcom/facebook/orca/f/r;->g:Lcom/facebook/analytics/av;

    .line 168
    iput-object p7, p0, Lcom/facebook/orca/f/r;->h:Lcom/facebook/common/time/a;

    .line 169
    iput-object p8, p0, Lcom/facebook/orca/f/r;->i:Lcom/facebook/common/time/a;

    .line 170
    iput-object p10, p0, Lcom/facebook/orca/f/r;->k:Ljavax/inject/a;

    .line 171
    iput-object p9, p0, Lcom/facebook/orca/f/r;->j:Lcom/facebook/orca/f/ac;

    .line 172
    invoke-static {}, Lcom/google/common/a/gr;->m()Lcom/google/common/a/gr;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/r;->l:Lcom/google/common/a/gr;

    .line 173
    invoke-static {}, Lcom/google/common/a/gr;->m()Lcom/google/common/a/gr;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/r;->m:Lcom/google/common/a/gr;

    .line 174
    invoke-static {}, Lcom/google/common/a/kl;->b()Ljava/util/LinkedHashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/r;->n:Ljava/util/LinkedHashSet;

    .line 175
    invoke-static {}, Lcom/google/common/a/gr;->m()Lcom/google/common/a/gr;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/r;->o:Lcom/google/common/a/gr;

    .line 176
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    const-wide/16 v1, 0x12c

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/common/a/hy;->a(JLjava/util/concurrent/TimeUnit;)Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/r;->q:Ljava/util/concurrent/ConcurrentMap;

    .line 177
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    const-wide/16 v1, 0x258

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/common/a/hy;->a(JLjava/util/concurrent/TimeUnit;)Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/r;->r:Ljava/util/concurrent/ConcurrentMap;

    .line 178
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/r;->s:Ljava/util/Set;

    .line 179
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/r;->p:Ljava/util/List;

    .line 180
    return-void
.end method

.method private a(Lcom/facebook/user/UserIdentifierKey;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/user/UserIdentifierKey;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation

    .prologue
    .line 284
    iget-object v0, p0, Lcom/facebook/orca/f/r;->e:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 285
    iget-object v0, p0, Lcom/facebook/orca/f/r;->o:Lcom/google/common/a/gr;

    invoke-virtual {v0, p1}, Lcom/google/common/a/gr;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    .line 286
    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/f/r;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/orca/f/r;->s:Ljava/util/Set;

    return-object v0
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 585
    sget-object v0, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v1, "onSendSuccess"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 586
    iget-object v0, p0, Lcom/facebook/orca/f/r;->e:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 587
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/f/r;->t:Z

    .line 588
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->g()Landroid/os/Bundle;

    move-result-object v0

    .line 589
    if-eqz v0, :cond_0

    const-string v1, "hasMoreQueuedMessages"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 590
    const-string v1, "threadId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 591
    iget-object v1, p0, Lcom/facebook/orca/f/r;->n:Ljava/util/LinkedHashSet;

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    .line 593
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/f/r;->b()V

    .line 594
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;Lcom/facebook/messages/model/threads/Message;)V
    .locals 4

    .prologue
    .line 358
    sget-object v0, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v1, "onQueuedSuccess %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    iget-object v0, p0, Lcom/facebook/orca/f/r;->e:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 360
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    .line 361
    iget-object v1, p0, Lcom/facebook/orca/f/r;->l:Lcom/google/common/a/gr;

    invoke-virtual {v1, v0, p2}, Lcom/google/common/a/gr;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 362
    if-eqz v1, :cond_0

    .line 363
    sget-object v1, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v2, "Adding to data structures"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 364
    iget-object v1, p0, Lcom/facebook/orca/f/r;->n:Ljava/util/LinkedHashSet;

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    .line 365
    iget-object v1, p0, Lcom/facebook/orca/f/r;->m:Lcom/google/common/a/gr;

    invoke-virtual {v1, v0, p2}, Lcom/google/common/a/gr;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 367
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/f/r;->b()V

    .line 368
    iget-object v0, p0, Lcom/facebook/orca/f/r;->b:Lcom/facebook/orca/app/g;

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;)V

    .line 369
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;Lcom/facebook/messages/model/threads/Message;)V
    .locals 2

    .prologue
    .line 380
    sget-object v0, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v1, "onQueuedFailure"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 381
    iget-object v0, p0, Lcom/facebook/orca/f/r;->e:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 382
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    .line 383
    iget-object v1, p0, Lcom/facebook/orca/f/r;->l:Lcom/google/common/a/gr;

    invoke-virtual {v1, v0, p2}, Lcom/google/common/a/gr;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 384
    iget-object v1, p0, Lcom/facebook/orca/f/r;->b:Lcom/facebook/orca/app/g;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;)V

    .line 385
    invoke-virtual {p0, v0}, Lcom/facebook/orca/f/r;->b(Ljava/lang/String;)V

    .line 386
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 687
    sget-object v0, Lcom/facebook/fbservice/service/t;->PHOTO_UPLOAD_NOT_COMPLETE:Lcom/facebook/fbservice/service/t;

    if-ne p1, v0, :cond_0

    .line 688
    sget-object v0, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v1, "onSendFailure - Incomplete photo upload"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 689
    iget-object v0, p0, Lcom/facebook/orca/f/r;->e:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 690
    iput-boolean v2, p0, Lcom/facebook/orca/f/r;->t:Z

    .line 692
    iget-object v0, p0, Lcom/facebook/orca/f/r;->n:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    .line 693
    iget-object v0, p0, Lcom/facebook/orca/f/r;->p:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 694
    invoke-direct {p0}, Lcom/facebook/orca/f/r;->b()V

    .line 696
    :cond_0
    sget-object v0, Lcom/facebook/fbservice/service/t;->PHOTO_UPLOAD_FAILED:Lcom/facebook/fbservice/service/t;

    if-ne p1, v0, :cond_1

    .line 697
    sget-object v0, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v1, "onSendFailure - Photo upload failed"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 698
    iget-object v0, p0, Lcom/facebook/orca/f/r;->e:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 699
    iput-boolean v2, p0, Lcom/facebook/orca/f/r;->t:Z

    .line 701
    iget-object v0, p0, Lcom/facebook/orca/f/r;->n:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    .line 702
    iget-object v0, p0, Lcom/facebook/orca/f/r;->p:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 703
    invoke-direct {p0}, Lcom/facebook/orca/f/r;->b()V

    .line 704
    iget-object v0, p0, Lcom/facebook/orca/f/r;->b:Lcom/facebook/orca/app/g;

    invoke-virtual {v0, p2}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;)V

    .line 706
    iget-object v0, p0, Lcom/facebook/orca/f/r;->d:Lcom/facebook/orca/notify/av;

    invoke-virtual {v0, p2}, Lcom/facebook/orca/notify/av;->a(Ljava/lang/String;)V

    .line 708
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/f/r;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 91
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/r;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/f/r;Lcom/facebook/fbservice/service/OperationResult;Lcom/facebook/messages/model/threads/Message;)V
    .locals 0

    .prologue
    .line 91
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/f/r;->a(Lcom/facebook/fbservice/service/OperationResult;Lcom/facebook/messages/model/threads/Message;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/f/r;Lcom/facebook/fbservice/service/ServiceException;Lcom/facebook/messages/model/threads/Message;)V
    .locals 0

    .prologue
    .line 91
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/f/r;->a(Lcom/facebook/fbservice/service/ServiceException;Lcom/facebook/messages/model/threads/Message;)V

    return-void
.end method

.method private a(Ljava/util/Set;Lcom/facebook/messages/model/threads/Message;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;",
            "Lcom/facebook/messages/model/threads/Message;",
            ")V"
        }
    .end annotation

    .prologue
    .line 748
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 749
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 750
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 751
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->x()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->x()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 753
    sget-object v0, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v2, "Clearing out equivalent sent message %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    invoke-static {v0, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 754
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 757
    :cond_1
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/t;)Z
    .locals 1

    .prologue
    .line 682
    sget-object v0, Lcom/facebook/fbservice/service/t;->PHOTO_UPLOAD_NOT_COMPLETE:Lcom/facebook/fbservice/service/t;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/facebook/fbservice/service/t;->PHOTO_UPLOAD_FAILED:Lcom/facebook/fbservice/service/t;

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/f/r;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/orca/f/r;->k:Ljavax/inject/a;

    return-object v0
.end method

.method private b()V
    .locals 4

    .prologue
    .line 532
    iget-object v0, p0, Lcom/facebook/orca/f/r;->e:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 533
    iget-boolean v0, p0, Lcom/facebook/orca/f/r;->t:Z

    if-eqz v0, :cond_0

    .line 535
    sget-object v0, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v1, "Send already in progress"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 565
    :goto_0
    return-void

    .line 540
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/f/r;->c()Ljava/lang/String;

    move-result-object v0

    .line 541
    if-nez v0, :cond_1

    .line 543
    sget-object v0, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v1, "No messages to send"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 547
    :cond_1
    sget-object v1, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v2, "Starting send"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 548
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 549
    const-string v2, "threadId"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 550
    iget-object v2, p0, Lcom/facebook/orca/f/r;->c:Lcom/facebook/fbservice/ops/k;

    sget-object v3, Lcom/facebook/orca/server/aq;->w:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v2, v3, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v1

    .line 553
    new-instance v2, Lcom/facebook/orca/f/u;

    invoke-direct {v2, p0, v0}, Lcom/facebook/orca/f/u;-><init>(Lcom/facebook/orca/f/r;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 564
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/f/r;->t:Z

    goto :goto_0
.end method

.method private b(Lcom/facebook/fbservice/service/OperationResult;Lcom/facebook/messages/model/threads/Message;)V
    .locals 8

    .prologue
    .line 452
    iget-object v0, p0, Lcom/facebook/orca/f/r;->e:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 454
    sget-object v0, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v1, "onCreateThreadSuccess"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 456
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->G()Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    .line 457
    invoke-virtual {v0}, Lcom/facebook/user/RecipientInfo;->a()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v1

    .line 458
    iget-object v0, p0, Lcom/facebook/orca/f/r;->o:Lcom/google/common/a/gr;

    invoke-virtual {v0, v1, p2}, Lcom/google/common/a/gr;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 460
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->h()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 461
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 462
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    .line 465
    iget-object v0, p0, Lcom/facebook/orca/f/r;->o:Lcom/google/common/a/gr;

    invoke-virtual {v0, v1}, Lcom/google/common/a/gr;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    .line 466
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 469
    iget-object v5, p0, Lcom/facebook/orca/f/r;->h:Lcom/facebook/common/time/a;

    invoke-interface {v5}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v5

    .line 470
    new-instance v7, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v7}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v7, v0}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/messages/model/threads/e;->b(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/user/RecipientInfo;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Lcom/facebook/messages/model/threads/e;->a(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Lcom/facebook/messages/model/threads/e;->b(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 477
    invoke-direct {p0, v0}, Lcom/facebook/orca/f/r;->b(Lcom/facebook/messages/model/threads/Message;)V

    goto :goto_0

    .line 479
    :cond_0
    invoke-interface {v3}, Ljava/util/Set;->clear()V

    .line 483
    iget-object v0, p0, Lcom/facebook/orca/f/r;->j:Lcom/facebook/orca/f/ac;

    invoke-static {v2}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/orca/f/ac;->b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 485
    iget-object v0, p0, Lcom/facebook/orca/f/r;->b:Lcom/facebook/orca/app/g;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/app/g;->a(Lcom/facebook/user/UserIdentifierKey;Ljava/lang/String;)V

    .line 486
    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/ServiceException;Lcom/facebook/messages/model/threads/Message;)V
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 497
    iget-object v0, p0, Lcom/facebook/orca/f/r;->e:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 499
    sget-object v0, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v1, "onCreateThreadFailure"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 502
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 503
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->g()Landroid/os/Bundle;

    move-result-object v0

    .line 504
    if-eqz v0, :cond_2

    .line 505
    const-string v1, "result"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    .line 506
    instance-of v1, v0, Lcom/facebook/messages/model/threads/Message;

    if-eqz v1, :cond_2

    .line 507
    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    move-object v1, v0

    .line 511
    :goto_0
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->G()Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    .line 512
    invoke-virtual {v0}, Lcom/facebook/user/RecipientInfo;->a()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v4

    .line 513
    iget-object v0, p0, Lcom/facebook/orca/f/r;->o:Lcom/google/common/a/gr;

    invoke-virtual {v0, v4}, Lcom/google/common/a/gr;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    .line 514
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v5

    .line 515
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 516
    sget-object v3, Lcom/facebook/messages/model/threads/SendError;->d:Lcom/facebook/messages/model/threads/SendError;

    .line 517
    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 518
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->K()Lcom/facebook/messages/model/threads/SendError;

    move-result-object v3

    .line 520
    :cond_0
    new-instance v7, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v7}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v7, v0}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    const/16 v7, 0x385

    invoke-virtual {v0, v7}, Lcom/facebook/messages/model/threads/e;->a(I)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/SendError;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 525
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 527
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/f/r;->o:Lcom/google/common/a/gr;

    invoke-virtual {v0, v4, v5}, Lcom/google/common/a/gr;->a(Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 528
    iget-object v0, p0, Lcom/facebook/orca/f/r;->b:Lcom/facebook/orca/app/g;

    invoke-virtual {v0, v4, v2}, Lcom/facebook/orca/app/g;->a(Lcom/facebook/user/UserIdentifierKey;Ljava/lang/String;)V

    .line 529
    return-void

    :cond_2
    move-object v1, v2

    goto :goto_0
.end method

.method private b(Lcom/facebook/messages/model/threads/Message;)V
    .locals 1

    .prologue
    .line 304
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 305
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/r;->c(Lcom/facebook/messages/model/threads/Message;)V

    .line 309
    :goto_0
    return-void

    .line 307
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/r;->d(Lcom/facebook/messages/model/threads/Message;)V

    goto :goto_0
.end method

.method private b(Lcom/facebook/messages/model/threads/Message;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 803
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "send_message"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "trigger"

    invoke-virtual {v0, v1, p3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 807
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 808
    const-string v1, "thread"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 813
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/f/r;->g:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 814
    return-void

    .line 810
    :cond_0
    const-string v1, "user_identifier"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->G()Lcom/facebook/user/RecipientInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/user/RecipientInfo;->a()Lcom/facebook/user/UserIdentifier;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/user/UserIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v2

    iget-object v2, v2, Lcom/facebook/user/UserIdentifierKey;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/f/r;Lcom/facebook/fbservice/service/OperationResult;Lcom/facebook/messages/model/threads/Message;)V
    .locals 0

    .prologue
    .line 91
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/f/r;->b(Lcom/facebook/fbservice/service/OperationResult;Lcom/facebook/messages/model/threads/Message;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/f/r;Lcom/facebook/fbservice/service/ServiceException;Lcom/facebook/messages/model/threads/Message;)V
    .locals 0

    .prologue
    .line 91
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/f/r;->b(Lcom/facebook/fbservice/service/ServiceException;Lcom/facebook/messages/model/threads/Message;)V

    return-void
.end method

.method private b(Ljava/lang/String;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 3

    .prologue
    .line 728
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "send_failure"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 729
    const-string v1, "thread_id"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 730
    if-eqz p2, :cond_0

    .line 731
    const-string v1, "error_message"

    invoke-virtual {p2}, Lcom/facebook/fbservice/service/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 732
    invoke-virtual {p2}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 733
    const-string v1, "error_code"

    invoke-virtual {p2}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/fbservice/service/t;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 736
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/f/r;->g:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 737
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/f/r;)Lcom/facebook/orca/f/ad;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/orca/f/r;->f:Lcom/facebook/orca/f/ad;

    return-object v0
.end method

.method private c()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 568
    iget-object v0, p0, Lcom/facebook/orca/f/r;->e:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 569
    iget-object v0, p0, Lcom/facebook/orca/f/r;->n:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 581
    :goto_0
    return-object v0

    .line 573
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/f/r;->n:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 574
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 575
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 576
    iget-object v3, p0, Lcom/facebook/orca/f/r;->p:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 577
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 581
    goto :goto_0
.end method

.method private c(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation

    .prologue
    .line 266
    iget-object v0, p0, Lcom/facebook/orca/f/r;->e:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 267
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/r;->d(Ljava/lang/String;)V

    .line 268
    iget-object v0, p0, Lcom/facebook/orca/f/r;->m:Lcom/google/common/a/gr;

    invoke-virtual {v0, p1}, Lcom/google/common/a/gr;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/f/r;->l:Lcom/google/common/a/gr;

    invoke-virtual {v1, p1}, Lcom/google/common/a/gr;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/a/gb;->a(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    .line 274
    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private c(Lcom/facebook/messages/model/threads/Message;)V
    .locals 5

    .prologue
    .line 318
    iget-object v0, p0, Lcom/facebook/orca/f/r;->s:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 320
    iget-object v0, p0, Lcom/facebook/orca/f/r;->e:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 321
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    .line 323
    sget-object v1, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v2, "Starting send %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    iget-object v1, p0, Lcom/facebook/orca/f/r;->m:Lcom/google/common/a/gr;

    invoke-virtual {v1, v0}, Lcom/google/common/a/gr;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p0, v1, p1}, Lcom/facebook/orca/f/r;->a(Ljava/util/Set;Lcom/facebook/messages/model/threads/Message;)V

    .line 326
    iget-object v1, p0, Lcom/facebook/orca/f/r;->l:Lcom/google/common/a/gr;

    invoke-virtual {v1, v0}, Lcom/google/common/a/gr;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    .line 327
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 329
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 330
    const-string v1, "outgoingMessage"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 331
    iget-object v1, p0, Lcom/facebook/orca/f/r;->c:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->x:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 334
    new-instance v1, Lcom/facebook/orca/f/s;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/f/s;-><init>(Lcom/facebook/orca/f/r;Lcom/facebook/messages/model/threads/Message;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 347
    iget-object v0, p0, Lcom/facebook/orca/f/r;->q:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/f/r;->i:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    iget-object v0, p0, Lcom/facebook/orca/f/r;->b:Lcom/facebook/orca/app/g;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;)V

    .line 349
    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/f/r;)Lcom/facebook/orca/notify/av;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/orca/f/r;->d:Lcom/facebook/orca/notify/av;

    return-object v0
.end method

.method private d(Lcom/facebook/messages/model/threads/Message;)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 394
    iget-object v0, p0, Lcom/facebook/orca/f/r;->e:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 396
    sget-object v0, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v3, "Starting send %s"

    new-array v4, v2, [Ljava/lang/Object;

    aput-object p1, v4, v1

    invoke-static {v0, v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->G()Lcom/facebook/user/RecipientInfo;

    move-result-object v3

    .line 399
    invoke-virtual {v3}, Lcom/facebook/user/RecipientInfo;->a()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v4

    .line 401
    iget-object v0, p0, Lcom/facebook/orca/f/r;->o:Lcom/google/common/a/gr;

    invoke-virtual {v0, v4}, Lcom/google/common/a/gr;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    .line 402
    invoke-direct {p0, v5, p1}, Lcom/facebook/orca/f/r;->a(Ljava/util/Set;Lcom/facebook/messages/model/threads/Message;)V

    .line 406
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 407
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->u()I

    move-result v0

    const/16 v7, 0x384

    if-ne v0, v7, :cond_0

    move v0, v1

    .line 412
    :goto_0
    invoke-interface {v5, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 414
    if-eqz v0, :cond_1

    .line 415
    new-instance v0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;

    invoke-static {v3}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {v0, v8, p1, v1}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;-><init>(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Ljava/util/List;)V

    .line 421
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 422
    const-string v2, "createThreadParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 423
    iget-object v0, p0, Lcom/facebook/orca/f/r;->c:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->e:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 426
    new-instance v1, Lcom/facebook/orca/f/t;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/f/t;-><init>(Lcom/facebook/orca/f/r;Lcom/facebook/messages/model/threads/Message;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 439
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/f/r;->q:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/f/r;->i:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    iget-object v0, p0, Lcom/facebook/orca/f/r;->b:Lcom/facebook/orca/app/g;

    invoke-virtual {v0, v4, v8}, Lcom/facebook/orca/app/g;->a(Lcom/facebook/user/UserIdentifierKey;Ljava/lang/String;)V

    .line 441
    return-void

    :cond_2
    move v0, v2

    goto :goto_0
.end method

.method private d(Ljava/lang/String;)V
    .locals 9

    .prologue
    .line 786
    iget-object v0, p0, Lcom/facebook/orca/f/r;->m:Lcom/google/common/a/gr;

    invoke-virtual {v0, p1}, Lcom/google/common/a/gr;->f(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 800
    :cond_0
    return-void

    .line 789
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/f/r;->m:Lcom/google/common/a/gr;

    invoke-virtual {v0, p1}, Lcom/google/common/a/gr;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    .line 790
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 791
    iget-object v0, p0, Lcom/facebook/orca/f/r;->i:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    .line 792
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 793
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 794
    iget-object v1, p0, Lcom/facebook/orca/f/r;->q:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    .line 795
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    sub-long v5, v3, v5

    const-wide/16 v7, 0x7530

    cmp-long v1, v5, v7

    if-lez v1, :cond_2

    .line 796
    :cond_3
    sget-object v1, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v5, "Clearing out expired recently sent message %s"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    invoke-static {v1, v5, v6}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 797
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/threads/model/ThreadViewSpec;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation

    .prologue
    .line 249
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 250
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/f/r;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 253
    :goto_0
    return-object v0

    .line 251
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 252
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->e()Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/RecipientInfo;->a()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v0

    .line 253
    invoke-direct {p0, v0}, Lcom/facebook/orca/f/r;->a(Lcom/facebook/user/UserIdentifierKey;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 255
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 236
    iget-object v0, p0, Lcom/facebook/orca/f/r;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 237
    invoke-direct {p0}, Lcom/facebook/orca/f/r;->b()V

    .line 238
    return-void
.end method

.method public a(Lcom/facebook/messages/model/threads/Message;)V
    .locals 4

    .prologue
    .line 218
    iget-object v0, p0, Lcom/facebook/orca/f/r;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 219
    iget-object v0, p0, Lcom/facebook/orca/f/r;->h:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    .line 220
    new-instance v2, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v2}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v2, p1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    const/16 v3, 0x384

    invoke-virtual {v2, v3}, Lcom/facebook/messages/model/threads/e;->a(I)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    sget-object v3, Lcom/facebook/messages/model/threads/SendError;->a:Lcom/facebook/messages/model/threads/SendError;

    invoke-virtual {v2, v3}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/SendError;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/facebook/messages/model/threads/e;->a(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/facebook/messages/model/threads/e;->b(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 227
    invoke-direct {p0, v0}, Lcom/facebook/orca/f/r;->b(Lcom/facebook/messages/model/threads/Message;)V

    .line 228
    return-void
.end method

.method public a(Lcom/facebook/messages/model/threads/Message;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 190
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/f/r;->b(Lcom/facebook/messages/model/threads/Message;Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    if-eqz p3, :cond_2

    .line 193
    new-instance v0, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v0}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v0, p1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    .line 194
    const-string v1, "trigger"

    invoke-virtual {v0, v1, p3}, Lcom/facebook/messages/model/threads/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    .line 195
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 198
    :goto_0
    const/4 v1, 0x2

    invoke-static {v1}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 199
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Sending message"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 200
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " thread:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    const-string v2, " trigger:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    if-eqz p3, :cond_0

    .line 203
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    :cond_0
    sget-object v2, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 208
    :cond_1
    invoke-direct {p0, v0}, Lcom/facebook/orca/f/r;->b(Lcom/facebook/messages/model/threads/Message;)V

    .line 209
    return-void

    :cond_2
    move-object v0, p1

    goto :goto_0
.end method

.method protected a(Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 716
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "spurious_send_failure"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 717
    const-string v1, "thread_id"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 718
    iget-object v1, p0, Lcom/facebook/orca/f/r;->g:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 719
    return-void
.end method

.method a(Ljava/lang/String;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 5
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 599
    invoke-virtual {p2}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/f/r;->a(Lcom/facebook/fbservice/service/t;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 600
    invoke-virtual {p2}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/f/r;->a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)V

    .line 679
    :cond_0
    :goto_0
    return-void

    .line 605
    :cond_1
    sget-object v0, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v1, "onSendFailure"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 606
    iget-object v0, p0, Lcom/facebook/orca/f/r;->e:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 607
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/f/r;->t:Z

    .line 608
    iget-object v0, p0, Lcom/facebook/orca/f/r;->r:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/f/r;->b(Ljava/lang/String;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 611
    invoke-direct {p0}, Lcom/facebook/orca/f/r;->b()V

    .line 612
    iget-object v0, p0, Lcom/facebook/orca/f/r;->b:Lcom/facebook/orca/app/g;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;)V

    .line 615
    const/4 v1, 0x0

    .line 616
    invoke-virtual {p2}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 617
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->g()Landroid/os/Bundle;

    move-result-object v0

    .line 618
    if-eqz v0, :cond_4

    .line 619
    const-string v2, "result"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    .line 620
    instance-of v2, v0, Lcom/facebook/messages/model/threads/Message;

    if-eqz v2, :cond_4

    .line 621
    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 627
    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    .line 629
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/f/r;->d:Lcom/facebook/orca/notify/av;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/notify/av;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 637
    :cond_3
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v0

    .line 638
    iget-object v1, p0, Lcom/facebook/orca/f/r;->s:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    .line 639
    if-eqz v1, :cond_0

    .line 643
    iget-object v1, p0, Lcom/facebook/orca/f/r;->e:Lcom/facebook/common/executors/a;

    new-instance v2, Lcom/facebook/orca/f/v;

    invoke-direct {v2, p0, v0, p1}, Lcom/facebook/orca/f/v;-><init>(Lcom/facebook/orca/f/r;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v3, 0x2710

    invoke-interface {v1, v2, v3, v4}, Lcom/facebook/common/executors/a;->a(Ljava/lang/Runnable;J)V

    goto :goto_0

    :cond_4
    move-object v0, v1

    goto :goto_1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 767
    iget-object v0, p0, Lcom/facebook/orca/f/r;->m:Lcom/google/common/a/gr;

    invoke-virtual {v0, p1}, Lcom/google/common/a/gr;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    .line 768
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 769
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 770
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 771
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->x()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p2}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 773
    sget-object v0, Lcom/facebook/orca/f/r;->a:Ljava/lang/Class;

    const-string v2, "Clearing out sent message with offlineThreadId %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    invoke-static {v0, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 774
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 777
    :cond_1
    return-void
.end method

.method public b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/fbservice/service/ServiceException;
    .locals 1

    .prologue
    .line 295
    iget-object v0, p0, Lcom/facebook/orca/f/r;->r:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/ServiceException;

    return-object v0
.end method

.method protected b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 722
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "queue_failure"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 723
    const-string v1, "thread_id"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 724
    iget-object v1, p0, Lcom/facebook/orca/f/r;->g:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 725
    return-void
.end method

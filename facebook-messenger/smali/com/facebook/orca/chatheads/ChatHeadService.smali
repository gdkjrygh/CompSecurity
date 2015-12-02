.class public Lcom/facebook/orca/chatheads/ChatHeadService;
.super Lcom/facebook/base/d/b;
.source "ChatHeadService.java"

# interfaces
.implements Lcom/facebook/base/b/b;
.implements Lcom/facebook/common/d/c;


# annotations
.annotation runtime Lcom/facebook/common/process/Multiprocess;
    affinity = .enum Lcom/facebook/common/process/b;->Single:Lcom/facebook/common/process/b;
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

.field private static final b:I


# instance fields
.field private c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/chatheads/al;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/facebook/common/executors/a;

.field private e:Landroid/view/WindowManager;

.field private f:Landroid/app/KeyguardManager;

.field private g:Lcom/facebook/orca/chatheads/al;

.field private h:Lcom/facebook/prefs/shared/d;

.field private i:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/facebook/orca/chatheads/bz;

.field private k:Lcom/facebook/prefs/shared/f;

.field private l:Lcom/facebook/e/s;

.field private m:Lcom/facebook/c/k;

.field private n:Lcom/facebook/base/broadcast/q;

.field private o:I

.field private p:Landroid/content/res/Configuration;

.field private q:Z

.field private r:Z

.field private s:I

.field private t:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private u:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/common/d/e;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this while onDestroyEntered == false"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 66
    const-class v0, Lcom/facebook/orca/chatheads/ChatHeadService;

    sput-object v0, Lcom/facebook/orca/chatheads/ChatHeadService;->a:Ljava/lang/Class;

    .line 76
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    const/16 v0, 0x7d2

    :goto_0
    sput v0, Lcom/facebook/orca/chatheads/ChatHeadService;->b:I

    return-void

    :cond_0
    const/16 v0, 0x7d7

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 63
    invoke-direct {p0}, Lcom/facebook/base/d/b;-><init>()V

    .line 96
    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->q:Z

    .line 97
    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->r:Z

    .line 101
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->t:Z

    return-void
.end method

.method private static a(Landroid/content/Intent;)Landroid/content/Intent;
    .locals 2

    .prologue
    .line 111
    invoke-virtual {p0}, Landroid/content/Intent;->getFlags()I

    move-result v0

    const/high16 v1, 0x10000000

    or-int/2addr v0, v1

    .line 112
    invoke-virtual {p0, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 113
    return-object p0
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 506
    iget v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->s:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    if-eqz v0, :cond_0

    .line 507
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/al;->a(I)Lcom/google/common/d/a/s;

    .line 509
    :cond_0
    iget v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->s:I

    or-int/2addr v0, p1

    iput v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->s:I

    .line 510
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;)V
    .locals 1

    .prologue
    .line 446
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    .line 449
    if-nez v0, :cond_0

    .line 455
    :goto_0
    return-void

    .line 453
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->e()V

    .line 454
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/messages/model/threads/Message;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 1

    .prologue
    .line 458
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->e()V

    .line 459
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/google/common/d/a/s;

    .line 460
    return-void
.end method

.method private a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 465
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->e()V

    .line 466
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->b(I)V

    .line 467
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V

    .line 468
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ChatHeadService;Lcom/facebook/common/d/e;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ChatHeadService;->b(Lcom/facebook/common/d/e;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ChatHeadService;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ChatHeadService;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 521
    const-string v0, "lock"

    invoke-static {p1, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 522
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 523
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    const-string v2, "close_sys_dialogs"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/chatheads/al;->a(Ljava/lang/String;)V

    .line 524
    if-eqz v0, :cond_0

    .line 525
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->n()V

    .line 528
    :cond_0
    return-void
.end method

.method private a(Z)V
    .locals 1

    .prologue
    .line 274
    iput-boolean p1, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->q:Z

    .line 275
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    if-eqz v0, :cond_0

    .line 276
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/al;->a(Z)V

    .line 278
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ChatHeadService;)Z
    .locals 1

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->f()Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/ChatHeadService;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->i:Ljavax/inject/a;

    return-object v0
.end method

.method private b()V
    .locals 5

    .prologue
    .line 173
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->m:Lcom/facebook/c/k;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 175
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 176
    const-string v1, "android.intent.action.CLOSE_SYSTEM_DIALOGS"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 177
    const-string v1, "android.intent.action.USER_PRESENT"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 179
    new-instance v1, Lcom/facebook/c/k;

    new-instance v2, Lcom/google/common/a/ew;

    invoke-direct {v2}, Lcom/google/common/a/ew;-><init>()V

    const-string v3, "android.intent.action.CLOSE_SYSTEM_DIALOGS"

    new-instance v4, Lcom/facebook/orca/chatheads/q;

    invoke-direct {v4, p0}, Lcom/facebook/orca/chatheads/q;-><init>(Lcom/facebook/orca/chatheads/ChatHeadService;)V

    invoke-virtual {v2, v3, v4}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v2

    const-string v3, "android.intent.action.USER_PRESENT"

    new-instance v4, Lcom/facebook/orca/chatheads/p;

    invoke-direct {v4, p0}, Lcom/facebook/orca/chatheads/p;-><init>(Lcom/facebook/orca/chatheads/ChatHeadService;)V

    invoke-virtual {v2, v3, v4}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/c/k;-><init>(Ljava/util/Map;)V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->m:Lcom/facebook/c/k;

    .line 198
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->m:Lcom/facebook/c/k;

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 199
    return-void

    .line 173
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(I)V
    .locals 2

    .prologue
    .line 513
    iget v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->s:I

    xor-int/lit8 v1, p1, -0x1

    and-int/2addr v0, v1

    iput v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->s:I

    .line 515
    iget v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->s:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    if-eqz v0, :cond_0

    .line 516
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/al;->b(I)V

    .line 518
    :cond_0
    return-void
.end method

.method private b(Landroid/content/Intent;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 290
    const-string v0, "com.facebook.orca.chatheads.EXTRA_HIDE_ON_FULL_SCREEN"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 291
    const-string v0, "com.facebook.orca.chatheads.EXTRA_HIDE_ON_FULL_SCREEN"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->a(Z)V

    .line 294
    :cond_0
    const-string v0, "com.facebook.orca.chatheads.EXTRA_HIDE_ON_LOCK_SCREEN"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 295
    const-string v0, "com.facebook.orca.chatheads.EXTRA_HIDE_ON_FULL_SCREEN"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->b(Z)V

    .line 297
    :cond_1
    return-void
.end method

.method private declared-synchronized b(Lcom/facebook/common/d/e;)V
    .locals 1

    .prologue
    .line 686
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->t:Z

    if-nez v0, :cond_0

    .line 687
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->u:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 689
    :cond_0
    monitor-exit p0

    return-void

    .line 686
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private b(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 481
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    if-eqz v0, :cond_1

    const-string v0, "read_on_web"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 483
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V

    .line 489
    :cond_0
    :goto_0
    return-void

    .line 485
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 486
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/chatheads/al;->c(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private b(Z)V
    .locals 1

    .prologue
    .line 281
    iput-boolean p1, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->r:Z

    .line 282
    if-nez p1, :cond_1

    .line 283
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->b(I)V

    .line 287
    :cond_0
    :goto_0
    return-void

    .line 284
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->f:Landroid/app/KeyguardManager;

    invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 285
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->n()V

    goto :goto_0
.end method

.method private c()V
    .locals 2

    .prologue
    .line 202
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->n:Lcom/facebook/base/broadcast/q;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 204
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 205
    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 207
    new-instance v1, Lcom/facebook/orca/chatheads/r;

    invoke-direct {v1, p0, p0, v0}, Lcom/facebook/orca/chatheads/r;-><init>(Lcom/facebook/orca/chatheads/ChatHeadService;Landroid/content/Context;Landroid/content/IntentFilter;)V

    iput-object v1, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->n:Lcom/facebook/base/broadcast/q;

    .line 216
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->n:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->a()V

    .line 217
    return-void

    .line 202
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 337
    const-string v0, "com.facebook.orca.chatheads.EXTRA_MESSAGE_NOTIFIED"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 338
    const-string v0, "com.facebook.orca.chatheads.EXTRA_MESSAGE_NOTIFIED"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 339
    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->a(Lcom/facebook/messages/model/threads/Message;)V

    .line 341
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/chatheads/ChatHeadService;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->g()V

    return-void
.end method

.method private d()V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 220
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    if-nez v0, :cond_2

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 222
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/al;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    .line 223
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    iget-boolean v2, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->q:Z

    invoke-virtual {v0, v2}, Lcom/facebook/orca/chatheads/al;->a(Z)V

    .line 224
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    new-instance v2, Lcom/facebook/orca/chatheads/s;

    invoke-direct {v2, p0}, Lcom/facebook/orca/chatheads/s;-><init>(Lcom/facebook/orca/chatheads/ChatHeadService;)V

    invoke-virtual {v0, v2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/bs;)V

    .line 244
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->a()V

    .line 246
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->f:Landroid/app/KeyguardManager;

    invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 249
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->n()V

    .line 252
    :cond_0
    iget v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->s:I

    if-eqz v0, :cond_1

    .line 253
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/al;->a(I)Lcom/google/common/d/a/s;

    .line 255
    :cond_1
    return-void

    .line 220
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 349
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ChatHeadService;->h(Landroid/content/Intent;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 350
    if-nez v0, :cond_0

    .line 351
    sget-object v0, Lcom/facebook/orca/chatheads/ChatHeadService;->a:Ljava/lang/Class;

    const-string v1, "Received ACTION_POPUP_CHAT_HEAD with no thread. Dropping intent."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 355
    :goto_0
    return-void

    .line 354
    :cond_0
    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/facebook/orca/chatheads/ChatHeadService;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->o()V

    return-void
.end method

.method private e()V
    .locals 1

    .prologue
    .line 261
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    if-nez v0, :cond_0

    .line 262
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->d()V

    .line 264
    :cond_0
    return-void
.end method

.method private e(Landroid/content/Intent;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 363
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ChatHeadService;->h(Landroid/content/Intent;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 364
    if-nez v0, :cond_0

    .line 365
    sget-object v0, Lcom/facebook/orca/chatheads/ChatHeadService;->a:Ljava/lang/Class;

    const-string v1, "Received ACTION_OPEN_CHAT_HEAD with no thread. Dropping intent."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 377
    :goto_0
    return-void

    .line 368
    :cond_0
    const-string v1, "com.facebook.orca.chatheads.EXTRA_FOR_AFTER_UNLOCK_KEYGUARD"

    invoke-virtual {p1, v1, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->f:Landroid/app/KeyguardManager;

    invoke-virtual {v1}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 370
    sget-object v0, Lcom/facebook/orca/chatheads/ChatHeadService;->a:Ljava/lang/Class;

    const-string v1, "Received ACTION_OPEN_CHAT_HEAD and expected keyguard to be unlocked but it wasn\'t. Dropping intent."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 374
    :cond_1
    sget-object v1, Lcom/facebook/orca/chatheads/ChatHeadService;->a:Ljava/lang/Class;

    const-string v2, "handleActionOpenChatHead: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    const-string v1, "com.facebook.orca.chatheads.EXTRA_REASON"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 376
    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/chatheads/ChatHeadService;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic e(Lcom/facebook/orca/chatheads/ChatHeadService;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->q()V

    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/chatheads/ChatHeadService;)Lcom/facebook/orca/chatheads/bz;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->j:Lcom/facebook/orca/chatheads/bz;

    return-object v0
.end method

.method private f(Landroid/content/Intent;)V
    .locals 5

    .prologue
    .line 380
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ChatHeadService;->h(Landroid/content/Intent;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 381
    if-nez v0, :cond_1

    .line 382
    sget-object v0, Lcom/facebook/orca/chatheads/ChatHeadService;->a:Ljava/lang/Class;

    const-string v1, "Received ACTION_HIDE_CHAT_HEAD with no thread. Dropping intent."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 390
    :cond_0
    :goto_0
    return-void

    .line 385
    :cond_1
    sget-object v1, Lcom/facebook/orca/chatheads/ChatHeadService;->a:Ljava/lang/Class;

    const-string v2, "handleActionHideChatHead: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    const-string v1, "com.facebook.orca.chatheads.EXTRA_REASON"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 387
    iget-object v2, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    if-eqz v2, :cond_0

    .line 388
    iget-object v2, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private f()Z
    .locals 1

    .prologue
    .line 270
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private g()V
    .locals 0

    .prologue
    .line 425
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->p()V

    .line 426
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->i()V

    .line 427
    return-void
.end method

.method private g(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 398
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ChatHeadService;->h(Landroid/content/Intent;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 399
    if-nez v0, :cond_0

    .line 400
    sget-object v0, Lcom/facebook/orca/chatheads/ChatHeadService;->a:Ljava/lang/Class;

    const-string v1, "Received ACTION_CLEAR_UNREAD_THREAD with no thread. Dropping intent."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 405
    :goto_0
    return-void

    .line 403
    :cond_0
    const-string v1, "com.facebook.orca.chatheads.EXTRA_REASON"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 404
    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/chatheads/ChatHeadService;->b(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private h(Landroid/content/Intent;)Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 1

    .prologue
    .line 414
    const-string v0, "com.facebook.orca.chatheads.EXTRA_THREAD_VIEW_SPEC"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 415
    const-string v0, "com.facebook.orca.chatheads.EXTRA_THREAD_VIEW_SPEC"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 420
    :goto_0
    return-object v0

    .line 416
    :cond_0
    const-string v0, "com.facebook.orca.chatheads.EXTRA_THREAD_ID"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 417
    const-string v0, "com.facebook.orca.chatheads.EXTRA_THREAD_ID"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 418
    invoke-static {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    goto :goto_0

    .line 420
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private h()Z
    .locals 1

    .prologue
    .line 430
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->f()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->s:I

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private i()V
    .locals 1

    .prologue
    .line 435
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 436
    iget v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->o:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->stopSelf(I)V

    .line 438
    :cond_0
    return-void
.end method

.method private j()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 441
    iget-boolean v1, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->q:Z

    if-ne v1, v0, :cond_0

    iget-boolean v1, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->r:Z

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private k()V
    .locals 1

    .prologue
    .line 492
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 493
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->g()V

    .line 495
    :cond_0
    return-void
.end method

.method private l()V
    .locals 1

    .prologue
    .line 498
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->b(I)V

    .line 499
    return-void
.end method

.method private m()V
    .locals 1

    .prologue
    .line 502
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->a(I)V

    .line 503
    return-void
.end method

.method private n()V
    .locals 1

    .prologue
    .line 531
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->r:Z

    if-eqz v0, :cond_0

    .line 532
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->a(I)V

    .line 534
    :cond_0
    return-void
.end method

.method private o()V
    .locals 1

    .prologue
    .line 537
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->b(I)V

    .line 539
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->i()V

    .line 540
    return-void
.end method

.method private p()V
    .locals 1

    .prologue
    .line 543
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    if-eqz v0, :cond_0

    .line 544
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->j:Lcom/facebook/orca/chatheads/bz;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/bz;->b()V

    .line 545
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->c()V

    .line 546
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    .line 548
    :cond_0
    return-void
.end method

.method private q()V
    .locals 1

    .prologue
    .line 552
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->p()V

    .line 555
    iget v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->o:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->stopSelf(I)V

    .line 556
    return-void
.end method


# virtual methods
.method public a(Landroid/app/Dialog;)V
    .locals 2

    .prologue
    .line 696
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    sget v1, Lcom/facebook/orca/chatheads/ChatHeadService;->b:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->setType(I)V

    .line 697
    return-void
.end method

.method public declared-synchronized a(Lcom/facebook/common/d/e;)V
    .locals 2

    .prologue
    .line 656
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 659
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->t:Z

    if-eqz v0, :cond_0

    .line 660
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->d:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/orca/chatheads/t;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/chatheads/t;-><init>(Lcom/facebook/orca/chatheads/ChatHeadService;Lcom/facebook/common/d/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->d(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 679
    :goto_0
    monitor-exit p0

    return-void

    .line 669
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->u:Ljava/util/Set;

    if-nez v0, :cond_1

    .line 670
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->u:Ljava/util/Set;

    .line 672
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->u:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 673
    new-instance v0, Lcom/facebook/orca/chatheads/u;

    invoke-direct {v0, p0}, Lcom/facebook/orca/chatheads/u;-><init>(Lcom/facebook/orca/chatheads/ChatHeadService;)V

    invoke-interface {p1, v0}, Lcom/facebook/common/d/e;->a(Lcom/facebook/common/d/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 656
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 560
    const/4 v0, 0x0

    return-object v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 569
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->p:Landroid/content/res/Configuration;

    invoke-virtual {p1, v0}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    move-result v0

    .line 570
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    .line 572
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    if-eqz v0, :cond_0

    .line 573
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->f()V

    .line 577
    :cond_0
    new-instance v0, Landroid/content/res/Configuration;

    invoke-direct {v0, p1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->p:Landroid/content/res/Configuration;

    .line 578
    return-void
.end method

.method public onCreate()V
    .locals 3

    .prologue
    .line 132
    invoke-super {p0}, Lcom/facebook/base/d/b;->onCreate()V

    .line 134
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 135
    const-class v0, Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->c:Ljavax/inject/a;

    .line 136
    const-class v0, Lcom/facebook/common/executors/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/a;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->d:Lcom/facebook/common/executors/a;

    .line 137
    const-class v0, Landroid/view/WindowManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->e:Landroid/view/WindowManager;

    .line 138
    const-class v0, Landroid/app/KeyguardManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/KeyguardManager;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->f:Landroid/app/KeyguardManager;

    .line 139
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->h:Lcom/facebook/prefs/shared/d;

    .line 140
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/chatheads/annotations/IsChatHeadsEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->i:Ljavax/inject/a;

    .line 141
    const-class v0, Lcom/facebook/orca/chatheads/bz;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/bz;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->j:Lcom/facebook/orca/chatheads/bz;

    .line 142
    const-class v0, Lcom/facebook/e/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/e/s;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->l:Lcom/facebook/e/s;

    .line 145
    const-class v0, Lcom/facebook/orca/chatheads/cz;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/cz;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/chatheads/cz;->a(Ljava/lang/Object;)V

    .line 148
    invoke-static {p0}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 150
    new-instance v0, Lcom/facebook/orca/chatheads/o;

    invoke-direct {v0, p0}, Lcom/facebook/orca/chatheads/o;-><init>(Lcom/facebook/orca/chatheads/ChatHeadService;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->k:Lcom/facebook/prefs/shared/f;

    .line 161
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->h:Lcom/facebook/prefs/shared/d;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->k:Lcom/facebook/prefs/shared/f;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 164
    new-instance v0, Landroid/content/res/Configuration;

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->p:Landroid/content/res/Configuration;

    .line 166
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->c()V

    .line 167
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->b()V

    .line 169
    sget v0, Lcom/facebook/p;->Theme_Orca_ChatHeads:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->setTheme(I)V

    .line 170
    return-void
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 618
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->h:Lcom/facebook/prefs/shared/d;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->k:Lcom/facebook/prefs/shared/f;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->b(Lcom/facebook/prefs/shared/f;)V

    .line 620
    iput-object v2, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->k:Lcom/facebook/prefs/shared/f;

    .line 622
    monitor-enter p0

    .line 623
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->t:Z

    .line 624
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 626
    invoke-super {p0}, Lcom/facebook/base/d/b;->onDestroy()V

    .line 628
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->m:Lcom/facebook/c/k;

    if-eqz v0, :cond_0

    .line 629
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->m:Lcom/facebook/c/k;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 630
    iput-object v2, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->m:Lcom/facebook/c/k;

    .line 633
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->n:Lcom/facebook/base/broadcast/q;

    if-eqz v0, :cond_1

    .line 634
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->n:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->b()V

    .line 635
    iput-object v2, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->n:Lcom/facebook/base/broadcast/q;

    .line 638
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->p()V

    .line 640
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->u:Ljava/util/Set;

    if-eqz v0, :cond_3

    .line 641
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->u:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/d/e;

    .line 642
    invoke-interface {v0}, Lcom/facebook/common/d/e;->a()V

    goto :goto_0

    .line 624
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 644
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->u:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 646
    :cond_3
    return-void
.end method

.method public onLowMemory()V
    .locals 2

    .prologue
    .line 610
    sget-object v0, Lcom/facebook/orca/chatheads/ChatHeadService;->a:Ljava/lang/Class;

    const-string v1, "Received onLowMemory"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 611
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    if-eqz v0, :cond_0

    .line 612
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->b()V

    .line 614
    :cond_0
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 2

    .prologue
    .line 301
    iget v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->o:I

    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->o:I

    .line 303
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 304
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 305
    const-string v1, "com.facebook.orca.chatheads.ACTION_NEW_MESSAGE_NOTIFICATION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 306
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ChatHeadService;->c(Landroid/content/Intent;)V

    .line 326
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->i()V

    .line 328
    const/4 v0, 0x1

    return v0

    .line 307
    :cond_1
    const-string v1, "com.facebook.orca.chatheads.ACTION_POPUP_CHAT_HEAD"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 308
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ChatHeadService;->d(Landroid/content/Intent;)V

    goto :goto_0

    .line 309
    :cond_2
    const-string v1, "com.facebook.orca.chatheads.ACTION_OPEN_CHAT_HEAD"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 310
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ChatHeadService;->e(Landroid/content/Intent;)V

    goto :goto_0

    .line 311
    :cond_3
    const-string v1, "com.facebook.orca.chatheads.ACTION_REMOVE_CHAT_HEAD"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 312
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ChatHeadService;->f(Landroid/content/Intent;)V

    goto :goto_0

    .line 313
    :cond_4
    const-string v1, "com.facebook.orca.chatheads.ACTION_CLEAR_UNREAD_THREAD"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 314
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ChatHeadService;->g(Landroid/content/Intent;)V

    goto :goto_0

    .line 315
    :cond_5
    const-string v1, "com.facebook.orca.chatheads.ACTION_CLEAR_ALL_UNREAD_THREADS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 316
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->k()V

    goto :goto_0

    .line 317
    :cond_6
    const-string v1, "com.facebook.orca.chatheads.ACTION_SHOW_CHATHEADS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 318
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->l()V

    goto :goto_0

    .line 319
    :cond_7
    const-string v1, "com.facebook.orca.chatheads.ACTION_HIDE_CHATHEADS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 320
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->m()V

    goto :goto_0

    .line 321
    :cond_8
    const-string v1, "com.facebook.orca.chatheads.ACTION_SET_CHATHEADS_POLICY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 322
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ChatHeadService;->b(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public onTrimMemory(I)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 583
    sget-object v2, Lcom/facebook/orca/chatheads/ChatHeadService;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Received onTrimMemory, level: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 584
    iget-object v2, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    if-nez v2, :cond_1

    .line 606
    :cond_0
    :goto_0
    return-void

    .line 592
    :cond_1
    iget-object v2, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->e:Landroid/view/WindowManager;

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    .line 593
    iget-object v3, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->l:Lcom/facebook/e/s;

    invoke-virtual {v3, v2}, Lcom/facebook/e/s;->a(Landroid/view/Display;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 596
    const/16 v2, 0x50

    if-lt p1, v2, :cond_3

    .line 603
    :cond_2
    :goto_1
    if-eqz v0, :cond_0

    .line 604
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->b()V

    goto :goto_0

    :cond_3
    move v0, v1

    .line 596
    goto :goto_1

    .line 600
    :cond_4
    const/16 v2, 0x3c

    if-ge p1, v2, :cond_2

    move v0, v1

    goto :goto_1
.end method

.method public startActivity(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 118
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 119
    return-void
.end method

.method public startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 123
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ChatHeadService;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ChatHeadService;->g:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/al;->a(Landroid/content/Intent;)V

    .line 127
    :cond_0
    invoke-static {p1}, Lcom/facebook/orca/chatheads/ChatHeadService;->a(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/facebook/base/d/b;->startActivity(Landroid/content/Intent;)V

    .line 128
    return-void
.end method

.class public Lcom/qihoo/security/opti/trashclear/service/e;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/service/e$a;,
        Lcom/qihoo/security/opti/trashclear/service/e$b;
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field private final b:Lcom/qihoo/security/opti/trashclear/service/e$b;

.field private final c:Lcom/qihoo/security/opti/trashclear/service/e$a;

.field private final d:Landroid/content/Context;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/lang/String;

.field private final g:Landroid/os/Handler;

.field private final h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/opti/trashclear/service/c;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/service/c;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/qihoo/security/opti/trashclear/service/c;

.field private final k:Lcom/qihoo/security/opti/trashclear/service/d$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->f:Ljava/lang/String;

    .line 103
    const-string/jumbo v0, "MAP_KEY_STR"

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->a:Ljava/lang/String;

    .line 109
    new-instance v0, Lcom/qihoo/security/opti/trashclear/service/e$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/opti/trashclear/service/e$1;-><init>(Lcom/qihoo/security/opti/trashclear/service/e;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->g:Landroid/os/Handler;

    .line 248
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->h:Ljava/util/HashMap;

    .line 535
    new-instance v0, Lcom/qihoo/security/opti/trashclear/service/e$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/service/e$3;-><init>(Lcom/qihoo/security/opti/trashclear/service/e;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->k:Lcom/qihoo/security/opti/trashclear/service/d$a;

    .line 48
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/service/e;->d:Landroid/content/Context;

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->e:Ljava/util/List;

    .line 50
    new-instance v0, Landroid/os/HandlerThread;

    const-string/jumbo v1, "ResidualFileServiceHelper"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 51
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 52
    new-instance v1, Lcom/qihoo/security/opti/trashclear/service/e$b;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/opti/trashclear/service/e$b;-><init>(Lcom/qihoo/security/opti/trashclear/service/e;Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/service/e;->b:Lcom/qihoo/security/opti/trashclear/service/e$b;

    .line 53
    new-instance v0, Lcom/qihoo/security/opti/trashclear/service/e$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/opti/trashclear/service/e$a;-><init>(Lcom/qihoo/security/opti/trashclear/service/e;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->c:Lcom/qihoo/security/opti/trashclear/service/e$a;

    .line 54
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/c;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->j:Lcom/qihoo/security/opti/trashclear/service/c;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/service/e;Lcom/qihoo/security/opti/trashclear/service/c;)Lcom/qihoo/security/opti/trashclear/service/c;
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/service/e;->j:Lcom/qihoo/security/opti/trashclear/service/c;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/service/e;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/service/e;->i:Ljava/util/List;

    return-object p1
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/service/e;)Z
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/service/e;->c()Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/qihoo/security/opti/trashclear/service/e;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->d:Landroid/content/Context;

    return-object v0
.end method

.method private c()Z
    .locals 6

    .prologue
    .line 61
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 62
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/service/e;->d:Landroid/content/Context;

    const-string/jumbo v3, "start_time_silence_residual_file_dialog"

    const-wide/16 v4, 0x0

    invoke-static {v2, v3, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    .line 68
    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x1b7740

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 72
    const/4 v0, 0x1

    .line 77
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic d(Lcom/qihoo/security/opti/trashclear/service/e;)Ljava/util/List;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->i:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/opti/trashclear/service/e;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->g:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/e$a;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->c:Lcom/qihoo/security/opti/trashclear/service/e$a;

    return-object v0
.end method

.method static synthetic g(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/e$b;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->b:Lcom/qihoo/security/opti/trashclear/service/e$b;

    return-object v0
.end method


# virtual methods
.method public a()Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->k:Lcom/qihoo/security/opti/trashclear/service/d$a;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 263
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->d:Landroid/content/Context;

    const-string/jumbo v1, "remind_uninstallReminder_swtich"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    .line 267
    if-nez v0, :cond_0

    .line 296
    :goto_0
    return-void

    .line 271
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/service/e$2;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/opti/trashclear/service/e$2;-><init>(Lcom/qihoo/security/opti/trashclear/service/e;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method

.method public b()V
    .locals 2

    .prologue
    .line 510
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->b:Lcom/qihoo/security/opti/trashclear/service/e$b;

    if-eqz v0, :cond_0

    .line 511
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->b:Lcom/qihoo/security/opti/trashclear/service/e$b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/service/e$b;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 513
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->c:Lcom/qihoo/security/opti/trashclear/service/e$a;

    if-eqz v0, :cond_1

    .line 514
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->c:Lcom/qihoo/security/opti/trashclear/service/e$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/service/e$a;->removeMessages(I)V

    .line 516
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->i:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 517
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 518
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->i:Ljava/util/List;

    .line 520
    :cond_2
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 523
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->b:Lcom/qihoo/security/opti/trashclear/service/e$b;

    if-eqz v0, :cond_0

    .line 524
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e;->b:Lcom/qihoo/security/opti/trashclear/service/e$b;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/service/e;->b:Lcom/qihoo/security/opti/trashclear/service/e$b;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p1}, Lcom/qihoo/security/opti/trashclear/service/e$b;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/service/e$b;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 527
    :cond_0
    return-void
.end method

.class public Lcom/facebook/orca/background/d;
.super Lcom/facebook/backgroundtasks/a;
.source "FetchThreadsIntoMemoryCacheBackgroundTask.java"


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/debug/log/l;


# instance fields
.field private final c:Lcom/facebook/auth/b/b;

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/f/k;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/facebook/common/p/a;

.field private final f:Lcom/facebook/fbservice/ops/k;

.field private final g:Landroid/content/BroadcastReceiver;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    const-class v0, Lcom/facebook/orca/background/d;

    sput-object v0, Lcom/facebook/orca/background/d;->a:Ljava/lang/Class;

    .line 52
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/orca/background/d;->b:Lcom/facebook/debug/log/l;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/auth/b/b;Ljavax/inject/a;Lcom/facebook/fbservice/ops/k;Landroid/support/v4/a/e;Lcom/facebook/common/time/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/auth/b/b;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/f/k;",
            ">;",
            "Lcom/facebook/fbservice/ops/k;",
            "Landroid/support/v4/a/e;",
            "Lcom/facebook/common/time/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 68
    const-string v0, "FETCH_THREADS_INTO_MEMORY_CACHE"

    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/a;-><init>(Ljava/lang/String;)V

    .line 60
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/background/d;->h:Ljava/util/List;

    .line 69
    iput-object p1, p0, Lcom/facebook/orca/background/d;->c:Lcom/facebook/auth/b/b;

    .line 70
    iput-object p2, p0, Lcom/facebook/orca/background/d;->d:Ljavax/inject/a;

    .line 71
    new-instance v0, Lcom/facebook/common/p/a;

    const/16 v1, 0x1e

    const-wide/32 v2, 0xea60

    invoke-direct {v0, p5, v1, v2, v3}, Lcom/facebook/common/p/a;-><init>(Lcom/facebook/common/time/a;IJ)V

    iput-object v0, p0, Lcom/facebook/orca/background/d;->e:Lcom/facebook/common/p/a;

    .line 72
    iput-object p3, p0, Lcom/facebook/orca/background/d;->f:Lcom/facebook/fbservice/ops/k;

    .line 75
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 76
    const-string v1, "com.facebook.orca.THREADS_SHOWN_IN_LIST"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 77
    new-instance v1, Lcom/facebook/orca/background/e;

    invoke-direct {v1, p0}, Lcom/facebook/orca/background/e;-><init>(Lcom/facebook/orca/background/d;)V

    iput-object v1, p0, Lcom/facebook/orca/background/d;->g:Landroid/content/BroadcastReceiver;

    .line 84
    iget-object v1, p0, Lcom/facebook/orca/background/d;->g:Landroid/content/BroadcastReceiver;

    invoke-virtual {p4, v1, v0}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 85
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/background/d;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/orca/background/d;->a(Ljava/util/List;)V

    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 143
    iput-object p1, p0, Lcom/facebook/orca/background/d;->h:Ljava/util/List;

    .line 144
    invoke-virtual {p0}, Lcom/facebook/orca/background/d;->e()Lcom/facebook/backgroundtasks/q;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/backgroundtasks/q;->b()V

    .line 145
    return-void
.end method

.method private d()Ljava/lang/String;
    .locals 5

    .prologue
    .line 148
    iget-object v0, p0, Lcom/facebook/orca/background/d;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    .line 149
    iget-object v1, p0, Lcom/facebook/orca/background/d;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 150
    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->b(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v3

    .line 151
    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->c(Ljava/lang/String;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v4

    .line 152
    if-eqz v3, :cond_1

    if-nez v4, :cond_0

    .line 156
    :cond_1
    :goto_0
    return-object v1

    :cond_2
    const/4 v1, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 94
    const-class v0, Lcom/facebook/orca/server/module/ThreadsQueue;

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 104
    iget-object v1, p0, Lcom/facebook/orca/background/d;->c:Lcom/facebook/auth/b/b;

    invoke-interface {v1}, Lcom/facebook/auth/b/b;->b()Z

    move-result v1

    if-nez v1, :cond_1

    .line 109
    :cond_0
    :goto_0
    return v0

    .line 108
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/background/d;->d()Ljava/lang/String;

    move-result-object v1

    .line 109
    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public c()Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/backgroundtasks/b;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 114
    sget-object v1, Lcom/facebook/orca/background/d;->a:Ljava/lang/Class;

    const-string v2, "Starting getThread (db)"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 115
    invoke-direct {p0}, Lcom/facebook/orca/background/d;->d()Ljava/lang/String;

    move-result-object v1

    .line 116
    if-nez v1, :cond_0

    .line 139
    :goto_0
    return-object v0

    .line 119
    :cond_0
    iget-object v2, p0, Lcom/facebook/orca/background/d;->e:Lcom/facebook/common/p/a;

    invoke-virtual {v2}, Lcom/facebook/common/p/a;->a()Z

    move-result v2

    if-nez v2, :cond_1

    .line 120
    sget-object v1, Lcom/facebook/orca/background/d;->b:Lcom/facebook/debug/log/l;

    sget-object v2, Lcom/facebook/orca/background/d;->a:Ljava/lang/Class;

    const-string v3, "Hit in memory caching thread rate limit"

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 127
    :cond_1
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadParams;->newBuilder()Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-static {v1}, Lcom/facebook/orca/server/ThreadCriteria;->a(Ljava/lang/String;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/service/s;->STALE_DATA_OKAY:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/ac;->a(I)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v0

    .line 132
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 133
    const-string v2, "fetchThreadParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 134
    iget-object v0, p0, Lcom/facebook/orca/background/d;->f:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->k:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v1

    .line 137
    new-instance v0, Lcom/facebook/backgroundtasks/r;

    sget-object v2, Lcom/facebook/orca/background/d;->a:Ljava/lang/Class;

    invoke-direct {v0, v2}, Lcom/facebook/backgroundtasks/r;-><init>(Ljava/lang/Class;)V

    .line 138
    invoke-static {v1, v0}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method public g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 99
    const-class v0, Lcom/facebook/orca/background/MessagesTaskTag;

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/util/Set;
    .locals 1
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
    .line 89
    const-string v0, "FETCH_OUT_OF_DATE_THREADS"

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

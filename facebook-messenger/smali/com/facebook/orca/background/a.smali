.class public Lcom/facebook/orca/background/a;
.super Lcom/facebook/backgroundtasks/a;
.source "FetchOutOfDateThreadsBackgroundTask.java"


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

.field private final d:Lcom/facebook/orca/g/b;

.field private final e:Lcom/facebook/fbservice/ops/k;

.field private final f:Lcom/facebook/common/p/a;

.field private final g:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 46
    const-class v0, Lcom/facebook/orca/background/a;

    sput-object v0, Lcom/facebook/orca/background/a;->a:Ljava/lang/Class;

    .line 48
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/orca/background/a;->b:Lcom/facebook/debug/log/l;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/auth/b/b;Lcom/facebook/orca/g/b;Lcom/facebook/fbservice/ops/k;Landroid/support/v4/a/e;Lcom/facebook/common/time/a;)V
    .locals 4

    .prologue
    .line 62
    const-string v0, "FETCH_OUT_OF_DATE_THREADS"

    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/a;-><init>(Ljava/lang/String;)V

    .line 63
    iput-object p1, p0, Lcom/facebook/orca/background/a;->c:Lcom/facebook/auth/b/b;

    .line 64
    iput-object p2, p0, Lcom/facebook/orca/background/a;->d:Lcom/facebook/orca/g/b;

    .line 65
    iput-object p3, p0, Lcom/facebook/orca/background/a;->e:Lcom/facebook/fbservice/ops/k;

    .line 66
    new-instance v0, Lcom/facebook/common/p/a;

    const/16 v1, 0x14

    const-wide/32 v2, 0xea60

    invoke-direct {v0, p5, v1, v2, v3}, Lcom/facebook/common/p/a;-><init>(Lcom/facebook/common/time/a;IJ)V

    iput-object v0, p0, Lcom/facebook/orca/background/a;->f:Lcom/facebook/common/p/a;

    .line 69
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 70
    const-string v1, "com.facebook.orca.ACTION_THREAD_UPDATED_FOR_UI"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 71
    new-instance v1, Lcom/facebook/orca/background/b;

    invoke-direct {v1, p0}, Lcom/facebook/orca/background/b;-><init>(Lcom/facebook/orca/background/a;)V

    iput-object v1, p0, Lcom/facebook/orca/background/a;->g:Landroid/content/BroadcastReceiver;

    .line 77
    iget-object v1, p0, Lcom/facebook/orca/background/a;->g:Landroid/content/BroadcastReceiver;

    invoke-virtual {p4, v1, v0}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 78
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/background/a;)V
    .locals 0

    .prologue
    .line 44
    invoke-virtual {p0}, Lcom/facebook/orca/background/a;->j()V

    return-void
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
    .line 87
    const-class v0, Lcom/facebook/orca/server/module/ThreadsQueue;

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 97
    iget-object v1, p0, Lcom/facebook/orca/background/a;->c:Lcom/facebook/auth/b/b;

    invoke-interface {v1}, Lcom/facebook/auth/b/b;->b()Z

    move-result v1

    if-nez v1, :cond_1

    .line 106
    :cond_0
    :goto_0
    return v0

    .line 102
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/background/a;->d:Lcom/facebook/orca/g/b;

    sget-object v2, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/g/b;->b(Lcom/facebook/orca/threads/FolderName;)Ljava/util/List;

    move-result-object v1

    .line 103
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 106
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

    .line 111
    sget-object v1, Lcom/facebook/orca/background/a;->a:Ljava/lang/Class;

    const-string v2, "Starting fetch thread (server)"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 112
    iget-object v1, p0, Lcom/facebook/orca/background/a;->d:Lcom/facebook/orca/g/b;

    sget-object v2, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/g/b;->b(Lcom/facebook/orca/threads/FolderName;)Ljava/util/List;

    move-result-object v1

    .line 113
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 136
    :goto_0
    return-object v0

    .line 117
    :cond_0
    iget-object v2, p0, Lcom/facebook/orca/background/a;->f:Lcom/facebook/common/p/a;

    invoke-virtual {v2}, Lcom/facebook/common/p/a;->a()Z

    move-result v2

    if-nez v2, :cond_1

    .line 118
    sget-object v1, Lcom/facebook/orca/background/a;->b:Lcom/facebook/debug/log/l;

    sget-object v2, Lcom/facebook/orca/background/a;->a:Ljava/lang/Class;

    const-string v3, "Hit fetch thread rate limit"

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 123
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 124
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadParams;->newBuilder()Lcom/facebook/orca/server/ac;

    move-result-object v1

    invoke-static {v0}, Lcom/facebook/orca/server/ThreadCriteria;->a(Ljava/lang/String;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/ac;->a(I)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v0

    .line 129
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 130
    const-string v2, "fetchThreadParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 131
    iget-object v0, p0, Lcom/facebook/orca/background/a;->e:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->k:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v1

    .line 134
    new-instance v0, Lcom/facebook/backgroundtasks/r;

    sget-object v2, Lcom/facebook/orca/background/a;->a:Ljava/lang/Class;

    invoke-direct {v0, v2}, Lcom/facebook/backgroundtasks/r;-><init>(Ljava/lang/Class;)V

    .line 135
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
    .line 92
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
    .line 82
    const-string v0, "FETCH_THREAD_LIST"

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

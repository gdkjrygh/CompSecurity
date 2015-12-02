.class public Lcom/facebook/orca/background/q;
.super Lcom/facebook/backgroundtasks/a;
.source "TopGroupsSyncBackgroundTask.java"


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
.field private final b:Lcom/facebook/auth/b/b;

.field private final c:Lcom/facebook/fbservice/ops/k;

.field private final d:Lcom/facebook/prefs/shared/d;

.field private final e:Lcom/facebook/base/broadcast/a;

.field private final f:Lcom/facebook/common/v/a;

.field private final g:Lcom/facebook/common/time/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/orca/background/q;

    sput-object v0, Lcom/facebook/orca/background/q;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/auth/b/b;Lcom/facebook/fbservice/ops/k;Lcom/facebook/prefs/shared/d;Lcom/facebook/base/broadcast/a;Lcom/facebook/common/v/a;Lcom/facebook/common/time/a;)V
    .locals 1

    .prologue
    .line 56
    const-string v0, "FETCH_TOP_GROUP_THREADS"

    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/a;-><init>(Ljava/lang/String;)V

    .line 57
    iput-object p1, p0, Lcom/facebook/orca/background/q;->b:Lcom/facebook/auth/b/b;

    .line 58
    iput-object p2, p0, Lcom/facebook/orca/background/q;->c:Lcom/facebook/fbservice/ops/k;

    .line 59
    iput-object p3, p0, Lcom/facebook/orca/background/q;->d:Lcom/facebook/prefs/shared/d;

    .line 60
    iput-object p4, p0, Lcom/facebook/orca/background/q;->e:Lcom/facebook/base/broadcast/a;

    .line 61
    iput-object p5, p0, Lcom/facebook/orca/background/q;->f:Lcom/facebook/common/v/a;

    .line 62
    iput-object p6, p0, Lcom/facebook/orca/background/q;->g:Lcom/facebook/common/time/a;

    .line 63
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/background/q;)Lcom/facebook/common/time/a;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/orca/background/q;->g:Lcom/facebook/common/time/a;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/background/q;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/orca/background/q;->d:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/background/q;)Lcom/facebook/base/broadcast/a;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/orca/background/q;->e:Lcom/facebook/base/broadcast/a;

    return-object v0
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
    .line 67
    const-class v0, Lcom/facebook/orca/server/module/ThreadsQueue;

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 9

    .prologue
    const-wide/16 v7, 0x0

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 77
    iget-object v2, p0, Lcom/facebook/orca/background/q;->b:Lcom/facebook/auth/b/b;

    invoke-interface {v2}, Lcom/facebook/auth/b/b;->b()Z

    move-result v2

    if-nez v2, :cond_0

    .line 91
    :goto_0
    return v0

    .line 81
    :cond_0
    iget-object v2, p0, Lcom/facebook/orca/background/q;->d:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/orca/background/n;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v2, v3, v7, v8}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v2

    .line 83
    iget-object v4, p0, Lcom/facebook/orca/background/q;->g:Lcom/facebook/common/time/a;

    invoke-interface {v4}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v4

    sub-long/2addr v4, v2

    .line 84
    iget-object v6, p0, Lcom/facebook/orca/background/q;->f:Lcom/facebook/common/v/a;

    invoke-virtual {v6}, Lcom/facebook/common/v/a;->a()Z

    move-result v6

    .line 86
    if-nez v6, :cond_1

    cmp-long v2, v2, v7

    if-lez v2, :cond_2

    const-wide/32 v2, 0x1499700

    cmp-long v2, v4, v2

    if-gez v2, :cond_2

    .line 87
    :cond_1
    sget-object v2, Lcom/facebook/orca/background/q;->a:Ljava/lang/Class;

    const-string v3, "Skipped background fetch, last sync was %d ms ago"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v1, v0

    invoke-static {v2, v3, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    move v0, v1

    .line 91
    goto :goto_0
.end method

.method public c()Lcom/google/common/d/a/s;
    .locals 3
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
    .line 96
    sget-object v0, Lcom/facebook/orca/background/q;->a:Ljava/lang/Class;

    const-string v1, "Starting fetch top group threads."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 97
    invoke-static {}, Lcom/facebook/orca/server/FetchGroupThreadsParams;->newBuilder()Lcom/facebook/orca/server/k;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/server/j;->TOP_RANKED:Lcom/facebook/orca/server/j;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/k;->a(Lcom/facebook/orca/server/j;)Lcom/facebook/orca/server/k;

    move-result-object v0

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/k;->a(I)Lcom/facebook/orca/server/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/k;->d()Lcom/facebook/orca/server/FetchGroupThreadsParams;

    move-result-object v0

    .line 101
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 102
    const-string v2, "fetchGroupThreadsParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 103
    iget-object v0, p0, Lcom/facebook/orca/background/q;->c:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->m:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 106
    new-instance v1, Lcom/facebook/orca/background/r;

    sget-object v2, Lcom/facebook/orca/background/q;->a:Ljava/lang/Class;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/background/r;-><init>(Lcom/facebook/orca/background/q;Ljava/lang/Class;)V

    .line 125
    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 126
    return-object v1
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
    .line 72
    const-class v0, Lcom/facebook/orca/background/MessagesTaskTag;

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

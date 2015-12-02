.class public Lcom/facebook/orca/background/c;
.super Lcom/facebook/backgroundtasks/a;
.source "FetchThreadListBackgroundTask.java"


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

.field private static final c:Lcom/facebook/debug/log/l;


# instance fields
.field private final d:Lcom/facebook/auth/b/b;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderType;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/g/b;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/f/k;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/facebook/fbservice/ops/k;

.field private final i:Lcom/facebook/common/v/a;

.field private final j:Lcom/facebook/common/time/a;

.field private final k:Lcom/facebook/common/p/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    const-class v0, Lcom/facebook/orca/background/c;

    sput-object v0, Lcom/facebook/orca/background/c;->a:Ljava/lang/Class;

    .line 44
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/orca/background/c;->b:Lcom/facebook/debug/log/l;

    .line 45
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/orca/background/c;->c:Lcom/facebook/debug/log/l;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/auth/b/b;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/fbservice/ops/k;Lcom/facebook/common/v/a;Lcom/facebook/common/time/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/auth/b/b;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderType;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/g/b;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/f/k;",
            ">;",
            "Lcom/facebook/fbservice/ops/k;",
            "Lcom/facebook/common/v/a;",
            "Lcom/facebook/common/time/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 65
    const-string v0, "FETCH_THREAD_LIST"

    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/a;-><init>(Ljava/lang/String;)V

    .line 66
    iput-object p1, p0, Lcom/facebook/orca/background/c;->d:Lcom/facebook/auth/b/b;

    .line 67
    iput-object p2, p0, Lcom/facebook/orca/background/c;->e:Ljavax/inject/a;

    .line 68
    iput-object p3, p0, Lcom/facebook/orca/background/c;->f:Ljavax/inject/a;

    .line 69
    iput-object p4, p0, Lcom/facebook/orca/background/c;->g:Ljavax/inject/a;

    .line 70
    iput-object p5, p0, Lcom/facebook/orca/background/c;->h:Lcom/facebook/fbservice/ops/k;

    .line 71
    iput-object p6, p0, Lcom/facebook/orca/background/c;->i:Lcom/facebook/common/v/a;

    .line 72
    iput-object p7, p0, Lcom/facebook/orca/background/c;->j:Lcom/facebook/common/time/a;

    .line 73
    new-instance v0, Lcom/facebook/common/p/a;

    const/16 v1, 0xa

    const-wide/32 v2, 0xea60

    invoke-direct {v0, p7, v1, v2, v3}, Lcom/facebook/common/p/a;-><init>(Lcom/facebook/common/time/a;IJ)V

    iput-object v0, p0, Lcom/facebook/orca/background/c;->k:Lcom/facebook/common/p/a;

    .line 74
    return-void
.end method

.method private a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/s;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/facebook/orca/background/c;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/b;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/g/b;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 145
    sget-object v0, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    .line 149
    :goto_0
    return-object v0

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/background/c;->g:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/k;->d(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 147
    sget-object v0, Lcom/facebook/fbservice/service/s;->PREFER_CACHE_IF_UP_TO_DATE:Lcom/facebook/fbservice/service/s;

    goto :goto_0

    .line 149
    :cond_1
    const/4 v0, 0x0

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
    .line 78
    const-class v0, Lcom/facebook/orca/server/module/ThreadsQueue;

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 88
    iget-object v0, p0, Lcom/facebook/orca/background/c;->d:Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->b()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 112
    :goto_0
    return v0

    .line 92
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/background/c;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderType;

    invoke-static {v0}, Lcom/facebook/orca/threads/FolderName;->a(Lcom/facebook/orca/threads/FolderType;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v3

    .line 93
    sget-object v0, Lcom/facebook/orca/threads/FolderName;->a:Lcom/facebook/orca/threads/FolderName;

    if-ne v3, v0, :cond_1

    .line 94
    sget-object v0, Lcom/facebook/orca/background/c;->b:Lcom/facebook/debug/log/l;

    sget-object v2, Lcom/facebook/orca/background/c;->a:Ljava/lang/Class;

    const-string v3, "User not authenticated to access folders"

    invoke-static {v0, v2, v3}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;)V

    move v0, v1

    .line 95
    goto :goto_0

    .line 98
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/background/c;->g:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/f/k;->f(Lcom/facebook/orca/threads/FolderName;)J

    move-result-wide v4

    .line 99
    iget-object v0, p0, Lcom/facebook/orca/background/c;->j:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v6

    sub-long v4, v6, v4

    .line 100
    iget-object v0, p0, Lcom/facebook/orca/background/c;->i:Lcom/facebook/common/v/a;

    invoke-virtual {v0}, Lcom/facebook/common/v/a;->a()Z

    move-result v0

    .line 102
    if-eqz v0, :cond_2

    const-wide/32 v6, 0x1499700

    cmp-long v0, v4, v6

    if-gez v0, :cond_2

    .line 103
    sget-object v0, Lcom/facebook/orca/background/c;->a:Ljava/lang/Class;

    const-string v3, "Skipped background fetch, last sync was %d ms ago"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v1

    invoke-static {v0, v3, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    move v0, v1

    .line 104
    goto :goto_0

    .line 107
    :cond_2
    invoke-direct {p0, v3}, Lcom/facebook/orca/background/c;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/s;

    move-result-object v0

    .line 108
    if-nez v0, :cond_3

    move v0, v1

    .line 109
    goto :goto_0

    :cond_3
    move v0, v2

    .line 112
    goto :goto_0
.end method

.method public c()Lcom/google/common/d/a/s;
    .locals 5
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
    const/4 v1, 0x0

    .line 117
    iget-object v0, p0, Lcom/facebook/orca/background/c;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderType;

    invoke-static {v0}, Lcom/facebook/orca/threads/FolderName;->a(Lcom/facebook/orca/threads/FolderType;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 118
    invoke-direct {p0, v0}, Lcom/facebook/orca/background/c;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/s;

    move-result-object v2

    .line 119
    if-nez v2, :cond_0

    move-object v0, v1

    .line 140
    :goto_0
    return-object v0

    .line 123
    :cond_0
    iget-object v3, p0, Lcom/facebook/orca/background/c;->k:Lcom/facebook/common/p/a;

    invoke-virtual {v3}, Lcom/facebook/common/p/a;->a()Z

    move-result v3

    if-nez v3, :cond_1

    .line 124
    sget-object v0, Lcom/facebook/orca/background/c;->c:Lcom/facebook/debug/log/l;

    sget-object v2, Lcom/facebook/orca/background/c;->a:Ljava/lang/Class;

    const-string v3, "Hit fetch thread list rate limit"

    invoke-static {v0, v2, v3}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;)V

    move-object v0, v1

    .line 125
    goto :goto_0

    .line 128
    :cond_1
    sget-object v1, Lcom/facebook/orca/background/c;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Starting fetch threads ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 129
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadListParams;->newBuilder()Lcom/facebook/orca/server/y;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/y;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/y;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/orca/server/y;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/y;->f()Lcom/facebook/orca/server/FetchThreadListParams;

    move-result-object v0

    .line 133
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 134
    const-string v2, "fetchThreadListParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 135
    iget-object v0, p0, Lcom/facebook/orca/background/c;->h:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->i:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v1

    .line 138
    new-instance v0, Lcom/facebook/backgroundtasks/r;

    sget-object v2, Lcom/facebook/orca/background/c;->a:Ljava/lang/Class;

    invoke-direct {v0, v2}, Lcom/facebook/backgroundtasks/r;-><init>(Ljava/lang/Class;)V

    .line 139
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
    .line 83
    const-class v0, Lcom/facebook/orca/background/MessagesTaskTag;

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

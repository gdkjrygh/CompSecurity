.class public Lcom/facebook/orca/sms/aa;
.super Ljava/lang/Object;
.source "MmsSmsFetchThreadsHandler.java"


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
.field private final b:Lcom/facebook/orca/sms/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19
    const-class v0, Lcom/facebook/orca/sms/aa;

    sput-object v0, Lcom/facebook/orca/sms/aa;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/sms/y;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/facebook/orca/sms/aa;->b:Lcom/facebook/orca/sms/y;

    .line 26
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchMoreThreadsParams;)Lcom/facebook/orca/server/FetchMoreThreadsResult;
    .locals 7

    .prologue
    .line 61
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->c()I

    move-result v0

    .line 62
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->b()J

    move-result-wide v1

    .line 63
    invoke-static {v0, v1, v2}, Lcom/facebook/orca/sms/c;->b(IJ)Lcom/facebook/orca/sms/c;

    move-result-object v0

    .line 65
    iget-object v1, p0, Lcom/facebook/orca/sms/aa;->b:Lcom/facebook/orca/sms/y;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/sms/y;->a(Lcom/facebook/orca/sms/c;)Lcom/facebook/orca/sms/d;

    move-result-object v4

    .line 67
    new-instance v0, Lcom/facebook/orca/server/FetchMoreThreadsResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    sget-object v2, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v4}, Lcom/facebook/orca/sms/d;->a()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v3

    invoke-virtual {v4}, Lcom/facebook/orca/sms/d;->b()Lcom/google/common/a/es;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/server/FetchMoreThreadsResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadsCollection;Lcom/google/common/a/es;J)V

    return-object v0
.end method

.method public a(Lcom/facebook/orca/server/FetchThreadListParams;)Lcom/facebook/orca/server/FetchThreadListResult;
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 29
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->c()J

    move-result-wide v2

    const-wide/32 v4, 0xf4240

    div-long/2addr v2, v4

    .line 30
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->c()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 31
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->d()I

    move-result v4

    .line 32
    invoke-static {v4, v2, v3}, Lcom/facebook/orca/sms/c;->a(IJ)Lcom/facebook/orca/sms/c;

    move-result-object v2

    .line 34
    iget-object v3, p0, Lcom/facebook/orca/sms/aa;->b:Lcom/facebook/orca/sms/y;

    invoke-virtual {v3, v2}, Lcom/facebook/orca/sms/y;->a(Lcom/facebook/orca/sms/c;)Lcom/facebook/orca/sms/d;

    move-result-object v4

    .line 36
    invoke-virtual {v4}, Lcom/facebook/orca/sms/d;->a()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v5

    .line 37
    iget-object v2, p0, Lcom/facebook/orca/sms/aa;->b:Lcom/facebook/orca/sms/y;

    invoke-virtual {v2}, Lcom/facebook/orca/sms/y;->a()Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v6

    .line 39
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->c()J

    move-result-wide v2

    .line 40
    invoke-virtual {v5}, Lcom/facebook/orca/threads/ThreadsCollection;->e()I

    move-result v7

    if-lez v7, :cond_1

    .line 41
    invoke-virtual {v5, v1}, Lcom/facebook/orca/threads/ThreadsCollection;->a(I)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v1

    .line 47
    :goto_1
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadListResult;->newBuilder()Lcom/facebook/orca/server/aa;

    move-result-object v3

    sget-object v7, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-virtual {v3, v7}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/fbservice/c/b;)Lcom/facebook/orca/server/aa;

    move-result-object v3

    sget-object v7, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v3, v7}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/aa;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/threads/ThreadsCollection;)Lcom/facebook/orca/server/aa;

    move-result-object v3

    invoke-virtual {v4}, Lcom/facebook/orca/sms/d;->b()Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/orca/server/aa;->a(Lcom/google/common/a/es;)Lcom/facebook/orca/server/aa;

    move-result-object v3

    invoke-virtual {v3, v6}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/threads/FolderCounts;)Lcom/facebook/orca/server/aa;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/facebook/orca/server/aa;->a(Z)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/facebook/orca/server/aa;->a(J)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/server/aa;->b(J)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/aa;->o()Lcom/facebook/orca/server/FetchThreadListResult;

    move-result-object v0

    return-object v0

    :cond_0
    move v0, v1

    .line 30
    goto :goto_0

    :cond_1
    move-wide v1, v2

    goto :goto_1
.end method

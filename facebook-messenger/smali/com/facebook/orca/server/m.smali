.class public Lcom/facebook/orca/server/m;
.super Ljava/lang/Object;
.source "FetchGroupThreadsResultBuilder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:Lcom/facebook/fbservice/c/b;

.field private b:Lcom/facebook/orca/threads/ThreadsCollection;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:Z

.field private g:J

.field private h:J

.field private i:Lcom/facebook/fbservice/service/ServiceException;


# direct methods
.method constructor <init>()V
    .locals 3

    .prologue
    const-wide/16 v1, -0x1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/m;->c:Ljava/util/List;

    .line 25
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/m;->d:Ljava/util/List;

    .line 26
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/m;->e:Ljava/util/List;

    .line 28
    iput-wide v1, p0, Lcom/facebook/orca/server/m;->g:J

    .line 29
    iput-wide v1, p0, Lcom/facebook/orca/server/m;->h:J

    .line 34
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/c/b;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/orca/server/m;->a:Lcom/facebook/fbservice/c/b;

    return-object v0
.end method

.method public a(J)Lcom/facebook/orca/server/m;
    .locals 0

    .prologue
    .line 211
    iput-wide p1, p0, Lcom/facebook/orca/server/m;->g:J

    .line 212
    return-object p0
.end method

.method public a(Lcom/facebook/fbservice/c/b;)Lcom/facebook/orca/server/m;
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/facebook/orca/server/m;->a:Lcom/facebook/fbservice/c/b;

    .line 74
    return-object p0
.end method

.method public a(Lcom/facebook/orca/threads/ThreadsCollection;)Lcom/facebook/orca/server/m;
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/facebook/orca/server/m;->b:Lcom/facebook/orca/threads/ThreadsCollection;

    .line 94
    return-object p0
.end method

.method public a(Lcom/google/common/a/es;)Lcom/facebook/orca/server/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)",
            "Lcom/facebook/orca/server/m;"
        }
    .end annotation

    .prologue
    .line 115
    iput-object p1, p0, Lcom/facebook/orca/server/m;->c:Ljava/util/List;

    .line 116
    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/facebook/orca/server/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/orca/server/m;"
        }
    .end annotation

    .prologue
    .line 137
    iput-object p1, p0, Lcom/facebook/orca/server/m;->d:Ljava/util/List;

    .line 138
    return-object p0
.end method

.method public a(Z)Lcom/facebook/orca/server/m;
    .locals 0

    .prologue
    .line 183
    iput-boolean p1, p0, Lcom/facebook/orca/server/m;->f:Z

    .line 184
    return-object p0
.end method

.method public b(J)Lcom/facebook/orca/server/m;
    .locals 0

    .prologue
    .line 237
    iput-wide p1, p0, Lcom/facebook/orca/server/m;->h:J

    .line 238
    return-object p0
.end method

.method public b(Ljava/util/List;)Lcom/facebook/orca/server/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/orca/server/m;"
        }
    .end annotation

    .prologue
    .line 159
    iput-object p1, p0, Lcom/facebook/orca/server/m;->e:Ljava/util/List;

    .line 160
    return-object p0
.end method

.method public b()Lcom/facebook/orca/threads/ThreadsCollection;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/orca/server/m;->b:Lcom/facebook/orca/threads/ThreadsCollection;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/orca/server/m;->c:Ljava/util/List;

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 126
    iget-object v0, p0, Lcom/facebook/orca/server/m;->d:Ljava/util/List;

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 148
    iget-object v0, p0, Lcom/facebook/orca/server/m;->e:Ljava/util/List;

    return-object v0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 171
    iget-boolean v0, p0, Lcom/facebook/orca/server/m;->f:Z

    return v0
.end method

.method public g()J
    .locals 2

    .prologue
    .line 197
    iget-wide v0, p0, Lcom/facebook/orca/server/m;->g:J

    return-wide v0
.end method

.method public h()J
    .locals 2

    .prologue
    .line 224
    iget-wide v0, p0, Lcom/facebook/orca/server/m;->h:J

    return-wide v0
.end method

.method public i()Lcom/facebook/fbservice/service/ServiceException;
    .locals 1

    .prologue
    .line 248
    iget-object v0, p0, Lcom/facebook/orca/server/m;->i:Lcom/facebook/fbservice/service/ServiceException;

    return-object v0
.end method

.method public j()Lcom/facebook/orca/server/FetchGroupThreadsResult;
    .locals 1

    .prologue
    .line 269
    new-instance v0, Lcom/facebook/orca/server/FetchGroupThreadsResult;

    invoke-direct {v0, p0}, Lcom/facebook/orca/server/FetchGroupThreadsResult;-><init>(Lcom/facebook/orca/server/m;)V

    return-object v0
.end method

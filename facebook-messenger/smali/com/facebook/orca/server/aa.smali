.class public Lcom/facebook/orca/server/aa;
.super Ljava/lang/Object;
.source "FetchThreadListResultBuilder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:Lcom/facebook/fbservice/c/b;

.field private b:Lcom/facebook/orca/threads/FolderName;

.field private c:Lcom/facebook/orca/threads/ThreadsCollection;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/User;",
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

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/facebook/orca/threads/FolderCounts;

.field private h:Lcom/facebook/orca/notify/NotificationSetting;

.field private i:Z

.field private j:J

.field private k:J

.field private l:Z

.field private m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            "Lcom/facebook/orca/server/FetchThreadListResult;",
            ">;"
        }
    .end annotation
.end field

.field private n:Lcom/facebook/fbservice/service/ServiceException;


# direct methods
.method constructor <init>()V
    .locals 3

    .prologue
    const-wide/16 v1, -0x1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/aa;->d:Ljava/util/List;

    .line 31
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/aa;->e:Ljava/util/List;

    .line 32
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/aa;->f:Ljava/util/List;

    .line 36
    iput-wide v1, p0, Lcom/facebook/orca/server/aa;->j:J

    .line 37
    iput-wide v1, p0, Lcom/facebook/orca/server/aa;->k:J

    .line 39
    invoke-static {}, Lcom/google/common/a/ev;->j()Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/aa;->m:Ljava/util/Map;

    .line 44
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/c/b;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/orca/server/aa;->a:Lcom/facebook/fbservice/c/b;

    return-object v0
.end method

.method public a(J)Lcom/facebook/orca/server/aa;
    .locals 0

    .prologue
    .line 293
    iput-wide p1, p0, Lcom/facebook/orca/server/aa;->j:J

    .line 294
    return-object p0
.end method

.method public a(Lcom/facebook/fbservice/c/b;)Lcom/facebook/orca/server/aa;
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/facebook/orca/server/aa;->a:Lcom/facebook/fbservice/c/b;

    .line 89
    return-object p0
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/orca/server/aa;
    .locals 0

    .prologue
    .line 383
    iput-object p1, p0, Lcom/facebook/orca/server/aa;->n:Lcom/facebook/fbservice/service/ServiceException;

    .line 384
    return-object p0
.end method

.method public a(Lcom/facebook/orca/notify/NotificationSetting;)Lcom/facebook/orca/server/aa;
    .locals 0

    .prologue
    .line 241
    iput-object p1, p0, Lcom/facebook/orca/server/aa;->h:Lcom/facebook/orca/notify/NotificationSetting;

    .line 242
    return-object p0
.end method

.method public a(Lcom/facebook/orca/server/FetchThreadListResult;)Lcom/facebook/orca/server/aa;
    .locals 2

    .prologue
    .line 53
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/aa;->a:Lcom/facebook/fbservice/c/b;

    .line 54
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->a()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/aa;->b:Lcom/facebook/orca/threads/FolderName;

    .line 55
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->b()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/aa;->c:Lcom/facebook/orca/threads/ThreadsCollection;

    .line 56
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->c()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/aa;->d:Ljava/util/List;

    .line 57
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/aa;->e:Ljava/util/List;

    .line 58
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->g()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/aa;->f:Ljava/util/List;

    .line 59
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->h()Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/aa;->g:Lcom/facebook/orca/threads/FolderCounts;

    .line 60
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->i()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/aa;->h:Lcom/facebook/orca/notify/NotificationSetting;

    .line 61
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->j()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/server/aa;->i:Z

    .line 62
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->f()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/aa;->j:J

    .line 63
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->k()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/aa;->k:J

    .line 64
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->l()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/server/aa;->l:Z

    .line 65
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->m()Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/aa;->m:Ljava/util/Map;

    .line 66
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->n()Lcom/facebook/fbservice/service/ServiceException;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/aa;->n:Lcom/facebook/fbservice/service/ServiceException;

    .line 67
    return-object p0
.end method

.method public a(Lcom/facebook/orca/threads/FolderCounts;)Lcom/facebook/orca/server/aa;
    .locals 0

    .prologue
    .line 218
    iput-object p1, p0, Lcom/facebook/orca/server/aa;->g:Lcom/facebook/orca/threads/FolderCounts;

    .line 219
    return-object p0
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/aa;
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/facebook/orca/server/aa;->b:Lcom/facebook/orca/threads/FolderName;

    .line 109
    return-object p0
.end method

.method public a(Lcom/facebook/orca/threads/ThreadsCollection;)Lcom/facebook/orca/server/aa;
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/facebook/orca/server/aa;->c:Lcom/facebook/orca/threads/ThreadsCollection;

    .line 129
    return-object p0
.end method

.method public a(Lcom/google/common/a/es;)Lcom/facebook/orca/server/aa;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)",
            "Lcom/facebook/orca/server/aa;"
        }
    .end annotation

    .prologue
    .line 150
    iput-object p1, p0, Lcom/facebook/orca/server/aa;->d:Ljava/util/List;

    .line 151
    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/facebook/orca/server/aa;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/orca/server/aa;"
        }
    .end annotation

    .prologue
    .line 172
    iput-object p1, p0, Lcom/facebook/orca/server/aa;->e:Ljava/util/List;

    .line 173
    return-object p0
.end method

.method public a(Ljava/util/Map;)Lcom/facebook/orca/server/aa;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            "Lcom/facebook/orca/server/FetchThreadListResult;",
            ">;)",
            "Lcom/facebook/orca/server/aa;"
        }
    .end annotation

    .prologue
    .line 361
    iput-object p1, p0, Lcom/facebook/orca/server/aa;->m:Ljava/util/Map;

    .line 362
    return-object p0
.end method

.method public a(Z)Lcom/facebook/orca/server/aa;
    .locals 0

    .prologue
    .line 265
    iput-boolean p1, p0, Lcom/facebook/orca/server/aa;->i:Z

    .line 266
    return-object p0
.end method

.method public b(J)Lcom/facebook/orca/server/aa;
    .locals 0

    .prologue
    .line 319
    iput-wide p1, p0, Lcom/facebook/orca/server/aa;->k:J

    .line 320
    return-object p0
.end method

.method public b(Ljava/util/List;)Lcom/facebook/orca/server/aa;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/orca/server/aa;"
        }
    .end annotation

    .prologue
    .line 194
    iput-object p1, p0, Lcom/facebook/orca/server/aa;->f:Ljava/util/List;

    .line 195
    return-object p0
.end method

.method public b(Z)Lcom/facebook/orca/server/aa;
    .locals 0

    .prologue
    .line 338
    iput-boolean p1, p0, Lcom/facebook/orca/server/aa;->l:Z

    .line 339
    return-object p0
.end method

.method public b()Lcom/facebook/orca/threads/FolderName;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/orca/server/aa;->b:Lcom/facebook/orca/threads/FolderName;

    return-object v0
.end method

.method public c()Lcom/facebook/orca/threads/ThreadsCollection;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/facebook/orca/server/aa;->c:Lcom/facebook/orca/threads/ThreadsCollection;

    return-object v0
.end method

.method public d()Ljava/util/List;
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
    .line 139
    iget-object v0, p0, Lcom/facebook/orca/server/aa;->d:Ljava/util/List;

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
    .line 161
    iget-object v0, p0, Lcom/facebook/orca/server/aa;->e:Ljava/util/List;

    return-object v0
.end method

.method public f()Ljava/util/List;
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
    .line 183
    iget-object v0, p0, Lcom/facebook/orca/server/aa;->f:Ljava/util/List;

    return-object v0
.end method

.method public g()Lcom/facebook/orca/threads/FolderCounts;
    .locals 1

    .prologue
    .line 206
    iget-object v0, p0, Lcom/facebook/orca/server/aa;->g:Lcom/facebook/orca/threads/FolderCounts;

    return-object v0
.end method

.method public h()Lcom/facebook/orca/notify/NotificationSetting;
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lcom/facebook/orca/server/aa;->h:Lcom/facebook/orca/notify/NotificationSetting;

    return-object v0
.end method

.method public i()Z
    .locals 1

    .prologue
    .line 253
    iget-boolean v0, p0, Lcom/facebook/orca/server/aa;->i:Z

    return v0
.end method

.method public j()J
    .locals 2

    .prologue
    .line 279
    iget-wide v0, p0, Lcom/facebook/orca/server/aa;->j:J

    return-wide v0
.end method

.method public k()J
    .locals 2

    .prologue
    .line 306
    iget-wide v0, p0, Lcom/facebook/orca/server/aa;->k:J

    return-wide v0
.end method

.method public l()Z
    .locals 1

    .prologue
    .line 329
    iget-boolean v0, p0, Lcom/facebook/orca/server/aa;->l:Z

    return v0
.end method

.method public m()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            "Lcom/facebook/orca/server/FetchThreadListResult;",
            ">;"
        }
    .end annotation

    .prologue
    .line 349
    iget-object v0, p0, Lcom/facebook/orca/server/aa;->m:Ljava/util/Map;

    return-object v0
.end method

.method public n()Lcom/facebook/fbservice/service/ServiceException;
    .locals 1

    .prologue
    .line 372
    iget-object v0, p0, Lcom/facebook/orca/server/aa;->n:Lcom/facebook/fbservice/service/ServiceException;

    return-object v0
.end method

.method public o()Lcom/facebook/orca/server/FetchThreadListResult;
    .locals 1

    .prologue
    .line 393
    new-instance v0, Lcom/facebook/orca/server/FetchThreadListResult;

    invoke-direct {v0, p0}, Lcom/facebook/orca/server/FetchThreadListResult;-><init>(Lcom/facebook/orca/server/aa;)V

    return-object v0
.end method

.class public Lcom/facebook/orca/server/y;
.super Ljava/lang/Object;
.source "FetchThreadListParamsBuilder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:Lcom/facebook/fbservice/service/s;

.field private b:Lcom/facebook/orca/threads/FolderName;

.field private c:J

.field private d:I

.field private e:Z


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/orca/server/y;->c:J

    .line 19
    const/16 v0, 0x14

    iput v0, p0, Lcom/facebook/orca/server/y;->d:I

    .line 24
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/s;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/orca/server/y;->a:Lcom/facebook/fbservice/service/s;

    return-object v0
.end method

.method public a(J)Lcom/facebook/orca/server/y;
    .locals 0

    .prologue
    .line 90
    iput-wide p1, p0, Lcom/facebook/orca/server/y;->c:J

    .line 91
    return-object p0
.end method

.method public a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/y;
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/facebook/orca/server/y;->a:Lcom/facebook/fbservice/service/s;

    .line 53
    return-object p0
.end method

.method public a(Lcom/facebook/orca/server/FetchThreadListParams;)Lcom/facebook/orca/server/y;
    .locals 2

    .prologue
    .line 27
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->a()Lcom/facebook/fbservice/service/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/y;->a:Lcom/facebook/fbservice/service/s;

    .line 28
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->b()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/y;->b:Lcom/facebook/orca/threads/FolderName;

    .line 29
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/y;->c:J

    .line 30
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->d()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/server/y;->d:I

    .line 31
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->e()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/server/y;->e:Z

    .line 32
    return-object p0
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/y;
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/facebook/orca/server/y;->b:Lcom/facebook/orca/threads/FolderName;

    .line 72
    return-object p0
.end method

.method public a(Z)Lcom/facebook/orca/server/y;
    .locals 0

    .prologue
    .line 129
    iput-boolean p1, p0, Lcom/facebook/orca/server/y;->e:Z

    .line 130
    return-object p0
.end method

.method public b()Lcom/facebook/orca/threads/FolderName;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/orca/server/y;->b:Lcom/facebook/orca/threads/FolderName;

    return-object v0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 81
    iget-wide v0, p0, Lcom/facebook/orca/server/y;->c:J

    return-wide v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 100
    iget v0, p0, Lcom/facebook/orca/server/y;->d:I

    return v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 119
    iget-boolean v0, p0, Lcom/facebook/orca/server/y;->e:Z

    return v0
.end method

.method public f()Lcom/facebook/orca/server/FetchThreadListParams;
    .locals 1

    .prologue
    .line 134
    new-instance v0, Lcom/facebook/orca/server/FetchThreadListParams;

    invoke-direct {v0, p0}, Lcom/facebook/orca/server/FetchThreadListParams;-><init>(Lcom/facebook/orca/server/y;)V

    return-object v0
.end method

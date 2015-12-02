.class public Lcom/facebook/orca/server/ac;
.super Ljava/lang/Object;
.source "FetchThreadParamsBuilder.java"


# instance fields
.field private a:Lcom/facebook/orca/server/ThreadCriteria;

.field private b:Lcom/facebook/fbservice/service/s;

.field private c:Lcom/facebook/fbservice/service/s;

.field private d:J

.field private e:Z

.field private f:I

.field private g:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const-wide/16 v1, -0x1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-wide v1, p0, Lcom/facebook/orca/server/ac;->d:J

    .line 17
    const/16 v0, 0x32

    iput v0, p0, Lcom/facebook/orca/server/ac;->f:I

    .line 18
    iput-wide v1, p0, Lcom/facebook/orca/server/ac;->g:J

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/server/ThreadCriteria;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/orca/server/ac;->a:Lcom/facebook/orca/server/ThreadCriteria;

    return-object v0
.end method

.method public a(I)Lcom/facebook/orca/server/ac;
    .locals 0

    .prologue
    .line 86
    iput p1, p0, Lcom/facebook/orca/server/ac;->f:I

    .line 87
    return-object p0
.end method

.method public a(J)Lcom/facebook/orca/server/ac;
    .locals 0

    .prologue
    .line 77
    iput-wide p1, p0, Lcom/facebook/orca/server/ac;->d:J

    .line 78
    return-object p0
.end method

.method public a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/facebook/orca/server/ac;->b:Lcom/facebook/fbservice/service/s;

    .line 46
    return-object p0
.end method

.method public a(Lcom/facebook/orca/server/FetchThreadParams;)Lcom/facebook/orca/server/ac;
    .locals 2

    .prologue
    .line 21
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/ac;->a:Lcom/facebook/orca/server/ThreadCriteria;

    .line 22
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->b()Lcom/facebook/fbservice/service/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/ac;->b:Lcom/facebook/fbservice/service/s;

    .line 23
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->c()Lcom/facebook/fbservice/service/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/ac;->c:Lcom/facebook/fbservice/service/s;

    .line 24
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->d()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/server/ac;->e:Z

    .line 25
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/ac;->d:J

    .line 26
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/server/ac;->f:I

    .line 27
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->g()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/ac;->g:J

    .line 28
    return-object p0
.end method

.method public a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/server/ac;
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/facebook/orca/server/ac;->a:Lcom/facebook/orca/server/ThreadCriteria;

    .line 37
    return-object p0
.end method

.method public a(Z)Lcom/facebook/orca/server/ac;
    .locals 0

    .prologue
    .line 68
    iput-boolean p1, p0, Lcom/facebook/orca/server/ac;->e:Z

    .line 69
    return-object p0
.end method

.method public b()Lcom/facebook/fbservice/service/s;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/orca/server/ac;->b:Lcom/facebook/fbservice/service/s;

    return-object v0
.end method

.method public b(J)Lcom/facebook/orca/server/ac;
    .locals 0

    .prologue
    .line 95
    iput-wide p1, p0, Lcom/facebook/orca/server/ac;->g:J

    .line 96
    return-object p0
.end method

.method public b(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/facebook/orca/server/ac;->c:Lcom/facebook/fbservice/service/s;

    .line 60
    return-object p0
.end method

.method public c()Lcom/facebook/fbservice/service/s;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/orca/server/ac;->c:Lcom/facebook/fbservice/service/s;

    if-nez v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/facebook/orca/server/ac;->b:Lcom/facebook/fbservice/service/s;

    .line 53
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/server/ac;->c:Lcom/facebook/fbservice/service/s;

    goto :goto_0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 64
    iget-boolean v0, p0, Lcom/facebook/orca/server/ac;->e:Z

    return v0
.end method

.method public e()J
    .locals 2

    .prologue
    .line 73
    iget-wide v0, p0, Lcom/facebook/orca/server/ac;->d:J

    return-wide v0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 82
    iget v0, p0, Lcom/facebook/orca/server/ac;->f:I

    return v0
.end method

.method public g()J
    .locals 2

    .prologue
    .line 91
    iget-wide v0, p0, Lcom/facebook/orca/server/ac;->g:J

    return-wide v0
.end method

.method public h()Lcom/facebook/orca/server/FetchThreadParams;
    .locals 1

    .prologue
    .line 100
    new-instance v0, Lcom/facebook/orca/server/FetchThreadParams;

    invoke-direct {v0, p0}, Lcom/facebook/orca/server/FetchThreadParams;-><init>(Lcom/facebook/orca/server/ac;)V

    return-object v0
.end method

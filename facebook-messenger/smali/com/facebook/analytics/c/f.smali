.class public Lcom/facebook/analytics/c/f;
.super Ljava/lang/Object;
.source "AnalyticsSession.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private c:J

.field private d:J

.field private e:Z

.field private f:J

.field private g:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJJ)V
    .locals 3

    .prologue
    const-wide/16 v1, 0x0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/analytics/c/f;->e:Z

    .line 18
    iput-wide v1, p0, Lcom/facebook/analytics/c/f;->f:J

    .line 19
    iput-wide v1, p0, Lcom/facebook/analytics/c/f;->g:J

    .line 27
    iput-object p1, p0, Lcom/facebook/analytics/c/f;->a:Ljava/lang/String;

    .line 28
    iput-object p2, p0, Lcom/facebook/analytics/c/f;->b:Ljava/lang/String;

    .line 29
    iput-wide p3, p0, Lcom/facebook/analytics/c/f;->d:J

    .line 30
    iput-wide p5, p0, Lcom/facebook/analytics/c/f;->c:J

    .line 31
    iput-wide p7, p0, Lcom/facebook/analytics/c/f;->f:J

    .line 32
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/analytics/c/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public a(J)V
    .locals 0

    .prologue
    .line 88
    iput-wide p1, p0, Lcom/facebook/analytics/c/f;->c:J

    .line 89
    return-void
.end method

.method a(Z)V
    .locals 0

    .prologue
    .line 144
    iput-boolean p1, p0, Lcom/facebook/analytics/c/f;->e:Z

    .line 145
    return-void
.end method

.method public b()J
    .locals 2

    .prologue
    .line 47
    iget-wide v0, p0, Lcom/facebook/analytics/c/f;->f:J

    return-wide v0
.end method

.method public b(J)V
    .locals 0

    .prologue
    .line 104
    iput-wide p1, p0, Lcom/facebook/analytics/c/f;->d:J

    .line 105
    return-void
.end method

.method c(J)V
    .locals 0

    .prologue
    .line 152
    iput-wide p1, p0, Lcom/facebook/analytics/c/f;->g:J

    .line 153
    return-void
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 56
    iget-boolean v0, p0, Lcom/facebook/analytics/c/f;->e:Z

    return v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/analytics/c/f;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/analytics/c/f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public f()J
    .locals 2

    .prologue
    .line 80
    iget-wide v0, p0, Lcom/facebook/analytics/c/f;->c:J

    return-wide v0
.end method

.method public g()J
    .locals 2

    .prologue
    .line 96
    iget-wide v0, p0, Lcom/facebook/analytics/c/f;->d:J

    return-wide v0
.end method

.method public h()J
    .locals 2

    .prologue
    .line 113
    iget-wide v0, p0, Lcom/facebook/analytics/c/f;->g:J

    return-wide v0
.end method

.method public i()V
    .locals 4

    .prologue
    .line 121
    iget-wide v0, p0, Lcom/facebook/analytics/c/f;->g:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/analytics/c/f;->g:J

    .line 122
    return-void
.end method

.method public j()Ljava/lang/String;
    .locals 3

    .prologue
    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/analytics/c/f;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/analytics/c/f;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method k()V
    .locals 4

    .prologue
    .line 136
    iget-wide v0, p0, Lcom/facebook/analytics/c/f;->f:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/analytics/c/f;->f:J

    .line 137
    return-void
.end method

.class public Lcom/facebook/e/a/b;
.super Ljava/lang/Object;
.source "DataUsageInfo.java"


# static fields
.field private static a:Ljava/text/DecimalFormat;


# instance fields
.field private b:J

.field private c:J

.field private d:J

.field private e:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 15
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "##0.0"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/e/a/b;->a:Ljava/text/DecimalFormat;

    return-void
.end method

.method public constructor <init>(JJJJ)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-wide p1, p0, Lcom/facebook/e/a/b;->b:J

    .line 26
    iput-wide p3, p0, Lcom/facebook/e/a/b;->c:J

    .line 27
    iput-wide p5, p0, Lcom/facebook/e/a/b;->d:J

    .line 28
    iput-wide p7, p0, Lcom/facebook/e/a/b;->e:J

    .line 29
    return-void
.end method

.method public constructor <init>(Lcom/facebook/e/a/b;)V
    .locals 2

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    invoke-virtual {p1}, Lcom/facebook/e/a/b;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/e/a/b;->b:J

    .line 33
    invoke-virtual {p1}, Lcom/facebook/e/a/b;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/e/a/b;->c:J

    .line 34
    invoke-virtual {p1}, Lcom/facebook/e/a/b;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/e/a/b;->d:J

    .line 35
    invoke-virtual {p1}, Lcom/facebook/e/a/b;->d()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/e/a/b;->e:J

    .line 36
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 42
    iget-wide v0, p0, Lcom/facebook/e/a/b;->b:J

    return-wide v0
.end method

.method a(J)V
    .locals 2

    .prologue
    .line 83
    iget-wide v0, p0, Lcom/facebook/e/a/b;->b:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/facebook/e/a/b;->b:J

    .line 84
    return-void
.end method

.method public b()J
    .locals 2

    .prologue
    .line 49
    iget-wide v0, p0, Lcom/facebook/e/a/b;->c:J

    return-wide v0
.end method

.method b(J)V
    .locals 2

    .prologue
    .line 87
    iget-wide v0, p0, Lcom/facebook/e/a/b;->c:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/facebook/e/a/b;->c:J

    .line 88
    return-void
.end method

.method public c()J
    .locals 2

    .prologue
    .line 56
    iget-wide v0, p0, Lcom/facebook/e/a/b;->d:J

    return-wide v0
.end method

.method c(J)V
    .locals 2

    .prologue
    .line 91
    iget-wide v0, p0, Lcom/facebook/e/a/b;->d:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/facebook/e/a/b;->d:J

    .line 92
    return-void
.end method

.method public d()J
    .locals 2

    .prologue
    .line 63
    iget-wide v0, p0, Lcom/facebook/e/a/b;->e:J

    return-wide v0
.end method

.method d(J)V
    .locals 2

    .prologue
    .line 95
    iget-wide v0, p0, Lcom/facebook/e/a/b;->e:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/facebook/e/a/b;->e:J

    .line 96
    return-void
.end method

.method public e()J
    .locals 4

    .prologue
    .line 70
    iget-wide v0, p0, Lcom/facebook/e/a/b;->b:J

    iget-wide v2, p0, Lcom/facebook/e/a/b;->c:J

    add-long/2addr v0, v2

    iget-wide v2, p0, Lcom/facebook/e/a/b;->d:J

    add-long/2addr v0, v2

    iget-wide v2, p0, Lcom/facebook/e/a/b;->e:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method e(J)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v7, 0x0

    .line 99
    const-wide/16 v0, 0x400

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "B"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 104
    :goto_0
    return-object v0

    .line 101
    :cond_0
    const-wide/32 v0, 0x100000

    cmp-long v0, p1, v0

    if-gez v0, :cond_1

    .line 102
    const-string v0, "%sKB"

    new-array v1, v2, [Ljava/lang/Object;

    sget-object v2, Lcom/facebook/e/a/b;->a:Ljava/text/DecimalFormat;

    long-to-double v3, p1

    const-wide/high16 v5, 0x4090000000000000L    # 1024.0

    div-double/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v7

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 104
    :cond_1
    const-string v0, "%sMB"

    new-array v1, v2, [Ljava/lang/Object;

    sget-object v2, Lcom/facebook/e/a/b;->a:Ljava/text/DecimalFormat;

    long-to-double v3, p1

    const-wide/high16 v5, 0x4130000000000000L    # 1048576.0

    div-double/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v7

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 75
    const-string v0, "Wifi received: %s, Wifi sent: %s, Cell received: %s, Cell sent: %s, Total: %s"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-wide v3, p0, Lcom/facebook/e/a/b;->b:J

    invoke-virtual {p0, v3, v4}, Lcom/facebook/e/a/b;->e(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-wide v3, p0, Lcom/facebook/e/a/b;->c:J

    invoke-virtual {p0, v3, v4}, Lcom/facebook/e/a/b;->e(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-wide v3, p0, Lcom/facebook/e/a/b;->d:J

    invoke-virtual {p0, v3, v4}, Lcom/facebook/e/a/b;->e(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-wide v3, p0, Lcom/facebook/e/a/b;->e:J

    invoke-virtual {p0, v3, v4}, Lcom/facebook/e/a/b;->e(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x4

    invoke-virtual {p0}, Lcom/facebook/e/a/b;->e()J

    move-result-wide v3

    invoke-virtual {p0, v3, v4}, Lcom/facebook/e/a/b;->e(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

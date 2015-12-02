.class public Lcom/facebook/debug/e/a;
.super Ljava/lang/Object;
.source "TrafficTracker.java"


# static fields
.field private static a:J


# instance fields
.field private final b:Lcom/facebook/common/time/a;

.field private final c:Lcom/facebook/e/a/e;

.field private d:J

.field private e:Lcom/facebook/e/a/b;

.field private f:D

.field private g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 26
    const-wide/16 v0, -0x1

    sput-wide v0, Lcom/facebook/debug/e/a;->a:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/time/a;)V
    .locals 4

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/debug/e/a;->f:D

    .line 36
    iput-object p2, p0, Lcom/facebook/debug/e/a;->b:Lcom/facebook/common/time/a;

    .line 37
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 38
    const-class v1, Lcom/facebook/e/a/e;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/e/a/e;

    iput-object v0, p0, Lcom/facebook/debug/e/a;->c:Lcom/facebook/e/a/e;

    .line 39
    invoke-interface {p2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/debug/e/a;->d:J

    .line 40
    iget-object v0, p0, Lcom/facebook/debug/e/a;->c:Lcom/facebook/e/a/e;

    invoke-virtual {v0}, Lcom/facebook/e/a/e;->c()Lcom/facebook/e/a/b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/debug/e/a;->e:Lcom/facebook/e/a/b;

    .line 41
    sget-wide v0, Lcom/facebook/debug/e/a;->a:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/facebook/debug/e/a;->e:Lcom/facebook/e/a/b;

    invoke-virtual {v0}, Lcom/facebook/e/a/b;->e()J

    move-result-wide v0

    sput-wide v0, Lcom/facebook/debug/e/a;->a:J

    .line 44
    :cond_0
    invoke-direct {p0}, Lcom/facebook/debug/e/a;->c()V

    .line 45
    return-void
.end method

.method private static a(D)I
    .locals 2

    .prologue
    .line 62
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_0

    .line 63
    const v0, -0xff0100

    .line 67
    :goto_0
    return v0

    .line 64
    :cond_0
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_1

    .line 65
    const/16 v0, -0x100

    goto :goto_0

    .line 67
    :cond_1
    const/high16 v0, -0x10000

    goto :goto_0
.end method

.method private static a(JD)Ljava/lang/String;
    .locals 4

    .prologue
    .line 131
    const-string v0, "net: %d kb, %.2f kb/s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b()Ljava/lang/String;
    .locals 4

    .prologue
    .line 100
    iget-object v0, p0, Lcom/facebook/debug/e/a;->b:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/debug/e/a;->d:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 102
    invoke-direct {p0}, Lcom/facebook/debug/e/a;->c()V

    .line 104
    :cond_0
    iget-object v0, p0, Lcom/facebook/debug/e/a;->g:Ljava/lang/String;

    return-object v0
.end method

.method private c()V
    .locals 9

    .prologue
    .line 109
    iget-object v0, p0, Lcom/facebook/debug/e/a;->b:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    .line 110
    iget-object v2, p0, Lcom/facebook/debug/e/a;->c:Lcom/facebook/e/a/e;

    invoke-virtual {v2}, Lcom/facebook/e/a/e;->c()Lcom/facebook/e/a/b;

    move-result-object v2

    .line 112
    iget-wide v3, p0, Lcom/facebook/debug/e/a;->d:J

    sub-long v3, v0, v3

    long-to-double v3, v3

    const-wide v5, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double/2addr v3, v5

    .line 115
    const-wide/16 v5, 0x0

    cmpl-double v5, v3, v5

    if-lez v5, :cond_0

    .line 116
    invoke-virtual {v2}, Lcom/facebook/e/a/b;->e()J

    move-result-wide v5

    iget-object v7, p0, Lcom/facebook/debug/e/a;->e:Lcom/facebook/e/a/b;

    invoke-virtual {v7}, Lcom/facebook/e/a/b;->e()J

    move-result-wide v7

    sub-long/2addr v5, v7

    .line 117
    long-to-double v5, v5

    div-double v3, v5, v3

    const-wide/high16 v5, 0x4090000000000000L    # 1024.0

    div-double/2addr v3, v5

    double-to-int v3, v3

    int-to-double v3, v3

    iput-wide v3, p0, Lcom/facebook/debug/e/a;->f:D

    .line 120
    :cond_0
    invoke-virtual {v2}, Lcom/facebook/e/a/b;->e()J

    move-result-wide v3

    sget-wide v5, Lcom/facebook/debug/e/a;->a:J

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x400

    div-long/2addr v3, v5

    .line 122
    iget-wide v5, p0, Lcom/facebook/debug/e/a;->f:D

    invoke-static {v3, v4, v5, v6}, Lcom/facebook/debug/e/a;->a(JD)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/facebook/debug/e/a;->g:Ljava/lang/String;

    .line 126
    iput-wide v0, p0, Lcom/facebook/debug/e/a;->d:J

    .line 127
    iput-object v2, p0, Lcom/facebook/debug/e/a;->e:Lcom/facebook/e/a/b;

    .line 128
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/debug/e/b;
    .locals 4

    .prologue
    .line 53
    new-instance v0, Lcom/facebook/debug/e/b;

    invoke-direct {p0}, Lcom/facebook/debug/e/a;->b()Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Lcom/facebook/debug/e/a;->f:D

    invoke-static {v2, v3}, Lcom/facebook/debug/e/a;->a(D)I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/debug/e/b;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

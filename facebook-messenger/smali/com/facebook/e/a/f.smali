.class Lcom/facebook/e/a/f;
.super Ljava/lang/Object;
.source "ResourceManager.java"


# instance fields
.field private a:J

.field private b:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-wide p1, p0, Lcom/facebook/e/a/f;->a:J

    .line 76
    iput-wide p3, p0, Lcom/facebook/e/a/f;->b:J

    .line 77
    return-void
.end method

.method static a()Lcom/facebook/e/a/f;
    .locals 5

    .prologue
    .line 68
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v0

    .line 69
    invoke-static {v0}, Landroid/net/TrafficStats;->getUidRxBytes(I)J

    move-result-wide v1

    .line 70
    invoke-static {v0}, Landroid/net/TrafficStats;->getUidTxBytes(I)J

    move-result-wide v3

    .line 71
    new-instance v0, Lcom/facebook/e/a/f;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/e/a/f;-><init>(JJ)V

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/e/a/f;)J
    .locals 2

    .prologue
    .line 60
    iget-wide v0, p0, Lcom/facebook/e/a/f;->b:J

    return-wide v0
.end method


# virtual methods
.method public a(Lcom/facebook/e/a/f;)Lcom/facebook/e/a/f;
    .locals 7

    .prologue
    .line 80
    new-instance v0, Lcom/facebook/e/a/f;

    iget-wide v1, p0, Lcom/facebook/e/a/f;->a:J

    invoke-virtual {p1}, Lcom/facebook/e/a/f;->b()J

    move-result-wide v3

    sub-long/2addr v1, v3

    iget-wide v3, p0, Lcom/facebook/e/a/f;->b:J

    invoke-virtual {p1}, Lcom/facebook/e/a/f;->c()J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/e/a/f;-><init>(JJ)V

    return-object v0
.end method

.method public b()J
    .locals 2

    .prologue
    .line 85
    iget-wide v0, p0, Lcom/facebook/e/a/f;->a:J

    return-wide v0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 89
    iget-wide v0, p0, Lcom/facebook/e/a/f;->b:J

    return-wide v0
.end method

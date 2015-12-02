.class Lcom/facebook/analytics/g/d;
.super Ljava/lang/Object;
.source "AnalyticsHighEventsRateReporter.java"


# instance fields
.field private a:J

.field private b:D

.field private c:D


# direct methods
.method constructor <init>(J)V
    .locals 2

    .prologue
    .line 33
    const-wide v0, 0x3fb5555555555555L    # 0.08333333333333333

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/facebook/analytics/g/d;-><init>(JD)V

    .line 34
    return-void
.end method

.method constructor <init>(JD)V
    .locals 2

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/analytics/g/d;->b:D

    .line 39
    iput-wide p1, p0, Lcom/facebook/analytics/g/d;->a:J

    .line 40
    iput-wide p3, p0, Lcom/facebook/analytics/g/d;->c:D

    .line 41
    return-void
.end method

.method private c(J)V
    .locals 8

    .prologue
    .line 54
    iget-wide v0, p0, Lcom/facebook/analytics/g/d;->a:J

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 55
    iput-wide p1, p0, Lcom/facebook/analytics/g/d;->a:J

    .line 56
    invoke-static {}, Lcom/facebook/analytics/g/a;->a()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Time went backwards."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 58
    :cond_0
    iget-wide v0, p0, Lcom/facebook/analytics/g/d;->a:J

    sub-long v0, p1, v0

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    .line 59
    const-wide/16 v2, 0x0

    iget-wide v4, p0, Lcom/facebook/analytics/g/d;->b:D

    iget-wide v6, p0, Lcom/facebook/analytics/g/d;->c:D

    mul-double/2addr v0, v6

    sub-double v0, v4, v0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/analytics/g/d;->b:D

    .line 60
    iput-wide p1, p0, Lcom/facebook/analytics/g/d;->a:J

    .line 61
    return-void
.end method


# virtual methods
.method a(J)D
    .locals 4

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Lcom/facebook/analytics/g/d;->c(J)V

    .line 45
    iget-wide v0, p0, Lcom/facebook/analytics/g/d;->b:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/analytics/g/d;->b:D

    return-wide v0
.end method

.method b(J)D
    .locals 2

    .prologue
    .line 49
    invoke-direct {p0, p1, p2}, Lcom/facebook/analytics/g/d;->c(J)V

    .line 50
    iget-wide v0, p0, Lcom/facebook/analytics/g/d;->b:D

    return-wide v0
.end method

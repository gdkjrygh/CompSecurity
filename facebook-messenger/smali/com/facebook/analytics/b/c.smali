.class public Lcom/facebook/analytics/b/c;
.super Ljava/lang/Object;
.source "CountersPrefWriter.java"


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/facebook/analytics/b/a;

.field private final d:Lcom/facebook/common/time/a;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;Ljava/lang/String;Lcom/facebook/analytics/b/a;Lcom/facebook/common/time/a;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/analytics/b/c;->a:Lcom/facebook/prefs/shared/d;

    .line 27
    iput-object p3, p0, Lcom/facebook/analytics/b/c;->c:Lcom/facebook/analytics/b/a;

    .line 28
    iput-object p2, p0, Lcom/facebook/analytics/b/c;->b:Ljava/lang/String;

    .line 29
    iput-object p4, p0, Lcom/facebook/analytics/b/c;->d:Lcom/facebook/common/time/a;

    .line 30
    return-void
.end method

.method private a()J
    .locals 4

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/analytics/b/c;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/prefs/shared/aj;->l:Lcom/facebook/prefs/shared/ae;

    const-wide/32 v2, 0x1d4c0

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private b(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
    .locals 2

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/analytics/b/c;->c:Lcom/facebook/analytics/b/a;

    iget-object v1, p0, Lcom/facebook/analytics/b/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/b/a;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    return-object v0
.end method

.method private c(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
    .locals 2

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/analytics/b/c;->c:Lcom/facebook/analytics/b/a;

    iget-object v1, p0, Lcom/facebook/analytics/b/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/b/a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/analytics/b/c;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/facebook/analytics/b/c;->c(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/facebook/analytics/b/c;->b(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/analytics/b/c;->d:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 61
    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 6

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/analytics/b/c;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-object v2, p0, Lcom/facebook/analytics/b/c;->a:Lcom/facebook/prefs/shared/d;

    invoke-direct {p0, p1}, Lcom/facebook/analytics/b/c;->b(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-interface {v2, v3, v4, v5}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-direct {p0}, Lcom/facebook/analytics/b/c;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/analytics/b/c;->a:Lcom/facebook/prefs/shared/d;

    invoke-direct {p0, p1}, Lcom/facebook/analytics/b/c;->c(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

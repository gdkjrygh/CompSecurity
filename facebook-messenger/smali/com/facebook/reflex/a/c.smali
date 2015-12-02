.class public Lcom/facebook/reflex/a/c;
.super Lcom/facebook/reflex/a/a;
.source "CheckerboardPeriodicReporter.java"


# instance fields
.field private final a:Lcom/facebook/reflex/a/b;

.field private final b:Lcom/facebook/reflex/a/b;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;)V
    .locals 9

    .prologue
    .line 31
    invoke-direct {p0, p1}, Lcom/facebook/reflex/a/a;-><init>(Lcom/facebook/prefs/shared/d;)V

    .line 25
    new-instance v0, Lcom/facebook/reflex/a/b;

    const-wide/high16 v1, 0x3fd0000000000000L    # 0.25

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    const-wide/high16 v5, 0x3fe8000000000000L    # 0.75

    invoke-direct/range {v0 .. v6}, Lcom/facebook/reflex/a/b;-><init>(DDD)V

    iput-object v0, p0, Lcom/facebook/reflex/a/c;->a:Lcom/facebook/reflex/a/b;

    .line 26
    new-instance v0, Lcom/facebook/reflex/a/b;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    const-wide/high16 v5, 0x4059000000000000L    # 100.0

    const-wide v7, 0x408f400000000000L    # 1000.0

    invoke-direct/range {v0 .. v8}, Lcom/facebook/reflex/a/b;-><init>(DDDD)V

    iput-object v0, p0, Lcom/facebook/reflex/a/c;->b:Lcom/facebook/reflex/a/b;

    .line 32
    return-void
.end method


# virtual methods
.method a()Lcom/facebook/prefs/shared/ae;
    .locals 1

    .prologue
    .line 45
    sget-object v0, Lcom/facebook/reflex/ae;->e:Lcom/facebook/prefs/shared/ae;

    return-object v0
.end method

.method public a(JLjava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/facebook/analytics/ca;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 63
    invoke-virtual {p0, p1, p2}, Lcom/facebook/reflex/a/c;->b(J)V

    .line 65
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "reflex_checkerboard"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 66
    iget-object v1, p0, Lcom/facebook/reflex/a/c;->a:Lcom/facebook/reflex/a/b;

    invoke-virtual {v1}, Lcom/facebook/reflex/a/b;->a()[I

    move-result-object v1

    .line 67
    iget-object v2, p0, Lcom/facebook/reflex/a/c;->b:Lcom/facebook/reflex/a/b;

    invoke-virtual {v2}, Lcom/facebook/reflex/a/b;->a()[I

    move-result-object v2

    .line 69
    const-string v3, "prop_lt_0.25"

    aget v4, v1, v5

    invoke-virtual {v0, v3, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 70
    const-string v3, "prop_lt_0.5"

    aget v4, v1, v6

    invoke-virtual {v0, v3, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 71
    const-string v3, "prop_lt_0.75"

    aget v4, v1, v7

    invoke-virtual {v0, v3, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 72
    const-string v3, "prop_lt_1"

    aget v1, v1, v8

    invoke-virtual {v0, v3, v1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 74
    const-string v1, "lat_lt_1"

    aget v3, v2, v5

    invoke-virtual {v0, v1, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 75
    const-string v1, "lat_lt_10"

    aget v3, v2, v6

    invoke-virtual {v0, v1, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 76
    const-string v1, "lat_lt_100"

    aget v3, v2, v7

    invoke-virtual {v0, v1, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 77
    const-string v1, "lat_lt_1000"

    aget v3, v2, v8

    invoke-virtual {v0, v1, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 78
    const-string v1, "lat_lt_inf"

    const/4 v3, 0x4

    aget v2, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 79
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(D)V
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/reflex/a/c;->a:Lcom/facebook/reflex/a/b;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/reflex/a/b;->a(D)V

    .line 55
    return-void
.end method

.method public a(J)Z
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/reflex/a/c;->a:Lcom/facebook/reflex/a/b;

    invoke-virtual {v0}, Lcom/facebook/reflex/a/b;->b()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/reflex/a/c;->b:Lcom/facebook/reflex/a/b;

    invoke-virtual {v0}, Lcom/facebook/reflex/a/b;->b()I

    move-result v0

    if-nez v0, :cond_0

    .line 38
    const/4 v0, 0x0

    .line 40
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/facebook/reflex/a/a;->a(J)Z

    move-result v0

    goto :goto_0
.end method

.method b()J
    .locals 2

    .prologue
    .line 50
    const-wide/32 v0, 0x1b7740

    return-wide v0
.end method

.method public b(D)V
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/reflex/a/c;->b:Lcom/facebook/reflex/a/b;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/reflex/a/b;->a(D)V

    .line 59
    return-void
.end method

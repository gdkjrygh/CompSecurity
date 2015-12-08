.class public final Lcom/b/a/e;
.super Lcom/b/a/i;


# instance fields
.field private a:J

.field private b:J


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Lcom/b/a/i;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/b/a/e;->b:J

    int-to-long v0, p1

    iput-wide v0, p0, Lcom/b/a/e;->a:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/b/a/e;->b:J

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/b/a/e;->b:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lcom/b/a/e;->a:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Z)Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/b/a/e;->b:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lcom/b/a/e;->a:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.class public final Lcom/b/a/g;
.super Lcom/b/a/i;


# instance fields
.field private a:J

.field private b:J

.field private c:Lb/a/b;


# direct methods
.method public constructor <init>(Lb/a/b;J)V
    .locals 2

    invoke-direct {p0}, Lcom/b/a/i;-><init>()V

    const-wide/32 v0, 0x15f90

    iput-wide v0, p0, Lcom/b/a/g;->a:J

    iput-object p1, p0, Lcom/b/a/g;->c:Lb/a/b;

    iget-wide v0, p0, Lcom/b/a/g;->a:J

    cmp-long v0, p2, v0

    if-gez v0, :cond_0

    iget-wide p2, p0, Lcom/b/a/g;->a:J

    :cond_0
    iput-wide p2, p0, Lcom/b/a/g;->b:J

    return-void
.end method


# virtual methods
.method public final a(Z)Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/b/a/g;->c:Lb/a/b;

    iget-wide v2, v2, Lb/a/b;->c:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lcom/b/a/g;->b:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

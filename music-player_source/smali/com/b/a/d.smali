.class public final Lcom/b/a/d;
.super Lcom/b/a/i;


# instance fields
.field private a:Lb/a/j;

.field private b:Lb/a/b;


# direct methods
.method public constructor <init>(Lb/a/b;Lb/a/j;)V
    .locals 0

    invoke-direct {p0}, Lcom/b/a/i;-><init>()V

    iput-object p1, p0, Lcom/b/a/d;->b:Lb/a/b;

    iput-object p2, p0, Lcom/b/a/d;->a:Lb/a/j;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lcom/b/a/d;->a:Lb/a/j;

    invoke-virtual {v0}, Lb/a/j;->b()Z

    move-result v0

    return v0
.end method

.method public final a(Z)Z
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/b/a/d;->a:Lb/a/j;

    invoke-virtual {v2}, Lb/a/j;->a()J

    move-result-wide v2

    iget-object v4, p0, Lcom/b/a/d;->b:Lb/a/b;

    iget-wide v4, v4, Lb/a/b;->c:J

    sub-long/2addr v0, v4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

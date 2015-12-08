.class public final Lcom/b/a/h;
.super Lcom/b/a/i;


# instance fields
.field private a:J

.field private b:Lb/a/b;


# direct methods
.method public constructor <init>(Lb/a/b;)V
    .locals 2

    invoke-direct {p0}, Lcom/b/a/i;-><init>()V

    const-wide/32 v0, 0x5265c00

    iput-wide v0, p0, Lcom/b/a/h;->a:J

    iput-object p1, p0, Lcom/b/a/h;->b:Lb/a/b;

    return-void
.end method


# virtual methods
.method public final a(Z)Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/b/a/h;->b:Lb/a/b;

    iget-wide v2, v2, Lb/a/b;->c:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lcom/b/a/h;->a:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

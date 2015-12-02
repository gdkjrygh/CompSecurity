.class public Lcom/facebook/orca/common/a/b;
.super Ljava/lang/Object;
.source "OfflineThreadingIdGenerator.java"


# instance fields
.field private a:Ljava/util/Random;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/common/a/b;->a:Ljava/util/Random;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 4

    .prologue
    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 20
    iget-object v2, p0, Lcom/facebook/orca/common/a/b;->a:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextInt()I

    move-result v2

    .line 22
    const/16 v3, 0x16

    shl-long/2addr v0, v3

    const v3, 0x3fffff

    and-int/2addr v2, v3

    int-to-long v2, v2

    or-long/2addr v0, v2

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

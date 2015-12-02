.class Lcom/facebook/orca/f/ag;
.super Ljava/lang/Object;
.source "ThreadsCacheUpdateRateLimiter.java"


# annotations
.annotation build Lcom/google/common/annotations/VisibleForTesting;
.end annotation


# instance fields
.field final a:Lcom/facebook/fbservice/service/s;

.field final b:Lcom/facebook/orca/f/ah;


# direct methods
.method constructor <init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/orca/f/ah;)V
    .locals 0

    .prologue
    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    iput-object p1, p0, Lcom/facebook/orca/f/ag;->a:Lcom/facebook/fbservice/service/s;

    .line 118
    iput-object p2, p0, Lcom/facebook/orca/f/ag;->b:Lcom/facebook/orca/f/ah;

    .line 119
    return-void
.end method

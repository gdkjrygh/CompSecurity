.class public Lcom/facebook/cache/v;
.super Ljava/lang/Object;
.source "TrackedLruCache.java"


# instance fields
.field private a:Lcom/facebook/analytics/cache/h;

.field private b:Lcom/facebook/common/e/h;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/cache/h;Lcom/facebook/common/e/h;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    iput-object p1, p0, Lcom/facebook/cache/v;->a:Lcom/facebook/analytics/cache/h;

    .line 29
    iput-object p2, p0, Lcom/facebook/cache/v;->b:Lcom/facebook/common/e/h;

    .line 30
    return-void
.end method

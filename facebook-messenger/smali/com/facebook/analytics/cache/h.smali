.class public Lcom/facebook/analytics/cache/h;
.super Ljava/lang/Object;
.source "CacheTracker.java"


# instance fields
.field private a:Lcom/facebook/analytics/cache/d;

.field private b:Lcom/facebook/analytics/ak;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/cache/d;Lcom/facebook/analytics/ak;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/analytics/cache/h;->a:Lcom/facebook/analytics/cache/d;

    .line 24
    iput-object p2, p0, Lcom/facebook/analytics/cache/h;->b:Lcom/facebook/analytics/ak;

    .line 25
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/facebook/analytics/cache/e;
    .locals 4

    .prologue
    .line 28
    new-instance v0, Lcom/facebook/analytics/cache/e;

    iget-object v1, p0, Lcom/facebook/analytics/cache/h;->a:Lcom/facebook/analytics/cache/d;

    iget-object v2, p0, Lcom/facebook/analytics/cache/h;->b:Lcom/facebook/analytics/ak;

    const/4 v3, 0x0

    invoke-direct {v0, v1, p1, v2, v3}, Lcom/facebook/analytics/cache/e;-><init>(Lcom/facebook/analytics/cache/d;Ljava/lang/String;Lcom/facebook/analytics/ak;Lcom/facebook/analytics/cache/f;)V

    return-object v0
.end method

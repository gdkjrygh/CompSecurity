.class public Lcom/facebook/k/l;
.super Lcom/facebook/c/k;
.source "RadioPowerManager.java"


# direct methods
.method public constructor <init>(Lcom/facebook/k/j;)V
    .locals 2

    .prologue
    .line 287
    const-string v0, "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED"

    new-instance v1, Lcom/facebook/k/m;

    invoke-direct {v1, p1}, Lcom/facebook/k/m;-><init>(Lcom/facebook/k/j;)V

    invoke-direct {p0, v0, v1}, Lcom/facebook/c/k;-><init>(Ljava/lang/String;Lcom/facebook/c/b;)V

    .line 291
    return-void
.end method

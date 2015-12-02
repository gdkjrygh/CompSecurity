.class public Lcom/facebook/device_id/UniqueIdSupplier;
.super Lcom/facebook/c/k;
.source "UniqueIdSupplier.java"


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 13
    const-string v0, "com.facebook.GET_UNIQUE_ID"

    new-instance v1, Lcom/facebook/device_id/m;

    invoke-direct {v1}, Lcom/facebook/device_id/m;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/facebook/c/k;-><init>(Ljava/lang/String;Lcom/facebook/c/b;)V

    .line 14
    return-void
.end method

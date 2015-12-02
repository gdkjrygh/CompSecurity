.class public Lcom/facebook/prefs/shared/aa;
.super Lcom/facebook/d/c/a;
.source "FbSharedPropertyUtil.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/d/c/a",
        "<",
        "Lcom/facebook/prefs/shared/FbSharedPropertyKey;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/w;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 13
    const-string v0, "orca_non_cached_preferences"

    invoke-direct {p0, p1, v0}, Lcom/facebook/d/c/a;-><init>(Lcom/google/common/base/Supplier;Ljava/lang/String;)V

    .line 14
    return-void
.end method

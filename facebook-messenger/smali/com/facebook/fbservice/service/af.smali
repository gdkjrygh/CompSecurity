.class public Lcom/facebook/fbservice/service/af;
.super Ljava/lang/RuntimeException;
.source "OperationResult.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 31
    const-string v0, "Invalid result data parcelable. This probably means there was no result"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 32
    return-void
.end method

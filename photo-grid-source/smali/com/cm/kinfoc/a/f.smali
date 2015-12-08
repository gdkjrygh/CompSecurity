.class public final Lcom/cm/kinfoc/a/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 31
    sget-boolean v0, Lcom/cm/kinfoc/ag;->a:Z

    if-eqz v0, :cond_0

    .line 32
    const-string v0, "InfocLog"

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    :cond_0
    return-void
.end method

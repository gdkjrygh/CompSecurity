.class public final Lcom/cmcm/a/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 74
    if-eq p0, p1, :cond_0

    .line 75
    const-string v0, "AssureEqual"

    .line 1027
    const-string v1, "ASSURE fail"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    :cond_0
    return-void
.end method

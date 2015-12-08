.class public Lcom/facebook/LegacyHelper;
.super Ljava/lang/Object;
.source "LegacyHelper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static extendTokenCompleted(Lcom/facebook/Session;Landroid/os/Bundle;)V
    .locals 0
    .param p0, "session"    # Lcom/facebook/Session;
    .param p1, "bundle"    # Landroid/os/Bundle;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 29
    invoke-virtual {p0, p1}, Lcom/facebook/Session;->extendTokenCompleted(Landroid/os/Bundle;)V

    .line 30
    return-void
.end method

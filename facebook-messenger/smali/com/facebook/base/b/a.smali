.class public Lcom/facebook/base/b/a;
.super Ljava/lang/Object;
.source "DialogWindowUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    return-void
.end method

.method public static a(Landroid/app/Dialog;)V
    .locals 2

    .prologue
    .line 24
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 27
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_0

    instance-of v1, v0, Lcom/facebook/base/b/b;

    if-nez v1, :cond_0

    .line 28
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    .line 30
    :cond_0
    instance-of v1, v0, Lcom/facebook/base/b/b;

    if-eqz v1, :cond_1

    .line 31
    check-cast v0, Lcom/facebook/base/b/b;

    invoke-interface {v0, p0}, Lcom/facebook/base/b/b;->a(Landroid/app/Dialog;)V

    .line 33
    :cond_1
    return-void
.end method

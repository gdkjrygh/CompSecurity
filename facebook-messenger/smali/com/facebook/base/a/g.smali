.class public Lcom/facebook/base/a/g;
.super Ljava/lang/Object;
.source "AppInitLockHelper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 24
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 25
    const-class v1, Lcom/facebook/base/a/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/a/d;

    .line 26
    invoke-virtual {v0}, Lcom/facebook/base/a/d;->b()V

    .line 27
    return-void
.end method

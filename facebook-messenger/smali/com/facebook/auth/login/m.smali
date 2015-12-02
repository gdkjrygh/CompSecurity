.class public Lcom/facebook/auth/login/m;
.super Lcom/facebook/widget/f;
.source "AuthFragmentViewGroup.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/facebook/auth/login/c;",
        ">",
        "Lcom/facebook/widget/f;"
    }
.end annotation


# instance fields
.field protected final control:Lcom/facebook/auth/login/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/auth/login/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TT;)V"
        }
    .end annotation

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 31
    iput-object p2, p0, Lcom/facebook/auth/login/m;->control:Lcom/facebook/auth/login/c;

    .line 32
    return-void
.end method


# virtual methods
.method protected getArguments()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/auth/login/m;->control:Lcom/facebook/auth/login/c;

    invoke-interface {v0}, Lcom/facebook/auth/login/c;->d()Lcom/facebook/auth/login/AuthFragmentConfig;

    move-result-object v0

    iget-object v0, v0, Lcom/facebook/auth/login/AuthFragmentConfig;->b:Landroid/os/Bundle;

    return-object v0
.end method

.method protected getResource(Ljava/lang/String;I)I
    .locals 2

    .prologue
    .line 39
    invoke-virtual {p0}, Lcom/facebook/auth/login/m;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    .line 40
    const/4 v0, 0x0

    .line 42
    if-eqz v1, :cond_0

    .line 43
    invoke-virtual {v1, p1, p2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 46
    :cond_0
    if-nez v0, :cond_1

    .line 50
    :goto_0
    return p2

    :cond_1
    move p2, v0

    goto :goto_0
.end method

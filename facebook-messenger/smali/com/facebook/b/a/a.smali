.class public Lcom/facebook/b/a/a;
.super Lcom/facebook/base/activity/a;
.source "ChatHeadsActivityListener.java"


# instance fields
.field private final a:Lcom/facebook/b/a/b;

.field private final b:Lcom/facebook/config/a/d;

.field private c:Z


# direct methods
.method public constructor <init>(Lcom/facebook/b/a/b;Lcom/facebook/config/a/d;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/facebook/base/activity/a;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/b/a/a;->a:Lcom/facebook/b/a/b;

    .line 24
    iput-object p2, p0, Lcom/facebook/b/a/a;->b:Lcom/facebook/config/a/d;

    .line 25
    return-void
.end method


# virtual methods
.method public b(Landroid/app/Activity;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 29
    invoke-virtual {p1}, Landroid/app/Activity;->getParent()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 45
    :cond_0
    :goto_0
    return-void

    .line 34
    :cond_1
    iget-object v0, p0, Lcom/facebook/b/a/a;->b:Lcom/facebook/config/a/d;

    sget-object v2, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-ne v0, v2, :cond_3

    move v0, v1

    .line 37
    :goto_1
    instance-of v2, p1, Lcom/facebook/b/a/f;

    if-eqz v2, :cond_2

    .line 38
    check-cast p1, Lcom/facebook/b/a/f;

    .line 39
    invoke-interface {p1}, Lcom/facebook/b/a/f;->a_()Z

    move-result v0

    .line 41
    :cond_2
    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/facebook/b/a/a;->a:Lcom/facebook/b/a/b;

    invoke-virtual {v0}, Lcom/facebook/b/a/b;->c()V

    .line 43
    iput-boolean v1, p0, Lcom/facebook/b/a/a;->c:Z

    goto :goto_0

    .line 34
    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public c(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 49
    invoke-virtual {p1}, Landroid/app/Activity;->getParent()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 56
    :cond_0
    :goto_0
    return-void

    .line 52
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/b/a/a;->c:Z

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/facebook/b/a/a;->a:Lcom/facebook/b/a/b;

    invoke-virtual {v0}, Lcom/facebook/b/a/b;->b()V

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/b/a/a;->c:Z

    goto :goto_0
.end method

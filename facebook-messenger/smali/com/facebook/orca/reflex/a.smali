.class public Lcom/facebook/orca/reflex/a;
.super Lcom/facebook/orca/common/ui/a/a;
.source "FbReflexViewHelper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/a/a;-><init>()V

    return-void
.end method

.method private a(Landroid/view/View;)Lcom/facebook/reflex/Widget;
    .locals 1

    .prologue
    .line 38
    instance-of v0, p1, Lcom/facebook/reflex/view/b/r;

    if-eqz v0, :cond_0

    .line 39
    check-cast p1, Lcom/facebook/reflex/view/b/r;

    invoke-interface {p1}, Lcom/facebook/reflex/view/b/r;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v0

    .line 41
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/view/View;F)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/facebook/orca/reflex/a;->a(Landroid/view/View;)Lcom/facebook/reflex/Widget;

    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    invoke-virtual {v0, p2}, Lcom/facebook/reflex/Widget;->b(F)V

    .line 25
    :goto_0
    return-void

    .line 23
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/facebook/orca/common/ui/a/a;->a(Landroid/view/View;F)V

    goto :goto_0
.end method

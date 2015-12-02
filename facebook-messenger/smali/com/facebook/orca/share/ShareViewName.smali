.class public Lcom/facebook/orca/share/ShareViewName;
.super Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;
.source "ShareViewName.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;-><init>(Landroid/content/Context;)V

    .line 18
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/share/ShareViewName;->setMaxLines(I)V

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/share/ShareViewName;->setMaxLines(I)V

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/share/ShareViewName;->setMaxLines(I)V

    .line 29
    return-void
.end method


# virtual methods
.method protected drawableStateChanged()V
    .locals 2

    .prologue
    .line 36
    invoke-virtual {p0}, Lcom/facebook/orca/share/ShareViewName;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 37
    :goto_0
    if-eqz v1, :cond_1

    .line 38
    instance-of v0, v1, Lcom/facebook/orca/share/ShareView;

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 39
    check-cast v0, Lcom/facebook/orca/share/ShareView;

    .line 40
    invoke-virtual {v0}, Lcom/facebook/orca/share/ShareView;->a()V

    .line 42
    :cond_0
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    goto :goto_0

    .line 44
    :cond_1
    return-void
.end method

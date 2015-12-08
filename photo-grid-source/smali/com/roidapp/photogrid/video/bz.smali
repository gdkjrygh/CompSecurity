.class final Lcom/roidapp/photogrid/video/bz;
.super Lcom/roidapp/baselib/view/t;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/bp;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/video/bp;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 735
    iput-object p1, p0, Lcom/roidapp/photogrid/video/bz;->a:Lcom/roidapp/photogrid/video/bp;

    .line 736
    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, Lcom/roidapp/baselib/view/t;-><init>(Landroid/content/Context;I)V

    .line 737
    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    .line 747
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/baselib/view/t;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 748
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/video/bz;->isEnabled(I)Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, v1, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 749
    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v2

    .line 750
    if-eqz v2, :cond_0

    move-object v0, v1

    .line 751
    check-cast v0, Landroid/widget/TextView;

    const/16 v3, 0x46

    invoke-virtual {v2, v3}, Landroid/content/res/ColorStateList;->withAlpha(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 754
    :cond_0
    return-object v1
.end method

.method public final isEnabled(I)Z
    .locals 1

    .prologue
    .line 742
    const/4 v0, 0x1

    return v0
.end method

.class public Lcom/hmobile/tooltip/ToolTipRelativeLayout;
.super Landroid/widget/RelativeLayout;
.source "ToolTipRelativeLayout.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 26
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 30
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 34
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 35
    return-void
.end method


# virtual methods
.method public showToolTipForView(Lcom/hmobile/tooltip/ToolTip;Landroid/view/View;)Lcom/hmobile/tooltip/ToolTipView;
    .locals 2
    .param p1, "toolTip"    # Lcom/hmobile/tooltip/ToolTip;
    .param p2, "view"    # Landroid/view/View;

    .prologue
    .line 43
    new-instance v0, Lcom/hmobile/tooltip/ToolTipView;

    invoke-virtual {p0}, Lcom/hmobile/tooltip/ToolTipRelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/hmobile/tooltip/ToolTipView;-><init>(Landroid/content/Context;)V

    .line 44
    .local v0, "toolTipView":Lcom/hmobile/tooltip/ToolTipView;
    invoke-virtual {v0, p1, p2}, Lcom/hmobile/tooltip/ToolTipView;->setToolTip(Lcom/hmobile/tooltip/ToolTip;Landroid/view/View;)V

    .line 45
    invoke-virtual {p0, v0}, Lcom/hmobile/tooltip/ToolTipRelativeLayout;->addView(Landroid/view/View;)V

    .line 46
    return-object v0
.end method

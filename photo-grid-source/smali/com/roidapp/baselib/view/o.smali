.class final Lcom/roidapp/baselib/view/o;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/view/HeaderFooterGridView;


# direct methods
.method public constructor <init>(Lcom/roidapp/baselib/view/HeaderFooterGridView;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 242
    iput-object p1, p0, Lcom/roidapp/baselib/view/o;->a:Lcom/roidapp/baselib/view/HeaderFooterGridView;

    .line 243
    invoke-direct {p0, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 244
    return-void
.end method


# virtual methods
.method protected final onMeasure(II)V
    .locals 2

    .prologue
    .line 248
    iget-object v0, p0, Lcom/roidapp/baselib/view/o;->a:Lcom/roidapp/baselib/view/HeaderFooterGridView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/HeaderFooterGridView;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/baselib/view/o;->a:Lcom/roidapp/baselib/view/HeaderFooterGridView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/view/HeaderFooterGridView;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/roidapp/baselib/view/o;->a:Lcom/roidapp/baselib/view/HeaderFooterGridView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/view/HeaderFooterGridView;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    .line 251
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 253
    invoke-super {p0, v0, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 254
    return-void
.end method

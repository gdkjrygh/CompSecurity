.class final Lcom/roidapp/baselib/view/q;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/view/p;

.field private b:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/roidapp/baselib/view/p;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 274
    iput-object p1, p0, Lcom/roidapp/baselib/view/q;->a:Lcom/roidapp/baselib/view/p;

    .line 275
    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 276
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 287
    iput-object p1, p0, Lcom/roidapp/baselib/view/q;->b:Landroid/view/View;

    .line 288
    return-void
.end method

.method protected final onMeasure(II)V
    .locals 2

    .prologue
    .line 292
    iget-object v0, p0, Lcom/roidapp/baselib/view/q;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 294
    invoke-super {p0, p1, v0}, Landroid/view/View;->onMeasure(II)V

    .line 295
    return-void
.end method

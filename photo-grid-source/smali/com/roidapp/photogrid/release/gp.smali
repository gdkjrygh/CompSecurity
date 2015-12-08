.class final Lcom/roidapp/photogrid/release/gp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ge;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ge;)V
    .locals 0

    .prologue
    .line 279
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 284
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    if-nez v0, :cond_1

    .line 312
    :cond_0
    :goto_0
    return-void

    .line 287
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 288
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    .line 292
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 293
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ListView;->getLastVisiblePosition()I

    move-result v1

    if-eq v1, p3, :cond_2

    iget-object v1, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ListView;->getLastVisiblePosition()I

    move-result v1

    add-int/lit8 v2, p3, 0x1

    if-ne v1, v2, :cond_5

    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ListView;->getCount()I

    move-result v1

    add-int/lit8 v2, p3, 0x1

    if-le v1, v2, :cond_5

    .line 294
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v1

    add-int/lit8 v2, p3, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->smoothScrollToPosition(I)V

    .line 299
    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/rc;->a()Ljava/util/HashMap;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/ge;->a(Lcom/roidapp/photogrid/release/ge;Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 301
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 302
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1, p3}, Lcom/roidapp/photogrid/release/ge;->a(Lcom/roidapp/photogrid/release/ge;I)I

    .line 303
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->g(Lcom/roidapp/photogrid/release/ge;)Ljava/util/HashMap;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 304
    if-eqz v0, :cond_4

    .line 305
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->g(Lcom/roidapp/photogrid/release/ge;)Ljava/util/HashMap;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ra;->b(Landroid/graphics/Typeface;)V

    .line 310
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 311
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->h(Lcom/roidapp/photogrid/release/ge;)V

    goto/16 :goto_0

    .line 295
    :cond_5
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v1

    if-eq v1, p3, :cond_6

    iget-object v1, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v1

    add-int/lit8 v2, p3, -0x1

    if-ne v1, v2, :cond_3

    :cond_6
    add-int/lit8 v1, p3, -0x1

    if-ltz v1, :cond_3

    .line 296
    iget-object v1, p0, Lcom/roidapp/photogrid/release/gp;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v1

    add-int/lit8 v2, p3, -0x1

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->smoothScrollToPosition(I)V

    goto :goto_1
.end method

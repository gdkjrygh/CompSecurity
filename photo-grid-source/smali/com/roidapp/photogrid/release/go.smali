.class final Lcom/roidapp/photogrid/release/go;
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
    .line 220
    iput-object p1, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
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
    const/4 v3, 0x1

    .line 225
    iget-object v0, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    if-nez v0, :cond_1

    .line 267
    :cond_0
    :goto_0
    return-void

    .line 228
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 229
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    .line 233
    iget-object v1, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 234
    iget-object v1, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ListView;->getLastVisiblePosition()I

    move-result v1

    if-eq v1, p3, :cond_2

    iget-object v1, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ListView;->getLastVisiblePosition()I

    move-result v1

    add-int/lit8 v2, p3, 0x1

    if-ne v1, v2, :cond_5

    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ListView;->getCount()I

    move-result v1

    add-int/lit8 v2, p3, 0x1

    if-le v1, v2, :cond_5

    .line 235
    iget-object v1, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v1

    add-int/lit8 v2, p3, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->smoothScrollToPosition(I)V

    .line 240
    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/rc;->a()Ljava/util/HashMap;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/ge;->a(Lcom/roidapp/photogrid/release/ge;Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 242
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 243
    iget-object v1, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1, p3}, Lcom/roidapp/photogrid/release/ge;->a(Lcom/roidapp/photogrid/release/ge;I)I

    .line 244
    iget-object v1, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->g(Lcom/roidapp/photogrid/release/ge;)Ljava/util/HashMap;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 245
    if-eqz v0, :cond_4

    .line 247
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->g(Lcom/roidapp/photogrid/release/ge;)Ljava/util/HashMap;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ra;->b(Landroid/graphics/Typeface;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 265
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 266
    iget-object v0, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->h(Lcom/roidapp/photogrid/release/ge;)V

    goto/16 :goto_0

    .line 236
    :cond_5
    iget-object v1, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v1

    if-eq v1, p3, :cond_6

    iget-object v1, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v1

    add-int/lit8 v2, p3, -0x1

    if-ne v1, v2, :cond_3

    :cond_6
    add-int/lit8 v1, p3, -0x1

    if-ltz v1, :cond_3

    .line 237
    iget-object v1, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v1

    add-int/lit8 v2, p3, -0x1

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->smoothScrollToPosition(I)V

    goto :goto_1

    .line 249
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 252
    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/ra;->f:Z

    .line 253
    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/ra;->ak:Z

    .line 254
    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/ra;->al:Z

    .line 255
    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/ra;->am:Z

    .line 256
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->B()Z

    move-result v0

    if-nez v0, :cond_0

    .line 257
    iget-object v0, p0, Lcom/roidapp/photogrid/release/go;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->L()V

    goto/16 :goto_0
.end method

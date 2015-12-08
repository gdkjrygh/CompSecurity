.class final Lcom/roidapp/imagelib/freecrop/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/freecrop/TemplateClipView;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/freecrop/TemplateClipView;)V
    .locals 0

    .prologue
    .line 137
    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/o;->a:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 140
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/o;->a:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->a(Lcom/roidapp/imagelib/freecrop/TemplateClipView;)Ljava/util/List;

    move-result-object v1

    monitor-enter v1

    .line 141
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/o;->a:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->a(Lcom/roidapp/imagelib/freecrop/TemplateClipView;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/o;->a:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->b(Lcom/roidapp/imagelib/freecrop/TemplateClipView;)[I

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/o;->a:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-static {v2}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->c(Lcom/roidapp/imagelib/freecrop/TemplateClipView;)I

    move-result v2

    aget v0, v0, v2

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/o;->a:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->b(Lcom/roidapp/imagelib/freecrop/TemplateClipView;)[I

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/o;->a:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-static {v2}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->c(Lcom/roidapp/imagelib/freecrop/TemplateClipView;)I

    move-result v2

    aget v0, v0, v2

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/o;->a:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-static {v2}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->a(Lcom/roidapp/imagelib/freecrop/TemplateClipView;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 142
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/o;->a:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->a(Lcom/roidapp/imagelib/freecrop/TemplateClipView;)Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/o;->a:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-static {v2}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->b(Lcom/roidapp/imagelib/freecrop/TemplateClipView;)[I

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/o;->a:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-static {v3}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->c(Lcom/roidapp/imagelib/freecrop/TemplateClipView;)I

    move-result v3

    aget v2, v2, v3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/g;->o:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 143
    invoke-virtual {v0}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 144
    if-eqz v0, :cond_0

    .line 145
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/o;->a:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLeft()I

    move-result v0

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->scrollTo(II)V

    .line 151
    :goto_0
    monitor-exit v1

    return-void

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/o;->a:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->scrollTo(II)V

    goto :goto_0

    .line 151
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 149
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/o;->a:Lcom/roidapp/imagelib/freecrop/TemplateClipView;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/imagelib/freecrop/TemplateClipView;->scrollTo(II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

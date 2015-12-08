.class final Lcom/roidapp/photogrid/release/gq;
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
    .line 322
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
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
    .line 328
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->c(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 329
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->c(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getLastVisiblePosition()I

    move-result v0

    if-eq v0, p3, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->c(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getLastVisiblePosition()I

    move-result v0

    add-int/lit8 v1, p3, 0x1

    if-ne v0, v1, :cond_3

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->c(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getCount()I

    move-result v0

    add-int/lit8 v1, p3, 0x1

    if-le v0, v1, :cond_3

    .line 330
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->c(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v0

    add-int/lit8 v1, p3, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->smoothScrollToPosition(I)V

    .line 335
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->i(Lcom/roidapp/photogrid/release/ge;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, p3

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/ge;->i(Lcom/roidapp/photogrid/release/ge;)[Ljava/lang/String;

    move-result-object v3

    aget-object v3, v3, p3

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ge;->a(Lcom/roidapp/photogrid/release/ge;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 336
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    const v2, 0x7f070187

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ge;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 344
    :cond_2
    :goto_1
    return-void

    .line 331
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->c(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v0

    if-eq v0, p3, :cond_4

    iget-object v0, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->c(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v0

    add-int/lit8 v1, p3, -0x1

    if-ne v0, v1, :cond_1

    :cond_4
    add-int/lit8 v0, p3, -0x1

    if-ltz v0, :cond_1

    .line 332
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->c(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v0

    add-int/lit8 v1, p3, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->smoothScrollToPosition(I)V

    goto :goto_0

    .line 338
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->j(Lcom/roidapp/photogrid/release/ge;)Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->j(Lcom/roidapp/photogrid/release/ge;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 341
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/gq;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->i(Lcom/roidapp/photogrid/release/ge;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, p3

    const-string v2, "http://dl.pg.ksmobile.com/fonts/"

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/ge;->a(Lcom/roidapp/photogrid/release/ge;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

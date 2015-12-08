.class final Lcom/roidapp/photogrid/cloud/bm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)V
    .locals 0

    .prologue
    .line 235
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const v3, 0x7f0701ea

    const/4 v5, 0x0

    const/4 v2, 0x1

    .line 239
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->c(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 240
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 241
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget v3, v3, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v4, v4, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 259
    :goto_0
    return-void

    .line 243
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->P()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 244
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    const v2, 0x7f0701e9

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 246
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    if-ne v0, v2, :cond_3

    .line 247
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    const v2, 0x7f0701eb

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 249
    :cond_3
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget v3, v3, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 258
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bm;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->i()V

    goto :goto_0
.end method

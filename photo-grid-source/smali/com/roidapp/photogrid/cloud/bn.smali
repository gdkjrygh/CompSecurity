.class final Lcom/roidapp/photogrid/cloud/bn;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)V
    .locals 0

    .prologue
    .line 357
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/bn;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final dispatchMessage(Landroid/os/Message;)V
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 359
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x236

    if-ne v0, v1, :cond_1

    .line 360
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bn;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->p:Lcom/roidapp/photogrid/common/al;

    if-eqz v0, :cond_0

    .line 361
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bn;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->p:Lcom/roidapp/photogrid/common/al;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->a()V

    .line 370
    :cond_0
    :goto_0
    return-void

    .line 363
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->k()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 364
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bn;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    if-ne v0, v3, :cond_2

    .line 365
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bn;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    const v1, 0x7f0701f6

    invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 367
    :cond_2
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bn;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bn;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    const v2, 0x7f0701f7

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/bn;->a:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget v3, v3, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->o:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0
.end method

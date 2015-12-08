.class final Lcom/roidapp/photogrid/cloud/a/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ParentActivity;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/roidapp/photogrid/cloud/a/y;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/a/y;Lcom/roidapp/photogrid/release/ParentActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 210
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/a/z;->c:Lcom/roidapp/photogrid/cloud/a/y;

    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/a/z;->a:Lcom/roidapp/photogrid/release/ParentActivity;

    iput-object p3, p0, Lcom/roidapp/photogrid/cloud/a/z;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 214
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/z;->c:Lcom/roidapp/photogrid/cloud/a/y;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/a/y;->d:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 226
    :cond_0
    :goto_0
    return-void

    .line 218
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/z;->a:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ParentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/z;->a:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ParentActivity;->F()Z

    .line 222
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/z;->a:Lcom/roidapp/photogrid/release/ParentActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/z;->b:Ljava/lang/String;

    .line 1235
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ParentActivity;->h()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ParentActivity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 223
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/z;->c:Lcom/roidapp/photogrid/cloud/a/y;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/y;->a(Lcom/roidapp/photogrid/cloud/a/y;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/z;->c:Lcom/roidapp/photogrid/cloud/a/y;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/y;->a(Lcom/roidapp/photogrid/cloud/a/y;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 224
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/z;->c:Lcom/roidapp/photogrid/cloud/a/y;

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/z;->c:Lcom/roidapp/photogrid/cloud/a/y;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/y;->a(Lcom/roidapp/photogrid/cloud/a/y;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/BaseAdapter;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/cloud/a/y;->b(Landroid/widget/BaseAdapter;)V

    goto :goto_0

    .line 1238
    :cond_3
    if-eqz v1, :cond_2

    .line 1241
    new-instance v2, Lcom/roidapp/photogrid/release/ab;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/ab;-><init>()V

    .line 1242
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ab;->a(Ljava/lang/String;)V

    .line 1243
    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ab;->a(Z)V

    .line 1244
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ParentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "AddDecoViewTipDialogFragment"

    invoke-static {v0, v2, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/support/v4/app/FragmentManager;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)Z

    goto :goto_1
.end method

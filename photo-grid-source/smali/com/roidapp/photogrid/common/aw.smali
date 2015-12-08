.class final Lcom/roidapp/photogrid/common/aw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/roidapp/photogrid/common/ap;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/ap;Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Lcom/roidapp/photogrid/common/aw;->b:Lcom/roidapp/photogrid/common/ap;

    iput-object p2, p0, Lcom/roidapp/photogrid/common/aw;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aw;->a:Landroid/app/Activity;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aw;->a:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 166
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aw;->b:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/ap;->e(Lcom/roidapp/photogrid/common/ap;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 167
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aw;->b:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/ap;->e(Lcom/roidapp/photogrid/common/ap;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 168
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aw;->b:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/ap;->b(Lcom/roidapp/photogrid/common/ap;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 169
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aw;->b:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/ap;->b(Lcom/roidapp/photogrid/common/ap;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 171
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aw;->b:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/ap;->c(Lcom/roidapp/photogrid/common/ap;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 172
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aw;->b:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/ap;->c(Lcom/roidapp/photogrid/common/ap;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 174
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aw;->b:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/ap;->d(Lcom/roidapp/photogrid/common/ap;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 175
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aw;->b:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/ap;->d(Lcom/roidapp/photogrid/common/ap;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 177
    :cond_3
    return-void
.end method

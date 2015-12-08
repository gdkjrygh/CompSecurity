.class final Lcom/roidapp/cloudlib/upload/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Lcom/roidapp/cloudlib/upload/m;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/upload/m;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 253
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/n;->b:Lcom/roidapp/cloudlib/upload/m;

    iput-object p2, p0, Lcom/roidapp/cloudlib/upload/n;->a:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 258
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/n;->b:Lcom/roidapp/cloudlib/upload/m;

    invoke-static {v0}, Lcom/roidapp/cloudlib/upload/m;->a(Lcom/roidapp/cloudlib/upload/m;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/n;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 259
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/n;->b:Lcom/roidapp/cloudlib/upload/m;

    invoke-static {v0}, Lcom/roidapp/cloudlib/upload/m;->a(Lcom/roidapp/cloudlib/upload/m;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 260
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/n;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 262
    :cond_0
    return-void
.end method

.class public final Lcom/roidapp/photogrid/cloud/b/c;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lcom/roidapp/photogrid/cloud/b/d;

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/cloud/b/f;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 248
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/b/c;Lcom/roidapp/photogrid/cloud/b/d;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 248
    .line 2256
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/b/c;->a:Lcom/roidapp/photogrid/cloud/b/d;

    .line 2257
    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/b/c;->c:Ljava/lang/String;

    .line 248
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/b/c;Lcom/roidapp/photogrid/cloud/b/f;)V
    .locals 1

    .prologue
    .line 248
    .line 1261
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/b/c;->b:Ljava/lang/ref/WeakReference;

    .line 248
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 301
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0d04f3

    if-eq v0, v1, :cond_0

    .line 304
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0d04f6

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/c;->a:Lcom/roidapp/photogrid/cloud/b/d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/c;->b:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    .line 305
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/c;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/b/f;

    .line 306
    if-eqz v0, :cond_0

    .line 307
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/b/c;->a:Lcom/roidapp/photogrid/cloud/b/d;

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/cloud/b/f;->a(Lcom/roidapp/photogrid/cloud/b/d;)V

    .line 310
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/b/c;->dismissAllowingStateLoss()V

    .line 312
    :cond_1
    return-void
.end method

.method public final onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    .prologue
    .line 267
    const/4 v0, 0x0

    const v1, 0x7f0b0027

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/cloud/b/c;->setStyle(II)V

    .line 268
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object v0

    return-object v0
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    .line 273
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/b/c;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 274
    const v0, 0x7f03013c

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 275
    const v0, 0x7f0d04f3

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 277
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/c;->a:Lcom/roidapp/photogrid/cloud/b/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/c;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 278
    const v0, 0x7f0d04f5

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 279
    const v1, 0x7f0d04f7

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 280
    const v2, 0x7f0d04f4

    invoke-virtual {v3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 281
    const v4, 0x7f0d04f6

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 282
    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/b/c;->a:Lcom/roidapp/photogrid/cloud/b/d;

    iget-object v4, v4, Lcom/roidapp/photogrid/cloud/b/d;->f:Ljava/lang/String;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 283
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/b/c;->a:Lcom/roidapp/photogrid/cloud/b/d;

    iget-object v1, v1, Lcom/roidapp/photogrid/cloud/b/d;->e:Ljava/lang/String;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 285
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 286
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/b/c;->c:Ljava/lang/String;

    iget v4, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v2, v4, v1}, Lcom/roidapp/baselib/b/h;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 287
    if-eqz v1, :cond_1

    .line 288
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 296
    :cond_0
    :goto_0
    return-object v3

    .line 291
    :cond_1
    invoke-static {}, Lcom/roidapp/baselib/b/a;->a()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.class final Lcom/roidapp/cloudlib/instagram/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/instagram/j;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/instagram/j;)V
    .locals 0

    .prologue
    .line 261
    iput-object p1, p0, Lcom/roidapp/cloudlib/instagram/k;->a:Lcom/roidapp/cloudlib/instagram/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 264
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/k;->a:Lcom/roidapp/cloudlib/instagram/j;

    iget-object v0, v0, Lcom/roidapp/cloudlib/instagram/j;->d:Lcom/roidapp/cloudlib/instagram/InstagramListCloud;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 265
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/k;->a:Lcom/roidapp/cloudlib/instagram/j;

    iget-object v0, v0, Lcom/roidapp/cloudlib/instagram/j;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/graphics/drawable/BitmapDrawable;->createFromPath(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 266
    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/k;->a:Lcom/roidapp/cloudlib/instagram/j;

    iget-object v1, v1, Lcom/roidapp/cloudlib/instagram/j;->c:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 268
    :cond_0
    return-void
.end method

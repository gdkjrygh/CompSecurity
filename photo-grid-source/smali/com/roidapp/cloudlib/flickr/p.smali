.class final Lcom/roidapp/cloudlib/flickr/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/flickr/o;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/flickr/o;)V
    .locals 0

    .prologue
    .line 335
    iput-object p1, p0, Lcom/roidapp/cloudlib/flickr/p;->a:Lcom/roidapp/cloudlib/flickr/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 338
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/p;->a:Lcom/roidapp/cloudlib/flickr/o;

    iget-object v0, v0, Lcom/roidapp/cloudlib/flickr/o;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/graphics/drawable/BitmapDrawable;->createFromPath(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 339
    iget-object v1, p0, Lcom/roidapp/cloudlib/flickr/p;->a:Lcom/roidapp/cloudlib/flickr/o;

    iget-object v1, v1, Lcom/roidapp/cloudlib/flickr/o;->c:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 340
    return-void
.end method

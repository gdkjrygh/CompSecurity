.class Lcom/facebook/ui/images/d/l;
.super Lcom/facebook/ui/images/base/b;
.source "GraphicSizerFactory.java"


# instance fields
.field final synthetic a:Lcom/facebook/ui/images/d/h;

.field final synthetic b:Lcom/facebook/ui/images/d/k;

.field private c:Lcom/facebook/ui/images/d/j;


# direct methods
.method constructor <init>(Lcom/facebook/ui/images/d/k;Lcom/facebook/ui/images/d/h;)V
    .locals 0

    .prologue
    .line 14
    iput-object p1, p0, Lcom/facebook/ui/images/d/l;->b:Lcom/facebook/ui/images/d/k;

    iput-object p2, p0, Lcom/facebook/ui/images/d/l;->a:Lcom/facebook/ui/images/d/h;

    invoke-direct {p0}, Lcom/facebook/ui/images/base/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    .line 20
    new-instance v0, Lcom/facebook/ui/images/d/j;

    iget-object v1, p0, Lcom/facebook/ui/images/d/l;->a:Lcom/facebook/ui/images/d/h;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/ui/images/d/j;-><init>(Lcom/facebook/ui/images/d/h;II)V

    iput-object v0, p0, Lcom/facebook/ui/images/d/l;->c:Lcom/facebook/ui/images/d/j;

    .line 21
    iget-object v0, p0, Lcom/facebook/ui/images/d/l;->c:Lcom/facebook/ui/images/d/j;

    invoke-virtual {v0, p1}, Lcom/facebook/ui/images/d/j;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/ui/images/d/l;->a:Lcom/facebook/ui/images/d/h;

    invoke-virtual {v0}, Lcom/facebook/ui/images/d/h;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

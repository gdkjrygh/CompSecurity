.class Lcom/qihoo/security/floatview/ui/e$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/floatview/ui/e;->b(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/floatview/ui/e;


# direct methods
.method constructor <init>(Lcom/qihoo/security/floatview/ui/e;)V
    .locals 0

    .prologue
    .line 249
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/e$3;->a:Lcom/qihoo/security/floatview/ui/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 252
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e$3;->a:Lcom/qihoo/security/floatview/ui/e;

    iget-object v0, v0, Lcom/qihoo/security/floatview/ui/e;->b:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    if-nez v0, :cond_0

    .line 253
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e$3;->a:Lcom/qihoo/security/floatview/ui/e;

    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/e$3;->a:Lcom/qihoo/security/floatview/ui/e;

    invoke-virtual {v2}, Lcom/qihoo/security/floatview/ui/e;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcom/qihoo/security/floatview/ui/e;->b:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    .line 254
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e$3;->a:Lcom/qihoo/security/floatview/ui/e;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/e;->c(Lcom/qihoo/security/floatview/ui/e;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/e$3;->a:Lcom/qihoo/security/floatview/ui/e;

    iget-object v1, v1, Lcom/qihoo/security/floatview/ui/e;->b:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 256
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/e$3;->a:Lcom/qihoo/security/floatview/ui/e;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/e;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f09006f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    .line 257
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/e$3;->a:Lcom/qihoo/security/floatview/ui/e;

    iget-object v1, v1, Lcom/qihoo/security/floatview/ui/e;->b:Lcom/qihoo/security/ui/opti/sysclear/rocket/c;

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/e$3;->a:Lcom/qihoo/security/floatview/ui/e;

    invoke-virtual {v2}, Lcom/qihoo/security/floatview/ui/e;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/qihoo/security/floatview/ui/e$3;->a:Lcom/qihoo/security/floatview/ui/e;

    invoke-virtual {v3}, Lcom/qihoo/security/floatview/ui/e;->getHeight()I

    move-result v3

    int-to-float v3, v3

    sub-float v0, v3, v0

    invoke-virtual {v1, v2, v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a(FF)V

    .line 258
    return-void
.end method

.class Lcom/qihoo/security/widget/RevealPanel$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/widget/RevealPanel;->setOriginRiple(Lcom/qihoo/security/widget/RevealRippleLayout;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/RevealRippleLayout;

.field final synthetic b:Lcom/qihoo/security/widget/RevealPanel;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/RevealPanel;Lcom/qihoo/security/widget/RevealRippleLayout;)V
    .locals 0

    .prologue
    .line 351
    iput-object p1, p0, Lcom/qihoo/security/widget/RevealPanel$2;->b:Lcom/qihoo/security/widget/RevealPanel;

    iput-object p2, p0, Lcom/qihoo/security/widget/RevealPanel$2;->a:Lcom/qihoo/security/widget/RevealRippleLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 355
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$2;->b:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->b()V

    .line 357
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$2;->a:Lcom/qihoo/security/widget/RevealRippleLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealRippleLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 358
    iget-object v1, p0, Lcom/qihoo/security/widget/RevealPanel$2;->a:Lcom/qihoo/security/widget/RevealRippleLayout;

    invoke-static {v0}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;)F

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    add-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/qihoo/security/widget/RevealRippleLayout;->setxRippleOrigin(Ljava/lang/Float;)V

    .line 359
    iget-object v1, p0, Lcom/qihoo/security/widget/RevealPanel$2;->a:Lcom/qihoo/security/widget/RevealRippleLayout;

    invoke-static {v0}, Lcom/nineoldandroids/b/a;->b(Landroid/view/View;)F

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    add-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/RevealRippleLayout;->setyRippleOrigin(Ljava/lang/Float;)V

    .line 362
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$2;->a:Lcom/qihoo/security/widget/RevealRippleLayout;

    iget-object v1, p0, Lcom/qihoo/security/widget/RevealPanel$2;->b:Lcom/qihoo/security/widget/RevealPanel;

    invoke-static {v1}, Lcom/qihoo/security/widget/RevealPanel;->b(Lcom/qihoo/security/widget/RevealPanel;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealRippleLayout;->setRippleColor(I)V

    .line 365
    iget-object v0, p0, Lcom/qihoo/security/widget/RevealPanel$2;->a:Lcom/qihoo/security/widget/RevealRippleLayout;

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealRippleLayout;->setRippleSpeed(I)V

    .line 366
    return-void
.end method

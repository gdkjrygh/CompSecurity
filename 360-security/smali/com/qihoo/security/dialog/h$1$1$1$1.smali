.class Lcom/qihoo/security/dialog/h$1$1$1$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/dialog/h$1$1$1;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/dialog/h$1$1$1;


# direct methods
.method constructor <init>(Lcom/qihoo/security/dialog/h$1$1$1;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lcom/qihoo/security/dialog/h$1$1$1$1;->a:Lcom/qihoo/security/dialog/h$1$1$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .prologue
    .line 109
    iget-object v0, p0, Lcom/qihoo/security/dialog/h$1$1$1$1;->a:Lcom/qihoo/security/dialog/h$1$1$1;

    iget-object v0, v0, Lcom/qihoo/security/dialog/h$1$1$1;->a:Lcom/qihoo/security/dialog/h$1$1;

    iget-object v0, v0, Lcom/qihoo/security/dialog/h$1$1;->a:Lcom/qihoo/security/dialog/h$1;

    iget-object v0, v0, Lcom/qihoo/security/dialog/h$1;->a:Lcom/qihoo/security/dialog/h;

    iget-object v1, p0, Lcom/qihoo/security/dialog/h$1$1$1$1;->a:Lcom/qihoo/security/dialog/h$1$1$1;

    iget-object v1, v1, Lcom/qihoo/security/dialog/h$1$1$1;->a:Lcom/qihoo/security/dialog/h$1$1;

    iget-object v1, v1, Lcom/qihoo/security/dialog/h$1$1;->a:Lcom/qihoo/security/dialog/h$1;

    iget-object v1, v1, Lcom/qihoo/security/dialog/h$1;->a:Lcom/qihoo/security/dialog/h;

    invoke-static {v1}, Lcom/qihoo/security/dialog/h;->a(Lcom/qihoo/security/dialog/h;)[Landroid/widget/ImageView;

    move-result-object v1

    const/4 v2, 0x4

    aget-object v1, v1, v2

    new-instance v2, Lcom/qihoo/security/dialog/h$1$1$1$1$1;

    invoke-direct {v2, p0}, Lcom/qihoo/security/dialog/h$1$1$1$1$1;-><init>(Lcom/qihoo/security/dialog/h$1$1$1$1;)V

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/dialog/h;->a(Landroid/widget/ImageView;Landroid/view/animation/Animation$AnimationListener;)V

    .line 125
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 129
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 104
    iget-object v0, p0, Lcom/qihoo/security/dialog/h$1$1$1$1;->a:Lcom/qihoo/security/dialog/h$1$1$1;

    iget-object v0, v0, Lcom/qihoo/security/dialog/h$1$1$1;->a:Lcom/qihoo/security/dialog/h$1$1;

    iget-object v0, v0, Lcom/qihoo/security/dialog/h$1$1;->a:Lcom/qihoo/security/dialog/h$1;

    iget-object v0, v0, Lcom/qihoo/security/dialog/h$1;->a:Lcom/qihoo/security/dialog/h;

    invoke-static {v0}, Lcom/qihoo/security/dialog/h;->a(Lcom/qihoo/security/dialog/h;)[Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x3

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 105
    return-void
.end method

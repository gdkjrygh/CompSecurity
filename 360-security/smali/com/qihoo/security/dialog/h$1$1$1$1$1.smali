.class Lcom/qihoo/security/dialog/h$1$1$1$1$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/dialog/h$1$1$1$1;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/dialog/h$1$1$1$1;


# direct methods
.method constructor <init>(Lcom/qihoo/security/dialog/h$1$1$1$1;)V
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Lcom/qihoo/security/dialog/h$1$1$1$1$1;->a:Lcom/qihoo/security/dialog/h$1$1$1$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 119
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 123
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 113
    iget-object v0, p0, Lcom/qihoo/security/dialog/h$1$1$1$1$1;->a:Lcom/qihoo/security/dialog/h$1$1$1$1;

    iget-object v0, v0, Lcom/qihoo/security/dialog/h$1$1$1$1;->a:Lcom/qihoo/security/dialog/h$1$1$1;

    iget-object v0, v0, Lcom/qihoo/security/dialog/h$1$1$1;->a:Lcom/qihoo/security/dialog/h$1$1;

    iget-object v0, v0, Lcom/qihoo/security/dialog/h$1$1;->a:Lcom/qihoo/security/dialog/h$1;

    iget-object v0, v0, Lcom/qihoo/security/dialog/h$1;->a:Lcom/qihoo/security/dialog/h;

    invoke-static {v0}, Lcom/qihoo/security/dialog/h;->a(Lcom/qihoo/security/dialog/h;)[Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 114
    return-void
.end method

.class final Lcom/roidapp/baselib/view/g;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/widget/ImageView;

.field final synthetic b:Lcom/roidapp/baselib/view/f;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/view/f;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 110
    iput-object p1, p0, Lcom/roidapp/baselib/view/g;->b:Lcom/roidapp/baselib/view/f;

    iput-object p2, p0, Lcom/roidapp/baselib/view/g;->a:Landroid/widget/ImageView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 2

    .prologue
    .line 118
    iget-object v0, p0, Lcom/roidapp/baselib/view/g;->b:Lcom/roidapp/baselib/view/f;

    iget-object v0, v0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    iget-object v1, p0, Lcom/roidapp/baselib/view/g;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/e;->removeView(Landroid/view/View;)V

    .line 119
    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .prologue
    .line 113
    iget-object v0, p0, Lcom/roidapp/baselib/view/g;->b:Lcom/roidapp/baselib/view/f;

    iget-object v0, v0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    iget-object v1, p0, Lcom/roidapp/baselib/view/g;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/e;->removeView(Landroid/view/View;)V

    .line 114
    return-void
.end method

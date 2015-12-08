.class final Lcom/roidapp/imagelib/retouch/j;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/retouch/BlemishImageView;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/retouch/BlemishImageView;)V
    .locals 0

    .prologue
    .line 186
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/j;->a:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .prologue
    .line 189
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/j;->a:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(Lcom/roidapp/imagelib/retouch/BlemishImageView;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 190
    return-void
.end method

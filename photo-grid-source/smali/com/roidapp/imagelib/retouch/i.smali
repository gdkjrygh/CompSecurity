.class final Lcom/roidapp/imagelib/retouch/i;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/retouch/BlemishImageView;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/retouch/BlemishImageView;)V
    .locals 0

    .prologue
    .line 176
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/i;->a:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .prologue
    .line 179
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/i;->a:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(Lcom/roidapp/imagelib/retouch/BlemishImageView;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 180
    return-void
.end method

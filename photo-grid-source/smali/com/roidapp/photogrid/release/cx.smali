.class final Lcom/roidapp/photogrid/release/cx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/cs;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/cs;)V
    .locals 0

    .prologue
    .line 1452
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cx;->a:Lcom/roidapp/photogrid/release/cs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 1463
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cx;->a:Lcom/roidapp/photogrid/release/cs;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cs;->d(Lcom/roidapp/photogrid/release/cs;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Z)V

    .line 1464
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 1470
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 1458
    return-void
.end method

.class Lcom/yong/slidemenu/SlideHolder$2;
.super Ljava/lang/Object;
.source "SlideHolder.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yong/slidemenu/SlideHolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yong/slidemenu/SlideHolder;


# direct methods
.method constructor <init>(Lcom/yong/slidemenu/SlideHolder;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/yong/slidemenu/SlideHolder$2;->this$0:Lcom/yong/slidemenu/SlideHolder;

    .line 638
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 647
    iget-object v0, p0, Lcom/yong/slidemenu/SlideHolder$2;->this$0:Lcom/yong/slidemenu/SlideHolder;

    # invokes: Lcom/yong/slidemenu/SlideHolder;->completeClosing()V
    invoke-static {v0}, Lcom/yong/slidemenu/SlideHolder;->access$1(Lcom/yong/slidemenu/SlideHolder;)V

    .line 648
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 644
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 641
    return-void
.end method

.class Lcom/yong/slidemenu/SlideHolder$8;
.super Ljava/lang/Object;
.source "SlideHolder.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yong/slidemenu/SlideHolder;->completeClosing()V
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
    iput-object p1, p0, Lcom/yong/slidemenu/SlideHolder$8;->this$0:Lcom/yong/slidemenu/SlideHolder;

    .line 625
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 628
    iget-object v0, p0, Lcom/yong/slidemenu/SlideHolder$8;->this$0:Lcom/yong/slidemenu/SlideHolder;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/yong/slidemenu/SlideHolder;->access$3(Lcom/yong/slidemenu/SlideHolder;I)V

    .line 629
    iget-object v0, p0, Lcom/yong/slidemenu/SlideHolder$8;->this$0:Lcom/yong/slidemenu/SlideHolder;

    # getter for: Lcom/yong/slidemenu/SlideHolder;->mMenuView:Landroid/view/View;
    invoke-static {v0}, Lcom/yong/slidemenu/SlideHolder;->access$4(Lcom/yong/slidemenu/SlideHolder;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 630
    return-void
.end method

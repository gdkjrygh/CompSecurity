.class Lcom/arist/MusicPlayer/MainActivity$1$1;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/arist/MusicPlayer/MainActivity$1;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity$1;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$1$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$1;

    .line 761
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 4
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 769
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$1$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$1;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$1;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity$1;->access$0(Lcom/arist/MusicPlayer/MainActivity$1;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v1

    .line 770
    const-class v2, Lcom/arist/MusicPlayer/MusicPlayActivity;

    .line 769
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 771
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$1$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$1;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$1;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity$1;->access$0(Lcom/arist/MusicPlayer/MainActivity$1;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/arist/MusicPlayer/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 772
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$1$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$1;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$1;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity$1;->access$0(Lcom/arist/MusicPlayer/MainActivity$1;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v1

    const v2, 0x7f040006

    const v3, 0x7f040003

    invoke-virtual {v1, v2, v3}, Lcom/arist/MusicPlayer/MainActivity;->overridePendingTransition(II)V

    .line 773
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 766
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 763
    return-void
.end method

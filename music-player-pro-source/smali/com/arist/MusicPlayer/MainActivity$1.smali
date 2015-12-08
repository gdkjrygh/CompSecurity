.class Lcom/arist/MusicPlayer/MainActivity$1;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/MusicPlayer/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$1;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 753
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/arist/MusicPlayer/MainActivity$1;)Lcom/arist/MusicPlayer/MainActivity;
    .locals 1

    .prologue
    .line 753
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$1;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 758
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$1;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$1;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 759
    const v2, 0x7f040008

    .line 758
    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->access$0(Lcom/arist/MusicPlayer/MainActivity;Landroid/view/animation/Animation;)V

    .line 760
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$1;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->ivAlbum:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$1(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$1;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->anim:Landroid/view/animation/Animation;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$2(Lcom/arist/MusicPlayer/MainActivity;)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 761
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$1;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->anim:Landroid/view/animation/Animation;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$2(Lcom/arist/MusicPlayer/MainActivity;)Landroid/view/animation/Animation;

    move-result-object v0

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$1$1;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$1$1;-><init>(Lcom/arist/MusicPlayer/MainActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 775
    return-void
.end method

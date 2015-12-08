.class Lcom/arist/MusicPlayer/MainActivity$3;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->initView()V
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$3;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 262
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 264
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$3;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->mSlideHolder:Lcom/yong/slidemenu/SlideHolder;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$30(Lcom/arist/MusicPlayer/MainActivity;)Lcom/yong/slidemenu/SlideHolder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yong/slidemenu/SlideHolder;->toggle()V

    .line 265
    return-void
.end method

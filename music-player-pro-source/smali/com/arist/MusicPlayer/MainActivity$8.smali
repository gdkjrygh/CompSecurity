.class Lcom/arist/MusicPlayer/MainActivity$8;
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$8;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 325
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 327
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$8;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->mSlideHolder:Lcom/yong/slidemenu/SlideHolder;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$30(Lcom/arist/MusicPlayer/MainActivity;)Lcom/yong/slidemenu/SlideHolder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yong/slidemenu/SlideHolder;->toggle()V

    .line 328
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$8;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->popupWindowSearch:Lcom/arist/PopMenu/PopupWindowSearch;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$33(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/PopMenu/PopupWindowSearch;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$8;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->listViewMusic:Landroid/widget/ListView;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$34(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/ListView;

    move-result-object v1

    const/16 v2, 0x30

    const/4 v3, 0x0

    .line 329
    const/16 v4, 0x23

    .line 328
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/arist/PopMenu/PopupWindowSearch;->showAtLocation(Landroid/view/View;III)V

    .line 330
    return-void
.end method

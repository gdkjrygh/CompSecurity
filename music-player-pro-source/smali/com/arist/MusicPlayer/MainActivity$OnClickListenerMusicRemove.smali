.class Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicRemove;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/MusicPlayer/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "OnClickListenerMusicRemove"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;


# direct methods
.method private constructor <init>(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 1002
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicRemove;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/MusicPlayer/MainActivity;Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicRemove;)V
    .locals 0

    .prologue
    .line 1002
    invoke-direct {p0, p1}, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicRemove;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v2, 0x1

    .line 1004
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicRemove;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$5(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/dao/MusicDao;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicRemove;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v1, v1, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v1}, Lcom/arist/entity/Music;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/dao/MusicDao;->deleteMusic(I)I

    .line 1005
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicRemove;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v2}, Lcom/arist/MusicPlayer/MainActivity;->dismissDialog(I)V

    .line 1006
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicRemove;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v2}, Lcom/arist/MusicPlayer/MainActivity;->removeDialog(I)V

    .line 1007
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicRemove;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$14(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicRemove;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v1, v1, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1008
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicRemove;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicAdapter:Lcom/arist/Adapter/MusicAdapter;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$15(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/MusicAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/Adapter/MusicAdapter;->notifyDataSetChanged()V

    .line 1009
    return-void
.end method

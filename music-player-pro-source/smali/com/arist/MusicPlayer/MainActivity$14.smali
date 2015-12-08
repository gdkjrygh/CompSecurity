.class Lcom/arist/MusicPlayer/MainActivity$14;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->updateView(I)V
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$14;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 494
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 496
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$14;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$14;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$5(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/dao/MusicDao;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/dao/MusicDao;->getAlbums()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->access$43(Lcom/arist/MusicPlayer/MainActivity;Ljava/util/ArrayList;)V

    .line 497
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$14;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->folderAdapter:Lcom/arist/Adapter/FolderAdapter;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$12(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/FolderAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$14;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->folders:Ljava/util/ArrayList;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$44(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/Adapter/FolderAdapter;->changeData(Ljava/util/ArrayList;)V

    .line 498
    return-void
.end method

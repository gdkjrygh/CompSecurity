.class Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerFolder;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/MusicPlayer/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "OnItemClickListenerFolder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/widget/AdapterView$OnItemClickListener;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 875
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerFolder;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .param p2, "view"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "id"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 878
    .local p1, "listView":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerFolder;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->folderAdapter:Lcom/arist/Adapter/FolderAdapter;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$12(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/FolderAdapter;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/arist/Adapter/FolderAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/entity/MusicFolder;

    .line 880
    .local v0, "folder":Lcom/arist/entity/MusicFolder;
    const-string v1, "artist"

    invoke-virtual {v0}, Lcom/arist/entity/MusicFolder;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 881
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerFolder;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerFolder;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$5(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/dao/MusicDao;

    move-result-object v2

    invoke-virtual {v0}, Lcom/arist/entity/MusicFolder;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/arist/dao/MusicDao;->getMusicsByArtist(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->access$13(Lcom/arist/MusicPlayer/MainActivity;Ljava/util/ArrayList;)V

    .line 887
    :goto_0
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerFolder;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const/16 v2, 0x6f

    invoke-static {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->access$9(Lcom/arist/MusicPlayer/MainActivity;I)V

    .line 889
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerFolder;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const/4 v2, 0x3

    # invokes: Lcom/arist/MusicPlayer/MainActivity;->updateView(I)V
    invoke-static {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->access$10(Lcom/arist/MusicPlayer/MainActivity;I)V

    .line 890
    return-void

    .line 882
    :cond_0
    const-string v1, "album"

    invoke-virtual {v0}, Lcom/arist/entity/MusicFolder;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 883
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerFolder;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerFolder;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$5(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/dao/MusicDao;

    move-result-object v2

    invoke-virtual {v0}, Lcom/arist/entity/MusicFolder;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/arist/dao/MusicDao;->getMusicsByAlbumId(I)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->access$13(Lcom/arist/MusicPlayer/MainActivity;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 885
    :cond_1
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerFolder;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerFolder;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$5(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/dao/MusicDao;

    move-result-object v2

    invoke-virtual {v0}, Lcom/arist/entity/MusicFolder;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/arist/dao/MusicDao;->getMusic(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->access$13(Lcom/arist/MusicPlayer/MainActivity;Ljava/util/ArrayList;)V

    goto :goto_0
.end method

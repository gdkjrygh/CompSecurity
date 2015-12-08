.class Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove$1;
.super Ljava/lang/Thread;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;

    .line 981
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 985
    :try_start_0
    invoke-static {}, Lcom/arist/util/FavMusicXmlUtil;->getFavMusic()Ljava/util/ArrayList;

    move-result-object v1

    .line 986
    .local v1, "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;->access$1(Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    iget-object v2, v2, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 994
    .end local v1    # "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    :goto_0
    return-void

    .line 988
    .restart local v1    # "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    :cond_0
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;->access$1(Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    iget-object v2, v2, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 989
    invoke-static {v1}, Lcom/arist/util/FavMusicXmlUtil;->saveFavMusic(Ljava/util/ArrayList;)V

    .line 990
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;->access$1(Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->mainPref:Lcom/arist/util/MainGridPreference;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$11(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/util/MainGridPreference;

    move-result-object v2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/arist/util/MainGridPreference;->saveFav(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 991
    .end local v1    # "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    :catch_0
    move-exception v0

    .line 992
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

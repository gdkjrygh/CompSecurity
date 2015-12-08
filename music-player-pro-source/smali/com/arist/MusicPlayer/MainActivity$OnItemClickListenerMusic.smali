.class Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMusic;
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
    name = "OnItemClickListenerMusic"
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
    .line 894
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

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
    .line 897
    .local p1, "adapter":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getInstance()Lcom/arist/MusicPlayer/MyApplication;

    move-result-object v1

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$14(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/arist/MusicPlayer/MyApplication;->setMusicList(Ljava/util/ArrayList;)V

    .line 898
    invoke-static {p3}, Lcom/arist/MusicPlayer/MyApplication;->setCurrentPosition(I)V

    .line 899
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "com.MediaPlayer.action.PLAY"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 903
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v1

    .line 904
    const-string v2, "switch_playing_interface"

    const/4 v3, 0x0

    .line 903
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 904
    if-eqz v1, :cond_0

    .line 905
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 906
    const-class v2, Lcom/arist/MusicPlayer/MusicPlayActivity;

    .line 905
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 907
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v1, v0}, Lcom/arist/MusicPlayer/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 908
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const v2, 0x7f040006

    const v3, 0x7f040003

    invoke-virtual {v1, v2, v3}, Lcom/arist/MusicPlayer/MainActivity;->overridePendingTransition(II)V

    .line 910
    .end local v0    # "intent":Landroid/content/Intent;
    :cond_0
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicAdapter:Lcom/arist/Adapter/MusicAdapter;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$15(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/MusicAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/Adapter/MusicAdapter;->notifyDataSetChanged()V

    .line 911
    return-void
.end method

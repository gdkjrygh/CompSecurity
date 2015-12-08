.class Lcom/arist/MusicPlayer/MainActivity$26;
.super Landroid/os/Handler;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->onCreate(Landroid/os/Bundle;)V
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 1044
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    const/4 v5, 0x0

    const/4 v8, 0x1

    .line 1046
    const/4 v0, 0x0

    .line 1047
    .local v0, "i":I
    iget v6, p1, Landroid/os/Message;->what:I

    packed-switch v6, :pswitch_data_0

    .line 1117
    :cond_0
    :goto_0
    :pswitch_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1118
    return-void

    .line 1050
    :pswitch_1
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v5

    const-string v6, "text"

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 1051
    if-ne v0, v8, :cond_1

    .line 1052
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    sget-object v6, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 1053
    invoke-virtual {v6}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v6

    .line 1052
    invoke-static {v5, v6}, Lcom/arist/MusicPlayer/MainActivity;->access$59(Lcom/arist/MusicPlayer/MainActivity;I)V

    .line 1055
    :cond_1
    iget-object v6, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->seekProgress:I
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$50(Lcom/arist/MusicPlayer/MainActivity;)I

    move-result v5

    mul-int/lit16 v7, v0, 0xc8

    add-int/2addr v5, v7

    .line 1056
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicDuration()I

    move-result v7

    if-le v5, v7, :cond_2

    .line 1057
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicDuration()I

    move-result v5

    .line 1055
    :goto_1
    invoke-static {v6, v5}, Lcom/arist/MusicPlayer/MainActivity;->access$59(Lcom/arist/MusicPlayer/MainActivity;I)V

    .line 1058
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicProgressMain:Landroid/widget/ProgressBar;
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$18(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/ProgressBar;

    move-result-object v5

    iget-object v6, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->seekProgress:I
    invoke-static {v6}, Lcom/arist/MusicPlayer/MainActivity;->access$50(Lcom/arist/MusicPlayer/MainActivity;)I

    move-result v6

    mul-int/lit16 v6, v6, 0x3e8

    .line 1059
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicDuration()I

    move-result v7

    div-int/2addr v6, v7

    .line 1058
    invoke-virtual {v5, v6}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto :goto_0

    .line 1057
    :cond_2
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->seekProgress:I
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$50(Lcom/arist/MusicPlayer/MainActivity;)I

    move-result v5

    mul-int/lit16 v7, v0, 0xc8

    add-int/2addr v5, v7

    goto :goto_1

    .line 1063
    :pswitch_2
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v6

    const-string v7, "text"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 1064
    if-ne v0, v8, :cond_3

    .line 1065
    iget-object v6, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    sget-object v7, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 1066
    invoke-virtual {v7}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v7

    .line 1065
    invoke-static {v6, v7}, Lcom/arist/MusicPlayer/MainActivity;->access$59(Lcom/arist/MusicPlayer/MainActivity;I)V

    .line 1068
    :cond_3
    iget-object v6, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v7, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->seekProgress:I
    invoke-static {v7}, Lcom/arist/MusicPlayer/MainActivity;->access$50(Lcom/arist/MusicPlayer/MainActivity;)I

    move-result v7

    mul-int/lit16 v8, v0, 0xc8

    sub-int/2addr v7, v8

    if-gez v7, :cond_4

    :goto_2
    invoke-static {v6, v5}, Lcom/arist/MusicPlayer/MainActivity;->access$59(Lcom/arist/MusicPlayer/MainActivity;I)V

    .line 1070
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicProgressMain:Landroid/widget/ProgressBar;
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$18(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/ProgressBar;

    move-result-object v5

    iget-object v6, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->seekProgress:I
    invoke-static {v6}, Lcom/arist/MusicPlayer/MainActivity;->access$50(Lcom/arist/MusicPlayer/MainActivity;)I

    move-result v6

    mul-int/lit16 v6, v6, 0x3e8

    .line 1071
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicDuration()I

    move-result v7

    div-int/2addr v6, v7

    .line 1070
    invoke-virtual {v5, v6}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto/16 :goto_0

    .line 1069
    :cond_4
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->seekProgress:I
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$50(Lcom/arist/MusicPlayer/MainActivity;)I

    move-result v5

    mul-int/lit16 v7, v0, 0xc8

    sub-int/2addr v5, v7

    goto :goto_2

    .line 1075
    :pswitch_3
    iget v5, p1, Landroid/os/Message;->arg1:I

    if-nez v5, :cond_5

    .line 1076
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->ivNetMusicLoading:Landroid/widget/ImageView;
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$60(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/ImageView;

    move-result-object v5

    invoke-virtual {v5, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1077
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->ivNetMusicLoading:Landroid/widget/ImageView;
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$60(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/ImageView;

    move-result-object v5

    .line 1078
    iget-object v6, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 1079
    const v7, 0x7f040004

    .line 1078
    invoke-static {v6, v7}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v6

    .line 1077
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto/16 :goto_0

    .line 1081
    :cond_5
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->ivNetMusicLoading:Landroid/widget/ImageView;
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$60(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/ImageView;

    move-result-object v5

    const/4 v6, -0x1

    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1082
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->ivNetMusicLoading:Landroid/widget/ImageView;
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$60(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/ImageView;

    move-result-object v5

    invoke-virtual {v5}, Landroid/widget/ImageView;->clearAnimation()V

    goto/16 :goto_0

    .line 1087
    :pswitch_4
    iget-object v5, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 1088
    .local v3, "searchStr":Ljava/lang/String;
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v6, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;
    invoke-static {v6}, Lcom/arist/MusicPlayer/MainActivity;->access$5(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/dao/MusicDao;

    move-result-object v6

    invoke-virtual {v6}, Lcom/arist/dao/MusicDao;->getAllMusic()Ljava/util/ArrayList;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/arist/MusicPlayer/MainActivity;->access$13(Lcom/arist/MusicPlayer/MainActivity;Ljava/util/ArrayList;)V

    .line 1089
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->vpContainer:Landroid/support/v4/view/ViewPager;
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$45(Lcom/arist/MusicPlayer/MainActivity;)Landroid/support/v4/view/ViewPager;

    move-result-object v5

    const/4 v6, 0x2

    invoke-virtual {v5, v6}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 1090
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1091
    .local v2, "musicList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    const/4 v1, 0x0

    .local v1, "j":I
    :goto_3
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$14(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lt v1, v5, :cond_6

    .line 1099
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-static {v5, v2}, Lcom/arist/MusicPlayer/MainActivity;->access$13(Lcom/arist/MusicPlayer/MainActivity;Ljava/util/ArrayList;)V

    .line 1100
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicAdapter:Lcom/arist/Adapter/MusicAdapter;
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$15(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/MusicAdapter;

    move-result-object v5

    invoke-virtual {v5, v2}, Lcom/arist/Adapter/MusicAdapter;->changeData(Ljava/util/ArrayList;)V

    goto/16 :goto_0

    .line 1092
    :cond_6
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$14(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/arist/entity/Music;

    invoke-virtual {v5}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    .line 1093
    invoke-virtual {v5, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_7

    .line 1094
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$14(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/arist/entity/Music;

    invoke-virtual {v5}, Lcom/arist/entity/Music;->getArtist()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    .line 1095
    invoke-virtual {v5, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 1096
    :cond_7
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$14(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/arist/entity/Music;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1091
    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 1104
    .end local v1    # "j":I
    .end local v2    # "musicList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    .end local v3    # "searchStr":Ljava/lang/String;
    :pswitch_5
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->jamendoMusicArray:Ljava/util/ArrayList;
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$29(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 1106
    .local v4, "size":I
    if-lez v4, :cond_0

    .line 1107
    :try_start_0
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->netMusicAdapter:Lcom/arist/Adapter/NetMusicAdapter;
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$16(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/NetMusicAdapter;

    move-result-object v5

    iget-object v6, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->jamendoMusicArray:Ljava/util/ArrayList;
    invoke-static {v6}, Lcom/arist/MusicPlayer/MainActivity;->access$29(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/arist/Adapter/NetMusicAdapter;->changeData(Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 1109
    :catch_0
    move-exception v5

    goto/16 :goto_0

    .line 1113
    .end local v4    # "size":I
    :pswitch_6
    iget-object v6, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->tv_netMusicTips:Landroid/widget/TextView;
    invoke-static {v6}, Lcom/arist/MusicPlayer/MainActivity;->access$25(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/TextView;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1114
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->netMusicAdapter:Lcom/arist/Adapter/NetMusicAdapter;
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$16(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/NetMusicAdapter;

    move-result-object v5

    iget-object v6, p0, Lcom/arist/MusicPlayer/MainActivity$26;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->jamendoMusicArray:Ljava/util/ArrayList;
    invoke-static {v6}, Lcom/arist/MusicPlayer/MainActivity;->access$29(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/arist/Adapter/NetMusicAdapter;->changeData(Ljava/util/ArrayList;)V

    goto/16 :goto_0

    .line 1047
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

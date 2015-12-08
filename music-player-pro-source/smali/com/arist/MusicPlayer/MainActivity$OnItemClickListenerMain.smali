.class Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;
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
    name = "OnItemClickListenerMain"
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
    .line 824
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 7
    .param p2, "view"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "arg3"    # J
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
    .local p1, "adapter":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    const/4 v3, 0x2

    const/4 v6, 0x3

    .line 828
    packed-switch p3, :pswitch_data_0

    .line 871
    :goto_0
    return-void

    .line 830
    :pswitch_0
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-static {v1, v3}, Lcom/arist/MusicPlayer/MainActivity;->access$9(Lcom/arist/MusicPlayer/MainActivity;I)V

    .line 831
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # invokes: Lcom/arist/MusicPlayer/MainActivity;->updateView(I)V
    invoke-static {v1, v3}, Lcom/arist/MusicPlayer/MainActivity;->access$10(Lcom/arist/MusicPlayer/MainActivity;I)V

    goto :goto_0

    .line 834
    :pswitch_1
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-static {v1, v6}, Lcom/arist/MusicPlayer/MainActivity;->access$9(Lcom/arist/MusicPlayer/MainActivity;I)V

    .line 835
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # invokes: Lcom/arist/MusicPlayer/MainActivity;->updateView(I)V
    invoke-static {v1, v3}, Lcom/arist/MusicPlayer/MainActivity;->access$10(Lcom/arist/MusicPlayer/MainActivity;I)V

    goto :goto_0

    .line 838
    :pswitch_2
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const/4 v2, 0x4

    invoke-static {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->access$9(Lcom/arist/MusicPlayer/MainActivity;I)V

    .line 839
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # invokes: Lcom/arist/MusicPlayer/MainActivity;->updateView(I)V
    invoke-static {v1, v3}, Lcom/arist/MusicPlayer/MainActivity;->access$10(Lcom/arist/MusicPlayer/MainActivity;I)V

    goto :goto_0

    .line 844
    :pswitch_3
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->access$9(Lcom/arist/MusicPlayer/MainActivity;I)V

    .line 845
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # invokes: Lcom/arist/MusicPlayer/MainActivity;->updateView(I)V
    invoke-static {v1, v6}, Lcom/arist/MusicPlayer/MainActivity;->access$10(Lcom/arist/MusicPlayer/MainActivity;I)V

    goto :goto_0

    .line 849
    :pswitch_4
    :try_start_0
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const/4 v2, 0x5

    invoke-static {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->access$9(Lcom/arist/MusicPlayer/MainActivity;I)V

    .line 850
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const/4 v2, 0x3

    # invokes: Lcom/arist/MusicPlayer/MainActivity;->updateView(I)V
    invoke-static {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->access$10(Lcom/arist/MusicPlayer/MainActivity;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 851
    :catch_0
    move-exception v0

    .line 852
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 856
    .end local v0    # "e":Ljava/lang/Exception;
    :pswitch_5
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->mainPref:Lcom/arist/util/MainGridPreference;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$11(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/util/MainGridPreference;

    move-result-object v1

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicBiz:Lcom/arist/biz/MusicBiz;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$7(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/biz/MusicBiz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/arist/biz/MusicBiz;->getRecentAddMusic()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/arist/util/MainGridPreference;->saveAdd(I)V

    .line 857
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const/4 v2, 0x6

    invoke-static {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->access$9(Lcom/arist/MusicPlayer/MainActivity;I)V

    .line 858
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # invokes: Lcom/arist/MusicPlayer/MainActivity;->updateView(I)V
    invoke-static {v1, v6}, Lcom/arist/MusicPlayer/MainActivity;->access$10(Lcom/arist/MusicPlayer/MainActivity;I)V

    goto :goto_0

    .line 861
    :pswitch_6
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->mainPref:Lcom/arist/util/MainGridPreference;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$11(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/util/MainGridPreference;

    move-result-object v1

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$5(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/dao/MusicDao;

    move-result-object v2

    .line 862
    sget-object v3, Lcom/arist/util/Constant;->BASE_DOWNLOAD_PATH:Ljava/lang/String;

    const/4 v4, 0x0

    .line 863
    sget-object v5, Lcom/arist/util/Constant;->BASE_DOWNLOAD_PATH:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    .line 862
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 861
    invoke-virtual {v2, v3}, Lcom/arist/dao/MusicDao;->getMusic(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 864
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 861
    invoke-virtual {v1, v2}, Lcom/arist/util/MainGridPreference;->saveDownload(I)V

    .line 865
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const/4 v2, 0x7

    invoke-static {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->access$9(Lcom/arist/MusicPlayer/MainActivity;I)V

    .line 866
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # invokes: Lcom/arist/MusicPlayer/MainActivity;->updateView(I)V
    invoke-static {v1, v6}, Lcom/arist/MusicPlayer/MainActivity;->access$10(Lcom/arist/MusicPlayer/MainActivity;I)V

    goto/16 :goto_0

    .line 828
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

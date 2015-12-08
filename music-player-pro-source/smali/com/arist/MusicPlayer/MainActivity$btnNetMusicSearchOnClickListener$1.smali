.class Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;
.super Ljava/lang/Thread;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

.field private final synthetic val$text:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

    iput-object p2, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->val$text:Ljava/lang/String;

    .line 1705
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .prologue
    const/16 v8, 0xa

    const/4 v7, 0x7

    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 1707
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->access$1(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    invoke-static {v2, v5}, Lcom/arist/MusicPlayer/MainActivity;->access$27(Lcom/arist/MusicPlayer/MainActivity;Z)V

    .line 1709
    :try_start_0
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->access$1(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$23(Lcom/arist/MusicPlayer/MainActivity;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 1710
    .local v1, "msg":Landroid/os/Message;
    const/4 v2, 0x7

    iput v2, v1, Landroid/os/Message;->what:I

    .line 1711
    const/4 v2, 0x0

    iput v2, v1, Landroid/os/Message;->arg1:I

    .line 1712
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->access$1(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$23(Lcom/arist/MusicPlayer/MainActivity;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1714
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->access$1(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    new-instance v3, Lcom/yong/jamendo/api/JamendoGet2ApiImpl;

    invoke-direct {v3}, Lcom/yong/jamendo/api/JamendoGet2ApiImpl;-><init>()V

    .line 1715
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->val$text:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/yong/jamendo/api/JamendoGet2ApiImpl;->searchForTracksByTag(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 1714
    invoke-static {v2, v3}, Lcom/arist/MusicPlayer/MainActivity;->access$28(Lcom/arist/MusicPlayer/MainActivity;Ljava/util/ArrayList;)V

    .line 1716
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->access$1(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->jamendoMusicArray:Ljava/util/ArrayList;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$29(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 1717
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->access$1(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->jamendoMusicArray:Ljava/util/ArrayList;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$29(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v2, v5, :cond_1

    .line 1718
    :cond_0
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->access$1(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$23(Lcom/arist/MusicPlayer/MainActivity;)Landroid/os/Handler;

    move-result-object v2

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/yong/jamendo/api/WSError; {:try_start_0 .. :try_end_0} :catch_1

    .line 1730
    .end local v1    # "msg":Landroid/os/Message;
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->access$1(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$23(Lcom/arist/MusicPlayer/MainActivity;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 1731
    .restart local v1    # "msg":Landroid/os/Message;
    iput v7, v1, Landroid/os/Message;->what:I

    .line 1732
    iput v5, v1, Landroid/os/Message;->arg1:I

    .line 1733
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->access$1(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$23(Lcom/arist/MusicPlayer/MainActivity;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1735
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->access$1(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$23(Lcom/arist/MusicPlayer/MainActivity;)Landroid/os/Handler;

    move-result-object v2

    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v3}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->access$1(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v3

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;
    invoke-static {v3}, Lcom/arist/MusicPlayer/MainActivity;->access$23(Lcom/arist/MusicPlayer/MainActivity;)Landroid/os/Handler;

    move-result-object v3

    .line 1736
    const/16 v4, 0x9

    invoke-virtual {v3, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 1735
    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1738
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->access$1(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    invoke-static {v2, v6}, Lcom/arist/MusicPlayer/MainActivity;->access$27(Lcom/arist/MusicPlayer/MainActivity;Z)V

    .line 1739
    return-void

    .line 1721
    .end local v1    # "msg":Landroid/os/Message;
    :catch_0
    move-exception v0

    .line 1722
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 1723
    .end local v0    # "e":Ljava/lang/Exception;
    :catch_1
    move-exception v0

    .line 1724
    .local v0, "e":Lcom/yong/jamendo/api/WSError;
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->access$1(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/arist/MusicPlayer/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    .line 1725
    const v3, 0x7f080084

    .line 1724
    invoke-static {v2, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v2

    .line 1725
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 1726
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->access$1(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$23(Lcom/arist/MusicPlayer/MainActivity;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1727
    invoke-virtual {v0}, Lcom/yong/jamendo/api/WSError;->printStackTrace()V

    goto :goto_0
.end method

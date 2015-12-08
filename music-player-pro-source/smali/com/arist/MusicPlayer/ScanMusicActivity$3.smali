.class Lcom/arist/MusicPlayer/ScanMusicActivity$3;
.super Landroid/os/Handler;
.source "ScanMusicActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/ScanMusicActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/ScanMusicActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$3;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    .line 86
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    const/4 v3, 0x1

    .line 88
    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v3, :cond_1

    .line 89
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$3;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->tvCount:Landroid/widget/TextView;
    invoke-static {v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$2(Lcom/arist/MusicPlayer/ScanMusicActivity;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$3;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    const v3, 0x7f080071

    invoke-virtual {v2, v3}, Lcom/arist/MusicPlayer/ScanMusicActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 90
    iget-object v2, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$3;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->musicBiz:Lcom/arist/biz/MusicBiz;
    invoke-static {v2}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$3(Lcom/arist/MusicPlayer/ScanMusicActivity;)Lcom/arist/biz/MusicBiz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/arist/biz/MusicBiz;->getCount()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 91
    iget-object v2, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$3;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    const v3, 0x7f08005d

    invoke-virtual {v2, v3}, Lcom/arist/MusicPlayer/ScanMusicActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 89
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 99
    return-void

    .line 92
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 93
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$3;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->btnScan:Landroid/widget/Button;
    invoke-static {v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$0(Lcom/arist/MusicPlayer/ScanMusicActivity;)Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$3;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    const v2, 0x7f080077

    invoke-virtual {v1, v2}, Lcom/arist/MusicPlayer/ScanMusicActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 94
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 95
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$3;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->btnScan:Landroid/widget/Button;
    invoke-static {v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$0(Lcom/arist/MusicPlayer/ScanMusicActivity;)Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$3;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    const v2, 0x7f080072

    invoke-virtual {v1, v2}, Lcom/arist/MusicPlayer/ScanMusicActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 96
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$3;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->btnScan:Landroid/widget/Button;
    invoke-static {v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$0(Lcom/arist/MusicPlayer/ScanMusicActivity;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    goto :goto_0
.end method

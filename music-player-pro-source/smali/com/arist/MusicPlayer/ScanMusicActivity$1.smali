.class Lcom/arist/MusicPlayer/ScanMusicActivity$1;
.super Ljava/lang/Object;
.source "ScanMusicActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


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
    iput-object p1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$1;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 68
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$1;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    const v1, 0x7f080072

    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/ScanMusicActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$1;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->btnScan:Landroid/widget/Button;
    invoke-static {v1}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$0(Lcom/arist/MusicPlayer/ScanMusicActivity;)Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$1;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    invoke-virtual {v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->finish()V

    .line 75
    :goto_0
    return-void

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$1;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->thread:Ljava/lang/Thread;
    invoke-static {v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$1(Lcom/arist/MusicPlayer/ScanMusicActivity;)Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 72
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$1;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->btnScan:Landroid/widget/Button;
    invoke-static {v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$0(Lcom/arist/MusicPlayer/ScanMusicActivity;)Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$1;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    const v2, 0x7f080073

    invoke-virtual {v1, v2}, Lcom/arist/MusicPlayer/ScanMusicActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 73
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$1;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->btnScan:Landroid/widget/Button;
    invoke-static {v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$0(Lcom/arist/MusicPlayer/ScanMusicActivity;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    goto :goto_0
.end method

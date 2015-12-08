.class Lcom/arist/MusicPlayer/MainActivity$34;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->shouNetMusicContextDlg()Landroid/app/Dialog;
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$34;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 1628
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v4, 0x5

    .line 1630
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$34;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 1631
    const v2, 0x7f08007d

    const/4 v3, 0x1

    .line 1630
    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v1

    .line 1632
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 1633
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$34;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 1634
    const-class v2, Lcom/arist/service/MusicDownloadService;

    .line 1633
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1635
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "uri"

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$34;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v2, v2, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    invoke-virtual {v2}, Lcom/yong/jamendo/api/JamendoMusic;->getAudio_link()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1636
    const-string v1, "musicName"

    .line 1637
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$34;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v2, v2, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    invoke-virtual {v2}, Lcom/yong/jamendo/api/JamendoMusic;->getMusic_name()Ljava/lang/String;

    move-result-object v2

    .line 1636
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1638
    const-string v1, "AlbumName"

    .line 1639
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$34;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v2, v2, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    invoke-virtual {v2}, Lcom/yong/jamendo/api/JamendoMusic;->getAlbum_name()Ljava/lang/String;

    move-result-object v2

    .line 1638
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1640
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$34;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v1, v0}, Lcom/arist/MusicPlayer/MainActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 1641
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$34;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v1, v4}, Lcom/arist/MusicPlayer/MainActivity;->dismissDialog(I)V

    .line 1642
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$34;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v1, v4}, Lcom/arist/MusicPlayer/MainActivity;->removeDialog(I)V

    .line 1643
    return-void
.end method

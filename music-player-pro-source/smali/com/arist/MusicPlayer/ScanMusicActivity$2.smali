.class Lcom/arist/MusicPlayer/ScanMusicActivity$2;
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$2;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 82
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$2;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    invoke-virtual {v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->finish()V

    .line 83
    return-void
.end method

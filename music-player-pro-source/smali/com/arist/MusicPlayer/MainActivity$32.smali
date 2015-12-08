.class Lcom/arist/MusicPlayer/MainActivity$32;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->showNewMusicConfirmPlayDlg()Landroid/app/Dialog;
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$32;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 1553
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    const/4 v1, 0x4

    .line 1556
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$32;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->dismissDialog(I)V

    .line 1557
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$32;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->removeDialog(I)V

    .line 1558
    return-void
.end method

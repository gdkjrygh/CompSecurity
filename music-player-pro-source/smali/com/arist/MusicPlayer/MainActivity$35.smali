.class Lcom/arist/MusicPlayer/MainActivity$35;
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$35;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 1646
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v1, 0x5

    .line 1648
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$35;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->dismissDialog(I)V

    .line 1649
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$35;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->removeDialog(I)V

    .line 1650
    return-void
.end method

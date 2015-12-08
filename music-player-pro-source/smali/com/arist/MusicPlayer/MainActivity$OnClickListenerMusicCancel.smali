.class Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicCancel;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/MusicPlayer/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "OnClickListenerMusicCancel"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;


# direct methods
.method private constructor <init>(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 1022
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicCancel;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/MusicPlayer/MainActivity;Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicCancel;)V
    .locals 0

    .prologue
    .line 1022
    invoke-direct {p0, p1}, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicCancel;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    const/4 v1, 0x1

    .line 1026
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicCancel;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->dismissDialog(I)V

    .line 1027
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicCancel;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->removeDialog(I)V

    .line 1028
    return-void
.end method

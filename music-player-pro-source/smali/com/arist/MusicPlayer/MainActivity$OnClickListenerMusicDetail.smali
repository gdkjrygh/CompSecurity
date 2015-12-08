.class Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicDetail;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/MusicPlayer/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "OnClickListenerMusicDetail"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;


# direct methods
.method private constructor <init>(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 967
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicDetail;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/MusicPlayer/MainActivity;Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicDetail;)V
    .locals 0

    .prologue
    .line 967
    invoke-direct {p0, p1}, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicDetail;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v2, 0x1

    .line 969
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicDetail;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->showDialog(I)V

    .line 970
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicDetail;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v2}, Lcom/arist/MusicPlayer/MainActivity;->dismissDialog(I)V

    .line 971
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicDetail;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v2}, Lcom/arist/MusicPlayer/MainActivity;->removeDialog(I)V

    .line 972
    return-void
.end method

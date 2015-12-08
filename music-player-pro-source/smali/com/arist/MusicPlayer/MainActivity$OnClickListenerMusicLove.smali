.class Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;
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
    name = "OnClickListenerMusicLove"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;


# direct methods
.method private constructor <init>(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 976
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/MusicPlayer/MainActivity;Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;)V
    .locals 0

    .prologue
    .line 976
    invoke-direct {p0, p1}, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    return-void
.end method

.method static synthetic access$1(Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;)Lcom/arist/MusicPlayer/MainActivity;
    .locals 1

    .prologue
    .line 976
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v3, 0x1

    .line 979
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const v2, 0x7f080064

    invoke-virtual {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 980
    const/4 v2, 0x0

    .line 979
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 980
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 981
    new-instance v0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove$1;

    invoke-direct {v0, p0}, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove$1;-><init>(Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;)V

    .line 995
    invoke-virtual {v0}, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove$1;->start()V

    .line 996
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v3}, Lcom/arist/MusicPlayer/MainActivity;->dismissDialog(I)V

    .line 997
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v3}, Lcom/arist/MusicPlayer/MainActivity;->removeDialog(I)V

    .line 998
    return-void
.end method

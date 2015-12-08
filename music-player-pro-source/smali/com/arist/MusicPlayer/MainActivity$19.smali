.class Lcom/arist/MusicPlayer/MainActivity$19;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->initListener()V
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$19;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 626
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/arist/MusicPlayer/MainActivity$19;)Lcom/arist/MusicPlayer/MainActivity;
    .locals 1

    .prologue
    .line 626
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$19;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    return-object v0
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 7
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v6, 0x1

    .line 628
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$19;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    invoke-static {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->access$47(Lcom/arist/MusicPlayer/MainActivity;Ljava/util/Timer;)V

    .line 629
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$19;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->seekTimer:Ljava/util/Timer;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$48(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/Timer;

    move-result-object v0

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$19$1;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$19$1;-><init>(Lcom/arist/MusicPlayer/MainActivity$19;)V

    .line 640
    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x64

    .line 629
    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 641
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$19;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-static {v0, v6}, Lcom/arist/MusicPlayer/MainActivity;->access$49(Lcom/arist/MusicPlayer/MainActivity;Z)V

    .line 642
    return v6
.end method

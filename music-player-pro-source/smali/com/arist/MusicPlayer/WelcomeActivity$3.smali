.class Lcom/arist/MusicPlayer/WelcomeActivity$3;
.super Ljava/util/TimerTask;
.source "WelcomeActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/WelcomeActivity;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field progress:I

.field final synthetic this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

.field totalMusic:I


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/WelcomeActivity;)V
    .locals 1

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/WelcomeActivity$3;->this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

    .line 94
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 95
    const/4 v0, 0x0

    iput v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity$3;->progress:I

    .line 96
    # getter for: Lcom/arist/MusicPlayer/WelcomeActivity;->biz:Lcom/arist/biz/MusicBiz;
    invoke-static {p1}, Lcom/arist/MusicPlayer/WelcomeActivity;->access$2(Lcom/arist/MusicPlayer/WelcomeActivity;)Lcom/arist/biz/MusicBiz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/biz/MusicBiz;->getTotalMusic()I

    move-result v0

    iput v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity$3;->totalMusic:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 98
    iget v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity$3;->totalMusic:I

    if-lez v0, :cond_1

    .line 99
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity$3;->this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

    # getter for: Lcom/arist/MusicPlayer/WelcomeActivity;->biz:Lcom/arist/biz/MusicBiz;
    invoke-static {v0}, Lcom/arist/MusicPlayer/WelcomeActivity;->access$2(Lcom/arist/MusicPlayer/WelcomeActivity;)Lcom/arist/biz/MusicBiz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/biz/MusicBiz;->getCount()I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    iget v2, p0, Lcom/arist/MusicPlayer/WelcomeActivity$3;->totalMusic:I

    int-to-double v2, v2

    div-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity$3;->progress:I

    .line 102
    :goto_0
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity$3;->this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

    # getter for: Lcom/arist/MusicPlayer/WelcomeActivity;->pbWelcome:Landroid/widget/ProgressBar;
    invoke-static {v0}, Lcom/arist/MusicPlayer/WelcomeActivity;->access$3(Lcom/arist/MusicPlayer/WelcomeActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    iget v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity$3;->progress:I

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 103
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity$3;->this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

    # getter for: Lcom/arist/MusicPlayer/WelcomeActivity;->flag:Z
    invoke-static {v0}, Lcom/arist/MusicPlayer/WelcomeActivity;->access$4(Lcom/arist/MusicPlayer/WelcomeActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity$3;->this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

    # getter for: Lcom/arist/MusicPlayer/WelcomeActivity;->pbWelcome:Landroid/widget/ProgressBar;
    invoke-static {v0}, Lcom/arist/MusicPlayer/WelcomeActivity;->access$3(Lcom/arist/MusicPlayer/WelcomeActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 106
    :cond_0
    return-void

    .line 101
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity$3;->progress:I

    goto :goto_0
.end method

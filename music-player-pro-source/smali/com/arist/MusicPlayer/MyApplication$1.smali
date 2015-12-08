.class Lcom/arist/MusicPlayer/MyApplication$1;
.super Ljava/util/TimerTask;
.source "MyApplication.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MyApplication;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MyApplication;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MyApplication;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MyApplication$1;->this$0:Lcom/arist/MusicPlayer/MyApplication;

    .line 213
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 215
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->context:Landroid/content/Context;

    const-class v2, Lcom/arist/service/MusicPlayService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 216
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/arist/MusicPlayer/MyApplication$1;->this$0:Lcom/arist/MusicPlayer/MyApplication;

    invoke-virtual {v1, v0}, Lcom/arist/MusicPlayer/MyApplication;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 217
    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->timerStartService:Ljava/util/Timer;

    invoke-virtual {v1}, Ljava/util/Timer;->cancel()V

    .line 218
    return-void
.end method

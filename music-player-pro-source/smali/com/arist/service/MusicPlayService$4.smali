.class Lcom/arist/service/MusicPlayService$4;
.super Ljava/lang/Object;
.source "MusicPlayService.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/service/MusicPlayService;->startNotificationHandler()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/service/MusicPlayService;


# direct methods
.method constructor <init>(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/service/MusicPlayService$4;->this$0:Lcom/arist/service/MusicPlayService;

    .line 558
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 560
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getInstance()Lcom/arist/MusicPlayer/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/MusicPlayer/MyApplication;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 561
    iget-object v0, p0, Lcom/arist/service/MusicPlayService$4;->this$0:Lcom/arist/service/MusicPlayService;

    invoke-virtual {v0}, Lcom/arist/service/MusicPlayService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/service/MusicPlayService$4;->this$0:Lcom/arist/service/MusicPlayService;

    # getter for: Lcom/arist/service/MusicPlayService;->manager:Landroid/app/NotificationManager;
    invoke-static {v1}, Lcom/arist/service/MusicPlayService;->access$12(Lcom/arist/service/MusicPlayService;)Landroid/app/NotificationManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/arist/notify/MyNotiofation;->sendNotify(Landroid/content/Context;Landroid/app/NotificationManager;)V

    .line 565
    :goto_0
    return-void

    .line 563
    :cond_0
    invoke-static {}, Lcom/arist/notify/MyNotiofation;->clearNotification()V

    goto :goto_0
.end method

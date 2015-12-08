.class Lcom/arist/service/MusicPlayService$2;
.super Ljava/lang/Object;
.source "MusicPlayService.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/service/MusicPlayService;->onCreate()V
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
    iput-object p1, p0, Lcom/arist/service/MusicPlayService$2;->this$0:Lcom/arist/service/MusicPlayService;

    .line 299
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 3
    .param p1, "mp"    # Landroid/media/MediaPlayer;

    .prologue
    .line 301
    iget-object v0, p0, Lcom/arist/service/MusicPlayService$2;->this$0:Lcom/arist/service/MusicPlayService;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/arist/service/MusicPlayService;->access$11(Lcom/arist/service/MusicPlayService;Z)V

    .line 302
    const-string v0, "info"

    .line 303
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "MusicPlayService next"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 304
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentPosition()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 303
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 302
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 305
    iget-object v0, p0, Lcom/arist/service/MusicPlayService$2;->this$0:Lcom/arist/service/MusicPlayService;

    # invokes: Lcom/arist/service/MusicPlayService;->next()V
    invoke-static {v0}, Lcom/arist/service/MusicPlayService;->access$0(Lcom/arist/service/MusicPlayService;)V

    .line 306
    return-void
.end method

.class final Lcom/arist/service/f;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field final synthetic a:Lcom/arist/service/MusicPlayService;


# direct methods
.method constructor <init>(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/service/f;->a:Lcom/arist/service/MusicPlayService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 3

    const-string v0, "complete"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "complete"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/arist/service/f;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v2}, Lcom/arist/service/MusicPlayService;->g(Lcom/arist/service/MusicPlayService;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/arist/service/f;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v0}, Lcom/arist/service/MusicPlayService;->h(Lcom/arist/service/MusicPlayService;)Lcom/arist/service/p;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/service/f;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v0}, Lcom/arist/service/MusicPlayService;->h(Lcom/arist/service/MusicPlayService;)Lcom/arist/service/p;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/arist/service/p;->a(Z)V

    :cond_0
    iget-object v0, p0, Lcom/arist/service/f;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v0}, Lcom/arist/service/MusicPlayService;->i(Lcom/arist/service/MusicPlayService;)V

    iget-object v0, p0, Lcom/arist/service/f;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v0}, Lcom/arist/service/MusicPlayService;->g(Lcom/arist/service/MusicPlayService;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/service/f;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v0}, Lcom/arist/service/MusicPlayService;->j(Lcom/arist/service/MusicPlayService;)V

    :cond_1
    return-void
.end method

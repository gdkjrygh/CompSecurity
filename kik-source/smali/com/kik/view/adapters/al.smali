.class final Lcom/kik/view/adapters/al;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/media/MediaPlayer$OnErrorListener;

.field final synthetic b:Landroid/view/Surface;

.field final synthetic c:Landroid/media/MediaPlayer$OnPreparedListener;

.field final synthetic d:Landroid/media/MediaPlayer$OnCompletionListener;

.field final synthetic e:Lcom/kik/view/adapters/ak;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/ak;Landroid/media/MediaPlayer$OnErrorListener;Landroid/view/Surface;Landroid/media/MediaPlayer$OnPreparedListener;Landroid/media/MediaPlayer$OnCompletionListener;)V
    .locals 0

    .prologue
    .line 157
    iput-object p1, p0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    iput-object p2, p0, Lcom/kik/view/adapters/al;->a:Landroid/media/MediaPlayer$OnErrorListener;

    iput-object p3, p0, Lcom/kik/view/adapters/al;->b:Landroid/view/Surface;

    iput-object p4, p0, Lcom/kik/view/adapters/al;->c:Landroid/media/MediaPlayer$OnPreparedListener;

    iput-object p5, p0, Lcom/kik/view/adapters/al;->d:Landroid/media/MediaPlayer$OnCompletionListener;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 157
    check-cast p1, Ljava/io/File;

    :try_start_0
    iget-object v0, p0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v0}, Lcom/kik/view/adapters/ak;->a(Lcom/kik/view/adapters/ak;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lkik/android/VideoContentProvider;->a(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    iget-object v2, p0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v2}, Lcom/kik/view/adapters/ak;->b(Lcom/kik/view/adapters/ak;)Landroid/view/TextureView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/TextureView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    const/16 v2, 0x13

    invoke-virtual {v1, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x12

    invoke-virtual {v1, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iget-object v3, p0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v3, v1, v2}, Lcom/kik/view/adapters/ak;->a(Lcom/kik/view/adapters/ak;II)V

    iget-object v1, p0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    new-instance v2, Landroid/media/MediaPlayer;

    invoke-direct {v2}, Landroid/media/MediaPlayer;-><init>()V

    invoke-static {v1, v2}, Lcom/kik/view/adapters/ak;->a(Lcom/kik/view/adapters/ak;Landroid/media/MediaPlayer;)Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v1}, Lcom/kik/view/adapters/ak;->c(Lcom/kik/view/adapters/ak;)Landroid/media/MediaPlayer;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v2}, Lcom/kik/view/adapters/ak;->b(Lcom/kik/view/adapters/ak;)Landroid/view/TextureView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/TextureView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    iget-object v0, p0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v0}, Lcom/kik/view/adapters/ak;->c(Lcom/kik/view/adapters/ak;)Landroid/media/MediaPlayer;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/view/adapters/al;->b:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setSurface(Landroid/view/Surface;)V

    iget-object v0, p0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v0}, Lcom/kik/view/adapters/ak;->c(Lcom/kik/view/adapters/ak;)Landroid/media/MediaPlayer;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v1}, Lcom/kik/view/adapters/ak;->d(Lcom/kik/view/adapters/ak;)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    iget-object v0, p0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v0}, Lcom/kik/view/adapters/ak;->c(Lcom/kik/view/adapters/ak;)Landroid/media/MediaPlayer;

    move-result-object v0

    new-instance v1, Lcom/kik/view/adapters/am;

    invoke-direct {v1, p0}, Lcom/kik/view/adapters/am;-><init>(Lcom/kik/view/adapters/al;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    iget-object v0, p0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v0}, Lcom/kik/view/adapters/ak;->c(Lcom/kik/view/adapters/ak;)Landroid/media/MediaPlayer;

    move-result-object v0

    new-instance v1, Lcom/kik/view/adapters/an;

    invoke-direct {v1, p0}, Lcom/kik/view/adapters/an;-><init>(Lcom/kik/view/adapters/al;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    iget-object v0, p0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v0}, Lcom/kik/view/adapters/ak;->c(Lcom/kik/view/adapters/ak;)Landroid/media/MediaPlayer;

    move-result-object v0

    new-instance v1, Lcom/kik/view/adapters/ao;

    invoke-direct {v1, p0}, Lcom/kik/view/adapters/ao;-><init>(Lcom/kik/view/adapters/al;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    iget-object v0, p0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v0}, Lcom/kik/view/adapters/ak;->c(Lcom/kik/view/adapters/ak;)Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/kik/view/adapters/al;->a:Landroid/media/MediaPlayer$OnErrorListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/view/adapters/al;->a:Landroid/media/MediaPlayer$OnErrorListener;

    iget-object v1, p0, Lcom/kik/view/adapters/al;->e:Lcom/kik/view/adapters/ak;

    invoke-static {v1}, Lcom/kik/view/adapters/ak;->c(Lcom/kik/view/adapters/ak;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-interface {v0, v1, v4, v4}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z

    goto :goto_0
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 161
    iget-object v0, p0, Lcom/kik/view/adapters/al;->a:Landroid/media/MediaPlayer$OnErrorListener;

    if-nez v0, :cond_0

    .line 171
    :goto_0
    return-void

    .line 165
    :cond_0
    instance-of v0, p1, Lkik/android/v;

    if-eqz v0, :cond_1

    .line 166
    iget-object v0, p0, Lcom/kik/view/adapters/al;->a:Landroid/media/MediaPlayer$OnErrorListener;

    const/16 v1, 0x191

    invoke-interface {v0, v3, v1, v2}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z

    goto :goto_0

    .line 169
    :cond_1
    iget-object v0, p0, Lcom/kik/view/adapters/al;->a:Landroid/media/MediaPlayer$OnErrorListener;

    const/16 v1, 0x190

    invoke-interface {v0, v3, v1, v2}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z

    goto :goto_0
.end method

.class final Lcom/kik/cards/web/video/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# instance fields
.field final synthetic a:Lcom/kik/cards/web/video/b;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/video/b;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/kik/cards/web/video/c;->a:Lcom/kik/cards/web/video/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onError(Landroid/media/MediaPlayer;II)Z
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 114
    iget-object v0, p0, Lcom/kik/cards/web/video/c;->a:Lcom/kik/cards/web/video/b;

    invoke-static {v0}, Lcom/kik/cards/web/video/b;->a(Lcom/kik/cards/web/video/b;)Lkik/android/chat/fragment/WebVideoFragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/kik/cards/web/video/c;->a:Lcom/kik/cards/web/video/b;

    invoke-static {v0}, Lcom/kik/cards/web/video/b;->a(Lcom/kik/cards/web/video/b;)Lkik/android/chat/fragment/WebVideoFragment;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/WebVideoFragment;->c()V

    .line 118
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/kik/cards/web/video/c;->a:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0, p3}, Lcom/kik/cards/web/video/b;->b(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    :goto_0
    iget-object v0, p0, Lcom/kik/cards/web/video/c;->a:Lcom/kik/cards/web/video/b;

    invoke-static {v0, v1}, Lcom/kik/cards/web/video/b;->a(Lcom/kik/cards/web/video/b;Z)Z

    .line 123
    return v1

    :catch_0
    move-exception v0

    goto :goto_0
.end method

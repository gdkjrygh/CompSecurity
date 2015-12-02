.class Lcom/facebook/l/e;
.super Ljava/lang/Object;
.source "MusicPresenceHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/l/d;


# direct methods
.method constructor <init>(Lcom/facebook/l/d;)V
    .locals 0

    .prologue
    .line 143
    iput-object p1, p0, Lcom/facebook/l/e;->a:Lcom/facebook/l/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 146
    iget-object v0, p0, Lcom/facebook/l/e;->a:Lcom/facebook/l/d;

    iget-object v0, v0, Lcom/facebook/l/d;->a:Lcom/facebook/l/c;

    iget-object v1, p0, Lcom/facebook/l/e;->a:Lcom/facebook/l/d;

    iget-object v1, v1, Lcom/facebook/l/d;->a:Lcom/facebook/l/c;

    invoke-static {v1}, Lcom/facebook/l/c;->a(Lcom/facebook/l/c;)Landroid/media/AudioManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/AudioManager;->isMusicActive()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/l/c;->a(Z)V

    .line 147
    return-void
.end method

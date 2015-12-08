.class Lcom/jirbo/adcolony/e$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/e$4;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/e$4;)V
    .locals 0

    .prologue
    .line 415
    iput-object p1, p0, Lcom/jirbo/adcolony/e$4$1;->a:Lcom/jirbo/adcolony/e$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 420
    iget-object v0, p0, Lcom/jirbo/adcolony/e$4$1;->a:Lcom/jirbo/adcolony/e$4;

    iget-object v0, v0, Lcom/jirbo/adcolony/e$4;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->x:Landroid/media/MediaPlayer$OnCompletionListener;

    if-eqz v0, :cond_0

    .line 421
    iget-object v0, p0, Lcom/jirbo/adcolony/e$4$1;->a:Lcom/jirbo/adcolony/e$4;

    iget-object v0, v0, Lcom/jirbo/adcolony/e$4;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->x:Landroid/media/MediaPlayer$OnCompletionListener;

    iget-object v1, p0, Lcom/jirbo/adcolony/e$4$1;->a:Lcom/jirbo/adcolony/e$4;

    iget-object v1, v1, Lcom/jirbo/adcolony/e$4;->a:Lcom/jirbo/adcolony/e;

    iget-object v1, v1, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-interface {v0, v1}, Landroid/media/MediaPlayer$OnCompletionListener;->onCompletion(Landroid/media/MediaPlayer;)V

    .line 423
    :cond_0
    return-void
.end method

.class Lcom/jirbo/adcolony/e$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnBufferingUpdateListener;


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/e;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/e;)V
    .locals 0

    .prologue
    .line 433
    iput-object p1, p0, Lcom/jirbo/adcolony/e$5;->a:Lcom/jirbo/adcolony/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBufferingUpdate(Landroid/media/MediaPlayer;I)V
    .locals 1

    .prologue
    .line 435
    iget-object v0, p0, Lcom/jirbo/adcolony/e$5;->a:Lcom/jirbo/adcolony/e;

    iput p2, v0, Lcom/jirbo/adcolony/e;->z:I

    .line 436
    return-void
.end method

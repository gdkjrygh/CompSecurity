.class Lcom/jirbo/adcolony/ADCVideo$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/ADCVideo;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/ADCVideo;)V
    .locals 0

    .prologue
    .line 645
    iput-object p1, p0, Lcom/jirbo/adcolony/ADCVideo$3;->a:Lcom/jirbo/adcolony/ADCVideo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 2

    .prologue
    .line 649
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo$3;->a:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->P:Landroid/widget/FrameLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeViewAt(I)V

    .line 650
    return-void
.end method

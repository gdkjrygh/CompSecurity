.class Lcom/jirbo/adcolony/ADCVideo$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/ADCVideo;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/ADCVideo;)V
    .locals 0

    .prologue
    .line 635
    iput-object p1, p0, Lcom/jirbo/adcolony/ADCVideo$2;->a:Lcom/jirbo/adcolony/ADCVideo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 2

    .prologue
    .line 639
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo$2;->a:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCVideo$2;->a:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->N:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ADCVideo;->setContentView(Landroid/view/View;)V

    .line 640
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo$2;->a:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->P:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 641
    const/4 v0, 0x0

    sput-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->g:Z

    .line 642
    return-void
.end method

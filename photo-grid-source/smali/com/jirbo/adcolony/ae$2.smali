.class Lcom/jirbo/adcolony/ae$2;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/ae;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/ae;)V
    .locals 0

    .prologue
    .line 587
    iput-object p1, p0, Lcom/jirbo/adcolony/ae$2;->a:Lcom/jirbo/adcolony/ae;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 590
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$2;->a:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCVideo;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 593
    :cond_0
    :goto_0
    return-void

    .line 591
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$2;->a:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    if-eqz v0, :cond_0

    .line 592
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$2;->a:Lcom/jirbo/adcolony/ae;

    iget v1, p1, Landroid/os/Message;->what:I

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ae;->a(I)V

    goto :goto_0
.end method

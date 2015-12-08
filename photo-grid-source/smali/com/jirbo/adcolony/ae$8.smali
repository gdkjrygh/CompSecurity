.class Lcom/jirbo/adcolony/ae$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/jirbo/adcolony/ae;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/ae;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1372
    iput-object p1, p0, Lcom/jirbo/adcolony/ae$8;->b:Lcom/jirbo/adcolony/ae;

    iput-object p2, p0, Lcom/jirbo/adcolony/ae$8;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1375
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$8;->b:Lcom/jirbo/adcolony/ae;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/ae$8;->b:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->O:Landroid/widget/FrameLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 1376
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$8;->b:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->N:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae$8;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 1377
    return-void
.end method

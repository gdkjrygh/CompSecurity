.class Lcom/jirbo/adcolony/ae$6;
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
    .line 1172
    iput-object p1, p0, Lcom/jirbo/adcolony/ae$6;->b:Lcom/jirbo/adcolony/ae;

    iput-object p2, p0, Lcom/jirbo/adcolony/ae$6;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 1175
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$6;->b:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->N:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae$6;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 1176
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$6;->b:Lcom/jirbo/adcolony/ae;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ae;->a(Z)V

    .line 1177
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$6;->b:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/jirbo/adcolony/ADCVideo;->r:J

    .line 1178
    return-void
.end method

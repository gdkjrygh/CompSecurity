.class Lcom/facebook/orca/d/at;
.super Ljava/lang/Object;
.source "AudioRecorderTooltipView.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/as;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/as;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/facebook/orca/d/at;->a:Lcom/facebook/orca/d/as;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/orca/d/at;->a:Lcom/facebook/orca/d/as;

    iget-object v1, p0, Lcom/facebook/orca/d/at;->a:Lcom/facebook/orca/d/as;

    invoke-static {v1}, Lcom/facebook/orca/d/as;->a(Lcom/facebook/orca/d/as;)Lcom/facebook/common/time/a;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    iget-object v3, p0, Lcom/facebook/orca/d/at;->a:Lcom/facebook/orca/d/as;

    invoke-static {v3}, Lcom/facebook/orca/d/as;->b(Lcom/facebook/orca/d/as;)J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/d/as;->a(Lcom/facebook/orca/d/as;J)V

    .line 45
    iget-object v0, p0, Lcom/facebook/orca/d/at;->a:Lcom/facebook/orca/d/as;

    invoke-static {v0}, Lcom/facebook/orca/d/as;->d(Lcom/facebook/orca/d/as;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/d/at;->a:Lcom/facebook/orca/d/as;

    invoke-static {v1}, Lcom/facebook/orca/d/as;->c(Lcom/facebook/orca/d/as;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 46
    return-void
.end method

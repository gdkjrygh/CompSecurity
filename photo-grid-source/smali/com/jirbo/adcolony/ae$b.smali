.class Lcom/jirbo/adcolony/ae$b;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/ae;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/ae;)V
    .locals 0

    .prologue
    .line 1495
    iput-object p1, p0, Lcom/jirbo/adcolony/ae$b;->a:Lcom/jirbo/adcolony/ae;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 1496
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae$b;->a()V

    .line 1497
    return-void
.end method


# virtual methods
.method a()V
    .locals 4

    .prologue
    .line 1501
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae$b;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const-wide/16 v2, 0x1f4

    invoke-virtual {p0, v0, v2, v3}, Lcom/jirbo/adcolony/ae$b;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1502
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 1506
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae$b;->a()V

    .line 1508
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$b;->a:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCVideo;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1524
    :cond_0
    :goto_0
    return-void

    .line 1509
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$b;->a:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    if-eqz v0, :cond_0

    .line 1511
    monitor-enter p0

    .line 1513
    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$b;->a:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->ad:Lcom/jirbo/adcolony/ab$b;

    if-eqz v0, :cond_3

    .line 1515
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$b;->a:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->ad:Lcom/jirbo/adcolony/ab$b;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ab$b;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jirbo/adcolony/ae$b;->a:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1517
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$b;->a:Lcom/jirbo/adcolony/ae;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/jirbo/adcolony/ae;->ad:Lcom/jirbo/adcolony/ab$b;

    .line 1518
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$b;->a:Lcom/jirbo/adcolony/ae;

    const/4 v1, 0x0

    iput v1, v0, Lcom/jirbo/adcolony/ae;->t:I

    .line 1519
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$b;->a:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/ae$b;->a:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->a()V

    .line 1520
    :cond_2
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$b;->a:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/jirbo/adcolony/ADCVideo;->n:Z

    .line 1521
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$b;->a:Lcom/jirbo/adcolony/ae;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ae;->f()V

    .line 1524
    :cond_3
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

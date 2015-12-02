.class public abstract Lcom/facebook/widget/a/a;
.super Ljava/lang/Object;
.source "AbstractCustomFilter.java"

# interfaces
.implements Lcom/facebook/widget/a/f;


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Landroid/os/Handler;

.field private c:Lcom/facebook/widget/a/g;

.field private final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/a/a;->d:Ljava/lang/Object;

    .line 65
    new-instance v0, Lcom/facebook/widget/a/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/widget/a/e;-><init>(Lcom/facebook/widget/a/a;Lcom/facebook/widget/a/b;)V

    iput-object v0, p0, Lcom/facebook/widget/a/a;->b:Landroid/os/Handler;

    .line 66
    return-void
.end method

.method static synthetic a(Lcom/facebook/widget/a/a;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/widget/a/a;->b:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/widget/a/a;Landroid/os/Handler;)Landroid/os/Handler;
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/facebook/widget/a/a;->a:Landroid/os/Handler;

    return-object p1
.end method

.method static synthetic b(Lcom/facebook/widget/a/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/widget/a/a;->d:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/widget/a/a;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/widget/a/a;->a:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 84
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/widget/a/a;->a(Ljava/lang/CharSequence;Lcom/facebook/widget/a/h;)V

    .line 85
    return-void
.end method

.method public final a(Ljava/lang/CharSequence;Lcom/facebook/widget/a/h;)V
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 89
    iget-object v3, p0, Lcom/facebook/widget/a/a;->d:Ljava/lang/Object;

    monitor-enter v3

    .line 90
    :try_start_0
    iget-object v1, p0, Lcom/facebook/widget/a/a;->a:Landroid/os/Handler;

    if-nez v1, :cond_0

    .line 91
    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "Filter"

    const/16 v4, 0xa

    invoke-direct {v1, v2, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 93
    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    .line 94
    new-instance v2, Lcom/facebook/widget/a/d;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v2, p0, v1}, Lcom/facebook/widget/a/d;-><init>(Lcom/facebook/widget/a/a;Landroid/os/Looper;)V

    iput-object v2, p0, Lcom/facebook/widget/a/a;->a:Landroid/os/Handler;

    .line 97
    :cond_0
    iget-object v1, p0, Lcom/facebook/widget/a/a;->c:Lcom/facebook/widget/a/g;

    if-nez v1, :cond_3

    const-wide/16 v1, 0x0

    .line 99
    :goto_0
    iget-object v4, p0, Lcom/facebook/widget/a/a;->a:Landroid/os/Handler;

    const v5, -0x2f2f0ff3

    invoke-virtual {v4, v5}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 101
    new-instance v5, Lcom/facebook/widget/a/c;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lcom/facebook/widget/a/c;-><init>(Lcom/facebook/widget/a/b;)V

    .line 104
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    iput-object v0, v5, Lcom/facebook/widget/a/c;->a:Ljava/lang/CharSequence;

    .line 105
    iput-object p2, v5, Lcom/facebook/widget/a/c;->b:Lcom/facebook/widget/a/h;

    .line 106
    if-eqz p2, :cond_2

    .line 107
    sget-object v0, Lcom/facebook/widget/a/j;->FILTERING:Lcom/facebook/widget/a/j;

    invoke-interface {p2, v0}, Lcom/facebook/widget/a/h;->a(Lcom/facebook/widget/a/j;)V

    .line 109
    :cond_2
    iput-object v5, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 111
    iget-object v0, p0, Lcom/facebook/widget/a/a;->a:Landroid/os/Handler;

    const v5, -0x2f2f0ff3

    invoke-virtual {v0, v5}, Landroid/os/Handler;->removeMessages(I)V

    .line 112
    iget-object v0, p0, Lcom/facebook/widget/a/a;->a:Landroid/os/Handler;

    const v5, -0x21524111

    invoke-virtual {v0, v5}, Landroid/os/Handler;->removeMessages(I)V

    .line 113
    iget-object v0, p0, Lcom/facebook/widget/a/a;->a:Landroid/os/Handler;

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 114
    monitor-exit v3

    .line 115
    return-void

    .line 97
    :cond_3
    iget-object v1, p0, Lcom/facebook/widget/a/a;->c:Lcom/facebook/widget/a/g;

    invoke-interface {v1, p1}, Lcom/facebook/widget/a/g;->a(Ljava/lang/CharSequence;)J

    move-result-wide v1

    goto :goto_0

    .line 114
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected abstract a(Ljava/lang/CharSequence;Lcom/facebook/widget/a/i;)V
.end method

.method protected abstract b(Ljava/lang/CharSequence;)Lcom/facebook/widget/a/i;
.end method

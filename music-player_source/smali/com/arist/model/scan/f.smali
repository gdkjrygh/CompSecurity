.class public final Lcom/arist/model/scan/f;
.super Ljava/lang/Thread;


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    iput-object p2, p0, Lcom/arist/model/scan/f;->a:Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/scan/f;->b:Landroid/content/Context;

    return-void
.end method

.method public static final a(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 1

    new-instance v0, Lcom/arist/model/scan/f;

    invoke-direct {v0, p0, p1}, Lcom/arist/model/scan/f;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    invoke-virtual {v0}, Lcom/arist/model/scan/f;->start()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    const/4 v4, 0x0

    const/4 v1, 0x0

    new-instance v0, Lcom/arist/model/a/a;

    invoke-direct {v0}, Lcom/arist/model/a/a;-><init>()V

    iget-object v0, p0, Lcom/arist/model/scan/f;->b:Landroid/content/Context;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/scan/f;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/arist/model/a/a;->a(Landroid/content/Context;)I

    move-result v0

    :goto_0
    iget-object v2, p0, Lcom/arist/model/scan/f;->a:Landroid/os/Handler;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/arist/model/scan/f;->a:Landroid/os/Handler;

    const/4 v3, 0x4

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    :cond_0
    iput-object v4, p0, Lcom/arist/model/scan/f;->b:Landroid/content/Context;

    iput-object v4, p0, Lcom/arist/model/scan/f;->a:Landroid/os/Handler;

    return-void

    :cond_1
    move v0, v1

    goto :goto_0
.end method

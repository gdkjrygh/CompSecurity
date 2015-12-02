.class public Lcom/qihoo360/mobilesafe/support/a/i;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/i;->a:Z

    .line 7
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 23
    invoke-super {p0}, Ljava/lang/Object;->notify()V

    .line 24
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/i;->a:Z

    .line 25
    return-void
.end method

.method public a(I)V
    .locals 2

    .prologue
    .line 12
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/i;->a:Z

    if-eqz v0, :cond_0

    .line 14
    if-nez p1, :cond_1

    .line 15
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->wait()V

    .line 20
    :cond_0
    :goto_0
    return-void

    .line 17
    :cond_1
    int-to-long v0, p1

    invoke-super {p0, v0, v1}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 18
    :catch_0
    move-exception v0

    goto :goto_0
.end method

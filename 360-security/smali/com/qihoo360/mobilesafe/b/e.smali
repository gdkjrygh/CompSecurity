.class public Lcom/qihoo360/mobilesafe/b/e;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/mobilesafe/b/e$a;
    }
.end annotation


# instance fields
.field a:Landroid/os/Handler;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private final f:I

.field private g:Lcom/qihoo360/mobilesafe/b/e$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo360/mobilesafe/b/e;->f:I

    .line 59
    new-instance v0, Lcom/qihoo360/mobilesafe/b/e$1;

    invoke-direct {v0, p0}, Lcom/qihoo360/mobilesafe/b/e$1;-><init>(Lcom/qihoo360/mobilesafe/b/e;)V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/e;->a:Landroid/os/Handler;

    .line 21
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo360/mobilesafe/b/e;->f:I

    .line 59
    new-instance v0, Lcom/qihoo360/mobilesafe/b/e$1;

    invoke-direct {v0, p0}, Lcom/qihoo360/mobilesafe/b/e$1;-><init>(Lcom/qihoo360/mobilesafe/b/e;)V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/e;->a:Landroid/os/Handler;

    .line 24
    iput p1, p0, Lcom/qihoo360/mobilesafe/b/e;->e:I

    .line 25
    return-void
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/b/e;)I
    .locals 1

    .prologue
    .line 11
    iget v0, p0, Lcom/qihoo360/mobilesafe/b/e;->b:I

    return v0
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/b/e;I)I
    .locals 0

    .prologue
    .line 11
    iput p1, p0, Lcom/qihoo360/mobilesafe/b/e;->e:I

    return p1
.end method

.method static synthetic b(Lcom/qihoo360/mobilesafe/b/e;)I
    .locals 2

    .prologue
    .line 11
    iget v0, p0, Lcom/qihoo360/mobilesafe/b/e;->b:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/qihoo360/mobilesafe/b/e;->b:I

    return v0
.end method

.method static synthetic c(Lcom/qihoo360/mobilesafe/b/e;)Lcom/qihoo360/mobilesafe/b/e$a;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/e;->g:Lcom/qihoo360/mobilesafe/b/e$a;

    return-object v0
.end method

.method static synthetic d(Lcom/qihoo360/mobilesafe/b/e;)I
    .locals 1

    .prologue
    .line 11
    iget v0, p0, Lcom/qihoo360/mobilesafe/b/e;->e:I

    return v0
.end method

.method static synthetic e(Lcom/qihoo360/mobilesafe/b/e;)I
    .locals 1

    .prologue
    .line 11
    iget v0, p0, Lcom/qihoo360/mobilesafe/b/e;->c:I

    return v0
.end method

.method static synthetic f(Lcom/qihoo360/mobilesafe/b/e;)I
    .locals 1

    .prologue
    .line 11
    iget v0, p0, Lcom/qihoo360/mobilesafe/b/e;->d:I

    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 55
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/e;->a:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/e;->g:Lcom/qihoo360/mobilesafe/b/e$a;

    .line 57
    return-void
.end method

.method public a(I)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 44
    iget v0, p0, Lcom/qihoo360/mobilesafe/b/e;->e:I

    iput v0, p0, Lcom/qihoo360/mobilesafe/b/e;->c:I

    .line 45
    iput p1, p0, Lcom/qihoo360/mobilesafe/b/e;->d:I

    .line 46
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/e;->a:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 47
    iget v1, p0, Lcom/qihoo360/mobilesafe/b/e;->c:I

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 48
    iget v1, p0, Lcom/qihoo360/mobilesafe/b/e;->d:I

    iput v1, v0, Landroid/os/Message;->arg2:I

    .line 49
    iput v2, v0, Landroid/os/Message;->what:I

    .line 50
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/e;->a:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 51
    iput v2, p0, Lcom/qihoo360/mobilesafe/b/e;->b:I

    .line 52
    return-void
.end method

.method public a(II)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 32
    iput p1, p0, Lcom/qihoo360/mobilesafe/b/e;->e:I

    .line 33
    iput p1, p0, Lcom/qihoo360/mobilesafe/b/e;->c:I

    .line 34
    iput p2, p0, Lcom/qihoo360/mobilesafe/b/e;->d:I

    .line 35
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/e;->a:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 36
    iget v1, p0, Lcom/qihoo360/mobilesafe/b/e;->c:I

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 37
    iget v1, p0, Lcom/qihoo360/mobilesafe/b/e;->d:I

    iput v1, v0, Landroid/os/Message;->arg2:I

    .line 38
    iput v2, v0, Landroid/os/Message;->what:I

    .line 39
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/e;->a:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 40
    iput v2, p0, Lcom/qihoo360/mobilesafe/b/e;->b:I

    .line 41
    return-void
.end method

.method public a(Lcom/qihoo360/mobilesafe/b/e$a;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/b/e;->g:Lcom/qihoo360/mobilesafe/b/e$a;

    .line 96
    return-void
.end method

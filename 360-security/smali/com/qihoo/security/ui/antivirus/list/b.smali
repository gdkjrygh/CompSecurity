.class public Lcom/qihoo/security/ui/antivirus/list/b;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private final a:Landroid/os/Handler;

.field private b:Landroid/view/View;

.field private c:Landroid/view/View;

.field private d:Landroid/view/WindowManager;

.field private e:Landroid/view/WindowManager$LayoutParams;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/list/b;->a:Landroid/os/Handler;

    .line 41
    const-string/jumbo v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->d:Landroid/view/WindowManager;

    .line 42
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->e:Landroid/view/WindowManager$LayoutParams;

    .line 43
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->e:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 44
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->e:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 45
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->e:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x7d3

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 46
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->e:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x88

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 47
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->e:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x3

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 48
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->e:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x30

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 49
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->e:Landroid/view/WindowManager$LayoutParams;

    invoke-static {p1}, Lcom/qihoo360/mobilesafe/b/a;->b(Landroid/content/Context;)I

    move-result v1

    div-int/lit8 v1, v1, 0x6

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 51
    const v0, 0x7f0300a6

    invoke-static {p1, v0, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->b:Landroid/view/View;

    .line 52
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->b:Landroid/view/View;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/b$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/list/b$1;-><init>(Lcom/qihoo/security/ui/antivirus/list/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 60
    const v0, 0x7f0300a5

    invoke-static {p1, v0, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->c:Landroid/view/View;

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->c:Landroid/view/View;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/b$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/list/b$2;-><init>(Lcom/qihoo/security/ui/antivirus/list/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 68
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 71
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/b;->a:Landroid/os/Handler;

    const/16 v2, 0x65

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 72
    return-void
.end method

.method public b()V
    .locals 4

    .prologue
    .line 75
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/b;->a:Landroid/os/Handler;

    const/16 v2, 0x67

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 76
    return-void
.end method

.method public c()V
    .locals 4

    .prologue
    .line 82
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/list/b;->e()V

    .line 83
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->d:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/b;->b:Landroid/view/View;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/b;->e:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 84
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/b;->a:Landroid/os/Handler;

    const/16 v2, 0x66

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 85
    return-void
.end method

.method public d()V
    .locals 4

    .prologue
    .line 91
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/list/b;->e()V

    .line 92
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->d:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/b;->c:Landroid/view/View;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/b;->e:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/b;->a:Landroid/os/Handler;

    const/16 v2, 0x68

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 94
    return-void
.end method

.method public e()V
    .locals 4

    .prologue
    const/16 v3, 0x68

    const/16 v2, 0x66

    .line 102
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->d:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/b;->b:Landroid/view/View;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 105
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 106
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->d:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/b;->c:Landroid/view/View;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 108
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->a:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 109
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->a:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 111
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->a:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 112
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b;->a:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 114
    :cond_3
    return-void
.end method

.class public final Lkik/android/util/bl;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field private a:Lcom/kik/android/a;

.field private b:Lkik/a/e/i;

.field private c:Lkik/a/e/v;

.field private d:Lkik/a/f/k;

.field private e:Lkik/a/e/n;

.field private f:Lkik/a/e/t;


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lkik/a/e/i;Lkik/a/e/v;Lcom/kik/android/a;Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/t;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 44
    iput-object p4, p0, Lkik/android/util/bl;->a:Lcom/kik/android/a;

    .line 45
    iput-object p2, p0, Lkik/android/util/bl;->b:Lkik/a/e/i;

    .line 46
    iput-object p3, p0, Lkik/android/util/bl;->c:Lkik/a/e/v;

    .line 47
    iput-object p5, p0, Lkik/android/util/bl;->d:Lkik/a/f/k;

    .line 48
    iput-object p6, p0, Lkik/android/util/bl;->e:Lkik/a/e/n;

    .line 49
    iput-object p7, p0, Lkik/android/util/bl;->f:Lkik/a/e/t;

    .line 50
    return-void
.end method

.method static synthetic a(Lkik/android/util/bl;)Lcom/kik/android/a;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lkik/android/util/bl;->a:Lcom/kik/android/a;

    return-object v0
.end method

.method static synthetic b(Lkik/android/util/bl;)Lkik/a/f/k;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lkik/android/util/bl;->d:Lkik/a/f/k;

    return-object v0
.end method

.method static synthetic c(Lkik/android/util/bl;)Lkik/a/e/n;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lkik/android/util/bl;->e:Lkik/a/e/n;

    return-object v0
.end method

.method static synthetic d(Lkik/android/util/bl;)Lkik/a/e/v;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lkik/android/util/bl;->c:Lkik/a/e/v;

    return-object v0
.end method

.method static synthetic e(Lkik/android/util/bl;)Lkik/a/e/i;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lkik/android/util/bl;->b:Lkik/a/e/i;

    return-object v0
.end method

.method static synthetic f(Lkik/android/util/bl;)Lkik/a/e/t;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lkik/android/util/bl;->f:Lkik/a/e/t;

    return-object v0
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 6

    .prologue
    .line 55
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 57
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lkik/a/d/s;

    .line 58
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 104
    :cond_0
    :goto_0
    return-void

    .line 60
    :pswitch_0
    iget-object v1, p0, Lkik/android/util/bl;->b:Lkik/a/e/i;

    invoke-interface {v1, v0}, Lkik/a/e/i;->d(Lkik/a/d/s;)Lcom/kik/g/p;

    move-result-object v1

    new-instance v2, Lkik/android/util/bm;

    invoke-direct {v2, p0, v0}, Lkik/android/util/bm;-><init>(Lkik/android/util/bl;Lkik/a/d/s;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    .line 73
    :pswitch_1
    iget-object v1, p0, Lkik/android/util/bl;->b:Lkik/a/e/i;

    invoke-interface {v1, v0}, Lkik/a/e/i;->c(Lkik/a/d/s;)V

    .line 75
    iget-object v1, p0, Lkik/android/util/bl;->b:Lkik/a/e/i;

    invoke-virtual {v0}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v3

    .line 76
    const-class v1, Lkik/a/d/a/a;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/a;

    .line 77
    invoke-static {}, Lkik/android/net/a/e;->a()Lkik/android/net/a/e;

    move-result-object v2

    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lkik/android/net/a/e;->a(Ljava/lang/String;)Ljava/lang/ref/WeakReference;

    move-result-object v4

    .line 78
    const/4 v2, 0x0

    .line 79
    if-eqz v4, :cond_1

    .line 80
    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkik/android/net/a/b;

    .line 83
    :cond_1
    if-eqz v2, :cond_2

    .line 84
    invoke-virtual {v0}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v4, 0x65

    iget-object v5, p0, Lkik/android/util/bl;->c:Lkik/a/e/v;

    invoke-virtual {v3, v1, v4, v5}, Lkik/a/d/f;->a(Ljava/lang/String;ILkik/a/e/v;)Z

    .line 85
    invoke-virtual {v2}, Lkik/android/net/a/b;->l()Lcom/kik/g/p;

    move-result-object v1

    new-instance v2, Lkik/android/util/bn;

    invoke-direct {v2, p0, v0}, Lkik/android/util/bn;-><init>(Lkik/android/util/bl;Lkik/a/d/s;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    .line 95
    :cond_2
    invoke-virtual {v1}, Lkik/a/d/a/a;->v()I

    move-result v1

    .line 96
    sget v2, Lkik/a/d/a/a$a;->e:I

    if-eq v1, v2, :cond_3

    sget v2, Lkik/a/d/a/a$a;->a:I

    if-ne v1, v2, :cond_0

    .line 98
    :cond_3
    iget-object v1, p0, Lkik/android/util/bl;->b:Lkik/a/e/i;

    invoke-interface {v1, v0}, Lkik/a/e/i;->d(Lkik/a/d/s;)Lcom/kik/g/p;

    goto :goto_0

    .line 58
    :pswitch_data_0
    .packed-switch 0x3ff
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

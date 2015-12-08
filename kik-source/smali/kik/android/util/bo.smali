.class public final Lkik/android/util/bo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/os/HandlerThread;

.field private b:Lkik/android/util/bl;

.field private c:Lcom/kik/g/f;

.field private d:Landroid/content/Context;

.field private e:Lcom/kik/android/a;

.field private f:Lkik/a/e/n;

.field private g:Lkik/a/f/k;

.field private h:Lkik/a/e/v;

.field private i:Lkik/a/e/i;

.field private j:Lkik/a/e/t;

.field private k:Lcom/kik/g/i;

.field private l:Lcom/kik/g/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lkik/a/e/i;Lkik/a/e/v;Lcom/kik/android/a;Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/t;Lkik/a/ab;)V
    .locals 8

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "UploadingHandler"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/util/bo;->a:Landroid/os/HandlerThread;

    .line 32
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/util/bo;->c:Lcom/kik/g/f;

    .line 86
    new-instance v0, Lkik/android/util/bp;

    invoke-direct {v0, p0}, Lkik/android/util/bp;-><init>(Lkik/android/util/bo;)V

    iput-object v0, p0, Lkik/android/util/bo;->k:Lcom/kik/g/i;

    .line 105
    new-instance v0, Lkik/android/util/bq;

    invoke-direct {v0, p0}, Lkik/android/util/bq;-><init>(Lkik/android/util/bo;)V

    iput-object v0, p0, Lkik/android/util/bo;->l:Lcom/kik/g/i;

    .line 43
    iput-object p1, p0, Lkik/android/util/bo;->d:Landroid/content/Context;

    .line 44
    iput-object p4, p0, Lkik/android/util/bo;->e:Lcom/kik/android/a;

    .line 45
    iget-object v0, p0, Lkik/android/util/bo;->a:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 46
    iput-object p5, p0, Lkik/android/util/bo;->g:Lkik/a/f/k;

    .line 47
    iput-object p6, p0, Lkik/android/util/bo;->f:Lkik/a/e/n;

    .line 48
    iput-object p3, p0, Lkik/android/util/bo;->h:Lkik/a/e/v;

    .line 49
    iput-object p2, p0, Lkik/android/util/bo;->i:Lkik/a/e/i;

    .line 50
    iput-object p7, p0, Lkik/android/util/bo;->j:Lkik/a/e/t;

    .line 51
    new-instance v0, Lkik/android/util/bl;

    iget-object v1, p0, Lkik/android/util/bo;->a:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    iget-object v5, p0, Lkik/android/util/bo;->g:Lkik/a/f/k;

    iget-object v6, p0, Lkik/android/util/bo;->f:Lkik/a/e/n;

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lkik/android/util/bl;-><init>(Landroid/os/Looper;Lkik/a/e/i;Lkik/a/e/v;Lcom/kik/android/a;Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/t;)V

    iput-object v0, p0, Lkik/android/util/bo;->b:Lkik/android/util/bl;

    .line 52
    iget-object v0, p0, Lkik/android/util/bo;->c:Lcom/kik/g/f;

    invoke-interface/range {p8 .. p8}, Lkik/a/ab;->b()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/util/bo;->l:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 53
    iget-object v0, p0, Lkik/android/util/bo;->c:Lcom/kik/g/f;

    invoke-interface/range {p8 .. p8}, Lkik/a/ab;->a()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/util/bo;->l:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 54
    iget-object v0, p0, Lkik/android/util/bo;->c:Lcom/kik/g/f;

    invoke-interface {p2}, Lkik/a/e/i;->q()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/util/bo;->k:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 55
    return-void
.end method

.method static synthetic a(Lkik/android/util/bo;)Lcom/kik/android/a;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lkik/android/util/bo;->e:Lcom/kik/android/a;

    return-object v0
.end method

.method static synthetic b(Lkik/android/util/bo;)Lkik/a/f/k;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lkik/android/util/bo;->g:Lkik/a/f/k;

    return-object v0
.end method

.method static synthetic c(Lkik/android/util/bo;)Lkik/a/e/n;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lkik/android/util/bo;->f:Lkik/a/e/n;

    return-object v0
.end method

.method static synthetic d(Lkik/android/util/bo;)Lkik/a/e/v;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lkik/android/util/bo;->h:Lkik/a/e/v;

    return-object v0
.end method

.method static synthetic e(Lkik/android/util/bo;)Lkik/a/e/i;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lkik/android/util/bo;->i:Lkik/a/e/i;

    return-object v0
.end method

.method static synthetic f(Lkik/android/util/bo;)Lkik/a/e/t;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lkik/android/util/bo;->j:Lkik/a/e/t;

    return-object v0
.end method

.method static synthetic g(Lkik/android/util/bo;)Lkik/android/util/bl;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lkik/android/util/bo;->b:Lkik/android/util/bl;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lkik/android/util/bo;->c:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 84
    return-void
.end method

.method public final a(Lkik/a/d/s;)V
    .locals 2

    .prologue
    .line 59
    iget-object v0, p0, Lkik/android/util/bo;->b:Lkik/android/util/bl;

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lkik/android/util/bo;->b:Lkik/android/util/bl;

    invoke-virtual {v0}, Lkik/android/util/bl;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 61
    const/16 v1, 0x3ff

    iput v1, v0, Landroid/os/Message;->what:I

    .line 62
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 63
    iget-object v1, p0, Lkik/android/util/bo;->b:Lkik/android/util/bl;

    invoke-virtual {v1, v0}, Lkik/android/util/bl;->sendMessage(Landroid/os/Message;)Z

    .line 65
    :cond_0
    return-void
.end method

.method public final b(Lkik/a/d/s;)V
    .locals 2

    .prologue
    .line 73
    iget-object v0, p0, Lkik/android/util/bo;->b:Lkik/android/util/bl;

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lkik/android/util/bo;->b:Lkik/android/util/bl;

    invoke-virtual {v0}, Lkik/android/util/bl;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 75
    const/16 v1, 0x400

    iput v1, v0, Landroid/os/Message;->what:I

    .line 76
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 77
    iget-object v1, p0, Lkik/android/util/bo;->b:Lkik/android/util/bl;

    invoke-virtual {v1, v0}, Lkik/android/util/bl;->sendMessage(Landroid/os/Message;)Z

    .line 79
    :cond_0
    return-void
.end method

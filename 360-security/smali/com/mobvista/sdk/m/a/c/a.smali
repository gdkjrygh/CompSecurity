.class public final Lcom/mobvista/sdk/m/a/c/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:I

.field public static b:I

.field public static c:I


# instance fields
.field private d:Lcom/mobvista/sdk/m/a/c/d;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const/16 v0, 0xca

    sput v0, Lcom/mobvista/sdk/m/a/c/a;->a:I

    .line 35
    const/16 v0, 0xcb

    sput v0, Lcom/mobvista/sdk/m/a/c/a;->b:I

    .line 36
    const/16 v0, 0xcc

    sput v0, Lcom/mobvista/sdk/m/a/c/a;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    new-instance v0, Lcom/mobvista/sdk/m/a/c/b;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/mobvista/sdk/m/a/c/b;-><init>(Lcom/mobvista/sdk/m/a/c/a;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/c/a;->i:Landroid/os/Handler;

    .line 101
    return-void
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/a/c/a;)Lcom/mobvista/sdk/m/a/c/d;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/c/a;->d:Lcom/mobvista/sdk/m/a/c/d;

    return-object v0
.end method

.method private a()V
    .locals 2

    .prologue
    .line 129
    new-instance v0, Lcom/mobvista/sdk/m/a/c/c;

    invoke-direct {v0, p0}, Lcom/mobvista/sdk/m/a/c/c;-><init>(Lcom/mobvista/sdk/m/a/c/a;)V

    .line 255
    invoke-static {}, Lcom/mobvista/sdk/m/a/e/a;->a()Lcom/mobvista/sdk/m/a/e/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mobvista/sdk/m/a/e/a;->c(Lcom/mobvista/sdk/m/a/e/c;)I

    .line 256
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 105
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 106
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/c/a;->e:Ljava/lang/String;

    .line 107
    iput-object p2, p0, Lcom/mobvista/sdk/m/a/c/a;->f:Ljava/lang/String;

    .line 108
    iput-object p3, p0, Lcom/mobvista/sdk/m/a/c/a;->g:Ljava/lang/String;

    .line 109
    iput-object p4, p0, Lcom/mobvista/sdk/m/a/c/a;->h:Ljava/lang/String;

    .line 110
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/c/a;->a()V

    .line 112
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/c/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/c/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/c/a;->g:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/mobvista/sdk/m/a/c/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/c/a;->h:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f(Lcom/mobvista/sdk/m/a/c/a;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/c/a;->i:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/mobvista/sdk/m/a/c/d;)V
    .locals 0

    .prologue
    .line 122
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/c/a;->d:Lcom/mobvista/sdk/m/a/c/d;

    .line 123
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mobvista/sdk/m/a/c/d;)V
    .locals 0

    .prologue
    .line 116
    invoke-virtual {p0, p5}, Lcom/mobvista/sdk/m/a/c/a;->a(Lcom/mobvista/sdk/m/a/c/d;)V

    .line 117
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/mobvista/sdk/m/a/c/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    return-void
.end method

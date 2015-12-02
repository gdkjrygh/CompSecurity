.class public abstract Lcom/mobvista/sdk/m/a/a/c/a;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field protected a:Z

.field protected b:Landroid/os/Handler;

.field private c:Lcom/mobvista/sdk/m/a/a/c/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Lcom/mobvista/sdk/m/a/a/c/b;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/mobvista/sdk/m/a/a/c/b;-><init>(Lcom/mobvista/sdk/m/a/a/c/a;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/a;->b:Landroid/os/Handler;

    .line 121
    return-void
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/a/a/c/a;)Lcom/mobvista/sdk/m/a/a/c/d;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/c/a;->c:Lcom/mobvista/sdk/m/a/a/c/d;

    return-object v0
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 181
    new-instance v0, Lcom/mobvista/sdk/m/a/a/c/c;

    invoke-direct {v0, p0, p1}, Lcom/mobvista/sdk/m/a/a/c/c;-><init>(Lcom/mobvista/sdk/m/a/a/c/a;I)V

    .line 310
    invoke-static {}, Lcom/mobvista/sdk/m/a/e/a;->a()Lcom/mobvista/sdk/m/a/e/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mobvista/sdk/m/a/e/a;->c(Lcom/mobvista/sdk/m/a/e/c;)I

    .line 313
    return-void
.end method


# virtual methods
.method protected abstract a(Ljava/util/Map;[B)Ljava/lang/Object;
.end method

.method protected abstract a()Ljava/lang/String;
.end method

.method public final a(ILcom/mobvista/sdk/m/a/a/c/d;)V
    .locals 1

    .prologue
    .line 125
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mobvista/sdk/m/a/a/c/a;->a:Z

    .line 127
    if-eqz p2, :cond_0

    .line 128
    iput-object p2, p0, Lcom/mobvista/sdk/m/a/a/c/a;->c:Lcom/mobvista/sdk/m/a/a/c/d;

    .line 131
    :cond_0
    invoke-direct {p0, p1}, Lcom/mobvista/sdk/m/a/a/c/a;->a(I)V

    .line 132
    return-void
.end method

.method public final a(Lcom/mobvista/sdk/m/a/a/c/d;)V
    .locals 0

    .prologue
    .line 135
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/a/c/a;->c:Lcom/mobvista/sdk/m/a/a/c/d;

    .line 136
    return-void
.end method

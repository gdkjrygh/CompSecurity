.class public final Lcom/cm/kinfoc/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/cm/kinfoc/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/cm/kinfoc/a/a",
            "<",
            "Lcom/cm/kinfoc/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 3

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cm/kinfoc/s;->a:Lcom/cm/kinfoc/a/a;

    .line 31
    invoke-static {}, Lcom/cm/kinfoc/q;->b()V

    .line 32
    new-instance v0, Lcom/cm/kinfoc/x;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/cm/kinfoc/x;-><init>(Lcom/cm/kinfoc/s;B)V

    .line 33
    new-instance v1, Lcom/cm/kinfoc/a/c;

    invoke-direct {v1}, Lcom/cm/kinfoc/a/c;-><init>()V

    .line 34
    invoke-virtual {v1}, Lcom/cm/kinfoc/a/c;->b()Lcom/cm/kinfoc/a/c;

    move-result-object v1

    new-instance v2, Lcom/cm/kinfoc/t;

    invoke-direct {v2, p0, v0}, Lcom/cm/kinfoc/t;-><init>(Lcom/cm/kinfoc/s;Lcom/cm/kinfoc/x;)V

    invoke-virtual {v1, v2}, Lcom/cm/kinfoc/a/c;->a(Lcom/cm/kinfoc/a/d;)Lcom/cm/kinfoc/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cm/kinfoc/a/c;->a()Lcom/cm/kinfoc/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/cm/kinfoc/s;->a:Lcom/cm/kinfoc/a/a;

    .line 47
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/cm/kinfoc/s;-><init>()V

    return-void
.end method

.method public static a()Lcom/cm/kinfoc/s;
    .locals 1

    .prologue
    .line 27
    invoke-static {}, Lcom/cm/kinfoc/w;->a()Lcom/cm/kinfoc/s;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/cm/kinfoc/s;Lcom/cm/kinfoc/f;)V
    .locals 1

    .prologue
    .line 17
    .line 1222
    iget-object v0, p0, Lcom/cm/kinfoc/s;->a:Lcom/cm/kinfoc/a/a;

    invoke-virtual {v0, p1}, Lcom/cm/kinfoc/a/a;->a(Ljava/lang/Object;)V

    .line 17
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 166
    if-nez p2, :cond_0

    .line 189
    :goto_0
    return-void

    .line 169
    :cond_0
    invoke-static {}, Lcom/cm/kinfoc/a/g;->a()Lcom/cm/kinfoc/a/g;

    move-result-object v0

    new-instance v1, Lcom/cm/kinfoc/u;

    invoke-direct {v1, p0, p1, p2}, Lcom/cm/kinfoc/u;-><init>(Lcom/cm/kinfoc/s;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/cm/kinfoc/a/g;->a(Lcom/cm/kinfoc/a/j;)V

    goto :goto_0
.end method

.class public final Lcom/cm/kinfoc/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:I

.field private b:Lcom/cm/kinfoc/a/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/cm/kinfoc/a/d",
            "<TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/16 v0, 0x4268

    iput v0, p0, Lcom/cm/kinfoc/a/c;->a:I

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cm/kinfoc/a/c;->b:Lcom/cm/kinfoc/a/d;

    return-void
.end method

.method static synthetic a(Lcom/cm/kinfoc/a/c;)I
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Lcom/cm/kinfoc/a/c;->a:I

    return v0
.end method

.method static synthetic b(Lcom/cm/kinfoc/a/c;)Lcom/cm/kinfoc/a/d;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/cm/kinfoc/a/c;->b:Lcom/cm/kinfoc/a/d;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/cm/kinfoc/a/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/cm/kinfoc/a/a",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 30
    new-instance v0, Lcom/cm/kinfoc/a/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/cm/kinfoc/a/a;-><init>(Lcom/cm/kinfoc/a/c;B)V

    return-object v0
.end method

.method public final a(Lcom/cm/kinfoc/a/d;)Lcom/cm/kinfoc/a/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/cm/kinfoc/a/d",
            "<TE;>;)",
            "Lcom/cm/kinfoc/a/c",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 44
    iput-object p1, p0, Lcom/cm/kinfoc/a/c;->b:Lcom/cm/kinfoc/a/d;

    .line 45
    return-object p0
.end method

.method public final b()Lcom/cm/kinfoc/a/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/cm/kinfoc/a/c",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 38
    const/16 v0, 0x4268

    iput v0, p0, Lcom/cm/kinfoc/a/c;->a:I

    .line 40
    return-object p0
.end method

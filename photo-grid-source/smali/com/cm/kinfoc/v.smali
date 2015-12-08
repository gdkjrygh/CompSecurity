.class final Lcom/cm/kinfoc/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field final synthetic c:Lcom/cm/kinfoc/s;


# direct methods
.method private constructor <init>(Lcom/cm/kinfoc/s;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 225
    iput-object p1, p0, Lcom/cm/kinfoc/v;->c:Lcom/cm/kinfoc/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 226
    iput-object v0, p0, Lcom/cm/kinfoc/v;->a:Ljava/lang/String;

    .line 227
    iput-object v0, p0, Lcom/cm/kinfoc/v;->b:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/cm/kinfoc/s;B)V
    .locals 0

    .prologue
    .line 225
    invoke-direct {p0, p1}, Lcom/cm/kinfoc/v;-><init>(Lcom/cm/kinfoc/s;)V

    return-void
.end method

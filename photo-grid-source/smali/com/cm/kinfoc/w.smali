.class final Lcom/cm/kinfoc/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/cm/kinfoc/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 22
    new-instance v0, Lcom/cm/kinfoc/s;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/cm/kinfoc/s;-><init>(B)V

    sput-object v0, Lcom/cm/kinfoc/w;->a:Lcom/cm/kinfoc/s;

    return-void
.end method

.method static synthetic a()Lcom/cm/kinfoc/s;
    .locals 1

    .prologue
    .line 21
    sget-object v0, Lcom/cm/kinfoc/w;->a:Lcom/cm/kinfoc/s;

    return-object v0
.end method

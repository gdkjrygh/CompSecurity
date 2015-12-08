.class public abstract Lcom/cm/kinfoc/a/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/cm/kinfoc/a/g;


# instance fields
.field protected a:Lcom/cm/kinfoc/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/cm/kinfoc/a/a",
            "<",
            "Lcom/cm/kinfoc/a/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11
    const/4 v0, 0x0

    sput-object v0, Lcom/cm/kinfoc/a/g;->b:Lcom/cm/kinfoc/a/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cm/kinfoc/a/g;->a:Lcom/cm/kinfoc/a/a;

    .line 30
    return-void
.end method

.method public static a()Lcom/cm/kinfoc/a/g;
    .locals 1

    .prologue
    .line 14
    sget-object v0, Lcom/cm/kinfoc/a/g;->b:Lcom/cm/kinfoc/a/g;

    if-nez v0, :cond_0

    .line 15
    const/4 v0, 0x0

    .line 17
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/cm/kinfoc/a/g;->b:Lcom/cm/kinfoc/a/g;

    goto :goto_0
.end method

.method public static a(Lcom/cm/kinfoc/a/g;)V
    .locals 0

    .prologue
    .line 21
    sput-object p0, Lcom/cm/kinfoc/a/g;->b:Lcom/cm/kinfoc/a/g;

    .line 22
    return-void
.end method


# virtual methods
.method public abstract a(Lcom/cm/kinfoc/a/j;)V
.end method

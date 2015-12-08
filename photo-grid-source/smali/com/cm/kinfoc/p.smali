.class public final Lcom/cm/kinfoc/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Ljava/util/regex/Pattern;

.field private static final b:Z


# instance fields
.field private c:Lcom/cm/kinfoc/j;

.field private d:Lcom/cm/kinfoc/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    sget-boolean v0, Lcom/cm/kinfoc/ag;->a:Z

    sput-boolean v0, Lcom/cm/kinfoc/p;->b:Z

    .line 215
    const-string v0, ".*_(\\d+).ich"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/cm/kinfoc/p;->a:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Lcom/cm/kinfoc/j;

    invoke-direct {v0}, Lcom/cm/kinfoc/j;-><init>()V

    iput-object v0, p0, Lcom/cm/kinfoc/p;->c:Lcom/cm/kinfoc/j;

    .line 28
    new-instance v0, Lcom/cm/kinfoc/m;

    invoke-direct {v0}, Lcom/cm/kinfoc/m;-><init>()V

    iput-object v0, p0, Lcom/cm/kinfoc/p;->d:Lcom/cm/kinfoc/m;

    return-void
.end method

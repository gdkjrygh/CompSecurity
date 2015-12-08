.class final Lcom/cm/kinfoc/k;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/cm/kinfoc/j;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/cm/kinfoc/i;

.field private final d:Lcom/cm/kinfoc/d;


# direct methods
.method private constructor <init>(Lcom/cm/kinfoc/j;Lcom/cm/kinfoc/i;Ljava/lang/String;Lcom/cm/kinfoc/d;)V
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lcom/cm/kinfoc/k;->a:Lcom/cm/kinfoc/j;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 78
    iput-object p3, p0, Lcom/cm/kinfoc/k;->b:Ljava/lang/String;

    .line 79
    iput-object p2, p0, Lcom/cm/kinfoc/k;->c:Lcom/cm/kinfoc/i;

    .line 80
    iput-object p4, p0, Lcom/cm/kinfoc/k;->d:Lcom/cm/kinfoc/d;

    .line 81
    return-void
.end method

.method synthetic constructor <init>(Lcom/cm/kinfoc/j;Lcom/cm/kinfoc/i;Ljava/lang/String;Lcom/cm/kinfoc/d;B)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/cm/kinfoc/k;-><init>(Lcom/cm/kinfoc/j;Lcom/cm/kinfoc/i;Ljava/lang/String;Lcom/cm/kinfoc/d;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 85
    iget-object v0, p0, Lcom/cm/kinfoc/k;->c:Lcom/cm/kinfoc/i;

    iget-object v1, p0, Lcom/cm/kinfoc/k;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/cm/kinfoc/k;->d:Lcom/cm/kinfoc/d;

    invoke-static {v0, v1, v2}, Lcom/cm/kinfoc/j;->b(Lcom/cm/kinfoc/i;Ljava/lang/String;Lcom/cm/kinfoc/d;)Z

    .line 86
    return-void
.end method

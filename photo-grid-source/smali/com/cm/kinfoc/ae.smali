.class final Lcom/cm/kinfoc/ae;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/cm/kinfoc/ad;


# direct methods
.method constructor <init>(Lcom/cm/kinfoc/ad;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lcom/cm/kinfoc/ae;->a:Lcom/cm/kinfoc/ad;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 165
    iget-object v0, p0, Lcom/cm/kinfoc/ae;->a:Lcom/cm/kinfoc/ad;

    iget-object v0, v0, Lcom/cm/kinfoc/ad;->a:Lcom/cm/kinfoc/z;

    invoke-virtual {v0}, Lcom/cm/kinfoc/z;->a()V

    .line 168
    iget-object v0, p0, Lcom/cm/kinfoc/ae;->a:Lcom/cm/kinfoc/ad;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cm/kinfoc/ad;->a(Lcom/cm/kinfoc/ad;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 169
    return-void
.end method

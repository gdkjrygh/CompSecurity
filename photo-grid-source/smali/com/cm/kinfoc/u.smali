.class final Lcom/cm/kinfoc/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cm/kinfoc/a/j;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/cm/kinfoc/s;


# direct methods
.method constructor <init>(Lcom/cm/kinfoc/s;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 169
    iput-object p1, p0, Lcom/cm/kinfoc/u;->c:Lcom/cm/kinfoc/s;

    iput-object p2, p0, Lcom/cm/kinfoc/u;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/cm/kinfoc/u;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 4

    .prologue
    .line 173
    if-nez p1, :cond_0

    .line 187
    :goto_0
    return-void

    .line 177
    :cond_0
    new-instance v0, Lcom/cm/kinfoc/f;

    invoke-direct {v0}, Lcom/cm/kinfoc/f;-><init>()V

    .line 178
    const/4 v1, 0x1

    iput v1, v0, Lcom/cm/kinfoc/f;->a:I

    .line 180
    new-instance v1, Lcom/cm/kinfoc/v;

    iget-object v2, p0, Lcom/cm/kinfoc/u;->c:Lcom/cm/kinfoc/s;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/cm/kinfoc/v;-><init>(Lcom/cm/kinfoc/s;B)V

    .line 181
    iget-object v2, p0, Lcom/cm/kinfoc/u;->a:Ljava/lang/String;

    iput-object v2, v1, Lcom/cm/kinfoc/v;->a:Ljava/lang/String;

    .line 182
    iget-object v2, p0, Lcom/cm/kinfoc/u;->b:Ljava/lang/String;

    iput-object v2, v1, Lcom/cm/kinfoc/v;->b:Ljava/lang/String;

    .line 184
    iput-object v1, v0, Lcom/cm/kinfoc/f;->b:Ljava/lang/Object;

    .line 186
    iget-object v1, p0, Lcom/cm/kinfoc/u;->c:Lcom/cm/kinfoc/s;

    invoke-static {v1, v0}, Lcom/cm/kinfoc/s;->a(Lcom/cm/kinfoc/s;Lcom/cm/kinfoc/f;)V

    goto :goto_0
.end method

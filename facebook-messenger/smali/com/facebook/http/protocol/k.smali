.class public Lcom/facebook/http/protocol/k;
.super Ljava/lang/Object;
.source "ApiMethodRunnerImpl.java"

# interfaces
.implements Lcom/facebook/http/protocol/i;


# instance fields
.field private final a:Lcom/facebook/http/protocol/aq;

.field private final b:Lcom/facebook/http/protocol/am;


# direct methods
.method public constructor <init>(Lcom/facebook/http/protocol/aq;Lcom/facebook/http/protocol/am;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/facebook/http/protocol/k;->a:Lcom/facebook/http/protocol/aq;

    .line 19
    iput-object p2, p0, Lcom/facebook/http/protocol/k;->b:Lcom/facebook/http/protocol/am;

    .line 20
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/http/protocol/j;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/http/protocol/k;->b:Lcom/facebook/http/protocol/am;

    invoke-interface {v0}, Lcom/facebook/http/protocol/am;->a()Lcom/facebook/http/protocol/j;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<PARAMS:",
            "Ljava/lang/Object;",
            "RESU",
            "LT:Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/http/protocol/f",
            "<TPARAMS;TRESU",
            "LT;",
            ">;TPARAMS;)TRESU",
            "LT;"
        }
    .end annotation

    .prologue
    .line 26
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/http/protocol/k;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;Lcom/facebook/http/protocol/l;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;Lcom/facebook/http/protocol/l;)Ljava/lang/Object;
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/http/protocol/l;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<PARAMS:",
            "Ljava/lang/Object;",
            "RESU",
            "LT:Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/http/protocol/f",
            "<TPARAMS;TRESU",
            "LT;",
            ">;TPARAMS;",
            "Lcom/facebook/http/protocol/l;",
            ")TRESU",
            "LT;"
        }
    .end annotation

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/http/protocol/k;->a:Lcom/facebook/http/protocol/aq;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;Lcom/facebook/http/protocol/l;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

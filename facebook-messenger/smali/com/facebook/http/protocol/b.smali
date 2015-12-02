.class public abstract Lcom/facebook/http/protocol/b;
.super Ljava/lang/Object;
.source "AbstractSingleMethodRunner.java"

# interfaces
.implements Lcom/facebook/http/protocol/aq;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
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
    .line 16
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/http/protocol/b;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;Lcom/facebook/http/protocol/l;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.class public Lcom/facebook/http/protocol/y;
.super Ljava/lang/Object;
.source "BatchOperation.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<PARAMS:",
        "Ljava/lang/Object;",
        "RESU",
        "LT:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/http/protocol/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/http/protocol/f",
            "<TPARAMS;TRESU",
            "LT;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TPARAMS;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/facebook/http/protocol/z;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/http/protocol/z",
            "<TPARAMS;TRESU",
            "LT;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    invoke-static {p1}, Lcom/facebook/http/protocol/z;->a(Lcom/facebook/http/protocol/z;)Lcom/facebook/http/protocol/f;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/y;->a:Lcom/facebook/http/protocol/f;

    .line 22
    invoke-static {p1}, Lcom/facebook/http/protocol/z;->b(Lcom/facebook/http/protocol/z;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/y;->b:Ljava/lang/Object;

    .line 23
    invoke-static {p1}, Lcom/facebook/http/protocol/z;->c(Lcom/facebook/http/protocol/z;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/y;->c:Ljava/lang/String;

    .line 24
    invoke-static {p1}, Lcom/facebook/http/protocol/z;->d(Lcom/facebook/http/protocol/z;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/y;->d:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public static a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;
    .locals 1
    .param p1    # Ljava/lang/Object;
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
            ">;TPARAMS;)",
            "Lcom/facebook/http/protocol/z",
            "<TPARAMS;TRESU",
            "LT;",
            ">;"
        }
    .end annotation

    .prologue
    .line 29
    new-instance v0, Lcom/facebook/http/protocol/z;

    invoke-direct {v0, p0, p1}, Lcom/facebook/http/protocol/z;-><init>(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/http/protocol/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/http/protocol/f",
            "<TPARAMS;TRESU",
            "LT;",
            ">;"
        }
    .end annotation

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/http/protocol/y;->a:Lcom/facebook/http/protocol/f;

    return-object v0
.end method

.method public b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TPARAMS;"
        }
    .end annotation

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/http/protocol/y;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/http/protocol/y;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/http/protocol/y;->d:Ljava/lang/String;

    return-object v0
.end method

.class Lcom/flurry/sdk/il$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/kj$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/flurry/sdk/kj$a",
        "<[B",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/flurry/sdk/il;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/il;)V
    .locals 0

    .prologue
    .line 245
    iput-object p1, p0, Lcom/flurry/sdk/il$2;->a:Lcom/flurry/sdk/il;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/flurry/sdk/kj;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 245
    check-cast p2, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lcom/flurry/sdk/il$2;->a(Lcom/flurry/sdk/kj;Ljava/lang/Void;)V

    return-void
.end method

.method public a(Lcom/flurry/sdk/kj;Ljava/lang/Void;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/flurry/sdk/kj",
            "<[B",
            "Ljava/lang/Void;",
            ">;",
            "Ljava/lang/Void;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x3

    .line 251
    invoke-virtual {p1}, Lcom/flurry/sdk/kj;->h()I

    move-result v0

    .line 253
    if-lez v0, :cond_1

    .line 255
    const/16 v1, 0xc8

    if-lt v0, v1, :cond_0

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_0

    .line 256
    invoke-static {}, Lcom/flurry/sdk/il;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Pulse logging report sent successfully HTTP response:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v1, v0}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 257
    iget-object v0, p0, Lcom/flurry/sdk/il$2;->a:Lcom/flurry/sdk/il;

    invoke-static {v0}, Lcom/flurry/sdk/il;->a(Lcom/flurry/sdk/il;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 258
    iget-object v0, p0, Lcom/flurry/sdk/il$2;->a:Lcom/flurry/sdk/il;

    invoke-static {v0}, Lcom/flurry/sdk/il;->b(Lcom/flurry/sdk/il;)Lcom/flurry/sdk/jv;

    move-result-object v0

    iget-object v1, p0, Lcom/flurry/sdk/il$2;->a:Lcom/flurry/sdk/il;

    invoke-static {v1}, Lcom/flurry/sdk/il;->a(Lcom/flurry/sdk/il;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jv;->a(Ljava/lang/Object;)V

    .line 266
    :goto_0
    return-void

    .line 260
    :cond_0
    invoke-static {}, Lcom/flurry/sdk/il;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Pulse logging report sent unsuccessfully, HTTP response:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v1, v0}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 264
    :cond_1
    invoke-static {}, Lcom/flurry/sdk/il;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Server Error: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

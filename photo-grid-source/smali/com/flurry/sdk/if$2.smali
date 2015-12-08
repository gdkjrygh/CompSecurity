.class Lcom/flurry/sdk/if$2;
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
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/flurry/sdk/ig;

.field final synthetic b:Lcom/flurry/sdk/ih;

.field final synthetic c:Lcom/flurry/sdk/if;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/if;Lcom/flurry/sdk/ig;Lcom/flurry/sdk/ih;)V
    .locals 0

    .prologue
    .line 121
    iput-object p1, p0, Lcom/flurry/sdk/if$2;->c:Lcom/flurry/sdk/if;

    iput-object p2, p0, Lcom/flurry/sdk/if$2;->a:Lcom/flurry/sdk/ig;

    iput-object p3, p0, Lcom/flurry/sdk/if$2;->b:Lcom/flurry/sdk/ih;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/flurry/sdk/kj;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 121
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/flurry/sdk/if$2;->a(Lcom/flurry/sdk/kj;Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/flurry/sdk/kj;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/flurry/sdk/kj",
            "<[B",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    const/16 v5, 0x12c

    const/4 v4, 0x3

    .line 124
    invoke-static {}, Lcom/flurry/sdk/if;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Pulse report to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/flurry/sdk/if$2;->a:Lcom/flurry/sdk/ig;

    invoke-virtual {v2}, Lcom/flurry/sdk/ig;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/flurry/sdk/if$2;->a:Lcom/flurry/sdk/ig;

    invoke-virtual {v2}, Lcom/flurry/sdk/ig;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", HTTP status code is: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/flurry/sdk/kj;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v0, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 128
    invoke-virtual {p1}, Lcom/flurry/sdk/kj;->h()I

    move-result v0

    .line 130
    iget-object v1, p0, Lcom/flurry/sdk/if$2;->b:Lcom/flurry/sdk/ih;

    invoke-virtual {p1}, Lcom/flurry/sdk/kj;->c()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v1, v2}, Lcom/flurry/sdk/ih;->a(I)V

    .line 131
    iget-object v1, p0, Lcom/flurry/sdk/if$2;->b:Lcom/flurry/sdk/ih;

    iput v0, v1, Lcom/flurry/sdk/ih;->e:I

    .line 134
    invoke-virtual {p1}, Lcom/flurry/sdk/kj;->f()Z

    move-result v1

    if-nez v1, :cond_2

    .line 135
    invoke-virtual {p1}, Lcom/flurry/sdk/kj;->j()Ljava/lang/Exception;

    move-result-object v0

    .line 137
    invoke-virtual {p1}, Lcom/flurry/sdk/kj;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 139
    invoke-virtual {p1}, Lcom/flurry/sdk/kj;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    invoke-static {}, Lcom/flurry/sdk/if;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Timeout occured when trying to connect to: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/flurry/sdk/if$2;->a:Lcom/flurry/sdk/ig;

    invoke-virtual {v2}, Lcom/flurry/sdk/ig;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". Exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/flurry/sdk/kj;->j()Ljava/lang/Exception;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v0, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 149
    :goto_0
    iget-object v0, p0, Lcom/flurry/sdk/if$2;->c:Lcom/flurry/sdk/if;

    iget-object v1, p0, Lcom/flurry/sdk/if$2;->b:Lcom/flurry/sdk/ih;

    iget-object v2, p0, Lcom/flurry/sdk/if$2;->a:Lcom/flurry/sdk/ig;

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/if;->a(Lcom/flurry/sdk/if;Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;)V

    .line 177
    :goto_1
    return-void

    .line 145
    :cond_0
    invoke-static {}, Lcom/flurry/sdk/if;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Manually managed http request timeout occured for: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/flurry/sdk/if$2;->a:Lcom/flurry/sdk/ig;

    invoke-virtual {v2}, Lcom/flurry/sdk/ig;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v0, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 152
    :cond_1
    invoke-static {}, Lcom/flurry/sdk/if;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error occured when trying to connect to: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/flurry/sdk/if$2;->a:Lcom/flurry/sdk/ig;

    invoke-virtual {v3}, Lcom/flurry/sdk/ig;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ". Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v1, v0}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 154
    iget-object v0, p0, Lcom/flurry/sdk/if$2;->c:Lcom/flurry/sdk/if;

    iget-object v1, p0, Lcom/flurry/sdk/if$2;->b:Lcom/flurry/sdk/ih;

    iget-object v2, p0, Lcom/flurry/sdk/if$2;->a:Lcom/flurry/sdk/ig;

    invoke-static {v0, v1, v2, p2}, Lcom/flurry/sdk/if;->a(Lcom/flurry/sdk/if;Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;Ljava/lang/String;)V

    goto :goto_1

    .line 161
    :cond_2
    const/16 v1, 0xc8

    if-lt v0, v1, :cond_3

    if-ge v0, v5, :cond_3

    .line 162
    iget-object v0, p0, Lcom/flurry/sdk/if$2;->c:Lcom/flurry/sdk/if;

    iget-object v1, p0, Lcom/flurry/sdk/if$2;->b:Lcom/flurry/sdk/ih;

    iget-object v2, p0, Lcom/flurry/sdk/if$2;->a:Lcom/flurry/sdk/ig;

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/if;->b(Lcom/flurry/sdk/if;Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;)V

    goto :goto_1

    .line 166
    :cond_3
    if-lt v0, v5, :cond_4

    const/16 v1, 0x190

    if-ge v0, v1, :cond_4

    .line 167
    iget-object v0, p0, Lcom/flurry/sdk/if$2;->c:Lcom/flurry/sdk/if;

    iget-object v1, p0, Lcom/flurry/sdk/if$2;->b:Lcom/flurry/sdk/ih;

    iget-object v2, p0, Lcom/flurry/sdk/if$2;->a:Lcom/flurry/sdk/ig;

    invoke-static {v0, v1, v2, p1}, Lcom/flurry/sdk/if;->a(Lcom/flurry/sdk/if;Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;Lcom/flurry/sdk/kj;)V

    goto :goto_1

    .line 172
    :cond_4
    invoke-static {}, Lcom/flurry/sdk/if;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/flurry/sdk/if$2;->a:Lcom/flurry/sdk/ig;

    invoke-virtual {v2}, Lcom/flurry/sdk/ig;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " report failed sending to : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/flurry/sdk/if$2;->a:Lcom/flurry/sdk/ig;

    invoke-virtual {v2}, Lcom/flurry/sdk/ig;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v0, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 175
    iget-object v0, p0, Lcom/flurry/sdk/if$2;->c:Lcom/flurry/sdk/if;

    iget-object v1, p0, Lcom/flurry/sdk/if$2;->b:Lcom/flurry/sdk/ih;

    iget-object v2, p0, Lcom/flurry/sdk/if$2;->a:Lcom/flurry/sdk/ig;

    invoke-static {v0, v1, v2, p2}, Lcom/flurry/sdk/if;->a(Lcom/flurry/sdk/if;Lcom/flurry/sdk/ih;Lcom/flurry/sdk/ig;Ljava/lang/String;)V

    goto/16 :goto_1
.end method

.class Lcom/flurry/sdk/id$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/jx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/flurry/sdk/jx",
        "<",
        "Lcom/flurry/sdk/jh;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/flurry/sdk/id;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/id;)V
    .locals 0

    .prologue
    .line 146
    iput-object p1, p0, Lcom/flurry/sdk/id$6;->a:Lcom/flurry/sdk/id;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/flurry/sdk/jh;)V
    .locals 1

    .prologue
    .line 149
    iget-boolean v0, p1, Lcom/flurry/sdk/jh;->a:Z

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/flurry/sdk/id$6;->a:Lcom/flurry/sdk/id;

    invoke-static {v0}, Lcom/flurry/sdk/id;->a(Lcom/flurry/sdk/id;)V

    .line 152
    :cond_0
    return-void
.end method

.method public bridge synthetic a(Lcom/flurry/sdk/jw;)V
    .locals 0

    .prologue
    .line 146
    check-cast p1, Lcom/flurry/sdk/jh;

    invoke-virtual {p0, p1}, Lcom/flurry/sdk/id$6;->a(Lcom/flurry/sdk/jh;)V

    return-void
.end method

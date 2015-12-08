.class Lcom/flurry/sdk/ll$1;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/flurry/sdk/ll;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/ll;)V
    .locals 0

    .prologue
    .line 18
    iput-object p1, p0, Lcom/flurry/sdk/ll$1;->a:Lcom/flurry/sdk/ll;

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 21
    new-instance v0, Lcom/flurry/sdk/lj;

    invoke-direct {v0}, Lcom/flurry/sdk/lj;-><init>()V

    .line 22
    invoke-virtual {v0}, Lcom/flurry/sdk/lj;->b()V

    .line 24
    iget-object v0, p0, Lcom/flurry/sdk/ll$1;->a:Lcom/flurry/sdk/ll;

    invoke-static {v0}, Lcom/flurry/sdk/ll;->a(Lcom/flurry/sdk/ll;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flurry/sdk/ll$1;->a:Lcom/flurry/sdk/ll;

    invoke-static {v0}, Lcom/flurry/sdk/ll;->b(Lcom/flurry/sdk/ll;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    iget-object v1, p0, Lcom/flurry/sdk/ll$1;->a:Lcom/flurry/sdk/ll;

    invoke-static {v1}, Lcom/flurry/sdk/ll;->c(Lcom/flurry/sdk/ll;)Lcom/flurry/sdk/lr;

    move-result-object v1

    iget-object v2, p0, Lcom/flurry/sdk/ll$1;->a:Lcom/flurry/sdk/ll;

    invoke-static {v2}, Lcom/flurry/sdk/ll;->d(Lcom/flurry/sdk/ll;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;J)V

    .line 27
    :cond_0
    return-void
.end method

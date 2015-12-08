.class Lcom/flurry/sdk/ko$3;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/flurry/sdk/ko;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/ko;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/flurry/sdk/ko$3;->a:Lcom/flurry/sdk/ko;

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 63
    iget-object v0, p0, Lcom/flurry/sdk/ko$3;->a:Lcom/flurry/sdk/ko;

    iget-object v1, p0, Lcom/flurry/sdk/ko$3;->a:Lcom/flurry/sdk/ko;

    invoke-static {v1}, Lcom/flurry/sdk/ko;->b(Lcom/flurry/sdk/ko;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/ko;->b(Ljava/util/List;)V

    .line 64
    iget-object v0, p0, Lcom/flurry/sdk/ko$3;->a:Lcom/flurry/sdk/ko;

    invoke-static {v0}, Lcom/flurry/sdk/ko;->a(Lcom/flurry/sdk/ko;)V

    .line 65
    return-void
.end method

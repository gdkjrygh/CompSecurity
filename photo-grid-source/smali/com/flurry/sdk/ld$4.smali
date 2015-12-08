.class Lcom/flurry/sdk/ld$4;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/flurry/sdk/lb;

.field final synthetic b:Lcom/flurry/sdk/ld;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/ld;Lcom/flurry/sdk/lb;)V
    .locals 0

    .prologue
    .line 312
    iput-object p1, p0, Lcom/flurry/sdk/ld$4;->b:Lcom/flurry/sdk/ld;

    iput-object p2, p0, Lcom/flurry/sdk/ld$4;->a:Lcom/flurry/sdk/lb;

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 315
    iget-object v0, p0, Lcom/flurry/sdk/ld$4;->b:Lcom/flurry/sdk/ld;

    iget-object v1, p0, Lcom/flurry/sdk/ld$4;->a:Lcom/flurry/sdk/lb;

    invoke-static {v0, v1}, Lcom/flurry/sdk/ld;->a(Lcom/flurry/sdk/ld;Lcom/flurry/sdk/lb;)V

    .line 316
    return-void
.end method

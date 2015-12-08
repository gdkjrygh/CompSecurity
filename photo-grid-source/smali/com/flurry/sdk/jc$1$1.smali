.class Lcom/flurry/sdk/jc$1$1;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/flurry/sdk/jc$1;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/jc$1;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/flurry/sdk/jc$1$1;->a:Lcom/flurry/sdk/jc$1;

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/flurry/sdk/jc$1$1;->a:Lcom/flurry/sdk/jc$1;

    iget-object v0, v0, Lcom/flurry/sdk/jc$1;->a:Lcom/flurry/sdk/jc;

    invoke-static {v0}, Lcom/flurry/sdk/jc;->a(Lcom/flurry/sdk/jc;)V

    .line 87
    return-void
.end method

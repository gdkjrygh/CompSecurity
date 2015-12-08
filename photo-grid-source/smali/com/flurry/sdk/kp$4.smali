.class Lcom/flurry/sdk/kp$4;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/flurry/sdk/kp$a;

.field final synthetic b:Lcom/flurry/sdk/kp;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/kp;Lcom/flurry/sdk/kp$a;)V
    .locals 0

    .prologue
    .line 125
    iput-object p1, p0, Lcom/flurry/sdk/kp$4;->b:Lcom/flurry/sdk/kp;

    iput-object p2, p0, Lcom/flurry/sdk/kp$4;->a:Lcom/flurry/sdk/kp$a;

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/flurry/sdk/kp$4;->b:Lcom/flurry/sdk/kp;

    invoke-virtual {v0}, Lcom/flurry/sdk/kp;->g()V

    .line 130
    iget-object v0, p0, Lcom/flurry/sdk/kp$4;->a:Lcom/flurry/sdk/kp$a;

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/flurry/sdk/kp$4;->a:Lcom/flurry/sdk/kp$a;

    invoke-interface {v0}, Lcom/flurry/sdk/kp$a;->a()V

    .line 133
    :cond_0
    return-void
.end method

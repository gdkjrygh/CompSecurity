.class Lcom/flurry/sdk/iv$2;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/flurry/sdk/iv;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/iv;I)V
    .locals 0

    .prologue
    .line 164
    iput-object p1, p0, Lcom/flurry/sdk/iv$2;->b:Lcom/flurry/sdk/iv;

    iput p2, p0, Lcom/flurry/sdk/iv$2;->a:I

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 168
    iget v0, p0, Lcom/flurry/sdk/iv$2;->a:I

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_0

    .line 169
    invoke-static {}, Lcom/flurry/sdk/hi;->a()Lcom/flurry/sdk/hi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/hi;->f()V

    .line 171
    :cond_0
    return-void
.end method

.class Lcom/flurry/sdk/kb$1$2;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/flurry/sdk/ls;

.field final synthetic b:Lcom/flurry/sdk/kb$1;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/kb$1;Lcom/flurry/sdk/ls;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/flurry/sdk/kb$1$2;->b:Lcom/flurry/sdk/kb$1;

    iput-object p2, p0, Lcom/flurry/sdk/kb$1$2;->a:Lcom/flurry/sdk/ls;

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/flurry/sdk/kb$1$2;->a:Lcom/flurry/sdk/ls;

    invoke-virtual {v0}, Lcom/flurry/sdk/ls;->p()V

    .line 87
    return-void
.end method

.class Lcom/flurry/sdk/id$11;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/flurry/sdk/id;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/id;)V
    .locals 0

    .prologue
    .line 337
    iput-object p1, p0, Lcom/flurry/sdk/id$11;->a:Lcom/flurry/sdk/id;

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 340
    iget-object v0, p0, Lcom/flurry/sdk/id$11;->a:Lcom/flurry/sdk/id;

    invoke-static {v0}, Lcom/flurry/sdk/id;->d(Lcom/flurry/sdk/id;)V

    .line 341
    return-void
.end method

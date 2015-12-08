.class Lcom/flurry/sdk/jy$1;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/flurry/sdk/jx;

.field final synthetic b:Lcom/flurry/sdk/jw;

.field final synthetic c:Lcom/flurry/sdk/jy;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/jy;Lcom/flurry/sdk/jx;Lcom/flurry/sdk/jw;)V
    .locals 0

    .prologue
    .line 135
    iput-object p1, p0, Lcom/flurry/sdk/jy$1;->c:Lcom/flurry/sdk/jy;

    iput-object p2, p0, Lcom/flurry/sdk/jy$1;->a:Lcom/flurry/sdk/jx;

    iput-object p3, p0, Lcom/flurry/sdk/jy$1;->b:Lcom/flurry/sdk/jw;

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 138
    iget-object v0, p0, Lcom/flurry/sdk/jy$1;->a:Lcom/flurry/sdk/jx;

    iget-object v1, p0, Lcom/flurry/sdk/jy$1;->b:Lcom/flurry/sdk/jw;

    invoke-interface {v0, v1}, Lcom/flurry/sdk/jx;->a(Lcom/flurry/sdk/jw;)V

    .line 139
    return-void
.end method

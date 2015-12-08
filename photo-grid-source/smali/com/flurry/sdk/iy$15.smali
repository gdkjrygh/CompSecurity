.class Lcom/flurry/sdk/iy$15;
.super Lcom/flurry/sdk/lr;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/flurry/sdk/iy;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/iy;)V
    .locals 0

    .prologue
    .line 290
    iput-object p1, p0, Lcom/flurry/sdk/iy$15;->a:Lcom/flurry/sdk/iy;

    invoke-direct {p0}, Lcom/flurry/sdk/lr;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 293
    invoke-static {}, Lcom/flurry/sdk/hi;->a()Lcom/flurry/sdk/hi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/hi;->e()Lcom/flurry/sdk/if;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/if;->e()V

    .line 294
    return-void
.end method

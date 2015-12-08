.class Lcom/flurry/sdk/ij$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/flurry/sdk/ij;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/ij;)V
    .locals 0

    .prologue
    .line 318
    iput-object p1, p0, Lcom/flurry/sdk/ij$5;->a:Lcom/flurry/sdk/ij;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 321
    invoke-static {}, Lcom/flurry/sdk/ij;->a()Lcom/flurry/sdk/ij;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/ij;->c()Ljava/util/List;

    move-result-object v0

    .line 323
    sget-object v1, Lcom/flurry/sdk/ij;->d:Lcom/flurry/sdk/jv;

    if-nez v1, :cond_0

    .line 324
    invoke-static {}, Lcom/flurry/sdk/ij;->f()V

    .line 327
    :cond_0
    sget-object v1, Lcom/flurry/sdk/ij;->d:Lcom/flurry/sdk/jv;

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/jv;->a(Ljava/lang/Object;)V

    .line 328
    return-void
.end method

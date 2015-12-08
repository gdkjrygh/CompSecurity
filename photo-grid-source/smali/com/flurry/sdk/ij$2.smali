.class Lcom/flurry/sdk/ij$2;
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
    .line 128
    iput-object p1, p0, Lcom/flurry/sdk/ij$2;->a:Lcom/flurry/sdk/ij;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/flurry/sdk/ij$2;->a:Lcom/flurry/sdk/ij;

    invoke-static {v0}, Lcom/flurry/sdk/ij;->b(Lcom/flurry/sdk/ij;)V

    .line 132
    return-void
.end method

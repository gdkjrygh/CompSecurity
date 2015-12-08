.class Lcom/flurry/sdk/ij$3;
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
    .line 158
    iput-object p1, p0, Lcom/flurry/sdk/ij$3;->a:Lcom/flurry/sdk/ij;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/flurry/sdk/ij$3;->a:Lcom/flurry/sdk/ij;

    invoke-static {v0}, Lcom/flurry/sdk/ij;->b(Lcom/flurry/sdk/ij;)V

    .line 162
    return-void
.end method

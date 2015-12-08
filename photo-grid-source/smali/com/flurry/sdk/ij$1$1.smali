.class Lcom/flurry/sdk/ij$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/flurry/sdk/ij$1;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/ij$1;)V
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lcom/flurry/sdk/ij$1$1;->a:Lcom/flurry/sdk/ij$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 59
    invoke-static {}, Lcom/flurry/sdk/il;->a()Lcom/flurry/sdk/il;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/il;->c()V

    .line 60
    return-void
.end method

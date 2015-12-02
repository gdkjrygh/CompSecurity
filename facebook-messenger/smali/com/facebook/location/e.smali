.class Lcom/facebook/location/e;
.super Ljava/lang/Object;
.source "GeocodingExecutor.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Lcom/facebook/location/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/location/f;

.field final synthetic b:Lcom/facebook/location/d;


# direct methods
.method constructor <init>(Lcom/facebook/location/d;Lcom/facebook/location/f;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lcom/facebook/location/e;->b:Lcom/facebook/location/d;

    iput-object p2, p0, Lcom/facebook/location/e;->a:Lcom/facebook/location/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/location/g;
    .locals 2

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/location/e;->b:Lcom/facebook/location/d;

    iget-object v1, p0, Lcom/facebook/location/e;->a:Lcom/facebook/location/f;

    invoke-static {v0, v1}, Lcom/facebook/location/d;->a(Lcom/facebook/location/d;Lcom/facebook/location/f;)Lcom/facebook/location/g;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 51
    invoke-virtual {p0}, Lcom/facebook/location/e;->a()Lcom/facebook/location/g;

    move-result-object v0

    return-object v0
.end method

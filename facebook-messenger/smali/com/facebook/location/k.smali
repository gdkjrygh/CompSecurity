.class Lcom/facebook/location/k;
.super Ljava/lang/Object;
.source "GetDeviceLocationExecutor.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/location/h;

.field final synthetic b:Lcom/facebook/location/j;


# direct methods
.method constructor <init>(Lcom/facebook/location/j;Lcom/facebook/location/h;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/facebook/location/k;->b:Lcom/facebook/location/j;

    iput-object p2, p0, Lcom/facebook/location/k;->a:Lcom/facebook/location/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 111
    invoke-static {}, Lcom/facebook/location/h;->a()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Registering location updates"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 113
    iget-object v0, p0, Lcom/facebook/location/k;->b:Lcom/facebook/location/j;

    invoke-static {v0}, Lcom/facebook/location/j;->a(Lcom/facebook/location/j;)Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 114
    iget-object v2, p0, Lcom/facebook/location/k;->b:Lcom/facebook/location/j;

    invoke-static {v2, v0}, Lcom/facebook/location/j;->a(Lcom/facebook/location/j;Ljava/lang/String;)V

    goto :goto_0

    .line 116
    :cond_0
    return-void
.end method

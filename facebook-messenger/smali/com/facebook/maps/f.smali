.class Lcom/facebook/maps/f;
.super Ljava/lang/Object;
.source "GoogleMapFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/maps/GoogleMapFragment;


# direct methods
.method constructor <init>(Lcom/facebook/maps/GoogleMapFragment;)V
    .locals 0

    .prologue
    .line 360
    iput-object p1, p0, Lcom/facebook/maps/f;->a:Lcom/facebook/maps/GoogleMapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 363
    iget-object v0, p0, Lcom/facebook/maps/f;->a:Lcom/facebook/maps/GoogleMapFragment;

    invoke-static {v0}, Lcom/facebook/maps/GoogleMapFragment;->c(Lcom/facebook/maps/GoogleMapFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/d/a/ab;

    .line 364
    iget-object v2, p0, Lcom/facebook/maps/f;->a:Lcom/facebook/maps/GoogleMapFragment;

    invoke-static {v2}, Lcom/facebook/maps/GoogleMapFragment;->b(Lcom/facebook/maps/GoogleMapFragment;)Lcom/facebook/maps/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/maps/c;->getLastFix()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    goto :goto_0

    .line 366
    :cond_0
    iget-object v0, p0, Lcom/facebook/maps/f;->a:Lcom/facebook/maps/GoogleMapFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/maps/GoogleMapFragment;->a(Lcom/facebook/maps/GoogleMapFragment;Ljava/util/List;)Ljava/util/List;

    .line 367
    return-void
.end method

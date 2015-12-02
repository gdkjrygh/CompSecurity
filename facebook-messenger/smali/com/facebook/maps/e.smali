.class Lcom/facebook/maps/e;
.super Ljava/lang/Object;
.source "GoogleMapFragment.java"

# interfaces
.implements Lcom/google/android/maps/ItemizedOverlay$OnFocusChangeListener;


# instance fields
.field final synthetic a:Lcom/facebook/maps/GoogleMapFragment;


# direct methods
.method constructor <init>(Lcom/facebook/maps/GoogleMapFragment;)V
    .locals 0

    .prologue
    .line 194
    iput-object p1, p0, Lcom/facebook/maps/e;->a:Lcom/facebook/maps/GoogleMapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChanged(Lcom/google/android/maps/ItemizedOverlay;Lcom/google/android/maps/OverlayItem;)V
    .locals 1

    .prologue
    .line 197
    check-cast p2, Lcom/facebook/maps/i;

    .line 198
    iget-object v0, p0, Lcom/facebook/maps/e;->a:Lcom/facebook/maps/GoogleMapFragment;

    invoke-static {v0, p2}, Lcom/facebook/maps/GoogleMapFragment;->a(Lcom/facebook/maps/GoogleMapFragment;Lcom/facebook/maps/i;)V

    .line 199
    iget-object v0, p0, Lcom/facebook/maps/e;->a:Lcom/facebook/maps/GoogleMapFragment;

    invoke-static {v0}, Lcom/facebook/maps/GoogleMapFragment;->a(Lcom/facebook/maps/GoogleMapFragment;)Lcom/facebook/maps/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/maps/a;->invalidate()V

    .line 200
    return-void
.end method

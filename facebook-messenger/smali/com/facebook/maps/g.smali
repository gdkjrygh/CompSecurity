.class Lcom/facebook/maps/g;
.super Lcom/google/android/maps/ItemizedOverlay;
.source "GoogleMapFragment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/maps/ItemizedOverlay",
        "<",
        "Lcom/google/android/maps/OverlayItem;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Z

.field private b:Lcom/facebook/maps/m;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/maps/OverlayItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Z)V
    .locals 1

    .prologue
    .line 603
    invoke-direct {p0, p1}, Lcom/google/android/maps/ItemizedOverlay;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 600
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/maps/g;->c:Ljava/util/List;

    .line 604
    invoke-virtual {p0}, Lcom/facebook/maps/g;->populate()V

    .line 605
    iput-boolean p2, p0, Lcom/facebook/maps/g;->a:Z

    .line 606
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/maps/m;)V
    .locals 0

    .prologue
    .line 630
    iput-object p1, p0, Lcom/facebook/maps/g;->b:Lcom/facebook/maps/m;

    .line 631
    return-void
.end method

.method public a(Lcom/google/android/maps/OverlayItem;)V
    .locals 1

    .prologue
    .line 609
    iget-object v0, p0, Lcom/facebook/maps/g;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 614
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/maps/g;->setFocus(Lcom/google/android/maps/OverlayItem;)V

    .line 615
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/facebook/maps/g;->setLastFocusedIndex(I)V

    .line 616
    invoke-virtual {p0}, Lcom/facebook/maps/g;->populate()V

    .line 617
    return-void
.end method

.method protected createItem(I)Lcom/google/android/maps/OverlayItem;
    .locals 1

    .prologue
    .line 648
    iget-object v0, p0, Lcom/facebook/maps/g;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/maps/OverlayItem;

    return-object v0
.end method

.method public draw(Landroid/graphics/Canvas;Lcom/google/android/maps/MapView;Z)V
    .locals 1

    .prologue
    .line 635
    if-eqz p3, :cond_0

    iget-boolean v0, p0, Lcom/facebook/maps/g;->a:Z

    if-nez v0, :cond_0

    .line 639
    :goto_0
    return-void

    .line 638
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/maps/ItemizedOverlay;->draw(Landroid/graphics/Canvas;Lcom/google/android/maps/MapView;Z)V

    goto :goto_0
.end method

.method protected onTap(I)Z
    .locals 1

    .prologue
    .line 653
    invoke-super {p0, p1}, Lcom/google/android/maps/ItemizedOverlay;->onTap(I)Z

    .line 654
    const/4 v0, 0x1

    return v0
.end method

.method public onTap(Lcom/google/android/maps/GeoPoint;Lcom/google/android/maps/MapView;)Z
    .locals 1

    .prologue
    .line 659
    invoke-super {p0, p1, p2}, Lcom/google/android/maps/ItemizedOverlay;->onTap(Lcom/google/android/maps/GeoPoint;Lcom/google/android/maps/MapView;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 661
    iget-object v0, p0, Lcom/facebook/maps/g;->b:Lcom/facebook/maps/m;

    if-eqz v0, :cond_0

    .line 662
    iget-object v0, p0, Lcom/facebook/maps/g;->b:Lcom/facebook/maps/m;

    invoke-interface {v0}, Lcom/facebook/maps/m;->a()V

    .line 663
    const/4 v0, 0x1

    .line 667
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 643
    iget-object v0, p0, Lcom/facebook/maps/g;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

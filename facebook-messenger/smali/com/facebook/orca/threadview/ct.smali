.class Lcom/facebook/orca/threadview/ct;
.super Lcom/google/android/maps/ItemizedOverlay;
.source "ThreadViewMapActivityImpl.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/cv;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 345
    iput-object p1, p0, Lcom/facebook/orca/threadview/ct;->a:Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;

    .line 346
    invoke-static {p2}, Lcom/facebook/orca/threadview/ct;->boundCenterBottom(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/maps/ItemizedOverlay;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 343
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ct;->b:Ljava/util/List;

    .line 347
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 368
    iget-object v0, p0, Lcom/facebook/orca/threadview/ct;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 369
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/cv;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 360
    iget-object v0, p0, Lcom/facebook/orca/threadview/ct;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 361
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ct;->populate()V

    .line 362
    return-void
.end method

.method protected createItem(I)Lcom/google/android/maps/OverlayItem;
    .locals 1

    .prologue
    .line 351
    iget-object v0, p0, Lcom/facebook/orca/threadview/ct;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/maps/OverlayItem;

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 356
    iget-object v0, p0, Lcom/facebook/orca/threadview/ct;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

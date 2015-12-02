.class public Lcom/facebook/maps/a;
.super Lcom/google/android/maps/MapView;
.source "FacebookMapView.java"


# instance fields
.field private a:Lcom/google/android/maps/GeoPoint;

.field private b:Lcom/facebook/maps/n;

.field private c:Lcom/google/android/maps/GeoPoint;

.field private d:Z

.field private e:I

.field private f:Lcom/facebook/common/executors/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 30
    invoke-direct {p0, p1, p2}, Lcom/google/android/maps/MapView;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 31
    new-instance v0, Lcom/google/android/maps/GeoPoint;

    invoke-direct {v0, v1, v1}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    iput-object v0, p0, Lcom/facebook/maps/a;->a:Lcom/google/android/maps/GeoPoint;

    .line 32
    new-instance v0, Lcom/google/android/maps/GeoPoint;

    invoke-direct {v0, v1, v1}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    iput-object v0, p0, Lcom/facebook/maps/a;->c:Lcom/google/android/maps/GeoPoint;

    .line 33
    invoke-virtual {p0}, Lcom/facebook/maps/a;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 34
    const-class v1, Lcom/facebook/common/executors/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/a;

    iput-object v0, p0, Lcom/facebook/maps/a;->f:Lcom/facebook/common/executors/a;

    .line 35
    return-void
.end method

.method static synthetic a(Lcom/facebook/maps/a;)Lcom/facebook/maps/n;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/maps/a;->b:Lcom/facebook/maps/n;

    return-object v0
.end method


# virtual methods
.method public computeScroll()V
    .locals 2

    .prologue
    .line 78
    invoke-super {p0}, Lcom/google/android/maps/MapView;->computeScroll()V

    .line 79
    invoke-virtual {p0}, Lcom/facebook/maps/a;->getMapCenter()Lcom/google/android/maps/GeoPoint;

    move-result-object v0

    .line 84
    iget-boolean v1, p0, Lcom/facebook/maps/a;->d:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/facebook/maps/a;->c:Lcom/google/android/maps/GeoPoint;

    invoke-virtual {v1, v0}, Lcom/google/android/maps/GeoPoint;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 85
    iget-object v0, p0, Lcom/facebook/maps/a;->b:Lcom/facebook/maps/n;

    if-eqz v0, :cond_0

    .line 86
    iget-object v0, p0, Lcom/facebook/maps/a;->b:Lcom/facebook/maps/n;

    invoke-interface {v0}, Lcom/facebook/maps/n;->a()V

    .line 88
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/maps/a;->d:Z

    .line 92
    :goto_0
    return-void

    .line 90
    :cond_1
    iput-object v0, p0, Lcom/facebook/maps/a;->c:Lcom/google/android/maps/GeoPoint;

    goto :goto_0
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 43
    invoke-super {p0, p1}, Lcom/google/android/maps/MapView;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 44
    invoke-virtual {p0}, Lcom/facebook/maps/a;->getZoomLevel()I

    move-result v0

    .line 45
    iget v1, p0, Lcom/facebook/maps/a;->e:I

    if-eq v0, v1, :cond_0

    .line 46
    iput v0, p0, Lcom/facebook/maps/a;->e:I

    .line 47
    iget-object v0, p0, Lcom/facebook/maps/a;->b:Lcom/facebook/maps/n;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/maps/a;->d:Z

    if-nez v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/facebook/maps/a;->f:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/maps/b;

    invoke-direct {v1, p0}, Lcom/facebook/maps/b;-><init>(Lcom/facebook/maps/a;)V

    const-wide/16 v2, 0x1f4

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/common/executors/a;->a(Ljava/lang/Runnable;J)V

    .line 62
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 66
    invoke-virtual {p0}, Lcom/facebook/maps/a;->getMapCenter()Lcom/google/android/maps/GeoPoint;

    move-result-object v2

    .line 67
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-nez v3, :cond_1

    .line 68
    iput-object v2, p0, Lcom/facebook/maps/a;->a:Lcom/google/android/maps/GeoPoint;

    .line 69
    iput-boolean v1, p0, Lcom/facebook/maps/a;->d:Z

    .line 73
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Lcom/google/android/maps/MapView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 70
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-ne v3, v0, :cond_0

    .line 71
    iget-object v3, p0, Lcom/facebook/maps/a;->a:Lcom/google/android/maps/GeoPoint;

    invoke-virtual {v3, v2}, Lcom/google/android/maps/GeoPoint;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :goto_1
    iput-boolean v0, p0, Lcom/facebook/maps/a;->d:Z

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method public setOnMovementListener(Lcom/facebook/maps/n;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/facebook/maps/a;->b:Lcom/facebook/maps/n;

    .line 39
    return-void
.end method

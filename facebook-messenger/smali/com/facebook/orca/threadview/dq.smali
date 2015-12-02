.class public Lcom/facebook/orca/threadview/dq;
.super Lcom/google/android/maps/Overlay;
.source "ZoomOverlay.java"


# instance fields
.field private final a:Landroid/view/GestureDetector;

.field private final b:Lcom/google/android/maps/MapView;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/maps/MapView;)V
    .locals 3

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/google/android/maps/Overlay;-><init>()V

    .line 22
    new-instance v0, Lcom/facebook/orca/threadview/dr;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadview/dr;-><init>(Lcom/facebook/orca/threadview/dq;)V

    .line 28
    new-instance v1, Lcom/facebook/orca/threadview/ds;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/ds;-><init>(Lcom/facebook/orca/threadview/dq;)V

    .line 34
    iput-object p2, p0, Lcom/facebook/orca/threadview/dq;->b:Lcom/google/android/maps/MapView;

    .line 35
    new-instance v2, Landroid/view/GestureDetector;

    invoke-direct {v2, p1, v0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v2, p0, Lcom/facebook/orca/threadview/dq;->a:Landroid/view/GestureDetector;

    .line 36
    iget-object v2, p0, Lcom/facebook/orca/threadview/dq;->a:Landroid/view/GestureDetector;

    invoke-virtual {v2, v0}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    .line 37
    invoke-virtual {p2, v1}, Lcom/google/android/maps/MapView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 38
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/dq;)Landroid/view/GestureDetector;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/facebook/orca/threadview/dq;->a:Landroid/view/GestureDetector;

    return-object v0
.end method

.method private a(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/orca/threadview/dq;->b:Lcom/google/android/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/maps/MapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/maps/MapController;->zoomInFixing(II)Z

    .line 47
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/dq;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/dq;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public onTouchEvent(Landroid/view/MotionEvent;Lcom/google/android/maps/MapView;)Z
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/orca/threadview/dq;->a:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

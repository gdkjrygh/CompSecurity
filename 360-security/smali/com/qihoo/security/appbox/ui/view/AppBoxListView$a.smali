.class Lcom/qihoo/security/appbox/ui/view/AppBoxListView$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/appbox/ui/view/AppBoxListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/appbox/ui/view/AppBoxListView;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/ui/view/AppBoxListView;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/qihoo/security/appbox/ui/view/AppBoxListView$a;->a:Lcom/qihoo/security/appbox/ui/view/AppBoxListView;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 88
    cmpl-float v0, p4, v1

    if-eqz v0, :cond_0

    cmpl-float v0, p3, v1

    if-eqz v0, :cond_0

    .line 91
    :cond_0
    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    .line 92
    const/4 v0, 0x1

    .line 94
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

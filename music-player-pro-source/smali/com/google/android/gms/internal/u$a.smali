.class final Lcom/google/android/gms/internal/u$a;
.super Landroid/widget/ViewSwitcher;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final lJ:Lcom/google/android/gms/internal/gl;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/ViewSwitcher;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/internal/gl;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/gl;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/u$a;->lJ:Lcom/google/android/gms/internal/gl;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/u$a;)Lcom/google/android/gms/internal/gl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/u$a;->lJ:Lcom/google/android/gms/internal/gl;

    return-object v0
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/MotionEvent;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/u$a;->lJ:Lcom/google/android/gms/internal/gl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/gl;->c(Landroid/view/MotionEvent;)V

    const/4 v0, 0x0

    return v0
.end method

.class final Lcom/google/android/gms/internal/r$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final adUnitId:Ljava/lang/String;

.field public final ec:Landroid/widget/ViewSwitcher;

.field public final ed:Lcom/google/android/gms/internal/x;

.field public final ee:Landroid/content/Context;

.field public final ef:Lcom/google/android/gms/internal/h;

.field public final eg:Lcom/google/android/gms/internal/co;

.field public eh:Lcom/google/android/gms/internal/ab;

.field public ei:Lcom/google/android/gms/internal/cg;

.field public ej:Lcom/google/android/gms/internal/ce;

.field public ek:Lcom/google/android/gms/internal/ae;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/x;Ljava/lang/String;Lcom/google/android/gms/internal/co;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p2, Lcom/google/android/gms/internal/x;->ex:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/internal/r$a;->ed:Lcom/google/android/gms/internal/x;

    iput-object p3, p0, Lcom/google/android/gms/internal/r$a;->adUnitId:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/r$a;->ee:Landroid/content/Context;

    new-instance v0, Lcom/google/android/gms/internal/h;

    iget-object v1, p4, Lcom/google/android/gms/internal/co;->hP:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/g;->a(Ljava/lang/String;Landroid/content/Context;)Lcom/google/android/gms/internal/g;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/h;-><init>(Lcom/google/android/gms/internal/d;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/r$a;->ef:Lcom/google/android/gms/internal/h;

    iput-object p4, p0, Lcom/google/android/gms/internal/r$a;->eg:Lcom/google/android/gms/internal/co;

    return-void

    :cond_0
    new-instance v0, Landroid/widget/ViewSwitcher;

    invoke-direct {v0, p1}, Landroid/widget/ViewSwitcher;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    iget-object v0, p0, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    iget v1, p2, Lcom/google/android/gms/internal/x;->widthPixels:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewSwitcher;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    iget v1, p2, Lcom/google/android/gms/internal/x;->heightPixels:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewSwitcher;->setMinimumHeight(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/r$a;->ec:Landroid/widget/ViewSwitcher;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ViewSwitcher;->setVisibility(I)V

    goto :goto_0
.end method

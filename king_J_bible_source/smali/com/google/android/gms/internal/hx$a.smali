.class final Lcom/google/android/gms/internal/hx$a;
.super Lcom/google/android/gms/internal/ff$b;

# interfaces
.implements Lcom/google/android/gms/panorama/PanoramaApi$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/hx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ff",
        "<",
        "Lcom/google/android/gms/internal/hv;",
        ">.b<",
        "Lcom/google/android/gms/common/api/a$d",
        "<",
        "Lcom/google/android/gms/panorama/PanoramaApi$a;",
        ">;>;",
        "Lcom/google/android/gms/panorama/PanoramaApi$a;"
    }
.end annotation


# instance fields
.field public final TC:Lcom/google/android/gms/common/api/Status;

.field public final TD:Landroid/content/Intent;

.field final synthetic TE:Lcom/google/android/gms/internal/hx;

.field public final type:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/hx;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/api/Status;ILandroid/content/Intent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/panorama/PanoramaApi$a;",
            ">;",
            "Lcom/google/android/gms/common/api/Status;",
            "I",
            "Landroid/content/Intent;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/hx$a;->TE:Lcom/google/android/gms/internal/hx;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ff$b;-><init>(Lcom/google/android/gms/internal/ff;Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/hx$a;->TC:Lcom/google/android/gms/common/api/Status;

    iput p4, p0, Lcom/google/android/gms/internal/hx$a;->type:I

    iput-object p5, p0, Lcom/google/android/gms/internal/hx$a;->TD:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method protected synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/common/api/a$d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/hx$a;->c(Lcom/google/android/gms/common/api/a$d;)V

    return-void
.end method

.method protected c(Lcom/google/android/gms/common/api/a$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/panorama/PanoramaApi$a;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1, p0}, Lcom/google/android/gms/common/api/a$d;->b(Ljava/lang/Object;)V

    return-void
.end method

.method protected dx()V
    .locals 0

    return-void
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hx$a;->TC:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public getViewerIntent()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hx$a;->TD:Landroid/content/Intent;

    return-object v0
.end method

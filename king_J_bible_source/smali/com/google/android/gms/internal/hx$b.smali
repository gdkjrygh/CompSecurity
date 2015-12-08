.class final Lcom/google/android/gms/internal/hx$b;
.super Lcom/google/android/gms/internal/hu$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/hx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field final synthetic TE:Lcom/google/android/gms/internal/hx;

.field private final TF:Lcom/google/android/gms/common/api/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/panorama/PanoramaApi$a;",
            ">;"
        }
    .end annotation
.end field

.field private final TG:Lcom/google/android/gms/common/api/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/panorama/PanoramaApi$PanoramaResult;",
            ">;"
        }
    .end annotation
.end field

.field private final TH:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/hx;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/api/a$d;Landroid/net/Uri;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/panorama/PanoramaApi$a;",
            ">;",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/panorama/PanoramaApi$PanoramaResult;",
            ">;",
            "Landroid/net/Uri;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/hx$b;->TE:Lcom/google/android/gms/internal/hx;

    invoke-direct {p0}, Lcom/google/android/gms/internal/hu$a;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/hx$b;->TF:Lcom/google/android/gms/common/api/a$d;

    iput-object p3, p0, Lcom/google/android/gms/internal/hx$b;->TG:Lcom/google/android/gms/common/api/a$d;

    iput-object p4, p0, Lcom/google/android/gms/internal/hx$b;->TH:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public a(ILandroid/os/Bundle;ILandroid/content/Intent;)V
    .locals 7

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/hx$b;->TH:Landroid/net/Uri;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hx$b;->TE:Lcom/google/android/gms/internal/hx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hx;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/hx$b;->TH:Landroid/net/Uri;

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->revokeUriPermission(Landroid/net/Uri;I)V

    :cond_0
    if-eqz p2, :cond_3

    const-string v0, "pendingIntent"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    :goto_0
    new-instance v3, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v3, p1, v1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hx$b;->TG:Lcom/google/android/gms/common/api/a$d;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/hx$b;->TE:Lcom/google/android/gms/internal/hx;

    new-instance v1, Lcom/google/android/gms/internal/hx$c;

    iget-object v2, p0, Lcom/google/android/gms/internal/hx$b;->TE:Lcom/google/android/gms/internal/hx;

    iget-object v4, p0, Lcom/google/android/gms/internal/hx$b;->TG:Lcom/google/android/gms/common/api/a$d;

    invoke-direct {v1, v2, v4, v3, p4}, Lcom/google/android/gms/internal/hx$c;-><init>(Lcom/google/android/gms/internal/hx;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/api/Status;Landroid/content/Intent;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hx;->a(Lcom/google/android/gms/internal/ff$b;)V

    :cond_1
    :goto_1
    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/hx$b;->TF:Lcom/google/android/gms/common/api/a$d;

    if-eqz v0, :cond_1

    iget-object v6, p0, Lcom/google/android/gms/internal/hx$b;->TE:Lcom/google/android/gms/internal/hx;

    new-instance v0, Lcom/google/android/gms/internal/hx$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/hx$b;->TE:Lcom/google/android/gms/internal/hx;

    iget-object v2, p0, Lcom/google/android/gms/internal/hx$b;->TF:Lcom/google/android/gms/common/api/a$d;

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hx$a;-><init>(Lcom/google/android/gms/internal/hx;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/api/Status;ILandroid/content/Intent;)V

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/hx;->a(Lcom/google/android/gms/internal/ff$b;)V

    goto :goto_1

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

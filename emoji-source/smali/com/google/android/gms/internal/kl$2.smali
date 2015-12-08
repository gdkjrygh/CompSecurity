.class Lcom/google/android/gms/internal/kl$2;
.super Lcom/google/android/gms/internal/kl$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/kl;->load(Lcom/google/android/gms/common/api/GoogleApiClient;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic PM:I

.field final synthetic ace:Lcom/google/android/gms/internal/kl;

.field final synthetic acf:Ljava/lang/String;

.field final synthetic acg:Landroid/net/Uri;

.field final synthetic ach:Ljava/lang/String;

.field final synthetic aci:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/kl;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/kl$2;->ace:Lcom/google/android/gms/internal/kl;

    iput p2, p0, Lcom/google/android/gms/internal/kl$2;->PM:I

    iput-object p3, p0, Lcom/google/android/gms/internal/kl$2;->acf:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/kl$2;->acg:Landroid/net/Uri;

    iput-object p5, p0, Lcom/google/android/gms/internal/kl$2;->ach:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/kl$2;->aci:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/kl$a;-><init>(Lcom/google/android/gms/internal/kl$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/Api$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/plus/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/kl$2;->a(Lcom/google/android/gms/plus/internal/e;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/plus/internal/e;)V
    .locals 7

    iget v2, p0, Lcom/google/android/gms/internal/kl$2;->PM:I

    iget-object v3, p0, Lcom/google/android/gms/internal/kl$2;->acf:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/kl$2;->acg:Landroid/net/Uri;

    iget-object v5, p0, Lcom/google/android/gms/internal/kl$2;->ach:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/kl$2;->aci:Ljava/lang/String;

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/plus/internal/e;->a(Lcom/google/android/gms/common/api/a$d;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.class final Lcom/google/android/gms/internal/cw$g;
.super Lcom/google/android/gms/internal/cv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/cw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "g"
.end annotation


# instance fields
.field final synthetic iB:Lcom/google/android/gms/internal/cw;

.field private final iG:Lcom/google/android/gms/appstate/OnSignOutCompleteListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/cw;Lcom/google/android/gms/appstate/OnSignOutCompleteListener;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/cw$g;->iB:Lcom/google/android/gms/internal/cw;

    invoke-direct {p0}, Lcom/google/android/gms/internal/cv;-><init>()V

    const-string v0, "Listener must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/dm;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/appstate/OnSignOutCompleteListener;

    iput-object v0, p0, Lcom/google/android/gms/internal/cw$g;->iG:Lcom/google/android/gms/appstate/OnSignOutCompleteListener;

    return-void
.end method


# virtual methods
.method public onSignOutComplete()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/cw$g;->iB:Lcom/google/android/gms/internal/cw;

    new-instance v1, Lcom/google/android/gms/internal/cw$h;

    iget-object v2, p0, Lcom/google/android/gms/internal/cw$g;->iB:Lcom/google/android/gms/internal/cw;

    iget-object v3, p0, Lcom/google/android/gms/internal/cw$g;->iG:Lcom/google/android/gms/appstate/OnSignOutCompleteListener;

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/cw$h;-><init>(Lcom/google/android/gms/internal/cw;Lcom/google/android/gms/appstate/OnSignOutCompleteListener;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/cw;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

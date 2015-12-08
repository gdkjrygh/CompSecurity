.class final Lcom/google/android/gms/internal/cw$a;
.super Lcom/google/android/gms/internal/cv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/cw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final iA:Lcom/google/android/gms/appstate/OnStateDeletedListener;

.field final synthetic iB:Lcom/google/android/gms/internal/cw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/cw;Lcom/google/android/gms/appstate/OnStateDeletedListener;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/cw$a;->iB:Lcom/google/android/gms/internal/cw;

    invoke-direct {p0}, Lcom/google/android/gms/internal/cv;-><init>()V

    const-string v0, "Listener must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/dm;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/appstate/OnStateDeletedListener;

    iput-object v0, p0, Lcom/google/android/gms/internal/cw$a;->iA:Lcom/google/android/gms/appstate/OnStateDeletedListener;

    return-void
.end method


# virtual methods
.method public onStateDeleted(II)V
    .locals 4
    .param p1, "statusCode"    # I
    .param p2, "stateKey"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/cw$a;->iB:Lcom/google/android/gms/internal/cw;

    new-instance v1, Lcom/google/android/gms/internal/cw$b;

    iget-object v2, p0, Lcom/google/android/gms/internal/cw$a;->iB:Lcom/google/android/gms/internal/cw;

    iget-object v3, p0, Lcom/google/android/gms/internal/cw$a;->iA:Lcom/google/android/gms/appstate/OnStateDeletedListener;

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/internal/cw$b;-><init>(Lcom/google/android/gms/internal/cw;Lcom/google/android/gms/appstate/OnStateDeletedListener;II)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/cw;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

.class final Lcom/google/android/gms/internal/cw$c;
.super Lcom/google/android/gms/internal/cv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/cw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "c"
.end annotation


# instance fields
.field final synthetic iB:Lcom/google/android/gms/internal/cw;

.field private final iE:Lcom/google/android/gms/appstate/OnStateListLoadedListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/cw;Lcom/google/android/gms/appstate/OnStateListLoadedListener;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/cw$c;->iB:Lcom/google/android/gms/internal/cw;

    invoke-direct {p0}, Lcom/google/android/gms/internal/cv;-><init>()V

    const-string v0, "Listener must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/dm;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/appstate/OnStateListLoadedListener;

    iput-object v0, p0, Lcom/google/android/gms/internal/cw$c;->iE:Lcom/google/android/gms/appstate/OnStateListLoadedListener;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/data/d;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/cw$c;->iB:Lcom/google/android/gms/internal/cw;

    new-instance v1, Lcom/google/android/gms/internal/cw$d;

    iget-object v2, p0, Lcom/google/android/gms/internal/cw$c;->iB:Lcom/google/android/gms/internal/cw;

    iget-object v3, p0, Lcom/google/android/gms/internal/cw$c;->iE:Lcom/google/android/gms/appstate/OnStateListLoadedListener;

    invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/internal/cw$d;-><init>(Lcom/google/android/gms/internal/cw;Lcom/google/android/gms/appstate/OnStateListLoadedListener;Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/cw;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method

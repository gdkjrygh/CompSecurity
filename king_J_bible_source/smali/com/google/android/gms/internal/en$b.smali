.class Lcom/google/android/gms/internal/en$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/en;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic zu:Lcom/google/android/gms/internal/en;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/en;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/en$b;->zu:Lcom/google/android/gms/internal/en;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/en;Lcom/google/android/gms/internal/en$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/en$b;-><init>(Lcom/google/android/gms/internal/en;)V

    return-void
.end method


# virtual methods
.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1
    .param p1, "result"    # Lcom/google/android/gms/common/ConnectionResult;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/en$b;->zu:Lcom/google/android/gms/internal/en;

    invoke-static {v0}, Lcom/google/android/gms/internal/en;->i(Lcom/google/android/gms/internal/en;)V

    return-void
.end method

.class Lcom/google/android/gms/internal/k$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private ka:Ljava/lang/String;

.field private kb:Z

.field final synthetic kc:Lcom/google/android/gms/internal/k;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/k;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/k$a;->kc:Lcom/google/android/gms/internal/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/k$a;->ka:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/k$a;->kb:Z

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/k$a;->ka:Ljava/lang/String;

    return-object v0
.end method

.method public isLimitAdTrackingEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/k$a;->kb:Z

    return v0
.end method

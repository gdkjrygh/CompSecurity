.class Lcom/google/android/gms/internal/j$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private kd:Ljava/lang/String;

.field private ke:Z

.field final synthetic kf:Lcom/google/android/gms/internal/j;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/j;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/j$a;->kf:Lcom/google/android/gms/internal/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/j$a;->kd:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/j$a;->ke:Z

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/j$a;->kd:Ljava/lang/String;

    return-object v0
.end method

.method public isLimitAdTrackingEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/j$a;->ke:Z

    return v0
.end method

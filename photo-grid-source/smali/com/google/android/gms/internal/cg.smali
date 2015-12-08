.class final Lcom/google/android/gms/internal/cg;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/google/android/gms/internal/cl;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ce;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ce;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/cg;->a:Lcom/google/android/gms/internal/ce;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .prologue
    .line 0
    check-cast p1, Lcom/google/android/gms/internal/cl;

    check-cast p2, Lcom/google/android/gms/internal/cl;

    .line 1000
    iget-wide v0, p1, Lcom/google/android/gms/internal/cl;->a:J

    iget-wide v2, p2, Lcom/google/android/gms/internal/cl;->a:J

    sub-long/2addr v0, v2

    long-to-int v0, v0

    .line 0
    return v0
.end method

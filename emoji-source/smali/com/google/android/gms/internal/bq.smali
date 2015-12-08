.class public final Lcom/google/android/gms/internal/bq;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/bq$a;
    }
.end annotation


# instance fields
.field public final nL:I

.field public final nM:Lcom/google/android/gms/internal/bl;

.field public final nN:Lcom/google/android/gms/internal/bu;

.field public final nO:Ljava/lang/String;

.field public final nP:Lcom/google/android/gms/internal/bo;


# direct methods
.method public constructor <init>(I)V
    .locals 6

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/bq;-><init>(Lcom/google/android/gms/internal/bl;Lcom/google/android/gms/internal/bu;Ljava/lang/String;Lcom/google/android/gms/internal/bo;I)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/bl;Lcom/google/android/gms/internal/bu;Ljava/lang/String;Lcom/google/android/gms/internal/bo;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/bq;->nM:Lcom/google/android/gms/internal/bl;

    iput-object p2, p0, Lcom/google/android/gms/internal/bq;->nN:Lcom/google/android/gms/internal/bu;

    iput-object p3, p0, Lcom/google/android/gms/internal/bq;->nO:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/bq;->nP:Lcom/google/android/gms/internal/bo;

    iput p5, p0, Lcom/google/android/gms/internal/bq;->nL:I

    return-void
.end method

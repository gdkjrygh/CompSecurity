.class public final Lcom/google/android/gms/internal/cv;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/cv$a;
    }
.end annotation


# instance fields
.field public final qO:I

.field public final qP:Lcom/google/android/gms/internal/cq;

.field public final qQ:Lcom/google/android/gms/internal/cz;

.field public final qR:Ljava/lang/String;

.field public final qS:Lcom/google/android/gms/internal/ct;


# direct methods
.method public constructor <init>(I)V
    .locals 6

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/cv;-><init>(Lcom/google/android/gms/internal/cq;Lcom/google/android/gms/internal/cz;Ljava/lang/String;Lcom/google/android/gms/internal/ct;I)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/cq;Lcom/google/android/gms/internal/cz;Ljava/lang/String;Lcom/google/android/gms/internal/ct;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/cv;->qP:Lcom/google/android/gms/internal/cq;

    iput-object p2, p0, Lcom/google/android/gms/internal/cv;->qQ:Lcom/google/android/gms/internal/cz;

    iput-object p3, p0, Lcom/google/android/gms/internal/cv;->qR:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/cv;->qS:Lcom/google/android/gms/internal/ct;

    iput p5, p0, Lcom/google/android/gms/internal/cv;->qO:I

    return-void
.end method

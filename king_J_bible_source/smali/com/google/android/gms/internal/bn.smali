.class public final Lcom/google/android/gms/internal/bn;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/bn$a;
    }
.end annotation


# instance fields
.field public final nA:Lcom/google/android/gms/internal/bl;

.field public final nw:I

.field public final nx:Lcom/google/android/gms/internal/bi;

.field public final ny:Lcom/google/android/gms/internal/br;

.field public final nz:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 6

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/bn;-><init>(Lcom/google/android/gms/internal/bi;Lcom/google/android/gms/internal/br;Ljava/lang/String;Lcom/google/android/gms/internal/bl;I)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/bi;Lcom/google/android/gms/internal/br;Ljava/lang/String;Lcom/google/android/gms/internal/bl;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/bn;->nx:Lcom/google/android/gms/internal/bi;

    iput-object p2, p0, Lcom/google/android/gms/internal/bn;->ny:Lcom/google/android/gms/internal/br;

    iput-object p3, p0, Lcom/google/android/gms/internal/bn;->nz:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/bn;->nA:Lcom/google/android/gms/internal/bl;

    iput p5, p0, Lcom/google/android/gms/internal/bn;->nw:I

    return-void
.end method

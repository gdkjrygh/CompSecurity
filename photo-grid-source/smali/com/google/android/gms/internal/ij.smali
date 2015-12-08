.class public final Lcom/google/android/gms/internal/ij;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field public final a:I

.field public final b:Lcom/google/android/gms/internal/id;

.field public final c:Lcom/google/android/gms/internal/is;

.field public final d:Ljava/lang/String;

.field public final e:Lcom/google/android/gms/internal/ig;

.field public final f:Lcom/google/android/gms/internal/iy;


# direct methods
.method public constructor <init>(I)V
    .locals 7

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v5, p1

    move-object v6, v1

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ij;-><init>(Lcom/google/android/gms/internal/id;Lcom/google/android/gms/internal/is;Ljava/lang/String;Lcom/google/android/gms/internal/ig;ILcom/google/android/gms/internal/iy;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/id;Lcom/google/android/gms/internal/is;Ljava/lang/String;Lcom/google/android/gms/internal/ig;ILcom/google/android/gms/internal/iy;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ij;->b:Lcom/google/android/gms/internal/id;

    iput-object p2, p0, Lcom/google/android/gms/internal/ij;->c:Lcom/google/android/gms/internal/is;

    iput-object p3, p0, Lcom/google/android/gms/internal/ij;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ij;->e:Lcom/google/android/gms/internal/ig;

    iput p5, p0, Lcom/google/android/gms/internal/ij;->a:I

    iput-object p6, p0, Lcom/google/android/gms/internal/ij;->f:Lcom/google/android/gms/internal/iy;

    return-void
.end method

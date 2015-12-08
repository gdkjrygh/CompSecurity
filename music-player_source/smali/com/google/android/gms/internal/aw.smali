.class public final Lcom/google/android/gms/internal/aw;
.super Ljava/lang/Object;


# instance fields
.field public final a:I

.field public final b:Lcom/google/android/gms/internal/ap;

.field public final c:Lcom/google/android/gms/internal/bd;

.field public final d:Ljava/lang/String;

.field public final e:Lcom/google/android/gms/internal/at;


# direct methods
.method public constructor <init>(I)V
    .locals 6

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/aw;-><init>(Lcom/google/android/gms/internal/ap;Lcom/google/android/gms/internal/bd;Ljava/lang/String;Lcom/google/android/gms/internal/at;I)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ap;Lcom/google/android/gms/internal/bd;Ljava/lang/String;Lcom/google/android/gms/internal/at;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/aw;->b:Lcom/google/android/gms/internal/ap;

    iput-object p2, p0, Lcom/google/android/gms/internal/aw;->c:Lcom/google/android/gms/internal/bd;

    iput-object p3, p0, Lcom/google/android/gms/internal/aw;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/aw;->e:Lcom/google/android/gms/internal/at;

    iput p5, p0, Lcom/google/android/gms/internal/aw;->a:I

    return-void
.end method

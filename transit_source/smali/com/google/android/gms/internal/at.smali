.class public final Lcom/google/android/gms/internal/at;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/at$a;
    }
.end annotation


# instance fields
.field public final fl:I

.field public final fm:Lcom/google/android/gms/internal/ao;

.field public final fn:Lcom/google/android/gms/internal/ax;

.field public final fo:Ljava/lang/String;

.field public final fp:Lcom/google/android/gms/internal/ar;


# direct methods
.method public constructor <init>(I)V
    .locals 6

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/at;-><init>(Lcom/google/android/gms/internal/ao;Lcom/google/android/gms/internal/ax;Ljava/lang/String;Lcom/google/android/gms/internal/ar;I)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ao;Lcom/google/android/gms/internal/ax;Ljava/lang/String;Lcom/google/android/gms/internal/ar;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/at;->fm:Lcom/google/android/gms/internal/ao;

    iput-object p2, p0, Lcom/google/android/gms/internal/at;->fn:Lcom/google/android/gms/internal/ax;

    iput-object p3, p0, Lcom/google/android/gms/internal/at;->fo:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/at;->fp:Lcom/google/android/gms/internal/ar;

    iput p5, p0, Lcom/google/android/gms/internal/at;->fl:I

    return-void
.end method

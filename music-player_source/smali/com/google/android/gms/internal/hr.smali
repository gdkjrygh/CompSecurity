.class public final Lcom/google/android/gms/internal/hr;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final a:Lcom/google/android/gms/internal/jb;


# instance fields
.field final b:I

.field private final c:Lcom/google/android/gms/location/LocationRequest;

.field private final d:Lcom/google/android/gms/internal/hn;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/jb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/jb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/hr;->a:Lcom/google/android/gms/internal/jb;

    return-void
.end method

.method public constructor <init>(ILcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/internal/hn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/hr;->b:I

    iput-object p2, p0, Lcom/google/android/gms/internal/hr;->c:Lcom/google/android/gms/location/LocationRequest;

    iput-object p3, p0, Lcom/google/android/gms/internal/hr;->d:Lcom/google/android/gms/internal/hn;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/location/LocationRequest;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hr;->c:Lcom/google/android/gms/location/LocationRequest;

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/hn;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hr;->d:Lcom/google/android/gms/internal/hn;

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/hr;->a:Lcom/google/android/gms/internal/jb;

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/internal/hr;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/internal/hr;

    iget-object v2, p0, Lcom/google/android/gms/internal/hr;->c:Lcom/google/android/gms/location/LocationRequest;

    iget-object v3, p1, Lcom/google/android/gms/internal/hr;->c:Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/location/LocationRequest;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/hr;->d:Lcom/google/android/gms/internal/hn;

    iget-object v3, p1, Lcom/google/android/gms/internal/hr;->d:Lcom/google/android/gms/internal/hn;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/hn;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/internal/hr;->c:Lcom/google/android/gms/location/LocationRequest;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/hr;->d:Lcom/google/android/gms/internal/hn;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/internal/gq;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "locationRequest"

    iget-object v2, p0, Lcom/google/android/gms/internal/hr;->c:Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "filter"

    iget-object v2, p0, Lcom/google/android/gms/internal/hr;->d:Lcom/google/android/gms/internal/hn;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gr;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/hr;->a:Lcom/google/android/gms/internal/jb;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/jb;->a(Lcom/google/android/gms/internal/hr;Landroid/os/Parcel;I)V

    return-void
.end method

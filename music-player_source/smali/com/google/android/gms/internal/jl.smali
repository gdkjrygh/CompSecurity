.class public final Lcom/google/android/gms/internal/jl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field a:Ljava/lang/String;

.field b:Lcom/google/android/gms/internal/jm;

.field c:Ljava/lang/String;

.field d:Lcom/google/android/gms/internal/jr;

.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/kj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kj;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/jl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/jl;->e:I

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Lcom/google/android/gms/internal/jm;Ljava/lang/String;Lcom/google/android/gms/internal/jr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/jl;->e:I

    iput-object p2, p0, Lcom/google/android/gms/internal/jl;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/jl;->b:Lcom/google/android/gms/internal/jm;

    iput-object p4, p0, Lcom/google/android/gms/internal/jl;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/jl;->d:Lcom/google/android/gms/internal/jr;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/jl;->e:I

    return v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/kj;->a(Lcom/google/android/gms/internal/jl;Landroid/os/Parcel;I)V

    return-void
.end method

.class public final Lcom/google/android/gms/maps/model/internal/p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/maps/model/internal/q;


# instance fields
.field private final CK:I

.field private amN:Lcom/google/android/gms/maps/model/internal/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/maps/model/internal/q;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/internal/q;-><init>()V

    sput-object v0, Lcom/google/android/gms/maps/model/internal/p;->CREATOR:Lcom/google/android/gms/maps/model/internal/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/maps/model/internal/p;->CK:I

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/maps/model/internal/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/maps/model/internal/p;->CK:I

    iput-object p2, p0, Lcom/google/android/gms/maps/model/internal/p;->amN:Lcom/google/android/gms/maps/model/internal/a;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/internal/p;->CK:I

    return v0
.end method

.method public ol()Lcom/google/android/gms/maps/model/internal/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/internal/p;->amN:Lcom/google/android/gms/maps/model/internal/a;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/internal/q;->a(Lcom/google/android/gms/maps/model/internal/p;Landroid/os/Parcel;I)V

    return-void
.end method

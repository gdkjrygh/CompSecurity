.class public Lcom/google/android/gms/wearable/internal/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wearable/internal/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final alA:[Landroid/content/IntentFilter;

.field public final alz:Lcom/google/android/gms/wearable/internal/ac;

.field final xM:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/c;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/c;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/internal/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;[Landroid/content/IntentFilter;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wearable/internal/b;->xM:I

    if-eqz p2, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/wearable/internal/ac$a;->bx(Landroid/os/IBinder;)Lcom/google/android/gms/wearable/internal/ac;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/b;->alz:Lcom/google/android/gms/wearable/internal/ac;

    :goto_0
    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/b;->alA:[Landroid/content/IntentFilter;

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/b;->alz:Lcom/google/android/gms/wearable/internal/ac;

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/wearable/internal/av;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/wearable/internal/b;->xM:I

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/b;->alz:Lcom/google/android/gms/wearable/internal/ac;

    invoke-virtual {p1}, Lcom/google/android/gms/wearable/internal/av;->nu()[Landroid/content/IntentFilter;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/b;->alA:[Landroid/content/IntentFilter;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method no()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/b;->alz:Lcom/google/android/gms/wearable/internal/ac;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/b;->alz:Lcom/google/android/gms/wearable/internal/ac;

    invoke-interface {v0}, Lcom/google/android/gms/wearable/internal/ac;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/c;->a(Lcom/google/android/gms/wearable/internal/b;Landroid/os/Parcel;I)V

    return-void
.end method

.class final Lcom/kik/cards/web/picker/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 44
    new-instance v0, Lcom/kik/cards/web/picker/PickerRequest;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/kik/cards/web/picker/PickerRequest;-><init>(Landroid/os/Parcel;B)V

    return-object v0
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 44
    new-array v0, p1, [Lcom/kik/cards/web/picker/PickerRequest;

    return-object v0
.end method

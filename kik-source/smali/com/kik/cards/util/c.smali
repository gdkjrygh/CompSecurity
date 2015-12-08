.class final Lcom/kik/cards/util/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 31
    new-instance v0, Lcom/kik/cards/util/UserDataParcelable;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/kik/cards/util/UserDataParcelable;-><init>(Landroid/os/Parcel;B)V

    return-object v0
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 31
    new-array v0, p1, [Lcom/kik/cards/util/UserDataParcelable;

    return-object v0
.end method

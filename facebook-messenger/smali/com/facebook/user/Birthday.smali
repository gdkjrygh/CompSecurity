.class public Lcom/facebook/user/Birthday;
.super Ljava/lang/Object;
.source "Birthday.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/user/Birthday;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 46
    new-instance v0, Lcom/facebook/user/a;

    invoke-direct {v0}, Lcom/facebook/user/a;-><init>()V

    sput-object v0, Lcom/facebook/user/Birthday;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput p1, p0, Lcom/facebook/user/Birthday;->a:I

    .line 15
    iput p2, p0, Lcom/facebook/user/Birthday;->b:I

    .line 16
    iput p3, p0, Lcom/facebook/user/Birthday;->c:I

    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/user/Birthday;->a:I

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/user/Birthday;->b:I

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/user/Birthday;->c:I

    .line 23
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lcom/facebook/user/Birthday;->a:I

    return v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lcom/facebook/user/Birthday;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 34
    iget v0, p0, Lcom/facebook/user/Birthday;->c:I

    return v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 38
    iget v0, p0, Lcom/facebook/user/Birthday;->c:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 43
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 59
    iget v0, p0, Lcom/facebook/user/Birthday;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 60
    iget v0, p0, Lcom/facebook/user/Birthday;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 61
    iget v0, p0, Lcom/facebook/user/Birthday;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 62
    return-void
.end method

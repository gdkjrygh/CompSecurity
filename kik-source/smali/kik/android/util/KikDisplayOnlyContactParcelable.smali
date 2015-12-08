.class public Lkik/android/util/KikDisplayOnlyContactParcelable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private a:Lkik/a/d/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    new-instance v0, Lkik/android/util/bh;

    invoke-direct {v0}, Lkik/android/util/bh;-><init>()V

    sput-object v0, Lkik/android/util/KikDisplayOnlyContactParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lkik/a/d/l;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lkik/android/util/KikDisplayOnlyContactParcelable;->a:Lkik/a/d/l;

    .line 20
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lkik/android/util/KikDisplayOnlyContactParcelable;->a:Lkik/a/d/l;

    invoke-virtual {v0}, Lkik/a/d/l;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 32
    iget-object v0, p0, Lkik/android/util/KikDisplayOnlyContactParcelable;->a:Lkik/a/d/l;

    invoke-virtual {v0}, Lkik/a/d/l;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 33
    iget-object v0, p0, Lkik/android/util/KikDisplayOnlyContactParcelable;->a:Lkik/a/d/l;

    invoke-virtual {v0}, Lkik/a/d/l;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 34
    return-void

    .line 33
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

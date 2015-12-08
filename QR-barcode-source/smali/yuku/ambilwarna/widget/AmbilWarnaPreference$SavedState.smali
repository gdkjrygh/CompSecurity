.class Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState;
.super Landroid/preference/Preference$BaseSavedState;
.source "AmbilWarnaPreference.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyuku/ambilwarna/widget/AmbilWarnaPreference;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field value:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 124
    new-instance v0, Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState$1;

    invoke-direct {v0}, Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState$1;-><init>()V

    sput-object v0, Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 132
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1
    .param p1, "source"    # Landroid/os/Parcel;

    .prologue
    .line 111
    invoke-direct {p0, p1}, Landroid/preference/Preference$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 112
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState;->value:I

    .line 113
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .locals 0
    .param p1, "superState"    # Landroid/os/Parcelable;

    .prologue
    .line 121
    invoke-direct {p0, p1}, Landroid/preference/Preference$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 122
    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 116
    invoke-super {p0, p1, p2}, Landroid/preference/Preference$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 117
    iget v0, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference$SavedState;->value:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 118
    return-void
.end method

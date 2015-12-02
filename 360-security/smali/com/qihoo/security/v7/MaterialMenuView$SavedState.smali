.class Lcom/qihoo/security/v7/MaterialMenuView$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/v7/MaterialMenuView;
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
            "Lcom/qihoo/security/v7/MaterialMenuView$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected a:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 211
    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuView$SavedState$1;

    invoke-direct {v0}, Lcom/qihoo/security/v7/MaterialMenuView$SavedState$1;-><init>()V

    sput-object v0, Lcom/qihoo/security/v7/MaterialMenuView$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 200
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 201
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->valueOf(Ljava/lang/String;)Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView$SavedState;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    .line 202
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/qihoo/security/v7/MaterialMenuView$1;)V
    .locals 0

    .prologue
    .line 192
    invoke-direct {p0, p1}, Lcom/qihoo/security/v7/MaterialMenuView$SavedState;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .locals 0

    .prologue
    .line 196
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 197
    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 206
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 207
    iget-object v0, p0, Lcom/qihoo/security/v7/MaterialMenuView$SavedState;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    invoke-virtual {v0}, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 208
    return-void
.end method

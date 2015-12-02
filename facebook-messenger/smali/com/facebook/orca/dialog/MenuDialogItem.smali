.class public Lcom/facebook/orca/dialog/MenuDialogItem;
.super Ljava/lang/Object;
.source "MenuDialogItem.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/dialog/MenuDialogItem;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:Landroid/os/Parcelable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 63
    new-instance v0, Lcom/facebook/orca/dialog/f;

    invoke-direct {v0}, Lcom/facebook/orca/dialog/f;-><init>()V

    sput-object v0, Lcom/facebook/orca/dialog/MenuDialogItem;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IILandroid/os/Parcelable;)V
    .locals 1
    .param p3    # Landroid/os/Parcelable;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 24
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/facebook/orca/dialog/MenuDialogItem;-><init>(IILjava/lang/String;Landroid/os/Parcelable;)V

    .line 25
    return-void
.end method

.method private constructor <init>(IILjava/lang/String;Landroid/os/Parcelable;)V
    .locals 3
    .param p4    # Landroid/os/Parcelable;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    if-nez p2, :cond_0

    move v2, v0

    :goto_0
    if-nez p3, :cond_1

    :goto_1
    xor-int/2addr v0, v2

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 34
    iput p1, p0, Lcom/facebook/orca/dialog/MenuDialogItem;->a:I

    .line 35
    iput p2, p0, Lcom/facebook/orca/dialog/MenuDialogItem;->b:I

    .line 36
    iput-object p3, p0, Lcom/facebook/orca/dialog/MenuDialogItem;->c:Ljava/lang/String;

    .line 37
    iput-object p4, p0, Lcom/facebook/orca/dialog/MenuDialogItem;->d:Landroid/os/Parcelable;

    .line 38
    return-void

    :cond_0
    move v2, v1

    .line 33
    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/dialog/MenuDialogItem;->a:I

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/dialog/MenuDialogItem;->b:I

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogItem;->c:Ljava/lang/String;

    .line 44
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogItem;->d:Landroid/os/Parcelable;

    .line 45
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/dialog/f;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/facebook/orca/dialog/MenuDialogItem;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 48
    iget v0, p0, Lcom/facebook/orca/dialog/MenuDialogItem;->a:I

    return v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 52
    iget v0, p0, Lcom/facebook/orca/dialog/MenuDialogItem;->b:I

    return v0
.end method

.method public c()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogItem;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Landroid/os/Parcelable;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogItem;->d:Landroid/os/Parcelable;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 78
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 83
    iget v0, p0, Lcom/facebook/orca/dialog/MenuDialogItem;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 84
    iget v0, p0, Lcom/facebook/orca/dialog/MenuDialogItem;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 85
    iget-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogItem;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogItem;->d:Landroid/os/Parcelable;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 87
    return-void
.end method

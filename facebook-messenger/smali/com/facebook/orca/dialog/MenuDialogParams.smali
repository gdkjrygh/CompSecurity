.class public Lcom/facebook/orca/dialog/MenuDialogParams;
.super Ljava/lang/Object;
.source "MenuDialogParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/dialog/MenuDialogParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/dialog/MenuDialogItem;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroid/os/Parcelable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 59
    new-instance v0, Lcom/facebook/orca/dialog/i;

    invoke-direct {v0}, Lcom/facebook/orca/dialog/i;-><init>()V

    sput-object v0, Lcom/facebook/orca/dialog/MenuDialogParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->a:I

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->b:Ljava/lang/String;

    .line 39
    const-class v0, Lcom/facebook/orca/dialog/MenuDialogItem;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->c:Lcom/google/common/a/es;

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "extra_data"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->d:Landroid/os/Parcelable;

    .line 41
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/dialog/i;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/orca/dialog/MenuDialogParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/dialog/j;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    invoke-virtual {p1}, Lcom/facebook/orca/dialog/j;->a()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->a:I

    .line 28
    invoke-virtual {p1}, Lcom/facebook/orca/dialog/j;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->b:Ljava/lang/String;

    .line 29
    invoke-virtual {p1}, Lcom/facebook/orca/dialog/j;->c()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->c:Lcom/google/common/a/es;

    .line 30
    invoke-virtual {p1}, Lcom/facebook/orca/dialog/j;->d()Landroid/os/Parcelable;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->d:Landroid/os/Parcelable;

    .line 32
    iget v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->a:I

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    iget-object v3, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->b:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    :goto_1
    xor-int/2addr v0, v3

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 33
    iget-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->c:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    :goto_2
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 34
    return-void

    :cond_0
    move v0, v2

    .line 32
    goto :goto_0

    :cond_1
    move v3, v2

    goto :goto_1

    :cond_2
    move v1, v2

    .line 33
    goto :goto_2
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 44
    iget v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->a:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/dialog/MenuDialogItem;",
            ">;"
        }
    .end annotation

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->c:Lcom/google/common/a/es;

    return-object v0
.end method

.method public d()Landroid/os/Parcelable;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->d:Landroid/os/Parcelable;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 74
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .prologue
    .line 79
    iget v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 80
    iget-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->c:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 82
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 83
    const-string v1, "extra_data"

    iget-object v2, p0, Lcom/facebook/orca/dialog/MenuDialogParams;->d:Landroid/os/Parcelable;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 84
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 85
    return-void
.end method

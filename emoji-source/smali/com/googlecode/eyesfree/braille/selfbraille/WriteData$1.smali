.class final Lcom/googlecode/eyesfree/braille/selfbraille/WriteData$1;
.super Ljava/lang/Object;
.source "WriteData.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;
    .locals 2
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 147
    new-instance v0, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;-><init>(Landroid/os/Parcel;Lcom/googlecode/eyesfree/braille/selfbraille/WriteData$1;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Landroid/os/Parcel;

    .prologue
    .line 144
    invoke-virtual {p0, p1}, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData$1;->createFromParcel(Landroid/os/Parcel;)Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;
    .locals 1
    .param p1, "size"    # I

    .prologue
    .line 152
    new-array v0, p1, [Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # I

    .prologue
    .line 144
    invoke-virtual {p0, p1}, Lcom/googlecode/eyesfree/braille/selfbraille/WriteData$1;->newArray(I)[Lcom/googlecode/eyesfree/braille/selfbraille/WriteData;

    move-result-object v0

    return-object v0
.end method

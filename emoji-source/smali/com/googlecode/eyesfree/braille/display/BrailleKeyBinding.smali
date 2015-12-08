.class public Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;
.super Ljava/lang/Object;
.source "BrailleKeyBinding.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mCommand:I

.field private mKeyNames:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 72
    new-instance v0, Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding$1;

    invoke-direct {v0}, Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding$1;-><init>()V

    sput-object v0, Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    return-void
.end method

.method public constructor <init>(I[Ljava/lang/String;)V
    .locals 0
    .param p1, "command"    # I
    .param p2, "keyNames"    # [Ljava/lang/String;

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput p1, p0, Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;->mCommand:I

    .line 35
    iput-object p2, p0, Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;->mKeyNames:[Ljava/lang/String;

    .line 36
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;->mCommand:I

    .line 98
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;->mKeyNames:[Ljava/lang/String;

    .line 99
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding$1;)V
    .locals 0
    .param p1, "x0"    # Landroid/os/Parcel;
    .param p2, "x1"    # Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding$1;

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 87
    const/4 v0, 0x0

    return v0
.end method

.method public getCommand()I
    .locals 1

    .prologue
    .line 59
    iget v0, p0, Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;->mCommand:I

    return v0
.end method

.method public getKeyNames()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;->mKeyNames:[Ljava/lang/String;

    return-object v0
.end method

.method public setCommand(I)Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;
    .locals 0
    .param p1, "command"    # I

    .prologue
    .line 42
    iput p1, p0, Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;->mCommand:I

    .line 43
    return-object p0
.end method

.method public setKeyNames([Ljava/lang/String;)Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;
    .locals 0
    .param p1, "keyNames"    # [Ljava/lang/String;

    .prologue
    .line 50
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;->mKeyNames:[Ljava/lang/String;

    .line 51
    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 92
    iget v0, p0, Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;->mCommand:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 93
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;->mKeyNames:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 94
    return-void
.end method

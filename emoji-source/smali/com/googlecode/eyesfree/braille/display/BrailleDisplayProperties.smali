.class public Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;
.super Ljava/lang/Object;
.source "BrailleDisplayProperties.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mFriendlyKeyNames:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mKeyBindings:[Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;

.field private final mNumStatusCells:I

.field private final mNumTextCells:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 87
    new-instance v0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties$1;

    invoke-direct {v0}, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties$1;-><init>()V

    sput-object v0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(II[Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;Ljava/util/Map;)V
    .locals 0
    .param p1, "numTextCells"    # I
    .param p2, "numStatusCells"    # I
    .param p3, "keyBindings"    # [Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II[",
            "Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 38
    .local p4, "friendlyKeyNames":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput p1, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mNumTextCells:I

    .line 40
    iput p2, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mNumStatusCells:I

    .line 41
    iput-object p3, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mKeyBindings:[Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;

    .line 42
    iput-object p4, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mFriendlyKeyNames:Ljava/util/Map;

    .line 43
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 5
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mNumTextCells:I

    .line 119
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    iput v3, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mNumStatusCells:I

    .line 120
    sget-object v3, Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;

    iput-object v3, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mKeyBindings:[Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;

    .line 121
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 122
    .local v2, "size":I
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 123
    .local v1, "names":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, v2, :cond_0

    .line 124
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 126
    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    iput-object v3, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mFriendlyKeyNames:Ljava/util/Map;

    .line 127
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties$1;)V
    .locals 0
    .param p1, "x0"    # Landroid/os/Parcel;
    .param p2, "x1"    # Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties$1;

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 102
    const/4 v0, 0x0

    return v0
.end method

.method public getFriendlyKeyNames()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 74
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mFriendlyKeyNames:Ljava/util/Map;

    return-object v0
.end method

.method public getKeyBindings()[Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mKeyBindings:[Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;

    return-object v0
.end method

.method public getNumStatusCells()I
    .locals 1

    .prologue
    .line 59
    iget v0, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mNumStatusCells:I

    return v0
.end method

.method public getNumTextCells()I
    .locals 1

    .prologue
    .line 50
    iget v0, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mNumTextCells:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 79
    const-string v0, "BrailleDisplayProperties [numTextCells: %d, numStatusCells: %d, keyBindings: %d]"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mNumTextCells:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget v3, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mNumStatusCells:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mKeyBindings:[Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;

    array-length v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 107
    iget v2, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mNumTextCells:I

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 108
    iget v2, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mNumStatusCells:I

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 109
    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mKeyBindings:[Lcom/googlecode/eyesfree/braille/display/BrailleKeyBinding;

    invoke-virtual {p1, v2, p2}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    .line 110
    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mFriendlyKeyNames:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 111
    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;->mFriendlyKeyNames:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 112
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 113
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 115
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_0
    return-void
.end method

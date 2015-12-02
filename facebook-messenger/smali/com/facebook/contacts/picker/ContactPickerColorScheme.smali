.class public final enum Lcom/facebook/contacts/picker/ContactPickerColorScheme;
.super Ljava/lang/Enum;
.source "ContactPickerColorScheme.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/picker/ContactPickerColorScheme;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/picker/ContactPickerColorScheme;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/contacts/picker/ContactPickerColorScheme;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum DEFAULT_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

.field public static final enum DIVEBAR_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 9
    new-instance v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    const-string v1, "DEFAULT_SCHEME"

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/picker/ContactPickerColorScheme;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DEFAULT_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    .line 10
    new-instance v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    const-string v1, "DIVEBAR_SCHEME"

    invoke-direct {v0, v1, v3}, Lcom/facebook/contacts/picker/ContactPickerColorScheme;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DIVEBAR_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    .line 8
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    sget-object v1, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DEFAULT_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DIVEBAR_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->$VALUES:[Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    .line 22
    new-instance v0, Lcom/facebook/contacts/picker/k;

    invoke-direct {v0}, Lcom/facebook/contacts/picker/k;-><init>()V

    sput-object v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/picker/ContactPickerColorScheme;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/picker/ContactPickerColorScheme;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->$VALUES:[Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    invoke-virtual {v0}, [Lcom/facebook/contacts/picker/ContactPickerColorScheme;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 14
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 19
    invoke-virtual {p0}, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 20
    return-void
.end method

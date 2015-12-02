.class public final enum Lcom/facebook/contacts/upload/ContactsUploadProgressMode;
.super Ljava/lang/Enum;
.source "ContactsUploadProgressMode.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/upload/ContactsUploadProgressMode;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/contacts/upload/ContactsUploadProgressMode;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum SHOW_IN_DIVE_BAR_ONLY:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

.field public static final enum SHOW_IN_THREAD_LIST_AND_DIVE_BAR:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 12
    new-instance v0, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    const-string v1, "SHOW_IN_THREAD_LIST_AND_DIVE_BAR"

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->SHOW_IN_THREAD_LIST_AND_DIVE_BAR:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    .line 13
    new-instance v0, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    const-string v1, "SHOW_IN_DIVE_BAR_ONLY"

    invoke-direct {v0, v1, v3}, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->SHOW_IN_DIVE_BAR_ONLY:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    .line 11
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    sget-object v1, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->SHOW_IN_THREAD_LIST_AND_DIVE_BAR:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->SHOW_IN_DIVE_BAR_ONLY:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->$VALUES:[Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    .line 15
    new-instance v0, Lcom/facebook/contacts/upload/b;

    invoke-direct {v0}, Lcom/facebook/contacts/upload/b;-><init>()V

    sput-object v0, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->CREATOR:Landroid/os/Parcelable$Creator;

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
    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/upload/ContactsUploadProgressMode;
    .locals 1

    .prologue
    .line 11
    const-class v0, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/upload/ContactsUploadProgressMode;
    .locals 1

    .prologue
    .line 11
    sget-object v0, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->$VALUES:[Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    invoke-virtual {v0}, [Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 36
    invoke-virtual {p0}, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 37
    return-void
.end method

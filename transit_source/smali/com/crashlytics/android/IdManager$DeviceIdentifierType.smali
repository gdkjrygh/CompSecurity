.class public final enum Lcom/crashlytics/android/IdManager$DeviceIdentifierType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/crashlytics/android/IdManager$DeviceIdentifierType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ANDROID_DEVICE_ID:Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

.field public static final enum ANDROID_ID:Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

.field public static final enum ANDROID_SERIAL:Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

.field public static final enum BLUETOOTH_MAC_ADDRESS:Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

.field public static final enum WIFI_MAC_ADDRESS:Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

.field private static final synthetic a:[Lcom/crashlytics/android/IdManager$DeviceIdentifierType;


# instance fields
.field public final protobufIndex:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x0

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 57
    new-instance v0, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    const-string v1, "WIFI_MAC_ADDRESS"

    invoke-direct {v0, v1, v5, v3}, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;->WIFI_MAC_ADDRESS:Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    new-instance v0, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    const-string v1, "BLUETOOTH_MAC_ADDRESS"

    invoke-direct {v0, v1, v3, v4}, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;->BLUETOOTH_MAC_ADDRESS:Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    new-instance v0, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    const-string v1, "ANDROID_ID"

    const/16 v2, 0x64

    invoke-direct {v0, v1, v4, v2}, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;->ANDROID_ID:Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    new-instance v0, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    const-string v1, "ANDROID_DEVICE_ID"

    const/16 v2, 0x65

    invoke-direct {v0, v1, v6, v2}, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;->ANDROID_DEVICE_ID:Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    new-instance v0, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    const-string v1, "ANDROID_SERIAL"

    const/16 v2, 0x66

    invoke-direct {v0, v1, v7, v2}, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;->ANDROID_SERIAL:Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    .line 55
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    sget-object v1, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;->WIFI_MAC_ADDRESS:Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;->BLUETOOTH_MAC_ADDRESS:Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;->ANDROID_ID:Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;->ANDROID_DEVICE_ID:Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;->ANDROID_SERIAL:Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    aput-object v1, v0, v7

    sput-object v0, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;->a:[Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .param p3, "pbufIndex"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .prologue
    .line 61
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 62
    iput p3, p0, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;->protobufIndex:I

    .line 63
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/crashlytics/android/IdManager$DeviceIdentifierType;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 55
    const-class v0, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    return-object v0
.end method

.method public static values()[Lcom/crashlytics/android/IdManager$DeviceIdentifierType;
    .locals 1

    .prologue
    .line 55
    sget-object v0, Lcom/crashlytics/android/IdManager$DeviceIdentifierType;->a:[Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    invoke-virtual {v0}, [Lcom/crashlytics/android/IdManager$DeviceIdentifierType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/crashlytics/android/IdManager$DeviceIdentifierType;

    return-object v0
.end method

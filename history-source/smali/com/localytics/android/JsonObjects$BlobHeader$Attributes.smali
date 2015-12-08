.class public final Lcom/localytics/android/JsonObjects$BlobHeader$Attributes;
.super Ljava/lang/Object;
.source "JsonObjects.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/localytics/android/JsonObjects$BlobHeader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Attributes"
.end annotation


# static fields
.field public static final KEY_CLIENT_APP_VERSION:Ljava/lang/String; = "av"

.field public static final KEY_CURRENT_ADVERTISING_ID:Ljava/lang/String; = "gcadid"

.field public static final KEY_CURRENT_ANDROID_ID:Ljava/lang/String; = "caid"

.field public static final KEY_CURRENT_TELEPHONY_ID:Ljava/lang/String; = "ctdid"

.field public static final KEY_DATA_CONNECTION:Ljava/lang/String; = "dac"

.field public static final KEY_DEVICE_ADVERTISING_ID:Ljava/lang/String; = "gadid"

.field public static final KEY_DEVICE_ANDROID_ID:Ljava/lang/String; = "aid"

.field public static final KEY_DEVICE_ANDROID_ID_HASH:Ljava/lang/String; = "du"

.field public static final KEY_DEVICE_COUNTRY:Ljava/lang/String; = "dc"

.field public static final KEY_DEVICE_MANUFACTURER:Ljava/lang/String; = "dma"

.field public static final KEY_DEVICE_MODEL:Ljava/lang/String; = "dmo"

.field public static final KEY_DEVICE_OS_VERSION:Ljava/lang/String; = "dov"

.field public static final KEY_DEVICE_PLATFORM:Ljava/lang/String; = "dp"

.field public static final KEY_DEVICE_SDK_LEVEL:Ljava/lang/String; = "dsdk"

.field public static final KEY_DEVICE_SERIAL_HASH:Ljava/lang/String; = "dms"

.field public static final KEY_DEVICE_TELEPHONY_ID:Ljava/lang/String; = "tdid"

.field public static final KEY_DEVICE_TELEPHONY_ID_HASH:Ljava/lang/String; = "dtidh"

.field public static final KEY_FB_COOKIE:Ljava/lang/String; = "fbat"

.field public static final KEY_GOOGLE_PLAY_ATTRIBUTION:Ljava/lang/String; = "aurl"

.field public static final KEY_LOCALE_COUNTRY:Ljava/lang/String; = "dlc"

.field public static final KEY_LOCALE_LANGUAGE:Ljava/lang/String; = "dll"

.field public static final KEY_LOCALYTICS_API_KEY:Ljava/lang/String; = "au"

.field public static final KEY_LOCALYTICS_CLIENT_LIBRARY_VERSION:Ljava/lang/String; = "lv"

.field public static final KEY_LOCALYTICS_DATA_TYPE:Ljava/lang/String; = "dt"

.field public static final KEY_LOCALYTICS_INSTALLATION_ID:Ljava/lang/String; = "iu"

.field public static final KEY_NETWORK_CARRIER:Ljava/lang/String; = "nca"

.field public static final KEY_NETWORK_COUNTRY:Ljava/lang/String; = "nc"

.field public static final KEY_PACKAGE_NAME:Ljava/lang/String; = "pkg"

.field public static final KEY_PUSH_ID:Ljava/lang/String; = "push"

.field public static final VALUE_DATA_TYPE:Ljava/lang/String; = "a"

.field public static final VALUE_PLATFORM:Ljava/lang/String; = "Android"


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

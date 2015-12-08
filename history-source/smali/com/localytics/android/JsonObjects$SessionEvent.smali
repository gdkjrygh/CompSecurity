.class final Lcom/localytics/android/JsonObjects$SessionEvent;
.super Ljava/lang/Object;
.source "JsonObjects.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/localytics/android/JsonObjects;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "SessionEvent"
.end annotation


# static fields
.field public static final CUST_ID:Ljava/lang/String; = "cid"

.field public static final IDENTIFIERS:Ljava/lang/String; = "ids"

.field public static final KEY_ATTRIBUTES:Ljava/lang/String; = "attrs"

.field public static final KEY_CUSTOMER_VALUE_INCREASE:Ljava/lang/String; = "v"

.field public static final KEY_CUSTOM_DIMENSION_1:Ljava/lang/String; = "c0"

.field public static final KEY_CUSTOM_DIMENSION_2:Ljava/lang/String; = "c1"

.field public static final KEY_CUSTOM_DIMENSION_3:Ljava/lang/String; = "c2"

.field public static final KEY_CUSTOM_DIMENSION_4:Ljava/lang/String; = "c3"

.field public static final KEY_DATA_TYPE:Ljava/lang/String; = "dt"

.field public static final KEY_EVENT_UUID:Ljava/lang/String; = "u"

.field public static final KEY_LATITUDE:Ljava/lang/String; = "lat"

.field public static final KEY_LONGITUDE:Ljava/lang/String; = "lng"

.field public static final KEY_NAME:Ljava/lang/String; = "n"

.field public static final KEY_SESSION_UUID:Ljava/lang/String; = "su"

.field public static final KEY_WALL_TIME_SECONDS:Ljava/lang/String; = "ct"

.field public static final USER_TYPE:Ljava/lang/String; = "utp"

.field public static final VALUE_DATA_TYPE:Ljava/lang/String; = "e"


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 585
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 586
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

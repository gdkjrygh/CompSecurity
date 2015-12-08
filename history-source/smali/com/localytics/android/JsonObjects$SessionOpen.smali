.class final Lcom/localytics/android/JsonObjects$SessionOpen;
.super Ljava/lang/Object;
.source "JsonObjects.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/localytics/android/JsonObjects;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "SessionOpen"
.end annotation


# static fields
.field public static final KEY_COUNT:Ljava/lang/String; = "nth"

.field public static final KEY_CUSTOM_DIMENSION_1:Ljava/lang/String; = "c0"

.field public static final KEY_CUSTOM_DIMENSION_10:Ljava/lang/String; = "c9"

.field public static final KEY_CUSTOM_DIMENSION_2:Ljava/lang/String; = "c1"

.field public static final KEY_CUSTOM_DIMENSION_3:Ljava/lang/String; = "c2"

.field public static final KEY_CUSTOM_DIMENSION_4:Ljava/lang/String; = "c3"

.field public static final KEY_CUSTOM_DIMENSION_5:Ljava/lang/String; = "c4"

.field public static final KEY_CUSTOM_DIMENSION_6:Ljava/lang/String; = "c5"

.field public static final KEY_CUSTOM_DIMENSION_7:Ljava/lang/String; = "c6"

.field public static final KEY_CUSTOM_DIMENSION_8:Ljava/lang/String; = "c7"

.field public static final KEY_CUSTOM_DIMENSION_9:Ljava/lang/String; = "c8"

.field public static final KEY_DATA_TYPE:Ljava/lang/String; = "dt"

.field public static final KEY_EVENT_UUID:Ljava/lang/String; = "u"

.field public static final KEY_TIME_SINCE_LAST:Ljava/lang/String; = "sl"

.field public static final KEY_WALL_TIME_SECONDS:Ljava/lang/String; = "ct"

.field public static final VALUE_DATA_TYPE:Ljava/lang/String; = "s"


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 355
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 356
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

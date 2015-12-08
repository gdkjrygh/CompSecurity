.class final Lcom/localytics/android/JsonObjects$EventFlow;
.super Ljava/lang/Object;
.source "JsonObjects.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/localytics/android/JsonObjects;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "EventFlow"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/localytics/android/JsonObjects$EventFlow$Element;
    }
.end annotation


# static fields
.field public static final KEY_DATA_TYPE:Ljava/lang/String; = "dt"

.field public static final KEY_EVENT_UUID:Ljava/lang/String; = "u"

.field public static final KEY_FLOW_NEW:Ljava/lang/String; = "nw"

.field public static final KEY_FLOW_OLD:Ljava/lang/String; = "od"

.field public static final KEY_SESSION_START_TIME:Ljava/lang/String; = "ss"

.field public static final VALUE_DATA_TYPE:Ljava/lang/String; = "f"


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 778
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 779
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

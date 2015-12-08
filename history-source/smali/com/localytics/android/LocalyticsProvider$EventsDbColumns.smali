.class public final Lcom/localytics/android/LocalyticsProvider$EventsDbColumns;
.super Ljava/lang/Object;
.source "LocalyticsProvider.java"

# interfaces
.implements Landroid/provider/BaseColumns;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/localytics/android/LocalyticsProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "EventsDbColumns"
.end annotation


# static fields
.field public static final CLV_INCREASE:Ljava/lang/String; = "clv_increase"

.field public static final CUST_ID:Ljava/lang/String; = "customer_id"

.field public static final EVENT_NAME:Ljava/lang/String; = "event_name"

.field public static final IDENTIFIERS:Ljava/lang/String; = "ids"

.field public static final LAT_NAME:Ljava/lang/String; = "event_lat"

.field public static final LNG_NAME:Ljava/lang/String; = "event_lng"

.field public static final REAL_TIME:Ljava/lang/String; = "real_time"

.field public static final SESSION_KEY_REF:Ljava/lang/String; = "session_key_ref"

.field public static final TABLE_NAME:Ljava/lang/String; = "events"

.field public static final USER_TYPE:Ljava/lang/String; = "user_type"

.field public static final UUID:Ljava/lang/String; = "uuid"

.field public static final WALL_TIME:Ljava/lang/String; = "wall_time"


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 1552
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1553
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

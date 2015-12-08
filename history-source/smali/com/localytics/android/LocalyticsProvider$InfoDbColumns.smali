.class public final Lcom/localytics/android/LocalyticsProvider$InfoDbColumns;
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
    name = "InfoDbColumns"
.end annotation


# static fields
.field public static final FB_ATTRIBUTION:Ljava/lang/String; = "fb_attribution"

.field public static final FIRST_ADVERTISING_ID:Ljava/lang/String; = "first_advertising_id"

.field public static final FIRST_ANDROID_ID:Ljava/lang/String; = "first_android_id"

.field public static final FIRST_RUN:Ljava/lang/String; = "first_run"

.field public static final FIRST_TELEPHONY_ID:Ljava/lang/String; = "first_telephony_id"

.field public static final LAST_SESSION_OPEN_TIME:Ljava/lang/String; = "last_session_open_time"

.field public static final PACKAGE_NAME:Ljava/lang/String; = "package_name"

.field public static final PLAY_ATTRIBUTION:Ljava/lang/String; = "play_attribution"

.field public static final PUSH_DISABLED:Ljava/lang/String; = "push_disabled"

.field public static final REGISTRATION_ID:Ljava/lang/String; = "registration_id"

.field public static final REGISTRATION_VERSION:Ljava/lang/String; = "registration_version"

.field public static final SENDER_ID:Ljava/lang/String; = "sender_id"

.field public static final TABLE_NAME:Ljava/lang/String; = "info"


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 1180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1181
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

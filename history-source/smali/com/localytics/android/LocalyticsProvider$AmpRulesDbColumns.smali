.class public final Lcom/localytics/android/LocalyticsProvider$AmpRulesDbColumns;
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
    name = "AmpRulesDbColumns"
.end annotation


# static fields
.field public static final AB_TEST:Ljava/lang/String; = "ab_test"

.field public static final CAMPAIGN_ID:Ljava/lang/String; = "campaign_id"

.field public static final DEVICES:Ljava/lang/String; = "devices"

.field public static final DISPLAY_SECONDS:Ljava/lang/String; = "display_seconds"

.field public static final DISPLAY_SESSION:Ljava/lang/String; = "display_session"

.field public static final EXPIRATION:Ljava/lang/String; = "expiration"

.field public static final INTERNET_REQUIRED:Ljava/lang/String; = "internet_required"

.field public static final LOCATION:Ljava/lang/String; = "location"

.field public static final PHONE_LOCATION:Ljava/lang/String; = "phone_location"

.field public static final PHONE_SIZE_HEIGHT:Ljava/lang/String; = "phone_size_height"

.field public static final PHONE_SIZE_WIDTH:Ljava/lang/String; = "phone_size_width"

.field public static final RULE_NAME:Ljava/lang/String; = "rule_name"

.field public static final TABLET_LOCATION:Ljava/lang/String; = "tablet_location"

.field public static final TABLET_SIZE_HEIGHT:Ljava/lang/String; = "tablet_size_height"

.field public static final TABLET_SIZE_WIDTH:Ljava/lang/String; = "tablet_size_width"

.field public static final TABLE_NAME:Ljava/lang/String; = "amp_rules"

.field public static final TIME_TO_DISPLAY:Ljava/lang/String; = "time_to_display"

.field public static final VERSION:Ljava/lang/String; = "version"


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 2088
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2089
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

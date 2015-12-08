.class public final Lcom/localytics/android/LocalyticsProvider$AmpDisplayedDbColumns;
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
    name = "AmpDisplayedDbColumns"
.end annotation


# static fields
.field public static final CAMPAIGN_ID:Ljava/lang/String; = "campaign_id"

.field public static final DISPLAYED:Ljava/lang/String; = "displayed"

.field public static final TABLE_NAME:Ljava/lang/String; = "amp_displayed"


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 2264
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2265
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

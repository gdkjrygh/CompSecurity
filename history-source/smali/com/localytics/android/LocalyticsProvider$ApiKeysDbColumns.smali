.class public final Lcom/localytics/android/LocalyticsProvider$ApiKeysDbColumns;
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
    name = "ApiKeysDbColumns"
.end annotation


# static fields
.field public static final API_KEY:Ljava/lang/String; = "api_key"

.field public static final CREATED_TIME:Ljava/lang/String; = "created_time"

.field public static final OPT_OUT:Ljava/lang/String; = "opt_out"

.field public static final TABLE_NAME:Ljava/lang/String; = "api_keys"

.field public static final UUID:Ljava/lang/String; = "uuid"


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 1119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1120
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

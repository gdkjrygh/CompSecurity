.class public final Lcom/localytics/android/LocalyticsProvider$EventHistoryDbColumns;
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
    name = "EventHistoryDbColumns"
.end annotation


# static fields
.field public static final NAME:Ljava/lang/String; = "name"

.field public static final PROCESSED_IN_BLOB:Ljava/lang/String; = "processed_in_blob"

.field public static final SESSION_KEY_REF:Ljava/lang/String; = "session_key_ref"

.field public static final TABLE_NAME:Ljava/lang/String; = "event_history"

.field public static final TYPE:Ljava/lang/String; = "type"

.field public static final TYPE_EVENT:I = 0x0

.field public static final TYPE_SCREEN:I = 0x1


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 1659
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1660
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.class public final Lcom/localytics/android/LocalyticsProvider$AmpRuleEventDbColumns;
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
    name = "AmpRuleEventDbColumns"
.end annotation


# static fields
.field public static final EVENT_NAME:Ljava/lang/String; = "event_name"

.field public static final RULE_ID_REF:Ljava/lang/String; = "rule_id_ref"

.field public static final TABLE_NAME:Ljava/lang/String; = "amp_ruleevent"


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 2305
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2306
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.class public final Lcom/localytics/android/LocalyticsProvider$AmpConditionValuesDbColumns;
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
    name = "AmpConditionValuesDbColumns"
.end annotation


# static fields
.field public static final CONDITION_ID_REF:Ljava/lang/String; = "condition_id_ref"

.field public static final TABLE_NAME:Ljava/lang/String; = "amp_condition_values"

.field public static final VALUE:Ljava/lang/String; = "value"


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 2397
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2398
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

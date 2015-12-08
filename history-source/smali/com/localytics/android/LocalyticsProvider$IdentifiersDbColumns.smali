.class public final Lcom/localytics/android/LocalyticsProvider$IdentifiersDbColumns;
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
    name = "IdentifiersDbColumns"
.end annotation


# static fields
.field public static final KEY:Ljava/lang/String; = "key"

.field public static final TABLE_NAME:Ljava/lang/String; = "identifiers"

.field public static final VALUE:Ljava/lang/String; = "value"


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 1307
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1308
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

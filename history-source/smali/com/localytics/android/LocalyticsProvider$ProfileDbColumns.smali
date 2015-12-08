.class public final Lcom/localytics/android/LocalyticsProvider$ProfileDbColumns;
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
    name = "ProfileDbColumns"
.end annotation


# static fields
.field public static final ACTION:Ljava/lang/String; = "action"

.field public static final ATTRIBUTE:Ljava/lang/String; = "attribute"

.field public static final CUSTOMER_ID:Ljava/lang/String; = "customer_id"

.field public static final TABLE_NAME:Ljava/lang/String; = "profile"


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 2438
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2439
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

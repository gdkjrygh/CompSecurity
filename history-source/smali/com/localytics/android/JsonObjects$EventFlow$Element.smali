.class final Lcom/localytics/android/JsonObjects$EventFlow$Element;
.super Ljava/lang/Object;
.source "JsonObjects.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/localytics/android/JsonObjects$EventFlow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Element"
.end annotation


# static fields
.field public static final TYPE_EVENT:Ljava/lang/String; = "e"

.field public static final TYPE_SCREEN:Ljava/lang/String; = "s"


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 835
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 836
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

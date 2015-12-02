.class public Lcom/facebook/base/b;
.super Ljava/lang/Object;
.source "BuildConstants.java"


# static fields
.field private static a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    sget-boolean v0, Lcom/facebook/base/a;->a:Z

    sput-boolean v0, Lcom/facebook/base/b;->a:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    return-void
.end method

.method public static final a()Z
    .locals 1

    .prologue
    .line 44
    sget-boolean v0, Lcom/facebook/base/b;->a:Z

    return v0
.end method

.method public static final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    invoke-static {}, Lcom/facebook/base/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "com.facebook.wakizashi"

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "com.facebook.katana"

    goto :goto_0
.end method

.class public final Lcom/EnterpriseMobileBanking/Utils/Log;
.super Ljava/lang/Object;
.source "Log.java"


# static fields
.field private static DEBUG_ENABLED:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 4
    const/4 v0, 0x0

    sput-boolean v0, Lcom/EnterpriseMobileBanking/Utils/Log;->DEBUG_ENABLED:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 15
    sget-boolean v0, Lcom/EnterpriseMobileBanking/Utils/Log;->DEBUG_ENABLED:Z

    if-eqz v0, :cond_0

    .line 16
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    :cond_0
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 33
    sget-boolean v0, Lcom/EnterpriseMobileBanking/Utils/Log;->DEBUG_ENABLED:Z

    if-eqz v0, :cond_0

    .line 34
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    :cond_0
    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 21
    sget-boolean v0, Lcom/EnterpriseMobileBanking/Utils/Log;->DEBUG_ENABLED:Z

    if-eqz v0, :cond_0

    .line 22
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    :cond_0
    return-void
.end method

.method public static setDebug(Z)V
    .locals 0
    .param p0, "enabled"    # Z

    .prologue
    .line 11
    sput-boolean p0, Lcom/EnterpriseMobileBanking/Utils/Log;->DEBUG_ENABLED:Z

    .line 12
    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 39
    sget-boolean v0, Lcom/EnterpriseMobileBanking/Utils/Log;->DEBUG_ENABLED:Z

    if-eqz v0, :cond_0

    .line 40
    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    :cond_0
    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 27
    sget-boolean v0, Lcom/EnterpriseMobileBanking/Utils/Log;->DEBUG_ENABLED:Z

    if-eqz v0, :cond_0

    .line 28
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    :cond_0
    return-void
.end method

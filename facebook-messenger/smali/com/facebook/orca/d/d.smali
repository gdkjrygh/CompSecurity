.class public Lcom/facebook/orca/d/d;
.super Ljava/lang/Object;
.source "AudioClipDurationUtil.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    const-class v0, Lcom/facebook/orca/d/d;

    sput-object v0, Lcom/facebook/orca/d/d;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)J
    .locals 5

    .prologue
    const-wide/16 v0, -0x1

    .line 22
    const-string v2, "-"

    invoke-virtual {p0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 23
    array-length v3, v2

    const/4 v4, 0x3

    if-eq v3, v4, :cond_0

    .line 24
    sget-object v2, Lcom/facebook/orca/d/d;->a:Ljava/lang/Class;

    const-string v3, "Invalid fileName does not contain duration."

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 38
    :goto_0
    return-wide v0

    .line 27
    :cond_0
    const/4 v3, 0x2

    aget-object v2, v2, v3

    .line 28
    const/16 v3, 0x2e

    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    .line 29
    if-gez v3, :cond_1

    .line 30
    sget-object v2, Lcom/facebook/orca/d/d;->a:Ljava/lang/Class;

    const-string v3, "Invalid fileName does not contain duration."

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 33
    :cond_1
    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 35
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    int-to-long v0, v0

    goto :goto_0

    .line 36
    :catch_0
    move-exception v2

    .line 37
    sget-object v2, Lcom/facebook/orca/d/d;->a:Ljava/lang/Class;

    const-string v3, "Invalid fileName does not contain duration."

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.class public Lcom/qihoo/security/ui/result/g;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 8

    .prologue
    .line 10
    invoke-static {p0}, Lcom/qihoo/security/c/b/a;->a(Landroid/content/Context;)[J

    move-result-object v0

    .line 11
    const/4 v1, 0x0

    aget-wide v2, v0, v1

    .line 12
    const/4 v1, 0x1

    aget-wide v0, v0, v1

    .line 13
    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_0

    .line 14
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sub-long v0, v2, v0

    const-wide/16 v6, 0x64

    mul-long/2addr v0, v6

    div-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 16
    :goto_0
    return-object v0

    :cond_0
    const-string/jumbo v0, "0%"

    goto :goto_0
.end method

.class final Lcom/roidapp/cloudlib/sns/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 1025
    const/4 v0, 0x0

    .line 13
    sput-boolean v0, Lcom/roidapp/cloudlib/sns/m;->a:Z

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 16
    sget-boolean v0, Lcom/roidapp/cloudlib/sns/m;->a:Z

    if-eqz v0, :cond_0

    .line 17
    const-string v0, "SnsLogger"

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 21
    sget-boolean v0, Lcom/roidapp/cloudlib/sns/m;->a:Z

    if-eqz v0, :cond_0

    .line 22
    const-string v0, "SnsLogger"

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    :cond_0
    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 26
    sget-boolean v0, Lcom/roidapp/cloudlib/sns/m;->a:Z

    if-eqz v0, :cond_0

    .line 27
    const-string v0, "SnsLogger"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    :cond_0
    return-void
.end method

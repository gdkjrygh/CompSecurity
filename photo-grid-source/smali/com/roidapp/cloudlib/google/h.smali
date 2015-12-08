.class public final Lcom/roidapp/cloudlib/google/h;
.super Lcom/roidapp/cloudlib/ak;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/Class;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .prologue
    .line 21
    const-string v0, "Google"

    invoke-direct {p0, v0, p1}, Lcom/roidapp/cloudlib/ak;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 22
    sget v0, Lcom/roidapp/cloudlib/aq;->l:I

    iput v0, p0, Lcom/roidapp/cloudlib/google/h;->c:I

    .line 25
    :try_start_0
    sget v0, Lcom/roidapp/cloudlib/at;->U:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/google/h;->e:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 33
    :goto_0
    return-void

    .line 27
    :catch_0
    move-exception v0

    const-string v0, "Google"

    iput-object v0, p0, Lcom/roidapp/cloudlib/google/h;->e:Ljava/lang/String;

    goto :goto_0

    .line 29
    :catch_1
    move-exception v0

    const-string v0, "Google"

    iput-object v0, p0, Lcom/roidapp/cloudlib/google/h;->e:Ljava/lang/String;

    goto :goto_0

    .line 31
    :catch_2
    move-exception v0

    const-string v0, "Google"

    iput-object v0, p0, Lcom/roidapp/cloudlib/google/h;->e:Ljava/lang/String;

    goto :goto_0
.end method

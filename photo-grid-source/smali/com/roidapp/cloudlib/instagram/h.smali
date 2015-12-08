.class public final Lcom/roidapp/cloudlib/instagram/h;
.super Lcom/roidapp/cloudlib/ak;
.source "SourceFile"


# instance fields
.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 25
    const-string v0, "Instagram"

    invoke-direct {p0, v0, p1}, Lcom/roidapp/cloudlib/ak;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/h;->f:Ljava/lang/String;

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/h;->g:Ljava/lang/String;

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/h;->h:Ljava/lang/String;

    .line 26
    sget v0, Lcom/roidapp/cloudlib/aq;->z:I

    iput v0, p0, Lcom/roidapp/cloudlib/instagram/h;->c:I

    .line 29
    :try_start_0
    sget v0, Lcom/roidapp/cloudlib/at;->W:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/h;->e:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 37
    :goto_0
    iput-object p3, p0, Lcom/roidapp/cloudlib/instagram/h;->f:Ljava/lang/String;

    .line 38
    iput-object p4, p0, Lcom/roidapp/cloudlib/instagram/h;->g:Ljava/lang/String;

    .line 39
    iput-object p5, p0, Lcom/roidapp/cloudlib/instagram/h;->h:Ljava/lang/String;

    .line 40
    return-void

    .line 31
    :catch_0
    move-exception v0

    const-string v0, "Instagram"

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/h;->e:Ljava/lang/String;

    goto :goto_0

    .line 33
    :catch_1
    move-exception v0

    const-string v0, "Instagram"

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/h;->e:Ljava/lang/String;

    goto :goto_0

    .line 35
    :catch_2
    move-exception v0

    const-string v0, "Instagram"

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/h;->e:Ljava/lang/String;

    goto :goto_0
.end method

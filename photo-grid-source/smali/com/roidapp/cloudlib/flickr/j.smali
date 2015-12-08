.class public final Lcom/roidapp/cloudlib/flickr/j;
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
    const-string v0, "Flickr"

    invoke-direct {p0, v0, p1}, Lcom/roidapp/cloudlib/ak;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/j;->f:Ljava/lang/String;

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/j;->g:Ljava/lang/String;

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/j;->h:Ljava/lang/String;

    .line 26
    sget v0, Lcom/roidapp/cloudlib/aq;->j:I

    iput v0, p0, Lcom/roidapp/cloudlib/flickr/j;->c:I

    .line 28
    :try_start_0
    sget v0, Lcom/roidapp/cloudlib/at;->K:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/j;->e:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 36
    :goto_0
    iput-object p3, p0, Lcom/roidapp/cloudlib/flickr/j;->f:Ljava/lang/String;

    .line 37
    iput-object p4, p0, Lcom/roidapp/cloudlib/flickr/j;->g:Ljava/lang/String;

    .line 38
    iput-object p5, p0, Lcom/roidapp/cloudlib/flickr/j;->h:Ljava/lang/String;

    .line 39
    return-void

    .line 30
    :catch_0
    move-exception v0

    const-string v0, "Flikcr"

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/j;->e:Ljava/lang/String;

    goto :goto_0

    .line 32
    :catch_1
    move-exception v0

    const-string v0, "Flikcr"

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/j;->e:Ljava/lang/String;

    goto :goto_0

    .line 34
    :catch_2
    move-exception v0

    const-string v0, "Flikcr"

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/j;->e:Ljava/lang/String;

    goto :goto_0
.end method

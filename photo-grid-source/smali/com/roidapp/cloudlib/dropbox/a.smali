.class public final Lcom/roidapp/cloudlib/dropbox/a;
.super Lcom/roidapp/cloudlib/ak;
.source "SourceFile"


# static fields
.field public static f:Ljava/lang/String;

.field public static g:Ljava/lang/String;

.field public static h:Lcom/dropbox/client2/session/Session$AccessType;

.field public static i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const-string v0, ""

    sput-object v0, Lcom/roidapp/cloudlib/dropbox/a;->f:Ljava/lang/String;

    .line 22
    const-string v0, ""

    sput-object v0, Lcom/roidapp/cloudlib/dropbox/a;->g:Ljava/lang/String;

    .line 25
    const-string v0, "image/gif,image/jpeg,image/png,image/x-ms-bmp"

    sput-object v0, Lcom/roidapp/cloudlib/dropbox/a;->i:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/dropbox/client2/session/Session$AccessType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/dropbox/client2/session/Session$AccessType;",
            ")V"
        }
    .end annotation

    .prologue
    .line 28
    const-string v0, "DropBox"

    invoke-direct {p0, v0, p1}, Lcom/roidapp/cloudlib/ak;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 29
    sget v0, Lcom/roidapp/cloudlib/aq;->e:I

    iput v0, p0, Lcom/roidapp/cloudlib/dropbox/a;->c:I

    .line 32
    :try_start_0
    sget v0, Lcom/roidapp/cloudlib/at;->w:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/a;->e:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 40
    :goto_0
    sput-object p3, Lcom/roidapp/cloudlib/dropbox/a;->f:Ljava/lang/String;

    .line 41
    sput-object p4, Lcom/roidapp/cloudlib/dropbox/a;->g:Ljava/lang/String;

    .line 42
    sput-object p5, Lcom/roidapp/cloudlib/dropbox/a;->h:Lcom/dropbox/client2/session/Session$AccessType;

    .line 43
    return-void

    .line 34
    :catch_0
    move-exception v0

    const-string v0, "Dropbox"

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/a;->e:Ljava/lang/String;

    goto :goto_0

    .line 36
    :catch_1
    move-exception v0

    const-string v0, "Dropbox"

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/a;->e:Ljava/lang/String;

    goto :goto_0

    .line 38
    :catch_2
    move-exception v0

    const-string v0, "Dropbox"

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/a;->e:Ljava/lang/String;

    goto :goto_0
.end method

.class public final Lcom/roidapp/cloudlib/twitter/a;
.super Lcom/roidapp/cloudlib/ak;
.source "SourceFile"


# static fields
.field public static f:Ljava/lang/String;

.field public static g:Ljava/lang/String;

.field public static h:Ljava/lang/String;

.field public static i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const-string v0, ""

    sput-object v0, Lcom/roidapp/cloudlib/twitter/a;->f:Ljava/lang/String;

    .line 17
    const-string v0, ""

    sput-object v0, Lcom/roidapp/cloudlib/twitter/a;->g:Ljava/lang/String;

    .line 18
    const-string v0, ""

    sput-object v0, Lcom/roidapp/cloudlib/twitter/a;->h:Ljava/lang/String;

    .line 19
    const-string v0, ""

    sput-object v0, Lcom/roidapp/cloudlib/twitter/a;->i:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 22
    const-string v0, "Twitter"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/ak;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 23
    sget v0, Lcom/roidapp/cloudlib/aq;->J:I

    iput v0, p0, Lcom/roidapp/cloudlib/twitter/a;->c:I

    .line 25
    :try_start_0
    sget v0, Lcom/roidapp/cloudlib/at;->bd:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/twitter/a;->e:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 33
    :goto_0
    sput-object p2, Lcom/roidapp/cloudlib/twitter/a;->f:Ljava/lang/String;

    .line 34
    sput-object p3, Lcom/roidapp/cloudlib/twitter/a;->g:Ljava/lang/String;

    .line 35
    sput-object p4, Lcom/roidapp/cloudlib/twitter/a;->h:Ljava/lang/String;

    .line 36
    sput-object p5, Lcom/roidapp/cloudlib/twitter/a;->i:Ljava/lang/String;

    .line 37
    return-void

    .line 27
    :catch_0
    move-exception v0

    const-string v0, "Twitter"

    iput-object v0, p0, Lcom/roidapp/cloudlib/twitter/a;->e:Ljava/lang/String;

    goto :goto_0

    .line 29
    :catch_1
    move-exception v0

    const-string v0, "Twitter"

    iput-object v0, p0, Lcom/roidapp/cloudlib/twitter/a;->e:Ljava/lang/String;

    goto :goto_0

    .line 31
    :catch_2
    move-exception v0

    const-string v0, "Twitter"

    iput-object v0, p0, Lcom/roidapp/cloudlib/twitter/a;->e:Ljava/lang/String;

    goto :goto_0
.end method

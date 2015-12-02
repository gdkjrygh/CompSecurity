.class Lcom/qihoo/antivirus/update/d$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/io/FilenameFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/antivirus/update/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 631
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/antivirus/update/d$a;)V
    .locals 0

    .prologue
    .line 631
    invoke-direct {p0}, Lcom/qihoo/antivirus/update/d$a;-><init>()V

    return-void
.end method

.method private a(Ljava/io/File;Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 633
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 634
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 640
    :cond_0
    :goto_0
    return v0

    .line 637
    :cond_1
    const-string/jumbo v1, "v_"

    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 638
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 647
    invoke-direct {p0, p1, p2}, Lcom/qihoo/antivirus/update/d$a;->a(Ljava/io/File;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

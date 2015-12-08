.class public final Lcom/kik/cards/usermedia/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cards/web/usermedia/c;


# instance fields
.field private a:Lcom/kik/cards/web/CardsWebViewFragment;

.field private b:Lkik/a/e/v;


# direct methods
.method public constructor <init>(Lcom/kik/cards/web/CardsWebViewFragment;Lkik/a/e/v;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/kik/cards/usermedia/a;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    .line 30
    iput-object p2, p0, Lcom/kik/cards/usermedia/a;->b:Lkik/a/e/v;

    .line 31
    return-void
.end method

.method private static a()Ljava/io/File;
    .locals 3

    .prologue
    .line 68
    const-string v0, "mounted"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 71
    new-instance v0, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    const-string v2, "kikTemp"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 77
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 78
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 82
    :cond_0
    new-instance v1, Ljava/io/File;

    const-string v2, ".noMedia"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 84
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    :goto_1
    new-instance v1, Ljava/io/File;

    const-string v2, "temp"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 91
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 96
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 101
    :goto_2
    return-object v1

    .line 74
    :cond_2
    new-instance v0, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getDownloadCacheDirectory()Ljava/io/File;

    move-result-object v1

    const-string v2, "kikTemp"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method static synthetic a(Lcom/kik/cards/usermedia/a;)Lkik/a/e/v;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/kik/cards/usermedia/a;->b:Lkik/a/e/v;

    return-object v0
.end method


# virtual methods
.method public final a(IIZ)Lcom/kik/g/p;
    .locals 5

    .prologue
    .line 37
    invoke-static {}, Lcom/kik/cards/usermedia/a;->a()Ljava/io/File;

    move-result-object v0

    .line 38
    iget-object v1, p0, Lcom/kik/cards/usermedia/a;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.media.action.IMAGE_CAPTURE"

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const-string v3, "output"

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {v1, v2}, Lcom/kik/cards/web/CardsWebViewFragment;->a(Landroid/content/Intent;)Lcom/kik/g/p;

    move-result-object v1

    .line 40
    new-instance v2, Lcom/kik/cards/usermedia/b;

    invoke-direct {v2, p0, v0, p3}, Lcom/kik/cards/usermedia/b;-><init>(Lcom/kik/cards/usermedia/a;Ljava/io/File;Z)V

    invoke-static {v1, v2}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

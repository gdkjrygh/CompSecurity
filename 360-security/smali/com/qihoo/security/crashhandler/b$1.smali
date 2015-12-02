.class Lcom/qihoo/security/crashhandler/b$1;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/crashhandler/b;->a(Ljava/lang/Throwable;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:Lcom/qihoo/security/crashhandler/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/crashhandler/b;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 175
    iput-object p1, p0, Lcom/qihoo/security/crashhandler/b$1;->b:Lcom/qihoo/security/crashhandler/b;

    iput-object p2, p0, Lcom/qihoo/security/crashhandler/b$1;->a:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 178
    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 179
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/b$1;->b:Lcom/qihoo/security/crashhandler/b;

    iget-object v1, p0, Lcom/qihoo/security/crashhandler/b$1;->b:Lcom/qihoo/security/crashhandler/b;

    invoke-static {v1}, Lcom/qihoo/security/crashhandler/b;->a(Lcom/qihoo/security/crashhandler/b;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/crashhandler/b;->c(Landroid/content/Context;)V

    .line 180
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/b$1;->b:Lcom/qihoo/security/crashhandler/b;

    iget-object v1, p0, Lcom/qihoo/security/crashhandler/b$1;->a:Ljava/lang/Throwable;

    invoke-static {v0, v1}, Lcom/qihoo/security/crashhandler/b;->a(Lcom/qihoo/security/crashhandler/b;Ljava/lang/Throwable;)V

    .line 181
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/b$1;->b:Lcom/qihoo/security/crashhandler/b;

    invoke-static {v0}, Lcom/qihoo/security/crashhandler/b;->a(Lcom/qihoo/security/crashhandler/b;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/crashhandler/a;->a(Ljava/io/File;)V

    .line 182
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/b$1;->b:Lcom/qihoo/security/crashhandler/b;

    invoke-static {v0}, Lcom/qihoo/security/crashhandler/b;->a(Lcom/qihoo/security/crashhandler/b;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/crashhandler/a;->b(Ljava/io/File;)V

    .line 184
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/b$1;->b:Lcom/qihoo/security/crashhandler/b;

    invoke-static {v0}, Lcom/qihoo/security/crashhandler/b;->b(Lcom/qihoo/security/crashhandler/b;)Ljava/io/File;

    move-result-object v0

    .line 185
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 187
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/crashhandler/b$1;->b:Lcom/qihoo/security/crashhandler/b;

    invoke-static {v1}, Lcom/qihoo/security/crashhandler/b;->a(Lcom/qihoo/security/crashhandler/b;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo/security/e/a;->a(Landroid/content/Context;)Lcom/qihoo/security/e/a;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/e/a;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 193
    :cond_0
    :goto_0
    invoke-static {}, Landroid/os/Looper;->loop()V

    .line 194
    return-void

    .line 188
    :catch_0
    move-exception v0

    goto :goto_0
.end method

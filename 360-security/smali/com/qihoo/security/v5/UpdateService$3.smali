.class Lcom/qihoo/security/v5/UpdateService$3;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/v5/UpdateService;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/qihoo/security/v5/UpdateService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/v5/UpdateService;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 477
    iput-object p1, p0, Lcom/qihoo/security/v5/UpdateService$3;->b:Lcom/qihoo/security/v5/UpdateService;

    iput-object p2, p0, Lcom/qihoo/security/v5/UpdateService$3;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    const/16 v4, 0x64

    .line 480
    new-instance v2, Ljava/io/File;

    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$3;->b:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdateService;->v(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$3;->a:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 481
    const/4 v1, 0x0

    .line 483
    :try_start_0
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/FileReader;

    invoke-direct {v3, v2}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 484
    :try_start_1
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    .line 485
    if-eqz v1, :cond_0

    .line 486
    const-string/jumbo v2, "\\d{1,3}"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    .line 487
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 488
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 489
    invoke-static {v1}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    .line 490
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-gt v2, v4, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ltz v2, :cond_0

    .line 491
    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    .line 492
    const/16 v3, 0x65

    invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    .line 493
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-nez v3, :cond_1

    .line 497
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$3;->b:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->w(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "user_ex_v3"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 531
    :cond_0
    :goto_0
    return-void

    .line 499
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v4, :cond_2

    .line 503
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$3;->b:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->x(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "user_ex_v3"

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 523
    :catch_0
    move-exception v1

    .line 524
    :goto_1
    if-eqz v0, :cond_0

    .line 526
    :try_start_2
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 527
    :catch_1
    move-exception v0

    goto :goto_0

    .line 506
    :cond_2
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v2, v1, :cond_3

    .line 510
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$3;->b:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->y(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "user_ex_v3"

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    goto :goto_0

    .line 516
    :cond_3
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService$3;->b:Lcom/qihoo/security/v5/UpdateService;

    invoke-static {v1}, Lcom/qihoo/security/v5/UpdateService;->z(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "user_ex_v3"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    .line 523
    :catch_2
    move-exception v0

    move-object v0, v1

    goto :goto_1
.end method

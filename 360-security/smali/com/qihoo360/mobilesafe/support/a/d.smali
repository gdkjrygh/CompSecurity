.class public Lcom/qihoo360/mobilesafe/support/a/d;
.super Lcom/qihoo360/mobilesafe/support/a/c;
.source "360Security"


# static fields
.field static i:Ljava/lang/Process;

.field private static j:Ljava/lang/reflect/Method;

.field private static k:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static l:Lcom/qihoo360/mobilesafe/support/a/b;

.field private static m:Ljava/lang/String;

.field private static n:Ljava/lang/String;

.field private static o:Ljava/lang/String;

.field private static p:I

.field private static q:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 39
    sput-object v1, Lcom/qihoo360/mobilesafe/support/a/d;->m:Ljava/lang/String;

    .line 40
    sput-object v1, Lcom/qihoo360/mobilesafe/support/a/d;->n:Ljava/lang/String;

    .line 41
    sput-object v1, Lcom/qihoo360/mobilesafe/support/a/d;->o:Ljava/lang/String;

    .line 43
    const/4 v0, 0x5

    sput v0, Lcom/qihoo360/mobilesafe/support/a/d;->p:I

    .line 44
    const/16 v0, 0x1f4

    sput v0, Lcom/qihoo360/mobilesafe/support/a/d;->q:I

    .line 683
    sput-object v1, Lcom/qihoo360/mobilesafe/support/a/d;->i:Ljava/lang/Process;

    .line 1047
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/support/a/c;-><init>(Landroid/content/Context;)V

    .line 33
    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;)I
    .locals 10

    .prologue
    const/4 v9, 0x3

    const/4 v5, 0x2

    const/4 v7, -0x1

    const/4 v8, 0x1

    const/4 v6, 0x0

    .line 695
    invoke-static {p1}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 696
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 846
    :goto_0
    return v7

    .line 701
    :cond_0
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/support/a/d;->b(Landroid/content/Context;)V

    .line 705
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/support/a/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 708
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 709
    invoke-static {p0, v8}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object v1

    .line 716
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/d;->k()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 718
    const-string/jumbo v3, "%s %s %s %s %s\n"

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    .line 719
    aput-object v0, v4, v6

    .line 720
    const-string/jumbo v0, "--class-name=com.qihoo360.server.RootServer --fixse2 --daemon --args"

    aput-object v0, v4, v8

    .line 721
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    aput-object v0, v4, v5

    aput-object v1, v4, v9

    const/4 v0, 0x4

    .line 722
    sget-object v1, Lcom/qihoo360/mobilesafe/support/a/d;->m:Ljava/lang/String;

    aput-object v1, v4, v0

    .line 718
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 734
    :goto_1
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->i:Ljava/lang/Process;

    .line 736
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 737
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->i:Ljava/lang/Process;

    invoke-virtual {v0}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    .line 741
    const-string/jumbo v0, "LD_LIBRARY_PATH"

    invoke-static {v0}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 742
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 743
    const-string/jumbo v0, "/system/lib:/vendor/lib"

    .line 745
    :cond_1
    const-string/jumbo v3, "export _LD_LIBRARY_PATH=%s\n"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 746
    aput-object v0, v4, v5

    .line 745
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 746
    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    .line 745
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    .line 747
    const-string/jumbo v3, "export LD_LIBRARY_PATH=%s\n"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 748
    aput-object v0, v4, v5

    .line 747
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 748
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 747
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 749
    const-string/jumbo v0, "export BOOTCLASSPATH=%s\n"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    .line 750
    const-string/jumbo v5, "BOOTCLASSPATH"

    invoke-static {v5}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    .line 749
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 750
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 749
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 751
    const-string/jumbo v0, "export PATH=%s\n"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string/jumbo v5, "PATH"

    invoke-static {v5}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 752
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 751
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 754
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 755
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "export RT_SERVICE_NAME="

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 756
    sget-object v3, Lcom/qihoo360/mobilesafe/support/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v3, "\n"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 755
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 758
    :cond_2
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 759
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "export RT_PROCESS_NAME="

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 760
    sget-object v3, Lcom/qihoo360/mobilesafe/support/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v3, "\n"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 759
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 765
    :cond_3
    const-string/jumbo v0, "export CLASSPATH=:%s\n"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    sget-object v5, Lcom/qihoo360/mobilesafe/support/a/d;->m:Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 766
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 765
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 767
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 774
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    move v0, v6

    .line 776
    :goto_2
    const/16 v1, 0x28

    if-lt v0, v1, :cond_6

    .line 790
    :cond_4
    const-string/jumbo v0, "exit 100\n"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 791
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 793
    :try_start_1
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 799
    :goto_3
    :try_start_2
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/d;->n()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 818
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->l:Lcom/qihoo360/mobilesafe/support/a/b;

    if-eqz v0, :cond_7

    .line 819
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->l:Lcom/qihoo360/mobilesafe/support/a/b;

    const-string/jumbo v1, "getcontext"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    invoke-interface/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a/b;->c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)[B

    move-result-object v0

    .line 820
    if-eqz v0, :cond_7

    array-length v1, v0

    const/16 v2, 0x8

    if-le v1, v2, :cond_7

    .line 821
    new-instance v1, Ljava/lang/String;

    const-string/jumbo v2, "utf-8"

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 822
    const-string/jumbo v0, "shell"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    if-eqz v0, :cond_7

    .line 832
    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/d$4;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/support/a/d$4;-><init>()V

    .line 844
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    move v7, v8

    .line 823
    goto/16 :goto_0

    .line 725
    :cond_5
    const-string/jumbo v3, "%s %s %s %s %s\n"

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    .line 726
    aput-object v0, v4, v6

    .line 727
    const-string/jumbo v0, "--class-name=com.qihoo360.server.RootServer --fixse --daemon --args"

    aput-object v0, v4, v8

    .line 728
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    aput-object v0, v4, v5

    aput-object v1, v4, v9

    const/4 v0, 0x4

    .line 729
    sget-object v1, Lcom/qihoo360/mobilesafe/support/a/d;->m:Ljava/lang/String;

    aput-object v1, v4, v0

    .line 725
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 724
    goto/16 :goto_1

    .line 777
    :cond_6
    :try_start_3
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v1

    if-nez v1, :cond_4

    .line 778
    add-int/lit8 v0, v0, 0x1

    .line 780
    const-wide/16 v4, 0x3e8

    :try_start_4
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    .line 781
    :catch_0
    move-exception v1

    goto :goto_2

    .line 830
    :catch_1
    move-exception v0

    .line 832
    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/d$4;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/support/a/d$4;-><init>()V

    .line 844
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 846
    :goto_4
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v6

    :goto_5
    move v7, v0

    goto/16 :goto_0

    .line 831
    :catchall_0
    move-exception v0

    .line 832
    new-instance v1, Lcom/qihoo360/mobilesafe/support/a/d$4;

    invoke-direct {v1}, Lcom/qihoo360/mobilesafe/support/a/d$4;-><init>()V

    .line 844
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 845
    throw v0

    .line 832
    :cond_7
    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/d$4;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/support/a/d$4;-><init>()V

    .line 844
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_4

    :cond_8
    move v0, v7

    .line 847
    goto :goto_5

    .line 794
    :catch_2
    move-exception v0

    goto/16 :goto_3
.end method

.method public static a(Ljava/lang/String;)Landroid/os/IBinder;
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 84
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->j:Ljava/lang/reflect/Method;

    if-nez v0, :cond_2

    .line 85
    const-class v2, Lcom/qihoo360/mobilesafe/support/a/d;

    monitor-enter v2

    .line 86
    :try_start_0
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->j:Ljava/lang/reflect/Method;

    if-nez v0, :cond_1

    .line 87
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->k:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 89
    :try_start_1
    const-string/jumbo v0, "android.os.ServiceManager"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->k:Ljava/lang/Class;

    .line 90
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->k:Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 91
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->k:Ljava/lang/Class;

    const-string/jumbo v3, "getService"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    const-class v6, Ljava/lang/String;

    aput-object v6, v4, v5

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->j:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    :cond_0
    :goto_0
    :try_start_2
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->j:Ljava/lang/reflect/Method;

    if-nez v0, :cond_1

    .line 96
    monitor-exit v2

    move-object v0, v1

    .line 105
    :goto_1
    return-object v0

    .line 85
    :cond_1
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 102
    :cond_2
    :try_start_3
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->j:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p0, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    .line 85
    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    .line 103
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 105
    goto :goto_1

    .line 93
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method private static final a(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 627
    new-instance v2, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v3, "/lib"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 628
    const-string/jumbo v3, "ap"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 627
    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 629
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 630
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    .line 631
    const-string/jumbo v3, "ap"

    .line 630
    invoke-static {p0, v1, v3}, Lcom/qihoo360/mobilesafe/support/a/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    .line 631
    if-eqz v1, :cond_0

    .line 632
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 665
    :goto_0
    return-object v0

    .line 637
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 641
    :goto_1
    if-nez v1, :cond_1

    .line 642
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 638
    :catch_0
    move-exception v1

    move-object v1, v0

    .line 639
    goto :goto_1

    .line 646
    :cond_1
    :try_start_1
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 647
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    .line 648
    const-string/jumbo v3, "ap"

    invoke-virtual {v1, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    .line 649
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 650
    const/16 v4, 0x1000

    new-array v4, v4, [B

    .line 652
    :goto_2
    invoke-virtual {v1, v4}, Ljava/io/InputStream;->read([B)I

    move-result v5

    if-gtz v5, :cond_2

    .line 655
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->flush()V

    .line 656
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    .line 657
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 664
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1ed

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/support/NativeManager;->chmod(Ljava/lang/String;I)I

    .line 665
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 653
    :cond_2
    const/4 v6, 0x0

    :try_start_2
    invoke-virtual {v3, v4, v6, v5}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    .line 658
    :catch_1
    move-exception v1

    .line 659
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    .line 660
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/support/a/d;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1049
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/support/a/d;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private final a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 1051
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_1

    .line 1052
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/d;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1051
    const/4 v0, 0x1

    .line 1053
    :goto_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/d;->g:Landroid/content/Context;

    const-string/jumbo v2, "rt_server.jar"

    invoke-static {v1, v2}, Lcom/qihoo360/mobilesafe/support/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1054
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/d;->g:Landroid/content/Context;

    const-string/jumbo v3, "rt_st"

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/support/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1055
    sput-object v1, Lcom/qihoo360/mobilesafe/support/a/d;->m:Ljava/lang/String;

    .line 1056
    sput-object v2, Lcom/qihoo360/mobilesafe/support/a/d;->o:Ljava/lang/String;

    .line 1058
    :try_start_0
    sget-object v2, Lcom/qihoo360/mobilesafe/support/a/d;->m:Ljava/lang/String;

    const/16 v3, 0x1a4

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/support/NativeManager;->chmod(Ljava/lang/String;I)I

    .line 1059
    sget-object v2, Lcom/qihoo360/mobilesafe/support/a/d;->o:Ljava/lang/String;

    const/16 v3, 0x1ed

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/support/NativeManager;->chmod(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 1065
    :goto_1
    if-nez v0, :cond_2

    .line 1066
    const/4 v0, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/qihoo360/mobilesafe/support/a/d;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1068
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->o:Ljava/lang/String;

    invoke-virtual {p0, v1, v0}, Lcom/qihoo360/mobilesafe/support/a/d;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1082
    :cond_0
    :goto_2
    monitor-enter p1

    .line 1083
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 1082
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1086
    return-void

    .line 1051
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 1071
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v0, v2, :cond_3

    .line 1072
    invoke-direct {p0, v1}, Lcom/qihoo360/mobilesafe/support/a/d;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1073
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/d;->e:Z

    if-eqz v0, :cond_0

    .line 1074
    const-string/jumbo v0, "RootClient"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "solution 2 failed:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 1079
    :cond_3
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d;->g:Landroid/content/Context;

    const-string/jumbo v1, "su"

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/support/a/d;->a(Landroid/content/Context;Ljava/lang/String;)I

    goto :goto_2

    .line 1082
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 1060
    :catch_0
    move-exception v2

    goto :goto_1
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 10

    .prologue
    const/4 v0, 0x1

    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 582
    .line 585
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 589
    :goto_0
    if-nez v2, :cond_0

    .line 623
    :goto_1
    return v0

    .line 586
    :catch_0
    move-exception v2

    move-object v2, v3

    .line 587
    goto :goto_0

    .line 594
    :cond_0
    :try_start_1
    invoke-virtual {v2, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v4

    .line 595
    :try_start_2
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_c
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 596
    const/16 v3, 0x1000

    :try_start_3
    new-array v5, v3, [B

    .line 597
    const/16 v3, 0x1000

    new-array v6, v3, [B

    .line 600
    :cond_1
    invoke-virtual {v4, v5}, Ljava/io/InputStream;->read([B)I

    move-result v7

    .line 601
    invoke-virtual {v2, v6}, Ljava/io/InputStream;->read([B)I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_d
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-result v3

    .line 602
    if-eq v7, v3, :cond_2

    .line 615
    :try_start_4
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 619
    :goto_2
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    :goto_3
    move v0, v1

    .line 603
    goto :goto_1

    :cond_2
    move v3, v1

    .line 605
    :goto_4
    if-lt v3, v7, :cond_3

    .line 599
    if-gtz v7, :cond_1

    .line 615
    :try_start_6
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7

    .line 619
    :goto_5
    :try_start_7
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    goto :goto_1

    .line 620
    :catch_1
    move-exception v1

    goto :goto_1

    .line 606
    :cond_3
    :try_start_8
    aget-byte v8, v5, v3

    aget-byte v9, v6, v3
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_d
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    if-eq v8, v9, :cond_4

    .line 615
    :try_start_9
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    .line 619
    :goto_6
    :try_start_a
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6

    :goto_7
    move v0, v1

    .line 607
    goto :goto_1

    .line 605
    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 612
    :catch_2
    move-exception v0

    move-object v0, v3

    .line 615
    :goto_8
    :try_start_b
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_8

    .line 619
    :goto_9
    :try_start_c
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_9

    :goto_a
    move v0, v1

    .line 623
    goto :goto_1

    .line 613
    :catchall_0
    move-exception v0

    move-object v2, v3

    move-object v4, v3

    .line 615
    :goto_b
    :try_start_d
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_a

    .line 619
    :goto_c
    :try_start_e
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_b

    .line 622
    :goto_d
    throw v0

    .line 616
    :catch_3
    move-exception v0

    goto :goto_2

    .line 620
    :catch_4
    move-exception v0

    goto :goto_3

    .line 616
    :catch_5
    move-exception v0

    goto :goto_6

    .line 620
    :catch_6
    move-exception v0

    goto :goto_7

    .line 616
    :catch_7
    move-exception v1

    goto :goto_5

    :catch_8
    move-exception v2

    goto :goto_9

    .line 620
    :catch_9
    move-exception v0

    goto :goto_a

    .line 616
    :catch_a
    move-exception v1

    goto :goto_c

    .line 620
    :catch_b
    move-exception v1

    goto :goto_d

    .line 613
    :catchall_1
    move-exception v0

    move-object v2, v3

    goto :goto_b

    :catchall_2
    move-exception v0

    goto :goto_b

    .line 612
    :catch_c
    move-exception v0

    move-object v0, v3

    move-object v3, v4

    goto :goto_8

    :catch_d
    move-exception v0

    move-object v0, v2

    move-object v3, v4

    goto :goto_8
.end method

.method private final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x0

    const/4 v0, 0x1

    .line 1125
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1126
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1133
    :goto_0
    return v0

    .line 1129
    :cond_0
    new-array v2, v6, [Ljava/lang/String;

    .line 1130
    const-string/jumbo v3, "cp %s %s"

    new-array v4, v6, [Ljava/lang/Object;

    aput-object p1, v4, v5

    aput-object p2, v4, v0

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    .line 1131
    const-string/jumbo v3, "chmod %s %s"

    new-array v4, v6, [Ljava/lang/Object;

    aput-object p3, v4, v5

    aput-object p2, v4, v0

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    .line 1129
    invoke-direct {p0, v2}, Lcom/qihoo360/mobilesafe/support/a/d;->a([Ljava/lang/String;)Z

    .line 1133
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    goto :goto_0
.end method

.method private final a([Ljava/lang/String;)Z
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 1088
    if-eqz p1, :cond_0

    array-length v1, p1

    if-nez v1, :cond_1

    .line 1089
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "No cmds specified"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1092
    :cond_1
    const/4 v2, 0x0

    .line 1094
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    const-string/jumbo v3, "su"

    invoke-virtual {v1, v3}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v3

    .line 1095
    invoke-virtual {v3}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    .line 1096
    array-length v4, p1

    move v1, v0

    :goto_0
    if-lt v1, v4, :cond_4

    .line 1100
    const-string/jumbo v1, "exit 0\n"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/OutputStream;->write([B)V

    .line 1101
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    .line 1102
    invoke-virtual {v3}, Ljava/lang/Process;->waitFor()I

    .line 1103
    invoke-virtual {v3}, Ljava/lang/Process;->destroy()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1105
    if-eqz v2, :cond_2

    .line 1106
    :try_start_1
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1115
    :cond_2
    const/4 v0, 0x1

    :cond_3
    :goto_1
    return v0

    .line 1096
    :cond_4
    :try_start_2
    aget-object v5, p1, v1

    .line 1097
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v5, "\n"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/io/OutputStream;->write([B)V

    .line 1098
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1096
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1104
    :catchall_0
    move-exception v1

    .line 1105
    if-eqz v2, :cond_5

    .line 1106
    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    .line 1108
    :cond_5
    throw v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 1109
    :catch_0
    move-exception v1

    .line 1110
    iget-boolean v2, p0, Lcom/qihoo360/mobilesafe/support/a/d;->e:Z

    if-eqz v2, :cond_3

    .line 1111
    const-string/jumbo v2, "RootClient"

    const-string/jumbo v3, ""

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method private static b(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 669
    const-class v1, Lcom/qihoo360/mobilesafe/support/a/d;

    monitor-enter v1

    .line 670
    :try_start_0
    const-string/jumbo v0, "rt_server.jar"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 671
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "rt_server.jar"

    invoke-static {p0, v2, v3}, Lcom/qihoo360/mobilesafe/support/a/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 672
    const-string/jumbo v0, "rt_server.jar"

    invoke-static {p0, v0}, Lcom/qihoo360/mobilesafe/support/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->m:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 674
    :try_start_1
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->m:Ljava/lang/String;

    const/16 v2, 0x1a4

    invoke-static {v0, v2}, Lcom/qihoo360/mobilesafe/support/NativeManager;->chmod(Ljava/lang/String;I)I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 669
    :cond_0
    :goto_0
    :try_start_2
    monitor-exit v1

    .line 681
    return-void

    .line 677
    :cond_1
    sget-object v2, Lcom/qihoo360/mobilesafe/support/a/d;->m:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 678
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->m:Ljava/lang/String;

    goto :goto_0

    .line 669
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 675
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private final b(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 1141
    new-array v0, v2, [Ljava/lang/String;

    .line 1142
    const-string/jumbo v1, "mount -o remount,%s /system"

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v3

    .line 1141
    invoke-direct {p0, v0}, Lcom/qihoo360/mobilesafe/support/a/d;->a([Ljava/lang/String;)Z

    .line 1144
    return-void
.end method

.method private final c(Ljava/lang/String;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 1162
    :try_start_0
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/d;->o()Ljava/lang/String;

    move-result-object v2

    .line 1163
    const-string/jumbo v1, "/system/bin/ap32"

    .line 1164
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/d;->p()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1165
    const-string/jumbo v3, "rw"

    invoke-direct {p0, v3}, Lcom/qihoo360/mobilesafe/support/a/d;->b(Ljava/lang/String;)V

    .line 1166
    const-string/jumbo v3, "0755"

    invoke-direct {p0, v2, v1, v3}, Lcom/qihoo360/mobilesafe/support/a/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 1167
    iget-boolean v2, p0, Lcom/qihoo360/mobilesafe/support/a/d;->e:Z

    if-eqz v2, :cond_0

    .line 1168
    const-string/jumbo v2, "RootClient"

    const-string/jumbo v3, "samsung device"

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1170
    :cond_0
    const-string/jumbo v2, "ro"

    invoke-direct {p0, v2}, Lcom/qihoo360/mobilesafe/support/a/d;->b(Ljava/lang/String;)V

    .line 1184
    :goto_0
    invoke-virtual {p0, p1, v1}, Lcom/qihoo360/mobilesafe/support/a/d;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    .line 1186
    :cond_1
    :goto_1
    return v0

    .line 1172
    :cond_2
    new-instance v1, Ljava/io/File;

    iget-object v3, p0, Lcom/qihoo360/mobilesafe/support/a/d;->g:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    const-string/jumbo v4, "ap32"

    invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1173
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1174
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 1176
    :cond_3
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v1}, Lcom/qihoo360/common/utils/FileUtil;->copyFile(Ljava/io/File;Ljava/io/File;)Z

    .line 1177
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1180
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/io/File;->setExecutable(ZZ)Z

    .line 1181
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/io/File;->setReadable(ZZ)Z

    .line 1182
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    .line 1185
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method static synthetic h()V
    .locals 0

    .prologue
    .line 108
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/d;->j()V

    return-void
.end method

.method static synthetic i()Lcom/qihoo360/mobilesafe/support/a/b;
    .locals 1

    .prologue
    .line 37
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->l:Lcom/qihoo360/mobilesafe/support/a/b;

    return-object v0
.end method

.method private static j()V
    .locals 2

    .prologue
    .line 109
    const-class v1, Lcom/qihoo360/mobilesafe/support/a/d;

    monitor-enter v1

    .line 110
    :try_start_0
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->l:Lcom/qihoo360/mobilesafe/support/a/b;

    if-nez v0, :cond_0

    .line 111
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a/d;->a(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    .line 112
    if-eqz v0, :cond_0

    .line 113
    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a/b$a;->a(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/support/a/b;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->l:Lcom/qihoo360/mobilesafe/support/a/b;

    .line 109
    :cond_0
    monitor-exit v1

    .line 117
    return-void

    .line 109
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private static final k()Z
    .locals 2

    .prologue
    .line 537
    new-instance v0, Ljava/lang/String;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 538
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string/jumbo v1, "SM-N91"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static final l()Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 544
    :try_start_0
    const-string/jumbo v0, "android.os.SELinux"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 545
    const-string/jumbo v2, "isSELinuxEnabled"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 546
    const/4 v2, 0x0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 548
    :goto_0
    return v0

    .line 547
    :catch_0
    move-exception v0

    move v0, v1

    .line 548
    goto :goto_0
.end method

.method private static final m()Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 555
    :try_start_0
    const-string/jumbo v0, "android.os.SELinux"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 556
    const-string/jumbo v2, "isSELinuxEnforced"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 557
    const/4 v2, 0x0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 559
    :goto_0
    return v0

    .line 558
    :catch_0
    move-exception v0

    move v0, v1

    .line 559
    goto :goto_0
.end method

.method private static final n()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 564
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x12

    if-ge v1, v2, :cond_1

    .line 575
    :cond_0
    :goto_0
    return v0

    .line 568
    :cond_1
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/d;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 572
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/d;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 575
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private final o()Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 991
    const-string/jumbo v4, "/system/bin/app_process"

    .line 996
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    const-string/jumbo v2, "sh"

    invoke-virtual {v0, v2}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v5

    .line 997
    invoke-virtual {v5}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 998
    :try_start_1
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    .line 999
    invoke-virtual {v5}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v6

    invoke-direct {v0, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 998
    invoke-direct {v3, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1000
    :try_start_2
    const-string/jumbo v0, "ls -Z /system/bin\n"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 1001
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    .line 1003
    :cond_0
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    .line 1004
    if-eqz v0, :cond_7

    .line 1006
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 1007
    const/4 v1, 0x3

    aget-object v1, v0, v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 1008
    const/4 v6, 0x4

    aget-object v6, v0, v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    .line 1009
    const-string/jumbo v7, "u:object_r:zygote_exec:s0"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1010
    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v7, "/system/bin/"

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object v1

    .line 1011
    :try_start_3
    iget-boolean v4, p0, Lcom/qihoo360/mobilesafe/support/a/d;->e:Z

    if-eqz v4, :cond_4

    .line 1012
    array-length v4, v0

    const/4 v6, 0x5

    if-ne v4, v6, :cond_3

    .line 1014
    const-string/jumbo v0, "RootClient"

    const-string/jumbo v4, "common file"

    invoke-static {v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-object v0, v1

    .line 1027
    :goto_0
    :try_start_4
    const-string/jumbo v1, "exit 0\n"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/OutputStream;->write([B)V

    .line 1028
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    .line 1029
    invoke-virtual {v5}, Ljava/lang/Process;->waitFor()I

    .line 1030
    invoke-virtual {v5}, Ljava/lang/Process;->destroy()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1032
    if-eqz v3, :cond_1

    .line 1033
    :try_start_5
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    .line 1035
    :cond_1
    if-eqz v2, :cond_2

    .line 1036
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 1043
    :cond_2
    :goto_1
    return-object v0

    .line 1015
    :cond_3
    :try_start_6
    array-length v0, v0

    const/4 v4, 0x7

    if-ne v0, v4, :cond_4

    .line 1017
    const-string/jumbo v0, "RootClient"

    const-string/jumbo v4, "link file"

    invoke-static {v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :cond_4
    move-object v0, v1

    goto :goto_0

    .line 1031
    :catchall_0
    move-exception v0

    move-object v2, v1

    move-object v3, v4

    .line 1032
    :goto_2
    if-eqz v2, :cond_5

    .line 1033
    :try_start_7
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V

    .line 1035
    :cond_5
    if-eqz v1, :cond_6

    .line 1036
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 1038
    :cond_6
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 1039
    :catch_0
    move-exception v0

    move-object v1, v0

    move-object v0, v3

    .line 1041
    :goto_3
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 1039
    :catch_1
    move-exception v1

    goto :goto_3

    .line 1031
    :catchall_1
    move-exception v0

    move-object v3, v4

    move-object v8, v1

    move-object v1, v2

    move-object v2, v8

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object v8, v2

    move-object v2, v3

    move-object v3, v1

    move-object v1, v8

    goto :goto_2

    :catchall_4
    move-exception v1

    move-object v8, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v0

    move-object v0, v8

    goto :goto_2

    :cond_7
    move-object v0, v4

    goto :goto_0
.end method

.method private final p()Z
    .locals 2

    .prologue
    .line 1150
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string/jumbo v1, "samsung"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string/jumbo v1, "samsung"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method protected a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLcom/qihoo360/mobilesafe/support/a/a;J)Lcom/qihoo360/mobilesafe/support/a/c$a;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;ZZ",
            "Lcom/qihoo360/mobilesafe/support/a/a;",
            "J)",
            "Lcom/qihoo360/mobilesafe/support/a/c$a;"
        }
    .end annotation

    .prologue
    .line 202
    new-instance v4, Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-direct {v4}, Lcom/qihoo360/mobilesafe/support/a/c$a;-><init>()V

    .line 203
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/d;->g()V

    .line 208
    new-instance v12, Ljava/lang/Thread;

    new-instance v2, Lcom/qihoo360/mobilesafe/support/a/d$2;

    move-object v3, p0

    move/from16 v5, p5

    move-object/from16 v6, p6

    move-object v7, p1

    move-object v8, p2

    move-object/from16 v9, p3

    move-wide/from16 v10, p7

    invoke-direct/range {v2 .. v11}, Lcom/qihoo360/mobilesafe/support/a/d$2;-><init>(Lcom/qihoo360/mobilesafe/support/a/d;Lcom/qihoo360/mobilesafe/support/a/c$a;ZLcom/qihoo360/mobilesafe/support/a/a;Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)V

    invoke-direct {v12, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 259
    invoke-virtual {v12}, Ljava/lang/Thread;->start()V

    .line 261
    if-nez p5, :cond_1

    .line 262
    monitor-enter v4

    .line 264
    :try_start_0
    iget-boolean v2, v4, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    if-eqz v2, :cond_0

    .line 265
    move-wide/from16 v0, p7

    invoke-virtual {v4, v0, v1}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 262
    :cond_0
    :goto_0
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 274
    :cond_1
    iget-boolean v2, p0, Lcom/qihoo360/mobilesafe/support/a/d;->f:Z

    if-eqz v2, :cond_2

    .line 275
    const-string/jumbo v2, "RootClient"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v5, "wait exit = "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, v4, Lcom/qihoo360/mobilesafe/support/a/c$a;->a:I

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 292
    :cond_2
    return-object v4

    .line 266
    :catch_0
    move-exception v2

    .line 267
    :try_start_2
    iget-boolean v3, p0, Lcom/qihoo360/mobilesafe/support/a/d;->e:Z

    if-eqz v3, :cond_0

    .line 268
    const-string/jumbo v3, "RootClient"

    invoke-virtual {v2}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 262
    :catchall_0
    move-exception v2

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v2
.end method

.method public a()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 297
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/d;->g:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 338
    :cond_0
    :goto_0
    return v0

    .line 300
    :cond_1
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/d;->g:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/common/c/a;->a(Landroid/content/Context;)I

    move-result v1

    const v2, 0x30e12

    if-eq v1, v2, :cond_0

    .line 302
    const-class v2, Lcom/qihoo360/mobilesafe/support/a/d;

    monitor-enter v2

    .line 303
    :try_start_0
    sget-boolean v1, Lcom/qihoo360/mobilesafe/support/a/d;->h:Z

    if-eqz v1, :cond_3

    .line 304
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/d;->c()I

    move-result v1

    .line 307
    if-ltz v1, :cond_2

    const/16 v3, 0xb

    if-eq v1, v3, :cond_2

    .line 311
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/d;->b()Z

    .line 312
    const/4 v1, 0x0

    sput-object v1, Lcom/qihoo360/mobilesafe/support/a/d;->l:Lcom/qihoo360/mobilesafe/support/a/b;

    .line 314
    :cond_2
    const/4 v1, 0x0

    sput-boolean v1, Lcom/qihoo360/mobilesafe/support/a/d;->h:Z

    .line 317
    :cond_3
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/d;->j()V

    .line 318
    sget-object v1, Lcom/qihoo360/mobilesafe/support/a/d;->l:Lcom/qihoo360/mobilesafe/support/a/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_5

    .line 320
    :try_start_1
    sget-object v1, Lcom/qihoo360/mobilesafe/support/a/d;->l:Lcom/qihoo360/mobilesafe/support/a/b;

    invoke-interface {v1}, Lcom/qihoo360/mobilesafe/support/a/b;->a()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    :try_start_2
    monitor-exit v2

    goto :goto_0

    .line 302
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 321
    :catch_0
    move-exception v1

    .line 322
    const/4 v3, 0x0

    :try_start_3
    sput-object v3, Lcom/qihoo360/mobilesafe/support/a/d;->l:Lcom/qihoo360/mobilesafe/support/a/b;

    .line 323
    instance-of v1, v1, Landroid/os/DeadObjectException;

    if-eqz v1, :cond_4

    .line 324
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/d;->j()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 326
    :try_start_4
    sget-object v1, Lcom/qihoo360/mobilesafe/support/a/d;->l:Lcom/qihoo360/mobilesafe/support/a/b;

    if-eqz v1, :cond_4

    .line 327
    sget-object v1, Lcom/qihoo360/mobilesafe/support/a/d;->l:Lcom/qihoo360/mobilesafe/support/a/b;

    invoke-interface {v1}, Lcom/qihoo360/mobilesafe/support/a/b;->a()Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result v0

    :try_start_5
    monitor-exit v2

    goto :goto_0

    .line 328
    :catch_1
    move-exception v1

    .line 329
    iget-boolean v3, p0, Lcom/qihoo360/mobilesafe/support/a/d;->e:Z

    if-eqz v3, :cond_4

    .line 330
    const-string/jumbo v3, "RootClient"

    const-string/jumbo v4, "still failed"

    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 334
    :cond_4
    monitor-exit v2

    goto :goto_0

    .line 302
    :cond_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0
.end method

.method public a(J)Z
    .locals 4

    .prologue
    .line 342
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/d;->e:Z

    if-eqz v0, :cond_0

    .line 343
    const-string/jumbo v0, "RootClient"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "start to invoe startServer in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 346
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/d;->a()Z

    move-result v0

    .line 347
    iget-boolean v1, p0, Lcom/qihoo360/mobilesafe/support/a/d;->e:Z

    if-eqz v1, :cond_1

    .line 348
    const-string/jumbo v1, "RootClient"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "after start server "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 350
    :cond_1
    if-eqz v0, :cond_2

    .line 351
    const/4 v0, 0x1

    .line 352
    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 430
    if-nez p1, :cond_1

    .line 530
    :cond_0
    :goto_0
    return v0

    .line 433
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/d;->b()Z

    .line 435
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 436
    const-string/jumbo v2, "app_process"

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 440
    :cond_2
    if-eqz p2, :cond_0

    .line 442
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v2

    .line 443
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/support/a/d;->g:Landroid/content/Context;

    invoke-static {v3}, Lcom/qihoo360/mobilesafe/support/a/h;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/qihoo360/mobilesafe/support/a/d;->n:Ljava/lang/String;

    .line 444
    const-string/jumbo v3, "%s %s %s %s %s %s&\n"

    const/4 v4, 0x6

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p2, v4, v0

    aput-object v2, v4, v1

    const/4 v2, 0x2

    const-string/jumbo v5, "com.qihoo360.server.RootServer"

    aput-object v5, v4, v2

    const/4 v2, 0x3

    .line 445
    iget-object v5, p0, Lcom/qihoo360/mobilesafe/support/a/d;->g:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v5

    iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    aput-object v5, v4, v2

    const/4 v2, 0x4

    sget-object v5, Lcom/qihoo360/mobilesafe/support/a/d;->n:Ljava/lang/String;

    aput-object v5, v4, v2

    const/4 v2, 0x5

    aput-object p1, v4, v2

    .line 444
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 448
    :try_start_0
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/d;->g:Landroid/content/Context;

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 450
    if-eqz v2, :cond_0

    move-object v3, v2

    .line 452
    :goto_1
    if-nez v3, :cond_5

    :cond_3
    move v2, v0

    .line 508
    :goto_2
    sget v3, Lcom/qihoo360/mobilesafe/support/a/d;->p:I

    if-lt v2, v3, :cond_9

    .line 523
    :cond_4
    :goto_3
    sget v3, Lcom/qihoo360/mobilesafe/support/a/d;->p:I

    if-gt v2, v3, :cond_0

    move v0, v1

    .line 526
    goto :goto_0

    .line 453
    :cond_5
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v2

    iput-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/d;->b:Ljava/lang/Process;

    .line 457
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/d;->b:Ljava/lang/Process;

    invoke-virtual {v2}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v5

    .line 459
    const-string/jumbo v2, "LD_LIBRARY_PATH"

    invoke-static {v2}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 460
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 461
    const-string/jumbo v2, "/system/lib:/vendor/lib"

    .line 464
    :cond_6
    const-string/jumbo v6, "export _LD_LIBRARY_PATH=%s\n"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    .line 465
    aput-object v2, v7, v8

    .line 464
    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 465
    invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    .line 464
    invoke-virtual {v5, v6}, Ljava/io/OutputStream;->write([B)V

    .line 466
    const-string/jumbo v6, "export LD_LIBRARY_PATH=%s\n"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    .line 467
    aput-object v2, v7, v8

    .line 466
    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 467
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    .line 466
    invoke-virtual {v5, v2}, Ljava/io/OutputStream;->write([B)V

    .line 468
    const-string/jumbo v2, "export BOOTCLASSPATH=%s\n"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    .line 469
    const-string/jumbo v8, "BOOTCLASSPATH"

    invoke-static {v8}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v6, v7

    .line 468
    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 469
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    .line 468
    invoke-virtual {v5, v2}, Ljava/io/OutputStream;->write([B)V

    .line 470
    const-string/jumbo v2, "export PATH=%s\n"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    .line 471
    const-string/jumbo v8, "PATH"

    invoke-static {v8}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v6, v7

    .line 470
    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 471
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    .line 470
    invoke-virtual {v5, v2}, Ljava/io/OutputStream;->write([B)V

    .line 472
    const-string/jumbo v2, "export CLASSPATH=%s\n"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object p1, v6, v7

    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/io/OutputStream;->write([B)V

    .line 474
    sget-object v2, Lcom/qihoo360/mobilesafe/support/a;->b:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 475
    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v6, "export RT_SERVICE_NAME="

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 476
    sget-object v6, Lcom/qihoo360/mobilesafe/support/a;->b:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v6, "\n"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    .line 475
    invoke-virtual {v5, v2}, Ljava/io/OutputStream;->write([B)V

    .line 478
    :cond_7
    sget-object v2, Lcom/qihoo360/mobilesafe/support/a;->c:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 479
    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v6, "export RT_PROCESS_NAME="

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 480
    sget-object v6, Lcom/qihoo360/mobilesafe/support/a;->c:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v6, "\n"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    .line 479
    invoke-virtual {v5, v2}, Ljava/io/OutputStream;->write([B)V

    .line 482
    :cond_8
    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/io/OutputStream;->write([B)V

    .line 483
    const-string/jumbo v2, "exit 100\n"

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/io/OutputStream;->write([B)V

    .line 484
    invoke-virtual {v5}, Ljava/io/OutputStream;->flush()V

    .line 485
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/d;->b:Ljava/lang/Process;

    invoke-virtual {v2}, Ljava/lang/Process;->waitFor()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v2

    .line 490
    :try_start_1
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 494
    :goto_4
    const/16 v5, 0x64

    if-eq v2, v5, :cond_3

    .line 495
    :try_start_2
    const-string/jumbo v2, "360s"

    invoke-virtual {v3, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 496
    const-string/jumbo v2, "su"

    move-object v3, v2

    goto/16 :goto_1

    .line 509
    :cond_9
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/d;->a()Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-result v3

    if-nez v3, :cond_a

    .line 510
    add-int/lit8 v2, v2, 0x1

    .line 512
    :try_start_3
    sget v3, Lcom/qihoo360/mobilesafe/support/a/d;->q:I

    int-to-long v4, v3

    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_2

    .line 513
    :catch_0
    move-exception v3

    goto/16 :goto_2

    .line 517
    :cond_a
    :try_start_4
    iget-boolean v3, p0, Lcom/qihoo360/mobilesafe/support/a/d;->e:Z

    if-eqz v3, :cond_4

    .line 518
    const-string/jumbo v3, "RootClient"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string/jumbo v5, "success at time "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto/16 :goto_3

    .line 527
    :catch_1
    move-exception v1

    goto/16 :goto_0

    .line 491
    :catch_2
    move-exception v5

    goto :goto_4
.end method

.method protected a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/qihoo360/mobilesafe/support/a/a;J)[B
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/qihoo360/mobilesafe/support/a/a;",
            "J)[B"
        }
    .end annotation

    .prologue
    .line 121
    new-instance v4, Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-direct {v4}, Lcom/qihoo360/mobilesafe/support/a/c$a;-><init>()V

    .line 122
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/d;->g()V

    .line 127
    new-instance v12, Ljava/lang/Thread;

    new-instance v2, Lcom/qihoo360/mobilesafe/support/a/d$1;

    move-object v3, p0

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-wide/from16 v10, p6

    invoke-direct/range {v2 .. v11}, Lcom/qihoo360/mobilesafe/support/a/d$1;-><init>(Lcom/qihoo360/mobilesafe/support/a/d;Lcom/qihoo360/mobilesafe/support/a/c$a;ZLcom/qihoo360/mobilesafe/support/a/a;Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)V

    invoke-direct {v12, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 178
    invoke-virtual {v12}, Ljava/lang/Thread;->start()V

    .line 179
    if-nez p4, :cond_1

    .line 180
    monitor-enter v4

    .line 182
    :try_start_0
    iget-boolean v2, v4, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    if-eqz v2, :cond_0

    .line 183
    move-wide/from16 v0, p6

    invoke-virtual {v4, v0, v1}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    :cond_0
    :goto_0
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 192
    :cond_1
    iget-boolean v2, p0, Lcom/qihoo360/mobilesafe/support/a/d;->f:Z

    if-eqz v2, :cond_2

    .line 193
    const-string/jumbo v2, "RootClient"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v5, "wait exit = "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, v4, Lcom/qihoo360/mobilesafe/support/a/c$a;->a:I

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 196
    :cond_2
    iget-object v2, v4, Lcom/qihoo360/mobilesafe/support/a/c$a;->c:[B

    return-object v2

    .line 184
    :catch_0
    move-exception v2

    .line 185
    :try_start_2
    iget-boolean v3, p0, Lcom/qihoo360/mobilesafe/support/a/d;->e:Z

    if-eqz v3, :cond_0

    .line 186
    const-string/jumbo v3, "RootClient"

    invoke-virtual {v2}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 180
    :catchall_0
    move-exception v2

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v2
.end method

.method protected b(J)V
    .locals 5

    .prologue
    .line 382
    new-instance v1, Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-direct {v1}, Lcom/qihoo360/mobilesafe/support/a/c$a;-><init>()V

    .line 385
    :try_start_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v2, Lcom/qihoo360/mobilesafe/support/a/d$3;

    invoke-direct {v2, p0, v1}, Lcom/qihoo360/mobilesafe/support/a/d$3;-><init>(Lcom/qihoo360/mobilesafe/support/a/d;Lcom/qihoo360/mobilesafe/support/a/c$a;)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 396
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 399
    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 401
    :try_start_1
    iget-boolean v0, v1, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    if-eqz v0, :cond_0

    .line 402
    invoke-virtual {v1, p1, p2}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 399
    :cond_0
    :goto_0
    :try_start_2
    monitor-exit v1

    .line 411
    :goto_1
    return-void

    .line 403
    :catch_0
    move-exception v0

    .line 404
    iget-boolean v2, p0, Lcom/qihoo360/mobilesafe/support/a/d;->e:Z

    if-eqz v2, :cond_0

    .line 405
    const-string/jumbo v2, "RootClient"

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 399
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 408
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public b()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 357
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/d;->j()V

    .line 358
    sget-object v1, Lcom/qihoo360/mobilesafe/support/a/d;->l:Lcom/qihoo360/mobilesafe/support/a/b;

    if-eqz v1, :cond_0

    .line 360
    :try_start_0
    sget-object v1, Lcom/qihoo360/mobilesafe/support/a/d;->l:Lcom/qihoo360/mobilesafe/support/a/b;

    invoke-interface {v1}, Lcom/qihoo360/mobilesafe/support/a/b;->b()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 365
    :cond_0
    :goto_0
    return v0

    .line 361
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public c()I
    .locals 2

    .prologue
    const/4 v0, -0x1

    .line 370
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/d;->j()V

    .line 371
    sget-object v1, Lcom/qihoo360/mobilesafe/support/a/d;->l:Lcom/qihoo360/mobilesafe/support/a/b;

    if-eqz v1, :cond_0

    .line 373
    :try_start_0
    sget-object v1, Lcom/qihoo360/mobilesafe/support/a/d;->l:Lcom/qihoo360/mobilesafe/support/a/b;

    invoke-interface {v1}, Lcom/qihoo360/mobilesafe/support/a/b;->c()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 378
    :cond_0
    :goto_0
    return v0

    .line 374
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public e()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 415
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/d;->g:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/common/c/a;->a(Landroid/content/Context;)I

    move-result v1

    const v2, 0x30e12

    if-ne v1, v2, :cond_0

    .line 423
    :goto_0
    return v0

    .line 419
    :cond_0
    :try_start_0
    sget-object v1, Lcom/qihoo360/mobilesafe/support/a;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a/d;->a(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    .line 420
    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a/b$a;->a(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/support/a/b;

    move-result-object v1

    .line 421
    invoke-interface {v1}, Lcom/qihoo360/mobilesafe/support/a/b;->a()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 422
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method g()V
    .locals 3

    .prologue
    .line 47
    const-class v1, Lcom/qihoo360/mobilesafe/support/a/d;

    monitor-enter v1

    .line 48
    :try_start_0
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->m:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 49
    new-instance v0, Ljava/io/File;

    sget-object v2, Lcom/qihoo360/mobilesafe/support/a/d;->m:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 50
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d;->g:Landroid/content/Context;

    const-string/jumbo v2, "rt_server.jar"

    invoke-static {v0, v2}, Lcom/qihoo360/mobilesafe/support/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    :try_start_1
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->m:Ljava/lang/String;

    const/16 v2, 0x1a4

    invoke-static {v0, v2}, Lcom/qihoo360/mobilesafe/support/NativeManager;->chmod(Ljava/lang/String;I)I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    :cond_0
    :goto_0
    :try_start_2
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->n:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 70
    new-instance v0, Ljava/io/File;

    sget-object v2, Lcom/qihoo360/mobilesafe/support/a/d;->n:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 71
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 72
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a/h;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->n:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    :cond_1
    :goto_1
    :try_start_3
    monitor-exit v1

    .line 81
    return-void

    .line 60
    :cond_2
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d;->g:Landroid/content/Context;

    const-string/jumbo v2, "rt_server.jar"

    invoke-static {v0, v2}, Lcom/qihoo360/mobilesafe/support/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->m:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 62
    :try_start_4
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->m:Ljava/lang/String;

    const/16 v2, 0x1a4

    invoke-static {v0, v2}, Lcom/qihoo360/mobilesafe/support/NativeManager;->chmod(Ljava/lang/String;I)I
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 63
    :catch_0
    move-exception v0

    goto :goto_0

    .line 75
    :cond_3
    :try_start_5
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a/h;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a/d;->n:Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1

    .line 77
    :catch_1
    move-exception v0

    goto :goto_1

    .line 47
    :catchall_0
    move-exception v0

    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v0

    .line 54
    :catch_2
    move-exception v0

    goto :goto_0
.end method

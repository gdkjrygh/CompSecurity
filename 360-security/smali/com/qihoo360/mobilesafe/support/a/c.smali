.class public abstract Lcom/qihoo360/mobilesafe/support/a/c;
.super Lcom/qihoo360/mobilesafe/support/a/b$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/mobilesafe/support/a/c$a;
    }
.end annotation


# static fields
.field public static h:Z

.field private static i:Z


# instance fields
.field protected final a:Ljava/lang/String;

.field protected b:Ljava/lang/Process;

.field protected c:Landroid/net/LocalServerSocket;

.field protected d:Ljava/lang/String;

.field protected e:Z

.field protected f:Z

.field protected g:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo360/mobilesafe/support/a/c;->h:Z

    .line 997
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo360/mobilesafe/support/a/c;->i:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 57
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/b$a;-><init>()V

    .line 33
    const-string/jumbo v0, "RootClient"

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c;->a:Ljava/lang/String;

    .line 40
    iput-boolean v1, p0, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    .line 41
    iput-boolean v1, p0, Lcom/qihoo360/mobilesafe/support/a/c;->f:Z

    .line 58
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/c;->g:Landroid/content/Context;

    .line 59
    return-void
.end method

.method private a(I)I
    .locals 4

    .prologue
    .line 790
    new-instance v1, Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-direct {v1}, Lcom/qihoo360/mobilesafe/support/a/c$a;-><init>()V

    .line 791
    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/c$6;

    invoke-direct {v0, p0, v1}, Lcom/qihoo360/mobilesafe/support/a/c$6;-><init>(Lcom/qihoo360/mobilesafe/support/a/c;Lcom/qihoo360/mobilesafe/support/a/c$a;)V

    .line 801
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 802
    monitor-enter v1

    .line 803
    :try_start_0
    iget-boolean v0, v1, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 805
    int-to-long v2, p1

    :try_start_1
    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 802
    :cond_0
    :goto_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 809
    iget v0, v1, Lcom/qihoo360/mobilesafe/support/a/c$a;->b:I

    return v0

    .line 802
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 806
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Lcom/qihoo360/mobilesafe/support/a/c;)Lcom/qihoo360/mobilesafe/support/a/c;
    .locals 2

    .prologue
    .line 1309
    if-nez p0, :cond_0

    .line 1310
    const/4 v0, 0x0

    .line 1313
    :goto_0
    return-object v0

    .line 1311
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    .line 1312
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c;->d:Ljava/lang/String;

    iput-object v1, v0, Lcom/qihoo360/mobilesafe/support/a/c;->d:Ljava/lang/String;

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/support/a/c;Z)Z
    .locals 1

    .prologue
    .line 1044
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/support/a/c;->a(Z)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/support/a/c;[B)Z
    .locals 1

    .prologue
    .line 927
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/support/a/c;->a([B)Z

    move-result v0

    return v0
.end method

.method private a(Z)Z
    .locals 11

    .prologue
    const/4 v4, 0x0

    const/16 v10, 0xa

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 1045
    .line 1046
    if-nez p1, :cond_3

    .line 1047
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/c;->d:Ljava/lang/String;

    if-nez v2, :cond_1

    .line 1108
    :cond_0
    :goto_0
    return v0

    .line 1049
    :cond_1
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/c;->i()Landroid/net/LocalSocket;

    move-result-object v2

    move-object v7, v2

    .line 1055
    :goto_1
    if-eqz v7, :cond_0

    .line 1064
    const/16 v2, 0x40

    new-array v8, v2, [B

    .line 1069
    :try_start_0
    new-instance v5, Ljava/io/DataOutputStream;

    invoke-virtual {v7}, Landroid/net/LocalSocket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-direct {v5, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1070
    :try_start_1
    const-string/jumbo v2, "\n"

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/io/DataOutputStream;->write([B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_f
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1073
    :try_start_2
    new-instance v3, Ljava/io/DataInputStream;

    invoke-virtual {v7}, Landroid/net/LocalSocket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_10
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1074
    :try_start_3
    invoke-virtual {v3, v8}, Ljava/io/DataInputStream;->read([B)I

    move-result v2

    .line 1079
    if-lez v2, :cond_4

    const/4 v2, 0x0

    aget-byte v2, v8, v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_11
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v2, v10, :cond_4

    .line 1110
    if-eqz v5, :cond_2

    .line 1112
    :try_start_4
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_6

    .line 1117
    :cond_2
    :goto_2
    :try_start_5
    invoke-virtual {v3}, Ljava/io/DataInputStream;->close()V

    .line 1118
    invoke-virtual {v7}, Landroid/net/LocalSocket;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_12

    :goto_3
    move v0, v1

    .line 1080
    goto :goto_0

    .line 1051
    :cond_3
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/c;->h()Landroid/net/LocalSocket;

    move-result-object v2

    move-object v7, v2

    goto :goto_1

    .line 1110
    :cond_4
    if-eqz v5, :cond_5

    .line 1112
    :try_start_6
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_7

    .line 1117
    :cond_5
    :goto_4
    :try_start_7
    invoke-virtual {v3}, Ljava/io/DataInputStream;->close()V

    .line 1118
    invoke-virtual {v7}, Landroid/net/LocalSocket;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    goto :goto_0

    .line 1119
    :catch_0
    move-exception v1

    goto :goto_0

    .line 1082
    :catch_1
    move-exception v2

    move v3, v0

    move-object v5, v4

    :goto_5
    move v6, v0

    .line 1084
    :goto_6
    const/4 v9, 0x3

    if-lt v6, v9, :cond_7

    .line 1110
    if-eqz v5, :cond_6

    .line 1112
    :try_start_8
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_b

    .line 1117
    :cond_6
    :goto_7
    :try_start_9
    invoke-virtual {v4}, Ljava/io/DataInputStream;->close()V

    .line 1118
    invoke-virtual {v7}, Landroid/net/LocalSocket;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2

    goto :goto_0

    .line 1119
    :catch_2
    move-exception v1

    goto :goto_0

    .line 1087
    :cond_7
    :try_start_a
    instance-of v9, v2, Ljava/io/IOException;

    if-eqz v9, :cond_b

    const-string/jumbo v9, "Try again"

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    if-eqz v3, :cond_b

    .line 1088
    invoke-virtual {v4, v8}, Ljava/io/DataInputStream;->read([B)I

    move-result v2

    .line 1089
    if-lez v2, :cond_9

    const/4 v2, 0x0

    aget-byte v2, v8, v2
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    if-ne v2, v10, :cond_9

    .line 1110
    if-eqz v5, :cond_8

    .line 1112
    :try_start_b
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_8

    .line 1117
    :cond_8
    :goto_8
    :try_start_c
    invoke-virtual {v4}, Ljava/io/DataInputStream;->close()V

    .line 1118
    invoke-virtual {v7}, Landroid/net/LocalSocket;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_e

    :goto_9
    move v0, v1

    .line 1093
    goto/16 :goto_0

    .line 1110
    :cond_9
    if-eqz v5, :cond_a

    .line 1112
    :try_start_d
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_9

    .line 1117
    :cond_a
    :goto_a
    :try_start_e
    invoke-virtual {v4}, Ljava/io/DataInputStream;->close()V

    .line 1118
    invoke-virtual {v7}, Landroid/net/LocalSocket;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_3

    goto/16 :goto_0

    .line 1119
    :catch_3
    move-exception v1

    goto/16 :goto_0

    .line 1110
    :cond_b
    if-eqz v5, :cond_c

    .line 1112
    :try_start_f
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_a

    .line 1117
    :cond_c
    :goto_b
    :try_start_10
    invoke-virtual {v4}, Ljava/io/DataInputStream;->close()V

    .line 1118
    invoke-virtual {v7}, Landroid/net/LocalSocket;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_4

    goto/16 :goto_0

    .line 1119
    :catch_4
    move-exception v1

    goto/16 :goto_0

    .line 1103
    :catch_5
    move-exception v2

    .line 1106
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    .line 1109
    :catchall_0
    move-exception v0

    move-object v5, v4

    .line 1110
    :goto_c
    if-eqz v5, :cond_d

    .line 1112
    :try_start_11
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_c

    .line 1117
    :cond_d
    :goto_d
    :try_start_12
    invoke-virtual {v4}, Ljava/io/DataInputStream;->close()V

    .line 1118
    invoke-virtual {v7}, Landroid/net/LocalSocket;->close()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_d

    .line 1121
    :goto_e
    throw v0

    .line 1113
    :catch_6
    move-exception v0

    goto/16 :goto_2

    :catch_7
    move-exception v1

    goto :goto_4

    :catch_8
    move-exception v0

    goto :goto_8

    :catch_9
    move-exception v1

    goto :goto_a

    :catch_a
    move-exception v1

    goto :goto_b

    :catch_b
    move-exception v1

    goto :goto_7

    :catch_c
    move-exception v1

    goto :goto_d

    .line 1119
    :catch_d
    move-exception v1

    goto :goto_e

    .line 1109
    :catchall_1
    move-exception v0

    goto :goto_c

    :catchall_2
    move-exception v0

    move-object v4, v3

    goto :goto_c

    .line 1119
    :catch_e
    move-exception v0

    goto :goto_9

    .line 1082
    :catch_f
    move-exception v2

    move v3, v0

    goto/16 :goto_5

    :catch_10
    move-exception v2

    move v3, v1

    goto/16 :goto_5

    :catch_11
    move-exception v2

    move-object v4, v3

    move v3, v1

    goto/16 :goto_5

    .line 1119
    :catch_12
    move-exception v0

    goto/16 :goto_3
.end method

.method private a([B)Z
    .locals 9

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 928
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/c;->h()Landroid/net/LocalSocket;

    move-result-object v6

    .line 929
    if-nez v6, :cond_0

    .line 973
    :goto_0
    return v0

    .line 933
    :cond_0
    const/16 v2, 0x40

    new-array v7, v2, [B

    .line 939
    :try_start_0
    new-instance v5, Ljava/io/DataOutputStream;

    invoke-virtual {v6}, Landroid/net/LocalSocket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-direct {v5, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_c
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 940
    :try_start_1
    invoke-virtual {v5, p1}, Ljava/io/DataOutputStream;->write([B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_d
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 943
    :try_start_2
    new-instance v3, Ljava/io/DataInputStream;

    invoke-virtual {v6}, Landroid/net/LocalSocket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_e
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 944
    :try_start_3
    invoke-virtual {v3, v7}, Ljava/io/DataInputStream;->read([B)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_f
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-result v2

    .line 945
    if-lez v2, :cond_2

    .line 975
    if-eqz v5, :cond_1

    .line 977
    :try_start_4
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    .line 982
    :cond_1
    :goto_1
    :try_start_5
    invoke-virtual {v3}, Ljava/io/DataInputStream;->close()V

    .line 983
    invoke-virtual {v6}, Landroid/net/LocalSocket;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_10

    :goto_2
    move v0, v1

    .line 946
    goto :goto_0

    .line 975
    :cond_2
    if-eqz v5, :cond_3

    .line 977
    :try_start_6
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 982
    :cond_3
    :goto_3
    :try_start_7
    invoke-virtual {v3}, Ljava/io/DataInputStream;->close()V

    .line 983
    invoke-virtual {v6}, Landroid/net/LocalSocket;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    goto :goto_0

    .line 984
    :catch_0
    move-exception v1

    goto :goto_0

    .line 969
    :catch_1
    move-exception v2

    .line 953
    :goto_4
    :try_start_8
    instance-of v8, v2, Ljava/io/IOException;

    if-eqz v8, :cond_7

    const-string/jumbo v8, "Try again"

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    if-eqz v3, :cond_7

    .line 954
    invoke-virtual {v4, v7}, Ljava/io/DataInputStream;->read([B)I
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    move-result v2

    .line 955
    if-lez v2, :cond_5

    .line 975
    if-eqz v5, :cond_4

    .line 977
    :try_start_9
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    .line 982
    :cond_4
    :goto_5
    :try_start_a
    invoke-virtual {v4}, Ljava/io/DataInputStream;->close()V

    .line 983
    invoke-virtual {v6}, Landroid/net/LocalSocket;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_b

    :goto_6
    move v0, v1

    .line 959
    goto :goto_0

    .line 975
    :cond_5
    if-eqz v5, :cond_6

    .line 977
    :try_start_b
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_7

    .line 982
    :cond_6
    :goto_7
    :try_start_c
    invoke-virtual {v4}, Ljava/io/DataInputStream;->close()V

    .line 983
    invoke-virtual {v6}, Landroid/net/LocalSocket;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_2

    goto :goto_0

    .line 984
    :catch_2
    move-exception v1

    goto :goto_0

    .line 975
    :cond_7
    if-eqz v5, :cond_8

    .line 977
    :try_start_d
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_8

    .line 982
    :cond_8
    :goto_8
    :try_start_e
    invoke-virtual {v4}, Ljava/io/DataInputStream;->close()V

    .line 983
    invoke-virtual {v6}, Landroid/net/LocalSocket;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_3

    goto :goto_0

    .line 984
    :catch_3
    move-exception v1

    goto :goto_0

    .line 974
    :catchall_0
    move-exception v0

    move-object v5, v4

    .line 975
    :goto_9
    if-eqz v5, :cond_9

    .line 977
    :try_start_f
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_9

    .line 982
    :cond_9
    :goto_a
    :try_start_10
    invoke-virtual {v4}, Ljava/io/DataInputStream;->close()V

    .line 983
    invoke-virtual {v6}, Landroid/net/LocalSocket;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_a

    .line 986
    :goto_b
    throw v0

    .line 978
    :catch_4
    move-exception v0

    goto :goto_1

    :catch_5
    move-exception v1

    goto :goto_3

    :catch_6
    move-exception v0

    goto :goto_5

    :catch_7
    move-exception v1

    goto :goto_7

    :catch_8
    move-exception v1

    goto :goto_8

    :catch_9
    move-exception v1

    goto :goto_a

    .line 984
    :catch_a
    move-exception v1

    goto :goto_b

    .line 974
    :catchall_1
    move-exception v0

    goto :goto_9

    :catchall_2
    move-exception v0

    move-object v4, v3

    goto :goto_9

    .line 984
    :catch_b
    move-exception v0

    goto :goto_6

    .line 948
    :catch_c
    move-exception v2

    move v3, v0

    move-object v5, v4

    goto :goto_4

    :catch_d
    move-exception v2

    move v3, v0

    goto :goto_4

    :catch_e
    move-exception v2

    move v3, v1

    goto :goto_4

    :catch_f
    move-exception v2

    move-object v4, v3

    move v3, v1

    goto :goto_4

    .line 984
    :catch_10
    move-exception v0

    goto/16 :goto_2
.end method

.method static synthetic b(Lcom/qihoo360/mobilesafe/support/a/c;)Landroid/net/LocalSocket;
    .locals 1

    .prologue
    .line 1281
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/c;->i()Landroid/net/LocalSocket;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLcom/qihoo360/mobilesafe/support/a/a;J)Z
    .locals 1
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
            "J)Z"
        }
    .end annotation

    .prologue
    .line 262
    invoke-virtual/range {p0 .. p8}, Lcom/qihoo360/mobilesafe/support/a/c;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLcom/qihoo360/mobilesafe/support/a/a;J)Lcom/qihoo360/mobilesafe/support/a/c$a;

    move-result-object v0

    .line 263
    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/support/a/c$a;->a()Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/qihoo360/mobilesafe/support/a/c;)I
    .locals 1

    .prologue
    .line 818
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/c;->g()I

    move-result v0

    return v0
.end method

.method private g()I
    .locals 8

    .prologue
    const/4 v4, 0x0

    const/4 v0, -0x1

    .line 819
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c;->d:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 891
    :cond_0
    :goto_0
    return v0

    .line 821
    :cond_1
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/c;->i()Landroid/net/LocalSocket;

    move-result-object v6

    .line 824
    if-eqz v6, :cond_0

    .line 834
    const/4 v2, 0x0

    .line 838
    :try_start_0
    new-instance v5, Ljava/io/DataOutputStream;

    invoke-virtual {v6}, Landroid/net/LocalSocket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v5, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_d
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 839
    :try_start_1
    const-string/jumbo v1, "VERSION\n"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/io/DataOutputStream;->write([B)V

    .line 841
    const/4 v2, 0x1

    .line 845
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-virtual {v6}, Landroid/net/LocalSocket;->getInputStream()Ljava/io/InputStream;

    move-result-object v7

    invoke-direct {v1, v7}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v3, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_e
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 846
    :try_start_2
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    .line 850
    if-eqz v1, :cond_3

    .line 851
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_f
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result v0

    .line 879
    if-eqz v5, :cond_2

    .line 881
    :try_start_3
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6

    .line 886
    :cond_2
    :goto_1
    :try_start_4
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    .line 887
    invoke-virtual {v6}, Landroid/net/LocalSocket;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_0

    .line 888
    :catch_0
    move-exception v1

    goto :goto_0

    .line 879
    :cond_3
    if-eqz v5, :cond_4

    .line 881
    :try_start_5
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_7

    .line 886
    :cond_4
    :goto_2
    :try_start_6
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    .line 887
    invoke-virtual {v6}, Landroid/net/LocalSocket;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_0

    .line 888
    :catch_1
    move-exception v1

    goto :goto_0

    .line 874
    :catch_2
    move-exception v1

    .line 859
    :goto_3
    :try_start_7
    instance-of v5, v1, Ljava/io/IOException;

    if-eqz v5, :cond_8

    const-string/jumbo v5, "Try again"

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    if-eqz v2, :cond_8

    .line 860
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    .line 864
    if-eqz v1, :cond_6

    .line 865
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    move-result v0

    .line 879
    if-eqz v4, :cond_5

    .line 881
    :try_start_8
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_8

    .line 886
    :cond_5
    :goto_4
    :try_start_9
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    .line 887
    invoke-virtual {v6}, Landroid/net/LocalSocket;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    goto :goto_0

    .line 888
    :catch_3
    move-exception v1

    goto :goto_0

    .line 879
    :cond_6
    if-eqz v4, :cond_7

    .line 881
    :try_start_a
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    .line 886
    :cond_7
    :goto_5
    :try_start_b
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    .line 887
    invoke-virtual {v6}, Landroid/net/LocalSocket;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4

    goto/16 :goto_0

    .line 888
    :catch_4
    move-exception v1

    goto/16 :goto_0

    .line 879
    :cond_8
    if-eqz v4, :cond_9

    .line 881
    :try_start_c
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_a

    .line 886
    :cond_9
    :goto_6
    :try_start_d
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    .line 887
    invoke-virtual {v6}, Landroid/net/LocalSocket;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5

    goto/16 :goto_0

    .line 888
    :catch_5
    move-exception v1

    goto/16 :goto_0

    .line 878
    :catchall_0
    move-exception v0

    move-object v5, v4

    .line 879
    :goto_7
    if-eqz v5, :cond_a

    .line 881
    :try_start_e
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_b

    .line 886
    :cond_a
    :goto_8
    :try_start_f
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V

    .line 887
    invoke-virtual {v6}, Landroid/net/LocalSocket;->close()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_c

    .line 890
    :goto_9
    throw v0

    .line 882
    :catch_6
    move-exception v1

    goto :goto_1

    :catch_7
    move-exception v1

    goto :goto_2

    :catch_8
    move-exception v1

    goto :goto_4

    :catch_9
    move-exception v1

    goto :goto_5

    :catch_a
    move-exception v1

    goto :goto_6

    :catch_b
    move-exception v1

    goto :goto_8

    .line 888
    :catch_c
    move-exception v1

    goto :goto_9

    .line 878
    :catchall_1
    move-exception v0

    goto :goto_7

    :catchall_2
    move-exception v0

    move-object v4, v3

    goto :goto_7

    :catchall_3
    move-exception v0

    move-object v5, v4

    move-object v4, v3

    goto :goto_7

    .line 854
    :catch_d
    move-exception v1

    move-object v3, v4

    goto :goto_3

    :catch_e
    move-exception v1

    move-object v3, v4

    move-object v4, v5

    goto :goto_3

    :catch_f
    move-exception v1

    move-object v4, v5

    goto :goto_3
.end method

.method private h()Landroid/net/LocalSocket;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 1254
    new-instance v2, Landroid/net/LocalSocketAddress;

    const-string/jumbo v1, "daemon_rt_server"

    sget-object v3, Landroid/net/LocalSocketAddress$Namespace;->RESERVED:Landroid/net/LocalSocketAddress$Namespace;

    invoke-direct {v2, v1, v3}, Landroid/net/LocalSocketAddress;-><init>(Ljava/lang/String;Landroid/net/LocalSocketAddress$Namespace;)V

    .line 1255
    new-instance v1, Landroid/net/LocalSocket;

    invoke-direct {v1}, Landroid/net/LocalSocket;-><init>()V

    .line 1257
    :try_start_0
    invoke-virtual {v1, v2}, Landroid/net/LocalSocket;->connect(Landroid/net/LocalSocketAddress;)V

    .line 1258
    invoke-virtual {v1}, Landroid/net/LocalSocket;->getPeerCredentials()Landroid/net/Credentials;

    move-result-object v2

    .line 1259
    invoke-virtual {v2}, Landroid/net/Credentials;->getUid()I

    move-result v2

    .line 1263
    if-eqz v2, :cond_1

    .line 1264
    invoke-virtual {v1}, Landroid/net/LocalSocket;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1273
    :cond_0
    :goto_0
    return-object v0

    .line 1267
    :catch_0
    move-exception v1

    .line 1268
    iget-boolean v2, p0, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v2, :cond_0

    .line 1269
    const-string/jumbo v2, "RootClient"

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 1273
    goto :goto_0
.end method

.method private i()Landroid/net/LocalSocket;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 1282
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c;->d:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 1305
    :cond_0
    :goto_0
    return-object v0

    .line 1285
    :cond_1
    new-instance v2, Landroid/net/LocalSocketAddress;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c;->d:Ljava/lang/String;

    sget-object v3, Landroid/net/LocalSocketAddress$Namespace;->ABSTRACT:Landroid/net/LocalSocketAddress$Namespace;

    invoke-direct {v2, v1, v3}, Landroid/net/LocalSocketAddress;-><init>(Ljava/lang/String;Landroid/net/LocalSocketAddress$Namespace;)V

    .line 1286
    new-instance v1, Landroid/net/LocalSocket;

    invoke-direct {v1}, Landroid/net/LocalSocket;-><init>()V

    .line 1288
    :try_start_0
    invoke-virtual {v1, v2}, Landroid/net/LocalSocket;->connect(Landroid/net/LocalSocketAddress;)V

    .line 1289
    invoke-virtual {v1}, Landroid/net/LocalSocket;->getPeerCredentials()Landroid/net/Credentials;

    move-result-object v2

    .line 1290
    invoke-virtual {v2}, Landroid/net/Credentials;->getUid()I

    move-result v2

    .line 1294
    if-eqz v2, :cond_2

    .line 1295
    invoke-virtual {v1}, Landroid/net/LocalSocket;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1298
    :catch_0
    move-exception v1

    .line 1299
    iget-boolean v2, p0, Lcom/qihoo360/mobilesafe/support/a/c;->f:Z

    if-eqz v2, :cond_0

    .line 1300
    const-string/jumbo v2, "RootClient"

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 1305
    goto :goto_0
.end method


# virtual methods
.method protected a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLcom/qihoo360/mobilesafe/support/a/a;J)Lcom/qihoo360/mobilesafe/support/a/c$a;
    .locals 7
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
    .line 119
    .line 120
    new-instance v2, Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-direct {v2}, Lcom/qihoo360/mobilesafe/support/a/c$a;-><init>()V

    .line 121
    if-eqz p4, :cond_1

    .line 122
    invoke-static {p1, p2, p3}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)[B

    move-result-object v5

    .line 126
    :goto_0
    if-eqz v5, :cond_0

    array-length v0, v5

    if-nez v0, :cond_2

    .line 245
    :cond_0
    :goto_1
    return-object v2

    .line 124
    :cond_1
    invoke-static {p1, p2}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Ljava/lang/String;Ljava/util/List;)[B

    move-result-object v5

    goto :goto_0

    .line 135
    :cond_2
    new-instance v6, Ljava/lang/Thread;

    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/c$1;

    move-object v1, p0

    move v3, p5

    move-object v4, p6

    invoke-direct/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a/c$1;-><init>(Lcom/qihoo360/mobilesafe/support/a/c;Lcom/qihoo360/mobilesafe/support/a/c$a;ZLcom/qihoo360/mobilesafe/support/a/a;[B)V

    invoke-direct {v6, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 212
    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    .line 214
    if-nez p5, :cond_4

    .line 215
    monitor-enter v2

    .line 217
    :try_start_0
    iget-boolean v0, v2, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    if-eqz v0, :cond_3

    .line 218
    invoke-virtual {v2, p7, p8}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    :cond_3
    :goto_2
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 227
    :cond_4
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/c;->f:Z

    if-eqz v0, :cond_0

    .line 228
    const-string/jumbo v0, "RootClient"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "wait exit = "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v2, Lcom/qihoo360/mobilesafe/support/a/c$a;->a:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 219
    :catch_0
    move-exception v0

    .line 220
    :try_start_2
    iget-boolean v1, p0, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v1, :cond_3

    .line 221
    const-string/jumbo v1, "RootClient"

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    .line 215
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a;)V
    .locals 10
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
            ">;",
            "Lcom/qihoo360/mobilesafe/support/a/a;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    .line 103
    const-wide/32 v8, 0x1d4c0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v6, v5

    move-object v7, p4

    invoke-direct/range {v1 .. v9}, Lcom/qihoo360/mobilesafe/support/a/c;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLcom/qihoo360/mobilesafe/support/a/a;J)Z

    .line 104
    return-void
.end method

.method public a()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 548
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c;->g:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/common/c/a;->a(Landroid/content/Context;)I

    move-result v1

    const v2, 0x30e12

    if-ne v1, v2, :cond_1

    .line 570
    :cond_0
    :goto_0
    return v0

    .line 550
    :cond_1
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c;->d:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 551
    instance-of v1, p0, Lcom/qihoo360/mobilesafe/support/a/g;

    if-eqz v1, :cond_0

    .line 552
    const-string/jumbo v1, "com.qihoo.rt_server"

    iput-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c;->d:Ljava/lang/String;

    .line 558
    :cond_2
    sget-boolean v1, Lcom/qihoo360/mobilesafe/support/a/c;->h:Z

    if-eqz v1, :cond_4

    .line 559
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/c;->c()I

    move-result v1

    .line 562
    if-ltz v1, :cond_3

    const/16 v2, 0xb

    if-eq v1, v2, :cond_3

    .line 566
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/c;->b()Z

    .line 568
    :cond_3
    sput-boolean v0, Lcom/qihoo360/mobilesafe/support/a/c;->h:Z

    .line 570
    :cond_4
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/c;->d()Z

    move-result v0

    goto :goto_0
.end method

.method public a(IIJ)Z
    .locals 11

    .prologue
    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 1192
    if-gez p1, :cond_0

    .line 1198
    :goto_0
    return v6

    .line 1194
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1195
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1196
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1198
    const-string/jumbo v2, "/system/bin/kill"

    const/4 v5, 0x1

    move-object v1, p0

    move-object v7, v4

    move-wide v8, p3

    invoke-direct/range {v1 .. v9}, Lcom/qihoo360/mobilesafe/support/a/c;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLcom/qihoo360/mobilesafe/support/a/a;J)Z

    move-result v6

    goto :goto_0
.end method

.method public a(J)Z
    .locals 5

    .prologue
    .line 579
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v0, :cond_0

    .line 580
    const-string/jumbo v0, "RootClient"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "start to invoke startServer in "

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

    .line 582
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/qihoo360/mobilesafe/support/a/c;->b(J)V

    .line 583
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 584
    const/4 v0, 0x1

    .line 585
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;IIJ)Z
    .locals 10

    .prologue
    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 1174
    if-eqz p1, :cond_0

    if-ltz p2, :cond_0

    if-gez p3, :cond_1

    .line 1180
    :cond_0
    :goto_0
    return v6

    .line 1176
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1177
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1178
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1180
    const-string/jumbo v2, "/system/bin/chown"

    const/4 v5, 0x1

    move-object v1, p0

    move-object v7, v4

    move-wide v8, p4

    invoke-direct/range {v1 .. v9}, Lcom/qihoo360/mobilesafe/support/a/c;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLcom/qihoo360/mobilesafe/support/a/a;J)Z

    move-result v6

    goto :goto_0
.end method

.method public a(Ljava/lang/String;IJ)Z
    .locals 11

    .prologue
    const/4 v0, 0x0

    .line 1134
    if-nez p1, :cond_0

    .line 1145
    :goto_0
    return v0

    .line 1136
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1137
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1138
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1141
    :try_start_0
    const-string/jumbo v2, "/system/bin/chmod"

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-wide v8, p3

    invoke-direct/range {v1 .. v9}, Lcom/qihoo360/mobilesafe/support/a/c;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLcom/qihoo360/mobilesafe/support/a/a;J)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 1142
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a(Ljava/lang/String;J)Z
    .locals 10

    .prologue
    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 1155
    if-nez p1, :cond_0

    .line 1160
    :goto_0
    return v6

    .line 1157
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1158
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1160
    const-string/jumbo v2, "/system/bin/rm"

    const/4 v5, 0x1

    move-object v1, p0

    move-object v7, v4

    move-wide v8, p2

    invoke-direct/range {v1 .. v9}, Lcom/qihoo360/mobilesafe/support/a/c;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLcom/qihoo360/mobilesafe/support/a/a;J)Z

    move-result v6

    goto :goto_0
.end method

.method protected abstract a(Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 11

    .prologue
    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 1210
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 1215
    :cond_0
    :goto_0
    return v6

    .line 1212
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1213
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1214
    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1215
    const-string/jumbo v2, "/system/bin/mv"

    const/4 v5, 0x1

    move-object v1, p0

    move-object v7, v4

    move-wide v8, p3

    invoke-direct/range {v1 .. v9}, Lcom/qihoo360/mobilesafe/support/a/c;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLcom/qihoo360/mobilesafe/support/a/a;J)Z

    move-result v6

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 1222
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 1232
    :cond_0
    :goto_0
    return v2

    .line 1225
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1226
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1227
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1228
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1229
    invoke-static {p4, p5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1230
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)Z
    .locals 10
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
            ">;J)Z"
        }
    .end annotation

    .prologue
    .line 89
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v8, p4

    invoke-direct/range {v1 .. v9}, Lcom/qihoo360/mobilesafe/support/a/c;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLcom/qihoo360/mobilesafe/support/a/a;J)Z

    move-result v0

    return v0
.end method

.method protected a(ZI)Z
    .locals 4

    .prologue
    .line 1009
    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1010
    const/4 v0, 0x0

    .line 1036
    :cond_0
    :goto_0
    return v0

    .line 1011
    :cond_1
    new-instance v1, Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-direct {v1}, Lcom/qihoo360/mobilesafe/support/a/c$a;-><init>()V

    .line 1012
    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/c$8;

    invoke-direct {v0, p0, p1, v1}, Lcom/qihoo360/mobilesafe/support/a/c$8;-><init>(Lcom/qihoo360/mobilesafe/support/a/c;ZLcom/qihoo360/mobilesafe/support/a/c$a;)V

    .line 1023
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 1025
    monitor-enter v1

    .line 1026
    :try_start_0
    iget-boolean v0, v1, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    .line 1028
    int-to-long v2, p2

    :try_start_1
    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1025
    :cond_2
    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1032
    invoke-virtual {v1}, Lcom/qihoo360/mobilesafe/support/a/c$a;->a()Z

    move-result v0

    .line 1033
    if-eqz v0, :cond_0

    sget-boolean v1, Lcom/qihoo360/mobilesafe/support/a/c;->i:Z

    if-nez v1, :cond_0

    .line 1034
    const/4 v1, 0x1

    sput-boolean v1, Lcom/qihoo360/mobilesafe/support/a/c;->i:Z

    goto :goto_0

    .line 1025
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 1029
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method protected a([BI)Z
    .locals 4

    .prologue
    .line 900
    new-instance v1, Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-direct {v1}, Lcom/qihoo360/mobilesafe/support/a/c$a;-><init>()V

    .line 901
    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/c$7;

    invoke-direct {v0, p0, p1, v1}, Lcom/qihoo360/mobilesafe/support/a/c$7;-><init>(Lcom/qihoo360/mobilesafe/support/a/c;[BLcom/qihoo360/mobilesafe/support/a/c$a;)V

    .line 916
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 917
    monitor-enter v1

    .line 918
    :try_start_0
    iget-boolean v0, v1, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 920
    int-to-long v2, p2

    :try_start_1
    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 917
    :cond_0
    :goto_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 924
    invoke-virtual {v1}, Lcom/qihoo360/mobilesafe/support/a/c$a;->a()Z

    move-result v0

    return v0

    .line 917
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 921
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/qihoo360/mobilesafe/support/a/a;J)[B
    .locals 8
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
    .line 410
    invoke-static {p1, p2, p3}, Lcom/qihoo360/mobilesafe/support/a/h;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)[B

    move-result-object v5

    .line 412
    array-length v0, v5

    if-nez v0, :cond_0

    .line 413
    const/4 v0, 0x0

    .line 530
    :goto_0
    return-object v0

    .line 415
    :cond_0
    new-instance v2, Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-direct {v2}, Lcom/qihoo360/mobilesafe/support/a/c$a;-><init>()V

    .line 421
    new-instance v6, Ljava/lang/Thread;

    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/c$3;

    move-object v1, p0

    move v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a/c$3;-><init>(Lcom/qihoo360/mobilesafe/support/a/c;Lcom/qihoo360/mobilesafe/support/a/c$a;ZLcom/qihoo360/mobilesafe/support/a/a;[B)V

    invoke-direct {v6, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 498
    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    .line 499
    if-nez p4, :cond_2

    .line 500
    monitor-enter v2

    .line 502
    :try_start_0
    iget-boolean v0, v2, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    if-eqz v0, :cond_1

    .line 503
    invoke-virtual {v2, p6, p7}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 500
    :cond_1
    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 512
    :cond_2
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/c;->f:Z

    if-eqz v0, :cond_3

    .line 513
    const-string/jumbo v0, "RootClient"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "wait exit = "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v2, Lcom/qihoo360/mobilesafe/support/a/c$a;->a:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 530
    :cond_3
    iget-object v0, v2, Lcom/qihoo360/mobilesafe/support/a/c$a;->c:[B

    goto :goto_0

    .line 504
    :catch_0
    move-exception v0

    .line 505
    :try_start_2
    iget-boolean v1, p0, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v1, :cond_1

    .line 506
    const-string/jumbo v1, "RootClient"

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 500
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)I
    .locals 10
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
            ">;J)I"
        }
    .end annotation

    .prologue
    .line 93
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v8, p4

    invoke-virtual/range {v1 .. v9}, Lcom/qihoo360/mobilesafe/support/a/c;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLcom/qihoo360/mobilesafe/support/a/a;J)Lcom/qihoo360/mobilesafe/support/a/c$a;

    move-result-object v0

    .line 94
    iget v0, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->a:I

    return v0
.end method

.method protected b(J)V
    .locals 9

    .prologue
    .line 600
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c;->g:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 764
    :cond_0
    :goto_0
    return-void

    .line 603
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c;->d:Ljava/lang/String;

    .line 605
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/c;->g:Landroid/content/Context;

    .line 607
    new-instance v6, Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-direct {v6}, Lcom/qihoo360/mobilesafe/support/a/c$a;-><init>()V

    .line 609
    new-instance v7, Landroid/os/HandlerThread;

    const-string/jumbo v0, "alram-thread"

    invoke-direct {v7, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 611
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c;->c:Landroid/net/LocalServerSocket;

    if-nez v0, :cond_0

    .line 614
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/h;->a()Ljava/lang/String;

    move-result-object v3

    .line 616
    :try_start_0
    new-instance v0, Landroid/net/LocalServerSocket;

    invoke-direct {v0, v3}, Landroid/net/LocalServerSocket;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c;->c:Landroid/net/LocalServerSocket;

    .line 617
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v0, :cond_2

    .line 618
    const-string/jumbo v0, "RootClient"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "Listening on domain socket "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 621
    :cond_2
    invoke-virtual {v7}, Landroid/os/HandlerThread;->start()V

    .line 622
    new-instance v4, Landroid/os/Handler;

    invoke-virtual {v7}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 626
    new-instance v5, Lcom/qihoo360/mobilesafe/support/a/c$4;

    invoke-direct {v5, p0, v3}, Lcom/qihoo360/mobilesafe/support/a/c$4;-><init>(Lcom/qihoo360/mobilesafe/support/a/c;Ljava/lang/String;)V

    .line 651
    const-wide/16 v0, 0x4e20

    invoke-virtual {v4, v5, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 654
    new-instance v8, Ljava/lang/Thread;

    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/c$5;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/qihoo360/mobilesafe/support/a/c$5;-><init>(Lcom/qihoo360/mobilesafe/support/a/c;Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;Lcom/qihoo360/mobilesafe/support/a/c$a;)V

    invoke-direct {v8, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 738
    invoke-virtual {v8}, Ljava/lang/Thread;->start()V

    .line 741
    monitor-enter v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 743
    :try_start_1
    iget-boolean v0, v6, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    if-eqz v0, :cond_3

    .line 744
    invoke-virtual {v6, p1, p2}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 741
    :cond_3
    :goto_1
    :try_start_2
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 752
    :try_start_3
    invoke-virtual {v4, v5}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 753
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c;->c:Landroid/net/LocalServerSocket;

    if-eqz v0, :cond_4

    .line 754
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c;->c:Landroid/net/LocalServerSocket;

    invoke-virtual {v0}, Landroid/net/LocalServerSocket;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 759
    :cond_4
    invoke-virtual {v7}, Landroid/os/HandlerThread;->quit()Z

    goto :goto_0

    .line 745
    :catch_0
    move-exception v0

    .line 746
    :try_start_4
    iget-boolean v1, p0, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v1, :cond_3

    .line 747
    const-string/jumbo v1, "RootClient"

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 741
    :catchall_0
    move-exception v0

    monitor-exit v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 755
    :catch_1
    move-exception v0

    .line 756
    :try_start_6
    iget-boolean v1, p0, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v1, :cond_5

    .line 757
    const-string/jumbo v1, "RootClient"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 759
    :cond_5
    invoke-virtual {v7}, Landroid/os/HandlerThread;->quit()Z

    goto/16 :goto_0

    .line 758
    :catchall_1
    move-exception v0

    .line 759
    invoke-virtual {v7}, Landroid/os/HandlerThread;->quit()Z

    .line 760
    throw v0
.end method

.method public b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a;)V
    .locals 8
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
            ">;",
            "Lcom/qihoo360/mobilesafe/support/a/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 539
    const/4 v4, 0x1

    const-wide/32 v6, 0x1d4c0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v7}, Lcom/qihoo360/mobilesafe/support/a/c;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/qihoo360/mobilesafe/support/a/a;J)[B

    .line 540
    return-void
.end method

.method public b()Z
    .locals 4

    .prologue
    .line 271
    const-string/jumbo v0, "\n\n"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 273
    new-instance v1, Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-direct {v1}, Lcom/qihoo360/mobilesafe/support/a/c$a;-><init>()V

    .line 279
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Lcom/qihoo360/mobilesafe/support/a/c$2;

    invoke-direct {v3, p0, v1, v0}, Lcom/qihoo360/mobilesafe/support/a/c$2;-><init>(Lcom/qihoo360/mobilesafe/support/a/c;Lcom/qihoo360/mobilesafe/support/a/c$a;[B)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 332
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 334
    monitor-enter v1

    .line 336
    :try_start_0
    iget-boolean v0, v1, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    if-eqz v0, :cond_0

    .line 337
    const-wide/16 v2, 0xbb8

    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 334
    :cond_0
    :goto_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 345
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/c;->f:Z

    if-eqz v0, :cond_1

    .line 346
    const-string/jumbo v0, "RootClient"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "wait exit = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v1, Lcom/qihoo360/mobilesafe/support/a/c$a;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 363
    :cond_1
    invoke-virtual {v1}, Lcom/qihoo360/mobilesafe/support/a/c$a;->a()Z

    move-result v0

    return v0

    .line 338
    :catch_0
    move-exception v0

    .line 339
    :try_start_2
    iget-boolean v2, p0, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v2, :cond_0

    .line 340
    const-string/jumbo v2, "RootClient"

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 334
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 780
    const/16 v0, 0x1388

    invoke-direct {p0, v0}, Lcom/qihoo360/mobilesafe/support/a/c;->a(I)I

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)[B
    .locals 8
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
            ">;J)[B"
        }
    .end annotation

    .prologue
    .line 393
    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v6, p4

    invoke-virtual/range {v0 .. v7}, Lcom/qihoo360/mobilesafe/support/a/c;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/qihoo360/mobilesafe/support/a/a;J)[B

    move-result-object v0

    return-object v0
.end method

.method protected d()Z
    .locals 2

    .prologue
    .line 994
    const/4 v0, 0x0

    const/16 v1, 0x2710

    invoke-virtual {p0, v0, v1}, Lcom/qihoo360/mobilesafe/support/a/c;->a(ZI)Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 2

    .prologue
    .line 1040
    const/4 v0, 0x0

    const/16 v1, 0x7d0

    invoke-virtual {p0, v0, v1}, Lcom/qihoo360/mobilesafe/support/a/c;->a(ZI)Z

    move-result v0

    return v0
.end method

.method protected f()V
    .locals 0

    .prologue
    .line 1245
    return-void
.end method

.class public Lcom/qihoo/security/env/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:Z

.field public static b:Ljava/lang/String;

.field public static c:Ljava/lang/String;

.field public static d:Ljava/lang/String;

.field public static final e:[Ljava/lang/String;

.field public static f:Ljava/lang/String;

.field public static g:Z

.field public static h:I

.field public static i:J

.field private static j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 25
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/security/env/a;->a:Z

    .line 52
    const-string/jumbo v0, "fec53268a38f029357056d46098c9384"

    sput-object v0, Lcom/qihoo/security/env/a;->b:Ljava/lang/String;

    .line 53
    const-string/jumbo v0, "9bb820b73f0e914ebee7301c41e919e8"

    sput-object v0, Lcom/qihoo/security/env/a;->c:Ljava/lang/String;

    .line 54
    const-string/jumbo v0, "ue_rate"

    sput-object v0, Lcom/qihoo/security/env/a;->d:Ljava/lang/String;

    .line 150
    new-array v0, v1, [Ljava/lang/String;

    sput-object v0, Lcom/qihoo/security/env/a;->e:[Ljava/lang/String;

    .line 158
    const-string/jumbo v0, "com.qihoo.security.service.SYS_CLEAR"

    sput-object v0, Lcom/qihoo/security/env/a;->f:Ljava/lang/String;

    .line 163
    sput-boolean v1, Lcom/qihoo/security/env/a;->g:Z

    .line 260
    const/4 v0, -0x1

    sput v0, Lcom/qihoo/security/env/a;->j:I

    .line 264
    sput v1, Lcom/qihoo/security/env/a;->h:I

    .line 265
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/qihoo/security/env/a;->i:J

    return-void
.end method

.method public static a(Landroid/content/Context;)I
    .locals 5

    .prologue
    .line 204
    sget v0, Lcom/qihoo/security/env/a;->j:I

    if-gez v0, :cond_1

    .line 206
    const-string/jumbo v0, "g_cid"

    const/4 v1, -0x1

    invoke-static {p0, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    sput v0, Lcom/qihoo/security/env/a;->j:I

    .line 207
    sget v0, Lcom/qihoo/security/env/a;->j:I

    if-lez v0, :cond_0

    .line 212
    sget v0, Lcom/qihoo/security/env/a;->j:I

    .line 239
    :goto_0
    return v0

    .line 216
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    .line 217
    const/4 v1, 0x0

    .line 219
    :try_start_0
    new-instance v0, Ljava/io/DataInputStream;

    const-string/jumbo v3, "cid.dat"

    invoke-virtual {v2, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    :try_start_1
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readLine()Ljava/lang/String;

    move-result-object v1

    .line 221
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    sput v1, Lcom/qihoo/security/env/a;->j:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 230
    if-eqz v0, :cond_1

    .line 232
    :try_start_2
    invoke-virtual {v0}, Ljava/io/DataInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 239
    :cond_1
    :goto_1
    sget v0, Lcom/qihoo/security/env/a;->j:I

    goto :goto_0

    .line 225
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 230
    :goto_2
    if-eqz v0, :cond_1

    .line 232
    :try_start_3
    invoke-virtual {v0}, Ljava/io/DataInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    .line 233
    :catch_1
    move-exception v0

    goto :goto_1

    .line 230
    :catchall_0
    move-exception v0

    :goto_3
    if-eqz v1, :cond_2

    .line 232
    :try_start_4
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 234
    :cond_2
    :goto_4
    throw v0

    .line 233
    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v1

    goto :goto_4

    .line 230
    :catchall_1
    move-exception v1

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_3

    .line 225
    :catch_4
    move-exception v1

    goto :goto_2
.end method

.method public static a(Landroid/content/Context;I)V
    .locals 1

    .prologue
    .line 244
    sput p1, Lcom/qihoo/security/env/a;->j:I

    .line 245
    const-string/jumbo v0, "g_cid"

    invoke-static {p0, v0, p1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 249
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 253
    const-string/jumbo v0, "g_subcid"

    invoke-static {p0, v0, p1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    return-void
.end method

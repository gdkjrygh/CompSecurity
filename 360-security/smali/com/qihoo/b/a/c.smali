.class Lcom/qihoo/b/a/c;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:[Ljava/lang/String;


# instance fields
.field private b:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 17
    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string/jumbo v2, "deviceModel"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string/jumbo v2, "sysVersion"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string/jumbo v2, "deviceId"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string/jumbo v2, "district"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    .line 18
    const-string/jumbo v2, "lang"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string/jumbo v2, "channel"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string/jumbo v2, "subChannel"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string/jumbo v2, "isRoot"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string/jumbo v2, "email"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string/jumbo v2, "gp"

    aput-object v2, v0, v1

    .line 17
    sput-object v0, Lcom/qihoo/b/a/c;->a:[Ljava/lang/String;

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/b/a/c;->b:Landroid/os/Bundle;

    .line 28
    iput-object p1, p0, Lcom/qihoo/b/a/c;->b:Landroid/os/Bundle;

    .line 29
    return-void
.end method

.method private b()Ljava/lang/String;
    .locals 11

    .prologue
    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v1, 0x0

    .line 85
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    sget-object v3, Lcom/qihoo/b/a/c;->a:[Ljava/lang/String;

    array-length v4, v3

    move v0, v1

    :goto_0
    if-lt v0, v4, :cond_1

    .line 98
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-eqz v0, :cond_4

    .line 99
    iget-object v0, p0, Lcom/qihoo/b/a/c;->b:Landroid/os/Bundle;

    const-string/jumbo v3, "sk"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 100
    if-nez v0, :cond_0

    const-string/jumbo v0, ""

    .line 101
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "{"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "}"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 102
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/b/a/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 110
    const-string/jumbo v3, "{%s,\"%s\":\"%s\"}"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v4, v1

    const-string/jumbo v1, "sig"

    aput-object v1, v4, v9

    aput-object v0, v4, v10

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 113
    :goto_1
    return-object v0

    .line 86
    :cond_1
    aget-object v5, v3, v0

    .line 87
    iget-object v6, p0, Lcom/qihoo/b/a/c;->b:Landroid/os/Bundle;

    invoke-virtual {v6, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 88
    if-eqz v6, :cond_3

    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    if-eqz v7, :cond_2

    .line 92
    const-string/jumbo v7, ","

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    :cond_2
    const-string/jumbo v7, "\"%s\":\"%s\""

    new-array v8, v10, [Ljava/lang/Object;

    aput-object v5, v8, v1

    aput-object v6, v8, v9

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    .line 113
    :cond_4
    const/4 v0, 0x0

    goto :goto_1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v0, 0x0

    .line 32
    iget-object v1, p0, Lcom/qihoo/b/a/c;->b:Landroid/os/Bundle;

    if-nez v1, :cond_1

    .line 58
    :cond_0
    :goto_0
    return-object v0

    .line 35
    :cond_1
    iget-object v1, p0, Lcom/qihoo/b/a/c;->b:Landroid/os/Bundle;

    const-string/jumbo v2, "client"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 36
    iget-object v2, p0, Lcom/qihoo/b/a/c;->b:Landroid/os/Bundle;

    const-string/jumbo v3, "version"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 37
    iget-object v3, p0, Lcom/qihoo/b/a/c;->b:Landroid/os/Bundle;

    const-string/jumbo v4, ""

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 38
    invoke-direct {p0}, Lcom/qihoo/b/a/c;->b()Ljava/lang/String;

    move-result-object v4

    .line 42
    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    if-eqz v3, :cond_0

    if-eqz v4, :cond_0

    .line 46
    iget-object v5, p0, Lcom/qihoo/b/a/c;->b:Landroid/os/Bundle;

    const-string/jumbo v6, "dk"

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 49
    if-eqz v5, :cond_0

    .line 51
    :try_start_0
    const-string/jumbo v6, "%sclient=%s&version=%s&data=%s"

    const/4 v7, 0x4

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v3, v7, v8

    const/4 v3, 0x1

    const-string/jumbo v8, "utf-8"

    invoke-static {v1, v8}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v7, v3

    const/4 v1, 0x2

    .line 52
    const-string/jumbo v3, "utf-8"

    invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v7, v1

    const/4 v1, 0x3

    .line 53
    invoke-static {v4, v5}, Lcom/qihoo/b/a/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "utf-8"

    invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v7, v1

    .line 51
    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 55
    :catch_0
    move-exception v1

    goto :goto_0
.end method

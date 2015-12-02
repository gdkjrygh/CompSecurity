.class public Lcom/qihoo/security/v5/d;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    return-void
.end method

.method public static a(Landroid/os/Bundle;)Lcom/qihoo/security/v5/d;
    .locals 4

    .prologue
    .line 29
    new-instance v0, Lcom/qihoo/security/v5/d;

    invoke-direct {v0}, Lcom/qihoo/security/v5/d;-><init>()V

    .line 31
    const-string/jumbo v1, "app_patch_size"

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/v5/d;->a:Ljava/lang/String;

    .line 32
    const-string/jumbo v1, "app_size"

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/v5/d;->b:Ljava/lang/String;

    .line 33
    const-string/jumbo v1, "app_version"

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/v5/d;->c:Ljava/lang/String;

    .line 34
    const-string/jumbo v1, "1"

    const-string/jumbo v2, "force"

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/qihoo/security/v5/d;->e:Z

    .line 35
    const-string/jumbo v1, "app_desc"

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/v5/d;->d:Ljava/lang/String;

    .line 36
    iget-object v1, v0, Lcom/qihoo/security/v5/d;->d:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 37
    iget-object v1, v0, Lcom/qihoo/security/v5/d;->d:Ljava/lang/String;

    const-string/jumbo v2, "\\\\n"

    const-string/jumbo v3, "\n"

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/v5/d;->d:Ljava/lang/String;

    .line 40
    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 52
    .line 54
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/v5/d;->a:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 60
    :goto_0
    if-lez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0

    .line 55
    :catch_0
    move-exception v1

    move v1, v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 65
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 66
    const-string/jumbo v1, "[UpdateInfo] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 67
    iget-object v1, p0, Lcom/qihoo/security/v5/d;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 68
    const-string/jumbo v1, " patchSize: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/v5/d;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 70
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/v5/d;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 71
    const-string/jumbo v1, " appSize: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/v5/d;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 73
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/v5/d;->c:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 74
    const-string/jumbo v1, " appVersion: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/v5/d;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 76
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/v5/d;->d:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 77
    const-string/jumbo v1, " description: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/v5/d;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 79
    :cond_3
    const-string/jumbo v1, " isForce: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    iget-boolean v2, p0, Lcom/qihoo/security/v5/d;->e:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    .line 80
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lcrittercism/android/bb;
.super Lcom/crittercism/app/CrittercismConfig;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/crittercism/app/CrittercismConfig;-><init>()V

    .line 31
    const-string v0, "https://api.crittercism.com"

    iput-object v0, p0, Lcrittercism/android/bb;->b:Ljava/lang/String;

    .line 33
    const-string v0, "https://apm.crittercism.com"

    iput-object v0, p0, Lcrittercism/android/bb;->c:Ljava/lang/String;

    .line 35
    const-string v0, "https://txn.ingest.crittercism.com/api/v1/transactions"

    iput-object v0, p0, Lcrittercism/android/bb;->d:Ljava/lang/String;

    .line 38
    const-string v0, "https://appload.ingest.crittercism.com"

    iput-object v0, p0, Lcrittercism/android/bb;->e:Ljava/lang/String;

    .line 40
    const-string v0, "524c99a04002057fcd000001"

    iput-object v0, p0, Lcrittercism/android/bb;->f:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public constructor <init>(Lcom/crittercism/app/CrittercismConfig;)V
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0, p1}, Lcom/crittercism/app/CrittercismConfig;-><init>(Lcom/crittercism/app/CrittercismConfig;)V

    .line 31
    const-string v0, "https://api.crittercism.com"

    iput-object v0, p0, Lcrittercism/android/bb;->b:Ljava/lang/String;

    .line 33
    const-string v0, "https://apm.crittercism.com"

    iput-object v0, p0, Lcrittercism/android/bb;->c:Ljava/lang/String;

    .line 35
    const-string v0, "https://txn.ingest.crittercism.com/api/v1/transactions"

    iput-object v0, p0, Lcrittercism/android/bb;->d:Ljava/lang/String;

    .line 38
    const-string v0, "https://appload.ingest.crittercism.com"

    iput-object v0, p0, Lcrittercism/android/bb;->e:Ljava/lang/String;

    .line 40
    const-string v0, "524c99a04002057fcd000001"

    iput-object v0, p0, Lcrittercism/android/bb;->f:Ljava/lang/String;

    .line 55
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 2

    .prologue
    .line 67
    invoke-super {p0}, Lcom/crittercism/app/CrittercismConfig;->a()Ljava/util/List;

    move-result-object v0

    .line 68
    iget-object v1, p0, Lcrittercism/android/bb;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcrittercism/android/bb;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcrittercism/android/bb;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcrittercism/android/bb;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcrittercism/android/bb;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x0

    .line 126
    instance-of v0, p1, Lcrittercism/android/bb;

    if-nez v0, :cond_0

    move v0, v1

    .line 133
    :goto_0
    return v0

    :cond_0
    move-object v0, p1

    .line 130
    check-cast v0, Lcrittercism/android/bb;

    .line 133
    invoke-super {p0, p1}, Lcom/crittercism/app/CrittercismConfig;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcrittercism/android/bb;->b:Ljava/lang/String;

    iget-object v3, v0, Lcrittercism/android/bb;->b:Ljava/lang/String;

    invoke-static {v2, v3}, Lcrittercism/android/bb;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcrittercism/android/bb;->c:Ljava/lang/String;

    iget-object v3, v0, Lcrittercism/android/bb;->c:Ljava/lang/String;

    invoke-static {v2, v3}, Lcrittercism/android/bb;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcrittercism/android/bb;->d:Ljava/lang/String;

    iget-object v3, v0, Lcrittercism/android/bb;->d:Ljava/lang/String;

    invoke-static {v2, v3}, Lcrittercism/android/bb;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcrittercism/android/bb;->e:Ljava/lang/String;

    iget-object v3, v0, Lcrittercism/android/bb;->e:Ljava/lang/String;

    invoke-static {v2, v3}, Lcrittercism/android/bb;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcrittercism/android/bb;->f:Ljava/lang/String;

    iget-object v0, v0, Lcrittercism/android/bb;->f:Ljava/lang/String;

    invoke-static {v2, v0}, Lcrittercism/android/bb;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcrittercism/android/bb;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcrittercism/android/bb;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 148
    invoke-super {p0}, Lcom/crittercism/app/CrittercismConfig;->hashCode()I

    move-result v0

    .line 150
    mul-int/lit8 v0, v0, 0x1f

    .line 151
    iget-object v1, p0, Lcrittercism/android/bb;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 152
    mul-int/lit8 v0, v0, 0x1f

    .line 153
    iget-object v1, p0, Lcrittercism/android/bb;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 154
    mul-int/lit8 v0, v0, 0x1f

    .line 155
    iget-object v1, p0, Lcrittercism/android/bb;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 156
    mul-int/lit8 v0, v0, 0x1f

    .line 157
    iget-object v1, p0, Lcrittercism/android/bb;->e:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 158
    mul-int/lit8 v0, v0, 0x1f

    .line 159
    iget-object v1, p0, Lcrittercism/android/bb;->f:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 161
    return v0
.end method

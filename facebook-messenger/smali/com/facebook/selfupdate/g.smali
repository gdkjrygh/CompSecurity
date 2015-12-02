.class public Lcom/facebook/selfupdate/g;
.super Ljava/lang/Object;
.source "PackageValidator.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x9
.end annotation


# static fields
.field static final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field static final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Lcom/facebook/selfupdate/ai;

.field private final e:Lcom/facebook/selfupdate/o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 43
    const-string v0, "META-INF/MANIFEST.MF"

    const-string v1, "AndroidManifest.xml"

    const-string v2, "classes.dex"

    invoke-static {v0, v1, v2}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/selfupdate/g;->a:Ljava/util/Set;

    .line 49
    const-string v0, "META-INF/MANIFEST.MF"

    const-string v1, "metadata.txt"

    invoke-static {v0, v1}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/selfupdate/g;->b:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/selfupdate/ai;Lcom/facebook/selfupdate/o;)V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lcom/facebook/selfupdate/g;->c:Landroid/content/Context;

    .line 62
    iput-object p2, p0, Lcom/facebook/selfupdate/g;->d:Lcom/facebook/selfupdate/ai;

    .line 63
    iput-object p3, p0, Lcom/facebook/selfupdate/g;->e:Lcom/facebook/selfupdate/o;

    .line 64
    return-void
.end method

.method private a(Landroid/content/pm/Signature;)Z
    .locals 2

    .prologue
    .line 201
    iget-object v0, p0, Lcom/facebook/selfupdate/g;->d:Lcom/facebook/selfupdate/ai;

    invoke-virtual {v0, p1}, Lcom/facebook/selfupdate/ai;->a(Landroid/content/pm/Signature;)Ljava/lang/String;

    move-result-object v0

    .line 202
    const-string v1, "CN=Android Debug"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method private a([Landroid/content/pm/Signature;[Landroid/content/pm/Signature;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 214
    if-nez p1, :cond_1

    .line 215
    if-nez p2, :cond_0

    const/4 v0, 0x1

    .line 224
    :cond_0
    :goto_0
    return v0

    .line 217
    :cond_1
    if-eqz p2, :cond_0

    .line 220
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 221
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    .line 222
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 223
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    .line 224
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method private a(Landroid/content/Context;)[Landroid/content/pm/Signature;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 129
    if-nez p1, :cond_0

    .line 140
    :goto_0
    return-object v0

    .line 133
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 135
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/16 v3, 0x40

    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v0, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 137
    :catch_0
    move-exception v1

    .line 138
    iget-object v2, p0, Lcom/facebook/selfupdate/g;->e:Lcom/facebook/selfupdate/o;

    const-string v3, "PackageManager.NameNotFoundException"

    invoke-virtual {v2, v3, v1}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private a(Ljava/util/jar/JarFile;)[Landroid/content/pm/Signature;
    .locals 12

    .prologue
    const/4 v5, 0x0

    const/4 v3, 0x0

    .line 151
    .line 152
    :try_start_0
    invoke-virtual {p1}, Ljava/util/jar/JarFile;->entries()Ljava/util/Enumeration;

    move-result-object v7

    move-object v2, v3

    .line 153
    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 154
    invoke-interface {v7}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/jar/JarEntry;

    .line 155
    invoke-virtual {v0}, Ljava/util/jar/JarEntry;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_0

    .line 158
    invoke-virtual {v0}, Ljava/util/jar/JarEntry;->getName()Ljava/lang/String;

    move-result-object v1

    .line 159
    const-string v4, "META-INF/"

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 162
    iget-object v1, p0, Lcom/facebook/selfupdate/g;->d:Lcom/facebook/selfupdate/ai;

    invoke-virtual {v1, p1, v0}, Lcom/facebook/selfupdate/ai;->a(Ljava/util/jar/JarFile;Ljava/util/jar/JarEntry;)[Ljava/security/cert/Certificate;

    move-result-object v1

    .line 163
    if-nez v1, :cond_1

    .line 164
    iget-object v0, p0, Lcom/facebook/selfupdate/g;->e:Lcom/facebook/selfupdate/o;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/util/jar/JarFile;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " has no certificates"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;)V

    move-object v0, v3

    .line 191
    :goto_1
    return-object v0

    .line 166
    :cond_1
    if-nez v2, :cond_2

    move-object v0, v1

    :goto_2
    move-object v2, v0

    .line 186
    goto :goto_0

    .line 170
    :cond_2
    array-length v8, v2

    move v6, v5

    :goto_3
    if-ge v6, v8, :cond_8

    aget-object v9, v2, v6

    .line 172
    array-length v10, v1

    move v4, v5

    :goto_4
    if-ge v4, v10, :cond_7

    aget-object v11, v1, v4

    .line 173
    if-eqz v9, :cond_4

    invoke-virtual {v9, v11}, Ljava/security/cert/Certificate;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    .line 174
    const/4 v4, 0x1

    .line 178
    :goto_5
    if-eqz v4, :cond_3

    array-length v4, v2

    array-length v9, v1

    if-eq v4, v9, :cond_5

    .line 179
    :cond_3
    iget-object v1, p0, Lcom/facebook/selfupdate/g;->e:Lcom/facebook/selfupdate/o;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Package "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/util/jar/JarFile;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " has mismatched certificates at entry "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/util/jar/JarEntry;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;)V

    move-object v0, v3

    .line 182
    goto :goto_1

    .line 172
    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 170
    :cond_5
    add-int/lit8 v4, v6, 0x1

    move v6, v4

    goto :goto_3

    .line 187
    :cond_6
    iget-object v0, p0, Lcom/facebook/selfupdate/g;->d:Lcom/facebook/selfupdate/ai;

    invoke-virtual {v0, v2}, Lcom/facebook/selfupdate/ai;->a([Ljava/security/cert/Certificate;)[Landroid/content/pm/Signature;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_1

    .line 188
    :catch_0
    move-exception v0

    .line 189
    iget-object v1, p0, Lcom/facebook/selfupdate/g;->e:Lcom/facebook/selfupdate/o;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "RuntimeException reading "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/util/jar/JarFile;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    move-object v0, v3

    .line 191
    goto :goto_1

    :cond_7
    move v4, v5

    goto :goto_5

    :cond_8
    move-object v0, v2

    goto :goto_2
.end method

.method private b(Ljava/util/jar/JarFile;Ljava/lang/String;)Z
    .locals 4

    .prologue
    .line 99
    const-string v0, "application/java-archive"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 100
    sget-object v0, Lcom/facebook/selfupdate/g;->b:Ljava/util/Set;

    invoke-static {v0}, Lcom/google/common/a/kl;->a(Ljava/lang/Iterable;)Ljava/util/HashSet;

    move-result-object v0

    move-object v1, v0

    .line 106
    :goto_0
    invoke-virtual {p1}, Ljava/util/jar/JarFile;->entries()Ljava/util/Enumeration;

    move-result-object v2

    .line 107
    :cond_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 108
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/jar/JarEntry;

    .line 109
    invoke-virtual {v0}, Ljava/util/jar/JarEntry;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_0

    .line 111
    invoke-virtual {v0}, Ljava/util/jar/JarEntry;->getName()Ljava/lang/String;

    move-result-object v0

    .line 112
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 113
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 115
    :cond_1
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 117
    const/4 v0, 0x1

    .line 120
    :goto_1
    return v0

    .line 102
    :cond_2
    sget-object v0, Lcom/facebook/selfupdate/g;->a:Ljava/util/Set;

    invoke-static {v0}, Lcom/google/common/a/kl;->a(Ljava/lang/Iterable;)Ljava/util/HashSet;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 120
    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method


# virtual methods
.method public a(Ljava/util/jar/JarFile;Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 76
    if-nez p1, :cond_1

    move v0, v1

    .line 88
    :cond_0
    :goto_0
    return v0

    .line 79
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/facebook/selfupdate/g;->b(Ljava/util/jar/JarFile;Ljava/lang/String;)Z

    move-result v0

    .line 80
    if-eqz v0, :cond_0

    .line 81
    iget-object v2, p0, Lcom/facebook/selfupdate/g;->c:Landroid/content/Context;

    invoke-direct {p0, v2}, Lcom/facebook/selfupdate/g;->a(Landroid/content/Context;)[Landroid/content/pm/Signature;

    move-result-object v2

    .line 82
    if-eqz v2, :cond_0

    array-length v3, v2

    if-lez v3, :cond_0

    aget-object v1, v2, v1

    invoke-direct {p0, v1}, Lcom/facebook/selfupdate/g;->a(Landroid/content/pm/Signature;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 84
    invoke-direct {p0, p1}, Lcom/facebook/selfupdate/g;->a(Ljava/util/jar/JarFile;)[Landroid/content/pm/Signature;

    move-result-object v0

    .line 85
    invoke-direct {p0, v2, v0}, Lcom/facebook/selfupdate/g;->a([Landroid/content/pm/Signature;[Landroid/content/pm/Signature;)Z

    move-result v0

    goto :goto_0
.end method

.class final Lorg/spongycastle/jce/provider/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;


# static fields
.field private static a:Ljava/security/Permission;

.field private static b:Ljava/security/Permission;

.field private static c:Ljava/security/Permission;

.field private static d:Ljava/security/Permission;


# instance fields
.field private e:Ljava/lang/ThreadLocal;

.field private f:Ljava/lang/ThreadLocal;

.field private volatile g:Lorg/spongycastle/jce/spec/ECParameterSpec;

.field private volatile h:Ljavax/crypto/spec/DHParameterSpec;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 16
    new-instance v0, Lorg/spongycastle/jcajce/provider/config/ProviderConfigurationPermission;

    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    const-string v2, "threadLocalEcImplicitlyCa"

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/jcajce/provider/config/ProviderConfigurationPermission;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/jce/provider/b;->a:Ljava/security/Permission;

    .line 18
    new-instance v0, Lorg/spongycastle/jcajce/provider/config/ProviderConfigurationPermission;

    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    const-string v2, "ecImplicitlyCa"

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/jcajce/provider/config/ProviderConfigurationPermission;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/jce/provider/b;->b:Ljava/security/Permission;

    .line 20
    new-instance v0, Lorg/spongycastle/jcajce/provider/config/ProviderConfigurationPermission;

    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    const-string v2, "threadLocalDhDefaultParams"

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/jcajce/provider/config/ProviderConfigurationPermission;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/jce/provider/b;->c:Ljava/security/Permission;

    .line 22
    new-instance v0, Lorg/spongycastle/jcajce/provider/config/ProviderConfigurationPermission;

    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    const-string v2, "DhDefaultParams"

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/jcajce/provider/config/ProviderConfigurationPermission;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/jce/provider/b;->d:Ljava/security/Permission;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/b;->e:Ljava/lang/ThreadLocal;

    .line 26
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/b;->f:Ljava/lang/ThreadLocal;

    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/jce/spec/ECParameterSpec;
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lorg/spongycastle/jce/provider/b;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/spec/ECParameterSpec;

    .line 127
    if-eqz v0, :cond_0

    .line 132
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/b;->g:Lorg/spongycastle/jce/spec/ECParameterSpec;

    goto :goto_0
.end method

.method public final b()Ljavax/crypto/spec/DHParameterSpec;
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lorg/spongycastle/jce/provider/b;->f:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/spec/DHParameterSpec;

    .line 139
    if-eqz v0, :cond_0

    .line 144
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/b;->h:Ljavax/crypto/spec/DHParameterSpec;

    goto :goto_0
.end method

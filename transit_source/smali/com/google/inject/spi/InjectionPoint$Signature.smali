.class Lcom/google/inject/spi/InjectionPoint$Signature;
.super Ljava/lang/Object;
.source "InjectionPoint.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/spi/InjectionPoint;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Signature"
.end annotation


# instance fields
.field final hash:I

.field final name:Ljava/lang/String;

.field final parameterTypes:[Ljava/lang/Class;


# direct methods
.method constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 7
    .param p1, "method"    # Ljava/lang/reflect/Method;

    .prologue
    .line 786
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 787
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/google/inject/spi/InjectionPoint$Signature;->name:Ljava/lang/String;

    .line 788
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    iput-object v5, p0, Lcom/google/inject/spi/InjectionPoint$Signature;->parameterTypes:[Ljava/lang/Class;

    .line 790
    iget-object v5, p0, Lcom/google/inject/spi/InjectionPoint$Signature;->name:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v1

    .line 791
    .local v1, "h":I
    mul-int/lit8 v5, v1, 0x1f

    iget-object v6, p0, Lcom/google/inject/spi/InjectionPoint$Signature;->parameterTypes:[Ljava/lang/Class;

    array-length v6, v6

    add-int v1, v5, v6

    .line 792
    iget-object v0, p0, Lcom/google/inject/spi/InjectionPoint$Signature;->parameterTypes:[Ljava/lang/Class;

    .local v0, "arr$":[Ljava/lang/Class;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v4, v0, v2

    .line 793
    .local v4, "parameterType":Ljava/lang/Class;
    mul-int/lit8 v5, v1, 0x1f

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v6

    add-int v1, v5, v6

    .line 792
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 795
    .end local v4    # "parameterType":Ljava/lang/Class;
    :cond_0
    iput v1, p0, Lcom/google/inject/spi/InjectionPoint$Signature;->hash:I

    .line 796
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v2, 0x0

    .line 803
    instance-of v3, p1, Lcom/google/inject/spi/InjectionPoint$Signature;

    if-nez v3, :cond_1

    .line 822
    :cond_0
    :goto_0
    return v2

    :cond_1
    move-object v1, p1

    .line 807
    check-cast v1, Lcom/google/inject/spi/InjectionPoint$Signature;

    .line 808
    .local v1, "other":Lcom/google/inject/spi/InjectionPoint$Signature;
    iget-object v3, p0, Lcom/google/inject/spi/InjectionPoint$Signature;->name:Ljava/lang/String;

    iget-object v4, v1, Lcom/google/inject/spi/InjectionPoint$Signature;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 812
    iget-object v3, p0, Lcom/google/inject/spi/InjectionPoint$Signature;->parameterTypes:[Ljava/lang/Class;

    array-length v3, v3

    iget-object v4, v1, Lcom/google/inject/spi/InjectionPoint$Signature;->parameterTypes:[Ljava/lang/Class;

    array-length v4, v4

    if-ne v3, v4, :cond_0

    .line 816
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    iget-object v3, p0, Lcom/google/inject/spi/InjectionPoint$Signature;->parameterTypes:[Ljava/lang/Class;

    array-length v3, v3

    if-ge v0, v3, :cond_2

    .line 817
    iget-object v3, p0, Lcom/google/inject/spi/InjectionPoint$Signature;->parameterTypes:[Ljava/lang/Class;

    aget-object v3, v3, v0

    iget-object v4, v1, Lcom/google/inject/spi/InjectionPoint$Signature;->parameterTypes:[Ljava/lang/Class;

    aget-object v4, v4, v0

    if-ne v3, v4, :cond_0

    .line 816
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 822
    :cond_2
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 799
    iget v0, p0, Lcom/google/inject/spi/InjectionPoint$Signature;->hash:I

    return v0
.end method

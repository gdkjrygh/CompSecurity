.class final Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/util/Hashtable;

.field private b:Ljava/util/Hashtable;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 1576
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1578
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a:Ljava/util/Hashtable;

    .line 1579
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b:Ljava/util/Hashtable;

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 1576
    invoke-direct {p0}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 1601
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b:Ljava/util/Hashtable;

    invoke-static {p1}, Lorg/spongycastle/util/Strings;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1602
    if-nez v0, :cond_0

    .line 1604
    const/4 v0, 0x0

    .line 1607
    :goto_0
    return-object v0

    :cond_0
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a:Ljava/util/Hashtable;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public final a()Ljava/util/Enumeration;
    .locals 1

    .prologue
    .line 1596
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 1583
    invoke-static {p1}, Lorg/spongycastle/util/Strings;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1584
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b:Ljava/util/Hashtable;

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1585
    if-eqz v0, :cond_0

    .line 1587
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a:Ljava/util/Hashtable;

    invoke-virtual {v2, v0}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1590
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b:Ljava/util/Hashtable;

    invoke-virtual {v0, v1, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1591
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1592
    return-void
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 1612
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b:Ljava/util/Hashtable;

    invoke-static {p1}, Lorg/spongycastle/util/Strings;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1613
    if-nez v0, :cond_0

    .line 1615
    const/4 v0, 0x0

    .line 1618
    :goto_0
    return-object v0

    :cond_0
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a:Ljava/util/Hashtable;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public final b()Ljava/util/Enumeration;
    .locals 1

    .prologue
    .line 1623
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

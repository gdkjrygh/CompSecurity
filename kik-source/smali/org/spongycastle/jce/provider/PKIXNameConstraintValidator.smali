.class public Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/Set;

.field private b:Ljava/util/Set;

.field private c:Ljava/util/Set;

.field private d:Ljava/util/Set;

.field private e:Ljava/util/Set;

.field private f:Ljava/util/Set;

.field private g:Ljava/util/Set;

.field private h:Ljava/util/Set;

.field private i:Ljava/util/Set;

.field private j:Ljava/util/Set;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a:Ljava/util/Set;

    .line 24
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b:Ljava/util/Set;

    .line 26
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c:Ljava/util/Set;

    .line 28
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->d:Ljava/util/Set;

    .line 30
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->e:Ljava/util/Set;

    .line 44
    return-void
.end method

.method private static a(Ljava/util/Collection;)I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 1728
    if-nez p0, :cond_0

    .line 1746
    :goto_0
    return v0

    .line 1733
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    .line 1734
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1736
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 1737
    instance-of v3, v0, [B

    if-eqz v3, :cond_1

    .line 1739
    check-cast v0, [B

    invoke-static {v0}, Lorg/spongycastle/util/Arrays;->a([B)I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_1

    .line 1743
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    .line 1745
    goto :goto_1

    :cond_2
    move v0, v1

    .line 1746
    goto :goto_0
.end method

.method private static a(Ljava/util/Set;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 1851
    const-string v0, ""

    .line 1852
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1853
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1855
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-static {v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1857
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    .line 1859
    const/4 v1, 0x0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 1861
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1862
    return-object v0
.end method

.method private static a([B)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 1834
    const-string v0, ""

    move-object v2, v0

    move v0, v1

    .line 1835
    :goto_0
    array-length v3, p0

    div-int/lit8 v3, v3, 0x2

    if-ge v0, v3, :cond_0

    .line 1837
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-byte v3, p0, v0

    and-int/lit16 v3, v3, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1835
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1839
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 1840
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1841
    array-length v0, p0

    div-int/lit8 v0, v0, 0x2

    :goto_1
    array-length v3, p0

    if-ge v0, v3, :cond_1

    .line 1843
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-byte v3, p0, v0

    and-int/lit16 v3, v3, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1841
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1845
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 1846
    return-object v0
.end method

.method private static a(Ljava/util/Set;Ljava/lang/String;)Ljava/util/Set;
    .locals 4

    .prologue
    .line 1068
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1070
    if-nez p1, :cond_0

    .line 1102
    :goto_0
    return-object p0

    .line 1074
    :cond_0
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1080
    :cond_1
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1082
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 1083
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1085
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1087
    invoke-static {v0, p1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1089
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1091
    :cond_2
    invoke-static {p1, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1093
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1097
    :cond_3
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1098
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    move-object p0, v1

    .line 1102
    goto :goto_0
.end method

.method private static a(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .locals 6

    .prologue
    .line 135
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 136
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 138
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/x509/GeneralSubtree;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/GeneralSubtree;->c()Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v3

    .line 140
    if-nez p0, :cond_1

    .line 142
    if-eqz v3, :cond_0

    .line 144
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 149
    :cond_1
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 150
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 154
    invoke-static {v3, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Lorg/spongycastle/asn1/ASN1Sequence;Lorg/spongycastle/asn1/ASN1Sequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 156
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 158
    :cond_3
    invoke-static {v0, v3}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Lorg/spongycastle/asn1/ASN1Sequence;Lorg/spongycastle/asn1/ASN1Sequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 160
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 165
    :cond_4
    return-object v1
.end method

.method private static a(Ljava/util/Set;Lorg/spongycastle/asn1/ASN1Sequence;)Ljava/util/Set;
    .locals 4

    .prologue
    .line 170
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 172
    if-nez p1, :cond_0

    .line 204
    :goto_0
    return-object p0

    .line 176
    :cond_0
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 182
    :cond_1
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 184
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 185
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 187
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 189
    invoke-static {p1, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Lorg/spongycastle/asn1/ASN1Sequence;Lorg/spongycastle/asn1/ASN1Sequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 191
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 193
    :cond_2
    invoke-static {v0, p1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Lorg/spongycastle/asn1/ASN1Sequence;Lorg/spongycastle/asn1/ASN1Sequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 195
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 199
    :cond_3
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 200
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    move-object p0, v1

    .line 204
    goto :goto_0
.end method

.method private static a(Ljava/util/Set;[B)Ljava/util/Set;
    .locals 5

    .prologue
    .line 313
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 315
    if-nez p1, :cond_0

    .line 334
    :goto_0
    return-object p0

    .line 319
    :cond_0
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 325
    :cond_1
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 327
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 328
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 330
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 331
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0, p1}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_2
    invoke-interface {v1, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_2
    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    move-object p0, v1

    .line 334
    goto :goto_0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V
    .locals 3

    .prologue
    const/4 v2, -0x1

    const/16 v1, 0x40

    .line 895
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-eq v0, v2, :cond_5

    .line 897
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 899
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-eq v1, v2, :cond_1

    .line 901
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 903
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1028
    :goto_0
    return-void

    .line 907
    :cond_0
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 908
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 912
    :cond_1
    const-string v1, "."

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 914
    invoke-static {v0, p1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 916
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 920
    :cond_2
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 921
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 927
    :cond_3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 929
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 933
    :cond_4
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 934
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 939
    :cond_5
    const-string v0, "."

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 941
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-eq v0, v2, :cond_7

    .line 943
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 944
    invoke-static {v0, p0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 946
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 950
    :cond_6
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 951
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 955
    :cond_7
    const-string v0, "."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 957
    invoke-static {p0, p1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 960
    :cond_8
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 962
    :cond_9
    invoke-static {p1, p0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 964
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 968
    :cond_a
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 969
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 974
    :cond_b
    invoke-static {p1, p0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 976
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 980
    :cond_c
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 981
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 988
    :cond_d
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-eq v0, v2, :cond_f

    .line 990
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 991
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 993
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 997
    :cond_e
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 998
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1002
    :cond_f
    const-string v0, "."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 1004
    invoke-static {p0, p1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 1006
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1010
    :cond_10
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1011
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1017
    :cond_11
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 1019
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1023
    :cond_12
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1024
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .prologue
    const/16 v3, 0x40

    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 637
    invoke-virtual {p0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 639
    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    .line 641
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 659
    :cond_0
    :goto_0
    return v0

    .line 647
    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2e

    if-eq v3, v4, :cond_3

    .line 649
    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    .line 659
    goto :goto_0

    .line 655
    :cond_3
    invoke-static {v2, p1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0
.end method

.method private static a(Ljava/util/Collection;Ljava/util/Collection;)Z
    .locals 7

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 1770
    if-ne p0, p1, :cond_0

    move v0, v3

    .line 1803
    :goto_0
    return v0

    .line 1774
    :cond_0
    if-eqz p0, :cond_1

    if-nez p1, :cond_2

    :cond_1
    move v0, v4

    .line 1776
    goto :goto_0

    .line 1778
    :cond_2
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    if-eq v0, v1, :cond_3

    move v0, v4

    .line 1780
    goto :goto_0

    .line 1782
    :cond_3
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 1784
    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1786
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 1787
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 1789
    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1791
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 1792
    if-ne v1, v2, :cond_6

    move v0, v3

    :goto_1
    if-eqz v0, :cond_5

    move v0, v3

    .line 1798
    :goto_2
    if-nez v0, :cond_4

    move v0, v4

    .line 1800
    goto :goto_0

    .line 1792
    :cond_6
    if-eqz v1, :cond_7

    if-nez v2, :cond_8

    :cond_7
    move v0, v4

    goto :goto_1

    :cond_8
    instance-of v0, v1, [B

    if-eqz v0, :cond_9

    instance-of v0, v2, [B

    if-eqz v0, :cond_9

    move-object v0, v1

    check-cast v0, [B

    check-cast v2, [B

    invoke-static {v0, v2}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v0

    goto :goto_1

    :cond_9
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1

    :cond_a
    move v0, v3

    .line 1803
    goto :goto_0

    :cond_b
    move v0, v4

    goto :goto_2
.end method

.method private static a(Lorg/spongycastle/asn1/ASN1Sequence;Lorg/spongycastle/asn1/ASN1Sequence;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 50
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v1

    if-gtz v1, :cond_1

    .line 68
    :cond_0
    :goto_0
    return v0

    .line 55
    :cond_1
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v1

    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    if-gt v1, v2, :cond_0

    .line 60
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_1
    if-ltz v1, :cond_2

    .line 62
    invoke-virtual {p1, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-virtual {p0, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 60
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    .line 68
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private static a([B[B)Z
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 611
    array-length v1, p0

    .line 613
    array-length v2, p1

    div-int/lit8 v2, v2, 0x2

    if-eq v1, v2, :cond_0

    .line 632
    :goto_0
    return v0

    .line 618
    :cond_0
    new-array v2, v1, [B

    .line 619
    invoke-static {p1, v1, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 621
    new-array v3, v1, [B

    .line 623
    new-array v4, v1, [B

    .line 626
    :goto_1
    if-ge v0, v1, :cond_1

    .line 628
    aget-byte v5, p1, v0

    aget-byte v6, v2, v0

    and-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v3, v0

    .line 629
    aget-byte v5, p0, v0

    aget-byte v6, v2, v0

    and-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v4, v0

    .line 626
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 632
    :cond_1
    invoke-static {v3, v4}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v0

    goto :goto_0
.end method

.method private static a([B[B[B[B)[[B
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 460
    array-length v2, p0

    .line 461
    new-array v3, v2, [B

    .line 462
    new-array v4, v2, [B

    .line 464
    new-array v5, v2, [B

    .line 465
    new-array v6, v2, [B

    move v0, v1

    .line 467
    :goto_0
    if-ge v0, v2, :cond_0

    .line 469
    aget-byte v7, p0, v0

    aget-byte v8, p1, v0

    and-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, v3, v0

    .line 470
    aget-byte v7, p0, v0

    aget-byte v8, p1, v0

    and-int/2addr v7, v8

    aget-byte v8, p1, v0

    xor-int/lit8 v8, v8, -0x1

    or-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, v4, v0

    .line 472
    aget-byte v7, p2, v0

    aget-byte v8, p3, v0

    and-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, v5, v0

    .line 473
    aget-byte v7, p2, v0

    aget-byte v8, p3, v0

    and-int/2addr v7, v8

    aget-byte v8, p3, v0

    xor-int/lit8 v8, v8, -0x1

    or-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, v6, v0

    .line 467
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 476
    :cond_0
    const/4 v0, 0x4

    new-array v0, v0, [[B

    aput-object v3, v0, v1

    const/4 v1, 0x1

    aput-object v4, v0, v1

    const/4 v1, 0x2

    aput-object v5, v0, v1

    const/4 v1, 0x3

    aput-object v6, v0, v1

    return-object v0
.end method

.method private static b(Ljava/util/Set;Ljava/lang/String;)Ljava/util/Set;
    .locals 3

    .prologue
    .line 1258
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1260
    if-nez p1, :cond_0

    .line 1280
    :goto_0
    return-object p0

    .line 1264
    :cond_0
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1270
    :cond_1
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1272
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 1273
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1275
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1277
    invoke-static {v0, p1, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    goto :goto_1

    :cond_2
    move-object p0, v1

    .line 1280
    goto :goto_0
.end method

.method private static b(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .locals 9

    .prologue
    const/4 v8, -0x1

    const/16 v7, 0x40

    .line 210
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 211
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 213
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/x509/GeneralSubtree;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/GeneralSubtree;->c()Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c(Lorg/spongycastle/asn1/x509/GeneralName;)Ljava/lang/String;

    move-result-object v3

    .line 216
    if-nez p0, :cond_1

    .line 218
    if-eqz v3, :cond_0

    .line 220
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 225
    :cond_1
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 226
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 230
    invoke-virtual {v3, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-eq v5, v8, :cond_5

    invoke-virtual {v3, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-eq v6, v8, :cond_3

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const-string v6, "."

    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v5, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    const-string v5, "."

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {v0, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-eq v5, v8, :cond_6

    invoke-virtual {v3, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    const-string v5, "."

    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-static {v3, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_7

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    :cond_7
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_8
    invoke-static {v0, v3}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_9
    invoke-static {v0, v3}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_a
    invoke-virtual {v0, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-eq v5, v8, :cond_b

    invoke-virtual {v0, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_b
    const-string v5, "."

    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-static {v3, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_c
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 234
    :cond_d
    return-object v1
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .prologue
    const/4 v3, 0x1

    const/4 v1, -0x1

    const/4 v2, 0x0

    .line 664
    .line 665
    const-string v0, "."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 667
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 669
    :cond_0
    invoke-static {p1}, Lorg/spongycastle/util/Strings;->e(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 670
    invoke-static {p0}, Lorg/spongycastle/util/Strings;->e(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 672
    array-length v0, v5

    array-length v6, v4

    if-gt v0, v6, :cond_1

    move v0, v2

    .line 691
    :goto_0
    return v0

    .line 676
    :cond_1
    array-length v0, v5

    array-length v6, v4

    sub-int v6, v0, v6

    move v0, v1

    .line 677
    :goto_1
    array-length v7, v4

    if-ge v0, v7, :cond_4

    .line 679
    if-ne v0, v1, :cond_2

    .line 681
    add-int v7, v0, v6

    aget-object v7, v5, v7

    const-string v8, ""

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    move v0, v2

    .line 683
    goto :goto_0

    .line 686
    :cond_2
    aget-object v7, v4, v0

    add-int v8, v0, v6

    aget-object v8, v5, v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_3

    move v0, v2

    .line 688
    goto :goto_0

    .line 677
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    move v0, v3

    .line 691
    goto :goto_0
.end method

.method private static b([B[B)[B
    .locals 4

    .prologue
    const v3, 0xffff

    .line 1643
    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_1

    .line 1645
    aget-byte v1, p0, v0

    and-int/2addr v1, v3

    aget-byte v2, p1, v0

    and-int/2addr v2, v3

    if-le v1, v2, :cond_0

    .line 1650
    :goto_1
    return-object p0

    .line 1643
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move-object p0, p1

    .line 1650
    goto :goto_1
.end method

.method private static c(Lorg/spongycastle/asn1/x509/GeneralName;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1576
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/DERIA5String;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/DERIA5String;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERIA5String;->o_()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .locals 14

    .prologue
    const/4 v13, 0x3

    const/4 v12, 0x2

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 276
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 277
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 279
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/x509/GeneralSubtree;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/GeneralSubtree;->c()Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v5

    .line 281
    if-nez p0, :cond_1

    .line 283
    if-eqz v5, :cond_0

    .line 285
    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 290
    :cond_1
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 291
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 293
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 294
    array-length v7, v0

    array-length v8, v5

    if-eq v7, v8, :cond_2

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    :goto_2
    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_2
    array-length v7, v0

    div-int/lit8 v7, v7, 0x2

    new-array v8, v7, [B

    new-array v9, v7, [B

    invoke-static {v0, v1, v8, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0, v7, v9, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v0, v7, [B

    new-array v10, v7, [B

    invoke-static {v5, v1, v0, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v5, v7, v10, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v7, 0x4

    new-array v7, v7, [[B

    aput-object v8, v7, v1

    aput-object v9, v7, v2

    aput-object v0, v7, v12

    aput-object v10, v7, v13

    aget-object v0, v7, v1

    aget-object v8, v7, v2

    aget-object v9, v7, v12

    aget-object v7, v7, v13

    invoke-static {v0, v8, v9, v7}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a([B[B[B[B)[[B

    move-result-object v9

    aget-object v0, v9, v2

    aget-object v10, v9, v13

    invoke-static {v0, v10}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c([B[B)[B

    move-result-object v0

    aget-object v10, v9, v1

    aget-object v11, v9, v12

    invoke-static {v10, v11}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b([B[B)[B

    move-result-object v10

    invoke-static {v10, v0}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v11

    if-eqz v11, :cond_3

    move v0, v1

    :goto_3
    if-ne v0, v2, :cond_5

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_2

    :cond_3
    invoke-static {v10, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b([B[B)[B

    move-result-object v0

    invoke-static {v0, v10}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v2

    goto :goto_3

    :cond_4
    const/4 v0, -0x1

    goto :goto_3

    :cond_5
    aget-object v0, v9, v1

    aget-object v9, v9, v12

    invoke-static {v0, v9}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->d([B[B)[B

    move-result-object v0

    invoke-static {v8, v7}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->d([B[B)[B

    move-result-object v7

    array-length v8, v0

    mul-int/lit8 v9, v8, 0x2

    new-array v9, v9, [B

    invoke-static {v0, v1, v9, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v7, v1, v9, v8, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v9}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    goto :goto_2

    .line 298
    :cond_6
    return-object v3
.end method

.method private static c(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .prologue
    const/16 v6, 0x2f

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v5, -0x1

    const/16 v4, 0x3a

    .line 1406
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "//"

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v5, :cond_0

    const-string v3, "//"

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, 0x2

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    if-eq v3, v5, :cond_1

    invoke-virtual {v0, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x40

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-eq v3, v5, :cond_2

    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 1408
    :cond_2
    const-string v3, "."

    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 1410
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    .line 1422
    :goto_0
    return v0

    .line 1417
    :cond_3
    invoke-static {v0, p1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    .line 1419
    goto :goto_0

    :cond_4
    move v0, v2

    .line 1422
    goto :goto_0
.end method

.method private static c([B[B)[B
    .locals 4

    .prologue
    const v3, 0xffff

    .line 1662
    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_1

    .line 1664
    aget-byte v1, p0, v0

    and-int/2addr v1, v3

    aget-byte v2, p1, v0

    and-int/2addr v2, v3

    if-ge v1, v2, :cond_0

    .line 1669
    :goto_1
    return-object p0

    .line 1662
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move-object p0, p1

    .line 1669
    goto :goto_1
.end method

.method private static d(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .locals 6

    .prologue
    .line 1032
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1033
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1035
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/x509/GeneralSubtree;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/GeneralSubtree;->c()Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c(Lorg/spongycastle/asn1/x509/GeneralName;)Ljava/lang/String;

    move-result-object v3

    .line 1037
    if-nez p0, :cond_1

    .line 1039
    if-eqz v3, :cond_0

    .line 1041
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1046
    :cond_1
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 1047
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1049
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1051
    invoke-static {v0, v3}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 1053
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1055
    :cond_3
    invoke-static {v3, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1057
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1063
    :cond_4
    return-object v1
.end method

.method private static d([B[B)[B
    .locals 4

    .prologue
    .line 1704
    array-length v0, p0

    new-array v1, v0, [B

    .line 1705
    const/4 v0, 0x0

    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_0

    .line 1707
    aget-byte v2, p0, v0

    aget-byte v3, p1, v0

    or-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    .line 1705
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1709
    :cond_0
    return-object v1
.end method

.method private static e(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .locals 9

    .prologue
    const/4 v8, -0x1

    const/16 v7, 0x40

    .line 1231
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1232
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1234
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/x509/GeneralSubtree;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/GeneralSubtree;->c()Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c(Lorg/spongycastle/asn1/x509/GeneralName;)Ljava/lang/String;

    move-result-object v3

    .line 1236
    if-nez p0, :cond_1

    .line 1238
    if-eqz v3, :cond_0

    .line 1240
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1245
    :cond_1
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 1246
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1248
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1249
    invoke-virtual {v0, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-eq v5, v8, :cond_5

    invoke-virtual {v0, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-eq v6, v8, :cond_3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const-string v6, "."

    invoke-virtual {v3, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v5, v3}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    const-string v5, "."

    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {v3, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-eq v5, v8, :cond_6

    invoke-virtual {v0, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    const-string v5, "."

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-static {v0, v3}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_7

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    :cond_7
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_8
    invoke-static {v3, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_9
    invoke-static {v3, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_a
    invoke-virtual {v3, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-eq v5, v8, :cond_b

    invoke-virtual {v3, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_b
    const-string v5, "."

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-static {v0, v3}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_c
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 1253
    :cond_d
    return-object v1
.end method


# virtual methods
.method public final a(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 2

    .prologue
    .line 74
    iget-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->f:Ljava/util/Set;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-static {p1, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Lorg/spongycastle/asn1/ASN1Sequence;Lorg/spongycastle/asn1/ASN1Sequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 75
    :cond_2
    return-void

    .line 74
    :cond_3
    new-instance v0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;

    const-string v1, "Subject distinguished name is not from a permitted subtree"

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a(Lorg/spongycastle/asn1/x509/GeneralName;)V
    .locals 5

    .prologue
    .line 1461
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/GeneralName;->c()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 1484
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 1464
    :pswitch_1
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->h:Ljava/util/Set;

    invoke-static {p1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c(Lorg/spongycastle/asn1/x509/GeneralName;)Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    if-eqz v0, :cond_0

    :cond_2
    new-instance v0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;

    const-string v1, "Subject email address is not from a permitted subtree."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1468
    :pswitch_2
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->g:Ljava/util/Set;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/DERIA5String;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/DERIA5String;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERIA5String;->o_()Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_5

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    if-eqz v0, :cond_0

    :cond_5
    new-instance v0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;

    const-string v1, "DNS is not from a permitted subtree."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1472
    :pswitch_3
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Lorg/spongycastle/asn1/ASN1Sequence;)V

    goto/16 :goto_0

    .line 1476
    :pswitch_4
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->i:Ljava/util/Set;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/DERIA5String;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/DERIA5String;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERIA5String;->o_()Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_7

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    if-eqz v0, :cond_0

    :cond_7
    new-instance v0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;

    const-string v1, "URI is not from a permitted subtree."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1480
    :pswitch_5
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v1

    .line 1482
    iget-object v2, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->j:Ljava/util/Set;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-static {v1, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a([B[B)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    :cond_8
    array-length v0, v1

    if-nez v0, :cond_9

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v0

    if-eqz v0, :cond_0

    :cond_9
    new-instance v0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;

    const-string v1, "IP is not from a permitted subtree."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1461
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public final a(Lorg/spongycastle/asn1/x509/GeneralSubtree;)V
    .locals 8

    .prologue
    const/4 v7, -0x1

    const/16 v6, 0x40

    .line 1607
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/GeneralSubtree;->c()Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v1

    .line 1609
    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/GeneralName;->c()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 1632
    :goto_0
    :pswitch_0
    return-void

    .line 1612
    :pswitch_1
    iget-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c:Ljava/util/Set;

    invoke-static {v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c(Lorg/spongycastle/asn1/x509/GeneralName;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez v2, :cond_0

    :goto_1
    iput-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c:Ljava/util/Set;

    goto :goto_0

    :cond_0
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-eq v4, v7, :cond_7

    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-eq v5, v7, :cond_3

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    const-string v5, "."

    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-static {v4, v2}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    const-string v4, "."

    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-virtual {v2, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-eq v4, v7, :cond_9

    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_9
    const-string v4, "."

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-static {v0, v2}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_a

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_b

    :cond_a
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_b
    invoke-static {v2, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_c
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_d
    invoke-static {v2, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_e
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_f
    invoke-virtual {v2, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-eq v4, v7, :cond_11

    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_10
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_11
    const-string v4, "."

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-static {v0, v2}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_12
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_13
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_14
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_15
    move-object v0, v1

    goto/16 :goto_1

    .line 1616
    :pswitch_2
    iget-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b:Ljava/util/Set;

    invoke-static {v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c(Lorg/spongycastle/asn1/x509/GeneralName;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Set;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b:Ljava/util/Set;

    goto/16 :goto_0

    .line 1620
    :pswitch_3
    iget-object v2, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a:Ljava/util/Set;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-static {v2, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Set;Lorg/spongycastle/asn1/ASN1Sequence;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a:Ljava/util/Set;

    goto/16 :goto_0

    .line 1624
    :pswitch_4
    iget-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->d:Ljava/util/Set;

    invoke-static {v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c(Lorg/spongycastle/asn1/x509/GeneralName;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/util/Set;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->d:Ljava/util/Set;

    goto/16 :goto_0

    .line 1628
    :pswitch_5
    iget-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->e:Ljava/util/Set;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1OctetString;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v1

    invoke-static {v0, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Set;[B)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->e:Ljava/util/Set;

    goto/16 :goto_0

    .line 1609
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public final b(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 2

    .prologue
    .line 80
    iget-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-static {p1, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Lorg/spongycastle/asn1/ASN1Sequence;Lorg/spongycastle/asn1/ASN1Sequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;

    const-string v1, "Subject distinguished name is from an excluded subtree"

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 81
    :cond_1
    return-void
.end method

.method public final b(Lorg/spongycastle/asn1/x509/GeneralName;)V
    .locals 4

    .prologue
    .line 1497
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/GeneralName;->c()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 1519
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 1500
    :pswitch_1
    iget-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c:Ljava/util/Set;

    invoke-static {p1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c(Lorg/spongycastle/asn1/x509/GeneralName;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;

    const-string v1, "Email address is from an excluded subtree."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1503
    :pswitch_2
    iget-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b:Ljava/util/Set;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/DERIA5String;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/DERIA5String;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERIA5String;->o_()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_3
    new-instance v0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;

    const-string v1, "DNS is from an excluded subtree."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1507
    :pswitch_3
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Lorg/spongycastle/asn1/ASN1Sequence;)V

    goto :goto_0

    .line 1511
    :pswitch_4
    iget-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->d:Ljava/util/Set;

    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/DERIA5String;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/DERIA5String;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERIA5String;->o_()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;

    const-string v1, "URI is from an excluded subtree."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1515
    :pswitch_5
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/GeneralName;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v1

    .line 1517
    iget-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-static {v1, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a([B[B)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;

    const-string v1, "IP is from an excluded subtree."

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidatorException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1497
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public final c(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 5

    .prologue
    .line 1530
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1533
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1535
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/GeneralSubtree;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/GeneralSubtree;

    move-result-object v3

    .line 1536
    new-instance v0, Ljava/lang/Integer;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x509/GeneralSubtree;->c()Lorg/spongycastle/asn1/x509/GeneralName;

    move-result-object v4

    invoke-virtual {v4}, Lorg/spongycastle/asn1/x509/GeneralName;->c()I

    move-result v4

    invoke-direct {v0, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 1537
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    .line 1539
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1541
    :cond_0
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1544
    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1546
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1549
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_1

    .line 1552
    :pswitch_1
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->h:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-static {v1, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->h:Ljava/util/Set;

    goto :goto_1

    .line 1556
    :pswitch_2
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->g:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-static {v1, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->d(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->g:Ljava/util/Set;

    goto :goto_1

    .line 1560
    :pswitch_3
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->f:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-static {v1, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->f:Ljava/util/Set;

    goto :goto_1

    .line 1564
    :pswitch_4
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->i:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-static {v1, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->e(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->i:Ljava/util/Set;

    goto :goto_1

    .line 1568
    :pswitch_5
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->j:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-static {v1, v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->j:Ljava/util/Set;

    goto :goto_1

    .line 1572
    :cond_2
    return-void

    .line 1549
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1751
    instance-of v1, p1, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;

    if-nez v1, :cond_1

    .line 1756
    :cond_0
    :goto_0
    return v0

    .line 1755
    :cond_1
    check-cast p1, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;

    .line 1756
    iget-object v1, p1, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a:Ljava/util/Set;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a:Ljava/util/Set;

    invoke-static {v1, v2}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b:Ljava/util/Set;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b:Ljava/util/Set;

    invoke-static {v1, v2}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c:Ljava/util/Set;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c:Ljava/util/Set;

    invoke-static {v1, v2}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->e:Ljava/util/Set;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->e:Ljava/util/Set;

    invoke-static {v1, v2}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->d:Ljava/util/Set;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->d:Ljava/util/Set;

    invoke-static {v1, v2}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->f:Ljava/util/Set;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->f:Ljava/util/Set;

    invoke-static {v1, v2}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->g:Ljava/util/Set;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->g:Ljava/util/Set;

    invoke-static {v1, v2}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->h:Ljava/util/Set;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->h:Ljava/util/Set;

    invoke-static {v1, v2}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->j:Ljava/util/Set;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->j:Ljava/util/Set;

    invoke-static {v1, v2}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->i:Ljava/util/Set;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->i:Ljava/util/Set;

    invoke-static {v1, v2}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 1714
    iget-object v0, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a:Ljava/util/Set;

    invoke-static {v0}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;)I

    move-result v0

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b:Ljava/util/Set;

    invoke-static {v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c:Ljava/util/Set;

    invoke-static {v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->e:Ljava/util/Set;

    invoke-static {v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->d:Ljava/util/Set;

    invoke-static {v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->f:Ljava/util/Set;

    invoke-static {v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->g:Ljava/util/Set;

    invoke-static {v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->h:Ljava/util/Set;

    invoke-static {v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->j:Ljava/util/Set;

    invoke-static {v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->i:Ljava/util/Set;

    invoke-static {v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Collection;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1867
    const-string v0, ""

    .line 1868
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "permitted:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1869
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->f:Ljava/util/Set;

    if-eqz v1, :cond_0

    .line 1871
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "DN:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1872
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->f:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1874
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->g:Ljava/util/Set;

    if-eqz v1, :cond_1

    .line 1876
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "DNS:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1877
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->g:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1879
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->h:Ljava/util/Set;

    if-eqz v1, :cond_2

    .line 1881
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Email:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1882
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->h:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1884
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->i:Ljava/util/Set;

    if-eqz v1, :cond_3

    .line 1886
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "URI:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1887
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->i:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1889
    :cond_3
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->j:Ljava/util/Set;

    if-eqz v1, :cond_4

    .line 1891
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "IP:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1892
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->j:Ljava/util/Set;

    invoke-static {v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Set;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1894
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "excluded:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1895
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    .line 1897
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "DN:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1898
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1900
    :cond_5
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    .line 1902
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "DNS:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1903
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->b:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1905
    :cond_6
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    .line 1907
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Email:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1908
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->c:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1910
    :cond_7
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->d:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_8

    .line 1912
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "URI:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1913
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->d:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1915
    :cond_8
    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->e:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    .line 1917
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "IP:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1918
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->e:Ljava/util/Set;

    invoke-static {v1}, Lorg/spongycastle/jce/provider/PKIXNameConstraintValidator;->a(Ljava/util/Set;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1920
    :cond_9
    return-object v0
.end method

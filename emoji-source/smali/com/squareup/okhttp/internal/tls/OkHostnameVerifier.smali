.class public final Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;
.super Ljava/lang/Object;
.source "OkHostnameVerifier.java"

# interfaces
.implements Ljavax/net/ssl/HostnameVerifier;


# static fields
.field private static final ALT_DNS_NAME:I = 0x2

.field private static final ALT_IPA_NAME:I = 0x7

.field public static final INSTANCE:Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;

.field private static final VERIFY_AS_IP_ADDRESS:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    new-instance v0, Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;

    invoke-direct {v0}, Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;-><init>()V

    sput-object v0, Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;->INSTANCE:Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;

    .line 52
    const-string v0, "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;->VERIFY_AS_IP_ADDRESS:Ljava/util/regex/Pattern;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    return-void
.end method

.method private getSubjectAltNames(Ljava/security/cert/X509Certificate;I)Ljava/util/List;
    .locals 11
    .param p1, "certificate"    # Ljava/security/cert/X509Certificate;
    .param p2, "type"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/security/cert/X509Certificate;",
            "I)",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 118
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 120
    .local v5, "result":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :try_start_0
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectAlternativeNames()Ljava/util/Collection;

    move-result-object v7

    .line 121
    .local v7, "subjectAltNames":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    if-nez v7, :cond_1

    .line 122
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    .line 142
    .end local v5    # "result":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v7    # "subjectAltNames":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    :cond_0
    :goto_0
    return-object v5

    .line 124
    .restart local v5    # "result":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .restart local v7    # "subjectAltNames":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    :cond_1
    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_2
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 125
    .local v6, "subjectAltName":Ljava/lang/Object;
    move-object v0, v6

    check-cast v0, Ljava/util/List;

    move-object v4, v0

    .line 126
    .local v4, "entry":Ljava/util/List;, "Ljava/util/List<*>;"
    if-eqz v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x2

    if-lt v9, v10, :cond_2

    .line 129
    const/4 v9, 0x0

    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 130
    .local v2, "altNameType":Ljava/lang/Integer;
    if-eqz v2, :cond_2

    .line 133
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-ne v9, p2, :cond_2

    .line 134
    const/4 v9, 0x1

    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 135
    .local v1, "altName":Ljava/lang/String;
    if-eqz v1, :cond_2

    .line 136
    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 141
    .end local v1    # "altName":Ljava/lang/String;
    .end local v2    # "altNameType":Ljava/lang/Integer;
    .end local v4    # "entry":Ljava/util/List;, "Ljava/util/List<*>;"
    .end local v6    # "subjectAltName":Ljava/lang/Object;
    .end local v7    # "subjectAltNames":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    :catch_0
    move-exception v3

    .line 142
    .local v3, "e":Ljava/security/cert/CertificateParsingException;
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    goto :goto_0
.end method

.method static verifyAsIpAddress(Ljava/lang/String;)Z
    .locals 1
    .param p0, "host"    # Ljava/lang/String;

    .prologue
    .line 77
    sget-object v0, Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;->VERIFY_AS_IP_ADDRESS:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    return v0
.end method

.method private verifyHostName(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z
    .locals 6
    .param p1, "hostName"    # Ljava/lang/String;
    .param p2, "certificate"    # Ljava/security/cert/X509Certificate;

    .prologue
    .line 96
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 97
    const/4 v2, 0x0

    .line 98
    .local v2, "hasDns":Z
    const/4 v4, 0x2

    invoke-direct {p0, p2, v4}, Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;->getSubjectAltNames(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 99
    .local v0, "altName":Ljava/lang/String;
    const/4 v2, 0x1

    .line 100
    invoke-virtual {p0, p1, v0}, Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;->verifyHostName(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 101
    const/4 v4, 0x1

    .line 114
    .end local v0    # "altName":Ljava/lang/String;
    :goto_0
    return v4

    .line 105
    :cond_1
    if-nez v2, :cond_2

    .line 106
    invoke-virtual {p2}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v3

    .line 108
    .local v3, "principal":Ljavax/security/auth/x500/X500Principal;
    new-instance v4, Lcom/squareup/okhttp/internal/tls/DistinguishedNameParser;

    invoke-direct {v4, v3}, Lcom/squareup/okhttp/internal/tls/DistinguishedNameParser;-><init>(Ljavax/security/auth/x500/X500Principal;)V

    const-string v5, "cn"

    invoke-virtual {v4, v5}, Lcom/squareup/okhttp/internal/tls/DistinguishedNameParser;->findMostSpecific(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 109
    .local v1, "cn":Ljava/lang/String;
    if-eqz v1, :cond_2

    .line 110
    invoke-virtual {p0, p1, v1}, Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;->verifyHostName(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    goto :goto_0

    .line 114
    .end local v1    # "cn":Ljava/lang/String;
    .end local v3    # "principal":Ljavax/security/auth/x500/X500Principal;
    :cond_2
    const/4 v4, 0x0

    goto :goto_0
.end method

.method private verifyIpAddress(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z
    .locals 3
    .param p1, "ipAddress"    # Ljava/lang/String;
    .param p2, "certificate"    # Ljava/security/cert/X509Certificate;

    .prologue
    .line 84
    const/4 v1, 0x7

    invoke-direct {p0, p2, v1}, Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;->getSubjectAltNames(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 85
    .local v0, "altName":Ljava/lang/String;
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 86
    const/4 v1, 0x1

    .line 89
    .end local v0    # "altName":Ljava/lang/String;
    :goto_0
    return v1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method


# virtual methods
.method public verify(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z
    .locals 1
    .param p1, "host"    # Ljava/lang/String;
    .param p2, "certificate"    # Ljava/security/cert/X509Certificate;

    .prologue
    .line 71
    invoke-static {p1}, Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;->verifyAsIpAddress(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    invoke-direct {p0, p1, p2}, Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;->verifyIpAddress(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result v0

    .line 73
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;->verifyHostName(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result v0

    goto :goto_0
.end method

.method public verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
    .locals 4
    .param p1, "host"    # Ljava/lang/String;
    .param p2, "session"    # Ljavax/net/ssl/SSLSession;

    .prologue
    const/4 v3, 0x0

    .line 63
    :try_start_0
    invoke-interface {p2}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    move-result-object v0

    .line 64
    .local v0, "certificates":[Ljava/security/cert/Certificate;
    const/4 v2, 0x0

    aget-object v2, v0, v2

    check-cast v2, Ljava/security/cert/X509Certificate;

    invoke-virtual {p0, p1, v2}, Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;->verify(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z
    :try_end_0
    .catch Ljavax/net/ssl/SSLException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 66
    .end local v0    # "certificates":[Ljava/security/cert/Certificate;
    :goto_0
    return v2

    .line 65
    :catch_0
    move-exception v1

    .local v1, "e":Ljavax/net/ssl/SSLException;
    move v2, v3

    .line 66
    goto :goto_0
.end method

.method public verifyHostName(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9
    .param p1, "hostName"    # Ljava/lang/String;
    .param p2, "cn"    # Ljava/lang/String;

    .prologue
    const/16 v8, 0x2e

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 155
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_2

    :cond_0
    move v4, v5

    .line 192
    :cond_1
    :goto_0
    return v4

    .line 159
    :cond_2
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p2, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    .line 161
    const-string v6, "*"

    invoke-virtual {p2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 162
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    .line 165
    :cond_3
    const-string v6, "*."

    invoke-virtual {p2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/4 v6, 0x2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, -0x2

    invoke-virtual {p1, v5, p2, v6, v7}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v6

    if-nez v6, :cond_1

    .line 169
    :cond_4
    const/16 v6, 0x2a

    invoke-virtual {p2, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 170
    .local v0, "asterisk":I
    invoke-virtual {p2, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    .line 171
    .local v1, "dot":I
    if-le v0, v1, :cond_5

    move v4, v5

    .line 172
    goto :goto_0

    .line 175
    :cond_5
    invoke-virtual {p1, v5, p2, v5, v0}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v6

    if-nez v6, :cond_6

    move v4, v5

    .line 176
    goto :goto_0

    .line 179
    :cond_6
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v7, v0, 0x1

    sub-int v2, v6, v7

    .line 180
    .local v2, "suffixLength":I
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    sub-int v3, v6, v2

    .line 181
    .local v3, "suffixStart":I
    invoke-virtual {p1, v8, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v6

    if-ge v6, v3, :cond_7

    .line 183
    const-string v6, ".clients.google.com"

    invoke-virtual {p1, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_7

    move v4, v5

    .line 184
    goto :goto_0

    .line 188
    :cond_7
    add-int/lit8 v6, v0, 0x1

    invoke-virtual {p1, v3, p2, v6, v2}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v6

    if-nez v6, :cond_1

    move v4, v5

    .line 189
    goto :goto_0
.end method
